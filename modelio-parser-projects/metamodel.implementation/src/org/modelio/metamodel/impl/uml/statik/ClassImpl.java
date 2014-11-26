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
import org.modelio.metamodel.data.uml.statik.ClassData;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000247ca-c4bf-1fd8-97fe-001ec947cd2a")
public class ClassImpl extends GeneralClassImpl implements Class {
    @objid ("3d3d41fe-68ba-4d3f-84e4-817826afd535")
    @Override
    public boolean isIsActive() {
        return (Boolean) getAttVal(ClassData.Metadata.IsActiveAtt());
    }

    @objid ("5a5314f9-e2d4-408a-8c0c-4366dc13702c")
    @Override
    public void setIsActive(boolean value) {
        setAttVal(ClassData.Metadata.IsActiveAtt(), value);
    }

    @objid ("d1e86c9f-9bdf-4c58-89e1-084c2ca64f7b")
    @Override
    public boolean isIsMain() {
        return (Boolean) getAttVal(ClassData.Metadata.IsMainAtt());
    }

    @objid ("52f958db-1a9e-4f08-8be4-22162aa4e060")
    @Override
    public void setIsMain(boolean value) {
        setAttVal(ClassData.Metadata.IsMainAtt(), value);
    }

    @objid ("ed9393db-655c-4a70-ac08-e1ff33c2d243")
    @Override
    public ClassAssociation getLinkToAssociation() {
        return (ClassAssociation) getDepVal(ClassData.Metadata.LinkToAssociationDep());
    }

    @objid ("fdfe671d-2d85-434d-82b6-a318825cc47a")
    @Override
    public void setLinkToAssociation(ClassAssociation value) {
        appendDepVal(ClassData.Metadata.LinkToAssociationDep(), (SmObjectImpl)value);
    }

    @objid ("c1cf3f1b-4bbe-44a9-b603-636b7848fb5b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("966941a0-7668-4903-816f-8adf1b9c9d9b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("27841287-a59e-40b5-8ed7-3be145bc973d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClass(this);
        else
          return null;
    }

}
