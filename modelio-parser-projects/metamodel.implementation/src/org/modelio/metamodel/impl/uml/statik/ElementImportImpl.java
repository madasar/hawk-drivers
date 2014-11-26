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
import org.modelio.metamodel.data.uml.statik.ElementImportData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00083b94-c4bf-1fd8-97fe-001ec947cd2a")
public class ElementImportImpl extends ModelElementImpl implements ElementImport {
    @objid ("d048ade1-8634-46a9-acc9-866675d6aa94")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(ElementImportData.Metadata.VisibilityAtt());
    }

    @objid ("1ccaab2f-d05e-4540-94cd-f70e02e646be")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(ElementImportData.Metadata.VisibilityAtt(), value);
    }

    @objid ("8bc8b8ca-743a-446b-8f37-b41c7c57ae28")
    @Override
    public NameSpace getImportingNameSpace() {
        return (NameSpace) getDepVal(ElementImportData.Metadata.ImportingNameSpaceDep());
    }

    @objid ("b6fe824e-4fd0-4a43-be93-5e72d4a91864")
    @Override
    public void setImportingNameSpace(NameSpace value) {
        appendDepVal(ElementImportData.Metadata.ImportingNameSpaceDep(), (SmObjectImpl)value);
    }

    @objid ("eaf27431-84bd-4dc6-a139-e6defa846c27")
    @Override
    public NameSpace getImportedElement() {
        return (NameSpace) getDepVal(ElementImportData.Metadata.ImportedElementDep());
    }

    @objid ("fe615b34-f868-4c54-8db3-46415471c268")
    @Override
    public void setImportedElement(NameSpace value) {
        appendDepVal(ElementImportData.Metadata.ImportedElementDep(), (SmObjectImpl)value);
    }

    @objid ("e0488a5c-cac4-47c4-a8b5-448e57fa344c")
    @Override
    public Operation getImportingOperation() {
        return (Operation) getDepVal(ElementImportData.Metadata.ImportingOperationDep());
    }

    @objid ("1641b4c9-fa24-4a3c-961d-0efd41097949")
    @Override
    public void setImportingOperation(Operation value) {
        appendDepVal(ElementImportData.Metadata.ImportingOperationDep(), (SmObjectImpl)value);
    }

    @objid ("652e5a61-4deb-475d-9fa8-838c9a87cba9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ElementImportData.Metadata.ImportingNameSpaceDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ElementImportData.Metadata.ImportingOperationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("dc75e1a2-d028-4dc3-9107-f7599853b52c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ElementImportData.Metadata.ImportingNameSpaceDep());
        if (obj != null)
          return new SmDepVal(ElementImportData.Metadata.ImportingNameSpaceDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ElementImportData.Metadata.ImportingOperationDep());
        if (obj != null)
          return new SmDepVal(ElementImportData.Metadata.ImportingOperationDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("615afcce-fcb5-4556-b60e-136bdf6a13ff")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitElementImport(this);
        else
          return null;
    }

}
