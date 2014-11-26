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
package org.modelio.metamodel.data.uml.behavior.usecaseModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.usecaseModel.ExtensionPointData;
import org.modelio.metamodel.data.uml.behavior.usecaseModel.UseCaseData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.UseCaseDependencyImpl;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
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

@objid ("00595600-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=UseCaseDependency.class, factory=UseCaseDependencyData.Metadata.ObjectFactory.class)
public class UseCaseDependencyData extends ModelElementData {
    @objid ("dee7dc8b-239a-44e9-b8c3-ba82a5f46363")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=UseCaseData.class, min=1, max=1, smAssociationClass=Metadata.OriginSmDependency.class)
     SmObjectImpl mOrigin;

    @objid ("fd297917-6727-45cb-b6f6-a2a2feb86253")
    @SmaMetaAssociation(metaName="ExtensionLocation", typeDataClass=ExtensionPointData.class, min=0, max=-1, smAssociationClass=Metadata.ExtensionLocationSmDependency.class, partof = true)
     List<SmObjectImpl> mExtensionLocation = null;

    @objid ("7c603312-928c-4c00-8461-d7284f90aa12")
    @SmaMetaAssociation(metaName="Target", typeDataClass=UseCaseData.class, min=1, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("02a6c81d-3843-4306-94f9-55055d4279bb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007a55d0-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fcacb6a1-2e32-4f1b-a241-a1c1b0c4a400")
        private static SmClass smClass = null;

        @objid ("213789a5-c692-494d-9498-38e23588b977")
        private static SmDependency OriginDep = null;

        @objid ("e03606c3-1297-42ba-b483-51abff65fd12")
        private static SmDependency ExtensionLocationDep = null;

        @objid ("1fa06f76-9382-4933-a81d-5a3f0ac939e1")
        private static SmDependency TargetDep = null;

        @objid ("a36a0b8d-ed8c-4d9c-b6cd-637cd4c9df84")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(UseCaseDependencyData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e31f3a1e-a5fc-4575-bdb0-987fe7cc0356")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("e0ca557e-003c-4d3c-9b5e-e44504bbc677")
        public static SmDependency ExtensionLocationDep() {
            if (ExtensionLocationDep == null) {
            	ExtensionLocationDep = classof().getDependencyDef("ExtensionLocation");
            }
            return ExtensionLocationDep;
        }

        @objid ("2eddba17-c702-4bd7-9d56-db7be1a098cc")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("d45b4317-7b40-4f1d-97e4-b8201374c242")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("91964191-81b5-40cc-85aa-2f2bcc5e9b3e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e86ee4a8-ed46-49c4-9e04-a5b36d9baa78")
        public static SmDependency getExtensionLocationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtensionLocationDep;
        }

        @objid ("6a7b0f95-0e05-4026-8cc3-2663e3010c6b")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("007a97fc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1964169e-ecb8-449b-bf8d-7997199fc5f9")
            public ISmObjectData createData() {
                return new UseCaseDependencyData();
            }

            @objid ("9474ea08-e7f2-4720-aad8-c1babbce0691")
            public SmObjectImpl createImpl() {
                return new UseCaseDependencyImpl();
            }

        }

        @objid ("007afbca-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ExtensionLocationSmDependency extends SmMultipleDependency {
            @objid ("5082501a-49a3-4e44-ba2c-c44c2dbd7d72")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseDependencyData)data).mExtensionLocation != null)? ((UseCaseDependencyData)data).mExtensionLocation:SmMultipleDependency.EMPTY;
            }

            @objid ("8c22c0a4-82dc-4a85-b0e2-0d325a5894db")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseDependencyData) data).mExtensionLocation = new ArrayList<>(initialCapacity);
                return ((UseCaseDependencyData) data).mExtensionLocation;
            }

            @objid ("454672cf-a430-4f36-b7b8-760d73d03c89")
            @Override
            public SmDependency getSymetric() {
                return ExtensionPointData.Metadata.ExtendedDep();
            }

        }

        @objid ("007b5ff2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmSingleDependency {
            @objid ("439e4d67-5036-4d99-8e42-f5e27a9f2c46")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((UseCaseDependencyData) data).mOrigin;
            }

            @objid ("af738497-6029-4a66-9de4-fc4da864e9a3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((UseCaseDependencyData) data).mOrigin = value;
            }

            @objid ("55935be4-a049-4bce-8c8c-59f56559239a")
            @Override
            public SmDependency getSymetric() {
                return UseCaseData.Metadata.UsedDep();
            }

        }

        @objid ("007bd5ea-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("e2348ae3-8dd9-46f7-ac8c-756f76d9b18e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((UseCaseDependencyData) data).mTarget;
            }

            @objid ("941938bf-4494-4a2e-a3ca-0aa007d980be")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((UseCaseDependencyData) data).mTarget = value;
            }

            @objid ("2de688aa-6ca9-427a-9704-6f547fa0a2a9")
            @Override
            public SmDependency getSymetric() {
                return UseCaseData.Metadata.UserDep();
            }

        }

    }

}
