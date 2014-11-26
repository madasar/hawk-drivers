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

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.data.module.JaxbModelPersistence;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Dependencies.Jxbv2Optional;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Dependencies.Jxbv2Required;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Dependencies;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2MultiPathes.Jxbv2PathEntry;
import org.modelio.gproject.module.IModuleHandle;
import org.modelio.gproject.module.ModuleId;
import org.modelio.vbasic.version.Version;

/**
 * Temporary handler implementation that uses directly a .jmdac archive.
 */
@objid ("f88164d9-f369-11e1-9173-001ec947ccaf")
class JmdacArchiveModuleHandle implements IModuleHandle, Closeable {
    @objid ("3e3ad90f-f370-11e1-9173-001ec947ccaf")
    private String uid = "";

    @objid ("3e3ad913-f370-11e1-9173-001ec947ccaf")
    private String name = "";

    @objid ("3e3d3b69-f370-11e1-9173-001ec947ccaf")
    private String mainClassName = "";

    @objid ("b37cdec9-f27f-11e1-8543-001ec947ccaf")
    private FileSystem fs;

    @objid ("b37cdeca-f27f-11e1-8543-001ec947ccaf")
    private Path moduleDir;

    @objid ("d378f9d9-f36d-11e1-9173-001ec947ccaf")
    private Version version = null;

    @objid ("d378f9da-f36d-11e1-9173-001ec947ccaf")
    private Version binaryVersion = null;

    @objid ("d378f9db-f36d-11e1-9173-001ec947ccaf")
    private final List<ModuleId> dependencies = new ArrayList<>();

    @objid ("d378f9df-f36d-11e1-9173-001ec947ccaf")
    private final List<ModuleId> weakDependencies = new ArrayList<>();

    @objid ("d378f9e6-f36d-11e1-9173-001ec947ccaf")
    private final List<Path> classpath = new ArrayList<>();

    @objid ("d378f9ea-f36d-11e1-9173-001ec947ccaf")
    private final List<Path> docPath = new ArrayList<>();

    @objid ("d9624b74-37da-11e2-8ba4-002564c97630")
    private Path archive;

    @objid ("f88164dd-f369-11e1-9173-001ec947ccaf")
    JmdacArchiveModuleHandle(Path archive) throws IOException {
        this.archive = archive;
        
        URI uri = archive.toUri();
        try {
            uri = new URI("jar:" + uri.getScheme(), uri.getRawSchemeSpecificPart(), uri.getRawFragment());
        
            this.fs = FileSystems.newFileSystem(uri, Collections.<String, Object> emptyMap());
            this.moduleDir = findModuleDir();
            Path moduleXmlFile = this.moduleDir.resolve("module.xml");
            if (Files.isRegularFile(moduleXmlFile)) {
                loadModule(moduleXmlFile);
            } else {
                throw new FileNotFoundException("module.xml not found in '" + this.moduleDir.toUri().toString() + "'");
            }
        } catch (URISyntaxException e) {
            throw new IOException(e.getLocalizedMessage(), e);
        }
    }

    @objid ("b37f411e-f27f-11e1-8543-001ec947ccaf")
    private Path findModuleDir() throws IOException {
        for (Path root : this.fs.getRootDirectories()) {
            try (DirectoryStream<Path> content = Files.newDirectoryStream(root)) {
                for (Path p : content) {
                    Path moduleFile = p.resolve("module.xml");
                    if (Files.isRegularFile(moduleFile))
                        return p;
                }
            }
        }
        throw new NoSuchFileException("/*/module.xml");
    }

    @objid ("f88164e0-f369-11e1-9173-001ec947ccaf")
    @Override
    public void close() throws IOException {
        this.fs.close();
    }

    @objid ("f88164e3-f369-11e1-9173-001ec947ccaf")
    @Override
    public Version getBinaryVersion() {
        return this.binaryVersion;
    }

    @objid ("f88164e8-f369-11e1-9173-001ec947ccaf")
    @Override
    public List<ModuleId> getDependencies() {
        return this.dependencies;
    }

    @objid ("f88164ef-f369-11e1-9173-001ec947ccaf")
    @Override
    public List<Path> getDocPaths() {
        return this.docPath;
    }

    @objid ("f88164f6-f369-11e1-9173-001ec947ccaf")
    @Override
    public Path getDynamicModelPath() {
        return this.moduleDir.resolve("module.xml");
    }

    @objid ("f88164fb-f369-11e1-9173-001ec947ccaf")
    @Override
    public List<Path> getJarPaths() {
        return this.classpath;
    }

    @objid ("f8816507-f369-11e1-9173-001ec947ccaf")
    @Override
    public String getMainClassName() {
        return this.mainClassName;
    }

    @objid ("f881650c-f369-11e1-9173-001ec947ccaf")
    @Override
    public Path getModelComponentPath() {
        return null;
    }

    @objid ("f8816511-f369-11e1-9173-001ec947ccaf")
    @Override
    public Path getModuleInfosPath() {
        return this.moduleDir.resolve("module.xml");
    }

    @objid ("f8816516-f369-11e1-9173-001ec947ccaf")
    @Override
    public String getName() {
        return this.name;
    }

    @objid ("f881651b-f369-11e1-9173-001ec947ccaf")
    @Override
    public Path getResourcePath() {
        return this.moduleDir;
    }

    @objid ("f8816520-f369-11e1-9173-001ec947ccaf")
    @Override
    public String getUid() {
        return this.uid;
    }

    @objid ("f883c729-f369-11e1-9173-001ec947ccaf")
    @Override
    public Version getVersion() {
        return this.version;
    }

    @objid ("f883c72e-f369-11e1-9173-001ec947ccaf")
    @Override
    public List<ModuleId> getWeakDependencies() {
        return this.weakDependencies;
    }

    @objid ("d378f9f0-f36d-11e1-9173-001ec947ccaf")
    public List<Path> getDocPath() {
        return this.docPath;
    }

    @objid ("d37b5d33-f36d-11e1-9173-001ec947ccaf")
    private void init(final Jxbv2Module loadedModule) throws IOException {
        this.uid = loadedModule.getUid();
        this.name = loadedModule.getId();
        this.mainClassName = loadedModule.getClazz();
        // TODO : is this still used ?
        // this.licenseRequired = Boolean.TRUE.equals(loadedModule.isLicenseRequired());
        String moduleVersion = loadedModule.getVersion();
        if (moduleVersion != null) {
            this.version = new Version(moduleVersion);
        } else {
            // Set a default version...
            this.version = new Version("0.00.00");
        }
        
        String modelioversion = loadedModule.getBinaryversion();
        if (modelioversion != null) {
            this.binaryVersion = new Version(modelioversion);
        } else {
            // Set a default version...
            this.binaryVersion = new Version("0.00.00");
        }
        
        // Dependencies
        Jxbv2Dependencies deps = loadedModule.getDependencies();
        for (Jxbv2Required dep : deps.getRequired()) {
            this.dependencies.add(new ModuleId(dep.getName(), new Version(dep.getVersion())));
        }
        for (Jxbv2Optional dep : deps.getOptional()) {
            this.weakDependencies.add(new ModuleId(dep.getName(), new Version(dep.getVersion())));
        }
        
        // Module classpath
        for (Jxbv2PathEntry pathEntry : loadedModule.getClassPath().getPathEntry()) {
            Path p = this.moduleDir.resolve(pathEntry.getPath());
            if (!Files.exists(p))
                throw new NoSuchFileException(p.toString(), p.toUri().toString(), "class path entry invalid.");
            this.classpath.add(p);
        }
        
        // Module doc path
        if (loadedModule.getResources() != null && loadedModule.getResources().getDocFiles() != null)
        for (Jxbv2PathEntry pathEntry : loadedModule.getResources().getDocFiles().getPathEntry()) {
            Path p = this.moduleDir.resolve(pathEntry.getPath());
            if (!Files.exists(p))
                throw new NoSuchFileException(p.toString(), p.toUri().toString(), "document path entry invalid");
            this.docPath.add(p);
        }
        
        // for (Object child : loadedModule.getParameterOrProfileOrGui()) {
        // if (child instanceof Dependencies) {
        // Dependencies deps = (Dependencies) child;
        // for (Object depChild : deps.getRequiredOrOptionalOrRamc()) {
        // if (depChild instanceof Required) {
        // Required dep = (Required) depChild;
        // this.dependencies.add(new ModuleId(dep.getName(), new Version(dep.getVersion())));
        // } else if (depChild instanceof Optional) {
        // Optional dep = (Optional) depChild;
        // this.weakDependencies.add(new ModuleId(dep.getName(), new Version(dep.getVersion())));
        // }
        // }
        // } else if (child instanceof JxbClasspath) {
        // JxbClasspath classpathEntries = (JxbClasspath) child;
        // for (JxbClasspath.Entry classpathEntry : classpathEntries.getEntry()) {
        // Path p = this.moduleDir.resolve(classpathEntry.getPath());
        // if (!Files.exists(p))
        // throw new NoSuchFileException(p.toString(), p.toUri().toString(), "class path entry invalid.");
        // this.classpath.add(p);
        // }
        // } else if (child instanceof JxbDocpath) {
        // JxbDocpath docpathEntries = (JxbDocpath) child;
        // for (JxbDocpath.Entry docpathEntry : docpathEntries.getEntry()) {
        // Path p = this.moduleDir.resolve(docpathEntry.getPath());
        // if (!Files.exists(p))
        // throw new NoSuchFileException(p.toString(), p.toUri().toString(), "document path entry invalid");
        // this.docPath.add(p);
        // }
        // }
        // }
    }

    @objid ("d37b5d37-f36d-11e1-9173-001ec947ccaf")
    private Jxbv2Module loadModule(final Path moduleFile) throws IOException {
        final Jxbv2Module loadedModule = JaxbModelPersistence.loadJaxbModel(moduleFile);
        if (loadedModule != null) {
            init(loadedModule);
        }
        return loadedModule;
    }

    @objid ("d96558b1-37da-11e2-8ba4-002564c97630")
    @Override
    public Path getArchive() {
        return this.archive;
    }

    @objid ("d7ee889e-6852-44fd-8276-939cbd288e45")
    @Override
    public Map<String, Path> getStylePaths() {
        return Collections.emptyMap();
    }

}
