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
                                    

package org.modelio.vcore.session.api;

import java.io.IOException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vcore.session.api.blob.IBlobSupport;
import org.modelio.vcore.session.api.memory.IMemoryManager;
import org.modelio.vcore.session.api.model.IModel;
import org.modelio.vcore.session.api.model.change.IModelChangeSupport;
import org.modelio.vcore.session.api.repository.IRepositorySupport;
import org.modelio.vcore.session.api.transactions.ITransactionSupport;

/**
 * Core modeling session interface.
 * <p>
 * This is the main access point to the project model.
 */
@objid ("e52f33f5-1770-11e2-ac36-001ec947ccaf")
public interface ICoreSession {
    /**
     * Closes the modeling session.
     * <p>
     * closes all open repositories.
     */
    @objid ("08e18da3-1771-11e2-ac36-001ec947ccaf")
    void close();

    /**
     * @return the blob support.
     */
    @objid ("bfb1b45d-e482-4956-9daa-cebbcef2b472")
    IBlobSupport getBlobSupport();

    /**
     * Get the memory manager.
     * <p>
     * The memory manager swaps model objects on the disk when memory is low.
     * It supports listeners who are activated when it frees memory.
     * <p>
     * The memory manager is shared among all core sessions.
     * @return the memory manager.
     */
    @objid ("a31e0ccd-0135-4f50-bd4f-6c4292cfb3ec")
    IMemoryManager getMemoryManager();

    /**
     * Get an access to the model.
     * @return the model.
     */
    @objid ("005f3cb4-5f00-10c8-842f-001ec947cd2a")
    IModel getModel();

    /**
     * Get the model changes events listeners support.
     * <p>
     * This object manages model and status change listeners. It is used to add and remove listeners and to fire model change
     * events.
     * @return the model change support.
     */
    @objid ("0038b256-575b-10c8-842f-001ec947cd2a")
    IModelChangeSupport getModelChangeSupport();

    /**
     * Get access to the repositories.
     * @return an access point to the repositories.
     */
    @objid ("005f33cc-5f00-10c8-842f-001ec947cd2a")
    IRepositorySupport getRepositorySupport();

    /**
     * Get access point to the transactions.
     * @return an access point to the transactions.
     */
    @objid ("0038a856-575b-10c8-842f-001ec947cd2a")
    ITransactionSupport getTransactionSupport();

    /**
     * Tells whether the session needs to be saved.
     * @return <code>true</code> if the session needs to be saved, <code>false</code> if no element was modified.
     */
    @objid ("c65ee711-2e8c-4c85-8fac-27c17659a0de")
    boolean isDirty();

    /**
     * Save the model.
     * @param monitor a progress monitor. May be <code>null</code>.
     * @throws java.io.IOException if a repository failed to save.
     */
    @objid ("005f50aa-5f00-10c8-842f-001ec947cd2a")
    void save(IModelioProgress monitor) throws IOException;

}
