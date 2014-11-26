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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceParameterData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000a1464-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnResourceParameterImpl extends BpmnBaseElementImpl implements BpmnResourceParameter {
    @objid ("a258890e-4580-48be-a14b-208f6c4a8413")
    @Override
    public boolean isIsRequired() {
        return (Boolean) getAttVal(BpmnResourceParameterData.Metadata.IsRequiredAtt());
    }

    @objid ("3a7c1990-3e87-429a-bac2-e9972fe446e2")
    @Override
    public void setIsRequired(boolean value) {
        setAttVal(BpmnResourceParameterData.Metadata.IsRequiredAtt(), value);
    }

    @objid ("61cdb6b6-5edf-470c-a578-fe0f568855d5")
    @Override
    public BpmnResource getResource() {
        return (BpmnResource) getDepVal(BpmnResourceParameterData.Metadata.ResourceDep());
    }

    @objid ("123de585-262c-48f5-a4ee-1aa74d683f64")
    @Override
    public void setResource(BpmnResource value) {
        appendDepVal(BpmnResourceParameterData.Metadata.ResourceDep(), (SmObjectImpl)value);
    }

    @objid ("2895768d-25d7-472a-ba9e-c0216be4d67d")
    @Override
    public BpmnItemDefinition getType() {
        return (BpmnItemDefinition) getDepVal(BpmnResourceParameterData.Metadata.TypeDep());
    }

    @objid ("b0ab9938-0a74-499e-89a4-f9c60f39a54c")
    @Override
    public void setType(BpmnItemDefinition value) {
        appendDepVal(BpmnResourceParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("a671847d-1a4c-4c32-b21f-a213b84ad5f7")
    @Override
    public EList<BpmnResourceParameterBinding> getParameterBindingRefs() {
        return new SmList<>(this, BpmnResourceParameterData.Metadata.ParameterBindingRefsDep());
    }

    @objid ("651c9724-52d6-4e9e-9a44-1360981c33be")
    @Override
    public <T extends BpmnResourceParameterBinding> List<T> getParameterBindingRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnResourceParameterBinding element : getParameterBindingRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2f32d8d8-b5c3-40a1-b0f9-f645e593aef0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterData.Metadata.ResourceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("81eba7e6-1503-4d11-9222-e922fd704233")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterData.Metadata.ResourceDep());
        if (obj != null)
          return new SmDepVal(BpmnResourceParameterData.Metadata.ResourceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("28a257cb-febc-4311-81f4-16513c32cfd7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResourceParameter(this);
        else
          return null;
    }

}
