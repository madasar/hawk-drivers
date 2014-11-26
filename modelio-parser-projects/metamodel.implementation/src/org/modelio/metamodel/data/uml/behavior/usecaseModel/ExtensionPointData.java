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
import org.modelio.metamodel.data.uml.behavior.usecaseModel.UseCaseData;
import org.modelio.metamodel.data.uml.behavior.usecaseModel.UseCaseDependencyData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.ExtensionPointImpl;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
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

@objid ("0059d030-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExtensionPoint.class, factory=ExtensionPointData.Metadata.ObjectFactory.class)
public class ExtensionPointData extends ModelElementData {
    @objid ("d9947961-4bd7-4f2c-9146-5c3bc0a7bd6c")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PUBLIC;

    @objid ("dd880cc0-19b6-40bf-aca5-0e01294ed8da")
    @SmaMetaAssociation(metaName="Extended", typeDataClass=UseCaseDependencyData.class, min=0, max=-1, smAssociationClass=Metadata.ExtendedSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mExtended = null;

    @objid ("bdc65332-e84d-4bc8-bc8f-04c6a617c395")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=UseCaseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("feede6f1-fb78-4a97-82d8-d1bf6bdde8fa")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003f5322-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2193c80b-69d1-4b6e-ae86-4cd8a8683351")
        private static SmClass smClass = null;

        @objid ("50c61b0d-05c5-4ebb-b563-fdcbda74724c")
        private static SmAttribute VisibilityAtt = null;

        @objid ("866f587b-3f17-4c84-9e31-392efe1375f9")
        private static SmDependency ExtendedDep = null;

        @objid ("4a7893c6-0a02-4828-9484-e76924fd0af7")
        private static SmDependency OwnerDep = null;

        @objid ("b11f150e-7788-4c13-b7be-ef2b43887155")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExtensionPointData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2a74c99f-8b6b-4be3-a27b-d1a2588c7514")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("e4086102-32c6-4350-98c2-1a60e85cd4d0")
        public static SmDependency ExtendedDep() {
            if (ExtendedDep == null) {
            	ExtendedDep = classof().getDependencyDef("Extended");
            }
            return ExtendedDep;
        }

        @objid ("324c6da1-15d5-42ec-b767-3bd52c4f4fe4")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("44fb5845-3046-4529-88ad-48048aa8f74b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8ab800ed-9bcb-4218-9351-76b942607e9a")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("3023cec8-1a6d-4362-bd2c-c84d772864aa")
        public static SmDependency getExtendedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtendedDep;
        }

        @objid ("5d51227a-bd26-48e0-89e9-321f2c61e3e1")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("003f98e6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2180ee92-7581-4cc2-875f-65dec4bd0b40")
            public ISmObjectData createData() {
                return new ExtensionPointData();
            }

            @objid ("2c6152fb-b15c-4ca6-a39f-da0703d59dac")
            public SmObjectImpl createImpl() {
                return new ExtensionPointImpl();
            }

        }

        @objid ("003ffb92-c4c3-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("6e33809c-cbaf-4915-9345-fbaf289199e8")
            public Object getValue(ISmObjectData data) {
                return ((ExtensionPointData) data).mVisibility;
            }

            @objid ("f0958621-adad-4ca8-b33f-2c21f99b9e89")
            public void setValue(ISmObjectData data, Object value) {
                ((ExtensionPointData) data).mVisibility = value;
            }

        }

        @objid ("00405fd8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("aaeb47cc-bc14-46fb-a7fd-c13a8c2a9209")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExtensionPointData) data).mOwner;
            }

            @objid ("1c0b8f16-b3af-405c-87b8-41fe1a08af03")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExtensionPointData) data).mOwner = value;
            }

            @objid ("178c66fe-fc0d-4f5e-bcfb-65c10b27d882")
            @Override
            public SmDependency getSymetric() {
                return UseCaseData.Metadata.OwnedExtensionDep();
            }

        }

        @objid ("00419ac4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ExtendedSmDependency extends SmMultipleDependency {
            @objid ("7c00fade-e954-42f5-80cb-f242c0b1fe09")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExtensionPointData)data).mExtended != null)? ((ExtensionPointData)data).mExtended:SmMultipleDependency.EMPTY;
            }

            @objid ("883b26de-3c16-4144-b37a-5a612313c9a6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExtensionPointData) data).mExtended = new ArrayList<>(initialCapacity);
                return ((ExtensionPointData) data).mExtended;
            }

            @objid ("a3356b98-3321-466d-9141-7b782d3755e3")
            @Override
            public SmDependency getSymetric() {
                return UseCaseDependencyData.Metadata.ExtensionLocationDep();
            }

        }

    }

}
