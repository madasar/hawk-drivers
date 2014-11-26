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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.infrastructure.DependencyImpl;
import org.modelio.metamodel.uml.infrastructure.Dependency;
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

@objid ("0086407a-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Dependency.class, factory=DependencyData.Metadata.ObjectFactory.class)
public class DependencyData extends ModelElementData {
    @objid ("17fea64d-f795-425e-84f2-123ba2098f4d")
    @SmaMetaAttribute(metaName="DependsOnId", type=String.class, smAttributeClass=Metadata.DependsOnIdSmAttribute.class, fpindexed=true)
     Object mDependsOnId = "";

    @objid ("d8720fc5-ffe0-43f7-866d-b7e578485161")
    @SmaMetaAttribute(metaName="DependsOnName", type=String.class, smAttributeClass=Metadata.DependsOnNameSmAttribute.class)
     Object mDependsOnName = "";

    @objid ("02c61ede-cbda-4d73-aeab-fcd255b6cd4a")
    @SmaMetaAssociation(metaName="DependsOn", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.DependsOnSmDependency.class, partof = true)
     SmObjectImpl mDependsOn;

    @objid ("6c8b834a-9840-48b6-83f4-920e6eedd431")
    @SmaMetaAssociation(metaName="Impacted", typeDataClass=ModelElementData.class, min=1, max=1, smAssociationClass=Metadata.ImpactedSmDependency.class)
     SmObjectImpl mImpacted;

    @objid ("dde06172-6e3c-4867-8981-d2047699a435")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00457590-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("53b3169a-f153-4668-be6a-47da7c4db39a")
        private static SmClass smClass = null;

        @objid ("1bdaf1d8-c65d-4929-b0aa-8b66b8a9a60e")
        private static SmAttribute DependsOnIdAtt = null;

        @objid ("4502180c-c7ed-4bbf-ab17-4f0ad802289f")
        private static SmAttribute DependsOnNameAtt = null;

        @objid ("b56578be-9e0d-44d1-ba76-b598457673d8")
        private static SmDependency DependsOnDep = null;

        @objid ("b60f0c77-fa96-4694-b7ff-b0534d4711ed")
        private static SmDependency ImpactedDep = null;

        @objid ("48a3fae4-d7b0-4c8d-b7ba-159af2037f94")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DependencyData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("db61ca0c-c625-4201-b183-d398916be768")
        public static SmAttribute DependsOnIdAtt() {
            if (DependsOnIdAtt == null) {
            	DependsOnIdAtt = classof().getAttributeDef("DependsOnId");
            }
            return DependsOnIdAtt;
        }

        @objid ("dad3e3c2-c690-4f1f-a04e-71b5c5a354af")
        public static SmAttribute DependsOnNameAtt() {
            if (DependsOnNameAtt == null) {
            	DependsOnNameAtt = classof().getAttributeDef("DependsOnName");
            }
            return DependsOnNameAtt;
        }

        @objid ("6d18ff9e-c99f-45aa-8532-483e8eecb9e4")
        public static SmDependency DependsOnDep() {
            if (DependsOnDep == null) {
            	DependsOnDep = classof().getDependencyDef("DependsOn");
            }
            return DependsOnDep;
        }

        @objid ("8a1ecaa5-d8f0-45f4-9574-8e3bf8bf5878")
        public static SmDependency ImpactedDep() {
            if (ImpactedDep == null) {
            	ImpactedDep = classof().getDependencyDef("Impacted");
            }
            return ImpactedDep;
        }

        @objid ("6073d27b-430e-4f9f-bcf8-e436db80498d")
        public static SmAttribute getDependsOnIdAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnIdAtt;
        }

        @objid ("cd239779-6f48-4edb-98c5-55219d56a03c")
        public static SmDependency getImpactedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImpactedDep;
        }

        @objid ("24748de7-ebd7-4a31-8abc-856516b75017")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("36f36e88-c467-4b41-bd19-be972fc5c229")
        public static SmDependency getDependsOnDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnDep;
        }

        @objid ("dd45af5c-0ef8-4f2e-a936-cdb782a1135d")
        public static SmAttribute getDependsOnNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnNameAtt;
        }

        @objid ("0045bab4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e78c60b6-7261-471a-b238-46d24b6b746e")
            public ISmObjectData createData() {
                return new DependencyData();
            }

            @objid ("86f9f480-2c2c-46f3-93f1-73441d1f2284")
            public SmObjectImpl createImpl() {
                return new DependencyImpl();
            }

        }

        @objid ("00461c48-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DependsOnIdSmAttribute extends SmAttribute {
            @objid ("856945a5-b891-402d-b04d-97a1dd459edf")
            public Object getValue(ISmObjectData data) {
                return ((DependencyData) data).mDependsOnId;
            }

            @objid ("7a0cc7bf-82b8-4df0-861c-c8281132224b")
            public void setValue(ISmObjectData data, Object value) {
                ((DependencyData) data).mDependsOnId = value;
            }

        }

        @objid ("00467dfa-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DependsOnNameSmAttribute extends SmAttribute {
            @objid ("af035279-e76a-4e54-92e0-e8ffe5a1a8da")
            public Object getValue(ISmObjectData data) {
                return ((DependencyData) data).mDependsOnName;
            }

            @objid ("450450a1-6d3b-49b3-8437-31ebb6acd83b")
            public void setValue(ISmObjectData data, Object value) {
                ((DependencyData) data).mDependsOnName = value;
            }

        }

        @objid ("0046e1be-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImpactedSmDependency extends SmSingleDependency {
            @objid ("d4ca97c0-82c9-4c9b-9729-f8cdcf5ab971")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DependencyData) data).mImpacted;
            }

            @objid ("53949a28-6caf-4d0a-b144-9f0bde9d156d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DependencyData) data).mImpacted = value;
            }

            @objid ("5a24995e-00ea-4c94-9a46-3fd86e5fb37a")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DependsOnDependencyDep();
            }

        }

        @objid ("00475a7c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DependsOnSmDependency extends SmSingleDependency {
            @objid ("adad4045-2a00-4c1d-beb8-7976d6afcab5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DependencyData) data).mDependsOn;
            }

            @objid ("d9232acd-eae6-4a72-bc9c-7b821ba2b313")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DependencyData) data).mDependsOn = value;
            }

            @objid ("0a91b8fc-73e6-431b-abc9-5a7b7ef3619b")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ImpactedDependencyDep();
            }

        }

    }

}
