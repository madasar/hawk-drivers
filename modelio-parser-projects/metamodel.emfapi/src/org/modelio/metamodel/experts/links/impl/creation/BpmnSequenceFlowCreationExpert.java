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
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.bpmn.events.BpmnEndEvent;
import org.modelio.metamodel.bpmn.events.BpmnStartEvent;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Creation expert for {@link BpmnSequenceFlow}
 */
@objid ("7e99a2b9-1eb2-11e2-8009-002564c97630")
public class BpmnSequenceFlowCreationExpert extends DefaultLinkExpert {
    @objid ("7e99a2be-1eb2-11e2-8009-002564c97630")
    @Override
    public boolean canLink(final MClass link, final MObject from, final MObject to) {
        if (!canSource(link, from.getMClass())) {
            return false;
        }
        
        if (from.equals(to)) {
            return false;
        }
        
        if (to instanceof BpmnStartEvent) {
            return false;
        }
        
        if (to instanceof BpmnBoundaryEvent) {
            return false;
        }
        
        if (to instanceof BpmnItemAwareElement) {
            return false;
        }
        
        if (!(to instanceof BpmnFlowElement)) {
            return false;
        }
        
        if (isSameContext(from, to)) {
            return true;
        }
        return false;
    }

    @objid ("7e99a2c9-1eb2-11e2-8009-002564c97630")
    @Override
    public boolean canSource(final MObject from, final MObject owner) {
        if (from instanceof BpmnEndEvent) {
            return false;
        }
        
        if (from instanceof BpmnItemAwareElement) {
            return false;
        }
        
        if (from instanceof BpmnFlowElement) {
            return true;
        }
        return false;
    }

    @objid ("7e99a2d2-1eb2-11e2-8009-002564c97630")
    private boolean isSameContext(final MObject from, final MObject to) {
        MObject formContext = getContext(from, true);
        MObject toContext = getContext(to, true);
        return formContext.equals(toContext);
    }

    @objid ("7e99a2da-1eb2-11e2-8009-002564c97630")
    private MObject getContext(final MObject element, final boolean rec) {
        if (element instanceof BpmnProcess) {
            return element;
        } else if (element instanceof BpmnSubProcess) {
            if (!rec) {
                return element;
            }
        } else if (element instanceof BpmnBoundaryEvent) {
            return getContext(((BpmnBoundaryEvent) element).getAttachedToRef(), rec);
        }
        
        if (element.getCompositionOwner() instanceof BpmnProcess) {
            BpmnFlowElement flow = (BpmnFlowElement) element;
            for (BpmnLane lane : flow.getLane()) {
                return getFirstLane(lane);
            }
        }
        return getContext(element.getCompositionOwner(), false);
    }

    @objid ("7e99a2e2-1eb2-11e2-8009-002564c97630")
    private BpmnLane getFirstLane(final BpmnLane lane) {
        BpmnLaneSet owner = (BpmnLaneSet) lane.getCompositionOwner();
        if (owner.getParentLane() != null) {
            return getFirstLane(owner.getParentLane());
        }
        return lane;
    }

}
