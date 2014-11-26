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
                                    

package org.modelio.vstore.exml.common.index;

import java.io.Closeable;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jdbm.RecordManager;
import jdbm.RecordManagerFactory;
import org.modelio.vbasic.files.CloseOnFail;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;
import org.modelio.vcore.session.api.repository.StorageErrorSupport;
import org.modelio.vstore.exml.common.index.builder.IndexBuilder;
import org.modelio.vstore.exml.common.index.builder.InvalidExmlException;
import org.modelio.vstore.exml.common.model.ObjId;
import org.modelio.vstore.exml.plugin.VStoreExml;
import org.modelio.vstore.exml.resource.IExmlResourceProvider.ExmlResource;
import org.modelio.vstore.exml.resource.IExmlResourceProvider;
import org.xml.sax.InputSource;

/**
 * EXML repository index.
 * <p>
 * If the index is located on a remote file system, the index
 * is copied to a temporary directory by the EXML resource provider and will be deleted when
 * closing the repository.
 */
@objid ("04741aa9-d015-11e1-bf59-001ec947ccaf")
public class ExmlIndex {
    @objid ("bbe48531-7e64-11e1-bee3-001ec947ccaf")
    private RecordManager db;

    /**
     * Used by {@link #commitSometimes()} to know how often a JDBM commit must be done.
     */
    @objid ("43dbc27d-3879-11e2-920a-001ec947ccaf")
    private static final int COMMIT_FREQ = 100;

    /**
     * Indexes format version.
     * Increment to force indexes regeneration.
     * <p>
     * History:<ul>
     * <li> 3 : bug fix ?
     * <li> 4, 5, 6 : 20/12/2012 : add indexes by metaclass
     * <li> 7: 03/01/2013 : add name to object index
     * <li> 8: 18/01/2013, 28/01/2013: indexes were not correctly updated on svn update
     * and child lost their parent when the parent index was recomputed.
     * <li> 9: 06/12/2013 : found  & fixed bugs in indexes refresh on Modelio 3.0.1.
     * Force index rebuild to avoid shell objects in the model.
     * </ul>
     */
    @objid ("7dc0cd99-1877-11e2-9dfc-001ec947ccaf")
    private static final int INDEX_FORMAT_VERSION = 9;

    @objid ("40d51080-1878-11e2-9dfc-001ec947ccaf")
    private static final String VERSION_OBJ_NAME = "version_of_index";

    @objid ("5bacbf55-6851-40da-8046-6a7d83ac8779")
    private static final String STAMP_OBJ_NAME = "stamp_of_index";

    /**
     * Used by {@link #commitSometimes()} and reset by {@link #commitDb()}.
     */
    @objid ("43dbc27b-3879-11e2-920a-001ec947ccaf")
    private int commitCounter = 0;

    @objid ("fd1f92a0-5986-11e1-991a-001ec947ccaf")
    private ICmsNodeIndex cmsNodeIndex;

    @objid ("fd1f92a1-5986-11e1-991a-001ec947ccaf")
    private IUserNodeIndex userNodeIndex;

    @objid ("cf3179a9-03e4-11e2-b5bf-001ec947ccaf")
    private IExmlResourceProvider resProvider;

    @objid ("69a9c72a-ddc0-4b47-856b-c589a80a781f")
    private IndexBuilder builder;

    @objid ("c9f929a1-0295-4948-b618-f800ff04c7cf")
    private StorageErrorSupport errSupport;

    /**
     * Instantiate the indexes and open them.
     * @param resProvider the EXML resources provider.
     * @param errSupport error reporter
     */
    @objid ("f778d0bd-d023-11e1-bf59-001ec947ccaf")
    public ExmlIndex(IExmlResourceProvider resProvider, StorageErrorSupport errSupport) {
        this.resProvider = resProvider;
        this.errSupport = errSupport;
    }

    /**
     * Build the indexes from scratch.
     * <p>
     * The index must be empty.
     * @param aMonitor a progress monitor
     * @throws java.io.IOException in case of failure.
     */
    @objid ("d5c90dd1-6231-11e1-b31a-001ec947ccaf")
    public void buildIndexes(IModelioProgress aMonitor) throws IOException {
        SubProgress monitor = SubProgress.convert(aMonitor, "Building indexes", 300);
        boolean problemsFound = false;
        
        Collection<ExmlResource> allResources = this.resProvider.getAllResources(monitor.newChild(100));
        monitor.setWorkRemaining(allResources.size());
        
        for (ExmlResource f : allResources) {
            try (InputStream is = f.read()) {
                InputSource src = new InputSource(is);
                src.setPublicId(f.getPublicLocation());
                this.builder.run(src);
                
                commitSometimes();
                monitor.worked(1);
            } catch (InvalidExmlException e) {
                problemsFound = true;
                this.errSupport.fireWarning(e);
            }
        }
        
        // Update index stamp if no problem found.
        // in the other case the indexes will be rebuilt on next repository opening.
        if (!problemsFound)
            setStoredVersion();
        
        commitDb();
        
        monitor.done();
    }

    /**
     * Close the indexes.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("f778d0d2-d023-11e1-bf59-001ec947ccaf")
    public void close() throws IOException {
        if (this.db != null) {
            this.db.close();
            this.db = null;
            this.cmsNodeIndex = null;
            this.userNodeIndex = null;
            this.builder = null;
        }
    }

    /**
     * Check the indexes are up to date.
     * @throws java.io.IOException in case of read error.
     * @throws org.modelio.vstore.exml.common.index.IndexOutdatedException if the indexes are out of date.
     */
    @objid ("6905f779-4b8b-11e2-91c9-001ec947ccaf")
    public void checkUptodate() throws IndexOutdatedException, IOException {
        try {
            // Check index is here
            if (this.cmsNodeIndex.isEmpty())
                throw new IndexOutdatedException(VStoreExml.getMessage("ExmlIndex.indexMissing", this.resProvider.getName()));
            
            // Check index format
            checkIndexFormat();
            
            // Check index stamp
            if( !(getStoredStamp().equals(this.resProvider.getStamp())))
                throw new IndexOutdatedException(VStoreExml.getMessage("ExmlIndex.indexNotSynchro", 
                        this.resProvider.getName(),
                        getStoredStamp(),
                        this.resProvider.getStamp()));
        } catch (IOError e) {
            throw (IOException) e.getCause();
        }
    }

    /**
     * Commit pending changes now, and reset internal counter.
     * @throws java.io.IOException in case of JDBM failure.
     */
    @objid ("43dbc287-3879-11e2-920a-001ec947ccaf")
    public void commitDb() throws IOException {
        setStamp();
        
        this.db.commit();
        this.commitCounter = 0;
    }

    /**
     * Close and delete completely the indexes.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("cf3179b2-03e4-11e2-b5bf-001ec947ccaf")
    public void deleteIndexes() throws IOException {
        if (this.db != null) {
            close();
        }
        FileUtils.delete(this.resProvider.getIndexAccessPath());
    }

    /**
     * Get a <i>try-with-resource</i> shield that closes the index on close() unless success() has been called.
     * <p>
     * To be used to close the index when an operation on the resource fails with an exception.
     * @return a shield that close indexes on error.
     */
    @objid ("39c250ba-1b58-4ff9-91a7-ab79ce48ce2b")
    @SuppressWarnings("resource")
    public CloseOnFail getCloseOnFail() {
        return new CloseOnFail(new Closeable() {
            @Override
            public void close() throws IOException {
                ExmlIndex.this.close();
            }
        });
    }

    /**
     * @return the CMS node composition index.
     */
    @objid ("f778d0c6-d023-11e1-bf59-001ec947ccaf")
    public ICmsNodeIndex getCmsNodeIndex() {
        return this.cmsNodeIndex;
    }

    /**
     * @return the user/used index
     */
    @objid ("f778d0ca-d023-11e1-bf59-001ec947ccaf")
    public IUserNodeIndex getUserNodeIndex() {
        return this.userNodeIndex;
    }

    /**
     * Open the indexes and rebuild them if necessary.
     * @param aMonitor a progress monitor to report index building and opening.
     * @throws java.io.IOException if unable to open and unable to recreate indexes.
     */
    @objid ("f778d0ce-d023-11e1-bf59-001ec947ccaf")
    public void open(IModelioProgress aMonitor) throws IOException {
        if (this.db != null)
            throw new IllegalStateException("Indexes are already open.");
        
        this.resProvider.buildIndexes(aMonitor);
        
        this.db = RecordManagerFactory.createRecordManager(this.resProvider.getIndexAccessPath()+"/index");
        
        try (CloseOnFail shield = getCloseOnFail()) {
            this.cmsNodeIndex = new org.modelio.vstore.exml.common.index.jdbm.CmsNodeIndex(this.db);
            this.userNodeIndex = new org.modelio.vstore.exml.common.index.jdbm.UserNodeIndex(this.db);
            this.builder = new IndexBuilder(getCmsNodeIndex(), getUserNodeIndex());
        
            shield.success();
        }
    }

    /**
     * Remove an object from all indexes.
     * @param id the identifier to remove
     * @throws java.io.IOException in case of I/O failure.
     */
    @objid ("f778d0c2-d023-11e1-bf59-001ec947ccaf")
    public void removeFromIndexes(final ObjId id) throws IOException {
        //clean parent index
        getCmsNodeIndex().removeObj(id);
        //clean uses index
        getUserNodeIndex().remove(id);
        
        commitSometimes();
    }

    /**
     * Update the indexes for the given CMS node.
     * @param cmsNodeId a CMS node identifier
     * @throws java.io.IOException if the indexes cannot be modified.
     */
    @objid ("fbb237ba-1e83-11e2-90db-001ec947ccaf")
    public void updateIndexes(ObjId cmsNodeId) throws IOException {
        //Clean the indexes from all references of the given CMS node and all its content.
        getCmsNodeIndex().removeObj(cmsNodeId);
        getUserNodeIndex().remove(cmsNodeId);
              
        // Update indexes
        ExmlResource resource = this.resProvider.getResource(cmsNodeId);
        try (InputStream is = resource.read()) {
            if (is != null) {
                InputSource src = new InputSource(is);
                src.setPublicId(resource.getPublicLocation());
                this.builder.run(src);
            }
        } catch (InvalidExmlException e) {
            this.errSupport.fireWarning(e);
        }
        
        commitSometimes();
    }

    @objid ("7dc0cd93-1877-11e2-9dfc-001ec947ccaf")
    private void checkIndexFormat() throws IndexOutdatedException, IOException {
        int storedVersion = getStoredVersion();
        if ( INDEX_FORMAT_VERSION > storedVersion)
            throw new IndexOutdatedException(VStoreExml.getMessage("ExmlIndex.indexFormatOld", 
                    this.resProvider.getName(),
                    storedVersion,
                    INDEX_FORMAT_VERSION));
        else if ( INDEX_FORMAT_VERSION < storedVersion)
            throw new IndexOutdatedException(VStoreExml.getMessage("ExmlIndex.indexFormatNew", 
                    this.resProvider.getName(),
                    storedVersion,
                    INDEX_FORMAT_VERSION));
    }

    /**
     * Commit JDBM pending changes once a time to free memory while keeping
     * hard disk load charge low.
     * @throws java.io.IOException in case of JDBM failure.
     */
    @objid ("43dbc280-3879-11e2-920a-001ec947ccaf")
    private void commitSometimes() throws IOException {
        if (++this.commitCounter >= COMMIT_FREQ) {
            this.db.commit();
            this.commitCounter = 0;
        }
    }

    /**
     * Read the index format version.
     * @return the index format version
     * @throws java.io.IOException in case of I/O failure
     */
    @objid ("7dc0cd9c-1877-11e2-9dfc-001ec947ccaf")
    private int getStoredVersion() throws IOException {
        long id = this.db.getNamedObject(VERSION_OBJ_NAME);
        if (id == 0)
            return 0;
        else
            return (Integer) this.db.fetch(id);
    }

    @objid ("b878a549-e62a-472d-a363-745026388a29")
    private void setStamp() throws IOException {
        String stamp = this.resProvider.getStamp();
        long id = this.db.getNamedObject(STAMP_OBJ_NAME);
        if (id != 0)
            this.db.update(id, stamp);
        else
            this.db.setNamedObject(STAMP_OBJ_NAME, this.db.insert(stamp));
        
        this.db.commit();
    }

    /**
     * Read the index stamp.
     * @return the index stamp.
     * @throws java.io.IOException in case of I/O failure
     */
    @objid ("964bbe53-b4c1-4b2e-94f5-c478909b5928")
    private String getStoredStamp() throws IOException {
        long id = this.db.getNamedObject(STAMP_OBJ_NAME);
        if (id == 0)
            return "";
        else
            return (String) this.db.fetch(id);
    }

    /**
     * Save the index format version.
     * @throws java.io.IOException in case of I/O failure.
     */
    @objid ("7dc0cda0-1877-11e2-9dfc-001ec947ccaf")
    private void setStoredVersion() throws IOException {
        long id = this.db.getNamedObject(VERSION_OBJ_NAME);
        if (id != 0)
            this.db.update(id, INDEX_FORMAT_VERSION);
        else
            this.db.setNamedObject(VERSION_OBJ_NAME, this.db.insert(INDEX_FORMAT_VERSION));
    }

    /**
     * Defragments the index, so it consumes less space. This commits any uncommitted data.
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call done()
     * on the given monitor. Accepts null, indicating that no progress should be reported and that the operation cannot
     * be cancelled.
     * @throws java.io.IOException in case of failure
     */
    @objid ("3fa2dfbe-6770-41c1-be4c-6955841eefb9")
    public void compress(IModelioProgress monitor) throws IOException {
        this.db.defrag();
    }

}
