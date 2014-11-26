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
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.data.project.DefinitionScope;
import org.modelio.gproject.data.project.ILockInfo;
import org.modelio.gproject.data.project.ProjectDescriptor;
import org.modelio.gproject.data.project.ProjectDescriptorReader;
import org.modelio.gproject.gproject.lock.ProjectLock;
import org.modelio.gproject.gproject.url.GUrlProjectFactory;
import org.modelio.gproject.module.IModuleCatalog;
import org.modelio.vbasic.auth.IAuthData;
import org.modelio.vbasic.log.Log;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;

/**
 * Factory that instantiates a GProject from a File path.
 */
@objid ("004d0788-3511-1fc6-b42e-001ec947cd2a")
public class GProjectFactory {
    @objid ("da624ce3-0e3b-11e2-8e4b-001ec947ccaf")
    private static Collection<IProjectFactory> factories = new ArrayList<>();

    /**
     * Create a GProject from a project descriptor.
     * @param projectDescriptor the project descriptor
     * @param authData authentication data. If not <i>null</i> this data will override the authentication descriptor.
     * @param moduleCatalog the modules catalog
     * @param monitor a progress monitor
     * @return the built GProject.
     * @throws java.io.IOException if the project configuration cannot be read.
     * @deprecated use {@link #openProject(ProjectDescriptor, IAuthData, IModuleCatalog, IProjectMonitor, IModelioProgress)} that takes a {@link IProjectMonitor}.
     */
    @objid ("0063105a-351e-1fc6-b42e-001ec947cd2a")
    @Deprecated
    public static GProject openProject(final ProjectDescriptor projectDescriptor, IAuthData authData, IModuleCatalog moduleCatalog, IModelioProgress monitor) throws IOException {
        return openProject(projectDescriptor, authData, moduleCatalog, null, monitor);
    }

    /**
     * Get the remote project descriptor for a project descriptor.
     * @param projectDescriptor a project descriptor.
     * @param authData authentication data.
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @return the remote project descriptor.
     * @throws java.io.IOException in case of failure
     * @throws org.modelio.gproject.gproject.GProjectAuthenticationException in case of authentication failure.
     */
    @objid ("96d74dc5-cf49-4d1a-8670-fdb5001db4ab")
    public static ProjectDescriptor getRemoteDescriptor(ProjectDescriptor projectDescriptor, IAuthData authData, IModelioProgress monitor) throws GProjectAuthenticationException, IOException {
        IProjectFactory f = getProjectFactory(projectDescriptor);
        if (f != null) {
            return f.getRemoteDescriptor(projectDescriptor, authData, monitor);
        
        } else {
            // No remote descriptor for local projects
            return null;
        }
    }

    /**
     * Tells whether the given path is a project space path.
     * @param projectPath a directory path
     * @return <code>true</code> if it is a project space path, else
     * <code>false</code>.
     */
    @objid ("0021c0c8-34d4-1fc7-b42e-001ec947cd2a")
    public static boolean isProjectSpace(final Path projectPath) {
        Path confFile = getConfigFile(projectPath);
        return (Files.isRegularFile(confFile));
    }

    /**
     * Register a project factory.
     * @param f a project factory.
     */
    @objid ("da64af38-0e3b-11e2-8e4b-001ec947ccaf")
    public static void registerFactory(IProjectFactory f) {
        factories.add(f);
    }

    /**
     * Create a ProjectDescriptor from a "project.conf" file.
     * @param confFile the project configuration file.
     * @return the read project descriptor.
     * @throws java.io.IOException in case of error reading the configuration file.
     * @deprecated Use {@link #readProjectDirectory(Path)}.
     */
    @objid ("6b3e8a3a-115c-11e2-8a4f-001ec947ccaf")
    @Deprecated
    public static ProjectDescriptor readDescriptor(final Path confFile) throws IOException {
        ProjectDescriptor desc = new ProjectDescriptorReader()
        .setDefaultScope(DefinitionScope.LOCAL)
        .read(confFile, null);
        
        try {
            desc.setLockInfo(getLockInformations(desc));
        } catch (IOException e) {
            // ignore
        }
        
        // Return the descriptor as is
        return desc;
    }

    /**
     * Create a ProjectDescriptor from a project directory.
     * @param projectDir the project directory.
     * @return the read project descriptor.
     * @throws java.io.IOException in case of error reading the configuration file.
     */
    @objid ("ea6edf6a-d50f-4f48-a07c-7bf27a487875")
    public static ProjectDescriptor readProjectDirectory(final Path projectDir) throws IOException {
        Path confFile = getConfigFile(projectDir);
        ProjectDescriptor desc = new ProjectDescriptorReader()
        .setDefaultScope(DefinitionScope.LOCAL)
        .read(confFile, null);
        
        try {
            desc.setLockInfo(getLockInformations(desc));
        } catch (IOException e) {
            // ignore
            Log.trace("Cannot get lock informations on "+projectDir+":");
            Log.trace(e);
        }
        return desc;
    }

    @objid ("0021e1c0-34d4-1fc7-b42e-001ec947cd2a")
    private static Path getConfigFile(final Path projectPath) {
        return projectPath.resolve("project.conf");
    }

    /**
     * Get the custom factory supporting the given descriptor.
     * <p>
     * Returns <code>null</code> if no such factory is found.
     * @param desc the project descriptor to load
     * @return the found factory or <code>null</code>.
     */
    @objid ("3bb2ca6c-85f2-49df-b408-4908ec7d361f")
    private static IProjectFactory getProjectFactory(ProjectDescriptor desc) {
        // Look for java services (META-INF/services)
        for (IProjectFactory f: java.util.ServiceLoader.load(IProjectFactory.class)) {
            if (f.supports(desc)) {
                return f;
            }
        }
        
        // Look for registered factories
        for (IProjectFactory f: factories) {
            if (f.supports(desc)) { 
                return f;
            }
        }
        return null;
    }

    /**
     * Create a GProject from a project descriptor.
     * @param projectDescriptor the project descriptor
     * @param authData authentication data. If not <i>null</i> this data will override the authentication descriptor.
     * @param moduleCatalog the modules catalog
     * @param eventListener a project monitor to add immediately on project creation. <br>This monitor will receive events fired while opening the project.
     * The monitor will remain once the project is open. If it is not your intended behavior you have to remove it manually after this call returns.
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility
     * to call {@link IModelioProgress#done()} on the given monitor. Accepts <i>null</i>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @return the built GProject.
     * @throws java.io.IOException if the project configuration cannot be read.
     */
    @objid ("6a7e4a8c-371e-4795-94e2-b178e785d6fb")
    public static GProject openProject(final ProjectDescriptor projectDescriptor, IAuthData authData, IModuleCatalog moduleCatalog, IProjectMonitor eventListener, IModelioProgress monitor) throws IOException {
        IProjectFactory f = getProjectFactory(projectDescriptor);
        if (f != null) {
            SubProgress mon = SubProgress.convert(monitor, 50);
        
            GProject project = f.createProject(projectDescriptor);
            
            if (eventListener != null)
                project.getMonitorSupport().addMonitor(eventListener);
        
            // Open project
            project.open(projectDescriptor, authData, moduleCatalog, mon.newChild(50));
            return project;
        } else {
            // Default case
            GProject project = new GProject();
            
            if (eventListener != null)
                project.getMonitorSupport().addMonitor(eventListener);
        
            project.open(projectDescriptor, authData, moduleCatalog, monitor);
            return project;
        }
    }

    /**
     * Test whether a project is locked.
     * @param desc a project descriptor.
     * @return lock informations if the project is locked, else <i>null</i>.
     * @throws java.io.IOException in case of I/O failure
     */
    @objid ("2730c29a-29f2-48da-bf37-e87126767e2b")
    public static ILockInfo getLockInformations(final ProjectDescriptor desc) throws IOException {
        Path projectDir = desc.getPath();
        
        ProjectLock locker = ProjectLock.get(
                projectDir.resolve(GProject.RUNTIME_SUBDIR), 
                desc.getName());
        return locker.test();
    }


static {
        // Register the URI project factory.
        factories.add(new GUrlProjectFactory());
    }
}
