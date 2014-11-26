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
package org.modelio.metamodel.data.bpmn.resources;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceParameterData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceRoleData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceParameterBindingImpl;
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

@objid ("000b8d44-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnResourceParameterBinding.class, factory=BpmnResourceParameterBindingData.Metadata.ObjectFactory.class)
public class BpmnResourceParameterBindingData extends BpmnBaseElementData {
    @objid ("ebe89da6-1429-486e-b9a7-c9bfc86bf81f")
    @SmaMetaAttribute(metaName="Expression", type=String.class, smAttributeClass=Metadata.ExpressionSmAttribute.class)
     Object mExpression = "";

    @objid ("e4192f78-6d65-4753-9635-a159dcdd9f13")
    @SmaMetaAssociation(metaName="ResourceRole", typeDataClass=BpmnResourceRoleData.class, min=1, max=1, smAssociationClass=Metadata.ResourceRoleSmDependency.class)
     SmObjectImpl mResourceRole;

    @objid ("07bb66cd-5e87-497a-9294-87fea73c5306")
    @SmaMetaAssociation(metaName="ParameterRef", typeDataClass=BpmnResourceParameterData.class, min=1, max=1, smAssociationClass=Metadata.ParameterRefSmDependency.class, partof = true)
     SmObjectImpl mParameterRef;

    @objid ("5f297266-6748-4106-92f3-282363105281")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0072dd3c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("def167b9-a838-4d14-a560-030b25c5af2b")
        private static SmClass smClass = null;

        @objid ("861f2930-9cf5-4c32-a489-6d9e88e3c720")
        private static SmAttribute ExpressionAtt = null;

        @objid ("f6bc3266-e5b0-4339-923a-f5a8bce6d5e4")
        private static SmDependency ResourceRoleDep = null;

        @objid ("da0df5f1-c6ff-4866-8c47-bcbaec2097a2")
        private static SmDependency ParameterRefDep = null;

        @objid ("f4911957-b6ae-45d6-80ad-1b47f080b7b2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceParameterBindingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("47cf1129-0391-43dc-a1b7-69c01ae6c6e5")
        public static SmAttribute ExpressionAtt() {
            if (ExpressionAtt == null) {
            	ExpressionAtt = classof().getAttributeDef("Expression");
            }
            return ExpressionAtt;
        }

        @objid ("0d7b9503-e0b2-4d90-aa98-03e119ce4c33")
        public static SmDependency ResourceRoleDep() {
            if (ResourceRoleDep == null) {
            	ResourceRoleDep = classof().getDependencyDef("ResourceRole");
            }
            return ResourceRoleDep;
        }

        @objid ("1e720cb9-87c1-4a2f-85d6-c46361be3521")
        public static SmDependency ParameterRefDep() {
            if (ParameterRefDep == null) {
            	ParameterRefDep = classof().getDependencyDef("ParameterRef");
            }
            return ParameterRefDep;
        }

        @objid ("3ed1b683-6f08-4712-a5db-8f970f434fb7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("64ea4438-d647-4cd5-b002-f08001060b6d")
        public static SmDependency getResourceRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceRoleDep;
        }

        @objid ("d593da0f-f37a-4725-a6df-3492cc070332")
        public static SmDependency getParameterRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterRefDep;
        }

        @objid ("7907b332-fef6-41fe-bf4b-b5e7cac48e98")
        public static SmAttribute getExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExpressionAtt;
        }

        @objid ("00732f44-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b8d8f7c6-6908-4032-9e56-9c7bc5624fd7")
            public ISmObjectData createData() {
                return new BpmnResourceParameterBindingData();
            }

            @objid ("a08483f4-d483-4fb2-a01d-27e6d1a19c6b")
            public SmObjectImpl createImpl() {
                return new BpmnResourceParameterBindingImpl();
            }

        }

        @objid ("0073a0e6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExpressionSmAttribute extends SmAttribute {
            @objid ("b41aea2f-3738-4676-8274-d7e125bd2542")
            public Object getValue(ISmObjectData data) {
                return ((BpmnResourceParameterBindingData) data).mExpression;
            }

            @objid ("a3d2edae-b009-465e-880f-dece9dd6816c")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnResourceParameterBindingData) data).mExpression = value;
            }

        }

        @objid ("00741530-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParameterRefSmDependency extends SmSingleDependency {
            @objid ("d90a7338-d3da-4189-b024-1fd82b9b7be6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterBindingData) data).mParameterRef;
            }

            @objid ("dae09aa1-d783-4b72-b49f-9eee2f3eaad5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterBindingData) data).mParameterRef = value;
            }

            @objid ("d870377f-65cf-47de-b905-a5ddd248432d")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterData.Metadata.ParameterBindingRefsDep();
            }

        }

        @objid ("00749af0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ResourceRoleSmDependency extends SmSingleDependency {
            @objid ("a161ca56-8565-475e-ab9e-7af6d560fec0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterBindingData) data).mResourceRole;
            }

            @objid ("d82c405e-ebab-4c34-b9e7-694eff0a0f55")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterBindingData) data).mResourceRole = value;
            }

            @objid ("7b33b127-6be0-4b6e-b6cf-2bfd1513e022")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.ResourceParameterBindingDep();
            }

        }

    }

}
