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
import org.modelio.metamodel.data.uml.infrastructure.NoteTypeData;
import org.modelio.metamodel.impl.uml.infrastructure.NoteImpl;
import org.modelio.metamodel.uml.infrastructure.Note;
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

@objid ("008a4260-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Note.class, factory=NoteData.Metadata.ObjectFactory.class)
public class NoteData extends ModelElementData {
    @objid ("73c07f2c-e8aa-47c7-93c3-fdedea1ce7b8")
    @SmaMetaAttribute(metaName="Content", type=String.class, smAttributeClass=Metadata.ContentSmAttribute.class)
     Object mContent = "";

    @objid ("a836b433-171c-4de4-96c1-1aff367d1cd2")
    @SmaMetaAssociation(metaName="Model", typeDataClass=NoteTypeData.class, min=1, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("2b38813f-8742-43cc-841d-0b2731f47bfe")
    @SmaMetaAssociation(metaName="Subject", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.SubjectSmDependency.class)
     SmObjectImpl mSubject;

    @objid ("bf0053cf-b418-4fd9-b55f-da1fa3b2b299")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00185db2-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("62625607-64d8-433d-a053-99ccfa5f61b6")
        private static SmClass smClass = null;

        @objid ("d9ab8f36-703b-448c-9657-86a03a70c3de")
        private static SmAttribute ContentAtt = null;

        @objid ("d5611424-e3f9-4fa3-8854-67f8a8ba9293")
        private static SmDependency ModelDep = null;

        @objid ("6e07d3a8-daf0-4b84-bb17-93a94f392f86")
        private static SmDependency SubjectDep = null;

        @objid ("2f74338e-1846-43dc-bd06-9e933571c9f2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NoteData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("dbb34f42-c756-49b9-985c-2e30f870acdc")
        public static SmAttribute ContentAtt() {
            if (ContentAtt == null) {
            	ContentAtt = classof().getAttributeDef("Content");
            }
            return ContentAtt;
        }

        @objid ("a3853f72-e35b-4872-8282-5f8bfb005fb4")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("8d39669d-7e51-408e-93b3-fa08eeef3759")
        public static SmDependency SubjectDep() {
            if (SubjectDep == null) {
            	SubjectDep = classof().getDependencyDef("Subject");
            }
            return SubjectDep;
        }

        @objid ("41afed36-2a40-4c30-abc4-52dbe9b794ff")
        public static SmAttribute getContentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContentAtt;
        }

        @objid ("b55118e5-7444-4ddd-99b6-b3e47116f7f6")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("7e6cb11e-bbd5-490b-b7f8-35e0a2373021")
        public static SmDependency getSubjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubjectDep;
        }

        @objid ("93d7c8eb-5862-4142-852c-8383d225ef05")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0018a15a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dc89bf72-7382-4a10-b727-a63f08a90cae")
            public ISmObjectData createData() {
                return new NoteData();
            }

            @objid ("2209fc8d-fe14-4065-8636-02d1e0e7855d")
            public SmObjectImpl createImpl() {
                return new NoteImpl();
            }

        }

        @objid ("0019030c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ContentSmAttribute extends SmAttribute {
            @objid ("1b2bf697-46ca-4e9e-9c43-88e6dbc890ac")
            public Object getValue(ISmObjectData data) {
                return ((NoteData) data).mContent;
            }

            @objid ("35043b6a-fb94-461d-9770-8903a22f1618")
            public void setValue(ISmObjectData data, Object value) {
                ((NoteData) data).mContent = value;
            }

        }

        @objid ("00196612-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubjectSmDependency extends SmSingleDependency {
            @objid ("898c087f-8c54-4e47-acd0-8a4b7aa1e48e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteData) data).mSubject;
            }

            @objid ("6c10d164-a032-4e19-830d-854f3a9cab76")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteData) data).mSubject = value;
            }

            @objid ("3244a844-0cf5-480d-a489-9bf2ae2fdb00")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DescriptorDep();
            }

        }

        @objid ("0019dd7c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("d22f111f-c84a-4b5b-9ae9-724fe77d256d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteData) data).mModel;
            }

            @objid ("34d1155b-a241-4853-8998-47f7d3fb58e1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteData) data).mModel = value;
            }

            @objid ("5c04b596-d4e7-468c-ae07-e22755ece648")
            @Override
            public SmDependency getSymetric() {
                return NoteTypeData.Metadata.ElementDep();
            }

        }

    }

}
