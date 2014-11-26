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
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.RegionData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.TransitionData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateVertexImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
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

@objid ("0054f060-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StateVertex.class, factory=StateVertexData.Metadata.ObjectFactory.class)
public abstract class StateVertexData extends ModelElementData {
    @objid ("07305911-2b0c-4560-a16f-0843f8eafc54")
    @SmaMetaAssociation(metaName="OutGoing", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.OutGoingSmDependency.class, component = true)
     List<SmObjectImpl> mOutGoing = null;

    @objid ("2a446fd3-69ab-49b0-bbaf-0bb395696cc1")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mIncoming = null;

    @objid ("a58c4c8f-662d-4df4-b9d6-53eb29049152")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=RegionData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class)
     SmObjectImpl mParent;

    @objid ("cb693141-eb04-4373-a93b-049b04891eb5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000edb5c-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0db67362-fe62-4a37-a68c-9608df239531")
        private static SmClass smClass = null;

        @objid ("89949874-50b8-403f-ba82-c960e2246f96")
        private static SmDependency OutGoingDep = null;

        @objid ("0cc734c5-f7ce-4f2d-889b-b3b483edd717")
        private static SmDependency IncomingDep = null;

        @objid ("13267f0b-ef28-4181-a54b-c2aca108c302")
        private static SmDependency ParentDep = null;

        @objid ("217d777b-24fd-4e13-b438-0794ecd0436c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateVertexData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b3285292-c02a-4a8e-9800-82af559a3103")
        public static SmDependency OutGoingDep() {
            if (OutGoingDep == null) {
            	OutGoingDep = classof().getDependencyDef("OutGoing");
            }
            return OutGoingDep;
        }

        @objid ("7bfc77d9-4fc8-428c-b72b-2f8c2b945c8d")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("874eb32e-6756-41b4-b60b-e930dbbb4248")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("0e9e7a34-9ea0-4784-889f-4455c91ba591")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("bd2558b5-37d7-455d-852c-ec403e725e5b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f7682579-8f3a-4e80-8b44-f5019dabb678")
        public static SmDependency getOutGoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutGoingDep;
        }

        @objid ("66537475-d2fb-4516-b7e3-c8c3ff69b8a5")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("000f1db0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("395dfaae-e94e-4406-8d1d-bc98a21496d6")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("3df5975b-4b63-4a76-a7ec-3806f783ca32")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("000f8106-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("a7cdba7c-d1a1-4f5d-85f2-d01a2a7a8f5b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateVertexData)data).mIncoming != null)? ((StateVertexData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("e69ac665-6c48-4b37-ba98-1e012b3c6d53")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateVertexData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((StateVertexData) data).mIncoming;
            }

            @objid ("e1a45aef-c581-47ca-a4db-e4f81224bbfb")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.TargetDep();
            }

        }

        @objid ("000fe51a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutGoingSmDependency extends SmMultipleDependency {
            @objid ("875a6aa5-5b5a-4943-b78b-6addc0e677e5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateVertexData)data).mOutGoing != null)? ((StateVertexData)data).mOutGoing:SmMultipleDependency.EMPTY;
            }

            @objid ("16e94527-71ac-4883-aa0b-e2362fd2eed8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateVertexData) data).mOutGoing = new ArrayList<>(initialCapacity);
                return ((StateVertexData) data).mOutGoing;
            }

            @objid ("3429f76b-0659-414c-8577-c76ea6383505")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.SourceDep();
            }

        }

        @objid ("00104a14-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("acd71acb-b207-464a-9f51-1ed5eb267d2f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StateVertexData) data).mParent;
            }

            @objid ("53d11bf0-56c1-4bc2-bb3b-3061817eb8fb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StateVertexData) data).mParent = value;
            }

            @objid ("f9275708-21cf-408a-8dd8-d111dfed9b28")
            @Override
            public SmDependency getSymetric() {
                return RegionData.Metadata.SubDep();
            }

        }

    }

}
