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
import org.modelio.metamodel.data.uml.statik.PortData;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0018eeee-c4bf-1fd8-97fe-001ec947cd2a")
public class PortImpl extends BindableInstanceImpl implements Port {
    @objid ("3d977269-1122-434c-9a72-76cc3a667523")
    @Override
    public boolean isIsBehavior() {
        return (Boolean) getAttVal(PortData.Metadata.IsBehaviorAtt());
    }

    @objid ("4714a453-00d4-4de5-ba29-2a7148a6e82e")
    @Override
    public void setIsBehavior(boolean value) {
        setAttVal(PortData.Metadata.IsBehaviorAtt(), value);
    }

    @objid ("efe838f0-0581-4e20-af9d-e1ade555a92c")
    @Override
    public boolean isIsService() {
        return (Boolean) getAttVal(PortData.Metadata.IsServiceAtt());
    }

    @objid ("fa09ef98-e15d-4f39-a84f-5a2eaf2a7bd3")
    @Override
    public void setIsService(boolean value) {
        setAttVal(PortData.Metadata.IsServiceAtt(), value);
    }

    @objid ("eea6e5c5-c6b4-4c38-a184-dea24412929a")
    @Override
    public boolean isIsConjugated() {
        return (Boolean) getAttVal(PortData.Metadata.IsConjugatedAtt());
    }

    @objid ("b741438e-5569-4bf4-955d-519dc3ce3fcc")
    @Override
    public void setIsConjugated(boolean value) {
        setAttVal(PortData.Metadata.IsConjugatedAtt(), value);
    }

    @objid ("0df6a04c-a7eb-494d-bfd2-c6a088c1df2d")
    @Override
    public PortOrientation getDirection() {
        return (PortOrientation) getAttVal(PortData.Metadata.DirectionAtt());
    }

    @objid ("89d1561d-9c8d-4bdc-afd1-d0cb0b8324f3")
    @Override
    public void setDirection(PortOrientation value) {
        setAttVal(PortData.Metadata.DirectionAtt(), value);
    }

    @objid ("435a3191-7e17-471b-8bf0-f8fd94e15dd7")
    @Override
    public EList<ProvidedInterface> getProvided() {
        return new SmList<>(this, PortData.Metadata.ProvidedDep());
    }

    @objid ("c5c4c004-a593-44bf-83ae-10ac2cc644a9")
    @Override
    public <T extends ProvidedInterface> List<T> getProvided(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ProvidedInterface element : getProvided()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("22a6c15e-be2a-4f35-a860-dcb627caa647")
    @Override
    public EList<RequiredInterface> getRequired() {
        return new SmList<>(this, PortData.Metadata.RequiredDep());
    }

    @objid ("ab59705e-cacc-4660-85eb-cce255605eac")
    @Override
    public <T extends RequiredInterface> List<T> getRequired(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final RequiredInterface element : getRequired()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6cc45f2b-4dcb-4730-87f8-87150b920ce7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("efe6dd8e-dc11-4a6b-bf2d-61e6827c589c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("e6f6dc97-a31a-4a3a-b3aa-72445d8baaab")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPort(this);
        else
          return null;
    }

}
