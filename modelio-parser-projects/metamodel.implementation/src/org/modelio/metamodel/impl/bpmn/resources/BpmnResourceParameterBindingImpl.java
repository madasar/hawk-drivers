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
package org.modelio.metamodel.impl.bpmn.resources;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceParameterBindingData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000b59e6-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnResourceParameterBindingImpl extends BpmnBaseElementImpl implements BpmnResourceParameterBinding {
    @objid ("3d859e84-4d26-4554-8bcc-d76dfcf59816")
    @Override
    public String getExpression() {
        return (String) getAttVal(BpmnResourceParameterBindingData.Metadata.ExpressionAtt());
    }

    @objid ("8f90272f-9a77-487c-b23b-ac051085f811")
    @Override
    public void setExpression(String value) {
        setAttVal(BpmnResourceParameterBindingData.Metadata.ExpressionAtt(), value);
    }

    @objid ("c0fe9251-0dac-4b16-b417-b4cfa7224cdc")
    @Override
    public BpmnResourceRole getResourceRole() {
        return (BpmnResourceRole) getDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep());
    }

    @objid ("8f4cdf3f-436a-4740-97ac-8e748ed9f8e4")
    @Override
    public void setResourceRole(BpmnResourceRole value) {
        appendDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep(), (SmObjectImpl)value);
    }

    @objid ("f3015fbf-6f69-4e4d-9c5a-f681d300de9b")
    @Override
    public BpmnResourceParameter getParameterRef() {
        return (BpmnResourceParameter) getDepVal(BpmnResourceParameterBindingData.Metadata.ParameterRefDep());
    }

    @objid ("93669d6b-cc8d-47f0-87af-0d5fca969be4")
    @Override
    public void setParameterRef(BpmnResourceParameter value) {
        appendDepVal(BpmnResourceParameterBindingData.Metadata.ParameterRefDep(), (SmObjectImpl)value);
    }

    @objid ("057a5605-2598-430b-b7b3-618c00ff2b29")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("095e8461-d104-4517-b506-d1171705073a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep());
        if (obj != null)
          return new SmDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c8085a9f-d48a-4234-b276-ce31bd90adf4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResourceParameterBinding(this);
        else
          return null;
    }

}
