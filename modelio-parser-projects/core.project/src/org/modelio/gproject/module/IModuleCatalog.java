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
                                    

package org.modelio.gproject.module;

import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.progress.IModelioProgress;

/**
 * Modules catalog.
 * <p>
 * Allows to get a module handle from a .jmdac module archive.
 */
@objid ("0070a0a8-910c-1060-84ef-001ec947cd2a")
public interface IModuleCatalog {
    /**
     * Get a module handle from a .jmdac archive.
     * @param archivePath the archive path
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @return the module handle
     * @throws java.io.IOException in case of error.
     * @throws java.nio.file.FileSystemException in case of file system error.
     * Use {@link FileUtils#getLocalizedMessage(FileSystemException)} to get a human readable error message.
     */
    @objid ("57cd5c22-06f3-11e2-9469-001ec947ccaf")
    IModuleHandle getModuleHandle(Path archivePath, IModelioProgress monitor) throws IOException, FileSystemException;

    /**
     * Get a module handle from the cache.
     * @param moduleName the module to find.
     * @param moduleVersion the version of the module to find. Might be <code>null</code> to indicate the latest available version.
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @return the module handle
     * @throws java.io.IOException in case of failure
     * @throws java.nio.file.FileSystemException in case of file system error.
     * Use {@link FileUtils#getLocalizedMessage(FileSystemException)} to get a human readable error message.
     */
    @objid ("d94b6811-37da-11e2-8ba4-002564c97630")
    IModuleHandle findModule(String moduleName, String moduleVersion, IModelioProgress monitor) throws IOException, FileSystemException;

    /**
     * Get all module handles available in the cache.
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @return a list of module handles
     * @throws java.io.IOException in case of failure
     * @throws java.nio.file.FileSystemException in case of file system error.
     * Use {@link FileUtils#getLocalizedMessage(FileSystemException)} to get a human readable error message.
     */
    @objid ("b58e7237-452a-11e2-aeb7-002564c97630")
    List<IModuleHandle> findAllModules(IModelioProgress monitor) throws IOException, FileSystemException;

    /**
     * Remove the module from the catalog.
     * @param mh the module to remove.
     * @throws java.io.IOException in case of failure.
     * @throws java.nio.file.FileSystemException in case of file system error.
     * Use {@link FileUtils#getLocalizedMessage(FileSystemException)} to get a human readable error message.
     */
    @objid ("dfca57f0-e642-4c58-9b44-601a44fdefc2")
    void removeModule(IModuleHandle mh) throws IOException, FileSystemException;

}
