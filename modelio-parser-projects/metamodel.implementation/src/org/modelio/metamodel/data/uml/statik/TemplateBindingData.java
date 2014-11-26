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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.data.uml.statik.TemplateParameterSubstitutionData;
import org.modelio.metamodel.impl.uml.statik.TemplateBindingImpl;
import org.modelio.metamodel.uml.statik.TemplateBinding;
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

@objid ("001cc6ae-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TemplateBinding.class, factory=TemplateBindingData.Metadata.ObjectFactory.class)
public class TemplateBindingData extends ModelElementData {
    @objid ("ed1dacf4-c8a7-4d22-9263-6c1427802a58")
    @SmaMetaAssociation(metaName="ParameterSubstitution", typeDataClass=TemplateParameterSubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSubstitutionSmDependency.class, component = true)
     List<SmObjectImpl> mParameterSubstitution = null;

    @objid ("e68575b5-9036-4547-a97c-072db2876683")
    @SmaMetaAssociation(metaName="BoundOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.BoundOperationSmDependency.class)
     SmObjectImpl mBoundOperation;

    @objid ("b50bf826-4c10-4dfd-99fe-59136bc24dbd")
    @SmaMetaAssociation(metaName="InstanciatedTemplateOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.InstanciatedTemplateOperationSmDependency.class, partof = true)
     SmObjectImpl mInstanciatedTemplateOperation;

    @objid ("53eaf2f9-314f-49b3-a937-14b0bdf134aa")
    @SmaMetaAssociation(metaName="InstanciatedTemplate", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.InstanciatedTemplateSmDependency.class, partof = true)
     SmObjectImpl mInstanciatedTemplate;

    @objid ("3132759a-8a84-4d80-ab5c-7435975ac6f9")
    @SmaMetaAssociation(metaName="BoundElement", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.BoundElementSmDependency.class)
     SmObjectImpl mBoundElement;

    @objid ("67e84790-bd2f-4ec5-9c59-f7b472377f0a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006f23ae-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a5552642-215e-4549-90d0-1be8ef9d178d")
        private static SmClass smClass = null;

        @objid ("b470314a-d067-4a0f-b6f9-d2574a7c0a9c")
        private static SmDependency ParameterSubstitutionDep = null;

        @objid ("1637612c-43bc-4210-8f2c-c6210a901561")
        private static SmDependency BoundOperationDep = null;

        @objid ("b569f9db-a56a-4802-833c-a593a2fe0350")
        private static SmDependency InstanciatedTemplateOperationDep = null;

        @objid ("d26f6578-1227-4fe8-b085-040954ea1ced")
        private static SmDependency InstanciatedTemplateDep = null;

        @objid ("ecb8ed59-dad7-43e3-a53c-bfc83c1be3f3")
        private static SmDependency BoundElementDep = null;

        @objid ("4c486c17-b8ea-47a8-9779-feea765f6ac1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TemplateBindingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a4e5baa8-579d-42a8-b975-304390ba1703")
        public static SmDependency ParameterSubstitutionDep() {
            if (ParameterSubstitutionDep == null) {
            	ParameterSubstitutionDep = classof().getDependencyDef("ParameterSubstitution");
            }
            return ParameterSubstitutionDep;
        }

        @objid ("c0479069-9132-4266-9494-8be2081d9253")
        public static SmDependency BoundOperationDep() {
            if (BoundOperationDep == null) {
            	BoundOperationDep = classof().getDependencyDef("BoundOperation");
            }
            return BoundOperationDep;
        }

        @objid ("b3e683d9-0e12-44a1-a7de-00c5515e8246")
        public static SmDependency InstanciatedTemplateOperationDep() {
            if (InstanciatedTemplateOperationDep == null) {
            	InstanciatedTemplateOperationDep = classof().getDependencyDef("InstanciatedTemplateOperation");
            }
            return InstanciatedTemplateOperationDep;
        }

        @objid ("f12b9a8d-fc97-40d7-9896-263342dfec4f")
        public static SmDependency InstanciatedTemplateDep() {
            if (InstanciatedTemplateDep == null) {
            	InstanciatedTemplateDep = classof().getDependencyDef("InstanciatedTemplate");
            }
            return InstanciatedTemplateDep;
        }

        @objid ("40b0fff6-0ddb-4552-a398-59bcfc301eb4")
        public static SmDependency BoundElementDep() {
            if (BoundElementDep == null) {
            	BoundElementDep = classof().getDependencyDef("BoundElement");
            }
            return BoundElementDep;
        }

        @objid ("229c0e17-2f9d-461e-aed1-4d7f9a8a3f1a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c003f3c2-4694-4dda-88a7-90720736a46b")
        public static SmDependency getBoundOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BoundOperationDep;
        }

        @objid ("148c7bac-9ae7-42b2-89b1-6ed4ac099696")
        public static SmDependency getBoundElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BoundElementDep;
        }

        @objid ("2ea8c47b-040c-41da-9484-ff8afdb432d5")
        public static SmDependency getParameterSubstitutionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterSubstitutionDep;
        }

        @objid ("0e92ca77-999f-4116-8d0b-1b7b08adb02f")
        public static SmDependency getInstanciatedTemplateOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatedTemplateOperationDep;
        }

        @objid ("f470d169-bb74-4e40-8920-9f114a64957e")
        public static SmDependency getInstanciatedTemplateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatedTemplateDep;
        }

        @objid ("006f6300-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c033cf74-eaed-4b43-8375-7d10880156f8")
            public ISmObjectData createData() {
                return new TemplateBindingData();
            }

            @objid ("75dc934b-42e2-4f7a-9978-933028e18ab8")
            public SmObjectImpl createImpl() {
                return new TemplateBindingImpl();
            }

        }

        @objid ("006fc516-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciatedTemplateSmDependency extends SmSingleDependency {
            @objid ("931eef43-c8c7-4233-8689-9b3040ba8584")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mInstanciatedTemplate;
            }

            @objid ("47a15b9e-7ca8-443f-ba69-edbd1686711d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mInstanciatedTemplate = value;
            }

            @objid ("357c960f-dcab-47ce-b569-a40025d4ffef")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.InstanciatingBindingDep();
            }

        }

        @objid ("007037c6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BoundElementSmDependency extends SmSingleDependency {
            @objid ("4dfe7e56-6154-4896-b906-6a00bc2f8cc4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mBoundElement;
            }

            @objid ("401224d5-302c-4c9e-a66c-7260146bdbc2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mBoundElement = value;
            }

            @objid ("282ad190-e320-453b-9d9d-0ee0d8a436c6")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.TemplateInstanciationDep();
            }

        }

        @objid ("0070abac-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BoundOperationSmDependency extends SmSingleDependency {
            @objid ("e8f251ff-ccc5-48bc-81bc-bfc2f844c6d6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mBoundOperation;
            }

            @objid ("141c16b5-a6cf-4abc-9737-7b035e5adb03")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mBoundOperation = value;
            }

            @objid ("ed75d6e8-73d6-4492-a63a-a84b07428a8d")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.TemplateInstanciationDep();
            }

        }

        @objid ("00712014-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciatedTemplateOperationSmDependency extends SmSingleDependency {
            @objid ("0e23f202-4de4-4f92-b64f-1222b0b9ee20")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mInstanciatedTemplateOperation;
            }

            @objid ("a31282bf-e18f-4198-bb74-dd626b69ccef")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mInstanciatedTemplateOperation = value;
            }

            @objid ("0bb6dcd7-24bb-4807-9d96-6d71aed4df5c")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.InstanciatingBindingDep();
            }

        }

        @objid ("0071959e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("d34c7bed-7d5d-4c71-aa7d-32f5a3994ae8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TemplateBindingData)data).mParameterSubstitution != null)? ((TemplateBindingData)data).mParameterSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("50e49397-ff92-4db5-b3b8-b30fbea0b49f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TemplateBindingData) data).mParameterSubstitution = new ArrayList<>(initialCapacity);
                return ((TemplateBindingData) data).mParameterSubstitution;
            }

            @objid ("a5c912a5-5521-4211-9ec8-789e7be2a07b")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterSubstitutionData.Metadata.OwnerDep();
            }

        }

    }

}
