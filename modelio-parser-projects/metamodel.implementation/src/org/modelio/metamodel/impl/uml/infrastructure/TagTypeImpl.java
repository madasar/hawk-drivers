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
import org.modelio.metamodel.data.uml.infrastructure.TagTypeData;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008f82a2-c4be-1fd8-97fe-001ec947cd2a")
public class TagTypeImpl extends ModelElementImpl implements TagType {
    @objid ("4f878b82-ac7e-4905-8a2e-40fc613813ee")
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

    @objid ("e78ccaaf-5241-46c2-b738-7a938a228ccd")
    @Override
    public String getParamNumber() {
        return (String) getAttVal(TagTypeData.Metadata.ParamNumberAtt());
    }

    @objid ("5166b496-1d6d-4eb7-889c-196b74662ede")
    @Override
    public void setParamNumber(String value) {
        setAttVal(TagTypeData.Metadata.ParamNumberAtt(), value);
    }

    @objid ("d7700044-4615-41d5-aa24-00406bd910c0")
    @Override
    public boolean isIsQualified() {
        return (Boolean) getAttVal(TagTypeData.Metadata.IsQualifiedAtt());
    }

    @objid ("39eb253e-b9e1-4171-a809-714f3c90f380")
    @Override
    public void setIsQualified(boolean value) {
        setAttVal(TagTypeData.Metadata.IsQualifiedAtt(), value);
    }

    @objid ("d86e416c-bb6a-4e9c-abdf-f2f858e79f95")
    @Override
    public boolean isBelongToPrototype() {
        return (Boolean) getAttVal(TagTypeData.Metadata.BelongToPrototypeAtt());
    }

    @objid ("2bd1813d-32d4-4b13-9f42-8bb0474bc3b6")
    @Override
    public void setBelongToPrototype(boolean value) {
        setAttVal(TagTypeData.Metadata.BelongToPrototypeAtt(), value);
    }

    @objid ("5cf1c2d2-0c8c-458c-bfaa-305d74c17edb")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(TagTypeData.Metadata.IsHiddenAtt());
    }

    @objid ("a5538d53-7516-45ce-acfb-fb6018a56012")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(TagTypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("42faffbc-2ad3-40a2-b5b1-27a3319d7ea0")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(TagTypeData.Metadata.LabelKeyAtt());
    }

    @objid ("de3254fa-31e4-4ac2-b4db-66f19b2c8920")
    @Override
    public void setLabelKey(String value) {
        setAttVal(TagTypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("53052c8c-5249-4101-878f-da5947edf221")
    @Override
    public EList<TaggedValue> getTagOccurence() {
        return new SmList<>(this, TagTypeData.Metadata.TagOccurenceDep());
    }

    @objid ("9098b93a-c9a1-47d9-85ac-1e20ae72de4d")
    @Override
    public <T extends TaggedValue> List<T> getTagOccurence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TaggedValue element : getTagOccurence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d7ee1657-0ff1-4ceb-a98e-16342f50a297")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(TagTypeData.Metadata.OwnerStereotypeDep());
    }

    @objid ("dc2e127b-d3c4-4f1b-8833-bf2ae86b1498")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(TagTypeData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("4536bac6-0a14-40d2-97eb-3d5097cf2529")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(TagTypeData.Metadata.OwnerReferenceDep());
    }

    @objid ("a7c389d0-c3c0-470c-b9de-43aedc0c8c1d")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(TagTypeData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("231209e6-418b-4a4e-b8a8-0af6ee11bed7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TagTypeData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(TagTypeData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("70703caf-4375-431d-b6c3-bbc48d2ef40b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TagTypeData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return new SmDepVal(TagTypeData.Metadata.OwnerStereotypeDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(TagTypeData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return new SmDepVal(TagTypeData.Metadata.OwnerReferenceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("5d044153-47e9-49d1-9bb1-2fe05b3ea199")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTagType(this);
        else
          return null;
    }

}
