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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.informationFlow.InformationItem;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.ComponentRealization;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00039a6c-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ClassifierImpl extends NameSpaceImpl implements Classifier {
    @objid ("82f03d12-4a2d-4a55-9da5-949a5debd6e9")
    @Override
    public EList<Operation> getOwnedOperation() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedOperationDep());
    }

    @objid ("972edabb-2926-4e39-bd03-ce10bbb70297")
    @Override
    public <T extends Operation> List<T> getOwnedOperation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Operation element : getOwnedOperation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("eec95abb-9c2e-4762-a103-6326cd9990f8")
    @Override
    public EList<InformationItem> getRepresentation() {
        return new SmList<>(this, ClassifierData.Metadata.RepresentationDep());
    }

    @objid ("f351bfa5-55f3-42f4-8079-01d94e65e63b")
    @Override
    public <T extends InformationItem> List<T> getRepresentation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationItem element : getRepresentation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fc1cf0b6-2909-419c-bb20-19213f0ef39a")
    @Override
    public EList<Substitution> getSubstitued() {
        return new SmList<>(this, ClassifierData.Metadata.SubstituedDep());
    }

    @objid ("c3388f9b-df21-4e03-994d-fa078cd4af44")
    @Override
    public <T extends Substitution> List<T> getSubstitued(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Substitution element : getSubstitued()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a38bdb9a-2d37-42a0-85ed-ff842bdc48bd")
    @Override
    public EList<Attribute> getOwnedAttribute() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedAttributeDep());
    }

    @objid ("05cfba23-edb9-4925-a67b-88a1e8e1b217")
    @Override
    public <T extends Attribute> List<T> getOwnedAttribute(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Attribute element : getOwnedAttribute()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("764956b2-90c7-485e-a4d7-9fd584445f07")
    @Override
    public EList<NaryAssociationEnd> getOwnedNaryEnd() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedNaryEndDep());
    }

    @objid ("bdc44b2e-9259-49df-95b0-f40cb753e6db")
    @Override
    public <T extends NaryAssociationEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NaryAssociationEnd element : getOwnedNaryEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("08d57e13-d443-4aee-be78-d8d9d9ac17fb")
    @Override
    public EList<InformationFlow> getConveyer() {
        return new SmList<>(this, ClassifierData.Metadata.ConveyerDep());
    }

    @objid ("749e173a-d33c-40ac-9dd4-79e347558b7a")
    @Override
    public <T extends InformationFlow> List<T> getConveyer(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getConveyer()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e5ce8104-5ac6-4cff-aa82-6245f5553a98")
    @Override
    public EList<Substitution> getSubstitutingSubstitution() {
        return new SmList<>(this, ClassifierData.Metadata.SubstitutingSubstitutionDep());
    }

    @objid ("611f883f-0dd4-43cc-9463-55d4699f5e72")
    @Override
    public <T extends Substitution> List<T> getSubstitutingSubstitution(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Substitution element : getSubstitutingSubstitution()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f664479e-09cd-46de-b70a-7074818bfe17")
    @Override
    public EList<AssociationEnd> getTargetingEnd() {
        return new SmList<>(this, ClassifierData.Metadata.TargetingEndDep());
    }

    @objid ("8d753f1f-5847-4671-aa9c-c5913cbcdcee")
    @Override
    public <T extends AssociationEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AssociationEnd element : getTargetingEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f4e7022b-ee89-43db-ae8b-ec92dd768c82")
    @Override
    public EList<AssociationEnd> getOwnedEnd() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedEndDep());
    }

    @objid ("356d71f7-1b9f-4142-a9cd-5baddf3af486")
    @Override
    public <T extends AssociationEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AssociationEnd element : getOwnedEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("98d2d4cf-ed07-4eed-b7fb-1cae11b777d0")
    @Override
    public EList<BpmnParticipant> getBpmnRepresents() {
        return new SmList<>(this, ClassifierData.Metadata.BpmnRepresentsDep());
    }

    @objid ("78a0a7e6-7ed7-40be-9681-34df8e9b3d6f")
    @Override
    public <T extends BpmnParticipant> List<T> getBpmnRepresents(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnParticipant element : getBpmnRepresents()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("382dc5bb-0dc4-4b4d-af75-49a826aa16b7")
    @Override
    public EList<RaisedException> getThrowing() {
        return new SmList<>(this, ClassifierData.Metadata.ThrowingDep());
    }

    @objid ("d2ab6d28-6cc0-440b-ab84-fe7ed8940019")
    @Override
    public <T extends RaisedException> List<T> getThrowing(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final RaisedException element : getThrowing()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2e5d5d2a-8c4f-4872-af25-220d477c1890")
    @Override
    public EList<BindableInstance> getInternalStructure() {
        return new SmList<>(this, ClassifierData.Metadata.InternalStructureDep());
    }

    @objid ("ada2c440-647e-4439-a3b7-010f6def2a14")
    @Override
    public <T extends BindableInstance> List<T> getInternalStructure(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BindableInstance element : getInternalStructure()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("34fbf0dc-77c8-47cb-b095-6730ac23b795")
    @Override
    public EList<ComponentRealization> getRealizedComponent() {
        return new SmList<>(this, ClassifierData.Metadata.RealizedComponentDep());
    }

    @objid ("1126b169-fd32-4b28-b395-7124997dceab")
    @Override
    public <T extends ComponentRealization> List<T> getRealizedComponent(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ComponentRealization element : getRealizedComponent()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c22eb642-ee0a-421f-8fd7-876397bf59cd")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("0e70e2a0-2b69-408b-8bd8-339a36e5b35f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("a655d8f9-62d2-4200-a211-ffdfcb6a4b32")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClassifier(this);
        else
          return null;
    }

}
