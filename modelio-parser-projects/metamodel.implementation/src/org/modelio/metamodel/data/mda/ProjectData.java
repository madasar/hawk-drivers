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
package org.modelio.metamodel.data.mda;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.diagrams.DiagramSetData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.PackageData;
import org.modelio.metamodel.impl.mda.ProjectImpl;
import org.modelio.metamodel.mda.Project;
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

@objid ("0066673c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Project.class, factory=ProjectData.Metadata.ObjectFactory.class, cmsnode=true)
public class ProjectData extends ModelElementData {
    @objid ("8c814948-a141-4357-91cc-3f91ce87d576")
    @SmaMetaAttribute(metaName="ProjectContext", type=String.class, smAttributeClass=Metadata.ProjectContextSmAttribute.class)
     Object mProjectContext = "";

    @objid ("723c4bf6-3977-46c5-b363-eddb30b30627")
    @SmaMetaAttribute(metaName="ProjectDescr", type=String.class, smAttributeClass=Metadata.ProjectDescrSmAttribute.class)
     Object mProjectDescr = "";

    @objid ("e4054946-8312-4039-8608-0d63f95cd971")
    @SmaMetaAssociation(metaName="DiagramRoot", typeDataClass=DiagramSetData.class, min=1, max=1, smAssociationClass=Metadata.DiagramRootSmDependency.class, component = true)
     SmObjectImpl mDiagramRoot;

    @objid ("38f9afab-a781-4796-8ca2-35ab59f5e0c5")
    @SmaMetaAssociation(metaName="Model", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.ModelSmDependency.class, component = true)
     SmObjectImpl mModel;

    @objid ("99083b28-d910-4ddf-bc8b-3ea2373f7d5e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005b5fa4-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("af3cb946-0b33-401b-894b-bb2e9544ce01")
        private static SmClass smClass = null;

        @objid ("a53872dc-e67d-469b-a37f-580cc0c1d6ed")
        private static SmAttribute ProjectContextAtt = null;

        @objid ("ed724da8-0c33-4706-81c5-05a3c51ec025")
        private static SmAttribute ProjectDescrAtt = null;

        @objid ("84df92c0-7424-4490-9ef4-77efc2032252")
        private static SmDependency DiagramRootDep = null;

        @objid ("1ecd1da4-331a-41b9-b60c-c4bdf8f77215")
        private static SmDependency ModelDep = null;

        @objid ("0507c551-2c9b-4f99-b149-0eae2d61992c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ProjectData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c09b42cd-e43a-4b45-83ff-5dd4e28c1772")
        public static SmAttribute ProjectContextAtt() {
            if (ProjectContextAtt == null) {
            	ProjectContextAtt = classof().getAttributeDef("ProjectContext");
            }
            return ProjectContextAtt;
        }

        @objid ("8caa5934-63d0-4915-97af-6797c4802a7c")
        public static SmAttribute ProjectDescrAtt() {
            if (ProjectDescrAtt == null) {
            	ProjectDescrAtt = classof().getAttributeDef("ProjectDescr");
            }
            return ProjectDescrAtt;
        }

        @objid ("fbb9a3f6-61a4-4d59-aad7-6571519ad79b")
        public static SmDependency DiagramRootDep() {
            if (DiagramRootDep == null) {
            	DiagramRootDep = classof().getDependencyDef("DiagramRoot");
            }
            return DiagramRootDep;
        }

        @objid ("a2fa68f8-e613-4829-8286-1bb9b29ba6b7")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("1a1dc9cb-1335-41bb-8eb5-3797202c208f")
        public static SmDependency getDiagramRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DiagramRootDep;
        }

        @objid ("c7b45db5-ad91-4c03-a020-e6b40bc7934c")
        public static SmAttribute getProjectDescrAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProjectDescrAtt;
        }

        @objid ("cdc89578-e3b2-4d8e-9907-2acdeb7c9e3a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c28b36a1-f508-492b-98f0-672e1e2e7a33")
        public static SmAttribute getProjectContextAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProjectContextAtt;
        }

        @objid ("b0f77552-5f7b-4868-89aa-458a5c5fbca2")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("005ba126-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3b217e1a-dc48-4e1f-902b-54d1e9a85f4a")
            public ISmObjectData createData() {
                return new ProjectData();
            }

            @objid ("3b84adba-42c1-42ec-9502-ab0a7ef9d7a6")
            public SmObjectImpl createImpl() {
                return new ProjectImpl();
            }

        }

        @objid ("005c049a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProjectContextSmAttribute extends SmAttribute {
            @objid ("09050abf-d215-4039-b858-81a305300b2c")
            public Object getValue(ISmObjectData data) {
                return ((ProjectData) data).mProjectContext;
            }

            @objid ("552e1864-580d-4b2d-b205-574e71b53266")
            public void setValue(ISmObjectData data, Object value) {
                ((ProjectData) data).mProjectContext = value;
            }

        }

        @objid ("005c69bc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProjectDescrSmAttribute extends SmAttribute {
            @objid ("d452727a-60d4-4ba0-a092-982e351d61e8")
            public Object getValue(ISmObjectData data) {
                return ((ProjectData) data).mProjectDescr;
            }

            @objid ("55f3ebd2-f4f0-4460-b421-3d84961d701a")
            public void setValue(ISmObjectData data, Object value) {
                ((ProjectData) data).mProjectDescr = value;
            }

        }

        @objid ("005ccf38-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("1a69a065-00d3-445c-b29f-4d4f7010ba6b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProjectData) data).mModel;
            }

            @objid ("1b98008e-cf23-46b8-b6e5-0f66a492299b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProjectData) data).mModel = value;
            }

            @objid ("0a73c1bb-4bcd-48c2-a52e-92ef3c9f172c")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.RepresentedDep();
            }

        }

        @objid ("005e2112-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DiagramRootSmDependency extends SmSingleDependency {
            @objid ("ebe8ffb3-951a-4245-9974-ce3ecbf9ffe5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProjectData) data).mDiagramRoot;
            }

            @objid ("cc3d5208-f8ce-427f-ac0c-1f7ce7e123dd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProjectData) data).mDiagramRoot = value;
            }

            @objid ("ba422608-549f-471a-a14f-70fb1840acee")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.OwnerDep();
            }

        }

    }

}
