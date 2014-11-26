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
package org.modelio.metamodel.data.bpmn.bpmnService;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.bpmnService.BpmnEndPoint;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnParticipantData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnEndPointImpl;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("000ef07e-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnEndPoint.class, factory=BpmnEndPointData.Metadata.ObjectFactory.class)
public class BpmnEndPointData extends BpmnRootElementData {
    @objid ("110450ef-567d-4fa4-a124-447bfec6cb9a")
    @SmaMetaAssociation(metaName="ParticipantRefs", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.ParticipantRefsSmDependency.class)
     List<SmObjectImpl> mParticipantRefs = null;

    @objid ("f19b11c5-7b49-46b4-883e-2500e8eee90b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007ef086-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("cafbd79e-4d52-44b9-af40-549db1ff18e8")
        private static SmClass smClass = null;

        @objid ("ad6e4587-709e-4ea5-87a4-dd875fe20979")
        private static SmDependency ParticipantRefsDep = null;

        @objid ("3693ce1a-b07f-47e0-a1c4-e3fdafb0fe42")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEndPointData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0e3599bb-c304-4b3d-ab5c-75826c001fa3")
        public static SmDependency ParticipantRefsDep() {
            if (ParticipantRefsDep == null) {
            	ParticipantRefsDep = classof().getDependencyDef("ParticipantRefs");
            }
            return ParticipantRefsDep;
        }

        @objid ("380eec92-1a46-42e7-a5eb-798f9e20ccc9")
        public static SmDependency getParticipantRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantRefsDep;
        }

        @objid ("46f1fa44-a305-4e06-836a-11437e5c4215")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007f4068-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("432afc6b-0c90-4ba3-96a6-ad89d30b9272")
            public ISmObjectData createData() {
                return new BpmnEndPointData();
            }

            @objid ("ea848304-5053-4edc-8fc5-ec4e4b7b1d41")
            public SmObjectImpl createImpl() {
                return new BpmnEndPointImpl();
            }

        }

        @objid ("007fb336-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParticipantRefsSmDependency extends SmMultipleDependency {
            @objid ("30c3006a-576d-423c-996b-f69424ab835f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnEndPointData)data).mParticipantRefs != null)? ((BpmnEndPointData)data).mParticipantRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("b04acce7-cdd0-49db-89f4-a47eb6854101")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnEndPointData) data).mParticipantRefs = new ArrayList<>(initialCapacity);
                return ((BpmnEndPointData) data).mParticipantRefs;
            }

            @objid ("fdd7157a-d2c7-449e-87f7-9ab302ee32ba")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.EndPointRefsDep();
            }

        }

    }

}
