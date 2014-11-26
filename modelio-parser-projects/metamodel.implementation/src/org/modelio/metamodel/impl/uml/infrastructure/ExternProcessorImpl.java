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
import org.modelio.metamodel.data.uml.infrastructure.ExternProcessorData;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("19257ea4-a0e7-4d4a-a390-75b7f65742f4")
public class ExternProcessorImpl extends ModelElementImpl implements ExternProcessor {
    @objid ("e29b994a-ef67-487a-8c8a-3d12781aacda")
    @Override
    public String getClassName() {
        return (String) getAttVal(ExternProcessorData.Metadata.ClassNameAtt());
    }

    @objid ("488d3fc5-49a1-4754-8cd4-b8b08b355dae")
    @Override
    public void setClassName(String value) {
        setAttVal(ExternProcessorData.Metadata.ClassNameAtt(), value);
    }

    @objid ("05671f30-e3bc-49c5-a0c4-b6d74e7ad107")
    @Override
    public QueryDefinition getOwnerQuery() {
        return (QueryDefinition) getDepVal(ExternProcessorData.Metadata.OwnerQueryDep());
    }

    @objid ("eb9aafe5-2058-4707-808e-73a71ca03951")
    @Override
    public void setOwnerQuery(QueryDefinition value) {
        appendDepVal(ExternProcessorData.Metadata.OwnerQueryDep(), (SmObjectImpl)value);
    }

    @objid ("36c574ea-3d8b-46f6-9ffc-5343616db2fe")
    @Override
    public MatrixValueDefinition getOwnerValDef() {
        return (MatrixValueDefinition) getDepVal(ExternProcessorData.Metadata.OwnerValDefDep());
    }

    @objid ("7c2619bd-f6e8-4167-bfee-24e52b5d61fc")
    @Override
    public void setOwnerValDef(MatrixValueDefinition value) {
        appendDepVal(ExternProcessorData.Metadata.OwnerValDefDep(), (SmObjectImpl)value);
    }

    @objid ("7e1f4199-8f9e-42a1-ac8a-f7f6db7938ea")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternProcessorData.Metadata.OwnerQueryDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ExternProcessorData.Metadata.OwnerValDefDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("2e4b8fe3-f893-4b7d-9ca9-eef9b011182d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternProcessorData.Metadata.OwnerQueryDep());
        if (obj != null)
          return new SmDepVal(ExternProcessorData.Metadata.OwnerQueryDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ExternProcessorData.Metadata.OwnerValDefDep());
        if (obj != null)
          return new SmDepVal(ExternProcessorData.Metadata.OwnerValDefDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e3e56429-b458-4d58-8a41-5ea4792657aa")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExternProcessor(this);
        else
          return null;
    }

}
