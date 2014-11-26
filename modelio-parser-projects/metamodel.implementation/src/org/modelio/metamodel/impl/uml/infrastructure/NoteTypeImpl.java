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
import org.modelio.metamodel.data.uml.infrastructure.NoteTypeData;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008bfe5c-c4be-1fd8-97fe-001ec947cd2a")
public class NoteTypeImpl extends ModelElementImpl implements NoteType {
    @objid ("9a3d8668-3b10-405b-98a5-c33bbf1d1190")
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

    @objid ("bd4d5245-c870-47de-b8a2-b0d03e0fe614")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(NoteTypeData.Metadata.IsHiddenAtt());
    }

    @objid ("dfee18c4-073b-4299-b10e-b6aac0e82eb3")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(NoteTypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("362698d4-c72c-4727-a2f0-4165edf31d5f")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(NoteTypeData.Metadata.LabelKeyAtt());
    }

    @objid ("4b5c3c4b-0f25-4e47-bb63-c154182d3b0b")
    @Override
    public void setLabelKey(String value) {
        setAttVal(NoteTypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("641dc762-b199-426b-9f6c-e888a8cc7f57")
    @Override
    public String getMimeType() {
        return (String) getAttVal(NoteTypeData.Metadata.MimeTypeAtt());
    }

    @objid ("d93b3b40-44c5-4335-b5fd-40056ef79e88")
    @Override
    public void setMimeType(String value) {
        setAttVal(NoteTypeData.Metadata.MimeTypeAtt(), value);
    }

    @objid ("a3e090cd-b7f3-4cfa-b767-ca5e3a51a430")
    @Override
    public EList<Note> getElement() {
        return new SmList<>(this, NoteTypeData.Metadata.ElementDep());
    }

    @objid ("c2c20282-5aa4-4e7d-a7eb-aa7b0c5de095")
    @Override
    public <T extends Note> List<T> getElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Note element : getElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a5990ee2-9a28-4a5d-b31e-e874121547c3")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(NoteTypeData.Metadata.OwnerStereotypeDep());
    }

    @objid ("e817f661-4b92-485f-b6e4-2d58cdfa67b2")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(NoteTypeData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("fec6e818-5ec2-4b46-9dc1-435e1007bc81")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(NoteTypeData.Metadata.OwnerReferenceDep());
    }

    @objid ("2224780b-462f-4a86-aec1-49aadcabd06e")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(NoteTypeData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("62c1e8f0-3359-4376-9acf-8607e41f4986")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NoteTypeData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(NoteTypeData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a5ca399d-c4ce-4c4a-ac11-bbcac49021c4")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NoteTypeData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return new SmDepVal(NoteTypeData.Metadata.OwnerStereotypeDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(NoteTypeData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return new SmDepVal(NoteTypeData.Metadata.OwnerReferenceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("4030451d-93ed-4b2a-9b91-8c3ea7cc986c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNoteType(this);
        else
          return null;
    }

}
