/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */  
                                    

package org.modelio.gproject.module.catalog;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.data.module.JaxbModelPersistence;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Dependencies.Jxbv2Optional;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Dependencies.Jxbv2Required;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Resources.Jxbv2Styles.Jxbv2Style;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Resources;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2MultiPathes.Jxbv2PathEntry;
import org.modelio.gproject.module.ModuleId;
import org.modelio.gproject.plugin.CoreProject;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;
import org.modelio.vbasic.version.Version;

/**
 * Service class to build a {@link FileCatalogModuleHandle} from an extracted module directory.
 */
@objid ("de703be5-0b74-4f31-bc34-8f9069119d08")
class FileCatalogModuleHandleBuilder {
    /**
     * Extract the dynamic part of the module model in another file ?
     * @param moduleDynamicModelPath path of the file to write
     * @param loadedModule the JAXB module model
     * @param monitor a progress monitor
     * @throws java.io.IOException in case of failure
     */
    @objid ("2c95c273-f37d-11e1-a3c7-002564c97630")
    private static void extractDynamicModel(Path moduleDynamicModelPath, Jxbv2Module loadedModule, IModelioProgress monitor) throws IOException {
        Jxbv2Module dynamicModel = new Jxbv2Module();
        
        // Preserved values
        dynamicModel.setAuthor(loadedModule.getAuthor());
        dynamicModel.setBinaryversion(loadedModule.getBinaryversion());
        dynamicModel.setClassPath(loadedModule.getClassPath());
        dynamicModel.setClazz(loadedModule.getClazz());
        dynamicModel.setDependencies(loadedModule.getDependencies());
        
        dynamicModel.setResources(new Jxbv2Resources());
        if (loadedModule.getResources() != null) {
            dynamicModel.getResources().setDocFiles(loadedModule.getResources().getDocFiles());
        }
        
        dynamicModel.setGui(loadedModule.getGui());
        dynamicModel.setId(loadedModule.getId());
        dynamicModel.setImage(loadedModule.getImage());
        /* dynamicModel.setParameters(loadedModule.getParameters()); */
        /* dynamicModel.setPropertyTypes(loadedModule.getPropertyTypes()); */
        dynamicModel.setSchemaLevel(loadedModule.getSchemaLevel());
        dynamicModel.setUid(loadedModule.getUid());
        dynamicModel.setVersion(loadedModule.getVersion());
        /* dynamicModel.getProfile().addAll(loadedModule.getProfile()); */
        
        // Cleaned values
        dynamicModel.setParameters(null);
        dynamicModel.setProfiles(null);
        dynamicModel.setPropertyTypes(null);
        
        // Save simplified xml file
        JaxbModelPersistence.saveJaxbModel(dynamicModel, moduleDynamicModelPath);
        
        monitor.done();
    }

    @objid ("15695cc1-0c96-11e2-b501-002564c97630")
    private static void extractModuleInfos(Jxbv2Module loadedModule, Path infosPath) throws IOException {
        Jxbv2Module infosModel = new Jxbv2Module();
        
        // Preserved values
        infosModel.setAuthor(loadedModule.getAuthor());
        infosModel.setBinaryversion(loadedModule.getBinaryversion());
        infosModel.setClazz(loadedModule.getClazz());
        infosModel.setDependencies(loadedModule.getDependencies());
        infosModel.setClassPath(loadedModule.getClassPath());
        
        infosModel.setResources(new Jxbv2Resources());
        if (loadedModule.getResources() != null) {
            infosModel.getResources().setDocFiles(loadedModule.getResources().getDocFiles());
        }
        
        infosModel.setId(loadedModule.getId());
        infosModel.setImage(loadedModule.getImage());
        infosModel.setSchemaLevel(loadedModule.getSchemaLevel());
        infosModel.setUid(loadedModule.getUid());
        infosModel.setVersion(loadedModule.getVersion());
        
        // Keep the style files
        if (loadedModule.getResources() != null && loadedModule.getResources().getStyles() != null) {
            final Jxbv2Resources resources = new Jxbv2Resources();
            resources.setStyles(loadedModule.getResources().getStyles());
            infosModel.setResources(resources);
        } else {
            infosModel.setGui(null);
        }
        // Cleaned values
        infosModel.setParameters(null);
        infosModel.setPropertyTypes(null);
        infosModel.setProfiles(null);
        
        // Save simplified xml file
        JaxbModelPersistence.saveJaxbModel(infosModel, infosPath);
    }

    @objid ("2c95c265-f37d-11e1-a3c7-002564c97630")
    private static void extractStaticModel(Path moduleStaticModelPath, Jxbv2Module loadedModule, IModelioProgress monitor) throws IOException {
        try {
            new RamcBuilder(loadedModule).createRamc(moduleStaticModelPath, monitor);
        } catch (IOException e) {
            IOException e2 = new IOException(CoreProject.getMessage(
                    "ModuleCacheManager.FailedExtractStaticModel",
                    moduleStaticModelPath.getFileName(), 
                    FileUtils.getLocalizedMessage(e))); //$NON-NLS-1$
            e2.initCause(e);
            throw e2;
        }
    }

    @objid ("2c95c277-f37d-11e1-a3c7-002564c97630")
    private static FileCatalogModuleHandle loadModuleInfos(Path moduleCachePath, final Jxbv2Module loadedModule, IModelioProgress monitor) {
        String uid = loadedModule.getUid();
        String name = loadedModule.getId();
        String mainClassName = loadedModule.getClazz();
        String moduleVersionString = loadedModule.getVersion();
        
        Version moduleVersion;
        if (moduleVersionString != null) {
            moduleVersion = new Version(moduleVersionString);
        } else {
            // Set a default version...
            moduleVersion = new Version("0.00.00");
        }
        
        String binaryVersionString = loadedModule.getBinaryversion();
        Version binaryVersion;
        if (binaryVersionString != null) {
            binaryVersion = new Version(binaryVersionString);
        } else {
            // Set a default version...
            binaryVersion = new Version("0.00.00");
        }
        
        List<ModuleId> dependencies = new ArrayList<>();
        List<ModuleId> weakDependencies = new ArrayList<>();
        List<Path> jarPaths = new ArrayList<>();
        List<Path> docPaths = new ArrayList<>();
        Map<String, Path> stylePaths = new HashMap<>();
        
        for (Jxbv2Required dep : loadedModule.getDependencies().getRequired()) {
            dependencies.add(new ModuleId(dep.getName(), new Version(dep.getVersion())));
        }
        for (Jxbv2Optional dep : loadedModule.getDependencies().getOptional()) {
            weakDependencies.add(new ModuleId(dep.getName(), new Version(dep.getVersion())));
        }
        
        for (Jxbv2PathEntry pathEntry : loadedModule.getClassPath().getPathEntry()) {
            jarPaths.add(Paths.get(pathEntry.getPath()));
        }
        
        if (loadedModule.getResources() != null && loadedModule.getResources().getDocFiles() != null) {
            for (Jxbv2PathEntry pathEntry : loadedModule.getResources().getDocFiles().getPathEntry()) {
                docPaths.add(Paths.get(pathEntry.getPath()));
            }
        }
        
        if (loadedModule.getResources() != null && loadedModule.getResources().getStyles() != null) {
            for (Jxbv2Style pathEntry : loadedModule.getResources().getStyles().getStyle()) {
                stylePaths.put(pathEntry.getId(), Paths.get(pathEntry.getPath()));
            }
        }
        
        monitor.done();
        return new FileCatalogModuleHandle(moduleCachePath, name, moduleVersion, uid, mainClassName, binaryVersion, dependencies,
                weakDependencies, docPaths, jarPaths, stylePaths);
    }

    /**
     * Build a module handle
     * @param moduleCachePath the module extracted data directory.
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @return the module handle
     * @throws java.io.IOException in case of failure.
     */
    @objid ("2c95c260-f37d-11e1-a3c7-002564c97630")
    public static FileCatalogModuleHandle readModule(final Path moduleCachePath, IModelioProgress monitor) throws IOException {
        SubProgress m = SubProgress.convert(monitor, 80);
        try {
            Path moduleXmlPath = moduleCachePath.resolve("module.xml");
            m.worked(20);
            if (Files.exists(moduleXmlPath)) {
                Jxbv2Module loadedModule = null;
                // Ensure the static model ramc file exists
                Path staticModelPath = moduleCachePath.resolve("staticModel.ramc");
                if (Files.notExists(staticModelPath)) {
                    // Extract static model from module.xml and create a ramc
                    // from it.
                    loadedModule = JaxbModelPersistence.loadJaxbModel(moduleXmlPath);
                    extractStaticModel(staticModelPath, loadedModule, m.newChild(20));
                }
        
                // Ensure the dynamic model xml file exists
                Path dynamicModelPath = moduleCachePath.resolve("dynamicModel.xml");
                if (Files.notExists(dynamicModelPath)) {
                    // Extract dynamic model from module.xml and create an xml
                    // file from it.
                    if (loadedModule == null) {
                        loadedModule = JaxbModelPersistence.loadJaxbModel(moduleXmlPath);
                    }
                    extractDynamicModel(dynamicModelPath, loadedModule, m.newChild(20));
                }
        
                // Ensure the module infos xml file exists
                Path infosPath = moduleCachePath.resolve("moduleInfos.xml");
                if (Files.notExists(infosPath)) {
                    // Create the file
                    if (loadedModule == null) {
                        loadedModule = JaxbModelPersistence.loadJaxbModel(moduleXmlPath);
                    }
        
                    // Create the module info file
                    extractModuleInfos(loadedModule, infosPath);
                    return loadModuleInfos(moduleCachePath, loadedModule, m.newChild(20));
                } else {
                    // Load the module info file
                    Jxbv2Module moduleFromInfos = JaxbModelPersistence.loadJaxbModel(infosPath);
                    return loadModuleInfos(moduleCachePath, moduleFromInfos, m.newChild(20));
                }
            }
        
            throw new IOException(CoreProject.getMessage("ModuleCacheManager.NoModuleFound", moduleCachePath.getFileName())); //$NON-NLS-1$
        } catch (IOException e) {
            IOException e2 = new IOException(CoreProject.getMessage(
                    "ModuleCacheManager.ErrorReadingModule",
                    moduleCachePath.getFileName(), FileUtils.getLocalizedMessage(e))); //$NON-NLS-1$
            e2.initCause(e);
            throw e2;
        }
    }

}
