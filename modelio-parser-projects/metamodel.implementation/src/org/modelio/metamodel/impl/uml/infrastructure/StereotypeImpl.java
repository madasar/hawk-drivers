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
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
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

@objid ("008d5b58-c4be-1fd8-97fe-001ec947cd2a")
public class StereotypeImpl extends ModelElementImpl implements Stereotype {
    @objid ("b199cee3-7acd-4709-b1c4-bffbf275056d")
    @Override
    public ModuleComponent getModule() {
        final Profile prof = getOwner();
        return  (prof != null) ? prof.getOwnerModule() : null;
    }

    @objid ("8e88ba8a-9f51-4f22-97d1-52834f2cadb9")
    @Override
    public String getImage() {
        return (String) getAttVal(StereotypeData.Metadata.ImageAtt());
    }

    @objid ("b2b839bc-aa1a-4343-9515-d711801fde58")
    @Override
    public void setImage(String value) {
        setAttVal(StereotypeData.Metadata.ImageAtt(), value);
    }

    @objid ("21b11a21-47db-4e63-85c1-6ba327021ee1")
    @Override
    public String getIcon() {
        return (String) getAttVal(StereotypeData.Metadata.IconAtt());
    }

    @objid ("df7426f0-5925-49a9-a042-34d5159ad236")
    @Override
    public void setIcon(String value) {
        setAttVal(StereotypeData.Metadata.IconAtt(), value);
    }

    @objid ("b657f1a5-9ed6-491f-8343-dfddf7d3d553")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(StereotypeData.Metadata.IsHiddenAtt());
    }

    @objid ("7cc41af8-bae8-4c0a-bbb1-a06e4156c1d0")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(StereotypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("dc40cfe2-543c-42f0-9405-d2a714ff6f44")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(StereotypeData.Metadata.LabelKeyAtt());
    }

    @objid ("db3103d9-8a05-4b59-854b-2a8f7243a844")
    @Override
    public void setLabelKey(String value) {
        setAttVal(StereotypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("f735fb08-8418-4752-bb2d-3665a388bc4d")
    @Override
    public String getBaseClassName() {
        return (String) getAttVal(StereotypeData.Metadata.BaseClassNameAtt());
    }

    @objid ("5e2f0b56-a425-4d1c-8eba-654825a2e6ad")
    @Override
    public void setBaseClassName(String value) {
        setAttVal(StereotypeData.Metadata.BaseClassNameAtt(), value);
    }

    @objid ("6e4f0197-1423-4e5c-88e0-1adcbe7c22c6")
    @Override
    public PropertyTableDefinition getDefinedTable() {
        return (PropertyTableDefinition) getDepVal(StereotypeData.Metadata.DefinedTableDep());
    }

    @objid ("ac45c520-9f16-488e-ab6d-721522d3fa9e")
    @Override
    public void setDefinedTable(PropertyTableDefinition value) {
        appendDepVal(StereotypeData.Metadata.DefinedTableDep(), (SmObjectImpl)value);
    }

    @objid ("f7ed86b8-b896-4acd-ab1e-81cd0c13bc52")
    @Override
    public EList<ModelElement> getExtendedElement() {
        return new SmList<>(this, StereotypeData.Metadata.ExtendedElementDep());
    }

    @objid ("9392d8bb-0277-4979-a713-5dbb5a7db04d")
    @Override
    public <T extends ModelElement> List<T> getExtendedElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModelElement element : getExtendedElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("bcd4d4bb-497a-4ddf-b11a-a2085c849765")
    @Override
    public EList<ExternDocumentType> getDefinedExternDocumentType() {
        return new SmList<>(this, StereotypeData.Metadata.DefinedExternDocumentTypeDep());
    }

    @objid ("51cd8190-9deb-4683-a85e-a8a07fb6a27f")
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

    @objid ("6c502a13-1416-47f2-b0c0-64399578cd81")
    @Override
    public Profile getOwner() {
        return (Profile) getDepVal(StereotypeData.Metadata.OwnerDep());
    }

    @objid ("57f663c9-d723-493d-b212-e4c4aa5670f8")
    @Override
    public void setOwner(Profile value) {
        appendDepVal(StereotypeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("01e39da9-2635-4f25-8ed6-b3c1c56ef7ab")
    @Override
    public Stereotype getParent() {
        return (Stereotype) getDepVal(StereotypeData.Metadata.ParentDep());
    }

    @objid ("e7bd72c7-c046-4833-8d00-a17a45cedb5f")
    @Override
    public void setParent(Stereotype value) {
        appendDepVal(StereotypeData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("965ccd16-2403-48ab-9b85-1eaf404293db")
    @Override
    public EList<TagType> getDefinedTagType() {
        return new SmList<>(this, StereotypeData.Metadata.DefinedTagTypeDep());
    }

    @objid ("d4e7e3dd-c5e0-440f-a075-dfd6d23fc50a")
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

    @objid ("d7f120ca-8443-4bbd-a075-042c28dc776d")
    @Override
    public EList<Stereotype> getChild() {
        return new SmList<>(this, StereotypeData.Metadata.ChildDep());
    }

    @objid ("2c62d379-b3bb-46ff-985d-e277d3b5fb20")
    @Override
    public <T extends Stereotype> List<T> getChild(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Stereotype element : getChild()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("94718db7-42ec-4f90-8c1a-61bb5dd60a40")
    @Override
    public EList<NoteType> getDefinedNoteType() {
        return new SmList<>(this, StereotypeData.Metadata.DefinedNoteTypeDep());
    }

    @objid ("47253b60-1bfd-4643-921e-015828190db6")
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

    @objid ("4fd9a6a8-912d-4942-957b-f1ae942ff363")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StereotypeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("dbf0b787-ae7c-4585-83ac-d24477310ca5")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StereotypeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(StereotypeData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("7f51c50b-ced4-490d-b817-ce144c502723")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStereotype(this);
        else
          return null;
    }

}
