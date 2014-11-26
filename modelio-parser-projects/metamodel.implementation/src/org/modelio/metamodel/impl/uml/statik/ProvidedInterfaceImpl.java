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
import org.modelio.metamodel.data.uml.statik.ProvidedInterfaceData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0019d6a6-c4bf-1fd8-97fe-001ec947cd2a")
public class ProvidedInterfaceImpl extends ModelElementImpl implements ProvidedInterface {
    @objid ("6689b5aa-378e-4013-9dcb-3028e14653fc")
    @Override
    public EList<Interface> getProvidedElement() {
        return new SmList<>(this, ProvidedInterfaceData.Metadata.ProvidedElementDep());
    }

    @objid ("7ddb8d1a-b5df-4010-8719-93e96b51c8cd")
    @Override
    public <T extends Interface> List<T> getProvidedElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Interface element : getProvidedElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7f0d2384-4e03-4c4f-9e2c-33b5f72d5748")
    @Override
    public Port getProviding() {
        return (Port) getDepVal(ProvidedInterfaceData.Metadata.ProvidingDep());
    }

    @objid ("7e28ff5c-22fb-4d67-a746-faba1b7f37a7")
    @Override
    public void setProviding(Port value) {
        appendDepVal(ProvidedInterfaceData.Metadata.ProvidingDep(), (SmObjectImpl)value);
    }

    @objid ("d7a81d27-890d-4790-a651-cb55608e9658")
    @Override
    public EList<LinkEnd> getConsumer() {
        return new SmList<>(this, ProvidedInterfaceData.Metadata.ConsumerDep());
    }

    @objid ("781e193e-e508-48af-9d44-c652fdc79cb4")
    @Override
    public <T extends LinkEnd> List<T> getConsumer(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final LinkEnd element : getConsumer()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("01748284-021c-4791-b907-d1c3bd02c383")
    @Override
    public EList<NaryLinkEnd> getNaryConsumer() {
        return new SmList<>(this, ProvidedInterfaceData.Metadata.NaryConsumerDep());
    }

    @objid ("d9cf06d9-19b0-477b-bb76-d8008bbc5f4d")
    @Override
    public <T extends NaryLinkEnd> List<T> getNaryConsumer(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NaryLinkEnd element : getNaryConsumer()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("53e847b9-c49a-4ce7-9235-d4cb11094940")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProvidedInterfaceData.Metadata.ProvidingDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("24386704-d5ac-46a6-bbed-d3b3ed6969b5")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProvidedInterfaceData.Metadata.ProvidingDep());
        if (obj != null)
          return new SmDepVal(ProvidedInterfaceData.Metadata.ProvidingDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("d23508ad-d388-4bd5-b548-4bf77f3b2731")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitProvidedInterface(this);
        else
          return null;
    }

}
