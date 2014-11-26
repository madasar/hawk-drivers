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
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataAssociationData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0004abfa-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataAssociationImpl extends BpmnBaseElementImpl implements BpmnDataAssociation {
    @objid ("ce117fa8-14cc-4146-bdc9-15590f7f4a9c")
    @Override
    public String getAssignment() {
        return (String) getAttVal(BpmnDataAssociationData.Metadata.AssignmentAtt());
    }

    @objid ("6f91bf3a-93ad-4a2d-8944-6038cccfc19c")
    @Override
    public void setAssignment(String value) {
        setAttVal(BpmnDataAssociationData.Metadata.AssignmentAtt(), value);
    }

    @objid ("7f524137-0d76-4298-8b00-ac9ed7f293a8")
    @Override
    public String getTransfomation() {
        return (String) getAttVal(BpmnDataAssociationData.Metadata.TransfomationAtt());
    }

    @objid ("9daed711-dd04-491a-8ed8-4e94b1214e5a")
    @Override
    public void setTransfomation(String value) {
        setAttVal(BpmnDataAssociationData.Metadata.TransfomationAtt(), value);
    }

    @objid ("7470a4ab-6ad9-4dd0-9e6e-522b94ec7a76")
    @Override
    public String getLanguage() {
        return (String) getAttVal(BpmnDataAssociationData.Metadata.LanguageAtt());
    }

    @objid ("e083289c-60d3-4048-8f12-17cfd93434f5")
    @Override
    public void setLanguage(String value) {
        setAttVal(BpmnDataAssociationData.Metadata.LanguageAtt(), value);
    }

    @objid ("21552f5b-cf75-41de-8089-7fc250806d41")
    @Override
    public EList<BpmnItemAwareElement> getSourceRef() {
        return new SmList<>(this, BpmnDataAssociationData.Metadata.SourceRefDep());
    }

    @objid ("aab342b6-ab15-45ab-b51e-7e0153dd2fd4")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getSourceRef(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnItemAwareElement element : getSourceRef()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b96fc940-36f1-42ba-9aa4-6c5051a22c7a")
    @Override
    public BpmnItemAwareElement getTargetRef() {
        return (BpmnItemAwareElement) getDepVal(BpmnDataAssociationData.Metadata.TargetRefDep());
    }

    @objid ("7b6ca53d-b8a2-4733-8115-fa44d1159174")
    @Override
    public void setTargetRef(BpmnItemAwareElement value) {
        appendDepVal(BpmnDataAssociationData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("4a95d094-dc1b-478c-9c52-350beab263c9")
    @Override
    public BpmnActivity getEndingActivity() {
        return (BpmnActivity) getDepVal(BpmnDataAssociationData.Metadata.EndingActivityDep());
    }

    @objid ("362d0ac5-baae-4347-9097-f7f2832aa24e")
    @Override
    public void setEndingActivity(BpmnActivity value) {
        appendDepVal(BpmnDataAssociationData.Metadata.EndingActivityDep(), (SmObjectImpl)value);
    }

    @objid ("72e0155c-05a1-4c6b-8a8c-b166cf238047")
    @Override
    public BpmnActivity getStartingActivity() {
        return (BpmnActivity) getDepVal(BpmnDataAssociationData.Metadata.StartingActivityDep());
    }

    @objid ("b0b5a7e0-1d09-453b-ae29-3634d23785c0")
    @Override
    public void setStartingActivity(BpmnActivity value) {
        appendDepVal(BpmnDataAssociationData.Metadata.StartingActivityDep(), (SmObjectImpl)value);
    }

    @objid ("842a18c6-155b-4f3f-b7db-9db9d4de6065")
    @Override
    public BpmnThrowEvent getStartingEvent() {
        return (BpmnThrowEvent) getDepVal(BpmnDataAssociationData.Metadata.StartingEventDep());
    }

    @objid ("10c20367-f3c5-45d6-bd3b-fbafa5fa76b4")
    @Override
    public void setStartingEvent(BpmnThrowEvent value) {
        appendDepVal(BpmnDataAssociationData.Metadata.StartingEventDep(), (SmObjectImpl)value);
    }

    @objid ("f0d4c313-3d39-4aa6-8259-7bff345c19ab")
    @Override
    public EList<BpmnSequenceFlowDataAssociation> getVisualShortCut() {
        return new SmList<>(this, BpmnDataAssociationData.Metadata.VisualShortCutDep());
    }

    @objid ("178ca28e-1e2d-4c2c-b877-bfd1ed58031b")
    @Override
    public <T extends BpmnSequenceFlowDataAssociation> List<T> getVisualShortCut(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnSequenceFlowDataAssociation element : getVisualShortCut()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0e4a92e3-691e-4893-b19d-ac47656a738a")
    @Override
    public BpmnCatchEvent getEndingEvent() {
        return (BpmnCatchEvent) getDepVal(BpmnDataAssociationData.Metadata.EndingEventDep());
    }

    @objid ("6395426d-8a88-4d17-b138-caacad0bd207")
    @Override
    public void setEndingEvent(BpmnCatchEvent value) {
        appendDepVal(BpmnDataAssociationData.Metadata.EndingEventDep(), (SmObjectImpl)value);
    }

    @objid ("71123a3e-a6b4-4339-971e-294fd1ebfd93")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.EndingActivityDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.StartingActivityDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.StartingEventDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.EndingEventDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("b190c5de-290e-47f5-b9f6-83a8c4d10756")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.EndingActivityDep());
        if (obj != null)
          return new SmDepVal(BpmnDataAssociationData.Metadata.EndingActivityDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.StartingActivityDep());
        if (obj != null)
          return new SmDepVal(BpmnDataAssociationData.Metadata.StartingActivityDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.StartingEventDep());
        if (obj != null)
          return new SmDepVal(BpmnDataAssociationData.Metadata.StartingEventDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.EndingEventDep());
        if (obj != null)
          return new SmDepVal(BpmnDataAssociationData.Metadata.EndingEventDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("523b37a7-073c-48d9-a6b5-52524975e035")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataAssociation(this);
        else
          return null;
    }

}
