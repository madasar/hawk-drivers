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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.TaggedValueData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00903bfc-c4be-1fd8-97fe-001ec947cd2a")
public class TaggedValueImpl extends ModelElementImpl implements TaggedValue {
    @objid ("d2e4d1d8-8480-4511-a334-64eef968ba43")
    @Override
    public ModelElement getAnnoted() {
        return (ModelElement) getDepVal(TaggedValueData.Metadata.AnnotedDep());
    }

    @objid ("c3bcf0c1-bd2e-4491-a94e-efed63e931b3")
    @Override
    public void setAnnoted(ModelElement value) {
        appendDepVal(TaggedValueData.Metadata.AnnotedDep(), (SmObjectImpl)value);
    }

    @objid ("23d374db-9db1-4ac1-80fe-3279b640c956")
    @Override
    public EList<TagParameter> getActual() {
        return new SmList<>(this, TaggedValueData.Metadata.ActualDep());
    }

    @objid ("955b4e52-777a-401e-b3d8-1a0bc3a701df")
    @Override
    public <T extends TagParameter> List<T> getActual(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TagParameter element : getActual()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3058f911-63c8-4acb-9145-d3943d4a8d6d")
    @Override
    public TagParameter getQualifier() {
        return (TagParameter) getDepVal(TaggedValueData.Metadata.QualifierDep());
    }

    @objid ("27413fb9-ea21-4722-ae30-81defb9be6d4")
    @Override
    public void setQualifier(TagParameter value) {
        appendDepVal(TaggedValueData.Metadata.QualifierDep(), (SmObjectImpl)value);
    }

    @objid ("9307bffd-046b-41c5-9e5a-817450f63b83")
    @Override
    public TagType getDefinition() {
        return (TagType) getDepVal(TaggedValueData.Metadata.DefinitionDep());
    }

    @objid ("030ad833-9bc6-4e2c-8900-bf638fa80810")
    @Override
    public void setDefinition(TagType value) {
        appendDepVal(TaggedValueData.Metadata.DefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("c66df7e4-4d1e-491a-a758-ef5cd29c280d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TaggedValueData.Metadata.AnnotedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("6867457d-e5b5-41ec-8bfe-3acd3816ab91")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TaggedValueData.Metadata.AnnotedDep());
        if (obj != null)
          return new SmDepVal(TaggedValueData.Metadata.AnnotedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("20611785-4e08-4d5f-bd92-069eff00986e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTaggedValue(this);
        else
          return null;
    }

}
