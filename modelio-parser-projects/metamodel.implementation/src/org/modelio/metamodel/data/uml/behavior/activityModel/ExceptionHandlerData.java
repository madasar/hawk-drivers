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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityActionData;
import org.modelio.metamodel.data.uml.behavior.activityModel.InputPinData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ExceptionHandlerImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
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

@objid ("0030e0d0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExceptionHandler.class, factory=ExceptionHandlerData.Metadata.ObjectFactory.class)
public class ExceptionHandlerData extends ModelElementData {
    @objid ("11f7d258-a816-4995-b748-041082246a90")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("2ab8c56f-fd89-4187-a70d-3db2fbbd2619")
    @SmaMetaAttribute(metaName="Weight", type=String.class, smAttributeClass=Metadata.WeightSmAttribute.class)
     Object mWeight = "1";

    @objid ("c7b098cb-ec9e-4361-a0e2-b7f2fbd9c0c8")
    @SmaMetaAssociation(metaName="ProtectedNode", typeDataClass=ActivityActionData.class, min=1, max=1, smAssociationClass=Metadata.ProtectedNodeSmDependency.class)
     SmObjectImpl mProtectedNode;

    @objid ("5ed05181-f74b-401b-9c68-a81a48bf5741")
    @SmaMetaAssociation(metaName="ExceptionInput", typeDataClass=InputPinData.class, min=1, max=1, smAssociationClass=Metadata.ExceptionInputSmDependency.class, partof = true)
     SmObjectImpl mExceptionInput;

    @objid ("a0333dac-3da1-4e9b-8a55-ca1d7f8921d7")
    @SmaMetaAssociation(metaName="ExceptionType", typeDataClass=GeneralClassData.class, min=0, max=-1, smAssociationClass=Metadata.ExceptionTypeSmDependency.class, partof = true)
     List<SmObjectImpl> mExceptionType = null;

    @objid ("cd66fa9d-f87f-42b8-8872-62930d9d6728")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000cff94-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a297efe8-8f9f-4be5-b49f-32dd0c3ebcf9")
        private static SmClass smClass = null;

        @objid ("66c0b93a-2831-4cd5-8240-445915b81c83")
        private static SmAttribute GuardAtt = null;

        @objid ("985b20b6-2295-4d10-b04e-2e634c91eea0")
        private static SmAttribute WeightAtt = null;

        @objid ("d1012fb7-9ec8-4300-a8f6-acbd4eda90aa")
        private static SmDependency ProtectedNodeDep = null;

        @objid ("f9560fb8-e27b-4193-abdd-7112302dbaa0")
        private static SmDependency ExceptionInputDep = null;

        @objid ("204c00e0-c6ec-4344-a194-da25523370ce")
        private static SmDependency ExceptionTypeDep = null;

        @objid ("6395e972-c7be-42b1-8355-3e36990c1615")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExceptionHandlerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c1f59f19-766c-4f74-a356-27c2601aa6ab")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("355619b0-887f-4fa5-9db9-51a0a61c16a8")
        public static SmAttribute WeightAtt() {
            if (WeightAtt == null) {
            	WeightAtt = classof().getAttributeDef("Weight");
            }
            return WeightAtt;
        }

        @objid ("ceffc54d-3877-47e2-a025-2f395e3ec487")
        public static SmDependency ProtectedNodeDep() {
            if (ProtectedNodeDep == null) {
            	ProtectedNodeDep = classof().getDependencyDef("ProtectedNode");
            }
            return ProtectedNodeDep;
        }

        @objid ("cea6ef8c-218d-4411-9384-7df9c3678a10")
        public static SmDependency ExceptionInputDep() {
            if (ExceptionInputDep == null) {
            	ExceptionInputDep = classof().getDependencyDef("ExceptionInput");
            }
            return ExceptionInputDep;
        }

        @objid ("3a6d80fe-d3a3-4fa8-a17b-8ab6e5a603b8")
        public static SmDependency ExceptionTypeDep() {
            if (ExceptionTypeDep == null) {
            	ExceptionTypeDep = classof().getDependencyDef("ExceptionType");
            }
            return ExceptionTypeDep;
        }

        @objid ("fe24c787-2eb7-4eba-bc51-5450cce1573a")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("28dc24ca-9ef4-46aa-be75-3c1d80b462cc")
        public static SmDependency getExceptionInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExceptionInputDep;
        }

        @objid ("fb6d6522-3936-4449-af43-65e062b87eb7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("695bdcbb-bb60-4b77-a5e1-18a89329d4b4")
        public static SmDependency getExceptionTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExceptionTypeDep;
        }

        @objid ("451d206f-38e9-45b2-adf0-8246d9584a30")
        public static SmAttribute getWeightAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return WeightAtt;
        }

        @objid ("04b38861-215c-42c0-8efa-b8291858c623")
        public static SmDependency getProtectedNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProtectedNodeDep;
        }

        @objid ("000d40d0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("91e51fa4-bd56-4f10-ad06-44bd2e39abb8")
            public ISmObjectData createData() {
                return new ExceptionHandlerData();
            }

            @objid ("6af36017-f6f5-40d9-b3f5-5d900fdcf2b8")
            public SmObjectImpl createImpl() {
                return new ExceptionHandlerImpl();
            }

        }

        @objid ("000da2d2-c4c6-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("b82d2377-7598-4523-ac18-c687de2a0674")
            public Object getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mGuard;
            }

            @objid ("b41210c1-909c-4534-b743-b2d1dc658703")
            public void setValue(ISmObjectData data, Object value) {
                ((ExceptionHandlerData) data).mGuard = value;
            }

        }

        @objid ("000e092a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class WeightSmAttribute extends SmAttribute {
            @objid ("b3a050b0-c5a1-45b6-941b-e690c45665ce")
            public Object getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mWeight;
            }

            @objid ("165eb69d-13dc-4549-a285-6eb5ebe7ef8a")
            public void setValue(ISmObjectData data, Object value) {
                ((ExceptionHandlerData) data).mWeight = value;
            }

        }

        @objid ("000e6c9e-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ExceptionInputSmDependency extends SmSingleDependency {
            @objid ("5508bd6c-c198-492b-b765-ccb728f10ec4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mExceptionInput;
            }

            @objid ("473f1121-872b-445d-8eab-460f8c24ecdd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExceptionHandlerData) data).mExceptionInput = value;
            }

            @objid ("9f47cada-3aa8-4116-bb00-2ad656ba9ba1")
            @Override
            public SmDependency getSymetric() {
                return InputPinData.Metadata.HandlerDep();
            }

        }

        @objid ("000ee368-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ProtectedNodeSmDependency extends SmSingleDependency {
            @objid ("3c1f1315-0010-4e21-a707-33b6a5900205")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mProtectedNode;
            }

            @objid ("1a62921d-7847-48fe-bc45-af92bfcfa8fb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExceptionHandlerData) data).mProtectedNode = value;
            }

            @objid ("0d4e9785-a24a-4dd1-8b20-921a0c2372e5")
            @Override
            public SmDependency getSymetric() {
                return ActivityActionData.Metadata.HandlerDep();
            }

        }

        @objid ("000f5974-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ExceptionTypeSmDependency extends SmMultipleDependency {
            @objid ("6f5da7ed-a646-458b-b643-b2c5fdad5a6e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExceptionHandlerData)data).mExceptionType != null)? ((ExceptionHandlerData)data).mExceptionType:SmMultipleDependency.EMPTY;
            }

            @objid ("9e56fa58-0eed-45b0-9be5-ceb163c2ea88")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExceptionHandlerData) data).mExceptionType = new ArrayList<>(initialCapacity);
                return ((ExceptionHandlerData) data).mExceptionType;
            }

            @objid ("54334025-2e07-44cb-80cb-b2319e7482df")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.ExceptionInputDep();
            }

        }

    }

}
