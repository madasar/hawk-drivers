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
package org.modelio.metamodel.impl.uml.behavior.usecaseModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.usecaseModel.ExtensionPointData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0059a6a0-c4bf-1fd8-97fe-001ec947cd2a")
public class ExtensionPointImpl extends ModelElementImpl implements ExtensionPoint {
    @objid ("3968ef4e-a312-46cf-9b2d-3ffb6161e292")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(ExtensionPointData.Metadata.VisibilityAtt());
    }

    @objid ("d0009374-ba91-4e12-b450-38b41a6a5a39")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(ExtensionPointData.Metadata.VisibilityAtt(), value);
    }

    @objid ("bb9d53d4-0287-44de-8382-f2cfcc70ec5b")
    @Override
    public EList<UseCaseDependency> getExtended() {
        return new SmList<>(this, ExtensionPointData.Metadata.ExtendedDep());
    }

    @objid ("68e7bee3-4aa0-4d93-ae44-b8f324df1abe")
    @Override
    public <T extends UseCaseDependency> List<T> getExtended(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final UseCaseDependency element : getExtended()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("811f1922-cdae-4411-be35-0b87afbba42d")
    @Override
    public UseCase getOwner() {
        return (UseCase) getDepVal(ExtensionPointData.Metadata.OwnerDep());
    }

    @objid ("86d274ff-c192-48d4-a432-4ceace8cafd9")
    @Override
    public void setOwner(UseCase value) {
        appendDepVal(ExtensionPointData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("1daa2f17-e6ce-4629-9173-a9ecd33914a9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExtensionPointData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("8e1c2e8e-c840-4f6a-8c9b-1586ba04eb94")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExtensionPointData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ExtensionPointData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("1081058b-337d-49dc-abf7-3e712ee528fc")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExtensionPoint(this);
        else
          return null;
    }

}
