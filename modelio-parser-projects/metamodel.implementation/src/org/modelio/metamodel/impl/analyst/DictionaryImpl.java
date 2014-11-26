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
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.data.analyst.DictionaryData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("005bc1ec-c4bf-1fd8-97fe-001ec947cd2a")
public class DictionaryImpl extends AnalystContainerImpl implements Dictionary {
    @objid ("3b444988-66c3-40ad-81ed-a6541c0eb7b6")
    @Override
    public EList<Dictionary> getOwnedDictionary() {
        return new SmList<>(this, DictionaryData.Metadata.OwnedDictionaryDep());
    }

    @objid ("4ccf25fe-4967-420c-852d-b85666493917")
    @Override
    public <T extends Dictionary> List<T> getOwnedDictionary(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Dictionary element : getOwnedDictionary()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("175913b4-19b3-4dd3-937e-59e7ed4677b7")
    @Override
    public Dictionary getOwnerDictionary() {
        return (Dictionary) getDepVal(DictionaryData.Metadata.OwnerDictionaryDep());
    }

    @objid ("e559085f-e859-49df-8b35-d438b19a9c8c")
    @Override
    public void setOwnerDictionary(Dictionary value) {
        appendDepVal(DictionaryData.Metadata.OwnerDictionaryDep(), (SmObjectImpl)value);
    }

    @objid ("1a003ae0-8eac-41c8-98c8-9c70765b5d4b")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(DictionaryData.Metadata.OwnerProjectDep());
    }

    @objid ("8c7bd9ce-6ce1-4625-a21c-08c876722392")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(DictionaryData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("d60054e3-11a9-40bd-9b21-f93bbe0a1696")
    @Override
    public EList<Term> getOwnedTerm() {
        return new SmList<>(this, DictionaryData.Metadata.OwnedTermDep());
    }

    @objid ("805bdf7a-8c3d-4bbe-9299-2be6524980ec")
    @Override
    public <T extends Term> List<T> getOwnedTerm(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Term element : getOwnedTerm()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5eb05d2a-4a45-4f03-bf11-8bb416351699")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DictionaryData.Metadata.OwnerDictionaryDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(DictionaryData.Metadata.OwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("dca5c370-d758-447a-aa2d-9396bbfe77cd")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DictionaryData.Metadata.OwnerDictionaryDep());
        if (obj != null)
          return new SmDepVal(DictionaryData.Metadata.OwnerDictionaryDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(DictionaryData.Metadata.OwnerProjectDep());
        if (obj != null)
          return new SmDepVal(DictionaryData.Metadata.OwnerProjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("51ed3c20-8536-415b-a4b2-6e5ed4d72352")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDictionary(this);
        else
          return null;
    }

}
