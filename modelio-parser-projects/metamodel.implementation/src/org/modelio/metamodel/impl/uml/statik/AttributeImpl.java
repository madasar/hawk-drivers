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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.data.uml.statik.AttributeData;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00981c78-c4be-1fd8-97fe-001ec947cd2a")
public class AttributeImpl extends StructuralFeatureImpl implements Attribute {
    @objid ("e12813ff-59e3-41ab-aa55-18f27fb030d0")
    @Override
    public String getTypeConstraint() {
        return (String) getAttVal(AttributeData.Metadata.TypeConstraintAtt());
    }

    @objid ("fac539c7-4379-4c2c-933b-452c36b920a9")
    @Override
    public void setTypeConstraint(String value) {
        setAttVal(AttributeData.Metadata.TypeConstraintAtt(), value);
    }

    @objid ("536c4f3e-9cde-4f61-b53d-815a2f88d8e5")
    @Override
    public String getValue() {
        return (String) getAttVal(AttributeData.Metadata.ValueAtt());
    }

    @objid ("9598639b-3200-4eaf-b5e6-8025fb4602b9")
    @Override
    public void setValue(String value) {
        setAttVal(AttributeData.Metadata.ValueAtt(), value);
    }

    @objid ("f91f213f-08b8-4654-b290-6e7885cc4447")
    @Override
    public boolean isTargetIsClass() {
        return (Boolean) getAttVal(AttributeData.Metadata.TargetIsClassAtt());
    }

    @objid ("c816fc13-0c8f-4db7-a637-40bbc0d75728")
    @Override
    public void setTargetIsClass(boolean value) {
        setAttVal(AttributeData.Metadata.TargetIsClassAtt(), value);
    }

    @objid ("edea8325-8de3-4f6c-8cc9-d1ad9b3fd61a")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(AttributeData.Metadata.TypeDep());
    }

    @objid ("82c47496-9c83-4b2d-837f-0f6df099ff41")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(AttributeData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("c513dd54-ea0a-47ac-9686-e47c0214e940")
    @Override
    public Classifier getOwner() {
        return (Classifier) getDepVal(AttributeData.Metadata.OwnerDep());
    }

    @objid ("08bb639a-b685-4174-b0ee-265815905e10")
    @Override
    public void setOwner(Classifier value) {
        appendDepVal(AttributeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("4cccd659-2fe9-427b-ac50-2cc0c5a10ab9")
    @Override
    public EList<AttributeLink> getOccurence() {
        return new SmList<>(this, AttributeData.Metadata.OccurenceDep());
    }

    @objid ("120e6ee3-489f-43eb-a090-8e5ab39dcf30")
    @Override
    public <T extends AttributeLink> List<T> getOccurence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AttributeLink element : getOccurence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2e5918a0-6828-4a6f-ad12-0b01d1ca35ad")
    @Override
    public EList<BpmnItemAwareElement> getRepresentingItem() {
        return new SmList<>(this, AttributeData.Metadata.RepresentingItemDep());
    }

    @objid ("13e85bf7-4a11-4b91-ac29-543c3f93062d")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnItemAwareElement element : getRepresentingItem()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fc680a57-6f0e-4a40-9450-6c5f0749910d")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, AttributeData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("2d74b188-fe29-483f-90ee-ea958acdabc0")
    @Override
    public <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ObjectNode element : getRepresentingObjectNode()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e9b4a1fc-5543-4709-a9a6-03b9a562636e")
    @Override
    public AssociationEnd getQualified() {
        return (AssociationEnd) getDepVal(AttributeData.Metadata.QualifiedDep());
    }

    @objid ("0d54d47c-14c0-423c-b799-0b19ed2af929")
    @Override
    public void setQualified(AssociationEnd value) {
        appendDepVal(AttributeData.Metadata.QualifiedDep(), (SmObjectImpl)value);
    }

    @objid ("bfafaf91-5f9f-45da-bd58-9a8aaa1c29ee")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AttributeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(AttributeData.Metadata.QualifiedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("12349b72-b710-4cac-aa39-9fcfbb7d1bf9")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AttributeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(AttributeData.Metadata.OwnerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(AttributeData.Metadata.QualifiedDep());
        if (obj != null)
          return new SmDepVal(AttributeData.Metadata.QualifiedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("d06f57a1-7918-4029-b07a-4a2542eb5b05")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAttribute(this);
        else
          return null;
    }

}
