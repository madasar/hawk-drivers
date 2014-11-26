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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.AssociationData;
import org.modelio.metamodel.data.uml.statik.ClassData;
import org.modelio.metamodel.data.uml.statik.NaryAssociationData;
import org.modelio.metamodel.impl.uml.statik.ClassAssociationImpl;
import org.modelio.metamodel.uml.statik.ClassAssociation;
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

@objid ("000325f0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ClassAssociation.class, factory=ClassAssociationData.Metadata.ObjectFactory.class)
public class ClassAssociationData extends ModelElementData {
    @objid ("d25f5387-d558-40a3-9038-0caf92805dda")
    @SmaMetaAssociation(metaName="NaryAssociationPart", typeDataClass=NaryAssociationData.class, min=0, max=1, smAssociationClass=Metadata.NaryAssociationPartSmDependency.class)
     SmObjectImpl mNaryAssociationPart;

    @objid ("1f870dcf-132f-4955-a398-2dddfd982ec0")
    @SmaMetaAssociation(metaName="ClassPart", typeDataClass=ClassData.class, min=1, max=1, smAssociationClass=Metadata.ClassPartSmDependency.class, partof = true)
     SmObjectImpl mClassPart;

    @objid ("78a15440-9f25-4820-8de8-086ef5724caa")
    @SmaMetaAssociation(metaName="AssociationPart", typeDataClass=AssociationData.class, min=0, max=1, smAssociationClass=Metadata.AssociationPartSmDependency.class)
     SmObjectImpl mAssociationPart;

    @objid ("09f19e11-daa1-4e79-b6d8-6b789f5aa60a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00420cde-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("78e9ab98-f840-4bef-98f5-2b4ca39aa0be")
        private static SmClass smClass = null;

        @objid ("1173d665-f565-4d40-9405-26ac79d96c48")
        private static SmDependency NaryAssociationPartDep = null;

        @objid ("9de2d1aa-e775-426f-b94c-25b62442b1cd")
        private static SmDependency ClassPartDep = null;

        @objid ("e216b786-19ca-4830-99ae-a5dfd32bfaec")
        private static SmDependency AssociationPartDep = null;

        @objid ("452d0d76-1e5a-442b-b8fc-4383be8cdf3e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("612cff3c-480d-4e4f-a9fb-be4401ba24dd")
        public static SmDependency NaryAssociationPartDep() {
            if (NaryAssociationPartDep == null) {
            	NaryAssociationPartDep = classof().getDependencyDef("NaryAssociationPart");
            }
            return NaryAssociationPartDep;
        }

        @objid ("8fba02a7-946b-4a69-ad8e-8e754a299c49")
        public static SmDependency ClassPartDep() {
            if (ClassPartDep == null) {
            	ClassPartDep = classof().getDependencyDef("ClassPart");
            }
            return ClassPartDep;
        }

        @objid ("ca2f3ef9-ffb0-41af-95dc-7c4e12adca27")
        public static SmDependency AssociationPartDep() {
            if (AssociationPartDep == null) {
            	AssociationPartDep = classof().getDependencyDef("AssociationPart");
            }
            return AssociationPartDep;
        }

        @objid ("e7609043-f303-4cd9-ae4c-0c256636dde9")
        public static SmDependency getAssociationPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociationPartDep;
        }

        @objid ("fb7a5602-93cb-4f83-9ae8-180d793354d4")
        public static SmDependency getClassPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ClassPartDep;
        }

        @objid ("e6b07fc9-7966-4c8e-ab1b-0ca186262808")
        public static SmDependency getNaryAssociationPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryAssociationPartDep;
        }

        @objid ("ff228149-5f25-4bd4-a482-eddf995d1996")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00425194-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1f589689-f2f9-42f4-9ec6-94ace37a8b11")
            public ISmObjectData createData() {
                return new ClassAssociationData();
            }

            @objid ("3ccabb6b-4885-41af-8c5c-fbd06179e540")
            public SmObjectImpl createImpl() {
                return new ClassAssociationImpl();
            }

        }

        @objid ("0042b580-c4c3-1fd8-97fe-001ec947cd2a")
        public static class AssociationPartSmDependency extends SmSingleDependency {
            @objid ("b843b16b-47c3-4312-b036-b0e3ced0d8dc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassAssociationData) data).mAssociationPart;
            }

            @objid ("36193990-633d-48c6-86e9-8af04d97e41b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassAssociationData) data).mAssociationPart = value;
            }

            @objid ("09ab91bb-fb0f-4674-90d3-2d56b84109e3")
            @Override
            public SmDependency getSymetric() {
                return AssociationData.Metadata.LinkToClassDep();
            }

        }

        @objid ("004318ea-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ClassPartSmDependency extends SmSingleDependency {
            @objid ("1822535f-06d7-465d-a085-6638cf229104")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassAssociationData) data).mClassPart;
            }

            @objid ("cf57eb58-944b-412a-bd04-5bec576aa514")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassAssociationData) data).mClassPart = value;
            }

            @objid ("2feab7d9-f734-46e3-95b6-2bb075c43338")
            @Override
            public SmDependency getSymetric() {
                return ClassData.Metadata.LinkToAssociationDep();
            }

        }

        @objid ("004391bc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class NaryAssociationPartSmDependency extends SmSingleDependency {
            @objid ("116d1a32-f47a-423f-b333-c08ead71b8fe")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassAssociationData) data).mNaryAssociationPart;
            }

            @objid ("4e9f51b6-86e9-4b8b-9c32-f968b875ac6a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassAssociationData) data).mNaryAssociationPart = value;
            }

            @objid ("73c7e4b3-e647-42b2-80ac-47df98d4d69e")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationData.Metadata.LinkToClassDep();
            }

        }

    }

}
