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
package org.modelio.metamodel.impl.bpmn.gateways;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGatewayType;
import org.modelio.metamodel.data.bpmn.gateways.BpmnEventBasedGatewayData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("009813cc-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnEventBasedGatewayImpl extends BpmnGatewayImpl implements BpmnEventBasedGateway {
    @objid ("501ac22a-3260-48bc-b1cc-37848a9d5272")
    @Override
    public boolean isInstanciate() {
        return (Boolean) getAttVal(BpmnEventBasedGatewayData.Metadata.InstanciateAtt());
    }

    @objid ("ea1b8c49-9b0a-4090-8bcb-9c4744f28639")
    @Override
    public void setInstanciate(boolean value) {
        setAttVal(BpmnEventBasedGatewayData.Metadata.InstanciateAtt(), value);
    }

    @objid ("4f853428-c021-4f4b-8f51-48816bc97542")
    @Override
    public BpmnEventBasedGatewayType getEventGatewayType() {
        return (BpmnEventBasedGatewayType) getAttVal(BpmnEventBasedGatewayData.Metadata.EventGatewayTypeAtt());
    }

    @objid ("373f4166-aadb-4e48-8454-a69b1779056d")
    @Override
    public void setEventGatewayType(BpmnEventBasedGatewayType value) {
        setAttVal(BpmnEventBasedGatewayData.Metadata.EventGatewayTypeAtt(), value);
    }

    @objid ("01e35d97-cac7-4655-827c-be5563d62358")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("03d12e55-e906-4bfc-a2ee-6363a38f821b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("1785283c-1952-4bed-b410-8bd3f6d9e07c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnEventBasedGateway(this);
        else
          return null;
    }

}
