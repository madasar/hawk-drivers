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
                                    

package org.modelio.gproject.fragment.exml.migration;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.data.project.VersionDescriptors;
import org.modelio.gproject.fragment.exml.ExmlFragment;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.plugin.CoreProject;
import org.modelio.vbasic.log.Log;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;
import org.modelio.vcore.session.api.IAccessManager;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.api.repository.IRepositorySupport;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.session.impl.permission.BasicAccessManager;
import org.modelio.vcore.smkernel.IRStatus;
import org.modelio.vcore.smkernel.IRepositoryObject;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;
import org.modelio.vstore.exml.common.AbstractExmlRepository;
import org.modelio.vstore.exml.common.utils.ExmlUtils;
import org.modelio.vstore.exml.resource.ExmlRepositoryGeometry;
import org.modelio.vstore.exml.resource.IExmlRepositoryGeometry;

/**
 * Migrator that reads the repository from its current format and overwrite it
 * with the new metamodel.
 */
@objid ("66e166d5-3a56-4cba-b236-ac250903adb2")
public class RepositoryRegeneratorMigrator {
    @objid ("06ebc232-b9d0-486d-adea-c2aea4e7887f")
    private ExmlFragment exmlFragment;

    @objid ("4ba91ff7-d69b-4836-9157-21d7b7594361")
    private Path mmVersionPath;

    @objid ("61bf34dd-9900-4b75-931c-4553fea0fe44")
    private VersionDescriptors targetVersion;

    @objid ("9588c1b0-d421-4708-ba62-d3ea4a9ab67d")
    private AbstractExmlRepository exmlRepository;

    @objid ("93018865-616d-4974-9e53-fcfa38be5662")
    private IExmlRepositoryGeometry exmlGeometry;

    /**
     * @param svnFragment the fragment to migrate
     * @param project the project
     * @param mmVersionPath path of the metamodel version file
     * @param targetVersion the version the fragment must be migrated to.
     */
    @objid ("adb25c49-d5a1-49ef-847b-ca1bcae129bb")
    public RepositoryRegeneratorMigrator(ExmlFragment svnFragment, GProject project, Path mmVersionPath, VersionDescriptors targetVersion) {
        this.exmlFragment = svnFragment;
        this.mmVersionPath = mmVersionPath;
        this.targetVersion = targetVersion;
    }

    /**
     * Run the migration
     * @param monitor a progress monitor
     * @throws java.io.IOException on failure.
     */
    @objid ("abba6034-f742-4c2e-8e9a-42e4921a8e78")
    public void run(IModelioProgress monitor) throws IOException {
        String taskName = CoreProject.getMessage("RepositoryRegeneratorMigrator.mon.migration", this.exmlFragment.getId());
        SubProgress mon = SubProgress.convert(monitor, taskName , 10);
        mon.subTask(taskName);
        
        CoreSession tempSession = null;
        
        try {
            Log.trace("RRMI6: "+taskName);
            tempSession = new CoreSession();
            
            // instantiate the repository
            this.exmlFragment.doMountInitRepository(mon.newChild(1));
        
            // Connect the repository to the temporary session
            IAccessManager accessManager = new BasicAccessManager();
            this.exmlRepository = (AbstractExmlRepository) this.exmlFragment.getRepository();
            tempSession.connectRepository(this.exmlRepository, accessManager, monitor);
            
            this.exmlGeometry = new ExmlRepositoryGeometry(this.exmlFragment.getDataDirectory().toFile());
            
            
        
            // The repository may have already be migrated by another user,
            if (!checkAlreadyMigrated()) {
                Log.trace("RRMI1: "+this.exmlFragment.getId()+" not migrated on server.");
                
             // Record status snapshot for comparisons
        
                // 2) Rebuild indexes from scratch to handle updates and by precaution
                Log.trace("RRMI3: rebuilding "+this.exmlFragment.getId()+" indexes");
                rebuildIndexes(mon.newChild(1));
                
                // 3) get lock on the whole repository
                Collection<File> filesToLock = getAllFiles();
        
        
                // 3) read all the model and write it back
                rewriteModel(tempSession, filesToLock, mon.newChild(1));
                Log.trace("RRMI8: "+this.exmlFragment.getId()+" model rewritten");
        
                writeMmVersion();
        
                // 4) save & commit
            } else {
                Log.trace("RRMI2: "+this.exmlFragment.getId()+" already migrated on server.");
                mon.setWorkRemaining(1);
            }
            
            // 5) Indexes must be rebuilt
            Log.trace("RRMI9: rebuilding "+this.exmlFragment.getId()+" indexes");
            rebuildIndexes(mon.newChild(1));
            
            
        } catch (RuntimeException e) {
            Log.error(e);
            throw new IOException(CoreProject.getMessage("RepositoryRegeneratorMigrator.MigrationFailed",
                    this.exmlFragment.getId(),
                    e.toString()), e);
        } catch ( IOException e) {
            Log.error(e);
            throw new IOException(CoreProject.getMessage("RepositoryRegeneratorMigrator.MigrationFailed",
                    this.exmlFragment.getId(),
                    e.getLocalizedMessage()), e);
        } finally {
            if (tempSession != null)
                tempSession.close();
        }
        
        Log.trace("RRMI9: "+this.exmlFragment.getId()+" migration sucessful.");
    }

    /**
     * Rewrite the model to the new version.
     * @param tempSession the opened session to use
     * @param files all the repository files. Some of them might not be EXML files
     * @param monitor a progress monitor
     * @throws java.io.IOException on failure
     */
    @objid ("185a209e-7730-4667-8038-ea0a1839fd93")
    protected void rewriteModel(CoreSession tempSession, Collection<File> files, IModelioProgress monitor) throws IOException {
        IRepository tempRepo = tempSession.getRepositorySupport().getRepository(IRepositorySupport.REPOSITORY_KEY_SCRATCH);
        SubProgress mon = SubProgress.convert(monitor, files.size() * 2);
        mon.subTask(CoreProject.getMessage("RepositoryRegeneratorMigrator.mon.rewriteModel", 
                this.exmlFragment.getId(), files.size()));
        
        try (ITransaction t = tempSession.getTransactionSupport().createTransaction("migration")){
            final IExmlRepositoryGeometry geometry = new ExmlRepositoryGeometry(this.exmlFragment.getDataDirectory().toFile());
            
            for (File file : files) {
                if (geometry.isModelFile(file)) {
                    MRef ref = geometry.getObRef(file);
                    MObject obj = tempSession.getModel().findByRef(ref);
                    
                    if (obj != null) {
                        setToBeSaved(obj, tempRepo);
                    } else {
                        obj = tempSession.getModel().findByRef(ref);
                        Log.warning("RRMW1: failed loading "+file+": "+ref+" not found in model.");
                    }
                }
                mon.worked(1);
            }        
        
            mon.setWorkRemaining(2);
            
            t.commit();
            mon.worked(1);
            
            mon.subTask(CoreProject.getMessage("RepositoryRegeneratorMigrator.mon.savingModel", this.exmlFragment.getId()));
            tempSession.save(mon.newChild(1));
        }
    }

    /**
     * Get all the repository files, model files and others.
     * @return all repository files
     * @throws java.io.IOException on I/O failure
     */
    @objid ("6a1fb554-8244-4258-be42-c609d04cb2a4")
    private Collection<File> getAllFiles() throws IOException {
        final Collection<File> files = new ArrayList<>();
        
        File modelDir = this.exmlGeometry.getModelDirectory();
        
        Files.walkFileTree(modelDir.toPath(), new SimpleFileVisitor<Path>() {
        
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                return FileVisitResult.CONTINUE;
            }
        
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                files.add(file.toFile());
                return FileVisitResult.CONTINUE;
            }
        });
        return files;
    }

    /**
     * Check whether the repository was already migrated.
     * <p>
     * The working copy must be up to date.
     * @return <i>true</i> if the repository was already migrated.
     * @throws java.io.IOException in case of I/O failure
     */
    @objid ("f16fec2c-502d-4358-940c-55e9981291be")
    private boolean checkAlreadyMigrated() throws IOException {
        // Check and fix version file if modified
        File versionFile = this.mmVersionPath.toFile();
        if (!versionFile.isFile() ) {
            Log.trace("RRMI13: no mm version file for "+this.exmlFragment.getId()+" fragment.");
            return false;
        }
        
        
        // Compare file content with last MM version
        return this.exmlFragment.getMetamodelVersion().isSame(getTargetMmVersion());
    }

    /**
     * Write the new metamodel version.
     * @throws java.io.IOException in case of I/O failure
     */
    @objid ("e2f9ee7d-1531-40dc-b6b1-9a433016a9fb")
    private void writeMmVersion() throws IOException {
        try (Writer out = Files.newBufferedWriter(this.mmVersionPath, StandardCharsets.UTF_8)) {
            getTargetMmVersion().write(out);
        }
    }

    @objid ("974d4cf7-1c98-49a1-9260-ca4819cae387")
    private VersionDescriptors getTargetMmVersion() throws NumberFormatException {
        return this.targetVersion;
    }

    @objid ("0ef2d04d-753c-43d6-bfe2-0d94fd270335")
    private void rebuildIndexes(IModelioProgress aMonitor) throws IOException {
        ((AbstractExmlRepository) this.exmlFragment.getRepository()).getMaintenance().rebuildIndexes(aMonitor);
    }

    @objid ("575ab77d-35f4-4bb5-be5e-505a8656f871")
    private void setToBeSaved(MObject cmsNode, IRepository tempRepo) {
        SmObjectImpl smNode = (SmObjectImpl) cmsNode;
        
        // IRStatus.REPO_DIRTY flag is not used by ExmlRepository.
        // use it to avoid composition cycles without recording visited elements.
        if ((smNode.getSmStatusFlags() & IRStatus.REPO_DIRTY) == IRStatus.REPO_DIRTY)
            return;
        smNode.setRStatus(IRStatus.REPO_DIRTY, 0, 0);
        
        if (cmsNode.getMClass().isCmsNode()) {
            // dummy modification to force save
            String name = cmsNode.getName(); 
            cmsNode.setName("");
            cmsNode.setName(name);
        }
        
        //Log.trace("RRMI18: "+cmsNode+" is to be saved.");
        
        for(MObject child : cmsNode.getCompositionChildren()) {
            SmObjectImpl smChild = (SmObjectImpl) child;
            smNode.getSmStatusFlags();
            
        
            if (child.getMClass().isCmsNode()) {
                MRef childRef = new MRef(child);
                if (isNewNode(childRef)) {
                    
                    // detach and attach the object to the repository, to instantiate a new handler
                    tempRepo.addObject(smChild);
                    smNode.getRepositoryObject().attach(smChild);
                    
                    // propagate handler
                    IRepositoryObject newHandle = smChild.getRepositoryObject();
                    for (SmObjectImpl c2 : ExmlUtils.getLoadedCmsNodeContent(smChild))
                    {
                        c2.setRepositoryObject(newHandle);
                    }
        
                    // recurse
                    setToBeSaved (child, tempRepo);
                } else {
                    // Don't recurse in the other case.
                    // The node will be visited later.
                }
            } else {
                // std obj.
                // recurse
                setToBeSaved (child, tempRepo);
            }
        }
    }

    /**
     * Tells whether an element was not a file or was not versioned.
     * @param ref the CMS node reference.
     * @return true if the element is a new file
     */
    @objid ("6231a322-c365-4da2-a2e4-ac4fe75060a6")
    private boolean isNewNode(MRef ref) {
        if (this.exmlGeometry.getExmlFile(ref).isFile()) {
            return false;
        } else {
            Log.trace("RRMI17: "+ref+" has no file or non versioned.");
            return true;
        }
    }

}
