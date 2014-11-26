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
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;

@objid ("000d46d4-c4bf-1fd8-97fe-001ec947cd2a")
public interface Instance extends ModelElement {
    @objid ("a97d3fda-f6e5-4ac2-848a-68d44ade85cc")
    boolean isIsConstant();

    @objid ("e87afd91-c5e7-4a36-830f-5aedc3ab9456")
    void setIsConstant(boolean value);

    @objid ("63fc4a2a-cfc7-49e7-b7f8-377eb23a607e")
    String getMultiplicityMin();

    @objid ("5650be2f-4c3c-4c42-9ec8-b1c085f3a700")
    void setMultiplicityMin(String value);

    @objid ("cf5a332a-1350-4040-8ec5-a5eeec9a93e6")
    String getMultiplicityMax();

    @objid ("a0237754-b37d-4550-8c7b-93831ffd2123")
    void setMultiplicityMax(String value);

    @objid ("4edde2bd-59e9-42af-a5d4-a1b6a97290ed")
    String getValue();

    @objid ("efbd1dd0-f05b-4dba-a2ee-e97de1541cf9")
    void setValue(String value);

    @objid ("924abb5d-88c9-41c0-a2b9-b06014819b19")
    EList<CommunicationNode> getRepresentedCommunicationNode();

    @objid ("9e0961b7-2324-4e4c-9da5-0555bf9632e6")
    <T extends CommunicationNode> List<T> getRepresentedCommunicationNode(java.lang.Class<T> filterClass);

    @objid ("b011f807-b08f-4622-92c9-33797a4cbfde")
    EList<BpmnItemAwareElement> getRepresentingItem();

    @objid ("c6fc3ce1-2697-470c-98d2-99f77f4a27a1")
    <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass);

    @objid ("aff14215-5663-4adc-b5eb-7d710bcd4860")
    EList<LinkEnd> getOwnedEnd();

    @objid ("f41e9657-55eb-472d-b4da-153142986ef1")
    <T extends LinkEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass);

    @objid ("00512243-e392-41ed-bf1e-8ac95eadca4e")
    NameSpace getBase();

    @objid ("c941a9d5-414d-4535-8567-a966df3036db")
    void setBase(NameSpace value);

    @objid ("030baae5-2c45-42c6-a0b9-0c20ce4aaeb2")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("31a5fe8c-4d61-4313-93f7-f37441148793")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("36d83e2d-91ab-468c-bea9-023166ce682c")
    NameSpace getOwner();

    @objid ("87e325da-3a16-4fe9-900d-498fd211679e")
    void setOwner(NameSpace value);

    @objid ("33d8d5a3-a346-4900-be9c-0378798855f7")
    EList<NaryLinkEnd> getOwnedNaryEnd();

    @objid ("7e3ba3f3-3e25-495f-9819-72224f0746f7")
    <T extends NaryLinkEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass);

    @objid ("d2a399aa-8bdc-4ac5-a427-5849a463ea0d")
    EList<Lifeline> getRepresentedLifeLine();

    @objid ("579b3382-4dad-4938-b8fe-d30e99895629")
    <T extends Lifeline> List<T> getRepresentedLifeLine(java.lang.Class<T> filterClass);

    @objid ("ae1e8b97-0e50-44be-b5a5-b066e36bc702")
    EList<AttributeLink> getSlot();

    @objid ("5fc55d67-27b2-4bd7-a7b8-2fe7c3c6a7df")
    <T extends AttributeLink> List<T> getSlot(java.lang.Class<T> filterClass);

    @objid ("065a34bc-bb7c-4832-9d2a-544648a22fe6")
    EList<BindableInstance> getPart();

    @objid ("d213378a-221e-4409-b768-1f0b115264fe")
    <T extends BindableInstance> List<T> getPart(java.lang.Class<T> filterClass);

    @objid ("0cdf3305-04d2-4f87-9c1b-4f1d01defa52")
    EList<LinkEnd> getTargetingEnd();

    @objid ("86b3ddb8-fc64-4845-9261-e26a1b5c9d53")
    <T extends LinkEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass);

}
