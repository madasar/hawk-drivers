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
import org.modelio.metamodel.data.uml.statik.ManifestationData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0010c444-c4bf-1fd8-97fe-001ec947cd2a")
public class ManifestationImpl extends ModelElementImpl implements Manifestation {
    @objid ("6ef9f9db-4f07-4aaa-979a-7e60530512b9")
    @Override
    public ModelElement getUtilizedElement() {
        return (ModelElement) getDepVal(ManifestationData.Metadata.UtilizedElementDep());
    }

    @objid ("be4f2010-7c8b-40dd-aad0-ccefe6b6278c")
    @Override
    public void setUtilizedElement(ModelElement value) {
        appendDepVal(ManifestationData.Metadata.UtilizedElementDep(), (SmObjectImpl)value);
    }

    @objid ("c3d7f87f-f053-4941-8564-9516361ddf40")
    @Override
    public Artifact getOwner() {
        return (Artifact) getDepVal(ManifestationData.Metadata.OwnerDep());
    }

    @objid ("cfa596d7-2d5e-44da-9f23-b1ac062dc7d9")
    @Override
    public void setOwner(Artifact value) {
        appendDepVal(ManifestationData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("f6cd100a-adc4-432f-b9a3-72487c077b51")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ManifestationData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("899bbba6-dcf0-4fc9-9dd7-ad7ae8c9acdb")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ManifestationData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ManifestationData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ef76c97b-5ea8-4934-bcbe-4ef40d96ad66")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitManifestation(this);
        else
          return null;
    }

}
