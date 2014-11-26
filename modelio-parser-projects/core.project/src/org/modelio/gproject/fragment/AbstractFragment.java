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
                                    

package org.modelio.gproject.fragment;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.data.project.DefinitionScope;
import org.modelio.gproject.data.project.FragmentDescriptor;
import org.modelio.gproject.data.project.GAuthConf;
import org.modelio.gproject.data.project.GProperties;
import org.modelio.gproject.data.project.VersionDescriptors;
import org.modelio.gproject.gproject.FragmentConflictException;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.gproject.GProjectEvent;
import org.modelio.gproject.gproject.GProjectEventType;
import org.modelio.gproject.plugin.CoreProject;
import org.modelio.metamodel.Metamodel;
import org.modelio.vbasic.auth.IAuthData;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;
import org.modelio.vcore.session.api.IAccessManager;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.api.repository.IRepositoryErrorListener;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Abstract implementation of a project fragment.
 */
@objid ("00dad9ac-abbf-11e1-8392-001ec947ccaf")
public abstract class AbstractFragment implements IProjectFragment {
    @objid ("e0fc65f3-d66d-11e1-9f03-001ec947ccaf")
    private FragmentState state = FragmentState.INITIAL;

    @objid ("06425676-3019-11e2-8f81-001ec947ccaf")
    private DefinitionScope definitionScope;

    @objid ("a32081fc-abf1-11e1-8392-001ec947ccaf")
    private final String id;

    /**
     * Project data sub directory where fragment data are stored.
     * Contains one directory for each fragment.
     */
    @objid ("7c90d1fb-a9e7-4cd0-9056-9155358cf9d3")
    private static final String FRAGMENTS_SUBDIR = "fragments";

    @objid ("4417921b-39f5-4b0a-9f7f-346475d15790")
    private final String encodedDirName;

    /**
     * File name of the file containing the metamodel versions.
     * <p>
     * To be used by {@link #getMetamodelVersion()} in most cases.
     */
    @objid ("56ffb25b-35a1-40b0-aead-be40f853cf28")
    protected static final String MMVERSION_FILE_NAME = "mmversion.dat";

    @objid ("a303e5f8-abf1-11e1-8392-001ec947ccaf")
    private GProperties properties;

    @objid ("6a70dfce-d66d-11e1-9f03-001ec947ccaf")
    private Throwable downError;

    @objid ("6a70dfcf-d66d-11e1-9f03-001ec947ccaf")
    private RepositoryListener errSupport;

    @objid ("8ed3c8d4-07f4-11e2-b193-001ec947ccaf")
    private GProject gproject;

    @objid ("682da9e4-b4df-4297-856f-5e80b9ad608b")
    private final GAuthConf authConf;

    /**
     * Initialize the fragment
     * @param id the fragment id.
     * @param definitionScope definition scope
     * @param properties the fragment properties.
     * @param authConf authentication configuration
     */
    @objid ("c1778cce-95da-11e1-ac83-001ec947ccaf")
    public AbstractFragment(final String id, DefinitionScope definitionScope, final GProperties properties, GAuthConf authConf) {
        Objects.requireNonNull(id, "id is null.");
        Objects.requireNonNull(definitionScope, "definition scope is null");
        Objects.requireNonNull(properties, "properties is null");
        
        this.id = id;
        this.encodedDirName = FileUtils.encodeFileName(getId(), new StringBuilder()).toString();
        this.properties = properties;
        this.definitionScope = definitionScope;
        this.errSupport = new RepositoryListener();
        this.authConf = authConf;
    }

    @objid ("c1778cd1-95da-11e1-ac83-001ec947ccaf")
    @Override
    public final String getId() {
        return this.id;
    }

    @objid ("49bc2ad3-ab3f-11e1-8392-001ec947ccaf")
    @Override
    public final GProperties getProperties() {
        return this.properties;
    }

    /**
     * Changes the fragment state and fires a project change event.
     * @param newState the new fragment state.
     */
    @objid ("6a73421e-d66d-11e1-9f03-001ec947ccaf")
    private final void setState(FragmentState newState) {
        if (newState != FragmentState.DOWN)
            this.downError = null;
        
        if (newState != this.state) {
            this.state = newState;
            if (getProject() != null)
                getProject().getMonitorSupport().fireMonitors(GProjectEvent.fragmentStateChanged(this));
        }
    }

    @objid ("9df6c318-ceb8-4cc7-9b93-886f0de15a85")
    @Override
    public GAuthConf getAuthConfiguration() {
        return this.authConf;
    }

    @objid ("6a734225-d66d-11e1-9f03-001ec947ccaf")
    @Override
    public final Throwable getDownError() {
        return this.downError;
    }

    /**
     * @return the fragment data directory.
     */
    @objid ("b422a1e8-0baa-11e2-bed6-001ec947ccaf")
    public final Path getDataDirectory() {
        return this.gproject.getProjectDataPath()
                .resolve(GProject.DATA_SUBDIR)
                .resolve(FRAGMENTS_SUBDIR)
                .resolve(this.encodedDirName);
    }

    /**
     * Get the fragment runtime directory.
     * <p>
     * The runtime directory contains files that can be deleted at any time without breaking
     * the fragment.
     * @return the fragment runtime directory.
     */
    @objid ("b422a1ed-0baa-11e2-bed6-001ec947ccaf")
    public final Path getRuntimeDirectory() {
        return this.gproject.getProjectRuntimePath()
                .resolve(FRAGMENTS_SUBDIR)
                .resolve(this.encodedDirName);
    }

    /**
     * Get the root elements of the fragment.
     * <p>
     * Returns an empty list as long as there is no open repository.
     * In the other case delegates to {@link #doGetRoots()}.
     * <p>
     * If the doGetRoots() fails to get the roots calls {@link #setDown(Throwable)}.
     */
    @objid ("b4276693-0baa-11e2-bed6-001ec947ccaf")
    @Override
    public final Collection<MObject> getRoots() {
        IRepository repository = getRepository();
        if (repository == null || !repository.isOpen()) {
            return Collections.emptyList();
        } else {
            try {
                return doGetRoots();
            } catch (IOException e) {
                setDown(e);
                return Collections.emptyList();
            }
        }
    }

    @objid ("6327ff06-3004-11e2-8f81-001ec947ccaf")
    @Override
    public DefinitionScope getScope() {
        return this.definitionScope;
    }

    @objid ("6a73422a-d66d-11e1-9f03-001ec947ccaf")
    @Override
    public final FragmentState getState() {
        return this.state;
    }

    /**
     * Get the project to which the fragment is attached
     * @return the project.
     */
    @objid ("8ed62b33-07f4-11e2-b193-001ec947ccaf")
    public final GProject getProject() {
        return this.gproject;
    }

    @objid ("dd899fe8-54f3-11e2-b5ff-001ec947ccaf")
    @Override
    public final void delete() throws IOException {
        // Call sub classes
        // TODO : add a progress monitor to delete()
        doDelete(null);
        
        // Do standard cleaning
        unmount();
        FileUtils.delete(getRuntimeDirectory());
        FileUtils.delete(getDataDirectory());
    }

    /**
     * Mount a fragment.
     * <p>
     * The process is:<ul>
     * <li> set the state as MOUNTING
     * <li> set the current project
     * <li> call {@link #doMountInitRepository(IModelioProgress)}
     * <li> connect the repository to the session
     * <li> call {@link #doMountPostConnect(IModelioProgress)}
     * <li> set the state as UP
     * </ul>
     * Subclasses must implement {@link #doMountInitRepository(IModelioProgress)} and may implement
     * {@link #doMountPostConnect(IModelioProgress)}.
     */
    @objid ("8ed62b2b-07f4-11e2-b193-001ec947ccaf")
    @Override
    public final void mount(GProject aProject, IModelioProgress aMonitor) {
        if (this.state != FragmentState.INITIAL && this.state != FragmentState.DOWN) {
            throw new IllegalStateException("The '" + getId() + "' fragment is already mount: "+this.state);
        }
        
        this.gproject = aProject;
        setState(FragmentState.MOUNTING);
        
        try {
            SubProgress mon = SubProgress.convert(aMonitor, 100);
            IRepository repository = doMountInitRepository(mon);
            
            checkMmVersion();
            
            mon.setWorkRemaining(100);
            repository.getErrorSupport().addErrorListener(getRepositoryErrorSupport());
            IAccessManager accessManager = doInitAccessManager();
            aProject.getSession().getRepositorySupport().connectRepository(repository, getId(), accessManager, mon);
            
            mon.setWorkRemaining(100);
            doMountPostConnect(mon);
            
            setState(FragmentState.UP_FULL);
        } catch (RuntimeException e) {
            setDown(e);
        } catch (IOException | FragmentMigrationNeededException | FragmentAuthenticationException e) {
            setDown(e);
        } finally {
            if (this.state == FragmentState.MOUNTING)
                setState(FragmentState.INITIAL);
        }
    }

    @objid ("8ed62b30-07f4-11e2-b193-001ec947ccaf")
    @Override
    public final void unmount() {
        IRepository repository = getRepository(); 
        if (repository != null && repository.isOpen()) {
            this.gproject.getSession().getRepositorySupport().disconnectRepository(repository);
        }
        
        try {
            doUnmountPostProcess();
        } catch (IOException e) {
            this.gproject.getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(this, e));
        }
        
        setState(FragmentState.INITIAL);
    }

    /**
     * Default implementation.
     * <p>
     * Unregister itself and install a new fragment if the URI is different.
     * Replaces its properties by the given ones.
     * @param aMonitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     */
    @objid ("4f36bb41-af48-4929-bdde-6d867d92e941")
    @Override
    public void reconfigure(FragmentDescriptor fd, IModelioProgress aMonitor) {
        if (! Objects.equals(getUri(), fd.getUri())) {
            // URI changed : forget this fragment and register a new one
            getProject().unregisterFragment(this);
            
            IProjectFragment fragment = Fragments.getFactory(fd).instantiate(fd);
            try {
                getProject().registerFragment(fragment, aMonitor);
            } catch (FragmentConflictException e) {
                // Report error
                getProject().getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(fragment, e));
        
                // try to rollback
                try {
                    getProject().registerFragment(this, aMonitor);
                } catch (FragmentConflictException e1) {
                    e1.addSuppressed(e);
                    setDown(e1);
                }
            }
        } else {
            // Same URI : unmount, update properties and remount
            unmount();
            
            this.definitionScope = fd.getScope();
            this.properties = new GProperties(fd.getProperties());
            this.authConf.reconfigure(fd.getAuthDescriptor());
            
            mount(getProject(), aMonitor);
        }
    }

    /**
     * Check the fragment is mount and throws an exception if not.
     * @throws java.lang.IllegalStateException if the fragment is not mount.
     */
    @objid ("242ea4bc-d0da-11e1-b069-001ec947ccaf")
    protected final void assertMount() throws IllegalStateException {
        if (this.state == FragmentState.INITIAL || this.state == FragmentState.MOUNTING) {
            throw new IllegalStateException("The '" + getId() + "' fragment is not mount.");
        }
    }

    /**
     * Hook for sub classes called by {@link #delete()} in first place.
     * <p>
     * Does nothing by default.
     * The fragment is still mounted and all files still exist but will be deleted
     * on return.
     * Sub classes may do more cleaning.
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     */
    @objid ("f573d3f7-6457-4167-bfea-27f196854503")
    protected void doDelete(IModelioProgress monitor) {
        // nothing by default
    }

    /**
     * Hook called by {@link #unmount()} after having disconnected the repository
     * from the modeling session.
     * <p>
     * May be redefined by subclasses to clean resources.
     * @throws java.io.IOException if some errors should be reported. The unmount will not be cancelled.
     */
    @objid ("8ed62b38-07f4-11e2-b193-001ec947ccaf")
    protected void doUnmountPostProcess() throws IOException {
        // Does nothing by default
    }

    /**
     * Hook called by {@link #mount(GProject, IModelioProgress)} after having connected
     * the repository to the session.
     * <p>
     * Does nothing by default. Subclasses may redefine it to
     * populate the repository.
     * @param mon the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("8ed62b3b-07f4-11e2-b193-001ec947ccaf")
    protected void doMountPostConnect(IModelioProgress mon) throws IOException {
        // Nothing by default
    }

    /**
     * Get the root elements of the fragment.
     * <p>
     * This method is called by {@link AbstractFragment#getRoots()} that ensures
     * there is an open repository.
     * @return the root elements of the fragment.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("b427669a-0baa-11e2-bed6-001ec947ccaf")
    protected abstract Collection<MObject> doGetRoots() throws IOException;

    /**
     * Initialize the access manager.
     * @return the access manager.
     */
    @objid ("a15a3399-38aa-11e2-a6db-001ec947ccaf")
    protected abstract IAccessManager doInitAccessManager();

    /**
     * Instantiate the {@link #getRepository() repository}.
     * <p>
     * This is a hook called by {@link #mount(GProject, IModelioProgress)}.
     * The implementation must just instantiate the {@link IRepository} without opening it.
     * <p>
     * The implementation must <b>not</b> call <code>done()</code> on the given monitor and must leave
     * a non negligible part of the progress unconsumed.
     * @param aMonitor the progress monitor to use for reporting progress to the user.<p>
     * The implementation must <b>not</b> call <code>done()</code> the given monitor and must leave
     * a non negligible part of the progress unconsumed.<p>
     * Accepts <i>null</i>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @return the instantiated repository.
     * @throws java.io.IOException in case of failure.
     * @throws org.modelio.gproject.fragment.FragmentAuthenticationException in case of authentication failure
     */
    @objid ("8ed62b3e-07f4-11e2-b193-001ec947ccaf")
    protected abstract IRepository doMountInitRepository(IModelioProgress aMonitor) throws IOException, FragmentAuthenticationException;

    /**
     * @return the fragment authentication data.
     */
    @objid ("577094a7-243a-48fb-90d6-5dbb08813676")
    protected final IAuthData getAuthData() {
        if (this.authConf == null)
            return null;
        return this.authConf.getAuthData();
    }

    /**
     * Get the error handler that should be attached as listener to the repository when mount.
     * @return the error handler
     */
    @objid ("6a70dfdd-d66d-11e1-9f03-001ec947ccaf")
    protected final RepositoryListener getRepositoryErrorSupport() {
        return this.errSupport;
    }

    /**
     * Set the fragment in "down" state, with the cause.
     * <p>
     * Fires a {@link GProjectEventType#FRAGMENT_DOWN FRAGMENT_DOWN} {@link GProjectEvent event}.
     * @param error the cause of down state
     */
    @objid ("6a734221-d66d-11e1-9f03-001ec947ccaf")
    @Override
    public final void setDown(Throwable error) {
        assert (error != null);
        
        if (this.downError != null) {
            // Ignore if same error (pb: most exceptions don't implement equals)
            if (!this.downError.equals(error) && !this.downError.getMessage().equals(error.getMessage())) {
                // The new error suppresses the old
                error.addSuppressed(this.downError);
                this.downError = error;
                
                // notifies the error change
                if (getProject() != null)
                    getProject().getMonitorSupport().fireMonitors(GProjectEvent.FragmentDownEvent(this));
            }
        } else {
            this.downError = error;
            
            // Disconnect the repository
            // and set all loaded objects as shell.
            IRepository repository = getRepository(); 
            try {
                if (repository != null && repository.isOpen()) {
                    this.gproject.getSession().getRepositorySupport().disconnectRepository(repository);
                }
            
                doUnmountPostProcess();
            } catch (IOException | RuntimeException e) {
                this.downError.addSuppressed(e);
            } 
            
        }
        
        // Change the states and fires a GProjectEvent
        setState(FragmentState.DOWN);
    }

    /**
     * Check the metamodel version against Modelio metamodel version.
     * <p>
     * Returns normally if the fragment may be directly open else throws an exception.
     * @throws java.io.IOException if the metamodel version does not allow the fragment to be open.
     * @throws org.modelio.gproject.fragment.FragmentMigrationNeededException if the fragment needs to be migrated before opening.
     */
    @objid ("86471d8d-0b51-4f7c-b692-423a07a2286f")
    protected void checkMmVersion() throws IOException, FragmentMigrationNeededException {
        VersionDescriptors fragmentVersion = getMetamodelVersion();
        VersionDescriptors lastMmVersion = getLastMmVersion();
        
        if (! fragmentVersion.isSame(lastMmVersion)) {
            final int mmVersion = fragmentVersion.getMmVersion();
            
            if (mmVersion > lastMmVersion.getMmVersion())
                throw new IOException(CoreProject.getMessage("AbstractFragment.FutureMmVersion", getId(), fragmentVersion, lastMmVersion));
            else
                throw new IOException(CoreProject.getMessage("AbstractFragment.MmVersionNotSupported", getId(), fragmentVersion, lastMmVersion));
            
        }
    }

    /**
     * Get the last available metamodel version descriptor.
     * @return the last metamodel version.
     */
    @objid ("420b51fd-a248-4d22-8d40-f342f7a3d024")
    protected static final VersionDescriptors getLastMmVersion() {
        return VersionDescriptors.current(Integer.valueOf(Metamodel.VERSION));
    }

    /**
     * The default implementation does nothing if version is compatible and
     * fails with the same exception as {@link #checkMmVersion()} in the other case.
     * @throws org.modelio.gproject.fragment.FragmentAuthenticationException in case of authentication failure
     */
    @objid ("954fce26-f09f-4b64-91b1-34f9705187b5")
    @Override
    public void migrate(GProject project, IModelioProgress aMonitor) throws IOException, FragmentAuthenticationException {
        try {
            checkMmVersion();
        } catch (FragmentMigrationNeededException e) {
            throw new IOException(e.getLocalizedMessage(), e);
        }
    }

    /**
     * Repository error listener.
     * <p>
     * Catches repository errors and transmit them to the {@link GProject}
     * event monitor.
     */
    @objid ("6a70dfd0-d66d-11e1-9f03-001ec947ccaf")
    private class RepositoryListener implements IRepositoryErrorListener {
        @objid ("6a70dfd1-d66d-11e1-9f03-001ec947ccaf")
        public RepositoryListener() {
            // nothing
        }

        @objid ("6a70dfd3-d66d-11e1-9f03-001ec947ccaf")
        @Override
        public void onWarning(IRepository repository, Throwable e) {
            getProject().getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(AbstractFragment.this, e));
        }

        @objid ("6a70dfd8-d66d-11e1-9f03-001ec947ccaf")
        @Override
        public void onError(IRepository repository, Throwable e) {
            setDown(e);
        }

    }

}
