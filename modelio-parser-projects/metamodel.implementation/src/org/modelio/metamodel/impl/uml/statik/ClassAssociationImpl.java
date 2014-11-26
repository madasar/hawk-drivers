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
import org.modelio.metamodel.data.uml.statik.ClassAssociationData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0002efae-c4bf-1fd8-97fe-001ec947cd2a")
public class ClassAssociationImpl extends ModelElementImpl implements ClassAssociation {
    @objid ("dca9140b-5d4a-4c1c-897d-75f055783025")
    @Override
    public NaryAssociation getNaryAssociationPart() {
        return (NaryAssociation) getDepVal(ClassAssociationData.Metadata.NaryAssociationPartDep());
    }

    @objid ("f0934d6a-622c-4ac4-acad-843b684b83f8")
    @Override
    public void setNaryAssociationPart(NaryAssociation value) {
        appendDepVal(ClassAssociationData.Metadata.NaryAssociationPartDep(), (SmObjectImpl)value);
    }

    @objid ("76ce4ee8-8aeb-4baa-898a-dbf665940d55")
    @Override
    public Class getClassPart() {
        return (Class) getDepVal(ClassAssociationData.Metadata.ClassPartDep());
    }

    @objid ("b9de0243-b9b0-4c72-b9b7-561fd49cf51a")
    @Override
    public void setClassPart(Class value) {
        appendDepVal(ClassAssociationData.Metadata.ClassPartDep(), (SmObjectImpl)value);
    }

    @objid ("fc5659b4-0f65-4170-b720-2206041fe6ad")
    @Override
    public Association getAssociationPart() {
        return (Association) getDepVal(ClassAssociationData.Metadata.AssociationPartDep());
    }

    @objid ("55d03739-fe69-47b4-a8a1-2bbea8c5d6b8")
    @Override
    public void setAssociationPart(Association value) {
        appendDepVal(ClassAssociationData.Metadata.AssociationPartDep(), (SmObjectImpl)value);
    }

    @objid ("151a13e0-287e-475e-bc1e-70a374211f3b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ClassAssociationData.Metadata.NaryAssociationPartDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ClassAssociationData.Metadata.AssociationPartDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d730831c-be16-4bb8-a162-d1e85f4b54ed")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ClassAssociationData.Metadata.NaryAssociationPartDep());
        if (obj != null)
          return new SmDepVal(ClassAssociationData.Metadata.NaryAssociationPartDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ClassAssociationData.Metadata.AssociationPartDep());
        if (obj != null)
          return new SmDepVal(ClassAssociationData.Metadata.AssociationPartDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("61280f65-d4d9-406a-9e61-5b7e4aba9614")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClassAssociation(this);
        else
          return null;
    }

}
