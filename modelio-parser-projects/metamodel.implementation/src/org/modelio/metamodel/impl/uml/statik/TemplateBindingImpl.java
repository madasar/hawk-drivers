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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.TemplateBindingData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("001c7c58-c4bf-1fd8-97fe-001ec947cd2a")
public class TemplateBindingImpl extends ModelElementImpl implements TemplateBinding {
    @objid ("603f8390-eb90-465c-bfc1-05ee96f8a810")
    @Override
    public EList<TemplateParameterSubstitution> getParameterSubstitution() {
        return new SmList<>(this, TemplateBindingData.Metadata.ParameterSubstitutionDep());
    }

    @objid ("d3ef33ee-9ccf-4960-a7b6-d38922515018")
    @Override
    public <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateParameterSubstitution element : getParameterSubstitution()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e0790331-2016-4c5b-93fc-6ebb10b28278")
    @Override
    public Operation getBoundOperation() {
        return (Operation) getDepVal(TemplateBindingData.Metadata.BoundOperationDep());
    }

    @objid ("631247ff-a53d-4418-85d1-f56bdce415dc")
    @Override
    public void setBoundOperation(Operation value) {
        appendDepVal(TemplateBindingData.Metadata.BoundOperationDep(), (SmObjectImpl)value);
    }

    @objid ("7e91b121-60d6-4749-a7ff-77b4e1abaf5c")
    @Override
    public Operation getInstanciatedTemplateOperation() {
        return (Operation) getDepVal(TemplateBindingData.Metadata.InstanciatedTemplateOperationDep());
    }

    @objid ("8dd830b2-5507-4657-aeea-cf2325641711")
    @Override
    public void setInstanciatedTemplateOperation(Operation value) {
        appendDepVal(TemplateBindingData.Metadata.InstanciatedTemplateOperationDep(), (SmObjectImpl)value);
    }

    @objid ("7a754063-9edf-4726-a241-3c95fd89d049")
    @Override
    public NameSpace getInstanciatedTemplate() {
        return (NameSpace) getDepVal(TemplateBindingData.Metadata.InstanciatedTemplateDep());
    }

    @objid ("37caea21-d411-4126-aafc-7b96c9a9a217")
    @Override
    public void setInstanciatedTemplate(NameSpace value) {
        appendDepVal(TemplateBindingData.Metadata.InstanciatedTemplateDep(), (SmObjectImpl)value);
    }

    @objid ("950175be-e050-4f80-8f93-bea44f4419ed")
    @Override
    public NameSpace getBoundElement() {
        return (NameSpace) getDepVal(TemplateBindingData.Metadata.BoundElementDep());
    }

    @objid ("10995464-46be-4d9d-bf06-6e720c7d24b8")
    @Override
    public void setBoundElement(NameSpace value) {
        appendDepVal(TemplateBindingData.Metadata.BoundElementDep(), (SmObjectImpl)value);
    }

    @objid ("77df6aa0-bbb5-4aab-a5e3-1d4956266087")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateBindingData.Metadata.BoundOperationDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateBindingData.Metadata.BoundElementDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("6f48c150-4894-4297-ace7-22cbf60d344b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateBindingData.Metadata.BoundOperationDep());
        if (obj != null)
          return new SmDepVal(TemplateBindingData.Metadata.BoundOperationDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(TemplateBindingData.Metadata.BoundElementDep());
        if (obj != null)
          return new SmDepVal(TemplateBindingData.Metadata.BoundElementDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("cfeae87c-3fd0-4649-9ea2-dc903127bd69")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTemplateBinding(this);
        else
          return null;
    }

}
