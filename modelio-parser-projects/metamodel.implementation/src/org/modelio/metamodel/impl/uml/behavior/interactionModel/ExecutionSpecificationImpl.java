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
import org.modelio.metamodel.data.uml.behavior.interactionModel.ExecutionSpecificationData;
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

@objid ("0044efbc-c4bf-1fd8-97fe-001ec947cd2a")
public class ExecutionSpecificationImpl extends InteractionFragmentImpl implements ExecutionSpecification {
    @objid ("28269e9a-88ec-4e65-a28f-119448089a88")
    @Override
    public ExecutionOccurenceSpecification getFinish() {
        return (ExecutionOccurenceSpecification) getDepVal(ExecutionSpecificationData.Metadata.FinishDep());
    }

    @objid ("8ec1531d-e008-46ac-b93e-b1d755e32e7d")
    @Override
    public void setFinish(ExecutionOccurenceSpecification value) {
        appendDepVal(ExecutionSpecificationData.Metadata.FinishDep(), (SmObjectImpl)value);
    }

    @objid ("0dfe5582-2ae3-4d1a-ae79-cc4dfd7a5e00")
    @Override
    public ExecutionOccurenceSpecification getStart() {
        return (ExecutionOccurenceSpecification) getDepVal(ExecutionSpecificationData.Metadata.StartDep());
    }

    @objid ("d90c3071-c3ef-43ea-84ce-ab09b4dc40b8")
    @Override
    public void setStart(ExecutionOccurenceSpecification value) {
        appendDepVal(ExecutionSpecificationData.Metadata.StartDep(), (SmObjectImpl)value);
    }

    @objid ("851d5f7a-913f-4133-8c3a-ab7caf6b95f2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("23bebc99-2d23-41f7-937a-9ed496ed9035")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("6ba28b35-82b5-46e0-b236-8f0afd576dee")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExecutionSpecification(this);
        else
          return null;
    }

}
