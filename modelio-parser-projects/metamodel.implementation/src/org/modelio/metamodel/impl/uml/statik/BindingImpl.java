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
import org.modelio.metamodel.data.uml.statik.BindingData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.NaryConnector;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000191ae-c4bf-1fd8-97fe-001ec947cd2a")
public class BindingImpl extends ModelElementImpl implements Binding {
    @objid ("592ad4e3-8743-437f-a629-e96259a5a968")
    @Override
    public ConnectorEnd getConnectorEndRole() {
        return (ConnectorEnd) getDepVal(BindingData.Metadata.ConnectorEndRoleDep());
    }

    @objid ("698ba0a9-8806-4aa2-8157-aa57d2c58f66")
    @Override
    public void setConnectorEndRole(ConnectorEnd value) {
        appendDepVal(BindingData.Metadata.ConnectorEndRoleDep(), (SmObjectImpl)value);
    }

    @objid ("b31edd93-d218-48ba-bd4e-ff489dd107d1")
    @Override
    public NaryConnector getConnectorRole() {
        return (NaryConnector) getDepVal(BindingData.Metadata.ConnectorRoleDep());
    }

    @objid ("e086f8b2-8429-4272-9fe1-f35b089e41de")
    @Override
    public void setConnectorRole(NaryConnector value) {
        appendDepVal(BindingData.Metadata.ConnectorRoleDep(), (SmObjectImpl)value);
    }

    @objid ("cc288a61-0c65-4d79-968b-1d0244463d8e")
    @Override
    public BindableInstance getRole() {
        return (BindableInstance) getDepVal(BindingData.Metadata.RoleDep());
    }

    @objid ("b496f792-3776-451d-a962-1ecc4c377d76")
    @Override
    public void setRole(BindableInstance value) {
        appendDepVal(BindingData.Metadata.RoleDep(), (SmObjectImpl)value);
    }

    @objid ("4e70f415-3b99-4b80-b7e5-a9c084f547e6")
    @Override
    public ModelElement getRepresentedFeature() {
        return (ModelElement) getDepVal(BindingData.Metadata.RepresentedFeatureDep());
    }

    @objid ("cab780d8-890d-4682-8931-3d3d30e1dd3a")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(BindingData.Metadata.RepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("5dae38bb-6da5-4fcc-92d5-8846da9a7cfa")
    @Override
    public CollaborationUse getOwner() {
        return (CollaborationUse) getDepVal(BindingData.Metadata.OwnerDep());
    }

    @objid ("a8258990-ba2a-4d55-937e-baae95d8719c")
    @Override
    public void setOwner(CollaborationUse value) {
        appendDepVal(BindingData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("2c1099e2-526c-4d4a-83e4-933af1f25a07")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BindingData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("6c66bd0c-b62c-4493-b98f-eac215be50bf")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BindingData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BindingData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("3f17444b-953b-4370-a493-16d2b5a5aa15")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBinding(this);
        else
          return null;
    }

}
