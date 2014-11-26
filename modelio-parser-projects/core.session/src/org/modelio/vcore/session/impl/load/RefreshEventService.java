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
                                    

package org.modelio.vcore.session.impl.load;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.session.api.model.change.ChangeCause;
import org.modelio.vcore.session.api.model.change.IModelChangeEvent;
import org.modelio.vcore.session.api.model.change.IStatusChangeEvent;
import org.modelio.vcore.session.api.transactions.ITransactionSupport;
import org.modelio.vcore.session.impl.transactions.events.EventFactory;
import org.modelio.vcore.session.impl.transactions.events.ModelChangeSupport;
import org.modelio.vcore.session.impl.transactions.smAction.IAction;
import org.modelio.vcore.smkernel.ISmObjectData;

/**
 * Service that accumulate model refresh actions and
 * fires model and status change events in background.
 * <p>
 * Ensures the model refresh event is fired outside transactions.
 * <p>
 * Refresh event firing may be delayed with {@link #lock()} and {@link #unlock()}.
 */
@objid ("a8d4d6a9-42ee-11e2-91c9-001ec947ccaf")
public class RefreshEventService {
    @objid ("a7f2bb16-dc57-4bee-a5b6-d590b678549b")
    private int mutexCount;

    @objid ("7112a4ef-2b56-4b80-81a3-35de896262dd")
    private int actionCount;

    @objid ("a8d4d6ac-42ee-11e2-91c9-001ec947ccaf")
    private final ModelChangeSupport changeSupport;

    @objid ("a39df791-cc1e-4607-8ede-d6272b63e4df")
    private final ScheduledExecutorService schedulerService;

    @objid ("f9f629ad-0c94-4f72-8ff8-f98a7aca4120")
    private final Object lock = new Object();

    @objid ("9f0f21ad-3ca4-47d9-ba58-3ea3c389f41e")
    private EventFactory eventFactory;

    @objid ("31eb2d06-7211-4d29-8c66-89936a75db67")
     final Runnable doFireRefreshRunner;

    /**
     * To prevent model object data from being garbaged until change event is sent.
     */
    @objid ("d3a703c4-7429-41be-844f-19e73763e1a4")
    private Collection<ISmObjectData> deletedData;

    /**
     * To prevent model object data from being garbaged until change event is sent.
     */
    @objid ("7e2f241a-3ccb-49bf-8d68-492c2438a89b")
    private Collection<Collection<ISmObjectData>> oldDeletedData = new ArrayList<>(1);

    /**
     * Initialize the refresh event support
     * @param changeSupport the model change support
     * @param transactionSupport the model transaction support
     * @param schedulerService a scheduler executor service
     */
    @objid ("95a7ff6d-1ef7-414e-9adc-f0d6b65c9c10")
    public RefreshEventService(ModelChangeSupport changeSupport, final ITransactionSupport transactionSupport, ScheduledExecutorService schedulerService) {
        this.changeSupport = changeSupport;
        this.schedulerService = schedulerService;
        this.deletedData = new ArrayList<>();
        
        this.doFireRefreshRunner = new Runnable() {
            @Override
            public void run() {
                transactionSupport.asyncExec(new Runnable() {
                    
                    @Override
                    public void run() {
                        tryFireRefresh();
                    }
                });
            }
        };
    }

    /**
     * Add a refresh event to process
     * @param actions all model refresh changes.
     * @param newDeletedData deleted model object data to keep from garbage collection.
     */
    @objid ("f98731c8-7c84-40a6-8079-3d0995b5feef")
    public synchronized void addEvent(Collection<IAction> actions, Collection<ISmObjectData> newDeletedData) {
        synchronized(this.lock) {
            // Sanity check
            //if (this.actionCount > 100000)
            //    throw new EventQueueOverflowError(this.actionCount+" actions waiting for process.");
            
            // Test whether a schedule is already done
            boolean scheduled = true;
            if (this.eventFactory == null) {
                this.eventFactory = EventFactory.createEvent(ChangeCause.REPOSITORY);
                scheduled = false;
            }
            
            this.deletedData.addAll(newDeletedData);
            
            // Process recorded events
            for (IAction  a: actions) {
                this.eventFactory.process(a);
                this.actionCount ++;
            }
        
            // Schedule the refresh event if not done.
            if (! scheduled) {
                this.schedulerService.schedule(this.doFireRefreshRunner, 10, TimeUnit.MILLISECONDS);
            }
        }
    }

    /**
     * Prevent the service from firing model change events until
     * {@link #unlock()} has been called.
     * <p>
     * Works like a mutex.
     * Each call to {@link #lock()} must match a call to {@link #unlock()}.
     */
    @objid ("87a33fcf-f03c-4c89-95cc-7ed3ab519c54")
    public void lock() {
        synchronized(this.lock) {
            this.mutexCount++;
        }
    }

    /**
     * Allow the service to fire model change events once
     * each call to {@link #lock()} is matched by a call to {@link #unlock()}.
     * <p>
     * Works like a mutex.
     */
    @objid ("12767f76-4aa5-477f-b133-eab229e539fb")
    public void unlock() {
        synchronized(this.lock) {
            assert(this.mutexCount > 0);
            this.mutexCount--;
        }
    }

    /**
     * To be called by {@link #doFireRefreshRunner} only.
     * <p>
     * Fires the model change event if not locked.
     * In the other case, schedule the firing again.
     */
    @objid ("f532850e-41a9-43a0-85b5-10e113dd6275")
    void tryFireRefresh() {
        EventFactory currentEvent = null ;
        
        synchronized(this.lock) {
            if (this.mutexCount > 0) {
                // locked, schedule again
                this.schedulerService.schedule(this.doFireRefreshRunner, 10, TimeUnit.MILLISECONDS);
            } else {
                // replace the event factory by a new one
                currentEvent = this.eventFactory;
                this.oldDeletedData.add(this.deletedData);
                
                this.eventFactory = null;
                this.deletedData = new ArrayList<>();
                this.actionCount = 0;
            }
        }
        
        if (currentEvent != null) {
            doFireRefresh(currentEvent);
            this.oldDeletedData.clear();
        }
    }

    /**
     * Fires the model change event a the status change event
     * from the current event factory.
     * <p>
     * This method should be called when no model transaction is run.
     */
    @objid ("02534050-fc25-4cc2-a28a-87da3cf3d66d")
    private void doFireRefresh(EventFactory currentEvent) {
        // Prepare the model change event
        currentEvent.postProcess();
        
        IModelChangeEvent modelEvent = currentEvent.getEvent();
        IStatusChangeEvent statusEvent = currentEvent.getStatusEvent();
        if (!modelEvent.isEmpty())
            this.changeSupport.fireModelChangeListeners(modelEvent);
        if (! statusEvent.isEmpty())
            this.changeSupport.fireStatusChangeListeners(statusEvent);
    }

    /**
     * Indicates that too much model change event are waiting for being fired.
     * <p>
     * This exception should never be encountered, and indicates there is a bug
     * in {@link ModelRefresher}.
     */
    @objid ("79681cfd-abbd-4f3f-bc1e-0e361150bc8b")
    @SuppressWarnings("serial")
    public static class EventQueueOverflowError extends Error {
        /**
         * Constructs a new EventQueueOverflowError with the specified detail message.  The
         * cause is not initialized, and may subsequently be initialized by
         * a call to {@link #initCause}.
         * @param   message   the detail message. The detail message is saved for
         * later retrieval by the {@link #getMessage()} method.
         */
        @objid ("cc842533-7da9-420f-ae5a-84bb58c345c7")
        public EventQueueOverflowError(String message) {
            super(message);
        }

    }

}
