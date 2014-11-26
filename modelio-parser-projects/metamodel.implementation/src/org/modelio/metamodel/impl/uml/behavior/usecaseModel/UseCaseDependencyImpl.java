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
import org.modelio.metamodel.data.uml.behavior.usecaseModel.UseCaseDependencyData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00592d06-c4bf-1fd8-97fe-001ec947cd2a")
public class UseCaseDependencyImpl extends ModelElementImpl implements UseCaseDependency {
    @objid ("781332d1-3dd4-4a5e-aa1f-679655800918")
    @Override
    public UseCase getOrigin() {
        return (UseCase) getDepVal(UseCaseDependencyData.Metadata.OriginDep());
    }

    @objid ("1fac42af-d2a0-4ba3-948e-181dc780c06b")
    @Override
    public void setOrigin(UseCase value) {
        appendDepVal(UseCaseDependencyData.Metadata.OriginDep(), (SmObjectImpl)value);
    }

    @objid ("fab1f1c6-4d2c-4b84-ad0f-7237f6e02a17")
    @Override
    public EList<ExtensionPoint> getExtensionLocation() {
        return new SmList<>(this, UseCaseDependencyData.Metadata.ExtensionLocationDep());
    }

    @objid ("e9ebc300-884a-4c1f-880d-aa386d697c07")
    @Override
    public <T extends ExtensionPoint> List<T> getExtensionLocation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExtensionPoint element : getExtensionLocation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("bf735bf3-37fd-461b-94ed-901c6400f4aa")
    @Override
    public UseCase getTarget() {
        return (UseCase) getDepVal(UseCaseDependencyData.Metadata.TargetDep());
    }

    @objid ("2abdd274-baa5-41ad-b3ef-71c70ee7b338")
    @Override
    public void setTarget(UseCase value) {
        appendDepVal(UseCaseDependencyData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("622bad09-817d-4938-af21-2e6ec0c42afe")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(UseCaseDependencyData.Metadata.OriginDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("2407b5ca-ad45-49ef-9c6c-8110e41f050e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(UseCaseDependencyData.Metadata.OriginDep());
        if (obj != null)
          return new SmDepVal(UseCaseDependencyData.Metadata.OriginDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("6eea02b7-413a-4499-83e0-4033a480317a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitUseCaseDependency(this);
        else
          return null;
    }

}
