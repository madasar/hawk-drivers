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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnTransaction;
import org.modelio.metamodel.bpmn.activities.TransactionMethod;
import org.modelio.metamodel.data.bpmn.activities.BpmnTransactionData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0085963e-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnTransactionImpl extends BpmnSubProcessImpl implements BpmnTransaction {
    @objid ("3995901d-3ea9-42c5-bb79-80d4b07fd4d3")
    @Override
    public String getProtocol() {
        return (String) getAttVal(BpmnTransactionData.Metadata.ProtocolAtt());
    }

    @objid ("95721fc0-a7f5-486b-bca3-987c3a6cb42c")
    @Override
    public void setProtocol(String value) {
        setAttVal(BpmnTransactionData.Metadata.ProtocolAtt(), value);
    }

    @objid ("a03aec67-a9e1-4c06-a8b0-53183ab88e73")
    @Override
    public TransactionMethod getMethod() {
        return (TransactionMethod) getAttVal(BpmnTransactionData.Metadata.MethodAtt());
    }

    @objid ("ec775f81-fd5f-4bfd-831f-2d9be974b5d5")
    @Override
    public void setMethod(TransactionMethod value) {
        setAttVal(BpmnTransactionData.Metadata.MethodAtt(), value);
    }

    @objid ("2ab66982-a2ef-4f63-8de5-0249e81ee11e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3ca13517-9317-4dd2-89bf-86e17ae8e68c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("0586d4ad-1e8e-423f-a0df-55fdd4fe1122")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnTransaction(this);
        else
          return null;
    }

}
