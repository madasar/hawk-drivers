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
 * Represents the repository files organization.
 */
@objid ("4d16f7c3-1c4e-11e2-8eb9-001ec947ccaf")
public interface IExmlRepositoryGeometry {
    /**
     * The blobs directory name.
     */
    @objid ("a86b59e2-c0d0-48b7-a17c-8d19f68699d5")
    public static final String BLOBS_DIRNAME = "blobs";

    /**
     * EXML files storage directory name.
     */
    @objid ("d82eb55a-1ceb-11e2-8eb9-001ec947ccaf")
    public static final String MODEL_DIRNAME = "model";

    /**
     * The administration directory name.
     */
    @objid ("d82eb560-1ceb-11e2-8eb9-001ec947ccaf")
    public static final String ADMIN_DIRNAME = "admin";

    /**
     * Index directory name.
     */
    @objid ("9232dfb0-e7e1-4a29-9447-983eed6831d6")
    public static final String INDEX_DIRNAME = ".index";

    /**
     * File extension for EXML files storing references to non versioned nodes.
     */
    @objid ("986ddcd2-12de-11e2-816a-001ec947ccaf")
    public static final String EXT_LOCAL_EXML = ".local.exml";

    /**
     * File extension for EXMl files.
     */
    @objid ("986ddcd8-12de-11e2-816a-001ec947ccaf")
    public static final String EXT_EXML = ".exml";

    /**
     * File extension for blob files.
     */
    @objid ("3d279d3c-14e4-45f7-afd8-c4231443859e")
    public static final String EXT_BLOB = ".blob";

    /**
     * Path of the versions property file relative to the repository directory.
     */
    @objid ("2a5b046d-d7d8-455a-8f78-e734872c8a72")
    public static final String VERSION_PATH = ADMIN_DIRNAME + "/format_version.dat";

    /**
     * Get the file where the given blob should be stored.
     * @param blobKey a Blob key
     * @return the file where the blob is stored.
     */
    @objid ("34f8e2dd-f883-4bb9-b0ce-cc9e243315e0")
    File getBlobFile(String blobKey);

    /**
     * This method returns the externalized file for the element. Can be null for CMS tools which are not able to
     * produce such a file.
     * @param element an element.
     * @return the element file.
     */
    @objid ("d717c48f-1ceb-11e2-8eb9-001ec947ccaf")
    File getExmlFile(final MObject element);

    /**
     * This method returns the externalized file for the element.
     * @param ref the element reference.
     * @return the element file.
     */
    @objid ("d717c494-1ceb-11e2-8eb9-001ec947ccaf")
    File getExmlFile(final MRef ref);

    /**
     * This method returns the externalized file for the local part of an element.
     * @param ref the element reference.
     * @return the element local part file.
     */
    @objid ("a716cdf4-36c7-4ef9-afdd-c837a38ae6a4")
    File getLocalExmlFile(MRef ref);

    /**
     * Get the 'model' directory containing a sub directory per metaclass.
     * @return the model directory.
     */
    @objid ("d717c49f-1ceb-11e2-8eb9-001ec947ccaf")
    File getModelDirectory();

    /**
     * Get the reference of model object represented by the given file.
     * @param file a file
     * @return the object reference
     */
    @objid ("d717c49c-1ceb-11e2-8eb9-001ec947ccaf")
    MRef getObRef(File file);

    /**
     * @param f a file
     * @return <code>true</code> if the file is a model EXML file.
     */
    @objid ("d717c499-1ceb-11e2-8eb9-001ec947ccaf")
    boolean isModelFile(File f);

    /**
     * @param file a file
     * @return <code>true</code> if the file is a blob file.
     */
    @objid ("d5f9eacc-2293-4840-920f-d31c4cdd5309")
    boolean isBlobFile(File file);

    /**
     * Get the blob key stored in the given file.
     * @param file a blob file
     * @return the blob key.
     */
    @objid ("0118f654-b100-4826-8cf9-1f31a06d46c3")
    String getBlobKey(File file);

    /**
     * Get the root directory where blobs are stored.
     * @return the blobs directory.
     */
    @objid ("7e632fcb-5d14-4313-9573-fbe9d8db1358")
    File getBlobsDirectory();

}
