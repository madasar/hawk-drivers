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
package org.modelio.metamodel.data.bpmn.rootElements;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociationDirection;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnAssociationImpl;
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

@objid ("00779282-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnAssociation.class, factory=BpmnAssociationData.Metadata.ObjectFactory.class)
public class BpmnAssociationData extends BpmnArtifactData {
    @objid ("759255ed-556e-4071-9d9d-883a7323e1b3")
    @SmaMetaAttribute(metaName="AssociationDirection", type=BpmnAssociationDirection.class, smAttributeClass=Metadata.AssociationDirectionSmAttribute.class)
     Object mAssociationDirection = BpmnAssociationDirection.NONEDIRECTION;

    @objid ("eb53e003-184a-4ea7-9a4e-022974d54bdd")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("234fca40-a64e-4e73-8d20-0e1b4ad25fbd")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     SmObjectImpl mSourceRef;

    @objid ("cb120243-b470-42ac-80a4-7d1563f810d2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006bd8ca-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d66a8317-75f3-45b2-ab05-1527a1e5ad1d")
        private static SmClass smClass = null;

        @objid ("5cb5cf86-bd2e-4164-89d2-bb2c4a8a11d2")
        private static SmAttribute AssociationDirectionAtt = null;

        @objid ("3fe2b1c8-28be-4acd-9713-cae76e5ed6cb")
        private static SmDependency TargetRefDep = null;

        @objid ("19b5bb8c-ea37-4a3d-9916-60365e11a2f1")
        private static SmDependency SourceRefDep = null;

        @objid ("e65f5958-5a49-4056-9e40-758ed011e408")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f160311a-d6f6-499d-8ab6-7a0c573c3025")
        public static SmAttribute AssociationDirectionAtt() {
            if (AssociationDirectionAtt == null) {
            	AssociationDirectionAtt = classof().getAttributeDef("AssociationDirection");
            }
            return AssociationDirectionAtt;
        }

        @objid ("336dbca1-3c4c-4781-9116-8a6749bb6741")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("8b8486dc-38c9-426c-9362-fccbe6192b49")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("79715e44-269a-4137-96c2-e768fb403027")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("86689e20-1249-444c-90c8-bd365799e33a")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("84e9db8a-3f1f-4480-bf1d-696c54e62c19")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("44806778-df42-4f3b-bbf9-8396f60eb461")
        public static SmAttribute getAssociationDirectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociationDirectionAtt;
        }

        @objid ("006c1b50-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6b4d9491-272e-47b9-805d-609c7455c98b")
            public ISmObjectData createData() {
                return new BpmnAssociationData();
            }

            @objid ("4e8518f7-6f35-45fa-a65f-410c7b2bd1e2")
            public SmObjectImpl createImpl() {
                return new BpmnAssociationImpl();
            }

        }

        @objid ("006c7c94-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AssociationDirectionSmAttribute extends SmAttribute {
            @objid ("9234c989-218b-4574-a1c4-98bb186b000c")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAssociationData) data).mAssociationDirection;
            }

            @objid ("912d6583-059d-4521-be33-6b85b3eb04dc")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAssociationData) data).mAssociationDirection = value;
            }

        }

        @objid ("006cdf4a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmSingleDependency {
            @objid ("f474e584-66a3-4dc0-a997-2a60f0c50de0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnAssociationData) data).mSourceRef;
            }

            @objid ("5864202a-2c66-4f63-ac3a-7863781533b5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnAssociationData) data).mSourceRef = value;
            }

            @objid ("ab25bf5a-5bfd-408c-b25b-850a1bb7b27c")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.OutgoingAssocDep();
            }

        }

        @objid ("006d563c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("598f8207-b709-40bc-929d-c9b53b348171")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnAssociationData) data).mTargetRef;
            }

            @objid ("1b22e385-6bdd-457f-a835-bb08e02132ad")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnAssociationData) data).mTargetRef = value;
            }

            @objid ("d951a5e6-f243-40c6-99ce-65820eb5974c")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.IncomingAssocDep();
            }

        }

    }

}
