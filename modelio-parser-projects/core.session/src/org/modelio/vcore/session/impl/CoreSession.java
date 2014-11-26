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
                                    

package org.modelio.vcore.session.impl;

import java.io.File;
import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.log.Log;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.NullProgress;
import org.modelio.vbasic.progress.SubProgress;
import org.modelio.vcore.session.api.IAccessManager;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.memory.IMemoryManager;
import org.modelio.vcore.session.api.model.IModel;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.api.repository.IRepositoryChangeEvent;
import org.modelio.vcore.session.api.repository.IRepositoryChangeListener;
import org.modelio.vcore.session.api.repository.IRepositorySupport;
import org.modelio.vcore.session.api.transactions.ITransactionSupport;
import org.modelio.vcore.session.impl.cache.CacheHandle;
import org.modelio.vcore.session.impl.cache.CacheManager;
import org.modelio.vcore.session.impl.cache.MemoryManager;
import org.modelio.vcore.session.impl.jmx.CoreSessionMXBeanImpl;
import org.modelio.vcore.session.impl.load.ModelLoaderConfiguration;
import org.modelio.vcore.session.impl.load.ModelLoaderProvider;
import org.modelio.vcore.session.impl.load.RefreshEventService;
import org.modelio.vcore.session.impl.load.StorageHandle;
import org.modelio.vcore.session.impl.permission.BasicAccessManager;
import org.modelio.vcore.session.impl.permission.DefaultAccessHandle;
import org.modelio.vcore.session.impl.storage.IModelLoader;
import org.modelio.vcore.session.impl.storage.memory.MemoryRepository;
import org.modelio.vcore.session.impl.transactions.TransactionManager;
import org.modelio.vcore.session.impl.transactions.events.ModelChangeSupport;
import org.modelio.vcore.session.impl.transactions.events.StatusChangeManager;
import org.modelio.vcore.smkernel.IMetaOf;
import org.modelio.vcore.smkernel.KernelRegistry;
import org.modelio.vcore.smkernel.SmLiveId;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.swap.JdbmSwap;

/**
 * Core modeling session implementation.
 * <p>
 * This is the implementation of the main access point to a project model.
 */
@objid ("006d5db2-6ebd-1f22-8c06-001ec947cd2a")
public class CoreSession implements ICoreSession, IRepositorySupport {
    /**
     * Incremented each time a repository is added.
     * Never decremented.
     */
    @objid ("3cc2caae-129e-45cb-ba2f-7d5f6d004247")
    private byte repoCounter = 0;

    /**
     * The shell repository identifier.
     */
    @objid ("54ba67df-cd4b-4212-b7dd-61c227734ac3")
    private static final String REPOSITORY_KEY_SHELL = "repo.key.shell";

    @objid ("4bd517e8-1c7e-4980-ae35-2f92342cb90d")
     CacheManager cacheManager;

    @objid ("4b038206-6488-4283-b35d-054f17a7d664")
    private DeletedMetaObject deletedMetaObject;

    @objid ("5271df69-43fd-46e4-905b-d523bbba4898")
    private SmFactory ssFactory;

    @objid ("fb3623d5-9a91-4c03-84dd-f0a8b7c582ad")
    private StdMetaObject stdMetaObject;

    @objid ("f691a7f5-70c6-4f07-b82a-e52a29466afb")
    private TransactionManager transactionManager;

    @objid ("cedf3377-bec0-42fa-949c-fcc33a3937f5")
    private KernelServiceProvider ksp;

    @objid ("001bb552-a686-44e5-bb36-5fee49a321cc")
    private final List<IRepository> repositories = new ArrayList<>();

    @objid ("f042466c-bcc9-4859-ad2c-bc2d3f48e955")
    private IRepository shellRepository;

    @objid ("a88b8ad5-f92c-4070-b296-2bf449c830a2")
    private ModelChangeSupport modelChangeSupport;

    /**
     * Storage handler
     */
    @objid ("0d8feb46-4619-49d9-8859-22cd174dbd07")
    private StorageHandle storageHandle;

    @objid ("de0bebbe-3b03-4ba0-87e6-fde5c39f0779")
    private Model model;

    @objid ("29a3da2c-dd48-4e0c-8acf-0425bbbf0eff")
    private CoreSessionMXBeanImpl jmxBean;

    @objid ("39d2b96c-958c-433b-a490-70c28371377a")
    private ScheduledExecutorService schedulerService;

    @objid ("7555b101-cd15-40a4-b683-36f4328bf29b")
    private IRepository scratchRepository;

    @objid ("58ddbad7-2d57-4142-8818-72ad99929f48")
    private IAccessManager sessionAccessManager;

    @objid ("7713c146-c1e9-491a-b0b3-5eeb2f3a23c6")
    private BlobSupport blobSupport;

    @objid ("2bacc88f-7a51-47c8-b1e9-4dabb2703b01")
    private final Map<String, IRepository> repoRegistry = new HashMap<>();

    @objid ("b472771c-1c43-4bbb-9921-31bfe1ac938d")
    private RefreshEventService refreshEventService;

    @objid ("1df81043-14f1-44b5-a9b8-a0bfdf719ec2")
    private Collection<IRepositoryChangeListener> repositoryChangeListeners;

    /**
     * Get the core session owning the given model object.
     * @param obj a model object.
     * @return its core session.
     */
    @objid ("6c4ada56-176e-11e2-ac36-001ec947ccaf")
    public static CoreSession getSession(MObject obj) {
        SmObjectImpl impl = (SmObjectImpl) obj;
        KernelServiceProvider ksp = (KernelServiceProvider) KernelRegistry.getService(impl.getLiveId());
        return ksp.getSession();
    }

    /**
     * Initialize the core session.
     * @throws java.io.IOException if the swap failed to initialize.
     */
    @objid ("0005fa6e-6ebe-1f22-8c06-001ec947cd2a")
    public CoreSession() throws IOException {
        File swapPath = createSwapSpace();
        init(swapPath);
    }

    /**
     * Initialize the core session.
     * @param swapPath An empty directory where the swap can be stored.
     * @throws java.io.IOException if the swap failed to initialize.
     */
    @objid ("c295ebe8-91ba-45c2-93a8-ecafee94dd10")
    public CoreSession(File swapPath) throws IOException {
        init(swapPath);
    }

    @objid ("006d63e8-6ebd-1f22-8c06-001ec947cd2a")
    @Override
    protected void finalize() throws Throwable {
        close();
        super.finalize();
    }

    @objid ("006d647e-6ebd-1f22-8c06-001ec947cd2a")
    @Override
    public void close() {
        // Terminate the task scheduler
        if (this.schedulerService != null) {
            this.schedulerService.shutdownNow();
            this.schedulerService = null;
        }
        
        // Remove and delete the cache
        if (this.cacheManager != null) {
            this.cacheManager.dispose();
            this.cacheManager = null;
        }
        
        // Remove and delete kernel provider service
        // Also delete the swap.
        if (this.ksp != null) {
            this.ksp.dispose();
            this.ksp = null;
        }
        
        // Release repositories
        for (IRepository base : this.repositories) {
            base.close();
        }
        
        // Empty repository list
        this.repositories.clear();
        this.repoRegistry.clear();
        
        // Dispose the JMX monitor bean
        if (this.jmxBean  != null) {
            this.jmxBean.unregister();
            this.jmxBean = null;
        }
        
        // Set all pointer as null to free all used memory,
        // leaks of CoreSession references would prevent Gigs of memory to be freed. 
        this.deletedMetaObject = null;
        this.model = null;
        this.modelChangeSupport = null;
        this.shellRepository = null;
        this.ssFactory = null;
        this.stdMetaObject = null;
        this.storageHandle = null;
        this.transactionManager = null;
        this.refreshEventService = null;
        this.repositoryChangeListeners = null;
    }

    @objid ("006d6c80-6ebd-1f22-8c06-001ec947cd2a")
    @Override
    public void connectRepository(IRepository aBase, IAccessManager accessManager, IModelioProgress monitor) throws IOException {
        connectRepository(aBase, String.valueOf(this.repoCounter), accessManager, monitor);
    }

    /**
     * Connect a repository to this modeling session.
     * @param aBase the repository to add.
     * @param accessManager the access rights manager that will set access rights on loaded objects.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("014123b4-8952-49e1-8c40-01dd2ddb0cd0")
    @Override
    public void connectRepository(IRepository aBase, String key, final IAccessManager accessManager, IModelioProgress monitor) throws IOException {
        assertOpen();
        
        if (key != null && this.repoRegistry.get(key) != null)
            throw new IllegalArgumentException(this.repoRegistry.get(key)+ " already registered with '"+key+"' key");
        
        // Open the database
        byte rid = this.repoCounter++;
        if (this.repoCounter == 0) throw new IllegalStateException("Too much repositories added/removed.");
        
        short kid = this.ksp.getId();
        aBase.init(rid);
        
        if (!aBase.isOpen()) {
            IAccessManager repoManager = new CompositeAccessManager(accessManager);
            ModelLoaderConfiguration config = new ModelLoaderConfiguration(this, kid, rid, this.shellRepository, this.cacheManager, repoManager, this.refreshEventService);
            ModelLoaderProvider modelLoaderProvider = new ModelLoaderProvider(config);
            
            aBase.open(modelLoaderProvider, monitor);
        }
        
        this.repositories.add(aBase);
        this.repoRegistry.put(key, aBase);
        
        // Try to connect unresolved references
        if (this.shellRepository != null && aBase != this.shellRepository) {
            for (SmObjectImpl obj : new ArrayList<>(this.shellRepository.getAllLoadedObjects())) {
                aBase.findById(obj.getClassOf(), obj.getUuid());
            }
        }
    }

    /**
     * Close and remove the given model repository from the connected repositories.
     * @param toRemove the repository to disconnect.
     * @throws java.lang.IllegalArgumentException if the repository is not connected to this session
     */
    @objid ("6703d8f2-07e5-11e2-b33c-001ec947ccaf")
    @Override
    public void disconnectRepository(IRepository toRemove) throws IllegalArgumentException {
        assertOpen();
        
        if (!this.repositories.contains(toRemove)) {
            throw new IllegalArgumentException(toRemove + " repository is not connected to this session.");
        }
        
        if (toRemove.isOpen()) {
            // Move all loaded objects to the shell repository.
            Collection<SmObjectImpl> all = new ArrayList<>(toRemove.getAllLoadedObjects());
            for (SmObjectImpl o : all) {
                o.getRepositoryObject().unload(o);
                this.shellRepository.addObject(o);
            }
            // Close the repository.
            toRemove.close();
        }
        
        this.repositories.remove(toRemove);
        for (Iterator<Entry<String, IRepository>> it = this.repoRegistry.entrySet().iterator(); it.hasNext(); ) {
            if (it.next().getValue() == toRemove)
                it.remove();
        }
    }

    @objid ("8d51e75a-cff0-4e0b-bcd6-6f403dc28c4a")
    @Override
    public BlobSupport getBlobSupport() {
        return this.blobSupport;
    }

    /**
     * Returns the memory manager singleton.
     */
    @objid ("f6a8d47f-5746-42e0-935f-bf8cdcdf26c4")
    @Override
    public IMemoryManager getMemoryManager() {
        return MemoryManager.get();
    }

    /**
     * Get the default meta object to attach to model objects.
     * @return the meta object.
     */
    @objid ("0061abc0-fd1a-1f27-a7da-001ec947cd2a")
    public IMetaOf getMetaObject() {
        return this.stdMetaObject;
    }

    @objid ("002574f2-5a21-10c8-842f-001ec947cd2a")
    @Override
    public IModel getModel() {
        return this.model;
    }

    /**
     * Get the model changes events listeners support.
     * <p>
     * This object manages model and status change listeners. It is used to add and remove listeners and to fire model change
     * events.
     * @return the model change support.
     */
    @objid ("7dc92792-1c43-11e2-8eb9-001ec947ccaf")
    @Override
    public final ModelChangeSupport getModelChangeSupport() {
        return this.modelChangeSupport;
    }

    @objid ("695241b8-4b8b-11e2-91c9-001ec947ccaf")
    @Override
    public Collection<IRepository> getRepositories() {
        return new ArrayList<>(this.repositories);
    }

    @objid ("005f6b94-fd1a-1f27-a7da-001ec947cd2a")
    @Override
    public Collection<IRepository> getRepositoriesView() {
        return Collections.unmodifiableList(this.repositories);
    }

    /**
     * Get the repository where the given object is stored.
     * <p>
     * Returns <code>null</code> if the object is not assigned to a repository or the repository does not belong to this session.
     * @param anObject an object
     * @return its repository, or <code>null</code>.
     */
    @objid ("6706f83f-ca6f-11e1-8052-001ec947ccaf")
    @Override
    public IRepository getRepository(MObject anObject) {
        assertOpen();
        
        final SmObjectImpl smObj = (SmObjectImpl) anObject;
        final byte rid = SmLiveId.getRid(smObj.getLiveId());
        
        for (IRepository r : this.repositories) {
            if (r.getRepositoryId() == rid) {
                return r;
            }
        }
        return null;
    }

    @objid ("008c201c-5f00-10c8-842f-001ec947cd2a")
    @Override
    public IRepositorySupport getRepositorySupport() {
        return this;
    }

    /**
     * Get the low level model object factory.
     * @return the model object factory.
     */
    @objid ("006d6884-6ebd-1f22-8c06-001ec947cd2a")
    public SmFactory getSmFactory() {
        return this.ssFactory;
    }

    @objid ("005c54d6-575b-10c8-842f-001ec947cd2a")
    @Override
    public ITransactionSupport getTransactionSupport() {
        return this.transactionManager;
    }

    /**
     * Get the service used to schedule tasks in a background thread.
     * <p>
     * This service is closed with the session.
     * @return the background task service.
     */
    @objid ("a0231731-87fe-457b-a477-64d83b65bddc")
    public ScheduledExecutorService getSchedulerService() {
        return this.schedulerService;
    }

    /**
     * Get the repository where shell objects are located until they are resolved.
     * @return the shell objects repository.
     */
    @objid ("bda036e0-92d7-11e1-81e9-001ec947ccaf")
    public IRepository getShellRepository() {
        return this.shellRepository;
    }

    @objid ("89c6a49b-ba46-400d-9bc8-511c572bcb05")
    @Override
    public IRepository getRepository(String key) {
        return this.repoRegistry.get(key);
    }

    @objid ("b8e5c2b5-63a7-46c6-8d82-2575cb7d892e")
    @Override
    public boolean isDirty() {
        for (IRepository r : this.repositories) {
            if (r.isDirty())
                return true;
        }
        return false;
    }

    /**
     * Save the model.
     * @throws java.io.IOException if a repository failed to save.
     */
    @objid ("006d69b0-6ebd-1f22-8c06-001ec947cd2a")
    @Override
    public void save(IModelioProgress monitor) throws IOException {
        assertOpen();
        
        SubProgress mon = SubProgress.convert(monitor, 15+this.repositories.size() * 10);
        
        Iterable<SmObjectImpl> deletedObjects = this.cacheManager.getDeletedObjects();
        for (SmObjectImpl obj : deletedObjects) {
            // Clear blobs
            Collection<String> blobs = this.blobSupport.getRelatedBlobs(obj);
            if (! blobs.isEmpty())  {
                IRepository repo = getRepository(obj);
                if (repo != null) {
                    for (String blob : blobs)
                      repo.removeBlob(blob);
                }
            }
                
            // Definitively remove from base and delete deleted objects
            obj.getRepositoryObject().detach(obj);
        }
        
        mon.worked(10);
        
        // Save changes in the database
        for (IRepository base : new ArrayList<>(this.repositories)) {
            base.save(mon.newChild(10));
        }
        
        // Clear the transactions
        this.transactionManager.reset();
        
        // Clear the cache
        this.cacheManager.clearDeletedObjects();
    }

    /**
     * Initialize the session.
     * @throws java.io.IOException if the swap failed to initialize.
     */
    @objid ("006188c0-fd1a-1f27-a7da-001ec947cd2a")
    protected void init(File swapPath) throws IOException {
        // Set up the cache
        this.cacheManager = new CacheManager();
        
        // Setup swap
        final JdbmSwap jdbmSwap = new JdbmSwap(swapPath);
        
        this.jmxBean = new CoreSessionMXBeanImpl(this, jdbmSwap, this.cacheManager);
        
        // Setup kernel service provider
        this.ksp = new KernelServiceProvider(this, this.jmxBean.getSwapImpl(), this.cacheManager);
        this.jmxBean.setKernelServiceProvider(this.ksp);
        
        this.blobSupport = new BlobSupport();
        
        this.modelChangeSupport = new ModelChangeSupport();
        
        this.repositoryChangeListeners = new CopyOnWriteArrayList<>();
        
        // Set up a TransactionManager
        this.transactionManager = new TransactionManager(this.modelChangeSupport);
        
        // Set up a DeletedMetaObject
        this.deletedMetaObject = new DeletedMetaObject();
        
        // Set up a StdMetaObject
        CacheHandle cacheHandle = new CacheHandle(this.cacheManager);
        
        // Set up a storage handle
        this.storageHandle = new StorageHandle(this, this.blobSupport);
        
        // Setup scheduler service
        this.schedulerService = initSchedulerService();
        
        // Set up element status change manager
        StatusChangeManager statusManager = new StatusChangeManager();
        statusManager.init(this.schedulerService, this.transactionManager, this.modelChangeSupport);
        
        this.stdMetaObject = new StdMetaObject(this.storageHandle, new DefaultAccessHandle(),
                this.transactionManager.getActionHandle(), cacheHandle, this.deletedMetaObject, statusManager);
        
        // Set the metaobject on the cache manager and the deleted metaobject
        this.deletedMetaObject.setMetaObject(this.stdMetaObject);
        
        // Initialize the model refresh event service
        this.refreshEventService = new RefreshEventService(this.modelChangeSupport, this.transactionManager, this.schedulerService);
        
        // Initialize shell objects repository
        initBuiltinRepositories();
        
        // Initialize IModel implementation
        this.model = new Model(this.cacheManager, getRepositorySupport());
        
        // Setup a SsFactory
        this.ssFactory = new SmFactory(this.ksp.getId(), this.stdMetaObject, this.model, this.cacheManager, this.shellRepository);
        
        // Setup a Generic factory
        this.model.setGenericFactory(new GenericFactory(this.ssFactory, getRepositorySupport()));
        
        
        this.jmxBean.register();
    }

    @objid ("67063b47-07e5-11e2-b33c-001ec947ccaf")
    private void assertOpen() throws IllegalStateException {
        if (this.transactionManager == null) {
            throw new IllegalStateException("This CoreSession is closed.");
        }
    }

    /**
     * Create and empties the swap directory.
     * @throws java.io.IOError
     * in case of failure
     * @return the swap directory path
     */
    @objid ("3f1d5b36-7e46-11e1-bee3-001ec947ccaf")
    private static File createSwapSpace() throws IOException {
        Path swapPath = Files.createTempDirectory("modelio.vega.swap");
        File pathAsFile = swapPath.toFile();
        pathAsFile.deleteOnExit();
        return pathAsFile;
    }

    /**
     * Initialize built-in repositories:<ul>
     * <li> scratch repository that may be used to create objects
     * <li> shell repository : stores unresolved references.
     * </ul>
     * @throws java.io.IOException in case of failure.
     */
    @objid ("bda036dd-92d7-11e1-81e9-001ec947ccaf")
    private void initBuiltinRepositories() throws IOException {
        this.shellRepository = new ShellObjectsRepository();
        
        BasicAccessManager accessManager = new BasicAccessManager();
        connectRepository(this.shellRepository, REPOSITORY_KEY_SHELL, accessManager, new NullProgress());
        
        this.scratchRepository = new MemoryRepository();
        accessManager = new BasicAccessManager();
        connectRepository(this.scratchRepository, REPOSITORY_KEY_SCRATCH, accessManager, new NullProgress());
    }

    /**
     * Initialize the scheduled executor service.
     * @return the scheduled executor service.
     */
    @objid ("8e065238-1de9-4a5f-a00a-7288ed0a787b")
    private ScheduledExecutorService initSchedulerService() {
        int corePoolSize = 2;
        
        /*
         * Creates an Executor that uses a 2 worker threads operating
         * off an unbounded queue, and uses the provided ThreadFactory to
         * create a new thread when needed. 
         * 
         * Instantiates a thread factory that creates daemons threads with
         * a custom name and an unhandled exception handler that logs errors.
         */
        ThreadFactory threadFactory = new ThreadFactory() {
            private int count = 0;
            @Override
            public Thread newThread(Runnable r) {
                @SuppressWarnings("synthetic-access")
                final String name = String.format("CoreSession %d Scheduler thead %d", 
                        CoreSession.this.ksp.getId(), ++this.count);
                
                Thread t = new Thread(r, name);
                t.setDaemon(true);
                t.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                    
                    @Override
                    public void uncaughtException(Thread dead, Throwable e) {
                        Log.error("'"+dead+"' thread died unexpectedly:");
                        Log.error(e);
                    }
                });
                return t;
            }
        };
        
        this.schedulerService = new ScheduledThreadPoolExecutor(corePoolSize, threadFactory);
        return this.schedulerService;
    }

    /**
     * Set the session access manager.
     * @param sessionAccessManager Set the session access manager.
     */
    @objid ("273d99d3-ac46-49b4-86d8-b0503b0d7785")
    public void setSessionAccessManager(IAccessManager sessionAccessManager) {
        if (isDirty())
            throw new IllegalStateException("Cannot change access manager on a dirty session.");
        
        this.sessionAccessManager = sessionAccessManager;
        
        // Need to reload all.
        for ( SmObjectImpl o : this.cacheManager.getIterable()) {
            o.getRepositoryObject().unload(o);
        }
    }

    /**
     * Get the session access manager if one defined.
     * @return the session access manager or <code>null</code>.
     */
    @objid ("648db53a-49f3-4125-89e1-e730894ca936")
    IAccessManager getSessionAccessManager() {
        return this.sessionAccessManager;
    }

    @objid ("c1dbd416-b1d1-4128-9cbd-7bc4abd2080c")
    @Override
    public void addRepositoryChangeListener(IRepositoryChangeListener listener) {
        this.repositoryChangeListeners.add(listener);
    }

    @objid ("2cbdf4b2-e385-47ea-83c6-865452fa2d41")
    @Override
    public void removeRepositoryChangeListener(IRepositoryChangeListener listener) {
        this.repositoryChangeListeners.remove(listener);
    }

    @objid ("9a5a7e82-d7d2-42fc-a2dd-df7b8e5729b0")
    @Override
    public void fireRepositoryChange(IRepositoryChangeEvent event) {
        for(IRepositoryChangeListener listener : this.repositoryChangeListeners) {
            listener.repositoryChanged(event);
        }
    }

    /**
     * Access manager that first call the session manager before calling
     * the provided one.
     */
    @objid ("1340906c-9f27-4d3b-9e0a-c118177bbd3a")
    private class CompositeAccessManager implements IAccessManager {
        @objid ("9bccc7c3-0611-4699-9a9b-a50f0edd0819")
        private IAccessManager accessManager;

        @objid ("d6b1f973-8f04-4b81-945f-e0e1811a2443")
        public CompositeAccessManager(IAccessManager accessManager) {
            this.accessManager = accessManager;
        }

        @objid ("f3112664-37ac-496c-b25e-0845b38b29cf")
        @Override
        public void initStatus(SmObjectImpl obj, IModelLoader loader) {
            IAccessManager sessionManager = getSessionAccessManager();
            if (sessionManager != null)
                sessionManager.initStatus(obj, loader);
            
            this.accessManager.initStatus(obj, loader);
        }

    }

}
