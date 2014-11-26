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
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.statik.CollaborationUseData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.statik.CollaborationImpl;
import org.modelio.metamodel.uml.statik.Collaboration;
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

@objid ("00044bf6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Collaboration.class, factory=CollaborationData.Metadata.ObjectFactory.class)
public class CollaborationData extends NameSpaceData {
    @objid ("11fb6b4c-2db0-4af5-a926-c8c6b48540f7")
    @SmaMetaAttribute(metaName="IsConcurrent", type=Boolean.class, smAttributeClass=Metadata.IsConcurrentSmAttribute.class)
     Object mIsConcurrent = false;

    @objid ("fa2c51d7-8408-4baf-b576-9d286b32b2a6")
    @SmaMetaAssociation(metaName="ORepresented", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ORepresentedSmDependency.class)
     SmObjectImpl mORepresented;

    @objid ("bc6a7be0-a88c-49e7-8ba7-83eaebb10ff6")
    @SmaMetaAssociation(metaName="BRepresented", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.BRepresentedSmDependency.class)
     SmObjectImpl mBRepresented;

    @objid ("82543bd3-694c-4ca6-8fc1-59a382ac1b4b")
    @SmaMetaAssociation(metaName="Occurrence", typeDataClass=CollaborationUseData.class, min=0, max=-1, smAssociationClass=Metadata.OccurrenceSmDependency.class)
     List<SmObjectImpl> mOccurrence = null;

    @objid ("b97e25f3-f412-4f06-9c56-a3d5af421b39")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0052d76c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("393ea71c-a1ff-4d25-9a37-9356ea32aca2")
        private static SmClass smClass = null;

        @objid ("4954c948-d480-494b-bd8f-9424719d8e0c")
        private static SmAttribute IsConcurrentAtt = null;

        @objid ("12f17c98-c1b7-48c7-8a59-400dcc9ce5de")
        private static SmDependency ORepresentedDep = null;

        @objid ("d27b8490-147b-455c-9e38-3835b067437b")
        private static SmDependency BRepresentedDep = null;

        @objid ("c6342f34-b8b7-4791-b758-45a0dad6ec38")
        private static SmDependency OccurrenceDep = null;

        @objid ("81cb9c74-a6e6-46cd-ba39-127d398264bd")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CollaborationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("86e1c4ca-b195-45d1-a68b-a984753d5d00")
        public static SmAttribute IsConcurrentAtt() {
            if (IsConcurrentAtt == null) {
            	IsConcurrentAtt = classof().getAttributeDef("IsConcurrent");
            }
            return IsConcurrentAtt;
        }

        @objid ("698d7adf-8eca-4e31-809b-2946f585eff2")
        public static SmDependency ORepresentedDep() {
            if (ORepresentedDep == null) {
            	ORepresentedDep = classof().getDependencyDef("ORepresented");
            }
            return ORepresentedDep;
        }

        @objid ("65bf9e56-9681-4608-bd91-b3bc86d14f51")
        public static SmDependency BRepresentedDep() {
            if (BRepresentedDep == null) {
            	BRepresentedDep = classof().getDependencyDef("BRepresented");
            }
            return BRepresentedDep;
        }

        @objid ("c3022d17-21fd-452f-bf6e-00fdb500b6ad")
        public static SmDependency OccurrenceDep() {
            if (OccurrenceDep == null) {
            	OccurrenceDep = classof().getDependencyDef("Occurrence");
            }
            return OccurrenceDep;
        }

        @objid ("e66fb377-4789-43e5-b8ef-68c0c527b886")
        public static SmAttribute getIsConcurrentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsConcurrentAtt;
        }

        @objid ("d201d86c-1f1c-4107-9b98-1eb9c9f5895b")
        public static SmDependency getOccurrenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurrenceDep;
        }

        @objid ("81dcb273-6d33-451b-ba6b-2ef2f4913bad")
        public static SmDependency getORepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ORepresentedDep;
        }

        @objid ("192603e2-fcdc-4385-ab34-94384b2791b7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ca7b3523-eea9-4bfb-998e-2c46480308bc")
        public static SmDependency getBRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BRepresentedDep;
        }

        @objid ("00532122-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8b325947-b3bb-400f-918b-e16041547c31")
            public ISmObjectData createData() {
                return new CollaborationData();
            }

            @objid ("3fb1d14c-3330-4916-b894-b7173d28f3dc")
            public SmObjectImpl createImpl() {
                return new CollaborationImpl();
            }

        }

        @objid ("00538338-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsConcurrentSmAttribute extends SmAttribute {
            @objid ("912852d8-10ca-47a4-8a48-7a44c5f9d88b")
            public Object getValue(ISmObjectData data) {
                return ((CollaborationData) data).mIsConcurrent;
            }

            @objid ("05695d6b-193b-4f69-b2da-85c72eeb7e4e")
            public void setValue(ISmObjectData data, Object value) {
                ((CollaborationData) data).mIsConcurrent = value;
            }

        }

        @objid ("0053e56c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BRepresentedSmDependency extends SmSingleDependency {
            @objid ("6fd253c3-2231-45fc-92e6-b564c5eb6f54")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationData) data).mBRepresented;
            }

            @objid ("a4744d04-63f7-42cd-8334-5ce98d0160a4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationData) data).mBRepresented = value;
            }

            @objid ("15e1b4f3-2546-4ad8-99d9-5ed6a29a6746")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.OwnedCollaborationDep();
            }

        }

        @objid ("00546230-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ORepresentedSmDependency extends SmSingleDependency {
            @objid ("b87347cf-dfd9-49c6-8bb9-431ce29697c5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationData) data).mORepresented;
            }

            @objid ("05022585-2d2d-47ad-ae3d-700ab53350f7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationData) data).mORepresented = value;
            }

            @objid ("1b398a10-3deb-4b49-9c05-cf7643729f7c")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.ExampleDep();
            }

        }

        @objid ("0054d83c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurrenceSmDependency extends SmMultipleDependency {
            @objid ("97bc3f4a-d8eb-4ac2-aa0d-a8b79398b551")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CollaborationData)data).mOccurrence != null)? ((CollaborationData)data).mOccurrence:SmMultipleDependency.EMPTY;
            }

            @objid ("0dc284dc-05d9-4c37-8f32-22dcc3a5fb7c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CollaborationData) data).mOccurrence = new ArrayList<>(initialCapacity);
                return ((CollaborationData) data).mOccurrence;
            }

            @objid ("b7ef8ec9-83f1-4419-84b1-cbcaafbbce6d")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.TypeDep();
            }

        }

    }

}
