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
                                    

package org.modelio.vcore.smkernel.meta;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.SmObjectImpl;

/**
 * Represents a single dependency, ie when max cardinality is exactly one.
 */
@objid ("0001b576-0a98-1f20-85a5-001ec947cd2a")
public abstract class SmSingleDependency extends SmDependency {
    /**
     * Get the dependency value. This getter accessor is redefined by specialized classes to access the proper data field.
     */
    @objid ("0001bdf0-0a98-1f20-85a5-001ec947cd2a")
    public abstract SmObjectImpl getValue(final ISmObjectData object);

    /**
     * Set the dependency value. This setter accessor is redefined by specialized classes to modify the proper data field.
     */
    @objid ("0001d542-0a98-1f20-85a5-001ec947cd2a")
    public abstract void setValue(final ISmObjectData object, final SmObjectImpl value);

    /**
     * Clear the value if the given one was the current one.
     * @param obj The object to modify
     * @param value the value to remove
     */
    @objid ("0001fbda-0a98-1f20-85a5-001ec947cd2a")
    @Override
    public boolean remove(final SmObjectImpl obj, final SmObjectImpl value) {
        if (value != null && value.equals(getValue(obj.getData()))) {
            setValue(obj.getData(), null);
            return true;
        } else {
            return false;
        }
    }

    /**
     * <code>insert()</code> interpretation for single dependency:
     * <ul>
     * <li>set the dependency value to the given value
     * <li>ignore the index parameter
     * </ul>
     * @param obj The object to modify
     * @param value the value to add/set
     */
    @objid ("0002382a-0a98-1f20-85a5-001ec947cd2a")
    @Override
    public void insert(final SmObjectImpl obj, final SmObjectImpl value, final int index) {
        setValue(obj.getData(), value);
    }

    /**
     * Set the value to the given value
     * @param obj The object to modify
     * @param value the value to add/set
     * @return <code>true</code> if a change was done, <code>false</code> if no change was needed (the value was already present).
     */
    @objid ("000282ee-0a98-1f20-85a5-001ec947cd2a")
    @Override
    public boolean add(final SmObjectImpl obj, final SmObjectImpl value) {
        setValue(obj.getData(), value);
        return true;
    }

    /**
     * For single dep, null is considered as valid for any type
     */
    @objid ("0001e910-3243-1085-9e4a-001ec947cd2a")
    @Override
    public void assertValueType(final SmObjectImpl smObjectImpl, final Object value) {
        if (value != null) {
            this.checker.assertType(smObjectImpl, value);
        }
    }

    /**
     * Fake dependency are used to implement fictitious single dependencies.
     * 
     * @author phv
     */
    @objid ("0002d0dc-0a98-1f20-85a5-001ec947cd2a")
    static class SmFakeDependency extends SmSingleDependency {
        @objid ("0002e644-0a98-1f20-85a5-001ec947cd2a")
        @Override
        public SmObjectImpl getValue(final ISmObjectData object) {
            return null;
        }

        @objid ("00031e5c-0a98-1f20-85a5-001ec947cd2a")
        @Override
        public void setValue(final ISmObjectData object, final SmObjectImpl value) {
            // do nothing
        }

        @objid ("00035886-0a98-1f20-85a5-001ec947cd2a")
        public SmFakeDependency() {
        }

        @objid ("0046d3ea-8b25-1f3a-aafd-001ec947cd2a")
        @Override
        public SmDependency getSymetric() {
            // TODO Auto-generated method stub
            return null;
        }

    }

}
