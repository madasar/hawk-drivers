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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.data.analyst.TermData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00626cea-c4bf-1fd8-97fe-001ec947cd2a")
public class TermImpl extends AnalystElementImpl implements Term {
    @objid ("dfda0961-610c-411e-8f6e-bd6aa2f66b51")
    @Override
    public AnalystElement getLastVersion() {
        return getLastTermVersion();
    }

    @objid ("cb871d96-685b-4442-a852-fcdb8bad9e04")
    @Override
    public EList<? extends AnalystElement> getArchivedVersions() {
        return getArchivedTermVersion();
    }

    @objid ("33ca6082-292b-49eb-94ef-deb77f082d37")
    @Override
    public Dictionary getOwnerDictionary() {
        return (Dictionary) getDepVal(TermData.Metadata.OwnerDictionaryDep());
    }

    @objid ("49b2a634-aa14-4c61-97a8-3376da6c7ac4")
    @Override
    public void setOwnerDictionary(Dictionary value) {
        appendDepVal(TermData.Metadata.OwnerDictionaryDep(), (SmObjectImpl)value);
    }

    @objid ("5e47d165-f591-45a2-a433-de34cf0d0cee")
    @Override
    public EList<Term> getArchivedTermVersion() {
        return new SmList<>(this, TermData.Metadata.ArchivedTermVersionDep());
    }

    @objid ("0d939f00-daf0-4a5e-95ab-8315276e3737")
    @Override
    public <T extends Term> List<T> getArchivedTermVersion(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Term element : getArchivedTermVersion()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("130d903f-96d6-436f-98ab-770065589ea8")
    @Override
    public Term getLastTermVersion() {
        return (Term) getDepVal(TermData.Metadata.LastTermVersionDep());
    }

    @objid ("523b26e1-c6fa-49b4-a2aa-e168b5ff32f2")
    @Override
    public void setLastTermVersion(Term value) {
        appendDepVal(TermData.Metadata.LastTermVersionDep(), (SmObjectImpl)value);
    }

    @objid ("53dac9d2-9db0-48d5-994a-b20a6ee7489e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TermData.Metadata.OwnerDictionaryDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(TermData.Metadata.LastTermVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("4e005300-6289-43dd-a53d-d82967bd7fce")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TermData.Metadata.OwnerDictionaryDep());
        if (obj != null)
          return new SmDepVal(TermData.Metadata.OwnerDictionaryDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(TermData.Metadata.LastTermVersionDep());
        if (obj != null)
          return new SmDepVal(TermData.Metadata.LastTermVersionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("223f35f5-8351-418a-be94-33beae900dbb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTerm(this);
        else
          return null;
    }

}
