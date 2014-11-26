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
                                    

package org.modelio.metamodel.experts.links.impl.creation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Creation expert for {@link BpmnDataAssociation}
 */
@objid ("7e974158-1eb2-11e2-8009-002564c97630")
public class BpmnDataAssociationCreationExpert extends DefaultLinkExpert {
    @objid ("7e97415d-1eb2-11e2-8009-002564c97630")
    @Override
    public boolean canSource(MClass link, MClass from) {
        if (from.hasBase(Metamodel.getMClass(BpmnThrowEvent.class))) {
            return false;
        } else if (from.hasBase(Metamodel.getMClass(BpmnDataOutput.class))) {
            return false;
        } else if (from.hasBase(Metamodel.getMClass(BpmnActivity.class))) {
            return true;
        } else if (from.hasBase(Metamodel.getMClass(BpmnItemAwareElement.class))) {
            return true;
        } else if (from.hasBase(Metamodel.getMClass(BpmnEvent.class))) {
            return true;
        } else if (from instanceof BpmnSequenceFlow) {
            return true;
        }
        return false;
    }

    @objid ("7e974166-1eb2-11e2-8009-002564c97630")
    @Override
    public boolean canLink(final MClass link, final MClass from, final MClass to) {
        if (!canSource(link, from)) {
            return false;
        }
        
        boolean validMetaclass = false;
        
        if (to instanceof BpmnDataInput) {
            validMetaclass = false;
        } else {
            if (from.hasBase(Metamodel.getMClass(BpmnActivity.class)) && to.hasBase(Metamodel.getMClass(BpmnItemAwareElement.class))) {
                validMetaclass = true;
            } else if (from.hasBase(Metamodel.getMClass(BpmnItemAwareElement.class)) && (to.hasBase(Metamodel.getMClass(BpmnActivity.class)))) {
                validMetaclass = true;
            } else if (from.hasBase(Metamodel.getMClass(BpmnCatchEvent.class)) && to.hasBase(Metamodel.getMClass(BpmnItemAwareElement.class))) {
                validMetaclass = true;
            } else if (from.hasBase(Metamodel.getMClass(BpmnItemAwareElement.class)) && to.hasBase(Metamodel.getMClass(BpmnThrowEvent.class))) {
                validMetaclass = true;
            } else if (from.hasBase(Metamodel.getMClass(BpmnItemAwareElement.class)) && to.hasBase(Metamodel.getMClass(BpmnSequenceFlow.class))) {
                return true;
            } else if (from.hasBase(Metamodel.getMClass(BpmnSequenceFlow.class)) && to.hasBase(Metamodel.getMClass(BpmnItemAwareElement.class))) {
                return true;
            }
        }
        return validMetaclass;
    }

    @objid ("7e974171-1eb2-11e2-8009-002564c97630")
    private boolean isSameContext(final MObject from, final MObject to) {
        MObject formContext = getContext(from);
        MObject toContext = getContext(to);
        return formContext.equals(toContext);
    }

    @objid ("7e974179-1eb2-11e2-8009-002564c97630")
    private MObject getContext(final MObject element) {
        if (element instanceof BpmnProcess) {
            return element;
        }
        
        if (element.getCompositionOwner() instanceof BpmnProcess) {
            BpmnFlowElement flow = (BpmnFlowElement) element;
            for (BpmnLane lane : flow.getLane()) {
                return getFirstLane(lane);
            }
        }
        return getContext(element.getCompositionOwner());
    }

    @objid ("7e97417f-1eb2-11e2-8009-002564c97630")
    private BpmnLane getFirstLane(final BpmnLane lane) {
        BpmnLaneSet owner = (BpmnLaneSet) lane.getCompositionOwner();
        if (owner.getParentLane() != null) {
            return getFirstLane(owner.getParentLane());
        }
        return lane;
    }

    @objid ("0656ed26-75fb-4c47-968d-b10534f1f3a9")
    @Override
    public boolean canSource(final MObject link, final MObject from) {
        if (from instanceof BpmnThrowEvent) {
            return false;
        } else if (from instanceof BpmnDataOutput) {
            return false;
        } else if (from instanceof BpmnActivity) {
            return true;
        } else if (from instanceof BpmnItemAwareElement) {
            return true;
        } else if (from instanceof BpmnEvent) {
            return true;
        } else if (from instanceof BpmnSequenceFlow) {
            return true;
        }
        return false;
    }

    @objid ("97d3a7a1-0bb7-4312-98c3-2c6c2a11133c")
    @Override
    public boolean canLink(final MClass link, final MObject from, final MObject to) {
        if (!canSource(link, from.getMClass())) {
            return false;
        }
        
        boolean validMetaclass = false;
        
        if (to instanceof BpmnDataInput) {
            validMetaclass = false;
        } else {
            if (from instanceof BpmnActivity && to instanceof BpmnItemAwareElement) {
                validMetaclass = true;
            } else if (from instanceof BpmnItemAwareElement && to instanceof BpmnActivity) {
                validMetaclass = true;
            } else if (from instanceof BpmnCatchEvent && to instanceof BpmnItemAwareElement) {
                validMetaclass = true;
            } else if (from instanceof BpmnItemAwareElement && to instanceof BpmnThrowEvent) {
                validMetaclass = true;
            } else if (from instanceof BpmnItemAwareElement && to instanceof BpmnSequenceFlow) {
                return true;
            } else if (from instanceof BpmnSequenceFlow && to instanceof BpmnItemAwareElement) {
                return true;
            }
        }
        
        if (validMetaclass) {
            return isSameContext(from, to);
        }
        return false;
    }

}
