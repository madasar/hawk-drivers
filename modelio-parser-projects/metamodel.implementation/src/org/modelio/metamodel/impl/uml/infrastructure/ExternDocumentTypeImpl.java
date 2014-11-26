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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.ExternDocumentTypeData;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("009339f6-c4be-1fd8-97fe-001ec947cd2a")
public class ExternDocumentTypeImpl extends ModelElementImpl implements ExternDocumentType {
    @objid ("f9337a44-b3be-45b9-9f22-cc4ed1552af0")
    @Override
    public ModuleComponent getModule() {
        MetaclassReference ref = getOwnerReference();
        Stereotype st = getOwnerStereotype();
        
        if (ref != null && ref.getOwnerProfile() != null) {
            return ref.getOwnerProfile().getOwnerModule();
        } else if (st != null && st.getOwner() != null) {
            return st.getOwner().getOwnerModule();
        } else
            return null;
    }

    @objid ("ab44c276-b562-4ee5-baf2-b203a16e34f6")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(ExternDocumentTypeData.Metadata.IsHiddenAtt());
    }

    @objid ("f64a9156-2539-4514-b83c-57ac34835639")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(ExternDocumentTypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("6258eb3f-4bfe-49c2-aafe-554310e370d7")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(ExternDocumentTypeData.Metadata.LabelKeyAtt());
    }

    @objid ("11f9e36c-02b7-4f23-a228-3814a827d986")
    @Override
    public void setLabelKey(String value) {
        setAttVal(ExternDocumentTypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("5a466d93-4729-4c8b-916d-497a39acd767")
    @Override
    public String getIcon() {
        return (String) getAttVal(ExternDocumentTypeData.Metadata.IconAtt());
    }

    @objid ("34d6b34e-05e7-4f5e-8dd8-26440bbf3f46")
    @Override
    public void setIcon(String value) {
        setAttVal(ExternDocumentTypeData.Metadata.IconAtt(), value);
    }

    @objid ("a86b300a-3e69-41c2-a502-e0015d20d082")
    @Override
    public String getImage() {
        return (String) getAttVal(ExternDocumentTypeData.Metadata.ImageAtt());
    }

    @objid ("ce5e6740-776f-4d37-8321-4b79c4e861cc")
    @Override
    public void setImage(String value) {
        setAttVal(ExternDocumentTypeData.Metadata.ImageAtt(), value);
    }

    @objid ("5729b26c-f370-4abd-8688-2e80979c23f3")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(ExternDocumentTypeData.Metadata.OwnerStereotypeDep());
    }

    @objid ("a95f9289-4d7a-4bc9-b14f-046a9b62fb3e")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(ExternDocumentTypeData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("8a9e8c5a-fe1f-4e1c-833b-850745ac1809")
    @Override
    public EList<ExternDocument> getTypedDoc() {
        return new SmList<>(this, ExternDocumentTypeData.Metadata.TypedDocDep());
    }

    @objid ("3d02bdd4-d18d-4801-859a-884d947d21ca")
    @Override
    public <T extends ExternDocument> List<T> getTypedDoc(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExternDocument element : getTypedDoc()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f2e5c379-c8ab-4d16-aef5-fa64fea7f62a")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(ExternDocumentTypeData.Metadata.OwnerReferenceDep());
    }

    @objid ("b9a7d799-17f3-4f17-acf6-522e62ae5329")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(ExternDocumentTypeData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("022c2f90-9673-4079-8ba4-088fc29c0634")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentTypeData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentTypeData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("03762d97-16a2-4f1c-8f6c-928d4794431c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentTypeData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return new SmDepVal(ExternDocumentTypeData.Metadata.OwnerStereotypeDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentTypeData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return new SmDepVal(ExternDocumentTypeData.Metadata.OwnerReferenceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("930f3158-1691-4055-8cb3-c6cdc58ef851")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExternDocumentType(this);
        else
          return null;
    }

}
