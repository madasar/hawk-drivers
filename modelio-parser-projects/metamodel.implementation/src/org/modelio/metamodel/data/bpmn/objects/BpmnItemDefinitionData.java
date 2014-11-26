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
package org.modelio.metamodel.data.bpmn.objects;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.objects.BpmnItemKind;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceParameterData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemDefinitionImpl;
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

@objid ("00080bd8-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnItemDefinition.class, factory=BpmnItemDefinitionData.Metadata.ObjectFactory.class)
public class BpmnItemDefinitionData extends BpmnRootElementData {
    @objid ("bf27e95c-a27b-4abd-9c16-0837a4cc5892")
    @SmaMetaAttribute(metaName="ItemKind", type=BpmnItemKind.class, smAttributeClass=Metadata.ItemKindSmAttribute.class)
     Object mItemKind = BpmnItemKind.INFORMATION;

    @objid ("6687c5d1-e2ab-4a2d-bc41-27724109f9d5")
    @SmaMetaAttribute(metaName="IsCollection", type=Boolean.class, smAttributeClass=Metadata.IsCollectionSmAttribute.class)
     Object mIsCollection = false;

    @objid ("37b79c9a-d168-42be-9142-a1fa7fbacf04")
    @SmaMetaAssociation(metaName="StructureRef", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.StructureRefSmDependency.class, partof = true)
     SmObjectImpl mStructureRef;

    @objid ("b4874894-d845-4908-81b3-2ab4a633bdd4")
    @SmaMetaAssociation(metaName="TypedMessage", typeDataClass=BpmnMessageData.class, min=0, max=-1, smAssociationClass=Metadata.TypedMessageSmDependency.class)
     List<SmObjectImpl> mTypedMessage = null;

    @objid ("c57412f1-caab-477f-a551-019713ae0cd3")
    @SmaMetaAssociation(metaName="TypedItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.TypedItemSmDependency.class)
     List<SmObjectImpl> mTypedItem = null;

    @objid ("301f06a2-7169-4ec5-b332-b132b6107b01")
    @SmaMetaAssociation(metaName="TypedResourceParameter", typeDataClass=BpmnResourceParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TypedResourceParameterSmDependency.class)
     List<SmObjectImpl> mTypedResourceParameter = null;

    @objid ("5db05c94-f29c-4180-933a-20ae7d75894b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00390076-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("aec16c24-57ab-4c27-a43a-c32ecd576255")
        private static SmClass smClass = null;

        @objid ("0dcf1df1-9c6f-48ac-919d-687048f85917")
        private static SmAttribute ItemKindAtt = null;

        @objid ("5d464ff4-6e9d-4ef8-ae41-8f4c2097cd62")
        private static SmAttribute IsCollectionAtt = null;

        @objid ("b62cbe07-c042-4181-b670-bc08f5a5476f")
        private static SmDependency StructureRefDep = null;

        @objid ("07af8260-3405-4197-894d-475f6564fcb8")
        private static SmDependency TypedMessageDep = null;

        @objid ("6fd4eb46-4a35-4245-9f19-3a521bafdcba")
        private static SmDependency TypedItemDep = null;

        @objid ("7908da12-2b7e-453b-a126-4debd398cfe4")
        private static SmDependency TypedResourceParameterDep = null;

        @objid ("e9f94336-5715-4c6f-b76e-95bf8cba2c60")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnItemDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("11e86030-bc9d-41af-9b34-47285797eb18")
        public static SmAttribute ItemKindAtt() {
            if (ItemKindAtt == null) {
            	ItemKindAtt = classof().getAttributeDef("ItemKind");
            }
            return ItemKindAtt;
        }

        @objid ("4c36519b-9fff-4e3d-936a-9ab0a9fc7f4d")
        public static SmAttribute IsCollectionAtt() {
            if (IsCollectionAtt == null) {
            	IsCollectionAtt = classof().getAttributeDef("IsCollection");
            }
            return IsCollectionAtt;
        }

        @objid ("d3c45782-8aed-473b-a238-3a2ccb1e2c7b")
        public static SmDependency StructureRefDep() {
            if (StructureRefDep == null) {
            	StructureRefDep = classof().getDependencyDef("StructureRef");
            }
            return StructureRefDep;
        }

        @objid ("648ef00e-31a1-49a3-a6a9-9a1a2ed330e9")
        public static SmDependency TypedMessageDep() {
            if (TypedMessageDep == null) {
            	TypedMessageDep = classof().getDependencyDef("TypedMessage");
            }
            return TypedMessageDep;
        }

        @objid ("c3e2e325-aed1-4603-a624-7ac188bd862f")
        public static SmDependency TypedItemDep() {
            if (TypedItemDep == null) {
            	TypedItemDep = classof().getDependencyDef("TypedItem");
            }
            return TypedItemDep;
        }

        @objid ("5e85b996-21c9-42bf-acae-7a2096ec0ed2")
        public static SmDependency TypedResourceParameterDep() {
            if (TypedResourceParameterDep == null) {
            	TypedResourceParameterDep = classof().getDependencyDef("TypedResourceParameter");
            }
            return TypedResourceParameterDep;
        }

        @objid ("82df22e4-1b0c-4a93-8319-e564a9450594")
        public static SmDependency getTypedResourceParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedResourceParameterDep;
        }

        @objid ("b632bfaf-3684-4b6c-98d6-5aae9881747b")
        public static SmAttribute getItemKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemKindAtt;
        }

        @objid ("49174dd7-af8b-449c-a38c-e400be2b0620")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("799c2a45-85aa-4bf0-8d28-58a84615f50d")
        public static SmDependency getStructureRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StructureRefDep;
        }

        @objid ("da309522-58cb-446e-9d34-f36fec431868")
        public static SmAttribute getIsCollectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsCollectionAtt;
        }

        @objid ("8c1cb41b-9046-4ec1-af28-0d8d4f754270")
        public static SmDependency getTypedMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedMessageDep;
        }

        @objid ("a0500a4f-2d84-43fa-b3cd-4f7f7f874aa7")
        public static SmDependency getTypedItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedItemDep;
        }

        @objid ("00394090-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7b4c3153-4b10-4339-9045-40e899ebe2c9")
            public ISmObjectData createData() {
                return new BpmnItemDefinitionData();
            }

            @objid ("c8522e20-81d3-48f6-935c-8b12d65c1740")
            public SmObjectImpl createImpl() {
                return new BpmnItemDefinitionImpl();
            }

        }

        @objid ("0039a198-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ItemKindSmAttribute extends SmAttribute {
            @objid ("e9f5e9f0-86de-409b-89d6-2b94d3e1df78")
            public Object getValue(ISmObjectData data) {
                return ((BpmnItemDefinitionData) data).mItemKind;
            }

            @objid ("9e7efeb9-da1b-4280-9f41-ef71d089f4a7")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnItemDefinitionData) data).mItemKind = value;
            }

        }

        @objid ("003ad428-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsCollectionSmAttribute extends SmAttribute {
            @objid ("6f6021db-9ca2-48ad-894f-6ec46c465db9")
            public Object getValue(ISmObjectData data) {
                return ((BpmnItemDefinitionData) data).mIsCollection;
            }

            @objid ("05aba567-6921-4ca1-9b9b-8f01ccc7b51f")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnItemDefinitionData) data).mIsCollection = value;
            }

        }

        @objid ("003b3b70-c4c5-1fd8-97fe-001ec947cd2a")
        public static class StructureRefSmDependency extends SmSingleDependency {
            @objid ("4876b0cd-1b40-4c51-862b-1eb7f6c1dd72")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemDefinitionData) data).mStructureRef;
            }

            @objid ("fb081203-bbfa-4a47-b68f-6d8d555aabaf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemDefinitionData) data).mStructureRef = value;
            }

            @objid ("c024f40e-27d7-471c-a2b8-2c2e155db9d2")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnItemDefinitionRefsDep();
            }

        }

        @objid ("003bb0c8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypedMessageSmDependency extends SmMultipleDependency {
            @objid ("773e0dd6-3e9e-45ca-a906-8469ae0ad9ce")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemDefinitionData)data).mTypedMessage != null)? ((BpmnItemDefinitionData)data).mTypedMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("9c547fea-c747-4002-8118-bb88624e6e72")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemDefinitionData) data).mTypedMessage = new ArrayList<>(initialCapacity);
                return ((BpmnItemDefinitionData) data).mTypedMessage;
            }

            @objid ("853c961d-0d84-46e4-ac43-aff0cc101f53")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.ItemRefDep();
            }

        }

        @objid ("003c1bc6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypedItemSmDependency extends SmMultipleDependency {
            @objid ("a121a220-602e-4cc3-8614-7a8ac4fe5c42")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemDefinitionData)data).mTypedItem != null)? ((BpmnItemDefinitionData)data).mTypedItem:SmMultipleDependency.EMPTY;
            }

            @objid ("3974fb8c-6f68-4225-80e5-29cb717bd08f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemDefinitionData) data).mTypedItem = new ArrayList<>(initialCapacity);
                return ((BpmnItemDefinitionData) data).mTypedItem;
            }

            @objid ("0a80a637-d01c-4a45-a199-900e5cdc96a6")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.ItemSubjectRefDep();
            }

        }

        @objid ("003c80b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypedResourceParameterSmDependency extends SmMultipleDependency {
            @objid ("9af3ca14-7d8d-4860-bd5c-ac1d406ca54a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemDefinitionData)data).mTypedResourceParameter != null)? ((BpmnItemDefinitionData)data).mTypedResourceParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("7f55c68a-7d5b-4703-aef8-ae2d5ad74dc1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemDefinitionData) data).mTypedResourceParameter = new ArrayList<>(initialCapacity);
                return ((BpmnItemDefinitionData) data).mTypedResourceParameter;
            }

            @objid ("9245e04e-bd47-4a54-bec1-09baed1fd7b1")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterData.Metadata.TypeDep();
            }

        }

    }

}
