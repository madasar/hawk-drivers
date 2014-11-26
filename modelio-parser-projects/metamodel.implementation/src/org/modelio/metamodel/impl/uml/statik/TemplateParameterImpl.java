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
import org.modelio.metamodel.data.uml.statik.TemplateParameterData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("001d5f2e-c4bf-1fd8-97fe-001ec947cd2a")
public class TemplateParameterImpl extends GeneralClassImpl implements TemplateParameter {
    @objid ("f96d1697-f9f4-4277-bcae-6eb6321f058a")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(TemplateParameterData.Metadata.DefaultValueAtt());
    }

    @objid ("4ea1d6dc-5ca8-4315-9aa7-17c743530a82")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(TemplateParameterData.Metadata.DefaultValueAtt(), value);
    }

    @objid ("8cadab66-5349-4349-aec6-6a423ecf2f57")
    @Override
    public boolean isIsValueParameter() {
        return (Boolean) getAttVal(TemplateParameterData.Metadata.IsValueParameterAtt());
    }

    @objid ("415f4b51-d51c-4232-a024-2a979bf00b00")
    @Override
    public void setIsValueParameter(boolean value) {
        setAttVal(TemplateParameterData.Metadata.IsValueParameterAtt(), value);
    }

    @objid ("32ddfaee-560d-4406-b906-434da1dc8270")
    @Override
    public EList<TemplateParameterSubstitution> getParameterSubstitution() {
        return new SmList<>(this, TemplateParameterData.Metadata.ParameterSubstitutionDep());
    }

    @objid ("4785d0d1-b387-4543-8783-13f1698dd64a")
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

    @objid ("c29a559a-be82-4948-b11a-b677bd03fc80")
    @Override
    public ModelElement getType() {
        return (ModelElement) getDepVal(TemplateParameterData.Metadata.TypeDep());
    }

    @objid ("962150c8-9b23-4188-a6e3-c58f9e3d5ba2")
    @Override
    public void setType(ModelElement value) {
        appendDepVal(TemplateParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("3d700ee1-edd3-414d-a615-266b9235a2db")
    @Override
    public NameSpace getParameterized() {
        return (NameSpace) getDepVal(TemplateParameterData.Metadata.ParameterizedDep());
    }

    @objid ("60312737-9fb2-4de9-aaa4-4bce45f6c49c")
    @Override
    public void setParameterized(NameSpace value) {
        appendDepVal(TemplateParameterData.Metadata.ParameterizedDep(), (SmObjectImpl)value);
    }

    @objid ("01baad97-a92f-4988-b908-5709826e1ebc")
    @Override
    public ModelElement getOwnedParameterElement() {
        return (ModelElement) getDepVal(TemplateParameterData.Metadata.OwnedParameterElementDep());
    }

    @objid ("3ec11250-6386-4070-b9f0-1e3e59c5012f")
    @Override
    public void setOwnedParameterElement(ModelElement value) {
        appendDepVal(TemplateParameterData.Metadata.OwnedParameterElementDep(), (SmObjectImpl)value);
    }

    @objid ("d5f27afd-5364-4f56-9b3d-32780a647c91")
    @Override
    public ModelElement getDefaultType() {
        return (ModelElement) getDepVal(TemplateParameterData.Metadata.DefaultTypeDep());
    }

    @objid ("430271ed-cbb0-436d-928b-72e602d4d610")
    @Override
    public void setDefaultType(ModelElement value) {
        appendDepVal(TemplateParameterData.Metadata.DefaultTypeDep(), (SmObjectImpl)value);
    }

    @objid ("2b8c9496-fd40-4f0e-954f-bf3102d8ecf8")
    @Override
    public Operation getParameterizedOperation() {
        return (Operation) getDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep());
    }

    @objid ("75c9ba0a-6128-47e1-8fff-9653ade14ffe")
    @Override
    public void setParameterizedOperation(Operation value) {
        appendDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep(), (SmObjectImpl)value);
    }

    @objid ("4c960824-6fe8-43ae-b089-a1522dc9b1dd")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterData.Metadata.ParameterizedDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("8a1a4e18-a8db-4f03-9f28-910a30f4a14f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterData.Metadata.ParameterizedDep());
        if (obj != null)
          return new SmDepVal(TemplateParameterData.Metadata.ParameterizedDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep());
        if (obj != null)
          return new SmDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("2ff947cc-8edc-4135-b36b-0fba5929205c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTemplateParameter(this);
        else
          return null;
    }

}
