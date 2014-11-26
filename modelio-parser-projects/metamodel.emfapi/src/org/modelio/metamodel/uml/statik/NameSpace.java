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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.VisibilityMode;

@objid ("00115274-c4bf-1fd8-97fe-001ec947cd2a")
public interface NameSpace extends ModelTree {
    @objid ("a4e39c6d-c5c3-4e1e-8077-cefdf10de72a")
    boolean isIsAbstract();

    @objid ("95056254-3d79-4c30-91bc-74a0c0fd778d")
    void setIsAbstract(boolean value);

    @objid ("4b9c7b44-9d8c-4d41-90e3-ae9c6c2fb246")
    boolean isIsLeaf();

    @objid ("1bd75485-afd9-471f-af79-f4777ec493eb")
    void setIsLeaf(boolean value);

    @objid ("6b805741-f7d5-46e5-b4b1-ad04f242d383")
    boolean isIsRoot();

    @objid ("69a05f01-aac7-40b1-af35-4daf17365ca3")
    void setIsRoot(boolean value);

    @objid ("a4e0a17c-59d6-4689-96ef-f90ecab2b031")
    VisibilityMode getVisibility();

    @objid ("6d95cee0-4129-4281-9882-09232cd1dbc7")
    void setVisibility(VisibilityMode value);

    @objid ("325766e9-49d2-4855-bce5-d8287e6d4fe1")
    EList<Generalization> getParent();

    @objid ("301da469-aece-4fc8-95ae-55fe0db3c36f")
    <T extends Generalization> List<T> getParent(java.lang.Class<T> filterClass);

    @objid ("42a47378-9100-4dce-8baf-25439398fd4f")
    EList<TemplateBinding> getTemplateInstanciation();

    @objid ("9b86e622-c936-4831-b80d-1803081a5cba")
    <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass);

    @objid ("7435a61a-e894-47f5-b307-7beab1ee8298")
    EList<Instance> getRepresenting();

    @objid ("d882deba-3497-403e-8fe7-9eb29772daa4")
    <T extends Instance> List<T> getRepresenting(java.lang.Class<T> filterClass);

    @objid ("73d4a0ed-bdc7-4935-bc15-065bd26d973e")
    EList<Behavior> getOwnedBehavior();

    @objid ("421760da-3e9f-4a10-8975-8c6744f2cc37")
    <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass);

    @objid ("c00df571-9350-403b-960c-322984fc9c5c")
    EList<DataFlow> getReceived();

    @objid ("fa6f6253-126c-4fc5-92c5-92ac49e75469")
    <T extends DataFlow> List<T> getReceived(java.lang.Class<T> filterClass);

    @objid ("5293cf0b-896f-4a15-a099-d8568057f32d")
    EList<NamespaceUse> getUsedNsu();

    @objid ("73f91a12-31b2-440a-8fa8-42eaff30ff68")
    <T extends NamespaceUse> List<T> getUsedNsu(java.lang.Class<T> filterClass);

    @objid ("b9c89157-d25a-4eb8-83f0-cec25953ca3d")
    EList<InformationFlow> getOwnedInformationFlow();

    @objid ("612b078f-d2d7-4854-b876-ef839025508b")
    <T extends InformationFlow> List<T> getOwnedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("a526edb6-dc70-459b-8c23-09fb0d6cd963")
    EList<ElementImport> getImporting();

    @objid ("2c5a05f8-c9f2-4ea5-9b68-ccaaed910c7f")
    <T extends ElementImport> List<T> getImporting(java.lang.Class<T> filterClass);

    @objid ("ed8bf073-42a6-4b54-86e1-eb04d429c6fc")
    EList<DataFlow> getSent();

    @objid ("3301035a-e0f0-4830-ab50-43e39765e0dd")
    <T extends DataFlow> List<T> getSent(java.lang.Class<T> filterClass);

    @objid ("6cb02121-79b8-4a51-aeca-01659a5d898f")
    EList<DataFlow> getOwnedDataFlow();

    @objid ("597a8a30-aa3f-4374-9057-01ced4287883")
    <T extends DataFlow> List<T> getOwnedDataFlow(java.lang.Class<T> filterClass);

    @objid ("b1bac86c-dad5-4230-b592-5c8b936981a7")
    EList<CollaborationUse> getOwnedCollaborationUse();

    @objid ("103824c4-3b04-48df-a23c-3d8a947cc5ad")
    <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass);

    @objid ("508ff310-9429-424a-8e7b-748b182e6dd5")
    EList<PackageImport> getOwnedPackageImport();

    @objid ("44a1c7c5-5088-4fcb-99aa-20b5171c0980")
    <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass);

    @objid ("84408030-185d-4ec2-a492-acbb053645f2")
    EList<TemplateParameter> getTemplate();

    @objid ("4c05bec3-8c60-40a8-a92d-2f9e88a77ab7")
    <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass);

    @objid ("3f01b07e-2cee-4689-8cc7-1000bae83525")
    EList<Generalization> getSpecialization();

    @objid ("d8dc92c5-f12b-43aa-a502-bafedfa74f7c")
    <T extends Generalization> List<T> getSpecialization(java.lang.Class<T> filterClass);

    @objid ("af1e2850-2917-4e14-99a7-e99806eb6d00")
    EList<InterfaceRealization> getRealized();

    @objid ("11597cfb-8d50-4fd7-ae2a-615567d97656")
    <T extends InterfaceRealization> List<T> getRealized(java.lang.Class<T> filterClass);

    @objid ("0ef02434-d33e-4c7b-9579-078af20339af")
    EList<Instance> getDeclared();

    @objid ("e9d27c60-3207-49e5-adfd-4ddf894824aa")
    <T extends Instance> List<T> getDeclared(java.lang.Class<T> filterClass);

    @objid ("b44c8507-8cf3-4f7d-b158-c97e783df76d")
    EList<TemplateBinding> getInstanciatingBinding();

    @objid ("2df9098f-9e5e-45df-93a7-78caf25c65d4")
    <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass);

    @objid ("83fa78fb-9364-4455-bc94-29321696dd79")
    EList<ElementImport> getOwnedImport();

    @objid ("95c29aa8-e3ea-457c-bd0b-64fef339edfc")
    <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass);

    @objid ("3a2b400c-7ea2-4002-945d-9c22cba6252b")
    EList<NamespaceUse> getUserNsu();

    @objid ("c88f3d3e-982b-4d6a-99e0-6546ed81a060")
    <T extends NamespaceUse> List<T> getUserNsu(java.lang.Class<T> filterClass);

}
