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
import org.modelio.metamodel.data.uml.statik.PackageImportData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00164f7c-c4bf-1fd8-97fe-001ec947cd2a")
public class PackageImportImpl extends ModelElementImpl implements PackageImport {
    @objid ("f5668957-c42f-4e9f-ac22-32b33cfd1a20")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(PackageImportData.Metadata.VisibilityAtt());
    }

    @objid ("09209554-d5ad-45d5-b9af-f3465fbd1d6c")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(PackageImportData.Metadata.VisibilityAtt(), value);
    }

    @objid ("4cf73e9c-1c72-4262-b86d-b6da1c2e1f75")
    @Override
    public Operation getImportingOperation() {
        return (Operation) getDepVal(PackageImportData.Metadata.ImportingOperationDep());
    }

    @objid ("2eb15ebb-57e3-4745-bee3-5032926152b7")
    @Override
    public void setImportingOperation(Operation value) {
        appendDepVal(PackageImportData.Metadata.ImportingOperationDep(), (SmObjectImpl)value);
    }

    @objid ("98dc5b5c-4c02-4389-b5ba-9fc9d96d09f5")
    @Override
    public NameSpace getImportingNameSpace() {
        return (NameSpace) getDepVal(PackageImportData.Metadata.ImportingNameSpaceDep());
    }

    @objid ("3498c50a-d93b-46d7-8481-7e937b62ccc8")
    @Override
    public void setImportingNameSpace(NameSpace value) {
        appendDepVal(PackageImportData.Metadata.ImportingNameSpaceDep(), (SmObjectImpl)value);
    }

    @objid ("61a216ba-1c74-42bc-9ee3-60b9a174714c")
    @Override
    public Package getImportedPackage() {
        return (Package) getDepVal(PackageImportData.Metadata.ImportedPackageDep());
    }

    @objid ("416abaa7-0223-4b14-8387-da9b3c3825c1")
    @Override
    public void setImportedPackage(Package value) {
        appendDepVal(PackageImportData.Metadata.ImportedPackageDep(), (SmObjectImpl)value);
    }

    @objid ("3921383f-f0e2-41bf-9f75-2b0cf6e53948")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageImportData.Metadata.ImportingOperationDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(PackageImportData.Metadata.ImportingNameSpaceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("1c3cd011-0310-4879-9203-21e53ee17d17")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageImportData.Metadata.ImportingOperationDep());
        if (obj != null)
          return new SmDepVal(PackageImportData.Metadata.ImportingOperationDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(PackageImportData.Metadata.ImportingNameSpaceDep());
        if (obj != null)
          return new SmDepVal(PackageImportData.Metadata.ImportingNameSpaceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("081d95ed-cacc-43b3-805f-8e57f9b62bc3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPackageImport(this);
        else
          return null;
    }

}
