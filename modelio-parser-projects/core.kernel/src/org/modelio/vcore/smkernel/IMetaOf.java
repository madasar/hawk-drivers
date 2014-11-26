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
                                    

package org.modelio.vcore.smkernel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;

/**
 * Interface for a meta object.
 */
@objid ("009692cc-004e-1f20-85a5-001ec947cd2a")
public interface IMetaOf {
    /**
     * Get the content of a model dependency.
     * <p>
     * Returns a SmObjectImpl if the dependency is single, a {@link SmList} in the other case.
     * @param obj a model object.
     * @param dep the dependency to browse.
     * @return the dependency content.
     */
    @objid ("00968c50-004e-1f20-85a5-001ec947cd2a")
    Object getObjDepVal(SmObjectImpl obj, SmDependency dep);

    @objid ("0096862e-004e-1f20-85a5-001ec947cd2a")
    boolean appendObjDepVal(SmObjectImpl obj, SmDependency dep, SmObjectImpl dep_val);

    @objid ("00968732-004e-1f20-85a5-001ec947cd2a")
    boolean appendObjDepValIndex(SmObjectImpl obj, SmDependency dep, SmObjectImpl dep_val, final int index);

    @objid ("00968a66-004e-1f20-85a5-001ec947cd2a")
    boolean eraseObjDepVal(SmObjectImpl obj, SmDependency dep, SmObjectImpl dep_val);

    @objid ("00968d90-004e-1f20-85a5-001ec947cd2a")
    boolean moveObjDepVal(SmObjectImpl obj, SmDependency dep, SmObjectImpl moving_ref, final int offset);

    @objid ("0048c57e-702c-1f21-85a5-001ec947cd2a")
    boolean setObjDepVal(final SmObjectImpl smObject, final SmDependency dep, final SmObjectImpl value, final int index);

    @objid ("00968b06-004e-1f20-85a5-001ec947cd2a")
    Object getObjAttVal(SmObjectImpl obj, SmAttribute att);

    /**
     * Change the value of the given attribute on the given object.
     * @param obj The object to modify
     * @param att The attribute to change
     * @param value The new value
     * @return true if a change was done, false if the value was the same.
     */
    @objid ("00968f7a-004e-1f20-85a5-001ec947cd2a")
    boolean setObjAttVal(SmObjectImpl obj, SmAttribute att, final Object value);

    @objid ("0096891c-004e-1f20-85a5-001ec947cd2a")
    void createObject(SmObjectImpl obj);

    @objid ("009689bc-004e-1f20-85a5-001ec947cd2a")
    void deleteObject(SmObjectImpl obj);

    @objid ("00968e30-004e-1f20-85a5-001ec947cd2a")
    void objUndeleted(SmObjectImpl obj);

    /**
     * Enable or disable transaction recording.
     * @param val true to enable transactions, false to disable it.
     */
    @objid ("00968ed0-004e-1f20-85a5-001ec947cd2a")
    void setActionRecording(final boolean val);

    /**
     * Delete the given object without recording it in the transaction.
     * @param obj The object to delete.
     */
    @objid ("00969024-004e-1f20-85a5-001ec947cd2a")
    void silentActionRemove(SmObjectImpl obj);

    @objid ("178a969f-f007-4071-aacc-e201cee76425")
    void objStatusChanged(SmObjectImpl obj, long oldStatus, long newStatus);

}
