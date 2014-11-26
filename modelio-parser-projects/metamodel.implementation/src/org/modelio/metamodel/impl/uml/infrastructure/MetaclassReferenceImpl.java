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
import org.modelio.metamodel.data.uml.infrastructure.MetaclassReferenceData;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0091bf72-c4be-1fd8-97fe-001ec947cd2a")
public class MetaclassReferenceImpl extends ElementImpl implements MetaclassReference {
    @objid ("02fab049-a371-4be1-b085-ae6b2e30c0e8")
    @Override
    public String getReferencedClassName() {
        return (String) getAttVal(MetaclassReferenceData.Metadata.ReferencedClassNameAtt());
    }

    @objid ("a9f0d777-b272-4d1d-a775-e8138bf297b1")
    @Override
    public void setReferencedClassName(String value) {
        setAttVal(MetaclassReferenceData.Metadata.ReferencedClassNameAtt(), value);
    }

    @objid ("ec153cdc-7278-4a1f-9fe9-33ba39cdf2b7")
    @Override
    public PropertyTableDefinition getDefinedTable() {
        return (PropertyTableDefinition) getDepVal(MetaclassReferenceData.Metadata.DefinedTableDep());
    }

    @objid ("1d66a2ed-298b-41fd-adc6-38d494470bfa")
    @Override
    public void setDefinedTable(PropertyTableDefinition value) {
        appendDepVal(MetaclassReferenceData.Metadata.DefinedTableDep(), (SmObjectImpl)value);
    }

    @objid ("594a5471-7b16-4467-84e5-04dadacf13d5")
    @Override
    public EList<NoteType> getDefinedNoteType() {
        return new SmList<>(this, MetaclassReferenceData.Metadata.DefinedNoteTypeDep());
    }

    @objid ("a0eb0407-261a-4db4-80bc-40b95db59d99")
    @Override
    public <T extends NoteType> List<T> getDefinedNoteType(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NoteType element : getDefinedNoteType()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d285db7f-141b-4db6-839c-d831e7d5fd50")
    @Override
    public EList<ExternDocumentType> getDefinedExternDocumentType() {
        return new SmList<>(this, MetaclassReferenceData.Metadata.DefinedExternDocumentTypeDep());
    }

    @objid ("4d667594-3712-4199-9f51-d6b83798c136")
    @Override
    public <T extends ExternDocumentType> List<T> getDefinedExternDocumentType(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExternDocumentType element : getDefinedExternDocumentType()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4c3a7fe9-7fae-4720-8331-0073d4cc281d")
    @Override
    public Profile getOwnerProfile() {
        return (Profile) getDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep());
    }

    @objid ("2dabb988-4e17-4487-a127-f6d8166f628f")
    @Override
    public void setOwnerProfile(Profile value) {
        appendDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep(), (SmObjectImpl)value);
    }

    @objid ("c12c3461-cda0-4f96-af11-f969e8f4ac3e")
    @Override
    public EList<TagType> getDefinedTagType() {
        return new SmList<>(this, MetaclassReferenceData.Metadata.DefinedTagTypeDep());
    }

    @objid ("e25525d9-c18a-4f1c-b556-114be62b1e1e")
    @Override
    public <T extends TagType> List<T> getDefinedTagType(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TagType element : getDefinedTagType()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("af60b258-05a1-4d46-9080-510a66887ca5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e5414488-c8ad-450a-b18b-36b317bcc493")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep());
        if (obj != null)
          return new SmDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("d4ac4eb8-61ce-4769-b0b7-05001a60d91b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMetaclassReference(this);
        else
          return null;
    }

}
