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
import org.modelio.metamodel.data.uml.statik.AttributeLinkData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00003354-c4bf-1fd8-97fe-001ec947cd2a")
public class AttributeLinkImpl extends ModelElementImpl implements AttributeLink {
    @objid ("0e0f78b0-31ca-40d9-96fc-369f92f6c4f2")
    @Override
    public String getValue() {
        return (String) getAttVal(AttributeLinkData.Metadata.ValueAtt());
    }

    @objid ("8cd37154-ff3f-4fb3-bd95-f891cbcd4bba")
    @Override
    public void setValue(String value) {
        setAttVal(AttributeLinkData.Metadata.ValueAtt(), value);
    }

    @objid ("35b8687c-717f-4cb6-9b64-99f2976ff7d4")
    @Override
    public Instance getAttributed() {
        return (Instance) getDepVal(AttributeLinkData.Metadata.AttributedDep());
    }

    @objid ("ec1141df-8319-44a5-896a-899939a395fc")
    @Override
    public void setAttributed(Instance value) {
        appendDepVal(AttributeLinkData.Metadata.AttributedDep(), (SmObjectImpl)value);
    }

    @objid ("ba2bd9a5-ba30-4bfd-8b0d-ecf1c4e51dcd")
    @Override
    public Attribute getBase() {
        return (Attribute) getDepVal(AttributeLinkData.Metadata.BaseDep());
    }

    @objid ("7cee3040-a65a-4c8f-abd5-749a21421836")
    @Override
    public void setBase(Attribute value) {
        appendDepVal(AttributeLinkData.Metadata.BaseDep(), (SmObjectImpl)value);
    }

    @objid ("7cc3fc55-2d69-47ac-81e1-2d254af02f87")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AttributeLinkData.Metadata.AttributedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("1690467e-f29b-451d-a9e0-f8a659e0ced3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AttributeLinkData.Metadata.AttributedDep());
        if (obj != null)
          return new SmDepVal(AttributeLinkData.Metadata.AttributedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("186acfe2-ee05-4cee-b6d8-374821c7cae4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAttributeLink(this);
        else
          return null;
    }

}
