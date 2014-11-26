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
import org.modelio.metamodel.data.uml.statik.RaisedExceptionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("001ab350-c4bf-1fd8-97fe-001ec947cd2a")
public class RaisedExceptionImpl extends ModelElementImpl implements RaisedException {
    @objid ("4a840d6e-9bfe-406f-82e0-9d27d92d9267")
    @Override
    public Classifier getThrownType() {
        return (Classifier) getDepVal(RaisedExceptionData.Metadata.ThrownTypeDep());
    }

    @objid ("164a0215-d858-48b2-bf96-8566eedf4678")
    @Override
    public void setThrownType(Classifier value) {
        appendDepVal(RaisedExceptionData.Metadata.ThrownTypeDep(), (SmObjectImpl)value);
    }

    @objid ("3a717557-0bdf-4aa8-bc8f-5eee1b327a1b")
    @Override
    public Operation getThrower() {
        return (Operation) getDepVal(RaisedExceptionData.Metadata.ThrowerDep());
    }

    @objid ("e8f9480a-50d9-4e03-8abe-e359480f8a10")
    @Override
    public void setThrower(Operation value) {
        appendDepVal(RaisedExceptionData.Metadata.ThrowerDep(), (SmObjectImpl)value);
    }

    @objid ("1acfff1f-f982-47ca-b9c1-6c24cad2a027")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RaisedExceptionData.Metadata.ThrowerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("666d185a-64a4-4651-a2dd-68e1ec356ad3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RaisedExceptionData.Metadata.ThrowerDep());
        if (obj != null)
          return new SmDepVal(RaisedExceptionData.Metadata.ThrowerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("2e2e8011-99ef-4fa4-9305-71fd8c8eb93b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRaisedException(this);
        else
          return null;
    }

}
