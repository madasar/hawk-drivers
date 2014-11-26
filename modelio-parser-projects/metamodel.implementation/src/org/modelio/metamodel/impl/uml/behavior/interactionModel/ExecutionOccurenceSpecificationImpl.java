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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.interactionModel.ExecutionOccurenceSpecificationData;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00447406-c4bf-1fd8-97fe-001ec947cd2a")
public class ExecutionOccurenceSpecificationImpl extends MessageEndImpl implements ExecutionOccurenceSpecification {
    @objid ("89c4d64e-6c58-45d1-a2e3-3bb83f310178")
    @Override
    public ExecutionSpecification getFinished() {
        return (ExecutionSpecification) getDepVal(ExecutionOccurenceSpecificationData.Metadata.FinishedDep());
    }

    @objid ("2b39002e-38f1-4388-a88c-97d35e1dcc12")
    @Override
    public void setFinished(ExecutionSpecification value) {
        appendDepVal(ExecutionOccurenceSpecificationData.Metadata.FinishedDep(), (SmObjectImpl)value);
    }

    @objid ("b665ac9b-b693-4232-8ee9-68eca979271b")
    @Override
    public ExecutionSpecification getStarted() {
        return (ExecutionSpecification) getDepVal(ExecutionOccurenceSpecificationData.Metadata.StartedDep());
    }

    @objid ("6dadda85-3adb-4470-91bb-24951077e262")
    @Override
    public void setStarted(ExecutionSpecification value) {
        appendDepVal(ExecutionOccurenceSpecificationData.Metadata.StartedDep(), (SmObjectImpl)value);
    }

    @objid ("648bb7fa-406d-4381-81fe-cb49115319e7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("8c67a028-51e0-44f9-9f49-dafc35ab1075")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("63b1f30a-8b18-41f2-bd5d-96251d16103e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExecutionOccurenceSpecification(this);
        else
          return null;
    }

}
