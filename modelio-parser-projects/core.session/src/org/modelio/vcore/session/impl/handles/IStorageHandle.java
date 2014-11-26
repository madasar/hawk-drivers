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
                                    

package org.modelio.vcore.session.impl.handles;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.IRepositoryObject;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("9164f465-3a25-11e2-bf6c-001ec947ccaf")
public interface IStorageHandle {
    @objid ("1f1a5467-3a2d-11e2-bf6c-001ec947ccaf")
    boolean isStored(SmDependency dep);

    /**
     * @param obj
     * @param att
     * @param data
     */
    @objid ("1f1a546a-3a2d-11e2-bf6c-001ec947ccaf")
    void loadAtt(SmObjectImpl obj, SmAttribute att, ISmObjectData data);

    /**
     * Ensure the given dependency is loaded for the given object.
     * @param obj An object
     * @param data The object data, to avoid calling
     * {@link SmObjectImpl#getData()}.
     * @param dep the dependency to load.
     */
    @objid ("1f1a546f-3a2d-11e2-bf6c-001ec947ccaf")
    void loadDep(final SmObjectImpl obj, final ISmObjectData data, final SmDependency dep);

    @objid ("1f1a5477-3a2d-11e2-bf6c-001ec947ccaf")
    void forceLoadDep(SmObjectImpl obj, SmDependency dep, ISmObjectData data);

    @objid ("1f1a547b-3a2d-11e2-bf6c-001ec947ccaf")
    void appendObjDepVal(ISmObjectData data, SmObjectImpl obj, SmDependency dep, SmObjectImpl dep_val);

    @objid ("1f1a5480-3a2d-11e2-bf6c-001ec947ccaf")
    void undoAppendDepVal(SmObjectImpl obj, SmDependency dep, SmObjectImpl dep_val, IRepositoryObject oldValStore);

    /**
     * @param obj
     * @param dep
     * @param dep_val
     * @param data @return
     */
    @objid ("1f1a5485-3a2d-11e2-bf6c-001ec947ccaf")
    int loadDepIndexOf(SmObjectImpl obj, SmDependency dep, SmObjectImpl dep_val, ISmObjectData data);

}
