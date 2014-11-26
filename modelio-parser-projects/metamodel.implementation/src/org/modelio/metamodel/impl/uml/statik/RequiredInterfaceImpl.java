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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.RequiredInterfaceData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.RequiredInterface;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("001b9b4e-c4bf-1fd8-97fe-001ec947cd2a")
public class RequiredInterfaceImpl extends ModelElementImpl implements RequiredInterface {
    @objid ("f7b180e3-006c-42c2-b81c-7d2381236385")
    @Override
    public EList<Interface> getRequiredElement() {
        return new SmList<>(this, RequiredInterfaceData.Metadata.RequiredElementDep());
    }

    @objid ("33de7701-70fb-434a-b6c7-1d1d691bc56b")
    @Override
    public <T extends Interface> List<T> getRequiredElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Interface element : getRequiredElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("28e4144d-fff5-48a5-a2f6-52501a1c7af3")
    @Override
    public EList<LinkEnd> getProvider() {
        return new SmList<>(this, RequiredInterfaceData.Metadata.ProviderDep());
    }

    @objid ("2bd0e8e7-17da-431d-9b78-14499ee4d2f3")
    @Override
    public <T extends LinkEnd> List<T> getProvider(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final LinkEnd element : getProvider()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0bd93062-3308-4f42-8069-acf1a9781881")
    @Override
    public Port getRequiring() {
        return (Port) getDepVal(RequiredInterfaceData.Metadata.RequiringDep());
    }

    @objid ("debb1f10-7f3b-460e-84b6-577dd28eea1d")
    @Override
    public void setRequiring(Port value) {
        appendDepVal(RequiredInterfaceData.Metadata.RequiringDep(), (SmObjectImpl)value);
    }

    @objid ("43db867e-c3dd-47b9-bafb-ce77b84e1912")
    @Override
    public EList<NaryLinkEnd> getNaryProvider() {
        return new SmList<>(this, RequiredInterfaceData.Metadata.NaryProviderDep());
    }

    @objid ("509e0829-1225-4a38-9cb0-98fa98fcef78")
    @Override
    public <T extends NaryLinkEnd> List<T> getNaryProvider(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NaryLinkEnd element : getNaryProvider()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6e82de9c-e2fd-41d9-a62d-f83f71ba2f4a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequiredInterfaceData.Metadata.RequiringDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("5dec945a-d692-4e68-823a-0cd20cacf11e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequiredInterfaceData.Metadata.RequiringDep());
        if (obj != null)
          return new SmDepVal(RequiredInterfaceData.Metadata.RequiringDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("7afc87b5-46f6-4236-9bd4-ebc33dd3f92e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRequiredInterface(this);
        else
          return null;
    }

}
