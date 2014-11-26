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
package org.modelio.metamodel.uml.behavior.activityModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNodeOrderingKind;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("003940c2-c4bf-1fd8-97fe-001ec947cd2a")
public interface ObjectNode extends ActivityNode {
    @objid ("e771fe50-2922-49f8-890e-21e225a237c3")
    boolean isIsControlType();

    @objid ("e7d1e892-bdd0-441e-9f90-230de7b11903")
    void setIsControlType(boolean value);

    @objid ("99a22596-aab9-4497-8893-b887049a1f06")
    ObjectNodeOrderingKind getOrdering();

    @objid ("a34f0587-0ee5-43c2-9cdd-4c9f378b0ae7")
    void setOrdering(ObjectNodeOrderingKind value);

    @objid ("ce7972d9-31a4-485b-9b1c-53e5d856d6d3")
    String getSelectionBehavior();

    @objid ("c71d1b7b-0270-475f-a37b-6bec9b438658")
    void setSelectionBehavior(String value);

    @objid ("06118852-45e7-4f5b-9ce2-63528041174b")
    String getUpperBound();

    @objid ("365adb60-3cde-40da-bba9-8db28a05029d")
    void setUpperBound(String value);

    @objid ("84986d61-d22b-45b5-975a-cae299d80b12")
    Instance getRepresented();

    @objid ("f60618fd-714b-48ec-b7e0-ccdb5e2edacc")
    void setRepresented(Instance value);

    @objid ("a5cbb30b-9a15-4ad3-bb34-91cf17154b5c")
    BehaviorParameter getRepresentedRealParameter();

    @objid ("14836b0b-9405-4755-b8f8-f2af871e6a70")
    void setRepresentedRealParameter(BehaviorParameter value);

    @objid ("a8553fa0-f498-415f-8f59-2fbecf0dccd6")
    GeneralClass getType();

    @objid ("1f1a25f0-f297-4a76-89bb-159d639a6a0b")
    void setType(GeneralClass value);

    @objid ("b78ce69c-9df5-41f6-818b-cbdc5b37742a")
    AssociationEnd getRepresentedRole();

    @objid ("427309c7-df1a-4718-aae9-332c0d2dc5e0")
    void setRepresentedRole(AssociationEnd value);

    @objid ("e3fcf0a5-ffad-485a-965c-bb34a4d8190b")
    Attribute getRepresentedAttribute();

    @objid ("7ccf1dbf-16e3-4570-9dbd-9d40dd986cd6")
    void setRepresentedAttribute(Attribute value);

    @objid ("a9ec6d2c-26c4-4c17-a595-be53921dbb2b")
    State getInState();

    @objid ("10d1b0c7-cd8b-4908-87a0-5897ee8b7b03")
    void setInState(State value);

}
