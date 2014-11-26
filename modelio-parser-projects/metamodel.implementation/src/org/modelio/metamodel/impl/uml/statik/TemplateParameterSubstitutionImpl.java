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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.TemplateParameterSubstitutionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateBinding;
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

@objid ("001e4902-c4bf-1fd8-97fe-001ec947cd2a")
public class TemplateParameterSubstitutionImpl extends ModelElementImpl implements TemplateParameterSubstitution {
    @objid ("095fb543-e077-40ba-a224-8b83a90fae8b")
    @Override
    public String getValue() {
        return (String) getAttVal(TemplateParameterSubstitutionData.Metadata.ValueAtt());
    }

    @objid ("0f79882a-3c3c-4a84-98f2-b60b0f9886b5")
    @Override
    public void setValue(String value) {
        setAttVal(TemplateParameterSubstitutionData.Metadata.ValueAtt(), value);
    }

    @objid ("9dfa463a-5e00-4380-9d86-4a62e2941d7f")
    @Override
    public TemplateBinding getOwner() {
        return (TemplateBinding) getDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep());
    }

    @objid ("31fbae88-e27f-4e8b-b3a1-8704e23dba34")
    @Override
    public void setOwner(TemplateBinding value) {
        appendDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("700f85e0-7877-4940-955f-b21080e1d004")
    @Override
    public ModelElement getActual() {
        return (ModelElement) getDepVal(TemplateParameterSubstitutionData.Metadata.ActualDep());
    }

    @objid ("86706afe-216b-4afe-bddc-e5fe6539d0b3")
    @Override
    public void setActual(ModelElement value) {
        appendDepVal(TemplateParameterSubstitutionData.Metadata.ActualDep(), (SmObjectImpl)value);
    }

    @objid ("fcee3c36-7e59-4dda-a14b-11fce9c6769d")
    @Override
    public TemplateParameter getFormalParameter() {
        return (TemplateParameter) getDepVal(TemplateParameterSubstitutionData.Metadata.FormalParameterDep());
    }

    @objid ("3a259d33-9b51-42ba-a944-c3f1297283e5")
    @Override
    public void setFormalParameter(TemplateParameter value) {
        appendDepVal(TemplateParameterSubstitutionData.Metadata.FormalParameterDep(), (SmObjectImpl)value);
    }

    @objid ("3d58903f-e8aa-4690-8d40-83855fe8e565")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("fae10463-25a7-4434-8a7d-960aec7bae87")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("2c4b557f-fd24-4a06-ad6d-c2f9ed46666f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTemplateParameterSubstitution(this);
        else
          return null;
    }

}
