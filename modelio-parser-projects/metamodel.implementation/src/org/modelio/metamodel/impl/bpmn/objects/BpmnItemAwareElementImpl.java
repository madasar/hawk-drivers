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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00072ee8-c4c0-1fd8-97fe-001ec947cd2a")
public abstract class BpmnItemAwareElementImpl extends BpmnFlowElementImpl implements BpmnItemAwareElement {
    @objid ("1c0baee3-fe8b-42b0-b625-70dc886a1db4")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(BpmnItemAwareElementData.Metadata.TypeDep());
    }

    @objid ("33d3982f-6d60-4f63-b3d8-c32225603bcc")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("eb29181e-0111-429f-b463-4c31461b8b6e")
    @Override
    public EList<BpmnDataAssociation> getTargetOfDataAssociation() {
        return new SmList<>(this, BpmnItemAwareElementData.Metadata.TargetOfDataAssociationDep());
    }

    @objid ("7089d9b9-604f-4f5e-9158-a85f003a2491")
    @Override
    public <T extends BpmnDataAssociation> List<T> getTargetOfDataAssociation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataAssociation element : getTargetOfDataAssociation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("025857c8-14ed-48a2-886b-65e76d1afe12")
    @Override
    public BpmnItemDefinition getItemSubjectRef() {
        return (BpmnItemDefinition) getDepVal(BpmnItemAwareElementData.Metadata.ItemSubjectRefDep());
    }

    @objid ("67a0e276-5ebc-4dbd-ac9a-5d0dc3aa57a2")
    @Override
    public void setItemSubjectRef(BpmnItemDefinition value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.ItemSubjectRefDep(), (SmObjectImpl)value);
    }

    @objid ("25bafca6-c920-490b-a79b-f21d4772524c")
    @Override
    public State getInState() {
        return (State) getDepVal(BpmnItemAwareElementData.Metadata.InStateDep());
    }

    @objid ("b111f646-73bb-40ef-ba6a-1c8a61b826f5")
    @Override
    public void setInState(State value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.InStateDep(), (SmObjectImpl)value);
    }

    @objid ("b274ab94-df2b-4e37-a773-fa7aab80de1e")
    @Override
    public AssociationEnd getRepresentedAssociationEnd() {
        return (AssociationEnd) getDepVal(BpmnItemAwareElementData.Metadata.RepresentedAssociationEndDep());
    }

    @objid ("0c93ad7f-62c4-493f-989a-a101f619c9a7")
    @Override
    public void setRepresentedAssociationEnd(AssociationEnd value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.RepresentedAssociationEndDep(), (SmObjectImpl)value);
    }

    @objid ("94b040d1-182a-4937-9423-196dde1cd90c")
    @Override
    public BpmnDataState getDataState() {
        return (BpmnDataState) getDepVal(BpmnItemAwareElementData.Metadata.DataStateDep());
    }

    @objid ("c749e4d5-bb91-4c89-9c76-1d1d6d2d7af8")
    @Override
    public void setDataState(BpmnDataState value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.DataStateDep(), (SmObjectImpl)value);
    }

    @objid ("5f011b2b-cac6-419c-b6c2-c5ac8d5d03c6")
    @Override
    public EList<BpmnDataAssociation> getSourceOfDataAssociation() {
        return new SmList<>(this, BpmnItemAwareElementData.Metadata.SourceOfDataAssociationDep());
    }

    @objid ("b73aba56-af53-4644-81c2-40c299740926")
    @Override
    public <T extends BpmnDataAssociation> List<T> getSourceOfDataAssociation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataAssociation element : getSourceOfDataAssociation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("174312ab-8149-446f-9c12-fcdc03d90073")
    @Override
    public Attribute getRepresentedAttribute() {
        return (Attribute) getDepVal(BpmnItemAwareElementData.Metadata.RepresentedAttributeDep());
    }

    @objid ("0575cd68-dcf5-49bd-bd84-a364eb922649")
    @Override
    public void setRepresentedAttribute(Attribute value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.RepresentedAttributeDep(), (SmObjectImpl)value);
    }

    @objid ("87c18d12-f6e9-4c0e-81e6-2748f0cacc2b")
    @Override
    public Instance getRepresentedInstance() {
        return (Instance) getDepVal(BpmnItemAwareElementData.Metadata.RepresentedInstanceDep());
    }

    @objid ("43776da8-2b0e-44ea-82bd-1f6489a9be2b")
    @Override
    public void setRepresentedInstance(Instance value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.RepresentedInstanceDep(), (SmObjectImpl)value);
    }

    @objid ("724aa893-aaab-4274-acb2-55941175d5ad")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("c2824f92-67c2-41de-be10-4134987cde55")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("bc512a50-b551-4323-9503-f245c6019a6e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnItemAwareElement(this);
        else
          return null;
    }

}
