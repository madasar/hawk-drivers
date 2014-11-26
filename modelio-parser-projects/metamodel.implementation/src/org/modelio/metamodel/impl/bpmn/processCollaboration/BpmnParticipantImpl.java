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
package org.modelio.metamodel.impl.bpmn.processCollaboration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.bpmnService.BpmnEndPoint;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnParticipantData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0075ac2e-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnParticipantImpl extends BpmnBaseElementImpl implements BpmnParticipant {
    @objid ("a0cfd924-b0cb-4ce8-83b3-7fdde320cd4f")
    @Override
    public int getMultiplicityMin() {
        return (Integer) getAttVal(BpmnParticipantData.Metadata.MultiplicityMinAtt());
    }

    @objid ("2955a7b8-a344-40f4-b83e-3cd872fe0379")
    @Override
    public void setMultiplicityMin(int value) {
        setAttVal(BpmnParticipantData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("5a9fdb27-54e0-4388-822f-1954fc2c584a")
    @Override
    public int getMultiplicityMax() {
        return (Integer) getAttVal(BpmnParticipantData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("b1262136-b0ae-413d-b229-6b9f2f1fa930")
    @Override
    public void setMultiplicityMax(int value) {
        setAttVal(BpmnParticipantData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("ad5e077c-c405-4d79-8e10-244f4c257bf5")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnParticipantData.Metadata.ProcessDep());
    }

    @objid ("9fadc340-c6b6-43d7-bf42-c82279dc6b83")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnParticipantData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("8b1261fd-81b6-419d-b842-017ba828fc4f")
    @Override
    public BpmnCollaboration getContainer() {
        return (BpmnCollaboration) getDepVal(BpmnParticipantData.Metadata.ContainerDep());
    }

    @objid ("f1b9b4d4-19dd-4e46-9ec2-0226333b53e9")
    @Override
    public void setContainer(BpmnCollaboration value) {
        appendDepVal(BpmnParticipantData.Metadata.ContainerDep(), (SmObjectImpl)value);
    }

    @objid ("9e358ef1-c83a-41d0-9b15-00a8c1236d0c")
    @Override
    public Classifier getType() {
        return (Classifier) getDepVal(BpmnParticipantData.Metadata.TypeDep());
    }

    @objid ("984832e4-6891-40ac-b781-268f4df7bd55")
    @Override
    public void setType(Classifier value) {
        appendDepVal(BpmnParticipantData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("5d601d27-1cb8-44af-9af3-1927f5c7bf8a")
    @Override
    public EList<BpmnEndPoint> getEndPointRefs() {
        return new SmList<>(this, BpmnParticipantData.Metadata.EndPointRefsDep());
    }

    @objid ("beaceebf-74e7-44a5-9d81-ec7fce5b311b")
    @Override
    public <T extends BpmnEndPoint> List<T> getEndPointRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnEndPoint element : getEndPointRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("392d2c8f-5325-421d-a8fb-6cc553f79a0f")
    @Override
    public EList<BpmnInterface> getInterfaceRefs() {
        return new SmList<>(this, BpmnParticipantData.Metadata.InterfaceRefsDep());
    }

    @objid ("5981286b-c65a-4306-953a-a0dfc8057602")
    @Override
    public <T extends BpmnInterface> List<T> getInterfaceRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnInterface element : getInterfaceRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0f711915-29ec-4fbe-83a7-04fe00c5e657")
    @Override
    public Package getPackageRef() {
        return (Package) getDepVal(BpmnParticipantData.Metadata.PackageRefDep());
    }

    @objid ("71f9445c-a9ec-4210-b6cb-b6c349e58d25")
    @Override
    public void setPackageRef(Package value) {
        appendDepVal(BpmnParticipantData.Metadata.PackageRefDep(), (SmObjectImpl)value);
    }

    @objid ("b2a75342-9c87-4624-a1bd-d287979db9e9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnParticipantData.Metadata.ContainerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e35e03e0-fd16-46cd-a764-1973b2b3762b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnParticipantData.Metadata.ContainerDep());
        if (obj != null)
          return new SmDepVal(BpmnParticipantData.Metadata.ContainerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("d309a6ce-629a-4a7b-beff-3bc12d3cb061")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnParticipant(this);
        else
          return null;
    }

}
