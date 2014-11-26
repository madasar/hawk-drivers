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

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.vcore.smkernel.meta.SmDependency;

/**
 * Model object dependency content implementation.
 * <p>
 * This list reflects the content of a dependency on a object.
 * Modifying this list content does modify the represented object through
 * the {@link SmObjectImpl} API.
 * 
 * @param <T> the type of the dependency
 */
@objid ("005d71f4-fd81-1f1f-85a5-001ec947cd2a")
public class SmList<T> extends AbstractList<T> implements EList<T> {
    @objid ("9eed5290-2278-11e2-bbf3-001ec947ccaf")
    private List<T> delegateList;

    @objid ("005d57b4-fd81-1f1f-85a5-001ec947cd2a")
    private final SmObjectImpl owner;

    @objid ("005d70be-fd81-1f1f-85a5-001ec947cd2a")
    private final SmDependency dep;

    /**
     * Instantiate the SmList.
     * @param owner the represented model object
     * @param dep the represented model dependency
     */
    @objid ("005d6aa6-fd81-1f1f-85a5-001ec947cd2a")
    public SmList(final SmObjectImpl owner, final SmDependency dep) {
        this.owner = owner;
        this.dep = dep;
        this.delegateList = null;
    }

    @objid ("005d043a-fd81-1f1f-85a5-001ec947cd2a")
    @Override
    public boolean add(final T value) {
        this.modCount++;
        return this.owner.appendDepVal(this.dep, (SmObjectImpl) value);
    }

    @objid ("005d5bce-fd81-1f1f-85a5-001ec947cd2a")
    @Override
    public void add(final int index, final T value) {
        this.modCount++;
        this.owner.appendDepVal(this.dep, (SmObjectImpl) value, index);
        return;
    }

    @objid ("005d652e-fd81-1f1f-85a5-001ec947cd2a")
    @Override
    public void clear() {
        this.modCount++;
        for (SmObjectImpl obj : toArray(new SmObjectImpl[size()])) {
            this.owner.eraseDepVal(this.dep, obj);
        }
    }

    @objid ("005d6420-fd81-1f1f-85a5-001ec947cd2a")
    @Override
    public boolean contains(final Object value) {
        return getDelegateList().contains(value);
    }

    @objid ("005d5534-fd81-1f1f-85a5-001ec947cd2a")
    @Override
    public boolean containsAll(final Collection<?> values) {
        return getDelegateList().containsAll(values);
    }

    @objid ("005d5426-fd81-1f1f-85a5-001ec947cd2a")
    @Override
    public T get(final int index) {
        return getDelegateList().get(index);
    }

    @objid ("005d5386-fd81-1f1f-85a5-001ec947cd2a")
    @Override
    public int indexOf(final Object value) {
        return getDelegateList().indexOf(value);
    }

    @objid ("005d4e54-fd81-1f1f-85a5-001ec947cd2a")
    @Override
    public int lastIndexOf(final Object value) {
        return getDelegateList().lastIndexOf(value);
    }

    @objid ("005d4062-fd81-1f1f-85a5-001ec947cd2a")
    @Override
    public boolean remove(final Object value) {
        if (value instanceof SmObjectImpl) {
            this.modCount++;
            return this.owner.eraseDepVal(this.dep, (SmObjectImpl) value);
        } else {
            return false;
        }
    }

    @objid ("005d04d0-fd81-1f1f-85a5-001ec947cd2a")
    @Override
    public T remove(final int index) {
        T value = get(index);
        this.modCount++;
        return this.owner.eraseDepVal(this.dep, (SmObjectImpl) value) ? value : null;
    }

    @objid ("005d0d18-fd81-1f1f-85a5-001ec947cd2a")
    @Override
    public boolean retainAll(final Collection<?> values) {
        List<T> toRemove = new ArrayList<>();
        
        for (T obj : getDelegateList()) {
            if (!values.contains(obj)) {
                toRemove.add(obj);
            }
        }
        return removeAll(toRemove);
    }

    @objid ("005d0b6a-fd81-1f1f-85a5-001ec947cd2a")
    @Override
    @SuppressWarnings("unchecked")
    public T set(final int index, final T value) {
        return (T) this.owner.setDepVal(this.dep, index, (SmObjectImpl) value);
    }

    @objid ("005d099e-fd81-1f1f-85a5-001ec947cd2a")
    @Override
    public int size() {
        return getDelegateList().size();
    }

    @objid ("005d2596-fd81-1f1f-85a5-001ec947cd2a")
    @Override
    public Object[] toArray() {
        return getDelegateList().toArray();
    }

    @objid ("005d0c82-fd81-1f1f-85a5-001ec947cd2a")
    @Override
    public <U> U[] toArray(final U[] a) {
        return getDelegateList().toArray(a);
    }

    @objid ("005d2f50-fd81-1f1f-85a5-001ec947cd2a")
    @SuppressWarnings("unchecked")
    private List<T> getDelegateList() {
        if (this.delegateList == null) {
            Object ret = this.owner.getDepVal(this.dep);
        
            if (ret instanceof List) {
                this.delegateList = (List<T>) ret;
            } else if (ret == null) {
                this.delegateList = Collections.emptyList();
            } else {
                this.delegateList = Collections.singletonList((T) ret);
            }
        }
        return this.delegateList;
    }

    @objid ("0014de08-3493-1f35-b94f-001ec947cd2a")
    @Override
    public void move(int newPosition, T object) {
        int oldPosition = indexOf(object);
        
        this.owner.getMetaOf().moveObjDepVal(
                this.owner, 
                this.dep, 
                (SmObjectImpl) object, 
                newPosition - oldPosition);
    }

    @objid ("001508a6-3493-1f35-b94f-001ec947cd2a")
    @Override
    public T move(int newPosition, int oldPosition) {
        T object = get(oldPosition);
        this.owner.getMetaOf().moveObjDepVal(
                this.owner, 
                this.dep, 
                (SmObjectImpl) object, 
                newPosition - oldPosition);
        return object;
    }

}
