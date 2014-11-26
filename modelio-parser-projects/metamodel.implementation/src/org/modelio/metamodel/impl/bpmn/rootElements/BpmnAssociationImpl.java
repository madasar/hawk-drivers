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
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociationDirection;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnAssociationData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00775b3c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnAssociationImpl extends BpmnArtifactImpl implements BpmnAssociation {
    @objid ("95edba92-a96a-4753-ac59-e2e461e6c487")
    @Override
    public BpmnAssociationDirection getAssociationDirection() {
        return (BpmnAssociationDirection) getAttVal(BpmnAssociationData.Metadata.AssociationDirectionAtt());
    }

    @objid ("4b53717c-3b88-45e7-bf36-68ccdcdc9b0e")
    @Override
    public void setAssociationDirection(BpmnAssociationDirection value) {
        setAttVal(BpmnAssociationData.Metadata.AssociationDirectionAtt(), value);
    }

    @objid ("32c9948b-3258-4fc3-a8b8-21d33b463691")
    @Override
    public BpmnBaseElement getTargetRef() {
        return (BpmnBaseElement) getDepVal(BpmnAssociationData.Metadata.TargetRefDep());
    }

    @objid ("1827d3a9-a1cb-4d8e-96b7-148c4a68152f")
    @Override
    public void setTargetRef(BpmnBaseElement value) {
        appendDepVal(BpmnAssociationData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("a328d84c-b6b1-4947-a4be-b155b4b899ab")
    @Override
    public BpmnBaseElement getSourceRef() {
        return (BpmnBaseElement) getDepVal(BpmnAssociationData.Metadata.SourceRefDep());
    }

    @objid ("d426d7dd-e6bf-410a-af87-dac741f4d008")
    @Override
    public void setSourceRef(BpmnBaseElement value) {
        appendDepVal(BpmnAssociationData.Metadata.SourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("dba875ae-5ac2-42b5-aa6e-6fc72fe43069")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("0e1e9ff7-2f6b-4d0f-a7f8-bcbcadae18e1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("cadfd4bf-34ec-45fd-9b28-4792ec94c502")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnAssociation(this);
        else
          return null;
    }

}
