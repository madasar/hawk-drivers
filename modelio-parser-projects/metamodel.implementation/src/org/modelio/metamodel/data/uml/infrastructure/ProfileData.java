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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.mda.ModuleComponentData;
import org.modelio.metamodel.data.uml.infrastructure.MetaclassReferenceData;
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.data.uml.statik.PackageData;
import org.modelio.metamodel.impl.uml.infrastructure.ProfileImpl;
import org.modelio.metamodel.uml.infrastructure.Profile;
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

@objid ("008ce3b2-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Profile.class, factory=ProfileData.Metadata.ObjectFactory.class, cmsnode=true)
public class ProfileData extends PackageData {
    @objid ("eb2e97b8-225e-4522-b570-7af643a5db42")
    @SmaMetaAttribute(metaName="JCode", type=String.class, smAttributeClass=Metadata.JCodeSmAttribute.class)
     Object mJCode = "";

    @objid ("d88dd112-6345-426f-99e1-422960f943de")
    @SmaMetaAssociation(metaName="DefinedStereotype", typeDataClass=StereotypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedStereotypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedStereotype = null;

    @objid ("2eb9d048-5a58-4cf3-837d-ee63ef096353")
    @SmaMetaAssociation(metaName="OwnerModule", typeDataClass=ModuleComponentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerModuleSmDependency.class)
     SmObjectImpl mOwnerModule;

    @objid ("797492a9-ff8f-4a08-a9c9-1367cee30c41")
    @SmaMetaAssociation(metaName="OwnedReference", typeDataClass=MetaclassReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedReferenceSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedReference = null;

    @objid ("8ed2b8c9-e1a9-4445-ade2-82244fe6d8c7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0073c670-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("43d6fd8c-b190-4a47-adf5-fcf2635be68c")
        private static SmClass smClass = null;

        @objid ("0eb67164-6b48-4d5b-b575-94fc46073100")
        private static SmAttribute JCodeAtt = null;

        @objid ("4d5dcf58-e3be-46fe-94de-e87759fc9caf")
        private static SmDependency DefinedStereotypeDep = null;

        @objid ("43d14197-126e-497d-9658-a66900ecea57")
        private static SmDependency OwnerModuleDep = null;

        @objid ("966728d3-1896-44c6-adf7-cd7520454d1d")
        private static SmDependency OwnedReferenceDep = null;

        @objid ("822fca7c-15f5-4835-8499-ade8254d44bb")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ProfileData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0e7e1c25-570d-49b3-a614-fcc07868b330")
        public static SmAttribute JCodeAtt() {
            if (JCodeAtt == null) {
            	JCodeAtt = classof().getAttributeDef("JCode");
            }
            return JCodeAtt;
        }

        @objid ("8e3a9cd3-94d4-41bc-a03c-88a4fe543598")
        public static SmDependency DefinedStereotypeDep() {
            if (DefinedStereotypeDep == null) {
            	DefinedStereotypeDep = classof().getDependencyDef("DefinedStereotype");
            }
            return DefinedStereotypeDep;
        }

        @objid ("b83a98f9-7b37-486a-bfc4-9e152cdf987f")
        public static SmDependency OwnerModuleDep() {
            if (OwnerModuleDep == null) {
            	OwnerModuleDep = classof().getDependencyDef("OwnerModule");
            }
            return OwnerModuleDep;
        }

        @objid ("1dad74e2-efda-4f95-89fa-b251f8c83d92")
        public static SmDependency OwnedReferenceDep() {
            if (OwnedReferenceDep == null) {
            	OwnedReferenceDep = classof().getDependencyDef("OwnedReference");
            }
            return OwnedReferenceDep;
        }

        @objid ("31157f55-d188-4407-a9d8-e9ad7a4e394f")
        public static SmDependency getOwnerModuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerModuleDep;
        }

        @objid ("057e7087-16ae-4e97-afda-38fe2fb99f6f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("49ccb2c4-1fe8-44d3-8d06-6a8d8db46fd8")
        public static SmAttribute getJCodeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return JCodeAtt;
        }

        @objid ("1605242d-d637-476c-a2fc-8af83926c25d")
        public static SmDependency getOwnedReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedReferenceDep;
        }

        @objid ("7a9af581-a8de-464a-be87-06f0d90ab56a")
        public static SmDependency getDefinedStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedStereotypeDep;
        }

        @objid ("007407ac-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0e87bfba-4c76-47e4-b934-04d12a4cabee")
            public ISmObjectData createData() {
                return new ProfileData();
            }

            @objid ("0cf28a5a-1519-4a99-a239-5f683c97e9f5")
            public SmObjectImpl createImpl() {
                return new ProfileImpl();
            }

        }

        @objid ("00746896-c4c2-1fd8-97fe-001ec947cd2a")
        public static class JCodeSmAttribute extends SmAttribute {
            @objid ("75d4ff48-55ed-4574-af44-67a2bcb34b66")
            public Object getValue(ISmObjectData data) {
                return ((ProfileData) data).mJCode;
            }

            @objid ("f4efb1a5-ed53-4cce-ab57-64ca2b80ea5f")
            public void setValue(ISmObjectData data, Object value) {
                ((ProfileData) data).mJCode = value;
            }

        }

        @objid ("0074cb38-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerModuleSmDependency extends SmSingleDependency {
            @objid ("320847c9-c698-409c-ad5d-0c66a64cce53")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProfileData) data).mOwnerModule;
            }

            @objid ("f23d4074-dd19-4b41-9b61-5fe79825a7b4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProfileData) data).mOwnerModule = value;
            }

            @objid ("484dd1b2-2a68-4ee2-b247-4995991559ab")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.OwnedProfileDep();
            }

        }

        @objid ("00753f96-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedStereotypeSmDependency extends SmMultipleDependency {
            @objid ("9c407d4e-3ad5-4134-92c8-74d300a69d8e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProfileData)data).mDefinedStereotype != null)? ((ProfileData)data).mDefinedStereotype:SmMultipleDependency.EMPTY;
            }

            @objid ("b8a9bb34-4ad7-47b4-86d1-621ac079fb02")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProfileData) data).mDefinedStereotype = new ArrayList<>(initialCapacity);
                return ((ProfileData) data).mDefinedStereotype;
            }

            @objid ("f6b757b0-ec0f-45e5-a6b6-ec52014aa995")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.OwnerDep();
            }

        }

        @objid ("0075a2e2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnedReferenceSmDependency extends SmMultipleDependency {
            @objid ("b30ffc38-7e2d-4c1e-936b-1aff83017f67")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProfileData)data).mOwnedReference != null)? ((ProfileData)data).mOwnedReference:SmMultipleDependency.EMPTY;
            }

            @objid ("230184f8-d0e7-4d06-ab70-f62efdf76706")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProfileData) data).mOwnedReference = new ArrayList<>(initialCapacity);
                return ((ProfileData) data).mOwnedReference;
            }

            @objid ("8eb244d8-7611-446c-bedb-f7666eabf66c")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.OwnerProfileDep();
            }

        }

    }

}
