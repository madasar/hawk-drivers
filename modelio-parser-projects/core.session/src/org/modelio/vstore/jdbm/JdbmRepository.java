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
                                    

package org.modelio.vstore.jdbm;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jdbm.PrimaryHashMap;
import jdbm.RecordManager;
import jdbm.RecordManagerFactory;
import jdbm.RecordManagerOptions;
import jdbm.SerializerInput;
import jdbm.SerializerOutput;
import org.modelio.vbasic.collections.CompoundCollection;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;
import org.modelio.vcore.model.DuplicateObjectException;
import org.modelio.vcore.model.MObjectCache;
import org.modelio.vcore.session.api.blob.IBlobInfo;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.api.repository.StorageErrorSupport;
import org.modelio.vcore.session.impl.storage.IModelLoader;
import org.modelio.vcore.session.impl.storage.IModelLoaderProvider;
import org.modelio.vcore.session.plugin.VCoreSession;
import org.modelio.vcore.smkernel.IRStatus;
import org.modelio.vcore.smkernel.IRepositoryObject;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.SmObjectData;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.StatusState;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vstore.jdbm.index.JdbmIndex;
import org.modelio.vstore.jdbm.index.UuidSerializer;

/**
 * Repository where everything is saved in a JDBM base.
 * <p>
 * Blobs are not supported (at least for the moment) in this repository.
 */
@objid ("b272c124-c1fc-4346-b645-3d1b8870906c")
public class JdbmRepository implements IRepository {
    /**
     * Repository format version.
     * <p>
     * History:<ul>
     * <li> 1 & 2 : first formats
     * <li> 3 : 22/08/2013 : don't use StoreReference in indexes, directly store the collection
     * <li> 4 : 11/09/2013 : version 3 failed saving silently.
     * change version to force computing namespace uses again.
     * </ul>
     */
    @objid ("38221ad8-3d31-416c-8d84-549ee5336cdc")
    public static final int FORMAT_VERSION = 4;

    /**
     * JDBM object name storing the format version
     */
    @objid ("b6a02dfe-c172-4e10-9545-c29de46dd051")
    private static final String FORMAT_VERSION_KEY = "FORMAT_VERSION";

    @objid ("752cdbd4-6579-4306-b37a-4cd286aeb1bc")
    private boolean baseOpen;

    @objid ("b3294c35-45ee-4488-bbb0-cc0074f6785b")
    private RecordManager db;

    @objid ("903136db-c15a-4eda-8a06-404e8ba9e9ef")
    private PrimaryHashMap<UUID,byte[]> dbContent;

    /**
     * A user friendly repository name.
     */
    @objid ("b74e4073-f16f-4a86-a3e1-112824c24453")
    private String name;

    @objid ("9d39a814-5115-49a6-9fb0-cb734d957175")
    private byte rid = -1;

    @objid ("cf8ad6f5-b5ee-4793-a668-5f60185e621a")
    private BlobsRepository blobsRepository;

    @objid ("8f6d15c7-9df8-415f-8910-7129437d5085")
    private final ReadWriteLock dbLock;

    @objid ("27ec32c9-de7b-4c9f-b5b3-a58fb77c9565")
    private Collection<SmObjectImpl> dirty;

    @objid ("9bde9f15-59c2-4f08-a3d1-a3feab892ca7")
    private final Object dirtyLock;

    @objid ("ef3a6d56-de05-4a55-9b69-dea88882558f")
    private JdbmEmfResource emfRes;

    @objid ("741c9a29-de8a-4bff-b74c-ab4f21616803")
    private final StorageErrorSupport errSupport;

    @objid ("35f00441-d4a1-4014-b1a0-17e4b5916d99")
    private JdbmStorageHandler handler;

    @objid ("0b34c59f-faba-4859-b47c-119930d5b453")
    private JdbmIndex index;

    @objid ("5a4a6d6b-03dc-4c92-a9ae-0dfa44793436")
    private MObjectCache loadCache;

    @objid ("2855a7dc-bf0d-400e-a6f3-2e1cbef58e1e")
    private ILoadHelper loadHelper;

    @objid ("0c33679e-d4d4-4e49-b31c-998d09675bd4")
    private IModelLoaderProvider modelLoaderProvider;

    @objid ("6e640b7d-d64c-4516-ae64-6440688cfeaa")
    private File repositoryPath;

    @objid ("ea121fad-3f1e-43ca-a8de-6b9a06264d36")
    private SmObjectDataSerializer serializer;

    /**
     * Initialize the repository.
     * @param repositoryPath the repository directory.
     */
    @objid ("d4d947ae-788f-48ce-a107-811e3932a350")
    public JdbmRepository(File repositoryPath) {
        this.emfRes = new JdbmEmfResource(this);
        this.errSupport = new StorageErrorSupport(this);
        this.repositoryPath = repositoryPath;
        this.dirtyLock = new Object();
        this.dbLock = new ReentrantReadWriteLock();
    }

    @objid ("c9f38d40-2a4b-4830-b089-763a6b1a3c05")
    @Override
    public void addObject(SmObjectImpl newObject) {
        this.handler.attach(newObject);
    }

    @objid ("912c712d-1e74-497e-ae0a-ed3c11f2c9ad")
    @Override
    public void close() {
        if (this.db != null) try {
            this.db.close();
        } catch (IllegalStateException e) {
            //  java.lang.IllegalStateException: RecordManager has been closed
            // ignore
        } catch (IOException e) {
            getErrorSupport().fireWarning(e);
        }
        
        this.db = null;
        this.baseOpen = false;
    }

    @objid ("3480752c-8aa6-434c-a912-8c5998677439")
    @Override
    public Collection<MObject> findByAtt(SmClass cls, String att, Object val) {
        assertOpen();
        
        Collection<MObject> results = new ArrayList<>();
        try (IModelLoader modelLoader = this.modelLoaderProvider.beginLoadSession()){
            findAll(cls, modelLoader, true);
        } catch (DuplicateObjectException e) {
            getErrorSupport().fireError(e);
        } catch (IOError e) {
            getErrorSupport().fireWarning(e);
        } catch (InternalError e) {
            getErrorSupport().fireWarning(e);
        }
        
        getLoadCache().findByAtt(cls, att, val, results );
        return results;
    }

    @objid ("fd4f0c53-2ef2-4d7d-9469-21d688d25426")
    @Override
    public Collection<MObject> findByClass(SmClass cls) {
        assertOpen();
        @SuppressWarnings("unchecked")
        Collection<MObject> ret = (Collection<MObject>) findAllLazy(cls, true);
        return ret;
        /*
        Collection<MObject> results = new ArrayList<>();
        try (IModelLoader modelLoader = this.modelLoaderProvider.beginLoadSession()){
            findAll(cls, modelLoader, true);
            getLoadCache().findByClass(cls, results);
        } catch (DuplicateObjectException e) {
            getErrorSupport().fireError(e);
        }
        return results;
         */
    }

    @objid ("31a6a88a-108c-40b5-afc4-d549e7f6496c")
    @Override
    public SmObjectImpl findById(SmClass cls, UUID siteIdentifier) {
        SmObjectImpl ret = getLoadedObject(cls, siteIdentifier);
        
        if (ret == null && isStored(siteIdentifier)) {
            try (IModelLoader modelLoader = this.modelLoaderProvider.beginLoadSession()) {
                return createStubObject(cls, siteIdentifier, modelLoader);
        
            } catch (DuplicateObjectException e) {
                getErrorSupport().fireError(e);
            }
        }
        return null;
    }

    @objid ("09998e19-b03d-4ccd-b0d9-6202c2204da4")
    @Override
    public Collection<SmObjectImpl> getAllLoadedObjects() {
        return this.loadCache.asCollection();
    }

    @objid ("e842f291-37d8-4832-8010-15a1ce6f22c0")
    @Override
    public Iterable<SmObjectImpl> getAllObjects() {
        SmClass cls = SmClass.getClass(MObject.class);
        @SuppressWarnings("unchecked")
        final Iterable<SmObjectImpl> ret = (Iterable<SmObjectImpl>) findAllLazy(cls, true);
        return ret;
        
        /*
         Collection<SmObjectImpl> results = new ArrayList<>(1000);
         try (IModelLoader modelLoader = this.modelLoaderProvider.beginLoadSession()){
            findAll(cls, modelLoader, true);
            getLoadCache().findByClass(cls, results);
        } catch (DuplicateObjectException e) {
            getLoadCache().findByClass(cls, results);
            getErrorSupport().fireError(e);
        }
        return results;*/
    }

    @objid ("ef23d776-4612-44f1-af57-afcef2b4f802")
    @Override
    public StorageErrorSupport getErrorSupport() {
        return this.errSupport;
    }

    /**
     * Get the repository name.
     * <p>
     * The repository name is intended to be displayed to the user.
     * @return the repository name.
     */
    @objid ("967b98e7-177f-439e-b16b-249768b1c61b")
    public String getName() {
        return this.name;
    }

    @objid ("86f99c6e-db21-433a-9d94-028fd3a05c81")
    @Override
    public byte getRepositoryId() {
        return this.rid;
    }

    @objid ("94b3f6e9-2345-4d97-a3f9-0828b70afee1")
    @Override
    public void init(byte arid) {
        this.rid = arid;
    }

    @objid ("4fd5a0ec-3a82-4973-915d-009cf991eb13")
    @Override
    public boolean isDirty() {
        synchronized(this.dirtyLock) {
            return ! this.dirty.isEmpty();
        }
    }

    @objid ("2dee4288-dd83-4d61-99a3-8e5940ae0cd6")
    @Override
    public boolean isOpen() {
        return this.baseOpen;
    }

    @objid ("8882e8dd-f2fd-4cb9-b78e-360dea41152a")
    @Override
    public boolean isStored(SmObjectImpl val) {
        assertOpen();
        return isStored(val.getUuid());
    }

    @objid ("85165e38-e3ab-4c7e-8b2e-874ea364e3bf")
    @Override
    public void loadDynamicDep(SmObjectImpl obj, SmDependency dep) {
        if (! isloadEnabled())
            return;
        
        // If the object to load is in this repository an the dependency persistent,
        // just load the object and return.
        IRepositoryObject objHandler = obj.getRepositoryObject();
        if (objHandler==this.handler && objHandler.isPersistent(dep)) {
            objHandler.loadDep(obj, dep);
            return;
        }
        
        this.dbLock.readLock().lock();
        try (IModelLoader modelLoader = this.modelLoaderProvider.beginLoadSession()) {
            final Collection<MRef> userRefs = this.index.getUserRefs(new MRef(obj));
        
            for (MRef ref :userRefs) {
                SmObjectImpl user = (SmObjectImpl) getLoadCache().findByRef(ref);
                if (user == null) try {
                    user = createStubObject(SmClass.getClass(ref.mc), ref.uuid, modelLoader);
                } catch (DuplicateObjectException e) {
                    // The object may have been loaded by a concurrent thread.
                    // in this case return the concurrently loaded object.
                    user = (SmObjectImpl) getLoadCache().findByRef(ref);
                    if (user == null)
                        throw e;
                }
        
                if (! user.getRepositoryObject().isAttLoaded(user, null))
                    loadObj(user, modelLoader);
            }
        } catch (IOError e) {
            getErrorSupport().fireWarning(e);
        } catch (InternalError e) {
            getErrorSupport().fireWarning(e);
        } catch (IOException e) {
            getErrorSupport().fireWarning(e);
        } catch (DuplicateObjectException e) {
            getErrorSupport().fireWarning(e);
        } finally {
            this.dbLock.readLock().unlock();
        }
    }

    @objid ("917875d1-2875-438a-a354-15d21a544fc0")
    @Override
    public ISmObjectData loadObjectData(SmObjectImpl obj) {
        this.dbLock.readLock().lock();
        try {
        
            if (! isStored(obj))
                return null;
        
            SmObjectData data = (SmObjectData) obj.getClassOf().getObjectFactory().createData();
            obj.initData(data);
        
            loadObj(obj);
            return data;
        } finally {
            this.dbLock.readLock().unlock();
        }
    }

    @objid ("4fdcca0e-121b-4956-94e9-8fc362d446a7")
    @Override
    public void open(IModelLoaderProvider modelLoader, IModelioProgress monitor) throws IOException {
        this.modelLoaderProvider = modelLoader;
        this.dirty = new HashSet<>();
        this.handler = new JdbmStorageHandler(this);
        this.loadCache = new MObjectCache();
        this.blobsRepository = new BlobsRepository(this.repositoryPath.toPath().resolve("blobs"));
        
        if (this.name == null|| this.name.isEmpty())
            this.name = this.repositoryPath.getName();
        
        Properties props = new Properties();
        props.setProperty(RecordManagerOptions.DISABLE_TRANSACTIONS, "false");
        props.setProperty(RecordManagerOptions.CACHE_TYPE, "soft");
        props.setProperty(RecordManagerOptions.CACHE_SIZE, "30000");
        
        Files.createDirectories(this.repositoryPath.toPath());
        Files.createDirectories(this.repositoryPath.toPath().resolve("blobs"));
        
        File dbPath = new File(this.repositoryPath, this.repositoryPath.getName());
        try {
            this.db = RecordManagerFactory.createRecordManager(dbPath.getAbsolutePath(), props );
        
            handleFormatVersion();
        
            this.index = new JdbmIndex(this.db);
            this.loadHelper = new LoadHelper();
            this.serializer = new SmObjectDataSerializer(this.rid, this.loadHelper);
            this.dbContent = this.db.hashMap("main", UuidSerializer.instance, null);
            this.baseOpen = true;
        } catch (IOError e) {
            throw new IOException(e);
        }
    }

    @objid ("e17631e5-69a5-4020-8fcf-728743fdc38d")
    @Override
    public InputStream readBlob(String key) throws IOException {
        return this.blobsRepository.readBlob(key);
    }

    @objid ("b647a673-847b-4d03-88f1-522ec89bc25c")
    @Override
    public IBlobInfo readBlobInfo(String key) throws IOException {
        return this.blobsRepository.readBlobInfo(key);
    }

    @objid ("e2c23e09-e769-4b9e-96ca-a77b4d9355e3")
    @Override
    public void removeBlob(String key) throws IOException {
        this.blobsRepository.removeBlob(key);
    }

    @objid ("26322a98-ecb6-4738-b1f7-dc6ba1f87729")
    @Override
    public void save(IModelioProgress monitor) throws IOException {
        Collection<SmObjectImpl> toSave = null;
        
        try {
            // initialize serializers
            ByteArrayOutputStream os = new ByteArrayOutputStream(200);
            @SuppressWarnings("resource")
            SerializerOutput dos = new SerializerOutput(os);
        
            writeFormatVersion();
        
            // Get and clean dirty elements list.
            synchronized (this.dirtyLock)
            {
                toSave = this.dirty;
                this.dirty = new HashSet<>();
            }
        
            int nbDirty = toSave.size();
            SubProgress mon = SubProgress.convert(monitor, nbDirty+70);
            int i = 0;
            for (SmObjectImpl obj : toSave) {
                MRef objRef = new MRef(obj);
                this.dbLock.writeLock().lock();
                try {
                    if (obj.isDeleted() || obj.getRepositoryObject() != this.handler) {  
                        this.index.removeObj(objRef);
                        this.index.removeCrossRefs(objRef);
                        this.dbContent.remove(obj.getUuid());
                        this.loadCache.removeFromCache(obj);
                    } else {
                        os.reset();
                        dos.__resetWrittenCounter();
        
                        this.serializer.serialize(dos, (SmObjectData) obj.getData());
        
                        byte[] old = this.dbContent.put(obj.getUuid(), os.toByteArray());
        
                        // Add to main index if needed
                        if (old == null)
                            this.index.addToMain(obj);
                        else
                            this.index.removeCrossRefs(objRef);
        
                        // Update cross reference indexes
                        this.index.addCrossRefs(obj);
                    }
        
                } finally {
                    this.dbLock.writeLock().unlock();
                }
        
                mon.worked(1);
                ++i;
                if (i % 20 == 0) {
                    mon.subTask(VCoreSession.getMessage("JdbmRepository.save", getName(), i, nbDirty));
                } else if (i % 9011 == 0) {
                    // Save too large for one transaction
                    mon.subTask(VCoreSession.getMessage("JdbmRepository.save", getName(), i, nbDirty) + VCoreSession.getMessage("JdbmRepository.save.commit", getName()));
                    this.db.commit();
                }
            }
        
            mon.subTask(VCoreSession.getMessage("JdbmRepository.save.commit", getName()));
            this.db.clearCache();
            mon.worked(30);
            this.db.commit();
            mon.worked(30);
        
            mon.subTask(VCoreSession.getMessage("JdbmRepository.save.done", getName()));
            for (SmObjectImpl obj : toSave)
                obj.setRStatus(IRStatus.REPO_LOADED, IRStatus.REPO_DIRTY, 0);
        
            mon.worked(10);
            mon.subTask("");
        
            toSave = null;
        } catch (IOError e) {
            getErrorSupport().fireWarning(e);
        } catch (InternalError e) {
            getErrorSupport().fireWarning(e);
        } catch (RuntimeException e) {
            getErrorSupport().fireWarning(e);
        } finally {
            if (toSave != null) {
                // Save failed, add back elements to the dirty list. 
                synchronized (this.dirtyLock) {
                    this.dirty.addAll(toSave);
                }
            }
        }
    }

    /**
     * Set the repository name.
     * <p>
     * The repository name is intended to be displayed to the user.
     * @param name the repository name.
     */
    @objid ("a651e65c-899a-4572-8fdd-07432ec8c44d")
    public void setName(String name) {
        this.name = name;
    }

    @objid ("10f2b8ab-43a9-423f-8777-5749688cb5f0")
    @Override
    public OutputStream writeBlob(IBlobInfo info) throws IOException {
        return this.blobsRepository.writeBlob(info);
    }

    @objid ("964b3c71-d082-4b68-9635-933175859963")
    void addDirty(SmObjectImpl obj) {
        synchronized (this.dirtyLock) {
            this.dirty.add(obj);
        }
    }

    @objid ("a8430ea0-8fc5-4487-8ee8-517e5fea74c7")
    SmObjectImpl createStubObject(SmClass classof, UUID uuid, IModelLoader modelLoader) throws DuplicateObjectException {
        SmObjectImpl real = modelLoader.createLoadedObject(classof, uuid);
        real.setRepositoryObject(this.handler);
        modelLoader.setRStatus(real, 0, IRStatus.MASK_CMS | IRStatus.MASK_REPO, 0);
        getLoadCache().addToCache(real);
        return real;
    }

    /**
     * Get the EMF mapping.
     * @return the EMF mapping.
     */
    @objid ("202c1e20-fca4-4720-bbcc-32b0f909a5f2")
    JdbmEmfResource getEmfResource() {
        return this.emfRes;
    }

    @objid ("0e708cc4-d02e-4b94-9f45-df169f309d45")
    final MObjectCache getLoadCache() {
        return this.loadCache;
    }

    @objid ("42a7bbe4-aa2b-4301-b898-1742e4fed971")
    final SmObjectImpl getLoadedObject(MClass cls, UUID id) {
        return getLoadCache().findById(cls, id);
    }

    /**
     * Tells whether the identifier is one of the stored objects.
     * @param uuid the object identifier.
     * @return true if stored else false.
     */
    @objid ("b4139f96-f05f-4a7b-a111-2a7eec0500b4")
    boolean isStored(UUID uuid) {
        try {
            return this.dbContent.containsKey(uuid);
        } catch (IOError e) {
            getErrorSupport().fireError(e);
        } catch (InternalError e) {
            getErrorSupport().fireError(e);
        }
        return false;
    }

    @objid ("fe08e50f-5e07-40ad-b13b-26f164569c04")
    boolean isloadEnabled() {
        return this.baseOpen;
    }

    @objid ("e1ad96c6-90ad-47c2-b221-c535e5b6f57e")
    void loadObj(SmObjectImpl obj) {
        if (!isloadEnabled())
            return;
        
        try (IModelLoader modelLoader = this.modelLoaderProvider.beginLoadSession()) {
            loadObj(obj, modelLoader);
        } catch (DuplicateObjectException e) {
            getErrorSupport().fireError(e);
        } catch (IOException e) {
            getErrorSupport().fireWarning(e);
        } catch (IOError e) {
            getErrorSupport().fireWarning(e);
        } catch (InternalError e) {
            getErrorSupport().fireWarning(e);
        }
    }

    /**
     * Remove the object from the repository.
     * @param obj the object to remove.
     */
    @objid ("db0a3e6a-612b-41ca-a405-de1e02871e25")
    void removeObj(SmObjectImpl obj) {
        addDirty(obj);
        //getLoadCache().removeFromCache(obj); : keep the object in the load cache because it is referenced in indexes
    }

    /**
     * Unload a model object.
     * @param obj a model object to forget.
     */
    @objid ("c77433b1-c3c1-47b1-a861-ef8cdc86f0f8")
    void unloadObject(SmObjectImpl obj) {
        obj.getData().setRFlags(IRStatus.MASK_REPO, StatusState.FALSE);
        getLoadCache().removeFromCache(obj);
        
        synchronized (this.dirtyLock) {
            this.dirty.remove(obj);
        }
    }

    @objid ("0f8c230f-e216-4af8-bbdd-c56ab1cee0a2")
    private void assertOpen() {
        if (! this.baseOpen)
            throw new IllegalStateException("The '"+this.repositoryPath+"' repository is not open.");
    }

    /**
     * Find all instances of the given metaclass with its sub classes if asked.
     * <p>
     * The model objects are not loaded, only stubs are instantiated.
     * @param cls a metamodel class
     * @param recursive <code>true</code> to load all sub classes too.
     * @throws org.modelio.vcore.model.DuplicateObjectException when adding to the cache an object with the same identifier as another one.
     */
    @objid ("5c036afc-79f4-485b-8238-a676f8c87d18")
    private void findAll(SmClass cls, IModelLoader modelLoader, final boolean recursive) throws DuplicateObjectException {
        // Load all sub meta-classes instances
        if (recursive) {
            for (SmClass c : cls.getAllSubClasses()) {
                findAll(c, modelLoader, false);
            }
        }
        
        // Load the meta-class instances itself
        try {
            for (UUID id : this.index.getByMClass(cls)) {
                SmObjectImpl obj = getLoadedObject(cls, id);
                if (obj == null) createStubObject(cls, id, modelLoader);
            }
        } catch (IOError e) {
            getErrorSupport().fireWarning(e);
        }
    }

    /**
     * Find all instances of the given metaclass with its sub classes if asked.
     * <p>
     * Same as {@link #findAll(SmClass, IModelLoader, boolean)} but the returned collection loads
     * its content lazily.
     * <p>
     * The model objects are not loaded, only stubs are instantiated lazily.
     * @param cls a metamodel class
     * @param recursive <code>true</code> to load all sub classes too.
     * @throws java.lang.IllegalStateException when adding to the cache an object with the same identifier as another one.
     */
    @objid ("dd6a13f7-f4d8-4acf-82e7-424a0e1b6689")
    private Collection<? super SmObjectImpl> findAllLazy(SmClass cls, final boolean recursive) throws IllegalStateException {
        if (recursive) {
            Collection<SmObjectImpl> ret = new CompoundCollection<>();
            FilteredContent coll = new FilteredContent(cls);
            ret.addAll(coll);
        
            for (SmClass subClass : cls.getAllSubClasses()) {
                coll = new FilteredContent(subClass);
                ret.addAll(coll);
            }
        
            return ret;
        } else {
            return new FilteredContent(cls);
        }
    }

    @objid ("8f0dd637-cff1-47b0-8d1d-ed8776676811")
    private void handleFormatVersion() throws IOException {
        int readFormat = readFormatVersion();
        if (readFormat == 0 && this.db.getNamedObject("main")==0) {
            // The base is empty, write the version
            writeFormatVersion();
        } else if (readFormat != FORMAT_VERSION)
            throw new InvalidFormatException(getName(), this.repositoryPath, readFormat, FORMAT_VERSION);
    }

    @objid ("88d00449-1b6f-4af0-a720-f3f21b4c0133")
    private void loadObj(SmObjectImpl obj, IModelLoader loader) throws IOException, IOError, InternalError, DuplicateObjectException {
        boolean ok = false;
        try {
            byte[] bdata = this.dbContent.get(obj.getUuid());
            if (bdata == null)
                throw new IOException(obj.getUuid()+" "+obj.getClassOf().getName()+" not found.");
        
            ByteArrayInputStream bis = new ByteArrayInputStream(bdata);
            try (SerializerInput dis = new SerializerInput(bis);) {
                this.serializer.deserialize(dis, obj, loader);
        
                // Consistency check
                assert (obj.getData().getUuid() != null) : obj.getData();
        
                // set the object loaded, non shell, non dirty
                loader.setRStatus(obj, IRStatus.REPO_LOADED, IRStatus.SHELL | IRStatus.REPO_DIRTY, 0);
            }
        
            ok = true;
        } finally {
            if (! ok) {
                loader.setRStatus(obj, IRStatus.SHELL, 0, 0);
            }
        }
    }

    @objid ("7bc99723-7c18-4efc-9d0e-e60408dd1f10")
    private int readFormatVersion() throws IOException {
        long recId = this.db.getNamedObject(FORMAT_VERSION_KEY);
        if (recId == 0)
            return 0;
        else
            return (Integer) this.db.fetch(recId);
    }

    @objid ("1d0ee461-148c-4a3d-a6c4-06150b1e58a2")
    private void writeFormatVersion() throws IOException {
        long recId = this.db.getNamedObject(FORMAT_VERSION_KEY);
        if (recId == 0) {
            recId = this.db.insert(FORMAT_VERSION);
            this.db.setNamedObject(FORMAT_VERSION_KEY, recId);
        } else {
            this.db.update(recId, FORMAT_VERSION);
        }
        this.db.commit();
    }

    /**
     * Get access to the maintenance operations.
     * @return the maintenance operations.
     */
    @objid ("95931d5f-7e09-49b2-8508-ecd0a7f9ec74")
    public IJdbmRepositoryMaintenance getMaintenance() {
        return new JdbmMaintenanceOperations(this.db);
    }

    /**
     * Allows to load lazily the instances of a metaclass.
     * <p>
     * Note: {@link #size()} iterates the whole collection content, avoid calling it.
     */
    @objid ("6854862e-f258-4d27-a1ee-351faee33bb7")
    private class FilteredContent extends AbstractCollection<SmObjectImpl> {
        @objid ("e23a2080-723f-4540-9956-e8c3bd751e43")
        private final SmClass cls;

        @objid ("a569c5e5-2deb-4d41-b35e-2322a6fb90b2")
        private final Collection<UUID> coll;

        @objid ("d734755e-5d3f-40db-be63-004cee22ecc5")
        @SuppressWarnings("synthetic-access")
        public FilteredContent(SmClass cls) {
            this.coll = JdbmRepository.this.index.getByMClass(cls);
            this.cls = cls;
        }

        @objid ("47a8c2ab-496c-4012-8eae-b55fcee43c3c")
        @Override
        public Iterator<SmObjectImpl> iterator() {
            @SuppressWarnings("synthetic-access")
            final IModelLoaderProvider loaderProvider = JdbmRepository.this.modelLoaderProvider;
            final Iterator<UUID> it = this.coll.iterator();
            return new IteratorImp(it, loaderProvider, this.cls);
        }

        /**
         * Returns the number of elements in this collection.
         * <p>
         * If this collection contains more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
         * <p>
         * <b>Note: Iterates the whole collection content, avoid calling it. </b>
         * @return the collection size.
         */
        @objid ("e15a6764-ada7-4802-b05e-897d39eee933")
        @Override
        public int size() {
            // JDBM implementation Iterates the whole collection content
            return this.coll.size();
        }

        @objid ("aa10e7fa-49cf-4934-846d-c54a83a8d69a")
        @Override
        public boolean isEmpty() {
            // JDBM implementation of isEmpty() calls size() that iterates the whole index.
            // This is a faster implementation.
            return !this.coll.iterator().hasNext();
        }

        @objid ("0c659256-f9c1-4c45-b9d1-9ec1c82633f0")
        @Override
        public boolean contains(Object o) {
            if (o instanceof MObject)
                return false;
            
            MObject obj = (MObject) o;
            if (obj.getMClass() != this.cls)
                return false;
            return (this.coll.contains(obj.getUuid()));
        }

        /**
         * Iterator implementation for this collection class..
         */
        @objid ("483c1378-23a7-48ea-b39e-0cd960732ed0")
        private final class IteratorImp implements Iterator<SmObjectImpl> {
            @objid ("1d5c963f-695f-4b4f-a647-e25edbd58f3a")
            private final Iterator<UUID> it;

            @objid ("e1488f50-1cc3-4f86-83f7-dff0c0296ce4")
            private final IModelLoaderProvider loaderProvider;

            @objid ("4a0ef952-8786-4ca7-8af0-eb7540827d85")
            private final SmClass itCls;

            @objid ("cdffb948-79d6-4c3e-9610-8c915e845fe2")
            IteratorImp(Iterator<UUID> it, IModelLoaderProvider loaderProvider, final SmClass cls) {
                this.it = it;
                this.loaderProvider = loaderProvider;
                this.itCls = cls;
            }

            @objid ("2762ba06-6d20-4a2c-9cd7-7bea47cc7331")
            @Override
            public boolean hasNext() {
                return this.it.hasNext();
            }

            @objid ("8eb47946-4f7d-4b0a-a9cd-0269d3221132")
            @Override
            public SmObjectImpl next() {
                UUID uuid = this.it.next();
                SmObjectImpl obj = getLoadedObject(this.itCls, uuid);
                if (obj == null)
                    try (IModelLoader modelLoader = this.loaderProvider.beginLoadSession()){
                        createStubObject(this.itCls, uuid, modelLoader);
                    } catch (DuplicateObjectException e) {
                        // The object may have been loaded by a concurrent thread.
                        // in this case return the concurrently loaded object.
                        obj = getLoadedObject(this.itCls, uuid);
                        if (obj == null)
                            throw new IllegalStateException(e.getMessage(), e);
                    }
                return obj;
            }

            @objid ("d35ac0ec-a9ba-4c60-a76f-505bdb150d21")
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

        }

    }

    @objid ("a07ae555-e9bd-436d-98c8-9cfc9a50db53")
    private class LoadHelper implements ILoadHelper {
        @objid ("b158403a-5658-47fc-8386-e7574bc546b9")
        public LoadHelper() {
            // Nothing
        }

        @objid ("7bc8647f-8671-4acb-98c7-6ef6d91c274b")
        @Override
        public SmObjectImpl getLocalRef(SmClass cls, UUID uuid, IModelLoader modelLoader) throws DuplicateObjectException {
            SmObjectImpl ret = getLoadedObject(cls, uuid);
            
            if (ret == null) {
                return createStubObject(cls, uuid, modelLoader);
            }
            return ret;
        }

    }

}
