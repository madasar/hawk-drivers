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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.GenericAnalystElement;
import org.modelio.metamodel.data.analyst.GenericAnalystContainerData;
import org.modelio.metamodel.impl.analyst.GenericAnalystElementImpl;
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

@objid ("efe46dc4-941a-4fc9-9c1b-e10b1c1e8cea")
@SmaMetaClass(mmClass=GenericAnalystElement.class, factory=GenericAnalystElementData.Metadata.ObjectFactory.class, cmsnode=true)
public class GenericAnalystElementData extends AnalystElementData {
    @objid ("9d5b2ac8-126b-4067-abe2-db39a5a582c4")
    @SmaMetaAssociation(metaName="SubElement", typeDataClass=GenericAnalystElementData.class, min=0, max=-1, smAssociationClass=Metadata.SubElementSmDependency.class, component = true)
     List<SmObjectImpl> mSubElement = null;

    @objid ("c7e2561d-f24a-4bf8-8fdc-1258985e348b")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=GenericAnalystContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("6cfef27f-06cf-4b0f-84e6-b19780ccacd7")
    @SmaMetaAssociation(metaName="ParentElement", typeDataClass=GenericAnalystElementData.class, min=0, max=1, smAssociationClass=Metadata.ParentElementSmDependency.class)
     SmObjectImpl mParentElement;

    @objid ("5a03d6e8-91da-446d-ad61-fcf9db7cd053")
    @SmaMetaAssociation(metaName="LastElementVersion", typeDataClass=GenericAnalystElementData.class, min=0, max=1, smAssociationClass=Metadata.LastElementVersionSmDependency.class)
     SmObjectImpl mLastElementVersion;

    @objid ("46dc56fe-a09d-4b10-8d92-dd7f7c121c29")
    @SmaMetaAssociation(metaName="ArchivedElementVersion", typeDataClass=GenericAnalystElementData.class, min=0, max=-1, smAssociationClass=Metadata.ArchivedElementVersionSmDependency.class, component = true)
     List<SmObjectImpl> mArchivedElementVersion = null;

    @objid ("fafae6e3-4eb6-4aa0-a160-6d6cfbb52a21")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("d5741ea9-0633-4aae-88e4-b33548a7bdb5")
    public static class Metadata {
        @objid ("d78edb21-d13e-4737-aaa4-ac04eb2ee1d9")
        private static SmClass smClass = null;

        @objid ("b7072b0e-1d5c-4b33-9177-f0bb4ea6fadf")
        private static SmDependency SubElementDep = null;

        @objid ("4131baa4-604d-4b5f-a7fd-a643208face9")
        private static SmDependency OwnerContainerDep = null;

        @objid ("9dbfcd53-ea88-4f6b-b980-2cdf21935d67")
        private static SmDependency ParentElementDep = null;

        @objid ("ce5cc2c9-b67b-4f60-bea7-177802ae1041")
        private static SmDependency LastElementVersionDep = null;

        @objid ("4bfc6225-b6e6-40fe-bac8-119efd69c8dd")
        private static SmDependency ArchivedElementVersionDep = null;

        @objid ("fd3ae8f7-6650-4a9c-a9ca-a6c23812faaf")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GenericAnalystElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4932b0f5-ec46-47f3-bd82-e7b7a2f3c930")
        public static SmDependency SubElementDep() {
            if (SubElementDep == null) {
            	SubElementDep = classof().getDependencyDef("SubElement");
            }
            return SubElementDep;
        }

        @objid ("77273b4d-111a-4d82-85cf-2c5d5d223857")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("8c0940ec-50f6-4be6-8553-3942bf693dcc")
        public static SmDependency ParentElementDep() {
            if (ParentElementDep == null) {
            	ParentElementDep = classof().getDependencyDef("ParentElement");
            }
            return ParentElementDep;
        }

        @objid ("ccca3420-afb7-418b-ab89-f6beb3ff83e2")
        public static SmDependency LastElementVersionDep() {
            if (LastElementVersionDep == null) {
            	LastElementVersionDep = classof().getDependencyDef("LastElementVersion");
            }
            return LastElementVersionDep;
        }

        @objid ("fe7cb448-0817-4a7d-a8de-093049648ec3")
        public static SmDependency ArchivedElementVersionDep() {
            if (ArchivedElementVersionDep == null) {
            	ArchivedElementVersionDep = classof().getDependencyDef("ArchivedElementVersion");
            }
            return ArchivedElementVersionDep;
        }

        @objid ("7e5a2340-ea6d-400c-a4e7-26b630ace608")
        public static SmDependency getSubElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubElementDep;
        }

        @objid ("05f72c7e-4135-45e8-a6f7-0504a7e49729")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c0916149-5f3f-4aed-ae30-27f656f80398")
        public static SmDependency getParentElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentElementDep;
        }

        @objid ("07fbec86-fac5-442c-aeda-a05a7335bc26")
        public static SmDependency getLastElementVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LastElementVersionDep;
        }

        @objid ("c894ff34-fa4c-4a2a-87cf-2b8c44efce8c")
        public static SmDependency getArchivedElementVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArchivedElementVersionDep;
        }

        @objid ("b097f2e6-3f42-4fed-91ba-611ffffe67f7")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("cc1ce53d-0f1b-43c2-9c59-dcd9e04d69c7")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("885c8343-85b0-45d6-8d05-0e6cfb207de2")
            public ISmObjectData createData() {
                return new GenericAnalystElementData();
            }

            @objid ("6f26ee97-07a4-4218-a59c-2cf05c35207a")
            public SmObjectImpl createImpl() {
                return new GenericAnalystElementImpl();
            }

        }

        @objid ("cea8b035-ed3b-494e-a32d-368ef075b1db")
        public static class SubElementSmDependency extends SmMultipleDependency {
            @objid ("af223ba4-0303-4125-b200-ca3d03c9fbbf")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GenericAnalystElementData)data).mSubElement != null)? ((GenericAnalystElementData)data).mSubElement:SmMultipleDependency.EMPTY;
            }

            @objid ("a7c8680b-16ec-4628-9c49-fb54db06c1ba")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GenericAnalystElementData) data).mSubElement = new ArrayList<>(initialCapacity);
                return ((GenericAnalystElementData) data).mSubElement;
            }

            @objid ("bb95f7b9-f92c-4fe8-8059-0be5d45114f4")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystElementData.Metadata.ParentElementDep();
            }

        }

        @objid ("8e30e4ba-172d-4cea-8352-de8b6d58661c")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("f69e8c9b-8079-4684-86d2-1ec2227aa018")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GenericAnalystElementData) data).mOwnerContainer;
            }

            @objid ("b02248b2-42c3-46c7-8dd2-91fb1b0e31cf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GenericAnalystElementData) data).mOwnerContainer = value;
            }

            @objid ("db2a1441-0793-4813-a5b2-a0f34d3b40e0")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystContainerData.Metadata.OwnedElementDep();
            }

        }

        @objid ("736a5f2b-71ab-4258-8737-9d9e5687c9d1")
        public static class ParentElementSmDependency extends SmSingleDependency {
            @objid ("f42b7cd5-e09c-4023-a39e-2ece874e2b1d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GenericAnalystElementData) data).mParentElement;
            }

            @objid ("c8cfc0b7-b28a-4904-9363-379e02234562")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GenericAnalystElementData) data).mParentElement = value;
            }

            @objid ("eeb6b276-690d-4d9b-9e40-2569411c6fd3")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystElementData.Metadata.SubElementDep();
            }

        }

        @objid ("1e706646-429b-4798-8d27-7429d6326ca3")
        public static class LastElementVersionSmDependency extends SmSingleDependency {
            @objid ("46711bed-5804-4b26-aa2c-f5070f7177f4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GenericAnalystElementData) data).mLastElementVersion;
            }

            @objid ("6707e668-d57e-4c2d-82ca-cdd1c9b53444")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GenericAnalystElementData) data).mLastElementVersion = value;
            }

            @objid ("b1527925-4b4a-4e75-87a8-41e6a165e74b")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystElementData.Metadata.ArchivedElementVersionDep();
            }

        }

        @objid ("ca7a2736-8b29-4dfc-8232-5be80f7ed531")
        public static class ArchivedElementVersionSmDependency extends SmMultipleDependency {
            @objid ("dfd6cf09-d5e7-47b3-ae8f-54e238c101cb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GenericAnalystElementData)data).mArchivedElementVersion != null)? ((GenericAnalystElementData)data).mArchivedElementVersion:SmMultipleDependency.EMPTY;
            }

            @objid ("28703721-0212-4b7c-ba59-6e1cbc42c4fd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GenericAnalystElementData) data).mArchivedElementVersion = new ArrayList<>(initialCapacity);
                return ((GenericAnalystElementData) data).mArchivedElementVersion;
            }

            @objid ("e3d69d05-13a7-4b7b-8d75-f951db597e23")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystElementData.Metadata.LastElementVersionDep();
            }

        }

    }

}
