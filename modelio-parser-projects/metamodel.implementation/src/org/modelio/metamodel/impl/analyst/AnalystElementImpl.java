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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystContainer;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.data.analyst.AnalystElementData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("8dc426e9-5733-4b29-b7eb-113f29cd5f01")
public abstract class AnalystElementImpl extends AnalystItemImpl implements AnalystElement {
    @objid ("ba3033f7-1d9a-4f46-abda-a47ac5e80cf8")
    @Override
    public AnalystPropertyTable getDefaultProperties() {
        MObject owner = this;
        do {
            owner = owner.getCompositionOwner(); 
        } while (owner != null && !(owner instanceof AnalystContainer));
        
        if (owner != null) {
            return ((AnalystContainer) owner).getAnalystProperties();
        } else {
            return null;
        }
    }

    @objid ("d857d74b-1ef6-4ff3-aa0b-ce983bece8aa")
    @Override
    public int getVersion() {
        return (Integer) getAttVal(AnalystElementData.Metadata.VersionAtt());
    }

    @objid ("6b18d718-950d-4474-b5ee-be5b2de4cfbb")
    @Override
    public void setVersion(int value) {
        setAttVal(AnalystElementData.Metadata.VersionAtt(), value);
    }

    @objid ("a7b7f6a7-9e85-4f53-802b-0167d7c5d761")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3867af7c-c86d-4572-951a-c024a0c126c8")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("72dc4494-a6f9-4317-afd4-75da9acc2389")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAnalystElement(this);
        else
          return null;
    }

}
