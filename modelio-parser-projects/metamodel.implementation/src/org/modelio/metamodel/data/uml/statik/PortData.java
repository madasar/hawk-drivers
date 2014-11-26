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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.ProvidedInterfaceData;
import org.modelio.metamodel.data.uml.statik.RequiredInterfaceData;
import org.modelio.metamodel.impl.uml.statik.PortImpl;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
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

@objid ("00193926-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Port.class, factory=PortData.Metadata.ObjectFactory.class)
public class PortData extends BindableInstanceData {
    @objid ("d762e0cc-465d-4c9b-bd16-69e233b0235a")
    @SmaMetaAttribute(metaName="IsBehavior", type=Boolean.class, smAttributeClass=Metadata.IsBehaviorSmAttribute.class)
     Object mIsBehavior = false;

    @objid ("1f655cb2-0b1e-4566-a3f4-3f4396200d16")
    @SmaMetaAttribute(metaName="IsService", type=Boolean.class, smAttributeClass=Metadata.IsServiceSmAttribute.class)
     Object mIsService = false;

    @objid ("3121dc67-e9c9-4de7-9697-586cff6b37fa")
    @SmaMetaAttribute(metaName="IsConjugated", type=Boolean.class, smAttributeClass=Metadata.IsConjugatedSmAttribute.class)
     Object mIsConjugated = false;

    @objid ("d2329211-6581-4d08-a41c-1e4b7e40f5b8")
    @SmaMetaAttribute(metaName="Direction", type=PortOrientation.class, smAttributeClass=Metadata.DirectionSmAttribute.class)
     Object mDirection = PortOrientation.NONE;

    @objid ("182a4a15-8799-41d9-9c1f-c7042277ccb3")
    @SmaMetaAssociation(metaName="Provided", typeDataClass=ProvidedInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.ProvidedSmDependency.class, component = true)
     List<SmObjectImpl> mProvided = null;

    @objid ("a9244d6d-8e03-49d2-b75f-fe5998efd4a8")
    @SmaMetaAssociation(metaName="Required", typeDataClass=RequiredInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredSmDependency.class, component = true)
     List<SmObjectImpl> mRequired = null;

    @objid ("8f134ed5-02f8-4cee-841c-0f9a5b657cda")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007f05e4-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b63c0646-1014-4c87-b1f1-09cf84e842c1")
        private static SmClass smClass = null;

        @objid ("2464279c-25c2-43cc-8d8f-353eb947f11f")
        private static SmAttribute IsBehaviorAtt = null;

        @objid ("246dbdb0-e1b1-42ed-842a-afc80107b137")
        private static SmAttribute IsServiceAtt = null;

        @objid ("d872e870-0374-44a2-a85c-79dbbc4a6c6a")
        private static SmAttribute IsConjugatedAtt = null;

        @objid ("4abc037b-a0ba-4b4f-a359-e58254cad3c7")
        private static SmAttribute DirectionAtt = null;

        @objid ("97cbd939-774a-4bad-a36b-75a620755266")
        private static SmDependency ProvidedDep = null;

        @objid ("90e572b1-a8a9-4cdd-8331-d115bd279f31")
        private static SmDependency RequiredDep = null;

        @objid ("86372afc-9122-4b1e-857a-7fd92e63f272")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PortData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e33ff853-91a0-4cde-923b-ee69729570ee")
        public static SmAttribute IsBehaviorAtt() {
            if (IsBehaviorAtt == null) {
            	IsBehaviorAtt = classof().getAttributeDef("IsBehavior");
            }
            return IsBehaviorAtt;
        }

        @objid ("fdbb3a19-13a3-42dd-a19b-e29d13a93f43")
        public static SmAttribute IsServiceAtt() {
            if (IsServiceAtt == null) {
            	IsServiceAtt = classof().getAttributeDef("IsService");
            }
            return IsServiceAtt;
        }

        @objid ("9c049ca0-1af0-42fc-b1f3-5c524e08dd0a")
        public static SmAttribute IsConjugatedAtt() {
            if (IsConjugatedAtt == null) {
            	IsConjugatedAtt = classof().getAttributeDef("IsConjugated");
            }
            return IsConjugatedAtt;
        }

        @objid ("c787bf32-ccee-42f9-8aa9-e8a119034f1d")
        public static SmAttribute DirectionAtt() {
            if (DirectionAtt == null) {
            	DirectionAtt = classof().getAttributeDef("Direction");
            }
            return DirectionAtt;
        }

        @objid ("194602fe-a6e9-4554-ae19-6c7848ba0146")
        public static SmDependency ProvidedDep() {
            if (ProvidedDep == null) {
            	ProvidedDep = classof().getDependencyDef("Provided");
            }
            return ProvidedDep;
        }

        @objid ("c23ce91c-d39e-43e3-8693-85dfc99c9c9f")
        public static SmDependency RequiredDep() {
            if (RequiredDep == null) {
            	RequiredDep = classof().getDependencyDef("Required");
            }
            return RequiredDep;
        }

        @objid ("d10bf90b-1aaf-4d19-a34f-fa2edf3ba79f")
        public static SmAttribute getDirectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DirectionAtt;
        }

        @objid ("bdf6245f-4c08-4f05-a05b-c17c4ca84f21")
        public static SmAttribute getIsServiceAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsServiceAtt;
        }

        @objid ("fb554492-67e5-49de-befe-4cefb51cacd1")
        public static SmAttribute getIsConjugatedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsConjugatedAtt;
        }

        @objid ("0c127f8c-44d8-4525-9051-720423f8f5a2")
        public static SmDependency getProvidedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidedDep;
        }

        @objid ("ec483b8f-3ae4-4512-99d3-d095e0fe2341")
        public static SmDependency getRequiredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredDep;
        }

        @objid ("d64a7e52-10a7-4d16-8d22-75dc6c7f1b7b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("40d6161a-1c4e-45a3-a70f-9235878dd689")
        public static SmAttribute getIsBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsBehaviorAtt;
        }

        @objid ("007f4734-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("60cb9a27-3a4e-4e5a-8f76-89282f676016")
            public ISmObjectData createData() {
                return new PortData();
            }

            @objid ("23795ba3-e6f0-4c15-b4a9-97189efa392f")
            public SmObjectImpl createImpl() {
                return new PortImpl();
            }

        }

        @objid ("007fa936-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsBehaviorSmAttribute extends SmAttribute {
            @objid ("bedc1640-12c8-45fd-9583-e99a83302043")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mIsBehavior;
            }

            @objid ("679194e4-407a-4080-98a0-0cafa4d1beff")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mIsBehavior = value;
            }

        }

        @objid ("00800b6a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsServiceSmAttribute extends SmAttribute {
            @objid ("cbbb09de-a489-4dde-bf5d-3e30b2d0d8d9")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mIsService;
            }

            @objid ("c6401925-a97d-46b9-9622-55beac7c7269")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mIsService = value;
            }

        }

        @objid ("00806fec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsConjugatedSmAttribute extends SmAttribute {
            @objid ("b1f9656c-ad88-46df-8a2d-a0636bf79abd")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mIsConjugated;
            }

            @objid ("7323ce08-9c89-4f76-ba46-8b0bf728df54")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mIsConjugated = value;
            }

        }

        @objid ("0080d41e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RequiredSmDependency extends SmMultipleDependency {
            @objid ("bbbc7405-08fd-4d8e-b739-c317986d67f8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PortData)data).mRequired != null)? ((PortData)data).mRequired:SmMultipleDependency.EMPTY;
            }

            @objid ("490c3fe9-67cb-453a-8142-55a349db1094")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PortData) data).mRequired = new ArrayList<>(initialCapacity);
                return ((PortData) data).mRequired;
            }

            @objid ("d7889a5f-1d3b-4c5b-9ca1-ee5bd9b36997")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.RequiringDep();
            }

        }

        @objid ("00813904-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProvidedSmDependency extends SmMultipleDependency {
            @objid ("e4b04ab0-4105-4d76-93b9-023811e9bb34")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PortData)data).mProvided != null)? ((PortData)data).mProvided:SmMultipleDependency.EMPTY;
            }

            @objid ("094ce6e3-979d-471a-9bc8-73365c837682")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PortData) data).mProvided = new ArrayList<>(initialCapacity);
                return ((PortData) data).mProvided;
            }

            @objid ("d3f35d16-1501-4f43-ba93-ad9735dc9707")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.ProvidingDep();
            }

        }

        @objid ("004dfbca-7950-1fe9-b4b9-001ec947cd2a")
        public static class DirectionSmAttribute extends SmAttribute {
            @objid ("75d2d1e2-08c5-4e4a-81a9-51ec15dbe937")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mDirection;
            }

            @objid ("0063710b-3423-4e00-a482-ff47c912e8a4")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mDirection = value;
            }

        }

    }

}
