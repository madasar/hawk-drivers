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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.interactionModel.LifelineData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.behavior.interactionModel.PartDecomposition;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0048dfe6-c4bf-1fd8-97fe-001ec947cd2a")
public class LifelineImpl extends ModelElementImpl implements Lifeline {
    @objid ("85f362b5-0244-42e6-9f54-a6532fc780a6")
    @Override
    public String getSelector() {
        return (String) getAttVal(LifelineData.Metadata.SelectorAtt());
    }

    @objid ("59aaee6b-d8af-4616-9960-df59691142ed")
    @Override
    public void setSelector(String value) {
        setAttVal(LifelineData.Metadata.SelectorAtt(), value);
    }

    @objid ("7081131b-9c36-4fa6-8006-5ae6056b31ab")
    @Override
    public EList<InteractionFragment> getCoveredBy() {
        return new SmList<>(this, LifelineData.Metadata.CoveredByDep());
    }

    @objid ("64a063f9-78d0-4c04-91ad-e335404f1ece")
    @Override
    public <T extends InteractionFragment> List<T> getCoveredBy(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InteractionFragment element : getCoveredBy()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4591347d-aef8-4b29-9ae6-441faff49fcc")
    @Override
    public PartDecomposition getDecomposedAs() {
        return (PartDecomposition) getDepVal(LifelineData.Metadata.DecomposedAsDep());
    }

    @objid ("a7284c86-893a-496c-8b4b-ec03fd7b4d96")
    @Override
    public void setDecomposedAs(PartDecomposition value) {
        appendDepVal(LifelineData.Metadata.DecomposedAsDep(), (SmObjectImpl)value);
    }

    @objid ("177cdb4d-4633-42ab-a8db-d1812b121e1a")
    @Override
    public Interaction getOwner() {
        return (Interaction) getDepVal(LifelineData.Metadata.OwnerDep());
    }

    @objid ("858bf8ab-eb00-40ab-8e05-8a7429dbcc38")
    @Override
    public void setOwner(Interaction value) {
        appendDepVal(LifelineData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("3559092c-f96c-4fad-b407-92727b18c197")
    @Override
    public Instance getRepresented() {
        return (Instance) getDepVal(LifelineData.Metadata.RepresentedDep());
    }

    @objid ("418aaa88-fe52-47c8-8d5d-5f41f408c695")
    @Override
    public void setRepresented(Instance value) {
        appendDepVal(LifelineData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("8789c8ce-9a13-4b49-a71d-9578050e69d4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(LifelineData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7e297f1a-ee85-4c18-a9fb-0bb3b78910da")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(LifelineData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(LifelineData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("f9e3aa71-cd9f-4c3b-8b6c-08d6ef89d0e7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLifeline(this);
        else
          return null;
    }

}
