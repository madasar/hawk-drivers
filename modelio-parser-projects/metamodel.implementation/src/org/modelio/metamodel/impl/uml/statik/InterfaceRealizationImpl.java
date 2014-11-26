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
import org.modelio.metamodel.data.uml.statik.InterfaceRealizationData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000f221a-c4bf-1fd8-97fe-001ec947cd2a")
public class InterfaceRealizationImpl extends ModelElementImpl implements InterfaceRealization {
    @objid ("0f64c263-79a5-4bef-9498-2d2f1b3b74eb")
    @Override
    public Interface getImplemented() {
        return (Interface) getDepVal(InterfaceRealizationData.Metadata.ImplementedDep());
    }

    @objid ("bfba5b7b-0b11-470d-8b94-a750126338e3")
    @Override
    public void setImplemented(Interface value) {
        appendDepVal(InterfaceRealizationData.Metadata.ImplementedDep(), (SmObjectImpl)value);
    }

    @objid ("22908346-b680-4677-a7e5-fad037899d99")
    @Override
    public NameSpace getImplementer() {
        return (NameSpace) getDepVal(InterfaceRealizationData.Metadata.ImplementerDep());
    }

    @objid ("85521089-f735-4793-9358-6cb751e7fc02")
    @Override
    public void setImplementer(NameSpace value) {
        appendDepVal(InterfaceRealizationData.Metadata.ImplementerDep(), (SmObjectImpl)value);
    }

    @objid ("2f4fd5db-dd1e-4266-8160-bac9bd4f95c7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InterfaceRealizationData.Metadata.ImplementerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("80769396-0b87-4cfc-bc4f-a1a5ccfc4800")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InterfaceRealizationData.Metadata.ImplementerDep());
        if (obj != null)
          return new SmDepVal(InterfaceRealizationData.Metadata.ImplementerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("5355616b-a251-4f91-b5b1-936559bff52c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInterfaceRealization(this);
        else
          return null;
    }

}
