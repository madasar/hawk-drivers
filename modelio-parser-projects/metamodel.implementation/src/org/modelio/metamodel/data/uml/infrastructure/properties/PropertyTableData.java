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
package org.modelio.metamodel.data.uml.infrastructure.properties;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixValueDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.QueryDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableImpl;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;
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

@objid ("0069a7f8-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=PropertyTable.class, factory=PropertyTableData.Metadata.ObjectFactory.class)
public class PropertyTableData extends ElementData {
    @objid ("d6c285fd-302d-4c55-bd58-576fed6921a7")
    @SmaMetaAttribute(metaName="name", type=String.class, smAttributeClass=Metadata.NameSmAttribute.class)
     Object mName = "";

    @objid ("4dbdca76-d067-45b4-9682-3bc6636260ad")
    @SmaMetaAttribute(metaName="content", type=String.class, smAttributeClass=Metadata.ContentSmAttribute.class)
     Object mContent = "";

    @objid ("2b7e1adb-147e-487d-8d47-6768971d4648")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("370a21f7-4dd4-49c8-a868-4e01f6a78c58")
    @SmaMetaAssociation(metaName="OwnerValDef", typeDataClass=MatrixValueDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerValDefSmDependency.class)
     SmObjectImpl mOwnerValDef;

    @objid ("34784496-38e0-403c-9025-1ae0f7101ff3")
    @SmaMetaAssociation(metaName="OwnerQuery", typeDataClass=QueryDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerQuerySmDependency.class)
     SmObjectImpl mOwnerQuery;

    @objid ("ff60b4de-3567-410d-800f-0b4ae3caaec7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00060306-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("aeed08c5-47d3-49ff-8e33-a1b6abeeda34")
        private static SmClass smClass = null;

        @objid ("8d949156-9231-461c-bfa6-d65a38fe9bd7")
        private static SmAttribute nameAtt = null;

        @objid ("61f29797-1cde-40eb-9787-2a64b5fc2047")
        private static SmAttribute contentAtt = null;

        @objid ("17b669ea-edca-44db-9264-019a7d03ef92")
        private static SmDependency OwnerDep = null;

        @objid ("92a5164e-b3b2-4ea4-af78-bd26fcc6f819")
        private static SmDependency OwnerValDefDep = null;

        @objid ("93f97b69-88ab-42d7-83d3-fbdb85cc3c17")
        private static SmDependency OwnerQueryDep = null;

        @objid ("30f252c1-066e-413d-94f7-dc147154968f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("48e68852-6077-456c-be3a-5ebe0fed4584")
        public static SmAttribute nameAtt() {
            if (nameAtt == null) {
            	nameAtt = classof().getAttributeDef("name");
            }
            return nameAtt;
        }

        @objid ("ceb7df44-6157-4d2b-99e7-53f215b78174")
        public static SmAttribute contentAtt() {
            if (contentAtt == null) {
            	contentAtt = classof().getAttributeDef("content");
            }
            return contentAtt;
        }

        @objid ("213a38cf-ae7c-410f-b33c-ba87da46671d")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("d5a12de2-218f-4dcf-ad92-b0c5dcc5a071")
        public static SmDependency OwnerValDefDep() {
            if (OwnerValDefDep == null) {
            	OwnerValDefDep = classof().getDependencyDef("OwnerValDef");
            }
            return OwnerValDefDep;
        }

        @objid ("3e845e9e-af68-4002-9403-a655c3337706")
        public static SmDependency OwnerQueryDep() {
            if (OwnerQueryDep == null) {
            	OwnerQueryDep = classof().getDependencyDef("OwnerQuery");
            }
            return OwnerQueryDep;
        }

        @objid ("11115abc-a1a1-443a-b2f8-a938029e9bc9")
        public static SmAttribute getContentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return contentAtt;
        }

        @objid ("e958892a-a796-4774-977d-acc0a1530e60")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("b45a88c9-b959-4c17-97d5-1dffd8e0a850")
        public static SmDependency getOwnerValDefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerValDefDep;
        }

        @objid ("8d3c9644-bf99-464a-b970-e159005c7751")
        public static SmAttribute getNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return nameAtt;
        }

        @objid ("c82dc0a0-8c22-4c73-80cc-63f84c3c4f84")
        public static SmDependency getOwnerQueryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerQueryDep;
        }

        @objid ("7e8b8fe2-afe0-4bc7-af18-b14b62bd6202")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00066486-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("80544950-e849-4113-91cf-51c62277d555")
            public ISmObjectData createData() {
                return new PropertyTableData();
            }

            @objid ("1669294a-8ffe-497a-af38-7616eb1c2ab1")
            public SmObjectImpl createImpl() {
                return new PropertyTableImpl();
            }

        }

        @objid ("00074180-ec98-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("9e421355-3dd0-4749-a1a8-1919013b4316")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mOwner;
            }

            @objid ("41ad1919-b93e-44a3-b5ae-483ff428409a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableData) data).mOwner = value;
            }

            @objid ("f6ae828e-b03c-4b2d-9af5-cb81b4f0b6f5")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.PropertiesDep();
            }

        }

        @objid ("4bce00a5-281d-11e2-bf07-001ec947ccaf")
        public static class NameSmAttribute extends SmAttribute {
            @objid ("9714a753-6c65-443d-9663-a1a9228768b1")
            public Object getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mName;
            }

            @objid ("cf67d283-16a4-48ba-bbaf-1f6dc813b06d")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyTableData) data).mName = value;
            }

        }

        @objid ("4bd062cd-281d-11e2-bf07-001ec947ccaf")
        public static class ContentSmAttribute extends SmAttribute {
            @objid ("31b08042-026a-4217-a9f4-45796d82891f")
            public Object getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mContent;
            }

            @objid ("9deaf024-b90e-4585-8cf2-466f8b48312b")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyTableData) data).mContent = value;
            }

        }

        @objid ("5723e993-0ce4-439c-b721-d8b9cd22cf48")
        public static class OwnerValDefSmDependency extends SmSingleDependency {
            @objid ("a994b819-45a0-4457-be51-ec4605edcb53")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mOwnerValDef;
            }

            @objid ("bbbd8f36-003a-4b68-bc2d-a165ed271b8b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableData) data).mOwnerValDef = value;
            }

            @objid ("139768b1-a790-49da-beb0-e177de098477")
            @Override
            public SmDependency getSymetric() {
                return MatrixValueDefinitionData.Metadata.ParametersDep();
            }

        }

        @objid ("98bda871-2541-4658-9fa2-cf78b46718de")
        public static class OwnerQuerySmDependency extends SmSingleDependency {
            @objid ("1ebcb0b8-25dd-4abc-b8fd-163b4772b839")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mOwnerQuery;
            }

            @objid ("9b4e18a4-5758-4ce6-89c1-4eaada528a0b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableData) data).mOwnerQuery = value;
            }

            @objid ("a6a72aa7-c43a-4668-b79b-12fffe311c54")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.ParametersDep();
            }

        }

    }

}
