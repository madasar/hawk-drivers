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
import org.modelio.metamodel.data.uml.statik.NamespaceUseData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00126858-c4bf-1fd8-97fe-001ec947cd2a")
public class NamespaceUseImpl extends ElementImpl implements NamespaceUse {
    @objid ("d0d1659b-cd34-4719-bae3-2bc92e89fd2e")
    @Override
    public NameSpace getUser() {
        return (NameSpace) getDepVal(NamespaceUseData.Metadata.UserDep());
    }

    @objid ("8b1863ce-2594-4115-be0f-c1a89d5766be")
    @Override
    public void setUser(NameSpace value) {
        appendDepVal(NamespaceUseData.Metadata.UserDep(), (SmObjectImpl)value);
    }

    @objid ("82815ec2-eff6-433e-ba0e-0120243c1adb")
    @Override
    public NameSpace getUsed() {
        return (NameSpace) getDepVal(NamespaceUseData.Metadata.UsedDep());
    }

    @objid ("4c5a4d9f-55f0-4846-b1f5-ecd57ac102d4")
    @Override
    public void setUsed(NameSpace value) {
        appendDepVal(NamespaceUseData.Metadata.UsedDep(), (SmObjectImpl)value);
    }

    @objid ("bc3ab6cb-9403-4e7e-8748-7a5aff622940")
    @Override
    public EList<Element> getCause() {
        return new SmList<>(this, NamespaceUseData.Metadata.CauseDep());
    }

    @objid ("d03927f6-8ff5-4720-854b-0e6fd1390592")
    @Override
    public <T extends Element> List<T> getCause(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Element element : getCause()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4fa4ce12-9c01-4b59-b3ea-c0fceac0e583")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("c64ad4e3-9142-4dd5-b685-52060a2e4e7d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("3e2d3bc7-8447-4fd2-a52f-cc03bfb3b8f3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNamespaceUse(this);
        else
          return null;
    }

}
