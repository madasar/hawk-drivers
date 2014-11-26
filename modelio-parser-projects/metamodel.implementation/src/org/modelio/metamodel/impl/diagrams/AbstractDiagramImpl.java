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
package org.modelio.metamodel.impl.diagrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.diagrams.AbstractDiagramData;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00675638-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class AbstractDiagramImpl extends ModelElementImpl implements AbstractDiagram {
    @objid ("2858a067-3986-4df6-9c4d-11095257ef2f")
    @Override
    public int getUiDataVersion() {
        return (Integer) getAttVal(AbstractDiagramData.Metadata.UiDataVersionAtt());
    }

    @objid ("f923915a-edcd-44c5-ab0b-ff3a0c0fa204")
    @Override
    public void setUiDataVersion(int value) {
        setAttVal(AbstractDiagramData.Metadata.UiDataVersionAtt(), value);
    }

    @objid ("31711902-b866-4b3b-9503-c6c2615ef82d")
    @Override
    public String getUiData() {
        return (String) getAttVal(AbstractDiagramData.Metadata.UiDataAtt());
    }

    @objid ("baefb61c-46ca-4bde-aa04-3d0182487cd5")
    @Override
    public void setUiData(String value) {
        setAttVal(AbstractDiagramData.Metadata.UiDataAtt(), value);
    }

    @objid ("58d1e50e-6cc7-4687-a4c9-165e22fbf4e5")
    @Override
    public String getPdeProperties() {
        return (String) getAttVal(AbstractDiagramData.Metadata.PdePropertiesAtt());
    }

    @objid ("75d98656-1b4f-4f21-827c-c2e2cfe5da04")
    @Override
    public void setPdeProperties(String value) {
        setAttVal(AbstractDiagramData.Metadata.PdePropertiesAtt(), value);
    }

    @objid ("3fbbe0ba-3b32-464f-a997-b35cabc40551")
    @Override
    public ModelElement getOrigin() {
        return (ModelElement) getDepVal(AbstractDiagramData.Metadata.OriginDep());
    }

    @objid ("ff0e5ac3-8e65-4e8f-b635-ebc118c4e7f7")
    @Override
    public void setOrigin(ModelElement value) {
        appendDepVal(AbstractDiagramData.Metadata.OriginDep(), (SmObjectImpl)value);
    }

    @objid ("1227bb30-29e2-4c39-9b79-f19d1a21024b")
    @Override
    public EList<Element> getRepresented() {
        return new SmList<>(this, AbstractDiagramData.Metadata.RepresentedDep());
    }

    @objid ("50e7d900-a4b1-4adf-b5e4-499997a17749")
    @Override
    public <T extends Element> List<T> getRepresented(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Element element : getRepresented()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("233013fd-ab9e-45bf-9d6b-a3585d24129e")
    @Override
    public EList<DiagramSet> getReferencingSet() {
        return new SmList<>(this, AbstractDiagramData.Metadata.ReferencingSetDep());
    }

    @objid ("b14480ca-f986-4554-995d-00c33ba1a1a0")
    @Override
    public <T extends DiagramSet> List<T> getReferencingSet(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final DiagramSet element : getReferencingSet()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("945a0989-cc44-4b5e-994b-baebc295a479")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AbstractDiagramData.Metadata.OriginDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("76e73933-536a-4cbb-b574-84eb9098506e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AbstractDiagramData.Metadata.OriginDep());
        if (obj != null)
          return new SmDepVal(AbstractDiagramData.Metadata.OriginDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("68a425f0-399e-4a36-9d8d-bc3c4afc2c3d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAbstractDiagram(this);
        else
          return null;
    }

}
