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
import org.modelio.metamodel.bpmn.rootElements.BpmnBehavior;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007ad76c-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnRootElementImpl extends BpmnBaseElementImpl implements BpmnRootElement {
    @objid ("64f7d4e7-d0ef-46c8-bb54-1f9d99b0eb48")
    @Override
    public BpmnBehavior getOwner() {
        return (BpmnBehavior) getDepVal(BpmnRootElementData.Metadata.OwnerDep());
    }

    @objid ("1d6f78f4-7def-4e85-a17b-950d0146c8c8")
    @Override
    public void setOwner(BpmnBehavior value) {
        appendDepVal(BpmnRootElementData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("a6565189-3cd3-4f6e-846f-943ade494428")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnRootElementData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("cddde632-821d-4c7c-89d4-25eb2b1001f8")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnRootElementData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BpmnRootElementData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("cd88a07b-9d74-44b1-8dad-d27f013e3c3b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnRootElement(this);
        else
          return null;
    }

}
