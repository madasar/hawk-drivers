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
package org.modelio.metamodel.data.bpmn.bpmnDiagrams;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.bpmnDiagrams.BpmnProcessCollaborationDiagram;
import org.modelio.metamodel.data.diagrams.BehaviorDiagramData;
import org.modelio.metamodel.impl.bpmn.bpmnDiagrams.BpmnProcessCollaborationDiagramImpl;
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

@objid ("000c5094-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnProcessCollaborationDiagram.class, factory=BpmnProcessCollaborationDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class BpmnProcessCollaborationDiagramData extends BehaviorDiagramData {
    @objid ("8d567b1b-eeb6-49d8-a152-a51d4079c9b1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0082bd6a-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("52675af2-2eff-4b64-9ccb-fbc5e5f01ea4")
        private static SmClass smClass = null;

        @objid ("d7c3e96d-bf33-4f28-bfab-7863eb492a3e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnProcessCollaborationDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9a6f17a6-0a79-4544-a78a-80791a32973c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0082fe9c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("209be306-0266-4bef-8025-4975bcd110f1")
            public ISmObjectData createData() {
                return new BpmnProcessCollaborationDiagramData();
            }

            @objid ("38315ee4-59c6-40e6-96e9-e5db03930351")
            public SmObjectImpl createImpl() {
                return new BpmnProcessCollaborationDiagramImpl();
            }

        }

    }

}
