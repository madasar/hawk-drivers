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
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.uml.behavior.activityModel.Pin;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.ParameterEffectKind;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.PassingMode;

@objid ("0017c640-c4bf-1fd8-97fe-001ec947cd2a")
public interface Parameter extends ModelElement {
    @objid ("f4b47419-a28a-4da7-b2fd-43522f24bbec")
    PassingMode getParameterPassing();

    @objid ("ebe51e9d-36a6-4b91-b26a-b19b4ffadaa2")
    void setParameterPassing(PassingMode value);

    @objid ("fa90f25e-8fb7-4b1f-ac90-2687855553ae")
    String getMultiplicityMin();

    @objid ("a769ba51-b60b-4583-82c3-f2726d230f93")
    void setMultiplicityMin(String value);

    @objid ("63a9bce0-8217-4caa-94d6-ff5086a0928f")
    String getMultiplicityMax();

    @objid ("e2bdb92c-c5c0-4985-8543-a510b16ecb6b")
    void setMultiplicityMax(String value);

    @objid ("a6fe8197-db47-48e8-8282-796363b98773")
    String getTypeConstraint();

    @objid ("f2743663-f9a3-45bc-8b33-73618ca1a0ba")
    void setTypeConstraint(String value);

    @objid ("a1354db2-0565-4dad-a18a-a70896110962")
    String getDefaultValue();

    @objid ("4c4f4ba7-32cb-4e17-a86c-c007108aac24")
    void setDefaultValue(String value);

    @objid ("f3ae3109-9557-42a8-a4b3-523625033375")
    boolean isIsOrdered();

    @objid ("640fd465-be88-4e72-a9ec-70c22ecfb435")
    void setIsOrdered(boolean value);

    @objid ("c751372e-4e56-4620-b2fc-2a91d36dba28")
    boolean isIsUnique();

    @objid ("a57ec802-9fda-464e-9e94-c69c058dfbd3")
    void setIsUnique(boolean value);

    @objid ("b9770424-c404-45e3-8af0-561c5d513dda")
    boolean isIsException();

    @objid ("ef2d2a5f-09fa-49ae-8c77-249fb7c3701f")
    void setIsException(boolean value);

    @objid ("27d19b14-adf2-48f0-882f-f11af9cce575")
    boolean isIsStream();

    @objid ("d9648f76-dc76-47df-a6c4-3222337e6810")
    void setIsStream(boolean value);

    @objid ("c1c210f9-b352-4484-aeb4-3cb06efe9535")
    ParameterEffectKind getEffect();

    @objid ("f74e38ee-f94d-49b2-83ec-5028233ae8c2")
    void setEffect(ParameterEffectKind value);

    @objid ("5c30b372-6d70-4926-82b0-ab6d8fcc6334")
    EList<BpmnDataInput> getBpmnRepresentingDataInput();

    @objid ("31723d2b-2837-4515-8d68-2011c5e17de1")
    <T extends BpmnDataInput> List<T> getBpmnRepresentingDataInput(java.lang.Class<T> filterClass);

    @objid ("dc0d6638-e0bb-48cc-a728-9aaa34754515")
    GeneralClass getType();

    @objid ("87bd6b31-b7ba-4cca-a332-4bff5f0bd2c1")
    void setType(GeneralClass value);

    @objid ("19702ef7-2976-4d69-a412-c7aeda570d0e")
    Operation getComposed();

    @objid ("b44d290b-6d66-47ae-96f6-51dbcbfdb750")
    void setComposed(Operation value);

    @objid ("0f5f9d8e-ba8c-47d5-b370-3944aafc5cad")
    EList<Pin> getMatching();

    @objid ("e2ff8d12-7982-4b58-9478-657aa0bdf6e0")
    <T extends Pin> List<T> getMatching(java.lang.Class<T> filterClass);

    @objid ("c81cc3ab-7e1b-428e-9938-7d21a195e43e")
    EList<BpmnDataOutput> getBpmnRepresentingDataOutput();

    @objid ("13c21dc6-a9ed-4eb7-a310-db842fffb027")
    <T extends BpmnDataOutput> List<T> getBpmnRepresentingDataOutput(java.lang.Class<T> filterClass);

    @objid ("98a6d72e-6959-47f3-aa56-d340586ff8ed")
    EList<Signal> getSRepresentation();

    @objid ("5974cd94-9448-47e5-b81d-59755ebd8274")
    <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass);

    @objid ("5f323af0-f71e-4069-bbf2-3485d13a517a")
    Operation getReturned();

    @objid ("7d794343-25d1-4029-8dcb-6be44e33f4f4")
    void setReturned(Operation value);

    @objid ("a5cdb941-e890-40bf-854e-9a0ace0e6c7e")
    EList<BehaviorParameter> getBehaviorParam();

    @objid ("d3333c91-40b6-4c07-82ec-44ff4be6280f")
    <T extends BehaviorParameter> List<T> getBehaviorParam(java.lang.Class<T> filterClass);

}
