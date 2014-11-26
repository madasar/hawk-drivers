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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.ModelTreeData;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0089574c-c4be-1fd8-97fe-001ec947cd2a")
public abstract class ModelTreeImpl extends ModelElementImpl implements ModelTree {
    @objid ("3600f7c9-83bd-4ba1-9ca0-953c58b85727")
    @Override
    public ModelTree getOwner() {
        return (ModelTree) getDepVal(ModelTreeData.Metadata.OwnerDep());
    }

    @objid ("82a5d8ff-5010-43b4-9e6f-80b2a1cc5784")
    @Override
    public void setOwner(ModelTree value) {
        appendDepVal(ModelTreeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("589c049e-3023-43b7-ad65-6fad4b9f4dc4")
    @Override
    public EList<ModelTree> getOwnedElement() {
        return new SmList<>(this, ModelTreeData.Metadata.OwnedElementDep());
    }

    @objid ("30a5d244-95d8-4049-8c54-227dc9d67f23")
    @Override
    public <T extends ModelTree> List<T> getOwnedElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModelTree element : getOwnedElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("610d6379-50f3-4693-be8c-8b0541448451")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelTreeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("44040cc9-d9b2-4247-b23a-b2fd11c3420f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelTreeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ModelTreeData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("14bfaac3-70d8-4767-abe9-f15887ef1e34")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModelTree(this);
        else
          return null;
    }

}
