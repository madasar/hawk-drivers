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
package org.modelio.metamodel.impl.uml.infrastructure.matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.matrix.QueryDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("e5225255-1ebe-40cd-bc3d-6cd038eb4046")
public class QueryDefinitionImpl extends ElementImpl implements QueryDefinition {
    @objid ("670d4fe6-f7e8-45ff-94a9-1b58c34304bf")
    @Override
    public boolean isUsingAdditions() {
        return (Boolean) getAttVal(QueryDefinitionData.Metadata.UsingAdditionsAtt());
    }

    @objid ("ca6a44ca-61f3-4d17-a135-730fe6d61988")
    @Override
    public void setUsingAdditions(boolean value) {
        setAttVal(QueryDefinitionData.Metadata.UsingAdditionsAtt(), value);
    }

    @objid ("53cd3b88-f51a-4bbe-8d3d-981eb91a49bd")
    @Override
    public EList<Element> getAdded() {
        return new SmList<>(this, QueryDefinitionData.Metadata.AddedDep());
    }

    @objid ("d5fa1178-7f69-4e45-8485-75c94936a9e4")
    @Override
    public <T extends Element> List<T> getAdded(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Element element : getAdded()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("046e5285-38c0-4afa-a117-b4ff21130a71")
    @Override
    public ExternProcessor getProcessor() {
        return (ExternProcessor) getDepVal(QueryDefinitionData.Metadata.ProcessorDep());
    }

    @objid ("cb5e1a16-64c3-4623-b501-a7b7a637526a")
    @Override
    public void setProcessor(ExternProcessor value) {
        appendDepVal(QueryDefinitionData.Metadata.ProcessorDep(), (SmObjectImpl)value);
    }

    @objid ("40983811-4edf-4ecb-801b-3d873bf139cd")
    @Override
    public PropertyTable getParameters() {
        return (PropertyTable) getDepVal(QueryDefinitionData.Metadata.ParametersDep());
    }

    @objid ("493f0d75-2970-4f85-a951-5436d55b10a1")
    @Override
    public void setParameters(PropertyTable value) {
        appendDepVal(QueryDefinitionData.Metadata.ParametersDep(), (SmObjectImpl)value);
    }

    @objid ("20998e8e-0607-493b-aa57-2a34543c61c4")
    @Override
    public MatrixDefinition getOwnerAsLine() {
        return (MatrixDefinition) getDepVal(QueryDefinitionData.Metadata.OwnerAsLineDep());
    }

    @objid ("029228fe-c9ad-43ac-b6b6-461f307c8b30")
    @Override
    public void setOwnerAsLine(MatrixDefinition value) {
        appendDepVal(QueryDefinitionData.Metadata.OwnerAsLineDep(), (SmObjectImpl)value);
    }

    @objid ("14b08e01-02da-44ca-bdb2-345bb1b01632")
    @Override
    public MatrixDefinition getOwnerAsCol() {
        return (MatrixDefinition) getDepVal(QueryDefinitionData.Metadata.OwnerAsColDep());
    }

    @objid ("e38ac9b2-59cb-4cec-9192-98b0e103f2db")
    @Override
    public void setOwnerAsCol(MatrixDefinition value) {
        appendDepVal(QueryDefinitionData.Metadata.OwnerAsColDep(), (SmObjectImpl)value);
    }

    @objid ("225d73c5-0287-4e38-8813-64444f8dc27e")
    @Override
    public MatrixDefinition getOwnerAsDepth() {
        return (MatrixDefinition) getDepVal(QueryDefinitionData.Metadata.OwnerAsDepthDep());
    }

    @objid ("f77e0cd0-ed6f-47fa-91d8-125a33d4b2f4")
    @Override
    public void setOwnerAsDepth(MatrixDefinition value) {
        appendDepVal(QueryDefinitionData.Metadata.OwnerAsDepthDep(), (SmObjectImpl)value);
    }

    @objid ("db2ddde9-037c-4040-8899-9b0969932ba3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(QueryDefinitionData.Metadata.OwnerAsLineDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(QueryDefinitionData.Metadata.OwnerAsColDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(QueryDefinitionData.Metadata.OwnerAsDepthDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("5832e8a6-b50f-4b50-997b-eba899bf591d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(QueryDefinitionData.Metadata.OwnerAsLineDep());
        if (obj != null)
          return new SmDepVal(QueryDefinitionData.Metadata.OwnerAsLineDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(QueryDefinitionData.Metadata.OwnerAsColDep());
        if (obj != null)
          return new SmDepVal(QueryDefinitionData.Metadata.OwnerAsColDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(QueryDefinitionData.Metadata.OwnerAsDepthDep());
        if (obj != null)
          return new SmDepVal(QueryDefinitionData.Metadata.OwnerAsDepthDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("83aeafa0-9d0c-4904-aa77-011d34d43b76")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitQueryDefinition(this);
        else
          return null;
    }

}
