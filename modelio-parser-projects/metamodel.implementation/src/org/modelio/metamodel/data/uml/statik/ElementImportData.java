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
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.statik.ElementImportImpl;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.VisibilityMode;
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

@objid ("000879a6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ElementImport.class, factory=ElementImportData.Metadata.ObjectFactory.class)
public class ElementImportData extends ModelElementData {
    @objid ("b6fb6a4c-9f33-4c7a-9849-b5edf9e463be")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PRIVATE;

    @objid ("21d8b23e-df28-4095-b5c4-fc2674afd620")
    @SmaMetaAssociation(metaName="ImportingNameSpace", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ImportingNameSpaceSmDependency.class)
     SmObjectImpl mImportingNameSpace;

    @objid ("27157f58-5592-4b29-9977-92f11b7074e7")
    @SmaMetaAssociation(metaName="ImportedElement", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.ImportedElementSmDependency.class, partof = true)
     SmObjectImpl mImportedElement;

    @objid ("2cad3fde-4619-403c-acb1-b334012e71d1")
    @SmaMetaAssociation(metaName="ImportingOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ImportingOperationSmDependency.class)
     SmObjectImpl mImportingOperation;

    @objid ("2a667e08-90d5-47a7-b7e7-bd3ccf7ce44d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ff64c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4733c325-7b5f-48f1-b07f-47f949a5ef0c")
        private static SmClass smClass = null;

        @objid ("d72964da-66c2-4f51-b982-411ca46d0b04")
        private static SmAttribute VisibilityAtt = null;

        @objid ("ee7e5d27-cc39-4c2f-a0af-b1b928609e86")
        private static SmDependency ImportingNameSpaceDep = null;

        @objid ("352859ce-4b99-45d7-ac75-aea421ac5a42")
        private static SmDependency ImportedElementDep = null;

        @objid ("36ce155b-cfa4-4b58-87c5-4f01bfc6a5e4")
        private static SmDependency ImportingOperationDep = null;

        @objid ("2ce2870f-7b78-49ee-bd53-a7e81b47ac90")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ElementImportData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("78a7c4f2-8150-42ea-b87a-8497c76de395")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("b368eb0a-7a31-4e22-bca5-969c92a1c9ac")
        public static SmDependency ImportingNameSpaceDep() {
            if (ImportingNameSpaceDep == null) {
            	ImportingNameSpaceDep = classof().getDependencyDef("ImportingNameSpace");
            }
            return ImportingNameSpaceDep;
        }

        @objid ("7ab113a5-eb6f-4fc0-bf12-a6f274a1de02")
        public static SmDependency ImportedElementDep() {
            if (ImportedElementDep == null) {
            	ImportedElementDep = classof().getDependencyDef("ImportedElement");
            }
            return ImportedElementDep;
        }

        @objid ("7dc8c2c4-acb8-48fe-ab88-dc4abda8cd44")
        public static SmDependency ImportingOperationDep() {
            if (ImportingOperationDep == null) {
            	ImportingOperationDep = classof().getDependencyDef("ImportingOperation");
            }
            return ImportingOperationDep;
        }

        @objid ("a0224a64-4963-4eae-b751-735f1dc5fb8a")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("5d078242-45d6-412b-a5e8-14c65b356806")
        public static SmDependency getImportingOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingOperationDep;
        }

        @objid ("e491de18-36da-4874-8067-9fe431d385aa")
        public static SmDependency getImportedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportedElementDep;
        }

        @objid ("b13b2ddf-0e5b-4ad0-bc78-a01f03e873a2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("55d980c8-241b-486e-b5cf-85ee271f01a2")
        public static SmDependency getImportingNameSpaceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingNameSpaceDep;
        }

        @objid ("004036b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("896f2ebb-14df-4d2a-b6c9-2d19985a63b3")
            public ISmObjectData createData() {
                return new ElementImportData();
            }

            @objid ("e4e8deb2-1393-4666-9114-8d938c300238")
            public SmObjectImpl createImpl() {
                return new ElementImportImpl();
            }

        }

        @objid ("004096a6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("749b36bb-f4ae-4e09-869d-01506ec2259b")
            public Object getValue(ISmObjectData data) {
                return ((ElementImportData) data).mVisibility;
            }

            @objid ("7532a1e0-dae9-4980-b90a-ed3d86b94276")
            public void setValue(ISmObjectData data, Object value) {
                ((ElementImportData) data).mVisibility = value;
            }

        }

        @objid ("0040f88a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportedElementSmDependency extends SmSingleDependency {
            @objid ("73fad375-93fa-4ca8-834d-0eabd465f32f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ElementImportData) data).mImportedElement;
            }

            @objid ("321d2c48-bf9c-4ec6-8039-5f00535fdf9f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ElementImportData) data).mImportedElement = value;
            }

            @objid ("6c915f36-2744-4c87-bac9-2b8345ddb364")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.ImportingDep();
            }

        }

        @objid ("00416cca-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportingNameSpaceSmDependency extends SmSingleDependency {
            @objid ("be864012-f96f-494f-b0e5-e1cfa9946303")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ElementImportData) data).mImportingNameSpace;
            }

            @objid ("8a5bdd74-c919-42cd-a65b-36e57181a8a2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ElementImportData) data).mImportingNameSpace = value;
            }

            @objid ("c79e65c1-f13d-4be3-90c6-990c77067bc6")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedImportDep();
            }

        }

        @objid ("0041e114-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportingOperationSmDependency extends SmSingleDependency {
            @objid ("3ddbc881-4a5e-434c-9855-1ee4baa0d9ac")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ElementImportData) data).mImportingOperation;
            }

            @objid ("259461e0-657e-4fb8-b27f-1b79a1443ab7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ElementImportData) data).mImportingOperation = value;
            }

            @objid ("f3bf0f58-0774-4c2c-a2dc-4367d0852032")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedImportDep();
            }

        }

    }

}
