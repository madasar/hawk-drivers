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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.TagParameterData;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008ec7d6-c4be-1fd8-97fe-001ec947cd2a")
public class TagParameterImpl extends ElementImpl implements TagParameter {
    @objid ("b649b791-ccae-4952-a95e-3c7243b9b08c")
    @Override
    public String getValue() {
        return (String) getAttVal(TagParameterData.Metadata.ValueAtt());
    }

    @objid ("c1dacd5b-f33d-49a1-9961-66f676d7aec0")
    @Override
    public void setValue(String value) {
        setAttVal(TagParameterData.Metadata.ValueAtt(), value);
    }

    @objid ("7d909006-e13a-471b-96fc-0e51a76f6a52")
    @Override
    public TaggedValue getAnnoted() {
        return (TaggedValue) getDepVal(TagParameterData.Metadata.AnnotedDep());
    }

    @objid ("fdbf4733-3204-446e-918d-3102b9bd338b")
    @Override
    public void setAnnoted(TaggedValue value) {
        appendDepVal(TagParameterData.Metadata.AnnotedDep(), (SmObjectImpl)value);
    }

    @objid ("c58bdbb3-f1bf-4255-968c-8f6b084330c4")
    @Override
    public TaggedValue getQualified() {
        return (TaggedValue) getDepVal(TagParameterData.Metadata.QualifiedDep());
    }

    @objid ("11514313-189c-448f-b155-2aa28c2c84c0")
    @Override
    public void setQualified(TaggedValue value) {
        appendDepVal(TagParameterData.Metadata.QualifiedDep(), (SmObjectImpl)value);
    }

    @objid ("53ab3ed7-889b-4884-89a8-b6d4ff64ebe9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TagParameterData.Metadata.AnnotedDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(TagParameterData.Metadata.QualifiedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("902f5992-29f9-425d-8155-1f58035ca3f2")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TagParameterData.Metadata.AnnotedDep());
        if (obj != null)
          return new SmDepVal(TagParameterData.Metadata.AnnotedDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(TagParameterData.Metadata.QualifiedDep());
        if (obj != null)
          return new SmDepVal(TagParameterData.Metadata.QualifiedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("859f9d70-0b6f-4cd5-9a5e-a8d924f3b8f9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTagParameter(this);
        else
          return null;
    }

}
