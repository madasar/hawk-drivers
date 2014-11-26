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
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcessType;
import org.modelio.metamodel.bpmn.processCollaboration.OptionalBoolean;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnProcessData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0076549e-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnProcessImpl extends BpmnRootElementImpl implements BpmnProcess {
    @objid ("2fce1e90-e99b-4d60-9fae-2c4105066ee5")
    @Override
    public BpmnProcessType getProcessType() {
        return (BpmnProcessType) getAttVal(BpmnProcessData.Metadata.ProcessTypeAtt());
    }

    @objid ("1158e513-d879-48c8-ba08-b9eb7a491a2c")
    @Override
    public void setProcessType(BpmnProcessType value) {
        setAttVal(BpmnProcessData.Metadata.ProcessTypeAtt(), value);
    }

    @objid ("7f4b54e3-a03d-413b-b28d-881a688fe257")
    @Override
    public boolean isIsClosed() {
        return (Boolean) getAttVal(BpmnProcessData.Metadata.IsClosedAtt());
    }

    @objid ("8b2e8ac9-5979-401e-a9e6-383c276be939")
    @Override
    public void setIsClosed(boolean value) {
        setAttVal(BpmnProcessData.Metadata.IsClosedAtt(), value);
    }

    @objid ("9c73fc91-2483-460f-ad35-4b413b40d4c7")
    @Override
    public OptionalBoolean getIsExecutable() {
        return (OptionalBoolean) getAttVal(BpmnProcessData.Metadata.IsExecutableAtt());
    }

    @objid ("a3dbed93-6a1b-4b82-b60d-0ad7f32154af")
    @Override
    public void setIsExecutable(OptionalBoolean value) {
        setAttVal(BpmnProcessData.Metadata.IsExecutableAtt(), value);
    }

    @objid ("4b4d10f2-f1d6-46ad-8efb-886b26f144ab")
    @Override
    public EList<BpmnCallActivity> getCaller() {
        return new SmList<>(this, BpmnProcessData.Metadata.CallerDep());
    }

    @objid ("3547549e-b606-4f06-8219-e675a0fc8dfc")
    @Override
    public <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnCallActivity element : getCaller()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7fb350db-d3b0-45f7-9e38-65f56e4c7888")
    @Override
    public EList<BpmnProcess> getSupports() {
        return new SmList<>(this, BpmnProcessData.Metadata.SupportsDep());
    }

    @objid ("adb8ee56-7c3a-4ea6-95da-7b915fde2de9")
    @Override
    public <T extends BpmnProcess> List<T> getSupports(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnProcess element : getSupports()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("61a4fd6e-aff9-4d42-aab3-670d5e76f3bb")
    @Override
    public EList<BpmnArtifact> getArtifact() {
        return new SmList<>(this, BpmnProcessData.Metadata.ArtifactDep());
    }

    @objid ("4a55160d-d342-4a9b-bbd9-761fb1e19938")
    @Override
    public <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnArtifact element : getArtifact()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("859e5a77-0018-4d80-9cc4-ff027d94ea87")
    @Override
    public EList<BpmnLaneSet> getLaneSet() {
        return new SmList<>(this, BpmnProcessData.Metadata.LaneSetDep());
    }

    @objid ("c2f262ab-0408-450e-87ef-ffa5b371d4b6")
    @Override
    public <T extends BpmnLaneSet> List<T> getLaneSet(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnLaneSet element : getLaneSet()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a49ef7c2-1ad8-42d1-a420-0b15660339d0")
    @Override
    public EList<BpmnProcess> getSupported() {
        return new SmList<>(this, BpmnProcessData.Metadata.SupportedDep());
    }

    @objid ("849c0de3-721d-43c0-9755-ed9d318b83d5")
    @Override
    public <T extends BpmnProcess> List<T> getSupported(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnProcess element : getSupported()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b9452408-55ca-4118-b652-736397b267b5")
    @Override
    public BpmnParticipant getParticipant() {
        return (BpmnParticipant) getDepVal(BpmnProcessData.Metadata.ParticipantDep());
    }

    @objid ("ae3c1e0a-99a0-4bb6-9e19-44847c64df6e")
    @Override
    public void setParticipant(BpmnParticipant value) {
        appendDepVal(BpmnProcessData.Metadata.ParticipantDep(), (SmObjectImpl)value);
    }

    @objid ("39ece61d-fedb-4c54-95a0-5d6ece18da74")
    @Override
    public EList<BpmnFlowElement> getFlowElement() {
        return new SmList<>(this, BpmnProcessData.Metadata.FlowElementDep());
    }

    @objid ("bd14c1d1-fbff-43ba-a18e-bbf41421c47b")
    @Override
    public <T extends BpmnFlowElement> List<T> getFlowElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnFlowElement element : getFlowElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c7c685c2-67da-42b5-8974-3e384ba733c3")
    @Override
    public EList<BpmnResourceRole> getResource() {
        return new SmList<>(this, BpmnProcessData.Metadata.ResourceDep());
    }

    @objid ("58b4290d-ed52-4c16-9865-fbd4cb8ec528")
    @Override
    public <T extends BpmnResourceRole> List<T> getResource(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnResourceRole element : getResource()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("df6fbfbd-e94f-4cdd-9a7d-ff18d2c0c3da")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("826cc90a-0142-4af3-b577-38ccac5828ea")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("d9a04b7f-639f-4890-b4f0-dc27e0212dd7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnProcess(this);
        else
          return null;
    }

}
