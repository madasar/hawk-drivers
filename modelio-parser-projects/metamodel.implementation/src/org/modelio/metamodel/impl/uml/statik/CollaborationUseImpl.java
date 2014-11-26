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
import org.modelio.metamodel.data.uml.statik.CollaborationUseData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0004a754-c4bf-1fd8-97fe-001ec947cd2a")
public class CollaborationUseImpl extends ModelElementImpl implements CollaborationUse {
    @objid ("9f7cadc1-fc5e-479b-a887-79b4826f96f1")
    @Override
    public Collaboration getType() {
        return (Collaboration) getDepVal(CollaborationUseData.Metadata.TypeDep());
    }

    @objid ("21174eee-86eb-4685-a08f-1d3b1bdf045d")
    @Override
    public void setType(Collaboration value) {
        appendDepVal(CollaborationUseData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("50348d32-2d51-4b6b-a0a5-19c5d0c0a3aa")
    @Override
    public NameSpace getNRepresented() {
        return (NameSpace) getDepVal(CollaborationUseData.Metadata.NRepresentedDep());
    }

    @objid ("354b9aa1-f0e8-4635-8bd7-925050e595e5")
    @Override
    public void setNRepresented(NameSpace value) {
        appendDepVal(CollaborationUseData.Metadata.NRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("76064cee-9de7-46fc-bd35-5d3b44b4d65b")
    @Override
    public Operation getORepresented() {
        return (Operation) getDepVal(CollaborationUseData.Metadata.ORepresentedDep());
    }

    @objid ("fb56ce30-7d3d-402a-912a-64e5460d4c2e")
    @Override
    public void setORepresented(Operation value) {
        appendDepVal(CollaborationUseData.Metadata.ORepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("520cf4fc-dd32-4b69-8273-17c5066ee337")
    @Override
    public EList<Binding> getRoleBinding() {
        return new SmList<>(this, CollaborationUseData.Metadata.RoleBindingDep());
    }

    @objid ("20f7dc54-4a78-456e-8059-24f475d12e88")
    @Override
    public <T extends Binding> List<T> getRoleBinding(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Binding element : getRoleBinding()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3e4f1250-58c7-47e2-a559-f748f35e1c17")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CollaborationUseData.Metadata.NRepresentedDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(CollaborationUseData.Metadata.ORepresentedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("4963fab3-3005-4e8b-9df9-97f75ce693e7")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CollaborationUseData.Metadata.NRepresentedDep());
        if (obj != null)
          return new SmDepVal(CollaborationUseData.Metadata.NRepresentedDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(CollaborationUseData.Metadata.ORepresentedDep());
        if (obj != null)
          return new SmDepVal(CollaborationUseData.Metadata.ORepresentedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("9961cfd2-4e6e-4b27-b8d4-cd6cdeb00209")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCollaborationUse(this);
        else
          return null;
    }

}
