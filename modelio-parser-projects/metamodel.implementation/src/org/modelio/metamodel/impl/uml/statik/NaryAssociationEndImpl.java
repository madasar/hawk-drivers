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
import org.modelio.metamodel.data.uml.statik.NaryAssociationEndData;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0020dab4-c4bf-1fd8-97fe-001ec947cd2a")
public class NaryAssociationEndImpl extends StructuralFeatureImpl implements NaryAssociationEnd {
    @objid ("318b6d28-2c81-4a61-b035-fa8914c6fefc")
    @Override
    public NaryAssociation getNaryAssociation() {
        return (NaryAssociation) getDepVal(NaryAssociationEndData.Metadata.NaryAssociationDep());
    }

    @objid ("6e1a3ac1-8390-456d-b03c-c97591ae5997")
    @Override
    public void setNaryAssociation(NaryAssociation value) {
        appendDepVal(NaryAssociationEndData.Metadata.NaryAssociationDep(), (SmObjectImpl)value);
    }

    @objid ("2b661bbe-85c9-4a12-9901-d0580e8c7a4d")
    @Override
    public Classifier getOwner() {
        return (Classifier) getDepVal(NaryAssociationEndData.Metadata.OwnerDep());
    }

    @objid ("e7035254-a586-451a-927b-66fd047d9600")
    @Override
    public void setOwner(Classifier value) {
        appendDepVal(NaryAssociationEndData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("195b136a-43d9-48bc-a11d-de0782e61aa2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NaryAssociationEndData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(NaryAssociationEndData.Metadata.NaryAssociationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("bd03a773-b0a2-4608-a903-4542a8d9651f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NaryAssociationEndData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(NaryAssociationEndData.Metadata.OwnerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(NaryAssociationEndData.Metadata.NaryAssociationDep());
        if (obj != null)
          return new SmDepVal(NaryAssociationEndData.Metadata.NaryAssociationDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("581c2582-da64-4428-bd68-772e65b82558")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryAssociationEnd(this);
        else
          return null;
    }

}
