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
import org.modelio.metamodel.data.uml.infrastructure.ExternDocumentTypeData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.infrastructure.ExternDocumentImpl;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
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

@objid ("0092b9d6-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExternDocument.class, factory=ExternDocumentData.Metadata.ObjectFactory.class, cmsnode=true)
public class ExternDocumentData extends ModelElementData {
    @objid ("f743eab4-deb6-4cd2-8263-967e7077ddda")
    @SmaMetaAttribute(metaName="MimeType", type=String.class, smAttributeClass=Metadata.MimeTypeSmAttribute.class)
     Object mMimeType = "";

    @objid ("34c8461f-d817-4d8e-8b80-cdb1a38571c4")
    @SmaMetaAttribute(metaName="Path", type=String.class, smAttributeClass=Metadata.PathSmAttribute.class)
     Object mPath = "";

    @objid ("5f431173-5112-42ed-8975-1f06b744fbbe")
    @SmaMetaAttribute(metaName="Abstract", type=String.class, smAttributeClass=Metadata.AbstractSmAttribute.class)
     Object mAbstract = "";

    @objid ("f96b8857-8b25-43ba-ae9a-8c980502a3d7")
    @SmaMetaAssociation(metaName="Type", typeDataClass=ExternDocumentTypeData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("00c84daf-0e3c-4a86-88e7-9066d289fa58")
    @SmaMetaAssociation(metaName="Subject", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.SubjectSmDependency.class)
     SmObjectImpl mSubject;

    @objid ("bd6686a1-3eb0-43d4-8854-479bebf2f75c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006c87a2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4da6d783-565c-4ace-81a9-6be4eb5b89b2")
        private static SmClass smClass = null;

        @objid ("a6e8cb17-4acd-4dcd-9dd2-33cb7d812e5d")
        private static SmAttribute MimeTypeAtt = null;

        @objid ("ef2cb802-ad79-44d7-958a-72bda7d08a4e")
        private static SmAttribute PathAtt = null;

        @objid ("8e7d5a59-0462-4f6f-b1a3-8d656bf29b56")
        private static SmAttribute AbstractAtt = null;

        @objid ("2c0867a5-2485-44a7-b052-9df376c3120a")
        private static SmDependency TypeDep = null;

        @objid ("b128e1b8-6f54-4c1a-93ac-52e63146a136")
        private static SmDependency SubjectDep = null;

        @objid ("3038a1e1-dd01-4c47-af5c-22eff514de2f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExternDocumentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ed2df09d-81e9-481e-bd0a-141b0e7ee458")
        public static SmAttribute MimeTypeAtt() {
            if (MimeTypeAtt == null) {
            	MimeTypeAtt = classof().getAttributeDef("MimeType");
            }
            return MimeTypeAtt;
        }

        @objid ("c6bf5fb8-b3b9-4acb-bab0-64dcb204802e")
        public static SmAttribute PathAtt() {
            if (PathAtt == null) {
            	PathAtt = classof().getAttributeDef("Path");
            }
            return PathAtt;
        }

        @objid ("5d88272c-ed3e-4300-b698-da28a7f8b6a6")
        public static SmAttribute AbstractAtt() {
            if (AbstractAtt == null) {
            	AbstractAtt = classof().getAttributeDef("Abstract");
            }
            return AbstractAtt;
        }

        @objid ("2d058b5f-2791-497e-8239-36b8b405e35c")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("152ed53d-398e-433b-bba9-439b62202cbe")
        public static SmDependency SubjectDep() {
            if (SubjectDep == null) {
            	SubjectDep = classof().getDependencyDef("Subject");
            }
            return SubjectDep;
        }

        @objid ("02a45901-07b5-40df-9838-951ac56bba68")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("493c38a5-9e53-4882-a4a3-ab60525a5d9a")
        public static SmAttribute getAbstractAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AbstractAtt;
        }

        @objid ("dea79099-ba1e-40e1-a066-3e0e201f5d7c")
        public static SmAttribute getPathAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PathAtt;
        }

        @objid ("f0b12065-272c-4171-92b1-9e72d7659140")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("862ef5c5-6341-4b88-b4cb-76d2a8c42ec8")
        public static SmDependency getSubjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubjectDep;
        }

        @objid ("e67e2ae0-163b-48e2-a831-dbd7c7b1c429")
        public static SmAttribute getMimeTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MimeTypeAtt;
        }

        @objid ("006cc762-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9cd595ef-1a7b-413a-9eed-1504ffb002f6")
            public ISmObjectData createData() {
                return new ExternDocumentData();
            }

            @objid ("fe5f4ed9-4a2a-48e8-83fc-dfc7fd0638e9")
            public SmObjectImpl createImpl() {
                return new ExternDocumentImpl();
            }

        }

        @objid ("006d27a2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MimeTypeSmAttribute extends SmAttribute {
            @objid ("da9ea945-961e-4f45-82b1-a8d09bed20cb")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mMimeType;
            }

            @objid ("2f906b46-b10a-476f-ab74-dc07e731fc17")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentData) data).mMimeType = value;
            }

        }

        @objid ("006dc1bc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PathSmAttribute extends SmAttribute {
            @objid ("6c04774a-ed85-4c8f-801f-bc70296105cc")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mPath;
            }

            @objid ("ff8a6dd2-356b-4c42-bf20-b2ae7a1057c5")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentData) data).mPath = value;
            }

        }

        @objid ("006e3994-c4c5-1fd8-97fe-001ec947cd2a")
        public static class AbstractSmAttribute extends SmAttribute {
            @objid ("4d49a98b-7713-49df-9182-eac6c723bf5f")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mAbstract;
            }

            @objid ("bd4be7b9-76aa-4f94-8b74-21eb54500b5d")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentData) data).mAbstract = value;
            }

        }

        @objid ("006eae92-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubjectSmDependency extends SmSingleDependency {
            @objid ("785d63e5-01aa-40fa-82ff-c1e694923dd2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mSubject;
            }

            @objid ("4a368bd2-5a14-4606-a986-062bac5ba355")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentData) data).mSubject = value;
            }

            @objid ("c49c42c4-8940-4be4-9691-b0ac9f384b8e")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DocumentDep();
            }

        }

        @objid ("006f3812-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("ebae82f4-6ca0-46f6-9372-4d149734528a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mType;
            }

            @objid ("1e239895-c268-45ae-a11b-25604286fb2e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentData) data).mType = value;
            }

            @objid ("4c96c6e8-ad74-4e95-8b12-b1455271af9b")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentTypeData.Metadata.TypedDocDep();
            }

        }

    }

}
