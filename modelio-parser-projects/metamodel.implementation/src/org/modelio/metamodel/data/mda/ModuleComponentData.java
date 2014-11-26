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
package org.modelio.metamodel.data.mda;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.mda.ModuleParameterData;
import org.modelio.metamodel.data.uml.infrastructure.ProfileData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTypeData;
import org.modelio.metamodel.data.uml.statik.ComponentData;
import org.modelio.metamodel.impl.mda.ModuleComponentImpl;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleState;
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

@objid ("0065c782-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ModuleComponent.class, factory=ModuleComponentData.Metadata.ObjectFactory.class, cmsnode=true)
public class ModuleComponentData extends ComponentData {
    @objid ("284f0747-99f4-4603-9bf4-bc8e593516ee")
    @SmaMetaAttribute(metaName="LicenseKey", type=Integer.class, smAttributeClass=Metadata.LicenseKeySmAttribute.class)
     Object mLicenseKey = 0;

    @objid ("c4c9f183-84f5-4360-9807-fc4cea43d8c3")
    @SmaMetaAttribute(metaName="MajVersion", type=Integer.class, smAttributeClass=Metadata.MajVersionSmAttribute.class)
     Object mMajVersion = 0;

    @objid ("dd1f4b98-394f-4b32-acb7-dec7db6b524d")
    @SmaMetaAttribute(metaName="MinVersion", type=Integer.class, smAttributeClass=Metadata.MinVersionSmAttribute.class)
     Object mMinVersion = 0;

    @objid ("e90ee8b9-9cc1-4929-aa67-f4f098fd2861")
    @SmaMetaAttribute(metaName="MinMinVersion", type=String.class, smAttributeClass=Metadata.MinMinVersionSmAttribute.class)
     Object mMinMinVersion = "";

    @objid ("aa972f6b-7fa3-4db7-8096-7d5987c323ed")
    @SmaMetaAttribute(metaName="MinBinVersionCompatibility", type=String.class, smAttributeClass=Metadata.MinBinVersionCompatibilitySmAttribute.class)
     Object mMinBinVersionCompatibility = "";

    @objid ("0c59e7d1-f5b8-4fbd-a8ad-8e5210188341")
    @SmaMetaAttribute(metaName="JavaClassName", type=String.class, smAttributeClass=Metadata.JavaClassNameSmAttribute.class)
     Object mJavaClassName = "";

    @objid ("ae33897e-c330-4fc1-9818-c534c40a203b")
    @SmaMetaAttribute(metaName="State", type=ModuleState.class, smAttributeClass=Metadata.StateSmAttribute.class, einoexternalize=true)
     Object mState = ModuleState.SOMODULESTATEACTIVATED;

    @objid ("43ff4a58-f3e1-41b6-b4db-5b728e38025a")
    @SmaMetaAssociation(metaName="DefinedPropertyType", typeDataClass=PropertyTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedPropertyTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedPropertyType = null;

    @objid ("07c9ca34-4074-4098-99c5-2e0a55bec71a")
    @SmaMetaAssociation(metaName="OwnedProfile", typeDataClass=ProfileData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedProfileSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedProfile = null;

    @objid ("d1ebd76c-c058-42f1-99f3-0c7c365056fa")
    @SmaMetaAssociation(metaName="ModuleParameter", typeDataClass=ModuleParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ModuleParameterSmDependency.class, component = true)
     List<SmObjectImpl> mModuleParameter = null;

    @objid ("5ae74f92-5688-47fa-838f-08803f217cc5")
    @SmaMetaAssociation(metaName="DependsOn", typeDataClass=ModuleComponentData.class, min=0, max=-1, smAssociationClass=Metadata.DependsOnSmDependency.class, partof = true)
     List<SmObjectImpl> mDependsOn = null;

    @objid ("e70424ec-44bf-4b38-a6a3-d1cb91bb4fee")
    @SmaMetaAssociation(metaName="Impacted", typeDataClass=ModuleComponentData.class, min=0, max=-1, smAssociationClass=Metadata.ImpactedSmDependency.class)
     List<SmObjectImpl> mImpacted = null;

    @objid ("030dd204-3edc-4f7d-8bbb-0f76af1f7a4b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00182518-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bb37e1d4-a491-41c2-a906-ba5e7983e412")
        private static SmClass smClass = null;

        @objid ("2d05a84f-32fd-4a30-ac55-76f6c86cdba5")
        private static SmAttribute LicenseKeyAtt = null;

        @objid ("227b01a4-c8e0-49db-a663-181183f2b11e")
        private static SmAttribute MajVersionAtt = null;

        @objid ("1c87dd11-2df6-4a45-b8dc-78a385df3725")
        private static SmAttribute MinVersionAtt = null;

        @objid ("2b35881f-04de-47ea-b755-84c7cb93834a")
        private static SmAttribute MinMinVersionAtt = null;

        @objid ("2c15c801-39d2-4e06-8722-99753baa0db9")
        private static SmAttribute MinBinVersionCompatibilityAtt = null;

        @objid ("fb443602-2427-4191-9096-9afbe18ec7df")
        private static SmAttribute JavaClassNameAtt = null;

        @objid ("66ef92a6-ce38-40ef-a566-f74d5e25fc50")
        private static SmAttribute StateAtt = null;

        @objid ("220ed1d4-dc29-4170-b081-1000731bdfc3")
        private static SmDependency DefinedPropertyTypeDep = null;

        @objid ("bb7e47bc-8a23-4d2a-b6cb-1610b2eb695e")
        private static SmDependency OwnedProfileDep = null;

        @objid ("e6343e70-da26-4b8c-8c70-a5b62f223dc2")
        private static SmDependency ModuleParameterDep = null;

        @objid ("c6e3cef2-68b0-4f20-8aa7-8b1683c850fc")
        private static SmDependency DependsOnDep = null;

        @objid ("cebd033b-d6a1-43b4-961c-cccba6334abd")
        private static SmDependency ImpactedDep = null;

        @objid ("ab254258-3563-48b2-aed2-9d8fe9b2465a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModuleComponentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e28002ab-90e7-4b42-a069-d75097b77b28")
        public static SmAttribute LicenseKeyAtt() {
            if (LicenseKeyAtt == null) {
            	LicenseKeyAtt = classof().getAttributeDef("LicenseKey");
            }
            return LicenseKeyAtt;
        }

        @objid ("833f27ff-ac8d-442d-a438-53b5ea49998f")
        public static SmAttribute MajVersionAtt() {
            if (MajVersionAtt == null) {
            	MajVersionAtt = classof().getAttributeDef("MajVersion");
            }
            return MajVersionAtt;
        }

        @objid ("fdbf1866-7f8f-4f3b-ba40-6f26770ab709")
        public static SmAttribute MinVersionAtt() {
            if (MinVersionAtt == null) {
            	MinVersionAtt = classof().getAttributeDef("MinVersion");
            }
            return MinVersionAtt;
        }

        @objid ("b3c9b89d-9b02-47d7-bdb8-aed0d58bf457")
        public static SmAttribute MinMinVersionAtt() {
            if (MinMinVersionAtt == null) {
            	MinMinVersionAtt = classof().getAttributeDef("MinMinVersion");
            }
            return MinMinVersionAtt;
        }

        @objid ("13efbda1-29dd-4436-890c-a7914a61a1a5")
        public static SmAttribute MinBinVersionCompatibilityAtt() {
            if (MinBinVersionCompatibilityAtt == null) {
            	MinBinVersionCompatibilityAtt = classof().getAttributeDef("MinBinVersionCompatibility");
            }
            return MinBinVersionCompatibilityAtt;
        }

        @objid ("e97aef69-17e3-4ab1-951d-be42fa5c0253")
        public static SmAttribute JavaClassNameAtt() {
            if (JavaClassNameAtt == null) {
            	JavaClassNameAtt = classof().getAttributeDef("JavaClassName");
            }
            return JavaClassNameAtt;
        }

        @objid ("886a90d3-e810-449b-8d2d-f410d7ce18a7")
        public static SmAttribute StateAtt() {
            if (StateAtt == null) {
            	StateAtt = classof().getAttributeDef("State");
            }
            return StateAtt;
        }

        @objid ("0de8d5c2-413c-4cac-8d01-c94614018dd7")
        public static SmDependency DefinedPropertyTypeDep() {
            if (DefinedPropertyTypeDep == null) {
            	DefinedPropertyTypeDep = classof().getDependencyDef("DefinedPropertyType");
            }
            return DefinedPropertyTypeDep;
        }

        @objid ("fb65486b-fa51-4774-9929-fb710ed51927")
        public static SmDependency OwnedProfileDep() {
            if (OwnedProfileDep == null) {
            	OwnedProfileDep = classof().getDependencyDef("OwnedProfile");
            }
            return OwnedProfileDep;
        }

        @objid ("d9eb4964-e9c4-4e40-8560-b539b7935f49")
        public static SmDependency ModuleParameterDep() {
            if (ModuleParameterDep == null) {
            	ModuleParameterDep = classof().getDependencyDef("ModuleParameter");
            }
            return ModuleParameterDep;
        }

        @objid ("9c2efa30-4446-4f35-b2b8-fab7fc111e33")
        public static SmDependency DependsOnDep() {
            if (DependsOnDep == null) {
            	DependsOnDep = classof().getDependencyDef("DependsOn");
            }
            return DependsOnDep;
        }

        @objid ("f66e14c4-9cb9-44ee-9826-56efb7b7c13f")
        public static SmDependency ImpactedDep() {
            if (ImpactedDep == null) {
            	ImpactedDep = classof().getDependencyDef("Impacted");
            }
            return ImpactedDep;
        }

        @objid ("4f0fb252-eca6-40d4-b1e4-dd7f7cd2992e")
        public static SmDependency getDefinedPropertyTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedPropertyTypeDep;
        }

        @objid ("14da39fe-52c9-4a1b-a82a-768b3715d701")
        public static SmAttribute getLicenseKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LicenseKeyAtt;
        }

        @objid ("e44fd3f9-c406-4cbb-b4a5-6f3892dab59a")
        public static SmDependency getDependsOnDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnDep;
        }

        @objid ("786c4041-a0d8-4cad-9457-ae221ede4a8d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f5882b8c-74a0-459c-9879-099f8836ba09")
        public static SmAttribute getJavaClassNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return JavaClassNameAtt;
        }

        @objid ("d1326def-c229-4958-999d-c1c2ca6dba55")
        public static SmAttribute getMinMinVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MinMinVersionAtt;
        }

        @objid ("927f3f49-09b7-4b00-91e2-a40008e5abeb")
        public static SmDependency getImpactedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImpactedDep;
        }

        @objid ("3aa44c8a-c4ac-4541-a37a-2ae918420f85")
        public static SmAttribute getMajVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MajVersionAtt;
        }

        @objid ("4bc44cdc-d68e-409d-a71b-ad62193e89eb")
        public static SmAttribute getMinBinVersionCompatibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MinBinVersionCompatibilityAtt;
        }

        @objid ("722a5276-2704-4b9e-b35d-066e31a67d5b")
        public static SmDependency getModuleParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModuleParameterDep;
        }

        @objid ("47ab009c-36bc-4943-84da-4835933823a0")
        public static SmAttribute getMinVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MinVersionAtt;
        }

        @objid ("a46aac2c-3e7b-49ef-9202-35ee7fb59829")
        public static SmAttribute getStateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StateAtt;
        }

        @objid ("49234e87-8828-49eb-aeaa-b3ce2cbdf940")
        public static SmDependency getOwnedProfileDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedProfileDep;
        }

        @objid ("0018638e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5f12e15e-12df-41c0-9397-eab07e2786c5")
            public ISmObjectData createData() {
                return new ModuleComponentData();
            }

            @objid ("5bd5e60b-a379-46f1-a97a-b28e3bdba913")
            public SmObjectImpl createImpl() {
                return new ModuleComponentImpl();
            }

        }

        @objid ("0018c6e4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LicenseKeySmAttribute extends SmAttribute {
            @objid ("e501c797-4ea6-4bc5-9a3a-b04bbe0697bd")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mLicenseKey;
            }

            @objid ("e0a3dae3-187c-4455-9220-4991cafde342")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mLicenseKey = value;
            }

        }

        @objid ("0019857a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MajVersionSmAttribute extends SmAttribute {
            @objid ("2536b5d2-346a-4406-a4f2-b0dd82279011")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMajVersion;
            }

            @objid ("47bc543e-bd5a-4822-9851-0b4f91e72875")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMajVersion = value;
            }

        }

        @objid ("0019e754-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MinVersionSmAttribute extends SmAttribute {
            @objid ("364eb170-5793-4c92-bd08-5c409717f039")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMinVersion;
            }

            @objid ("1e6dfa66-4948-494c-917b-93626192e623")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMinVersion = value;
            }

        }

        @objid ("001a4802-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MinMinVersionSmAttribute extends SmAttribute {
            @objid ("151c0954-c7de-4440-9c9b-b96933f013a3")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMinMinVersion;
            }

            @objid ("67a161e6-121a-40fb-8da1-9c6bd6303140")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMinMinVersion = value;
            }

        }

        @objid ("001aa928-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MinBinVersionCompatibilitySmAttribute extends SmAttribute {
            @objid ("d4e52e0b-1142-41de-b9f4-ad126cc70326")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMinBinVersionCompatibility;
            }

            @objid ("084246ef-036b-4e88-846f-6c1b5b731570")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMinBinVersionCompatibility = value;
            }

        }

        @objid ("001b6e9e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class JavaClassNameSmAttribute extends SmAttribute {
            @objid ("95320937-b8d0-486d-b720-e08db212d827")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mJavaClassName;
            }

            @objid ("f480b70c-4b69-4857-8354-4834cf5c30df")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mJavaClassName = value;
            }

        }

        @objid ("001bd10e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StateSmAttribute extends SmAttribute {
            @objid ("30a4684f-817a-4304-a892-b29b1a49425e")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mState;
            }

            @objid ("41bf9573-eecc-4ac0-be97-c3c59a1e2f76")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mState = value;
            }

        }

        @objid ("001d2824-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DependsOnSmDependency extends SmMultipleDependency {
            @objid ("9bea578d-8587-4181-a276-df9783eaa240")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mDependsOn != null)? ((ModuleComponentData)data).mDependsOn:SmMultipleDependency.EMPTY;
            }

            @objid ("8b8beb43-a3cd-4e4e-bb26-28f6f23a5655")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mDependsOn = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mDependsOn;
            }

            @objid ("5728a1b2-6470-403c-8b63-52ff0328c485")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.ImpactedDep();
            }

        }

        @objid ("001d9430-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImpactedSmDependency extends SmMultipleDependency {
            @objid ("9d83ebf4-6c2f-4f4a-ae57-93e902a51f7e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mImpacted != null)? ((ModuleComponentData)data).mImpacted:SmMultipleDependency.EMPTY;
            }

            @objid ("991935e5-9e31-4d26-89dc-4030dc1d6115")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mImpacted = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mImpacted;
            }

            @objid ("96e7cc82-e803-4a81-990a-bd7bcdffe58c")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.DependsOnDep();
            }

        }

        @objid ("001dfc7c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedProfileSmDependency extends SmMultipleDependency {
            @objid ("17c3d16c-2603-492d-8c86-b60f451c4625")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mOwnedProfile != null)? ((ModuleComponentData)data).mOwnedProfile:SmMultipleDependency.EMPTY;
            }

            @objid ("2a544914-1b09-4199-b1af-b54685a5ff18")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mOwnedProfile = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mOwnedProfile;
            }

            @objid ("b3c65515-037a-44e4-bc5c-4603b8248226")
            @Override
            public SmDependency getSymetric() {
                return ProfileData.Metadata.OwnerModuleDep();
            }

        }

        @objid ("001e6432-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ModuleParameterSmDependency extends SmMultipleDependency {
            @objid ("1277cd7a-5f8c-4887-bfe2-ad5714fd81fc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mModuleParameter != null)? ((ModuleComponentData)data).mModuleParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("b32e16ec-58b4-40ad-9900-9fb548289e6a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mModuleParameter = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mModuleParameter;
            }

            @objid ("3a3d7438-e8d4-4a1b-bfa5-d83bcf269ccc")
            @Override
            public SmDependency getSymetric() {
                return ModuleParameterData.Metadata.OwnerDep();
            }

        }

        @objid ("0075f8c8-ec98-1098-b22e-001ec947cd2a")
        public static class DefinedPropertyTypeSmDependency extends SmMultipleDependency {
            @objid ("870c1211-8ede-4a73-b821-802854eadb89")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mDefinedPropertyType != null)? ((ModuleComponentData)data).mDefinedPropertyType:SmMultipleDependency.EMPTY;
            }

            @objid ("b267c2ef-2d2d-44cd-b7b0-0e1738b78a21")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mDefinedPropertyType = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mDefinedPropertyType;
            }

            @objid ("d0bcc853-57db-4082-be29-b6378fd84f0d")
            @Override
            public SmDependency getSymetric() {
                return PropertyTypeData.Metadata.ModuleOwnerDep();
            }

        }

    }

}
