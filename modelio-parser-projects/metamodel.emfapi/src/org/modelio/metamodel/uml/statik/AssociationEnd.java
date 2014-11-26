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
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.LinkEnd;

@objid ("00974ea6-c4be-1fd8-97fe-001ec947cd2a")
public interface AssociationEnd extends StructuralFeature {
    /**
     * Get the 'graphical owner' related to this end.
     * The owner is the current source or the opposite end's target according to the navigability.
     */
    @objid ("1bfd0899-45a2-49c8-b8dc-083141e68be2")
    Classifier getOwner();

    /**
     * Sets both ends sources and targets according to the given navigability.
     * <ul>
     * <li>THISSIDE: only current source and target must be filled.</li>
     * <li>OHERSIDE: only opposite source and target must be filled.</li>
     * <li>BOTHSIDES: current source must be equals to opposite target as well as current target and opposite source.</li>
     * <li>NONE: both sources must be filled, but no target</li>
     * </ul>
     * @param value whether or not to synchronize the other end and both source/target values. This end will be made navigable whatever the current navigability is.
     */
    @objid ("00788250-28da-1080-943a-001ec947cd2a")
    void setNavigable(boolean value);

    /**
     * Sets the value of the 'target' dependency.
     * @param fixModel whether or not to synchronize the other end and both source/target values. This end will be made navigable whatever the current navigability is.
     */
    @objid ("00308234-28fb-1080-943a-001ec947cd2a")
    void setTarget(Classifier value, boolean fixModel);

    /**
     * Sets the value of the 'source' dependency.
     * @param fixModel whether or not to synchronize the other end and both source/target values. This end will be made navigable whatever the current navigability is.
     */
    @objid ("000bdc7c-291a-1080-943a-001ec947cd2a")
    void setSource(Classifier value, boolean fixModel);

    @objid ("44b82fff-5b39-4aaa-ac0d-ddb26b837ecd")
    boolean isNavigable();

    @objid ("3b1b1d78-1c8e-4ebf-be03-315587affcd0")
    AggregationKind getAggregation();

    @objid ("4a285731-7964-4a31-86cc-fce48d9e23fa")
    void setAggregation(AggregationKind value);

    @objid ("c76703f9-3f60-4f57-89f7-5d763f564e80")
    boolean isIsChangeable();

    @objid ("da99b50d-e6ae-4b0c-80fe-c81926629171")
    void setIsChangeable(boolean value);

    @objid ("d8ba145d-86ef-4167-9d60-90b6fadedc87")
    Classifier getTarget();

    @objid ("54080cff-4bff-420d-8b55-8a6b1dc79788")
    void setTarget(Classifier value);

    @objid ("7fc2fd12-610a-4f62-aa65-d6c3abece68e")
    AssociationEnd getOppositeOwner();

    @objid ("0b60bb87-8261-4f5c-9f88-147d1b2a1f2d")
    void setOppositeOwner(AssociationEnd value);

    @objid ("9bfc7ee4-a387-4582-bacd-9286fabfb355")
    Classifier getSource();

    @objid ("5dff984a-bec1-4fc3-88ff-d37e39466c6a")
    void setSource(Classifier value);

    @objid ("0fd985ae-735a-41e1-95ca-bb4324d5f008")
    EList<LinkEnd> getOccurence();

    @objid ("eaf5c746-fa42-4a1b-8300-8d28ff7ba0d7")
    <T extends LinkEnd> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("7d53389a-aed4-4829-9532-2c2c80ca4b78")
    EList<InformationFlow> getSent();

    @objid ("35234326-51aa-44f9-9056-f4226e41de4a")
    <T extends InformationFlow> List<T> getSent(java.lang.Class<T> filterClass);

    @objid ("75e995f9-4778-4623-ae75-aebf259de2ba")
    EList<Attribute> getQualifier();

    @objid ("f1b51605-3215-4835-9faa-b35810aedbd4")
    <T extends Attribute> List<T> getQualifier(java.lang.Class<T> filterClass);

    @objid ("16786673-ff95-49b7-a673-4f4f3591a15e")
    AssociationEnd getOpposite();

    @objid ("32c5dca0-8c58-447f-a85b-c569576630fa")
    void setOpposite(AssociationEnd value);

    @objid ("72ddc0d0-95bf-4386-aa31-dfa6e004e214")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("3aa864a5-1a1f-4679-b81a-57a21e646e78")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("679f60ef-5085-44d6-a430-165e6909d3f4")
    Association getAssociation();

    @objid ("55f5a6f4-c256-4712-8c8c-559c68a3261f")
    void setAssociation(Association value);

    @objid ("4b81b75a-03f1-409c-ad52-87b1c192313d")
    EList<BpmnItemAwareElement> getRepresentingItem();

    @objid ("b1f0ff13-83e7-4e7f-b62c-1e8fdc7a14d6")
    <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass);

}
