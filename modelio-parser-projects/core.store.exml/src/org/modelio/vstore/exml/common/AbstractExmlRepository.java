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
                                    

package org.modelio.vstore.exml.common;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystems;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.ecore.resource.Resource;
import org.modelio.vbasic.files.CloseOnFail;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.log.Log;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.NullProgress;
import org.modelio.vbasic.progress.SubProgress;
import org.modelio.vcore.model.DuplicateObjectException;
import org.modelio.vcore.model.MObjectCache;
import org.modelio.vcore.session.api.blob.IBlobInfo;
import org.modelio.vcore.session.api.repository.StorageErrorSupport;
import org.modelio.vcore.session.impl.storage.IModelLoader;
import org.modelio.vcore.session.impl.storage.IModelLoaderProvider;
import org.modelio.vcore.session.impl.storage.StorageException;
import org.modelio.vcore.session.impl.storage.nullz.NullRepository;
import org.modelio.vcore.smkernel.IRStatus;
import org.modelio.vcore.smkernel.IRepositoryObject;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.SmLiveId;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.StatusState;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vstore.exml.common.index.ExmlIndex;
import org.modelio.vstore.exml.common.index.ICmsNodeIndex;
import org.modelio.vstore.exml.common.index.IUserNodeIndex;
import org.modelio.vstore.exml.common.index.IndexOutdatedException;
import org.modelio.vstore.exml.common.model.IllegalReferenceException;
import org.modelio.vstore.exml.common.model.ObjId;
import org.modelio.vstore.exml.common.utils.ExmlUtils;
import org.modelio.vstore.exml.plugin.VStoreExml;
import org.modelio.vstore.exml.resource.FsExmlResourceProvider;
import org.modelio.vstore.exml.resource.IExmlResourceProvider;
import org.modelio.vstore.exml.resource.LocalExmlResourceProvider;

/**
 * Abstract implementation of EXML repository.
 * @author cmarin
 */
@objid ("2df07649-1e87-11e2-90db-001ec947ccaf")
public abstract class AbstractExmlRepository implements IExmlBase {
    @objid ("fd21f5d1-5986-11e1-991a-001ec947ccaf")
    private volatile boolean baseOpen;

    /**
     * Repository ID.
     */
    @objid ("fd1f92a7-5986-11e1-991a-001ec947ccaf")
    private byte rid;

    /**
     * If <code>true</code>, indexes will be rebuilt on next access.
     */
    @objid ("d5c6ab7e-6231-11e1-b31a-001ec947ccaf")
    private boolean needRebuildIndexes;

    /**
     * if <code>false</code>, all model objects are read only.
     */
    @objid ("3e072e6e-1ea1-11e2-90db-001ec947ccaf")
    private Boolean writeable = null;

    /**
     * All in memory CMS nodes storage handlers.
     */
    @objid ("5b37fa8e-9df8-418f-8836-e474731d220f")
    private final Collection<ExmlStorageHandler> storageHandlers = new ArrayList<>();

    /**
     * Caches all loaded model objects.
     */
    @objid ("c3ab3ab1-ef50-486c-9918-cfd601936fbf")
    private MObjectCache loadCache;

    /**
     * Shield against infinite loops.
     */
    @objid ("f10f7749-1d9f-4960-8094-a57a6ae6caaf")
    private UUID lastLoad = null;

    /**
     * EMF adapter.
     */
    @objid ("9e88c0c7-dc71-4ec6-9fd4-46c116dd971e")
    private final EmfResource emfResource;

    /**
     * Indexes.
     */
    @objid ("a2b8893a-ebf4-4646-bff1-15fc4d780863")
    private ExmlIndex indexes;

    /**
     * Support for reporting to GUI.
     */
    @objid ("7eb9a6ee-362d-4d71-b47e-6b7690139fff")
    private final StorageErrorSupport errorSupport = new StorageErrorSupport(this);

    /**
     * EXML resource provider
     */
    @objid ("57ec3f46-98af-4a97-b74b-0cf870fdb837")
    private final IExmlResourceProvider resProvider;

    @objid ("a6f3d45c-1402-4b04-a1b6-3ff87b4d0d68")
    private IModelLoaderProvider modelLoaderProvider;

    /**
     * Remembers removed CMS nodes between 2 saves, with their storage handler
     * before removal.
     */
    @objid ("b5b8d35c-7df4-4793-961f-7226b0f0ddb1")
    private final Map<SmObjectImpl, ExmlStorageHandler> deletedNodes = new HashMap<> ();

    /**
     * Remembers loaded objects detached from the repository between 2 saves.
     */
    @objid ("24943bc8-3a52-4cf1-a3d4-c4357e084521")
    private final Map<UUID, SmObjectImpl> detachedObjects = new HashMap<> ();

//private ReadWri
    /**
     * initialize the EXML repository.
     * <p>
     * The repository needs to be {@link #open( IModelLoaderProvider, IModelioProgress) opened} before being used.
     * @param resProvider an EXML resource provider.
     */
    @objid ("cf20c950-03e4-11e2-b5bf-001ec947ccaf")
    public AbstractExmlRepository(IExmlResourceProvider resProvider) {
        Objects.requireNonNull(resProvider, "resProvider must not be null");
        
        this.resProvider = resProvider;
        this.baseOpen = false;
        this.indexes = null;
        this.loadCache = null;
        this.emfResource = new EmfResource(this);
    }

    /**
     * initialize the EXML repository.
     * <p>
     * The repository needs to be {@link #open(IModelLoaderProvider, IModelioProgress) opened} before being used.
     * @deprecated Use {@link #AbstractExmlRepository(Path, Path)} with a runtime path.
     * @param path the repository path
     * @throws java.io.IOException in case of failure.
     */
    @objid ("fd21f542-5986-11e1-991a-001ec947ccaf")
    @Deprecated
    public AbstractExmlRepository(final Path path) throws IOException {
        this (path, path);
    }

    @objid ("fd21f545-5986-11e1-991a-001ec947ccaf")
    @Override
    protected void finalize() {
        close();
    }

    @objid ("fd24587e-5986-11e1-991a-001ec947ccaf")
    @Override
    public final void addObject(final SmObjectImpl newObject) {
        assertOpen();
        
        if (newObject.getClassOf().isCmsNode()) {
            ExmlStorageHandler newHandler = this.deletedNodes.remove(newObject); 
            if (newHandler == null) {
                newHandler = createStorageHandler(newObject, true);
                newHandler.setDirty(true);
            } else {
                synchronized(this.storageHandlers) {
                    this.storageHandlers.add(newHandler);
                }
            }
            newObject.setRepositoryObject(newHandler);
        } else {
            // For non CMS nodes, the storage handler will be set when the object
            // will be attached to its parent by the parent storage handler.
            // @see ExmlStorageHandler.depValAppended(...)
            newObject.setRepositoryObject(NullRepository.getInstance());
        }
        
        // Add the object to our load cache
        synchronized(this.detachedObjects) {
            getLoadCache().putToCache(newObject);
            this.detachedObjects.remove(newObject.getUuid());
        }
    }

    @objid ("fd1f92bb-5986-11e1-991a-001ec947ccaf")
    @Override
    public synchronized void close() {
        if (!this.baseOpen)
            return;
        
        this.baseOpen = false;
        this.loadCache = null;
        
        if (this.indexes != null) try {
            this.indexes.close();
            this.indexes = null;
        } catch (IOException e) {
            this.getErrorSupport().fireWarning( e);
        }
        
        if (this.resProvider != null) try {
            this.resProvider.close();
        } catch (IOException e) {
            this.getErrorSupport().fireWarning(e);
        }
    }

    @objid ("fd21f54c-5986-11e1-991a-001ec947ccaf")
    @Override
    public final ExmlStorageHandler createStorageHandler(SmObjectImpl cmsNode, final boolean isNodeLoaded) {
        ExmlStorageHandler newHandler = instantiateStorageHandler(cmsNode, isNodeLoaded);
        assert (newHandler != null);
        
        synchronized(this.storageHandlers) {
            this.storageHandlers.add(newHandler);
        }
        return newHandler;
    }

    /**
     * Create an empty repository.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("fd21f562-5986-11e1-991a-001ec947ccaf")
    public void create() throws IOException {
        this.resProvider.createRepository();
        saveRepositoryVersion();
    }

    @objid ("fd21f566-5986-11e1-991a-001ec947ccaf")
    @Override
    public Collection<MObject> findByAtt(SmClass cls, String att, Object val) {
        assertOpen();
        
        Collection<MObject> results = new ArrayList<>();
        try (IModelLoader modelLoader = this.modelLoaderProvider.beginLoadSession()) {
            loadAll(cls, modelLoader, true);
        } catch (IOException e) {
            getErrorSupport().fireError(e);
        } catch (DuplicateObjectException e) {
            getErrorSupport().fireError(e);
        }        
        
        getLoadCache().findByAtt(cls, att, val, results );
        return results;
    }

    @objid ("fd21f5c4-5986-11e1-991a-001ec947ccaf")
    @Override
    public Collection<MObject> findByClass(SmClass cls) {
        assertOpen();
        
        Collection<MObject> results = new ArrayList<>();
        try (IModelLoader modelLoader = this.modelLoaderProvider.beginLoadSession()) {
            loadAll(cls, modelLoader, true);
            getLoadCache().findByClass(cls, results);
        } catch (IOException e) {
            getLoadCache().findByClass(cls, results);
            getErrorSupport().fireError(e);
        } catch (DuplicateObjectException e) {
            getErrorSupport().fireError(e);
        }
        return results;
    }

    @objid ("fd21f5f3-5986-11e1-991a-001ec947ccaf")
    @Override
    public SmObjectImpl findById(SmClass cls, final UUID siteIdentifier) {
        ObjId id  = new ObjId(cls, "", siteIdentifier);
        try (IModelLoader modelLoader = this.modelLoaderProvider.beginLoadSession()) {
            // The search is first done for the metaclass itself
            SmObjectImpl obj = findByObjId(id, modelLoader );
        
            // and then it must be carried out for all the metaclass derived from 'cls'
            if (obj == null) {
                for (SmClass mc : cls.getAllSubClasses()) {
                    obj = findByObjId(new ObjId(mc, "", siteIdentifier), modelLoader );
                    if (obj != null) 
                        return obj;
                }
            }
        
            return obj;
        } catch (DuplicateObjectException e) {
            getErrorSupport().fireError(e);
        } catch (IOException e) {
            getErrorSupport().fireError(e);
        }
        return null;
    }

    /**
     * Find an object from its ID in the repository.
     * @param id an object ID.
     * @param modelLoader the model loader to use to load the model object
     * @return the found model object or <code>null</code>.
     * @throws java.io.IOException in case of I/O error.
     * @throws org.modelio.vcore.model.DuplicateObjectException if another object with the same identifier already exists
     * in another repository.
     */
    @objid ("fd24574c-5986-11e1-991a-001ec947ccaf")
    public SmObjectImpl findByObjId(final ObjId id, IModelLoader modelLoader) throws IOException, DuplicateObjectException {
        assertOpen();
        
        // Return the element if already loaded
        SmObjectImpl object = getLoadedObject(id);
        if (object != null) 
            return object;
        
        // If the object is not stored here, returns null.
        if (! isStored(id))
            return null;
        
        // Creates a stub object
        try {
            return createStubObject(id, modelLoader);
        } catch (DuplicateObjectException e) {
            // The object may have been loaded by a concurrent thread.
            // in this case return the concurrently loaded object.
            object = getLoadedObject(id);
            if (object != null)
                return object;
            else
                throw e;
        }
    }

    @objid ("f4d29ce8-08b1-11e2-b33c-001ec947ccaf")
    @Override
    public final Collection<SmObjectImpl> getAllLoadedObjects() {
        return this.loadCache.asCollection();
    }

    @objid ("eff41b5d-92d7-11e1-be7e-001ec947ccaf")
    @Override
    public Iterable<SmObjectImpl> getAllObjects() {
        throw new UnsupportedOperationException();
    }

    @objid ("fd21f667-5986-11e1-991a-001ec947ccaf")
    @Override
    public final ICmsNodeIndex getCmsNodeIndex() throws IOException {
        return getIndexes().getCmsNodeIndex();
    }

    @objid ("fd26ba19-5986-11e1-991a-001ec947ccaf")
    @Override
    public final synchronized List<ObjId> getCmsNodeUsers(SmObjectImpl cmsNode) throws IOException {
        final Collection<ObjId> usersSet = getUserNodeIndex().getUsers(new ObjId(cmsNode));
        return new ArrayList<>(usersSet);
    }

    @objid ("4b252716-c065-11e1-b511-001ec947ccaf")
    @Override
    public final Resource getEmfResource() {
        return this.emfResource;
    }

    @objid ("0cbbcf94-d66d-11e1-adbb-001ec947ccaf")
    @Override
    public final StorageErrorSupport getErrorSupport() {
        return this.errorSupport;
    }

    @objid ("fd26b9ec-5986-11e1-991a-001ec947ccaf")
    @Override
    public final MObjectCache getLoadCache() {
        return this.loadCache;
    }

    @objid ("fd24588c-5986-11e1-991a-001ec947ccaf")
    @Override
    public final SmObjectImpl getLoadedObject(final ObjId id) {
        assertOpen();
        return getLoadCache().findById(id.classof, id.id);
    }

    @objid ("fd24587b-5986-11e1-991a-001ec947ccaf")
    @Override
    public final byte getRepositoryId() {
        return this.rid;
    }

    /**
     * Get the location of the repository as an URI.
     * @return the location of the repository.
     */
    @objid ("cf258dfd-03e4-11e2-b5bf-001ec947ccaf")
    public final URI getURI() {
        return this.resProvider.getURI();
    }

    /**
     * @return the user/used nodes index.
     * @throws java.io.IOException in case of I/O error
     */
    @objid ("fd26b9ea-5986-11e1-991a-001ec947ccaf")
    public final IUserNodeIndex getUserNodeIndex() throws IOException {
        return getIndexes().getUserNodeIndex();
    }

    @objid ("fd24588f-5986-11e1-991a-001ec947ccaf")
    @SuppressWarnings("hiding")
    @Override
    public void init(final byte rid) {
        this.rid = rid;
    }

    @objid ("4b25271b-c065-11e1-b511-001ec947ccaf")
    @Override
    public final boolean isDirty() {
        return ! getDirtyHandlers().isEmpty();
    }

    @objid ("fd26b9b5-5986-11e1-991a-001ec947ccaf")
    @Override
    public final boolean isOpen() {
        return this.baseOpen;
    }

    @objid ("0d638b02-8fb6-11e1-be7e-001ec947ccaf")
    @Override
    public final boolean isStored(final SmObjectImpl obj) {
        return (SmLiveId.getRid(obj.getLiveId()) == this.rid);
    }

    @objid ("cf9811de-d73c-11e1-adbb-001ec947ccaf")
    @Override
    public boolean isStored(ObjId id) {
        try {
            return getDetachedObject(id)==null && getCmsNodeIndex().isStored(id);
        } catch (IOException e) {
            getErrorSupport().fireError(e);
            return false;
        }
    }

    @objid ("fd26b9b2-5986-11e1-991a-001ec947ccaf")
    @Override
    public SmObjectImpl loadCmsNode(ObjId it, IModelLoader modelLoader) throws IOException, DuplicateObjectException {
        SmObjectImpl obj = findByObjId(it, modelLoader);
        if (obj != null) {
            // Load the node if not moved to another repository and not already loaded.
            final IRepositoryObject repoHandle = obj.getRepositoryObject();
            
            if (repoHandle.getRepositoryId() == getRepositoryId() && ! ((ExmlStorageHandler) repoHandle).isLoaded())
                reloadCmsNode(obj, modelLoader);
        }
        return obj;
    }

    @objid ("0d638b08-8fb6-11e1-be7e-001ec947ccaf")
    @Override
    public final void loadDynamicDep(final SmObjectImpl obj, final SmDependency dep) {
        assertOpen();
        
        if (obj.getRepositoryObject() instanceof ExmlStorageHandler) {
            ExmlStorageHandler h = (ExmlStorageHandler) obj.getRepositoryObject();
            if (h.getRepositoryId() == this.rid) {
                h.loadDep(obj, dep);
                return;
            }
        }
        
        try (IModelLoader modelLoader = this.modelLoaderProvider.beginLoadSession()) {
            for (ObjId it : getUserNodeIndex().getForeignUsers(new ObjId(obj))) {
                loadCmsNode(it, modelLoader);
            }
        } catch (IOException e) {
            getErrorSupport().fireError(e);
        } catch (DuplicateObjectException e) {
            getErrorSupport().fireError(e);
        }
    }

    /**
     * Method to be called by {@link #reloadCmsNode(SmObjectImpl, IModelLoader)} when loading fails with an exception.
     * <p>
     * Fires a warning to repository monitors and set the object as shell.
     * @param obj the CMS node unable to be loaded.
     * @param modelLoader the model loader
     * @param e the exception
     * @throws org.modelio.vcore.model.DuplicateObjectException in case of duplicate objects detected
     */
    @objid ("35511d6c-aa9c-45f7-810b-2136d57156e2")
    protected void loadFailed(SmObjectImpl obj, IModelLoader modelLoader, IOException e) throws DuplicateObjectException {
        if (obj.getData().hasAllStatus(IRStatus.SHELL) != StatusState.TRUE) {
            modelLoader.setRStatus(obj, IRStatus.SHELL, 0, 0);
            if (e != null)
                getErrorSupport().fireWarning(e);
        }
    }

    @objid ("fd245859-5986-11e1-991a-001ec947ccaf")
    @Override
    public final ISmObjectData loadObjectData(SmObjectImpl obj) {
        // Avoid infinite loop
        if (obj.getUuid().equals(this.lastLoad))
            return null;
        this.lastLoad = obj.getUuid();
        
        final ObjId objid = new ObjId(obj.getClassOf(), "", obj.getUuid());
        
        // Load the object
        try (IModelLoader modelLoader = this.modelLoaderProvider.beginLoadSession()) {
        
            // Need to load the element
            if (objid.classof.isCmsNode()) {
                // The element is a CMS node.
                // Return a not yet loaded ref if stored in base, else return null
                if (getCmsNodeIndex().isStored(objid)) {
                    ISmObjectData data = modelLoader.createObjectData(obj);
                    data.setRepositoryObject(createStorageHandler(obj, false));
                    return data;
                } else {
                    return null;
                }
            } else {
                // The element is not a CMS node.
                // Get the CMS node containing the element
                final ObjId parentId = getCmsNodeIndex().getCmsNodeOf(objid);
        
                // If no parent, the element does not exist in the repository
                if (parentId == null)
                    return null;
        
                SmObjectImpl parent = findByObjId(parentId, modelLoader);
        
                if (parent == null)
                    return null;
        
                ISmObjectData data = modelLoader.createObjectData(obj);
                data.setRepositoryObject(parent.getRepositoryObject());
        
                return data;
            }
        
        } catch (IOException e) {
            getErrorSupport().fireError(e);
        } catch (DuplicateObjectException e) {
            getErrorSupport().fireError(e);
        } finally {
            this.lastLoad = null;
        }
        return null;
    }

    @objid ("fd26b996-5986-11e1-991a-001ec947ccaf")
    @Override
    public void open(final IModelLoaderProvider modelLoadProvider, IModelioProgress monitor) throws IOException {
        if (this.baseOpen)
            throw new IllegalStateException("The '"+getURI()+"' repository is already open.");
            
        this.writeable = this.resProvider.isWriteable();
        this.loadCache = new MObjectCache();
        this.modelLoaderProvider = modelLoadProvider;
        
        initializeLoader();
        
        checkVersions();
        
        openIndexes(monitor);
        
        this.baseOpen = true;
    }

    @objid ("fd26b979-5986-11e1-991a-001ec947ccaf")
    @Override
    public final synchronized void removeObject(SmObjectImpl object) {
        synchronized(this.detachedObjects) {
            this.loadCache.removeFromCache(object); 
            this.detachedObjects.put(object.getUuid(), object);
        }
        
        if (object.getClassOf().isCmsNode()) {
            // Record deletion and remove the storage handler
            ExmlStorageHandler handler = (ExmlStorageHandler) object.getRepositoryObject();
            this.deletedNodes.put(object, handler);
            synchronized(this.storageHandlers) {
                this.storageHandlers.remove(handler);
            }
        } else {
            object.setRepositoryObject(NullRepository.getInstance());
        }
    }

    @objid ("fd26b977-5986-11e1-991a-001ec947ccaf")
    @Override
    public synchronized void save(IModelioProgress monitor) {
        // TODO The save should be ACID in order to preserve
        // consistency in case of failure in the middle.
        
        // Contains dirty CMS nodes and deleted ones.
        Collection<ExmlStorageHandler> dirty = getDirtyHandlers();
        
        if (dirty.isEmpty())
            return;
        
        SubProgress mon = SubProgress.convert(monitor, dirty.size()*20);
        try { 
            for (Entry<SmObjectImpl, ExmlStorageHandler> del : this.deletedNodes.entrySet()) {
                // todo: backup file
                deleteCmsNode(del.getKey());
                del.getValue().setDirty(false);
            }
            
            for (ExmlStorageHandler handler : dirty) {
                try {
                    // Do not save not loaded nodes: these are missing references.
                    // Do not save deleted nodes: the file is already deleted.
                    if (handler.isLoaded() && ! this.deletedNodes.containsKey(handler)) {
                        //TODO: backup files in case of future failure
                        save (handler, mon.newChild(10));
                    }
                    
                    handler.setDirty(false);
                } catch (IOException e) {
                    // Report save error and try to continue
                    String message = VStoreExml.getMessage("AbstractExmlRepository.saveNodeFailed",
                            handler.getCmsNode().toString(),
                            FileUtils.getLocalizedMessage(e),
                            this.getResourceProvider().getName());
                    
                    getErrorSupport().fireWarning(new StorageException(this, message, e));
                }
            }
            
            // Commit resources, will also write a stamp
            this.resProvider.commit();
            synchronized (this.detachedObjects) {
                this.deletedNodes.clear();
                this.detachedObjects.clear();
            }
            
        } catch (IOException e) {
            getErrorSupport().fireError(e);
        } finally {
            // todo: rollback already saved files in case of failure
            // if (!success) ....
        }
        
        // Now update the indexes
        mon.setWorkRemaining(100);
        updateIndexes(dirty, mon);
    }

    @objid ("df2704f4-1c43-11e2-8eb9-001ec947ccaf")
    @Override
    public final IModelLoaderProvider getModelLoaderProvider() {
        return this.modelLoaderProvider;
    }

    /**
     * Get the EXML resources provider.
     * @return the resource provider
     */
    @objid ("3e072e77-1ea1-11e2-90db-001ec947ccaf")
    protected final IExmlResourceProvider getResProvider() {
        return this.resProvider;
    }

    /**
     * Get the EXML resources provider.
     * @return the EXML resources provider.
     */
    @objid ("9788fc2f-12de-11e2-816a-001ec947ccaf")
    protected final IExmlResourceProvider getResourceProvider() {
        return this.resProvider;
    }

    @objid ("67b15d88-2e7b-11e2-8aaa-001ec947ccaf")
    protected abstract ILoadHelper getloadHelper();

    /**
     * Instantiate and initialize the EXML file loader.
     * <p>
     * Called by {@link #open(IModelLoaderProvider, IModelioProgress)}
     */
    @objid ("3e072e70-1ea1-11e2-90db-001ec947ccaf")
    protected abstract void initializeLoader();

    /**
     * Instantiate a new storage handler for the given CMS node.
     * <p>
     * May be redefined in sub classes.
     * @param cmsNode a CMS node
     * @param isNodeLoaded <code>true</code> to set the node as loaded, else <code>false</code>.
     * @return the new storage handler.
     */
    @objid ("04cc0016-34a1-11e2-985b-001ec947ccaf")
    protected ExmlStorageHandler instantiateStorageHandler(SmObjectImpl cmsNode, final boolean isNodeLoaded) {
        ExmlStorageHandler newHandler = new ExmlStorageHandler(this, cmsNode, isNodeLoaded);
        return newHandler;
    }

    /**
     * Tells whether the repository is read/write or read only.
     * @return <code>true</code> if the repository is read/write, <code>false</code> if it is read only.
     * @throws java.lang.IllegalStateException if the repository is not open.
     */
    @objid ("3e072e72-1ea1-11e2-90db-001ec947ccaf")
    protected final boolean isWriteable() throws IllegalStateException {
        if (this.writeable == null)
            throw new IllegalStateException("The base is not open");
        return this.writeable;
    }

    @objid ("3e0990c3-1ea1-11e2-90db-001ec947ccaf")
    protected abstract void save(ExmlStorageHandler handler, IModelioProgress progress) throws IOException;

    @objid ("8c5f7cc9-d02b-11e1-bf59-001ec947ccaf")
    private void assertOpen() {
        if (! this.baseOpen)
            throw new IllegalStateException("The '"+getURI()+"' repository is not open.");
    }

    /**
     * Record the CMS node resource as deleted.
     * <p>
     * The default implementation deletes the matching file from the file system
     * by using the resource provider. It may be redefined to have another behavior.
     * @param object the deleted CMS node
     */
    @objid ("65ca282c-34bf-11e2-985b-001ec947ccaf")
    protected void deleteCmsNode(SmObjectImpl object) {
        ObjId id = new ObjId(object);
              
        // Delete the file
        try {
            this.resProvider.getResource(id).delete();
            this.resProvider.getLocalResource(id).delete();
        } catch (IOException e) {
            getErrorSupport().fireWarning(e);
        }
              
        removeFromIndexes(id);
    }

    @objid ("2eae7830-8585-11e1-b4fc-001ec947ccaf")
    private Collection<ExmlStorageHandler> getDirtyHandlers() {
        Collection<ExmlStorageHandler> ret = new ArrayList<>();
        synchronized(this.storageHandlers) {
            for (ExmlStorageHandler handler : this.storageHandlers) {
                if (handler.isDirty()) {
                    ret.add(handler);
                }
            }
        }
        return ret;
    }

    /**
     * Get an access to the EXML indexes.
     * <p>
     * The indexes will be opened on first access.
     * They will be rebuilt if they are missing or damaged.
     * @return the EXML indexes.
     * @throws java.io.IOException if the indexes cannot be opened nor rebuilt.
     */
    @objid ("f7740c12-d023-11e1-bf59-001ec947ccaf")
    private ExmlIndex getIndexes() throws IOException {
        // TODO find a way to get a GUI progress monitor
        return getIndexes(new NullProgress());
    }

    @objid ("fd2458f1-5986-11e1-991a-001ec947ccaf")
    private void loadAll(SmClass cls, IModelLoader modelLoader) throws IOException, DuplicateObjectException {
        for (UUID id : getCmsNodeIndex().getByMClass(cls)) {
            findByObjId(new ObjId(cls, "", id), modelLoader);
        }
    }

    /**
     * Load all the instances of the given metaclass with its sub classes if asked.
     * @param cls a metamodel class
     * @param recursive <code>true</code> to load all sub classes too.
     * @throws java.io.IOException in case of I/O error.
     * @throws org.modelio.vcore.model.DuplicateObjectException when adding to the cache an object with the same identifier as another one.
     */
    @objid ("fd245907-5986-11e1-991a-001ec947ccaf")
    private void loadAll(SmClass cls, IModelLoader modelLoader, final boolean recursive) throws IOException, DuplicateObjectException {
        // Load all sub meta-classes instances
        if (recursive) {
            for (SmClass c : cls.getAllSubClasses()) {
                loadAll(c, modelLoader);
            }
        }
        
        // Load the meta-class instances itself
        loadAll(cls, modelLoader);
    }

    /**
     * Open the indexes and rebuild them if necessary.
     * @param aMonitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call done()
     * on the given monitor. Accepts null, indicating that no progress should be reported and that the operation cannot
     * be cancelled.
     * @return <code>true</code> if the indexes were rebuilt, <code>false</code> if they were
     * up to date or rebuild failed.
     * @throws java.io.IOException if unable to open and unable to recreate indexes.
     */
    @objid ("fd2458ee-5986-11e1-991a-001ec947ccaf")
    private boolean openIndexes(IModelioProgress aMonitor) throws IOException {
        if (this.indexes != null) {
            // Indexes opened before the repository
            this.indexes.close();
        }
        
        // Open indexes and check their format version
        boolean indexesRebuilt = false;
        this.indexes = new ExmlIndex(this.resProvider, getErrorSupport());
        if (this.resProvider.isWriteable()) {
            // If read write the indexes can be rebuilt if needed.
            try {
                this.indexes.open(aMonitor);
        
                this.indexes.checkUptodate();
            } catch (RuntimeException e) {
                setIndexesDamaged(new IOException(e));
            } catch (IndexOutdatedException e) {
                Log.trace(e);
                this.needRebuildIndexes = true;
            }
        } else {
            // R/O repository : open will fail if indexes are bad.
            try {
                this.indexes.open(aMonitor);
        
                this.indexes.checkUptodate();
            } catch (RuntimeException e) {
                String msg = VStoreExml.getMessage("AbstractExmlRepository.RoIndexesDamaged", 
                        this.resProvider.getName(), e.toString());
                throw new IOException(msg, e);
            } catch (IndexOutdatedException e) {
                String msg = VStoreExml.getMessage("AbstractExmlRepository.RoIndexesOutdated", 
                        this.resProvider.getName(), e.getLocalizedMessage());
                throw new IOException(msg, e);
            }
        }
        
        if (this.needRebuildIndexes) {
            // Try deleting index file and rebuild all
            try (CloseOnFail shield = this.indexes.getCloseOnFail()) {
                SubProgress mon = SubProgress.convert(aMonitor, 100);
                
                // Create a new stamp in case there is none
                if (this.resProvider.getStamp().isEmpty())
                    this.resProvider.writeStamp();
                
                mon.subTask( VStoreExml.getMessage("AbstractExmlRepository.mon.deletingIndexes",this.resProvider.getName()));
                this.indexes.deleteIndexes();
                this.indexes.open(mon.newChild(10));
                
                mon.subTask( VStoreExml.getMessage("AbstractExmlRepository.mon.buildingIndexes",this.resProvider.getName()));
                this.indexes.buildIndexes(mon.newChild(90));
                
                shield.success();
                this.needRebuildIndexes = false;
                indexesRebuilt = true;
            } catch (IOException e1) {
                String msg = VStoreExml.getMessage("AbstractExmlRepository.RebuildIndexFailed", this.resProvider.getName(), e1.getLocalizedMessage());
                throw new IOException(msg, e1);
            } 
        }
        return indexesRebuilt;
    }

    @objid ("82cf69c5-5ca7-11e1-863f-001ec947ccaf")
    private void removeFromIndexes(final ObjId id) {
        try {
            //clean parent index
            getCmsNodeIndex().removeObj(id);
            //clean uses index
            getUserNodeIndex().remove(id);
        } catch (IOException e) {
            setIndexesDamaged(e);
        }
    }

    @objid ("d5c6ab7f-6231-11e1-b31a-001ec947ccaf")
    @Override
    public final void setIndexesDamaged(final IOException e) {
        String m1;
        if (e instanceof FileSystemException)
            m1 = FileUtils.getLocalizedMessage((FileSystemException) e);
        else
            m1 = e.getLocalizedMessage();
        
        String reposName = this.resProvider.getName();
        String msg = VStoreExml.getMessage("AbstractExmlRepository.setIndexDamaged",reposName, m1);
        getErrorSupport().fireWarning(new StorageException(this, msg, e));
        
        if (this.indexes != null) try {
            this.indexes.close();
        } catch (IOException e1) {
            msg = VStoreExml.getMessage("AbstractExmlRepository.setIndexDamaged.closeFailed", reposName, FileUtils.getLocalizedMessage(e1));
            getErrorSupport().fireWarning(new StorageException(this, msg, e1));
        }
        
        this.needRebuildIndexes = true;
    }

    /**
     * Update indexes from the modified CMS nodes.
     * @param dirty the dirty CMS nodes.
     * @param progress a progress monitor.
     */
    @objid ("2eae7836-8585-11e1-b4fc-001ec947ccaf")
    private final void updateIndexes(final Collection<ExmlStorageHandler> dirty, IModelioProgress progress) {
        // Avoid spare JDBM file sync that consume time for nothing
        if (dirty.isEmpty())
            return;
        
        try {
            SubProgress mon = SubProgress.convert(progress, dirty.size() + 5);
            ExmlIndex lindexes = getIndexes(mon.newChild(3));
            ObjId cmsNodeId = new ObjId();
        
            for (ExmlStorageHandler handler : dirty) {
                cmsNodeId.init(handler.getCmsNode());
        
                lindexes.updateIndexes(cmsNodeId);
                mon.worked(1);
            }
        
            lindexes.commitDb();
        } catch (IOException e) {
            setIndexesDamaged(e);
        }
    }

    /**
     * Create a not yet loaded object.
     * <p>
     * Throws {@link IOException} if the object does not exist in this repository.
     * @param id the model object identifier
     * @param modelLoader the model loader
     * @return the loaded model object.
     * @throws java.io.IOException in case of failure
     * @throws org.modelio.vcore.model.DuplicateObjectException in case of duplicate identifier
     */
    @objid ("7858e712-485e-11e2-91c9-001ec947ccaf")
    private SmObjectImpl createStubObject(final ObjId id, IModelLoader modelLoader) throws IOException, DuplicateObjectException {
        try {
            // Need to load the element
            if (id.classof.isCmsNode()) {
                // The element is a CMS node.
                // Return a not yet loaded ref.
                return getloadHelper().createStubObject(modelLoader, id, id);
            } else {
                // The element is not a CMS node.
                // Get the CMS node containing the element
                final ObjId parentId = getCmsNodeIndex().getCmsNodeOf(id);
        
                // If no parent, the element does not exist in the repository
                if (parentId == null) {
                    throw new IllegalReferenceException(parentId+" parent of "+id+" not in repository");
                }
        
                return getloadHelper().createStubObject(modelLoader, id, parentId);
            }
        } catch (IllegalReferenceException e) {
            // The index is probably dead
            IOException e2 = new IOException(e.getLocalizedMessage(), e);
            setIndexesDamaged(e2);
            throw e2;
        }
    }

    @objid ("b1d5cf70-147e-4133-98a5-7b61ff991fbd")
    @Override
    public String toString() {
        return "'"+this.resProvider.getName()+"' "+getClass().getSimpleName()+" @ "+this.resProvider.getURI();
    }

    /**
     * Get an access to the EXML indexes.
     * @param monitor a progress monitor used when the indexes need to be rebuilt.
     * @return the EXML indexes.
     * @throws java.io.IOException if the index cannot be open nor rebuilt.
     */
    @objid ("94dcee3b-90ee-45f3-8cf5-5837d95f5bdb")
    public final ExmlIndex getIndexes(IModelioProgress monitor) throws IOException {
        // The method is final to preserve the index lifecycle logic.
        if (this.indexes == null || this.needRebuildIndexes)
            openIndexes(monitor);
        return this.indexes;
    }

    /**
     * Update indexes from the modified CMS nodes.
     * <p>
     * Called by the CMS drivers after having updated the working copy.
     * @param createdRefs created CMS nodes
     * @param updatedRefs modified CMS nodes
     * @param deletedRefs deleted CMS nodes
     * @param progress a progress monitor.
     */
    @objid ("52223d94-8760-4059-8ee3-d11015f0efa0")
    public void updateIndexes(Collection<MRef> createdRefs, Collection<MRef> updatedRefs, Collection<MRef> deletedRefs, IModelioProgress progress) {
        int nbChanges = createdRefs.size() + updatedRefs.size() + deletedRefs.size();
        if (nbChanges == 0)
            return;
        
        int workAmount = 10 + nbChanges;
        SubProgress monitor = SubProgress.convert(progress, workAmount);
        
        try {
            // First update stamp
            this.resProvider.writeStamp();
            
            // Update indexes
            ExmlIndex index = getIndexes(monitor.newChild(10));
        
            monitor.subTask(VStoreExml.getMessage("AbstractExmlRepository.mon.updatingIndexes", this.resProvider.getName() ));
            ObjId nodeId = new ObjId();
        
            for (MRef r : deletedRefs) {
                nodeId.init(r);
                index.removeFromIndexes(nodeId);
                monitor.worked(1);
            }
        
            for (MRef r : createdRefs) {
                nodeId.init(r);
                index.updateIndexes(nodeId);
                monitor.worked(1);
            }
        
            for (MRef r : updatedRefs) {
                nodeId.init(r);
                index.updateIndexes(nodeId);
                monitor.worked(1);
            }
        
            index.commitDb();
        } catch (IOException e) {
            setIndexesDamaged(e);
        }
        
        monitor.done();
    }

    /**
     * initialize the EXML repository.
     * <p>
     * The repository needs to be {@link #open(IModelLoaderProvider, IModelioProgress) opened} before being used.
     * @param path the repository data path.
     * @param runtimePath the repository runtime path. This path contains the EXML indexes.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("fe1fcea0-caa7-4b91-9c9c-fdf35282820a")
    public AbstractExmlRepository(final Path path, final Path runtimePath) throws IOException {
        if (path.getFileSystem().equals(FileSystems.getDefault()))
            this.resProvider = new LocalExmlResourceProvider(path, runtimePath);
        else
            this.resProvider = new FsExmlResourceProvider(path, runtimePath);
        
        this.baseOpen = false;
        this.indexes = null;
        this.loadCache = null;
        this.emfResource = new EmfResource(this);
    }

    @objid ("074ab913-ee11-446f-a674-4c5e34d2b53a")
    @Override
    public final synchronized boolean reloadCmsNode(SmObjectImpl obj, IModelLoader modelLoader) throws DuplicateObjectException {
        final ExmlStorageHandler exmlHandler = (ExmlStorageHandler) obj.getRepositoryObject();
        boolean ret = false;
        
        try {
            exmlHandler.setLoaded(true);
            
            ret = doReloadCmsNode(obj, modelLoader);
        
            exmlHandler.setDirty(false);
        } finally {
            if (! ret)
                exmlHandler.setLoaded(false);
        }
        return ret;
    }

    @objid ("ab2bff3e-06ff-44a6-8ddc-c398ccc51193")
    protected abstract boolean doReloadCmsNode(SmObjectImpl obj, IModelLoader modelLoader) throws DuplicateObjectException;

    @objid ("3ddf055f-63db-4835-a111-630121be34f8")
    @Override
    public InputStream readBlob(String key) throws IOException {
        return this.resProvider.readBlob(key);
    }

    @objid ("6e7fab48-3221-4bbd-ba31-975ff562efcf")
    @Override
    public OutputStream writeBlob(IBlobInfo info) throws IOException {
        return this.resProvider.writeBlob(info);
    }

    @objid ("bb8e45e9-4b2a-4ddd-9433-4535f3b0f1c3")
    @Override
    public void removeBlob(String key) throws IOException {
        this.resProvider.deleteBlob(key);
    }

    @objid ("ca3c36d9-0b41-48f1-8f9b-e14ca3377cce")
    @Override
    public IBlobInfo readBlobInfo(String key) throws IOException {
        return this.resProvider.readBlobInfo(key);
    }

    @objid ("fd24580f-5986-11e1-991a-001ec947ccaf")
    @Override
    public synchronized void unloadCmsNode(ExmlStorageHandler handler) {
        SmObjectImpl cmsNode = handler.getCmsNode();
        
        // Forget the whole EXML node content
        Collection<SmObjectImpl> content = ExmlUtils.getLoadedCmsNodeContent(cmsNode);
        for (SmObjectImpl child : content) {
            this.loadCache.removeFromCache(child);
            this.detachedObjects.remove(child.getUuid());
        }
        this.loadCache.removeFromCache(cmsNode);
        this.detachedObjects.remove(cmsNode.getUuid());
        
        // Forget the handler too
        synchronized(this.storageHandlers) {
            this.storageHandlers.remove(handler);
        }
    }

    @objid ("86f5fcde-17d7-4c6c-ad2a-bda2e27b6572")
    @Override
    public SmObjectImpl getDetachedObject(ObjId id) {
        synchronized(this.detachedObjects) {
            return this.detachedObjects.get(id.id);
        }
    }

    /**
     * Gives access to available maintenance operations on an EXML repository.
     * @return the maintenance operations.
     */
    @objid ("d79ead26-1aa7-453d-ab62-b8462e95022c")
    public IMaintenanceOperations getMaintenance() {
        return new MaintenanceOperations(this);
    }

    @objid ("66a95b14-c2a3-40db-b880-9f468aacbc72")
    private void checkVersions() throws IOException {
        RepositoryVersions repoVersion = getRepositoryVersion();
        
        if (repoVersion == null) {
            if (this.writeable == Boolean.TRUE) {
                // Compute and store repository version
                // This code is to be removed on future versions, this case must not be allowed
                // and the repository must then be migrated.
                Log.trace("No version file for '"+this.getURI()+"' repository. Creating one");
                saveRepositoryVersion();
            } else {
                Log.trace("No version file for read only '"+this.getURI()+"' repository.");
            }
        } else {
            repoVersion.checkCompatible();
        }
    }

    /**
     * Save the repository format versions.
     * @throws java.io.IOException in case of I/O failure
     */
    @objid ("12142941-df53-4a59-958c-4222e7ca32d7")
    protected final void saveRepositoryVersion() throws IOException {
        try (OutputStream out = getResourceProvider().getRepositoryVersionResource().write();) {
            RepositoryVersions v = RepositoryVersions.current();
            Properties props = new Properties();
            v.write(props);
            props.store(out, "Repository version, DO NOT EDIT.");
        }
    }

    /**
     * Get the repository formats versions.
     * <p>
     * May return <i>null</i> if it is an old repository with no format version file.
     * @return the repository versions.
     * @throws java.io.IOException in case of error getting the versions
     */
    @objid ("dd2ae746-400e-4c20-820d-1f59cc8d11b4")
    public final RepositoryVersions getRepositoryVersion() throws IOException {
        Properties props = new Properties();
        try (InputStream inStream = getResourceProvider().getRepositoryVersionResource().read();) {
            if (inStream == null) {
                return null;
            } else {
                props.load(inStream);
                
                return new RepositoryVersions(props);
            }
        } catch (FileNotFoundException| NoSuchFileException e) {
            return null;
        }
    }

}
