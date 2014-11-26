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
                                    

package org.modelio.gproject.gproject;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.data.project.DefinitionScope;
import org.modelio.gproject.data.project.DescriptorServices;
import org.modelio.gproject.data.project.DescriptorWriter;
import org.modelio.gproject.data.project.FragmentDescriptor;
import org.modelio.gproject.data.project.GAuthConf;
import org.modelio.gproject.data.project.GProperties;
import org.modelio.gproject.data.project.ModuleDescriptor;
import org.modelio.gproject.data.project.ProjectDescriptor;
import org.modelio.gproject.data.project.ProjectType;
import org.modelio.gproject.fragment.Fragments;
import org.modelio.gproject.fragment.IProjectFragment;
import org.modelio.gproject.gproject.lock.ProjectLock;
import org.modelio.gproject.module.EmptyModuleHandle;
import org.modelio.gproject.module.GModule;
import org.modelio.gproject.module.IModuleCatalog;
import org.modelio.gproject.module.IModuleHandle;
import org.modelio.gproject.module.catalog.EmptyModuleCatalog;
import org.modelio.vbasic.auth.IAuthData;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.log.Log;
import org.modelio.vbasic.net.UriConnections;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.NullProgress;
import org.modelio.vbasic.progress.SubProgress;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.api.repository.IRepositorySupport;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.session.impl.permission.BasicAccessManager;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vstore.jdbm.JdbmRepository;

/**
 * Represents a Modelio project.
 * <p>
 * The project physical structure is documented here: <a
 * href="https://forge-modelio.softeam.com/projects/modelio-phoenix/wiki/Project_space_structure"
 * >https://forge-modelio.softeam.com/projects/modelio-phoenix/wiki/Project_space_structure</a>
 */
@objid ("b29f8656-8ed4-11e1-be7e-001ec947ccaf")
public class GProject {
    @objid ("818dfc79-0d60-11e2-8e4b-001ec947ccaf")
    private IModuleCatalog moduleCatalog;

    @objid ("a327a8f5-abf1-11e1-8392-001ec947ccaf")
    private String name;

    /**
     * {@value #DATA_SUBDIR} sub directory where module data are stored.
     */
    @objid ("853710c5-7ff9-458d-a93f-02b41196a0ec")
    protected static final String MODULES_SUBDIR = "modules";

    /**
     * Project sub directory name where persistent data are stored.
     */
    @objid ("8b9259ee-1fc0-48b3-a321-523f7f688fcd")
    public static final String DATA_SUBDIR = "data";

    /**
     * Runtime directory name.
     */
    @objid ("e03f536b-6621-4b5a-9a76-807028993ade")
     static final String RUNTIME_SUBDIR = ".runtime";

    /**
     * All GProject instances. Used to {@link #getProject(MObject) find the project} of a MObject.
     */
    @objid ("db776f80-1775-11e2-928d-001ec947ccaf")
    private static final List<GProject> allProjects = new ArrayList<>();

    /**
     * Fragments added by registerFragment(...) method.
     */
    @objid ("8af97b41-8ed5-11e1-be7e-001ec947ccaf")
    private final List<IProjectFragment> ownFragments = new ArrayList<>();

    @objid ("c1811639-95da-11e1-ac83-001ec947ccaf")
    private ICoreSession session;

    /**
     * Project directory.
     * <p>
     * it is the project.conf location.
     */
    @objid ("a308aa97-abf1-11e1-8392-001ec947ccaf")
    private Path projectPath;

    @objid ("a308aa99-abf1-11e1-8392-001ec947ccaf")
    private GProperties properties;

    /**
     * Concatenation of {@link #ownFragments own fragments}and the fragments declared by the modules.
     */
    @objid ("6fe5077e-edc9-11e1-912e-001ec947ccaf")
    private final List<IProjectFragment> allFragments = new ArrayList<>();

    /**
     * Unmodifiable view of {@link #allFragments}. Avoids instantiating a new view for each {@link #getFragments()} call.
     */
    @objid ("6fe50781-edc9-11e1-912e-001ec947ccaf")
    private final List<IProjectFragment> allFragmentsView = Collections.unmodifiableList(this.allFragments);

    @objid ("617f8be2-08b6-11e2-b193-001ec947ccaf")
    private final GProjectMonitorSupport monitorSupport = new GProjectMonitorSupport();

    @objid ("3a8981a1-0d65-11e2-8e4b-001ec947ccaf")
    private final List<GModule> modules = new ArrayList<>();

    @objid ("f5328bd1-9045-4cb4-b97c-b65927a5a7a3")
    private GAuthConf auth;

    @objid ("1a7541ce-b47f-440b-8839-f3e6aa30f2be")
    private ProjectLock projectLock;

    /**
     * Instantiate a project.
     * <p>
     * To be called by the factory and sub classes only.
     */
    @objid ("c181163b-95da-11e1-ac83-001ec947ccaf")
    protected GProject() {
        allProjects.add(this);
    }

    /**
     * Get the GProject owning the given model object.
     * <p>
     * Returns <code>null</code> if the model object is not managed by a GProject.
     * @param obj a model object.
     * @return its GProject or <code>null</code>.
     */
    @objid ("db79d1d9-1775-11e2-928d-001ec947ccaf")
    public static GProject getProject(MObject obj) {
        CoreSession sess = CoreSession.getSession(obj);
        for (GProject p : allProjects) {
            if (p.session == sess)
                return p;
        }
        return null;
    }

    /**
     * Close the project and release the resources.
     */
    @objid ("c1811645-95da-11e1-ac83-001ec947ccaf")
    public void close() {
        for (IProjectFragment f : getFragments()) {
            try {
                // Directly close the repository before unmounting to avoid unloading each object.
                IRepository rep = f.getRepository();
                if (rep != null)
                    rep.close();
                f.unmount();
            } catch (Exception e) {
                getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(f, e));
            }
        }
        
        for (GModule m : this.modules) {
            try {
                m.unmount();
            } catch (Exception e) {
                getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(e));
            }
        }
        
        if (this.session != null) {
            this.session.close();
            this.session = null;
        }
        
        // Release the lock
        if (this.projectLock != null) {
            try {
                this.projectLock.close();
                this.projectLock = null;
            } catch (IOException e) {
                getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(e));
            }
        }
        
        allProjects.remove(this);
    }

    /**
     * @return the project authentication configuration or <code>null</code>.
     */
    @objid ("95bb733c-e0ff-4619-9c2e-30a6c40c4269")
    public GAuthConf getAuthConfiguration() {
        return this.auth;
    }

    /**
     * Get the fragment owning the given model object.
     * <p>
     * Returns <code>null</code> if the model object is not managed by a fragment.
     * @param obj a model object.
     * @return its fragment or <code>null</code>.
     */
    @objid ("db7c342f-1775-11e2-928d-001ec947ccaf")
    public IProjectFragment getFragment(MObject obj) {
        if (this.session != null) {
            IRepository repo = this.session.getRepositorySupport().getRepository(obj);
            for (IProjectFragment f : this.allFragments) {
                if (f.getRepository() == repo) {
                    return f;
                }
            }
        }
        return null;
    }

    /**
     * Get the list of all model fragments.
     * <p>
     * This list is not modifiable and is modified when a fragment or a module is added or removed.
     * @return all model fragments.
     */
    @objid ("c1811647-95da-11e1-ac83-001ec947ccaf")
    public List<IProjectFragment> getFragments() {
        return Collections.unmodifiableList(new ArrayList<>(this.allFragmentsView));
    }

    /**
     * Get the list of all GModules installed in this project.
     * @return a GModule list.
     */
    @objid ("aa7d67e4-ec75-11e1-912e-001ec947ccaf")
    public List<GModule> getModules() {
        return Collections.unmodifiableList(new ArrayList<>(this.modules));
    }

    /**
     * Get project monitoring support.
     * <p>
     * Allows to add, remove and fires GProject monitors.
     * @return the monitor support.
     */
    @objid ("617f8be3-08b6-11e2-b193-001ec947ccaf")
    public GProjectMonitorSupport getMonitorSupport() {
        return this.monitorSupport;
    }

    /**
     * Get the project's name.
     * @return the project's name.
     */
    @objid ("13aa21f2-9a85-11e1-ac83-001ec947ccaf")
    public String getName() {
        return this.name;
    }

    /**
     * Get the list of the project fragments registered with {@link #registerFragment(IProjectFragment, IModelioProgress)} .
     * <p>
     * Fragments provided by modules are excluded from the list.
     * <p>
     * This list is not modifiable and reflect changes when a fragment registered or removed.
     * @return registered project fragments.
     */
    @objid ("da6bd643-0e3b-11e2-8e4b-001ec947ccaf")
    public List<IProjectFragment> getOwnFragments() {
        return Collections.unmodifiableList(new ArrayList<>(this.ownFragments));
    }

    /**
     * Get the project directory i.e. the project.conf location.
     * @return the directory containing the project.conf.
     */
    @objid ("49c351d0-ab3f-11e1-8392-001ec947ccaf")
    public Path getProjectPath() {
        return this.projectPath;
    }

    /**
     * Get the directory where the project data are managed by Modelio (model, fragments modules and so on).
     * The internal structure of this directory is left to its users (fragments, modules, CMS tools ...)
     * User generated data like source code, documentation are never stored there.
     * @return the path where the 'data' directory resides.
     */
    @objid ("dda545c0-68b9-4753-89a4-66b831195593")
    public Path getProjectDataPath() {
        return this.projectPath;
    }

    /**
     * The .runtime directory of the project, used to store copies of the resource files that might require an update while the
     * application is running. Typical example: module jar files that would be locked otherwise.
     * @return The .runtime directory
     */
    @objid ("5030f6b8-1890-408b-9a55-fae6d6b3176e")
    public Path getProjectRuntimePath() {
        return getProjectPath().resolve(RUNTIME_SUBDIR);
    }

    /**
     * Get the properties stored in the project.
     * @return the current set of properties.
     */
    @objid ("f480100d-aa5a-11e1-8392-001ec947ccaf")
    public GProperties getProperties() {
        return this.properties;
    }

    /**
     * Get the project remote location.
     * <p>
     * Returns <code>null</code> for local projects.
     * @return the project remote location.
     */
    @objid ("3824d956-0c6e-11e2-bed6-001ec947ccaf")
    @SuppressWarnings("static-method")
    public String getRemoteLocation() {
        return null;
    }

    /**
     * Get the core session corresponding to this project.
     * @return a CoreSession. Might be <code>null</code> if the project is closed.
     */
    @objid ("00377288-e2c5-1fd5-b969-001ec947cd2a")
    public ICoreSession getSession() {
        return this.session;
    }

    /**
     * Get the project type.
     * <p>
     * This method should be redefined by subclasses.
     * @return the project type.
     */
    @objid ("82724f7b-0be2-11e2-bed6-001ec947ccaf")
    @SuppressWarnings("static-method")
    public ProjectType getType() {
        return ProjectType.LOCAL;
    }

    /**
     * Add a new module in the project.
     * <p>
     * If the project is currently opened, the MDA fragment of the module is mounted in the project.
     * @param moduleHandle the module to deploy
     * @param moduleArchivePath the .jmdac archive to deploy
     * @return the instantiated module
     * @throws java.io.IOException in case of failure.
     */
    @objid ("aa7d67ea-ec75-11e1-912e-001ec947ccaf")
    public GModule installModule(IModuleHandle moduleHandle, Path moduleArchivePath) throws IOException {
        // Copy archive in data directory
        Path localArchiveDir = this.projectPath.resolve(DATA_SUBDIR).resolve(MODULES_SUBDIR).resolve(moduleHandle.getName());
        FileUtils.delete(localArchiveDir);
        Files.createDirectories(localArchiveDir);
        Path localArchivePath = localArchiveDir.resolve(moduleHandle.getName()+".jmdac");
        Files.copy(moduleArchivePath, localArchivePath, StandardCopyOption.REPLACE_EXISTING);
        
        // Instantiate module
        return doInstallModule(moduleHandle, moduleArchivePath.toUri());
    }

    /**
     * Indicates whether or not the project is opened.
     * @return <code>true</code> if there is a core session.
     */
    @objid ("6fe769dc-edc9-11e1-912e-001ec947ccaf")
    public boolean isOpen() {
        return this.session != null;
    }

    /**
     * Register a fragment in the project.
     * <p>
     * The method mounts the fragment but it does not create any data for the fragment.
     * @param fragment the project fragment to register.
     * @param aMonitor a progress monitor.
     * @throws org.modelio.gproject.gproject.FragmentConflictException if a fragment with same identifier or URI is already registered
     */
    @objid ("d1110783-9849-11e1-ac83-001ec947ccaf")
    public void registerFragment(final IProjectFragment fragment, IModelioProgress aMonitor) throws FragmentConflictException {
        Objects.requireNonNull(fragment);
        
        checkFragmentUnique(this.allFragments, fragment);
        
        this.ownFragments.add(fragment);
        this.allFragments.add(fragment);
        
        if (isOpen()) {
            fragment.mount(this, aMonitor);
            this.monitorSupport.fireMonitors(GProjectEvent.fragmentAdded(fragment));
        }
    }

    /**
     * Remove module from project. If the project is currently opened, the MDA fragment of the module is dismounted from the
     * project.
     * @param module the module to remove from the project.
     */
    @objid ("003a5f66-60dd-1060-84ef-001ec947cd2a")
    public void removeModule(GModule module) {
        if (isOpen()) {
            // Remove the module and its fragment
            this.modules.remove(module);
            IProjectFragment modelFragment = module.getModelFragment();
            if (modelFragment != null) {
                modelFragment.unmount();
                try {
                    // Delete the fragment itself
                    modelFragment.delete();
                } catch (IOException e) {
                    Log.trace("Unable to delete fragemnt " + modelFragment.getId());
                }
                this.allFragments.remove(modelFragment);
                this.monitorSupport.fireMonitors(GProjectEvent.fragmentRemoved(modelFragment));
            }
        } else {
            // Remove the module only
            this.modules.remove(module);
        }
        
        // Remove local archive and module work path
        try {
            Path localArchiveDir = getModuleDataPath(module.getName());
            if (localArchiveDir != null) {
                FileUtils.delete(localArchiveDir);
            }
        } catch (IOException e) {
            this.monitorSupport.fireMonitors(GProjectEvent.buildWarning(e));
        }
    }

    /**
     * Save the model and the project description.
     * @param progress a Modelio progress monitor
     * @throws java.io.IOException if a repository failed to save.
     */
    @objid ("c1811643-95da-11e1-ac83-001ec947ccaf")
    public void save(IModelioProgress progress) throws IOException {
        if (this.session != null) {
            this.session.save(progress);
        }
        
        saveProjectDescription();
    }

    /**
     * Reconfigure the project properties with the given new descriptor.
     * <p>
     * The default implementation replaces the project properties.
     * This method may be redefined to have another behavior.
     * @param newDesc the new project description
     * @param monitor a progress monitor
     */
    @objid ("bf898e03-a499-4988-bd96-985caaaed03b")
    public void reconfigureProperties(GProperties newDesc, IModelioProgress monitor) {
        this.properties = new GProperties(newDesc);
    }

    /**
     * Unregisters a fragment in the project.
     * <p>
     * The method unmount the fragment but it does not <i>'delete'</i> the fragment physical data.
     * @param fragment the project fragment to register.
     */
    @objid ("00544b74-a58b-1044-a30e-001ec947cd2a")
    public void unregisterFragment(IProjectFragment fragment) {
        if (isOpen()) {
            fragment.unmount();
        }
        this.ownFragments.remove(fragment);
        this.allFragments.remove(fragment);
        
        this.monitorSupport.fireMonitors(GProjectEvent.fragmentRemoved(fragment));
    }

    /**
     * Save the project description in its "project.conf" file.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("cb0de6e2-4d1c-420f-a746-21b4cf2bc5a4")
    protected void saveProjectDescription() throws IOException {
        Path confFilePath = this.projectPath.resolve("project.conf");
        ProjectDescriptor desc = new ProjectWriter().write(this);
        new DescriptorWriter().write(desc, confFilePath);
    }

    /**
     * Initialize the project from a project descriptor.
     * <p>
     * This method may be redefined in sub classes.
     * In this case <i>super.initialize(...)</i> should be called at the end.
     * @param projectDescriptor a project descriptor.
     * @param authData optional authentication data. If non <code>null</code> it overrides
     * the authentication descriptor.
     * @param aModuleCatalog the modules catalog.
     * @param aProgress a progress monitor
     * @throws java.io.IOException in case of I/O error preventing the project from being instantiated
     */
    @objid ("f7e310e4-0f09-11e2-bd8d-001ec947ccaf")
    protected void initialize(ProjectDescriptor projectDescriptor, IAuthData authData, IModuleCatalog aModuleCatalog, IModelioProgress aProgress) throws IOException {
        // Initialize fields
        this.name = projectDescriptor.getName();
        this.projectPath = projectDescriptor.getPath();
        this.properties = projectDescriptor.getProperties();
        if (authData != null)
            this.auth = new GAuthConf(authData, DefinitionScope.LOCAL);
        else
            this.auth = GAuthConf.from(projectDescriptor.getAuthDescriptor());
        
        if (aModuleCatalog == null) {
            this.moduleCatalog = EmptyModuleCatalog.getInstance();
        } else {
            this.moduleCatalog = aModuleCatalog;
        }
        
        // lock the project
        lockProject();
        
        // Resolve relative URIs against project path
        DescriptorServices.resolveUris(projectDescriptor, getProjectDataPath().toUri());
        
        // Instantiate fragments and GModules from the descriptor.
        loadDescriptor(projectDescriptor, aProgress);
    }

    /**
     * Setup the project from the descriptor.
     * <p>
     * Add the described fragments and the modules without mounting them.
     * @param projectDescriptor a project descriptor
     * @param aProgress a progress monitor.
     */
    @objid ("684350a0-0d5c-11e2-9d8a-001ec947ccaf")
    protected final void loadDescriptor(final ProjectDescriptor projectDescriptor, IModelioProgress aProgress) {
        SubProgress mon = SubProgress.convert(aProgress, projectDescriptor.getFragments().size()
                + projectDescriptor.getModules().size());
        
        // Read fragments
        for (FragmentDescriptor fd : projectDescriptor.getFragments()) {
            if (fd.getType() != null) {
                IProjectFragment fragment = Fragments.getFactory(fd).instantiate(fd);
                assert (fragment != null);
                
                this.ownFragments.add(fragment);
                this.allFragments.add(fragment);
            }
            mon.worked(1);
        }
        
        // Read modules
        for (final ModuleDescriptor md : projectDescriptor.getModules()) {
            loadModuleDescriptor(mon.newChild(1), md);
        }
    }

    /**
     * Convert the URI to a Path in the default FileSystem.
     * <p>
     * If the URI represents a file directory, returns the represented Path. If the URI represents a relative path, resolve it
     * against the project path. In the other case try to open an URL connection to copy the file to the runtime directory.
     * @param anUri the URI to convert.
     * @return a path in the default FileSystem.
     * @throws java.io.IOException if the URI couldn't be resolved.
     */
    @objid ("684350a6-0d5c-11e2-9d8a-001ec947ccaf")
    protected Path toFilePath(URI anUri, IAuthData authData) throws IOException {
        // First try to convert URI to Path
        if (anUri.getScheme() != null)
            try {
                return Paths.get(anUri);
            } catch (FileSystemNotFoundException | IllegalArgumentException e) {
                // continue
            }
        
        // Maybe the uri is relative path
        if (anUri.getScheme() == null || anUri.getScheme().equals("file")) {
            try {
                Path p = getProjectDataPath().resolve(anUri.getPath());
                if (Files.exists(p))
                    return p;
            } catch (FileSystemNotFoundException | IllegalArgumentException e) {
                // continue
            }
        }
        
        // Try to open an URL connection & copy into a temp file.
        String aFileName = anUri.getPath().substring(anUri.getPath().lastIndexOf('/') + 1);
        Path localPath = getProjectRuntimePath().resolve(aFileName);
        
        try {
            Files.createDirectories(localPath.getParent());
            try (InputStream in = UriConnections.openInputStream(anUri, authData)) {
                Files.copy(in, localPath, StandardCopyOption.REPLACE_EXISTING);
            }
            return localPath;
        } catch (MalformedURLException e) {
            // URI not supported
            throw new IOException(e);
        } catch (IndexOutOfBoundsException e) {
            throw new IOException(e);
        }
    }

    @objid ("7eafc164-53cd-41dd-877e-b0eb71a4e6be")
    void setName(String name2) {
        this.name = name2;
    }

    @objid ("72d39d62-cc13-465d-acbf-ed4aeb20fa6b")
    final void loadModuleDescriptor(IModelioProgress mon, final ModuleDescriptor md) {
        if (md.getArchiveLocation() != null)
            try {
                final IModuleHandle moduleHandle = getModuleHandle(mon, md);
                
                final GModule module = new GModule(this, md.getArchiveLocation(), moduleHandle, md.getScope(), md.getParameters(), md.isActivated());
                module.setAuthData(GAuthConf.from(md.getAuthDescriptor()));
                this.modules.add(module);
            } catch (IOException e) {
                getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(e));
            }
    }

    /**
     * Open the project represented by the given descriptor.
     * <p>
     * To be called by the project factory only.
     * @param projectDescriptor a project descriptor.
     * @param authData authentication data. If not <code>null</code> it overrides the authentication descriptor.
     * @param aModuleCatalog the modules catalog.
     * @param aProgress a progress monitor
     * @throws java.io.IOException in case of I/O error preventing the project from being open.
     */
    @objid ("f7e310ea-0f09-11e2-bd8d-001ec947ccaf")
    final void open(ProjectDescriptor projectDescriptor, IAuthData authData, IModuleCatalog aModuleCatalog, IModelioProgress aProgress) throws IOException {
        if (this.session != null)
            throw new IllegalStateException("'" + this.name + "' project already open.");
        
        SubProgress mon = SubProgress.convert(aProgress, 370);
        
        // Initialize the project content from the descriptor
        // Redefined in sub classes
        initialize(projectDescriptor, authData, aModuleCatalog, mon.newChild(100));
        
        // Open the core session
        boolean ok = false;
        try {
            this.session = new CoreSession();
            mountDefaultRepositories(mon.newChild(20));
            mountModules(mon.newChild(200));
            mountFragments(mon.newChild(50));
            ok = true;
        } finally {
            if (!ok) {
                if (this.session != null) {
                    this.session.close();
                    this.session = null;
                }
            }
        }
    }

    /**
     * Set the project authentication configuration.
     * <p>
     * Does nothing more. The project should be closed then open again after calling this.
     * @param newAuth the new project authentication configuration.
     */
    @objid ("e2de2d72-a859-4bcd-b899-126529a77684")
    void setAuthConfiguration(GAuthConf newAuth) {
        this.auth = newAuth;
    }

    /**
     * Add a new module in the project.
     * <p>
     * If the project is currently opened, the MDA fragment of the module is mounted in the project.
     * @param moduleHandle the module to deploy
     * @param moduleArchiveUri the .jmdac archive to deploy
     * @return the instantiated module
     */
    @objid ("323feeaf-c976-49f0-9b7d-03f4e9aee4c8")
    private GModule doInstallModule(IModuleHandle moduleHandle, URI moduleArchiveUri) {
        GModule module = new GModule(this, moduleArchiveUri, moduleHandle, DefinitionScope.LOCAL, new GProperties(), true);
        
        if (isOpen()) {
            // Add the module only once it is successfully mount.
            this.modules.add(module);
            IProjectFragment modelFragment = module.getModelFragment();
            if (modelFragment != null) {
                this.allFragments.add(modelFragment);
                modelFragment.mount(this, new NullProgress());
                
                getMonitorSupport().fireMonitors(GProjectEvent.fragmentAdded(modelFragment));
            } else {
                String msg = module.getName()+" "+module.getVersion()+" has no model fragment.";
                getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(new Exception(msg)));
            }
        } else {
            this.modules.add(module);
        }
        return module;
    }

    @objid ("92c047e5-f4d1-4cea-b976-bf3e579b5756")
    private Path getModuleDataPath(String moduleName) {
        return this.projectPath.resolve(DATA_SUBDIR).resolve(MODULES_SUBDIR).resolve(moduleName);
    }

    @objid ("22c7affc-1b68-41c1-921d-87e98f09c710")
    private Path getLocalArchive(ModuleDescriptor md) throws IOException {
        // try to get the local copy
        Path archivePath = getModuleDataPath(md.getName()).resolve(md.getName()+".jmdac");
        if (Files.isRegularFile(archivePath))
            return archivePath;
        
        // first try to get the original
        IAuthData authData = md.getAuthDescriptor().getData();
        return toFilePath(md.getArchiveLocation(), authData);
    }

    @objid ("c1811640-95da-11e1-ac83-001ec947ccaf")
    private void mountFragments(IModelioProgress aMonitor) {
        ArrayList<IProjectFragment> mounted = new ArrayList<>(this.allFragments.size());
        
        for (IProjectFragment fragment : this.allFragments) {
            try {
                checkFragmentUnique(mounted, fragment);
        
                fragment.mount(this, aMonitor);
                mounted.add(fragment);
            } catch (FragmentConflictException e) {
                fragment.setDown(e);
            }
        }
    }

    @objid ("3d98b924-f370-11e1-9173-001ec947ccaf")
    private void mountModules(IModelioProgress progress) {
        SubProgress m = SubProgress.convert(progress, this.modules.size() * 10);
        for (GModule module : this.modules) {
            IProjectFragment modelFragment = module.getModelFragment();
            if (modelFragment != null) {
                this.allFragments.add(modelFragment);
            } else {
                String msg = module.getName()+" "+module.getVersion()+" has no model fragment.";
                getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(new Exception(msg)));
            }
            m.worked(10);
        }
    }

    /**
     * Open the default repository.
     * Create it if missing or not readable.
     * @param monitor a progress monitor
     * @throws java.nio.file.FileSystemException in case of fatal I/O failure.
     * @throws java.io.IOException in case of fatal I/O failure.
     */
    @objid ("707deddd-440c-4a01-92d1-1fbeb87a7dd2")
    private void mountDefaultRepositories(SubProgress monitor) throws IOException, FileSystemException {
        Path nsUseRepoPath = this.getProjectDataPath().resolve(DATA_SUBDIR).resolve("localmodel");
        JdbmRepository nsUseRepo = null;
        
        IRepositorySupport repositorySupport = this.session.getRepositorySupport();
        try {
            monitor.setWorkRemaining(15);
            nsUseRepo = new JdbmRepository(nsUseRepoPath.toFile());
            repositorySupport.connectRepository(nsUseRepo, IRepositorySupport.REPOSITORY_KEY_LOCAL, new BasicAccessManager(), monitor.newChild(10));
        
        } catch (final IOException e) {
            // Report the problem
            getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(e));
        
            // Close and delete the repository
            nsUseRepo.close();
            FileUtils.delete(nsUseRepoPath);
        
            // Create a new one
            nsUseRepo = new JdbmRepository(nsUseRepoPath.toFile());
            repositorySupport.connectRepository(nsUseRepo, IRepositorySupport.REPOSITORY_KEY_LOCAL, new BasicAccessManager(), monitor.newChild(5));
        }
    }

    @objid ("1de1a27e-07a4-46fd-ba78-39c6e7a36098")
    private void checkFragmentUnique(List<IProjectFragment> existing, final IProjectFragment fragment) throws FragmentConflictException {
        for (IProjectFragment f : existing) {
            if (f.getId().equals(fragment.getId())) {
                throw new FragmentConflictException(f, fragment, this);
            }
        }
    }

    /**
     * @return the modules catalog
     */
    @objid ("f0342dfb-2708-4513-ba51-c784de7e7d8b")
    public IModuleCatalog getModuleCatalog() {
        return this.moduleCatalog;
    }

    /**
     * Get a module handle from a descriptor.
     * @param mon a progress monitor
     * @param md the descriptor
     * @return the module handle
     * @throws java.io.IOException in case of failure getting the module archive
     * @throws java.nio.file.FileSystemException in case of file system error getting the module archive
     */
    @objid ("538790be-d9c8-4eeb-b2ba-c9c36f4adbaf")
    IModuleHandle getModuleHandle(IModelioProgress mon, final ModuleDescriptor md) throws IOException, FileSystemException {
        final Path archive = getLocalArchive(md);
        final IModuleHandle moduleHandle;
        if (Files.exists(archive) && !Files.isDirectory(archive)) {
            moduleHandle = this.moduleCatalog.getModuleHandle(archive, mon);
        } else {
            moduleHandle = new EmptyModuleHandle(md.getName(), md.getVersion());
        }
        return moduleHandle;
    }

    @objid ("f05cb080-d19b-4758-8039-82bebf73b885")
    private void lockProject() throws IOException {
        Files.createDirectories(getProjectRuntimePath());
        
        this.projectLock = ProjectLock.get(getProjectRuntimePath(), this.name);
        this.projectLock.lock();
    }

}
