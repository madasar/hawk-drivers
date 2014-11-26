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
import org.modelio.metamodel.data.uml.infrastructure.DependencyData;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00860ba0-c4be-1fd8-97fe-001ec947cd2a")
public class DependencyImpl extends ModelElementImpl implements Dependency {
    @objid ("9630a4c6-e3e7-4f0b-82c9-2ccc81af931a")
    @Override
    public String getDependsOnId() {
        return (String) getAttVal(DependencyData.Metadata.DependsOnIdAtt());
    }

    @objid ("a1d3b1b6-0bef-47f2-bf3e-d95b642d3259")
    @Override
    public void setDependsOnId(String value) {
        setAttVal(DependencyData.Metadata.DependsOnIdAtt(), value);
    }

    @objid ("550f2046-115e-4d25-b191-c1931df3f62d")
    @Override
    public String getDependsOnName() {
        return (String) getAttVal(DependencyData.Metadata.DependsOnNameAtt());
    }

    @objid ("02d25fea-fe8f-4e55-9595-5aa801615d35")
    @Override
    public void setDependsOnName(String value) {
        setAttVal(DependencyData.Metadata.DependsOnNameAtt(), value);
    }

    @objid ("4c7f465a-3f01-47c2-9015-d9414d548190")
    @Override
    public ModelElement getDependsOn() {
        return (ModelElement) getDepVal(DependencyData.Metadata.DependsOnDep());
    }

    @objid ("bd3a5bcb-f9ee-4595-8eeb-79b8e10a5b40")
    @Override
    public void setDependsOn(ModelElement value) {
        appendDepVal(DependencyData.Metadata.DependsOnDep(), (SmObjectImpl)value);
    }

    @objid ("43823bc3-6556-4dbd-be2d-d32f76334bb0")
    @Override
    public ModelElement getImpacted() {
        return (ModelElement) getDepVal(DependencyData.Metadata.ImpactedDep());
    }

    @objid ("940c4409-3343-4ad5-8ab7-df476e6aa0a6")
    @Override
    public void setImpacted(ModelElement value) {
        appendDepVal(DependencyData.Metadata.ImpactedDep(), (SmObjectImpl)value);
    }

    @objid ("51ee23d1-99e6-4fd8-a104-76e92e2a992b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DependencyData.Metadata.ImpactedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("f9627941-b76f-4913-a646-17685800dceb")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DependencyData.Metadata.ImpactedDep());
        if (obj != null)
          return new SmDepVal(DependencyData.Metadata.ImpactedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("6777dff4-b5fa-404f-a209-7649cea4817f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDependency(this);
        else
          return null;
    }

}
