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
import org.modelio.metamodel.data.uml.infrastructure.ConstraintData;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00856a60-c4be-1fd8-97fe-001ec947cd2a")
public class ConstraintImpl extends ModelElementImpl implements Constraint {
    @objid ("006b6ba6-4224-10bf-bd58-001ec947cd2a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        List<SmObjectImpl> list = this.getDepValList(ConstraintData.Metadata.ConstrainedElementDep());
        if (list.isEmpty())
            return super.getCompositionOwner();
        else
            return list.get(0);
    }

    @objid ("006b90fe-4224-10bf-bd58-001ec947cd2a")
    @Override
    public SmDepVal getCompositionRelation() {
        List<SmObjectImpl> list = this.getDepValList(ConstraintData.Metadata.ConstrainedElementDep());
        if (list.isEmpty())
            return super.getCompositionRelation();
        else
          return new SmDepVal(ConstraintData.Metadata.ConstrainedElementDep(), list.get(0));
    }

    @objid ("dc0243f1-0d07-41a0-a075-8956cb67cd32")
    @Override
    public void afterEraseDepVal(SmDependency dep, SmObjectImpl value) {
        if (dep == ConstraintData.Metadata.ConstrainedElementDep()) {
            // Workaround bug where the storage handle is not updated
            EList<ModelElement> remainingOwners = getConstrainedElement();
            if (! remainingOwners.isEmpty()) {
                // Remove and add again the first remaining owner.
                // Note : this will trigger recursively the removal & addition of all other owners.
                ModelElement r = remainingOwners.get(0);
                r.getConstraintDefinition().remove(this);
                
                r.getConstraintDefinition().add(this);
            }
        }
        
        super.afterEraseDepVal(dep, value);
    }

    @objid ("3794a28b-179c-4904-88da-7c1c4708b176")
    @Override
    public String getBaseClass() {
        return (String) getAttVal(ConstraintData.Metadata.BaseClassAtt());
    }

    @objid ("cfd0b6c3-6b8c-43ce-bdf1-80dd249e36bb")
    @Override
    public void setBaseClass(String value) {
        setAttVal(ConstraintData.Metadata.BaseClassAtt(), value);
    }

    @objid ("7db92708-c6cb-4beb-9f1c-7b3de02d9580")
    @Override
    public String getBody() {
        return (String) getAttVal(ConstraintData.Metadata.BodyAtt());
    }

    @objid ("f92558d5-7885-439b-8e52-120a3e8c71b7")
    @Override
    public void setBody(String value) {
        setAttVal(ConstraintData.Metadata.BodyAtt(), value);
    }

    @objid ("6f122f54-a3d1-4edb-bf53-fcd54da45634")
    @Override
    public String getLanguage() {
        return (String) getAttVal(ConstraintData.Metadata.LanguageAtt());
    }

    @objid ("d49477b3-95f3-451a-a144-4f0189641bf0")
    @Override
    public void setLanguage(String value) {
        setAttVal(ConstraintData.Metadata.LanguageAtt(), value);
    }

    @objid ("6e96e077-3e78-4d18-a77e-91c701c439a3")
    @Override
    public EList<ModelElement> getConstrainedElement() {
        return new SmList<>(this, ConstraintData.Metadata.ConstrainedElementDep());
    }

    @objid ("c1955e63-ba5c-46be-8891-3cc6cfed9e6c")
    @Override
    public <T extends ModelElement> List<T> getConstrainedElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModelElement element : getConstrainedElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("851f75f7-57c4-4777-b761-a30c6781f3a8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConstraint(this);
        else
          return null;
    }

}
