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
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vcore.session.api.blob.IBlobInfo;
import org.modelio.vstore.exml.common.RepositoryVersions;
import org.modelio.vstore.exml.common.model.ObjId;

/**
 * Resource provider for an EXML repository.
 * <p>
 * Allows to define different EXML repository sources as local files,
 * distant URL, ...
 */
@objid ("8b22cfd7-0326-11e2-b5bf-001ec947ccaf")
public interface IExmlResourceProvider {
    /**
     * Build the indexes in a local directory.
     * @param monitor a progress monitor.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("cf2f1764-03e4-11e2-b5bf-001ec947ccaf")
    void buildIndexes(IModelioProgress monitor) throws IOException;

    /**
     * Close the resource provider.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("cf2f176b-03e4-11e2-b5bf-001ec947ccaf")
    void close() throws IOException;

    /**
     * Commit all writes that were done since last commit().
     * @throws java.io.IOException in case of failure.
     */
    @objid ("cf2f176d-03e4-11e2-b5bf-001ec947ccaf")
    void commit() throws IOException;

    /**
     * Create the repository.
     * @throws java.io.IOException in case of failure
     */
    @objid ("cf2f1775-03e4-11e2-b5bf-001ec947ccaf")
    void createRepository() throws IOException;

    /**
     * Delete a blob
     * @param blob a blob identifier
     * @throws java.io.IOException in case of failure
     */
    @objid ("19e4043a-65a4-49aa-9f69-00cf1b8b2ca2")
    void deleteBlob(String blob) throws IOException;

    /**
     * Get all the repository content.
     * @param aMonitor a progress monitor.
     * @return all CMS nodes.
     * @throws java.io.IOException in case of failure
     */
    @objid ("cf2f176f-03e4-11e2-b5bf-001ec947ccaf")
    Collection<ExmlResource> getAllResources(IModelioProgress aMonitor) throws IOException;

    /**
     * Get the path where the EXML indexes will be accessible after having called {@link #buildIndexes(IModelioProgress)}.
     * @return the EXML indexes path.
     */
    @objid ("e710f189-e8e0-489c-9b6b-cdd574ae1a08")
    File getIndexAccessPath();

    /**
     * Get access to the non CMS managed content for a CMS node.
     * <p>
     * Used by EXML repositories in versioned mode.
     * @param cmsNodeId the reference of a CMS node.
     * @return the content
     */
    @objid ("978b5e97-12de-11e2-816a-001ec947ccaf")
    ExmlResource getLocalResource(ObjId cmsNodeId);

    /**
     * Get a short displayable name for this repository.
     * <p>
     * This name should be short enough to be displayed and should
     * reflect the repository content, for example the root element name.
     * An implementation may compute this name or be initialized with it.
     * @return the repository name.
     */
    @objid ("a23e9ba0-1c4a-4354-abdf-b75630a8b4c2")
    String getName();

    /**
     * Get the resource where a {@link RepositoryVersions} can be read/written.
     * @return the repository format versions resource.
     */
    @objid ("e8992ad0-fcab-4e29-8e5a-5a60c06df29f")
    ExmlResource getRepositoryVersionResource();

    /**
     * Get access to the EXML content for a CMS node.
     * @param id the reference of a CMS node.
     * @return the content
     * @throws java.io.IOException in case of failure
     */
    @objid ("cf2f1760-03e4-11e2-b5bf-001ec947ccaf")
    ExmlResource getResource(ObjId id) throws IOException;

    /**
     * Get a stamp that is updated on each {@link #commit()}.
     * <p>
     * To be used to ensure indexes and other local resources are synchronized
     * with the remote storage location.
     * <p>
     * Returns empty string if there is no stamp.
     * @return the repository stamp or empty string.
     * @throws java.io.IOException in case of I/O error preventing from reading the stamp
     */
    @objid ("b19917ea-0859-4803-ace8-b32cd49e97f3")
    String getStamp() throws IOException;

    /**
     * Get the repository location as an URI
     * @return the repository location
     */
    @objid ("cf2f1777-03e4-11e2-b5bf-001ec947ccaf")
    URI getURI();

    /**
     * Tells whether the repository is accessible in read/write mode
     * or only in read only mode.
     * @return <code>true</code> if the repository is read/write, <code>false</code> if it is read only.
     */
    @objid ("5a44d1ec-0724-11e2-9eb7-001ec947ccaf")
    boolean isWriteable();

    /**
     * Read the content of a blob.
     * <p>
     * Returns <code>null</code> if there is no blob with such key.
     * @param key a blob key
     * @return the blob content or <code>null</code>.
     * @throws java.io.IOException in case of I/O error
     */
    @objid ("7b8b05e8-a0dd-445e-854a-59675996c3e9")
    InputStream readBlob(String key) throws IOException;

    /**
     * Read the informations of a blob.
     * <p>
     * Returns <code>null</code> if there is no blob with such key.
     * @param key a blob key
     * @return the blob content or <code>null</code>.
     * @throws java.io.IOException in case of I/O error
     */
    @objid ("8aa80024-ca4d-43f8-87ec-e8e16e9e518a")
    IBlobInfo readBlobInfo(String key) throws IOException;

    /**
     * Write to a blob.
     * @param info the blob info
     * @return a stream to write the blob content to.
     * @throws java.io.IOException in case of copy failure.
     */
    @objid ("c77d483e-f2bd-4c2c-91e2-25ec9b385b8f")
    OutputStream writeBlob(IBlobInfo info) throws IOException;

    /**
     * Recompute the stamp.
     * <p>
     * Should be called by {@link #commit()}.
     * May be called by external code that directly modifies the repository files
     * such as version managers.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("79a4c697-eff7-401b-8e26-74d2a0dbccef")
    void writeStamp() throws IOException;

    /**
     * Represents an EXML node resource.
     */
    @objid ("cf2f175a-03e4-11e2-b5bf-001ec947ccaf")
    public interface ExmlResource {
        /**
         * Open an input stream on the resource.
         * <p>
         * Returns <code>null</code> if the resource does not exist.
         * @return the input stream or <code>null</code> if the resource does not exist.
         * @throws java.io.IOException in case of failure.
         */
        @objid ("cf2f175c-03e4-11e2-b5bf-001ec947ccaf")
        InputStream read() throws IOException;

        /**
         * Open an output stream on the resource.
         * @return an output stream.
         * @throws java.io.IOException in case of failure.
         */
        @objid ("cf2f175e-03e4-11e2-b5bf-001ec947ccaf")
        OutputStream write() throws IOException;

        /**
         * Delete the resource.
         * @throws java.io.IOException in case of failure.
         */
        @objid ("978dc0e1-12de-11e2-816a-001ec947ccaf")
        void delete() throws IOException;

        /**
         * Get the resource URI.
         * <p>
         * Will be used for error reporting.
         * @return the resource URI.
         */
        @objid ("92debe6e-2cd2-11e2-81f1-001ec947ccaf")
        String getPublicLocation();

    }

}
