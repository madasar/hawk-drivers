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
import org.eclipse.emf.ecore.resource.Resource;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;

/**
 * Dummy {@link IRepositoryObject} that does nothing.
 * <p>
 * This is the initial repository object of a {@link SmObjectData}.
 * Allows reading an object but forbids its modification.
 */
@objid ("bba8b402-2ceb-11e2-81f1-001ec947ccaf")
class DummyRepositoryObject implements IRepositoryObject {
    /**
     * Get the singleton
     */
    @objid ("fca7a9d3-2cec-11e2-81f1-001ec947ccaf")
     static final IRepositoryObject instance = new DummyRepositoryObject();

    /**
     * Private singleton constructor
     */
    @objid ("fca7a9d6-2cec-11e2-81f1-001ec947ccaf")
    private DummyRepositoryObject() {
        // nothing
    }

    @objid ("fcaa0c27-2cec-11e2-81f1-001ec947ccaf")
    @Override
    public void attModified(SmObjectImpl obj, SmAttribute att) {
        throwWrongCall(obj);
    }

    @objid ("fcaa0c2c-2cec-11e2-81f1-001ec947ccaf")
    @Override
    public void depValAppended(SmObjectImpl obj, SmDependency dep, SmObjectImpl val) {
        throwWrongCall(obj);
    }

    @objid ("fcaa0c32-2cec-11e2-81f1-001ec947ccaf")
    private static void throwWrongCall(SmObjectImpl obj) {
        throw new UnsupportedOperationException(obj+" repository object not initialized.");
    }

    @objid ("fcaa0c35-2cec-11e2-81f1-001ec947ccaf")
    @Override
    public void depValErased(SmObjectImpl obj, SmDependency dep, SmObjectImpl val) {
        throwWrongCall(obj);
    }

    @objid ("fcaa0c3b-2cec-11e2-81f1-001ec947ccaf")
    @Override
    public void depValMoved(SmObjectImpl obj, SmDependency dep, SmObjectImpl val) {
        throwWrongCall(obj);
    }

    @objid ("fcaa0c41-2cec-11e2-81f1-001ec947ccaf")
    @Override
    public boolean isDepLoaded(SmObjectImpl obj, SmDependency dep) {
        return true;
    }

    @objid ("fcaa0c48-2cec-11e2-81f1-001ec947ccaf")
    @Override
    public boolean isPersistent(SmDependency dep) {
        return false;
    }

    @objid ("fcaa0c4e-2cec-11e2-81f1-001ec947ccaf")
    @Override
    public boolean isAttLoaded(SmObjectImpl obj, SmAttribute att) {
        return true;
    }

    @objid ("fcaa0c54-2cec-11e2-81f1-001ec947ccaf")
    @Override
    public void loadDep(SmObjectImpl obj, SmDependency dep) {
        // do nothing
    }

    @objid ("fcaa0c59-2cec-11e2-81f1-001ec947ccaf")
    @Override
    public void loadAtt(SmObjectImpl obj, SmAttribute att) {
        // do nothing
    }

    @objid ("fcaa0c5d-2cec-11e2-81f1-001ec947ccaf")
    @Override
    public byte getRepositoryId() {
        return -100;
    }

    @objid ("fcaa0c62-2cec-11e2-81f1-001ec947ccaf")
    @Override
    public Resource getEmfResource() {
        throw new UnsupportedOperationException();
    }

    @objid ("fcaa0c66-2cec-11e2-81f1-001ec947ccaf")
    @Override
    public void detach(SmObjectImpl obj) {
        // do nothing
    }

    @objid ("fcaa0c6a-2cec-11e2-81f1-001ec947ccaf")
    @Override
    public void attach(SmObjectImpl obj) {
        throwWrongCall(obj);
    }

    @objid ("fcaa0c6e-2cec-11e2-81f1-001ec947ccaf")
    @Override
    public void unload(SmObjectImpl obj) {
        // do nothing
    }

    @objid ("dc274964-4868-11e2-91c9-001ec947ccaf")
    @Override
    public boolean isDirty(SmObjectImpl obj) {
        return true;
    }

}
