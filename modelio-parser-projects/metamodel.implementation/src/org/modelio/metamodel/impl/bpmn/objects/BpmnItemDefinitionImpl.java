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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.objects.BpmnItemKind;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemDefinitionData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementImpl;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0007d5be-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnItemDefinitionImpl extends BpmnRootElementImpl implements BpmnItemDefinition {
    @objid ("b49618c3-089f-4015-8b49-4d13e656a0b5")
    @Override
    public BpmnItemKind getItemKind() {
        return (BpmnItemKind) getAttVal(BpmnItemDefinitionData.Metadata.ItemKindAtt());
    }

    @objid ("7d98f791-30ba-4580-87f6-44713998cabe")
    @Override
    public void setItemKind(BpmnItemKind value) {
        setAttVal(BpmnItemDefinitionData.Metadata.ItemKindAtt(), value);
    }

    @objid ("dbbdb3ae-f6a3-40ca-a146-781bc34a83a2")
    @Override
    public boolean isIsCollection() {
        return (Boolean) getAttVal(BpmnItemDefinitionData.Metadata.IsCollectionAtt());
    }

    @objid ("a122e299-4d16-42cf-98e7-bc30ed0711e0")
    @Override
    public void setIsCollection(boolean value) {
        setAttVal(BpmnItemDefinitionData.Metadata.IsCollectionAtt(), value);
    }

    @objid ("da81fcd5-8b6c-4528-8fae-ed7fdfb265ce")
    @Override
    public GeneralClass getStructureRef() {
        return (GeneralClass) getDepVal(BpmnItemDefinitionData.Metadata.StructureRefDep());
    }

    @objid ("6eb3e9c1-90d3-4559-a516-ff32c93c038b")
    @Override
    public void setStructureRef(GeneralClass value) {
        appendDepVal(BpmnItemDefinitionData.Metadata.StructureRefDep(), (SmObjectImpl)value);
    }

    @objid ("8aa7f097-706b-4335-859a-234e33454563")
    @Override
    public EList<BpmnMessage> getTypedMessage() {
        return new SmList<>(this, BpmnItemDefinitionData.Metadata.TypedMessageDep());
    }

    @objid ("347954a4-5ee5-4b17-be31-52fecfbc987c")
    @Override
    public <T extends BpmnMessage> List<T> getTypedMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnMessage element : getTypedMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c957068c-d0cd-4ccb-bf69-e24f30cbcf3b")
    @Override
    public EList<BpmnItemAwareElement> getTypedItem() {
        return new SmList<>(this, BpmnItemDefinitionData.Metadata.TypedItemDep());
    }

    @objid ("0aa22fb9-7207-44b5-966e-e024df3ab769")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getTypedItem(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnItemAwareElement element : getTypedItem()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("729d110d-ae3e-4880-bb88-0dc694a78a18")
    @Override
    public EList<BpmnResourceParameter> getTypedResourceParameter() {
        return new SmList<>(this, BpmnItemDefinitionData.Metadata.TypedResourceParameterDep());
    }

    @objid ("052111d9-a894-4693-ab40-176c15654969")
    @Override
    public <T extends BpmnResourceParameter> List<T> getTypedResourceParameter(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnResourceParameter element : getTypedResourceParameter()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a1697257-eb15-4b52-a13a-96a60fcd7a5b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3608e7c4-e5dc-4db2-bc3a-c5d4b771bff5")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("737e2373-ba7b-4718-8502-cf5c469851f5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnItemDefinition(this);
        else
          return null;
    }

}
