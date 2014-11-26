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
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000bf81a-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class GeneralClassImpl extends ClassifierImpl implements GeneralClass {
    @objid ("3d74e538-0dcf-42b6-a4b1-d98cd5de32da")
    @Override
    public boolean isIsElementary() {
        return (Boolean) getAttVal(GeneralClassData.Metadata.IsElementaryAtt());
    }

    @objid ("183872ae-e1bb-4aeb-adbd-2a16462debe5")
    @Override
    public void setIsElementary(boolean value) {
        setAttVal(GeneralClassData.Metadata.IsElementaryAtt(), value);
    }

    @objid ("a9bc8b30-d556-4f0b-b7c0-5305ea8f0b6e")
    @Override
    public EList<BpmnInterface> getBpmnInterfaceRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnInterfaceRefsDep());
    }

    @objid ("5d23a9c6-baf4-4cc4-83fc-78497d3af32e")
    @Override
    public <T extends BpmnInterface> List<T> getBpmnInterfaceRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnInterface element : getBpmnInterfaceRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e32695ed-c463-4ead-972d-38a550b27512")
    @Override
    public EList<Parameter> getOccurence() {
        return new SmList<>(this, GeneralClassData.Metadata.OccurenceDep());
    }

    @objid ("6871b520-cf4a-41bd-9072-f7f83251f1d6")
    @Override
    public <T extends Parameter> List<T> getOccurence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Parameter element : getOccurence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("77bfe2db-753f-47a2-8421-b40c55bff961")
    @Override
    public ExceptionHandler getExceptionInput() {
        return (ExceptionHandler) getDepVal(GeneralClassData.Metadata.ExceptionInputDep());
    }

    @objid ("95713d56-fa7a-4fa4-89db-86f9dd737087")
    @Override
    public void setExceptionInput(ExceptionHandler value) {
        appendDepVal(GeneralClassData.Metadata.ExceptionInputDep(), (SmObjectImpl)value);
    }

    @objid ("51ed32f8-cddb-4598-8464-79a17a1d9144")
    @Override
    public EList<Attribute> getObject() {
        return new SmList<>(this, GeneralClassData.Metadata.ObjectDep());
    }

    @objid ("5c584df8-cab9-48d1-aa98-b42f0acdb2c2")
    @Override
    public <T extends Attribute> List<T> getObject(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Attribute element : getObject()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b166ad11-95f5-4caf-9ba0-c5e5837d850e")
    @Override
    public EList<BpmnMessage> getBpmnMessageRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnMessageRefsDep());
    }

    @objid ("565e3804-a37c-48e1-870c-cd6196d9d7d8")
    @Override
    public <T extends BpmnMessage> List<T> getBpmnMessageRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnMessage element : getBpmnMessageRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e5c1136b-1491-4930-bbfa-5ba0c15fbb45")
    @Override
    public EList<Signal> getSRepresentation() {
        return new SmList<>(this, GeneralClassData.Metadata.SRepresentationDep());
    }

    @objid ("70f5042a-14fa-4fc0-a4f8-f085389510af")
    @Override
    public <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Signal element : getSRepresentation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("43b04434-29fb-4f2d-80aa-938d833e384b")
    @Override
    public EList<BpmnItemDefinition> getBpmnItemDefinitionRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnItemDefinitionRefsDep());
    }

    @objid ("0cfbc477-c5a8-438b-b059-90a0243a72e3")
    @Override
    public <T extends BpmnItemDefinition> List<T> getBpmnItemDefinitionRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnItemDefinition element : getBpmnItemDefinitionRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ea8e3310-c2f9-4688-af39-b0d2a89575d7")
    @Override
    public EList<ObjectNode> getOccurenceObjectNode() {
        return new SmList<>(this, GeneralClassData.Metadata.OccurenceObjectNodeDep());
    }

    @objid ("64b724e1-9c03-4989-b7aa-e630fc00a342")
    @Override
    public <T extends ObjectNode> List<T> getOccurenceObjectNode(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ObjectNode element : getOccurenceObjectNode()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("97428d7f-0f4d-41ef-a591-e7efb8e146e9")
    @Override
    public EList<BpmnItemAwareElement> getBpmnItemAwareRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnItemAwareRefsDep());
    }

    @objid ("41d98fc1-0db1-4b54-9d82-57d88c04e82b")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getBpmnItemAwareRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnItemAwareElement element : getBpmnItemAwareRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ca8c4911-9dee-4017-b1e5-8455eb3e7d9b")
    @Override
    public EList<ModuleParameter> getOccurenceConfigParam() {
        return new SmList<>(this, GeneralClassData.Metadata.OccurenceConfigParamDep());
    }

    @objid ("ffae5895-5ff0-4d45-a6a2-db292e353a25")
    @Override
    public <T extends ModuleParameter> List<T> getOccurenceConfigParam(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModuleParameter element : getOccurenceConfigParam()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("080e9651-d315-4356-a106-41b67c932750")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("e7f4660d-0599-4fa4-a0d9-5f0ca4ddbc1e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("50e3b848-0e4e-4419-a63d-eab012ccaa8b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGeneralClass(this);
        else
          return null;
    }

}
