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
                                    

package org.modelio.vstore.exml.resource;

import java.io.File;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Represents a local filesystem repository directory strcture.
 */
@objid ("9b006f28-1c51-11e2-8eb9-001ec947ccaf")
public class ExmlRepositoryGeometry implements IExmlRepositoryGeometry {
    /**
     * EXML files storage directory path relative to the project space path.
     */
    @objid ("d82c530a-1ceb-11e2-8eb9-001ec947ccaf")
     static final String MODEL_STORAGE_PATH = MODEL_DIRNAME;

    @objid ("d7156224-1ceb-11e2-8eb9-001ec947ccaf")
    protected File repositoryPath;

    /**
     * Initialize the geometry.
     * @param repositoryPath the repository path
     */
    @objid ("d715622b-1ceb-11e2-8eb9-001ec947ccaf")
    public ExmlRepositoryGeometry(File repositoryPath) {
        this.repositoryPath = repositoryPath;
    }

    @objid ("d715623f-1ceb-11e2-8eb9-001ec947ccaf")
    @Override
    public File getExmlFile(final MObject element) {
        return getExmlFile(new MRef(element));
    }

    @objid ("d7156246-1ceb-11e2-8eb9-001ec947ccaf")
    @Override
    public File getExmlFile(final MRef ref) {
        return new File(this.repositoryPath, getPath(ref));
    }

    /**
     * Get the EXML file local path of an element reference relative to the project space.
     * @param ref an element reference.
     * @return the EXML file path relative to the project space directory.
     */
    @objid ("d715624d-1ceb-11e2-8eb9-001ec947ccaf")
    private static String getPath(final MRef ref) {
        return MODEL_STORAGE_PATH+ "/" + ref.mc + "/" + ref.uuid + EXT_EXML;
    }

    /**
     * Get the element reference representing the given file.
     * @param exmlFile an EXML file
     * @return the represented element reference.
     */
    @objid ("d7156254-1ceb-11e2-8eb9-001ec947ccaf")
    @Override
    public MRef getObRef(final File exmlFile) {
        String extName = exmlFile.getName();
        return new MRef(exmlFile.getParentFile().getName(), extName.substring(0, extName.lastIndexOf(EXT_EXML)));
    }

    /**
     * Tells whether a file is an EXML file from its extension.
     * @param file a file
     * @return <code>true</code> if it is an EXML file, else <code>false</code>.
     */
    @objid ("d715625c-1ceb-11e2-8eb9-001ec947ccaf")
    @Override
    public boolean isModelFile(final File file) {
        return (file != null) 
                && (file.getName().endsWith(EXT_EXML)) 
                && (!file.getName().endsWith(EXT_LOCAL_EXML));
    }

    @objid ("d7156264-1ceb-11e2-8eb9-001ec947ccaf")
    @Override
    public File getModelDirectory() {
        return new File(this.repositoryPath, MODEL_DIRNAME);
    }

    @objid ("7bff9c4d-82e4-41a3-968d-45a93f92f686")
    @Override
    public File getLocalExmlFile(MRef ref) {
        return new File(this.repositoryPath, getLocalPath(ref));
    }

    @objid ("44c92fd9-d117-4f51-889b-b137d1ce75f8")
    @Override
    public File getBlobFile(String blobKey) {
        return new File(this.repositoryPath, BlobGeometry.getBlobPath(blobKey));
    }

    /**
     * Get the local part EXML file path of an element reference relative to the project space.
     * @param ref an element reference.
     * @return the EXML file path relative to the project space directory.
     */
    @objid ("f87ea2d2-b268-4024-9cbf-53b0586f311f")
    private static String getLocalPath(final MRef ref) {
        return MODEL_STORAGE_PATH+ "/" + ref.mc + "/" + ref.uuid + EXT_LOCAL_EXML;
    }

    @objid ("c57b0408-6501-43d6-8c5a-3a023e1c8bae")
    @Override
    public String getBlobKey(File file) {
        return BlobGeometry.getBlobKey(file);
    }

    @objid ("c6835d04-e3df-46db-ab6a-cfc4de3cb5ed")
    @Override
    public boolean isBlobFile(File file) {
        return file.getPath().endsWith(EXT_BLOB);
    }

    @objid ("4665b72a-75ae-4c24-8c70-e267de6d0eba")
    @Override
    public File getBlobsDirectory() {
        return new File(this.repositoryPath, BLOBS_DIRNAME);
    }

}
