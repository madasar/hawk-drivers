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

import java.util.Collection;
import java.util.HashSet;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.IRStatus;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;

/**
 * Helper class that deletes model objects.
 */
@objid ("b75df2fa-7da1-4f46-83c3-c1d6b640552f")
class ModelRefreshDeleter {
    @objid ("2ca524f2-2046-446d-bf81-9d7895a4976e")
    private ModelRefresher loader;

    /**
     * Initialize the deleter.
     * @param loader the model refresher
     */
    @objid ("23849fba-2b5c-4985-bd30-3e9a7524e23a")
    public ModelRefreshDeleter(ModelRefresher loader) {
        this.loader = loader;
    }

    /**
     * Delete the given model objects
     * @param rootsToDelete the objects to delete.
     */
    @objid ("d54ae311-3237-40ee-afa6-db6a40bf0a76")
    public void doDelete(Collection<SmObjectImpl> rootsToDelete) {
        // Compute all objects to delete
        Collection<SmObjectImpl> toDelete = new HashSet<>();
        
        for (SmObjectImpl objToDelete : rootsToDelete) {
            getAllComponents(objToDelete, toDelete);
        }
        
        // Set all objects as being deleted
        for (SmObjectImpl obj : toDelete) {
            obj.getData().setRFlags(IRStatus.BEINGDELETED, 0, 0);
        }
        
        boolean success = false;
        try {
            // Detach deleted objects from alive ones, only from the other side.
            for (SmObjectImpl obj : toDelete) {
                ISmObjectData data = obj.getData();
                SmClass cls = data.getClassOf();
                for (final SmDependency dep : cls.getAllDepDef()) {
                    if (!dep.isToDelete()) {
                        SmDependency opposite = dep.getSymetric();
                        if (opposite != null) {
                            for (SmObjectImpl target : obj.getDepValList(dep)) {
                                if (target.isValid()) {
                                    this.loader.eraseObjDepVal(target, opposite, obj);
                                }
                            }
                        }
                    }
                }
            }
            
            // Set all objects as deleted
            for (SmObjectImpl obj : toDelete) {
                this.loader.doDeleteObject(obj);
            }
        
            success = true;
            
        } finally {
            if (!success) {
                // Transaction will be rollbacked except objects state,
                // that must be set back here.
                for (SmObjectImpl obj : toDelete) {
                    final ISmObjectData data = obj.getData();
                    setAsValid(data);
                }
            }
        }
    }

    @objid ("627bf484-70ad-43a4-80e1-4629d6347aa6")
    private void getAllComponents(SmObjectImpl obj, Collection<SmObjectImpl> toDelete) {
        toDelete.add(obj);
        final SmClass cls = obj.getClassOf();
        for (final SmDependency dep : cls.getAllDepDef()) {
            if (dep.isComposition() || dep.isSharedComposition()) {
                if (dep instanceof SmSingleDependency) {
                    SmObjectImpl c = ((SmSingleDependency)dep).getValue(obj.getData());
                    if (c != null && !toDelete.contains(c)) {
                        getAllComponents(c, toDelete);
                    }
                } else {
                    for (SmObjectImpl c : ((SmMultipleDependency)dep).getValueList(obj.getData())) {
                        if (!toDelete.contains(c)) {
                            getAllComponents(c, toDelete);
                        }
                    }
                }
            }
        }
    }

    @objid ("7d4e6b67-a14a-4faa-a1eb-5b8b51bd8559")
    private static void setAsValid(final ISmObjectData data) {
        data.setRFlags(0, IRStatus.DELETED | IRStatus.BEINGDELETED, 0);
    }

}
