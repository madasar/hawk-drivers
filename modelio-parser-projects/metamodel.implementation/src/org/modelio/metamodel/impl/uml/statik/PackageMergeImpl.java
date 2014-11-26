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
import org.modelio.metamodel.data.uml.statik.PackageMergeData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PackageMerge;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00172b86-c4bf-1fd8-97fe-001ec947cd2a")
public class PackageMergeImpl extends ModelElementImpl implements PackageMerge {
    @objid ("60aafd6b-924e-44ac-8489-7525ecbe521e")
    @Override
    public Package getMergedPackage() {
        return (Package) getDepVal(PackageMergeData.Metadata.MergedPackageDep());
    }

    @objid ("91c48040-13d1-44ba-8956-99514ef7f78e")
    @Override
    public void setMergedPackage(Package value) {
        appendDepVal(PackageMergeData.Metadata.MergedPackageDep(), (SmObjectImpl)value);
    }

    @objid ("1e70a54f-ea83-4049-9a57-41be9ceb93de")
    @Override
    public Package getReceivingPackage() {
        return (Package) getDepVal(PackageMergeData.Metadata.ReceivingPackageDep());
    }

    @objid ("d5036442-fae5-46c1-8cf6-3e8696316a17")
    @Override
    public void setReceivingPackage(Package value) {
        appendDepVal(PackageMergeData.Metadata.ReceivingPackageDep(), (SmObjectImpl)value);
    }

    @objid ("0eeb0336-a496-4a92-9105-e63a2fc86634")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageMergeData.Metadata.ReceivingPackageDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a60f153c-c10f-41ef-a28d-d6d623a0a63b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageMergeData.Metadata.ReceivingPackageDep());
        if (obj != null)
          return new SmDepVal(PackageMergeData.Metadata.ReceivingPackageDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("93efcf1e-deb9-47d5-94f5-427131c1b756")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPackageMerge(this);
        else
          return null;
    }

}
