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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixValueDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("2fb6d68e-b51f-429d-a006-2a9a07892168")
public class MatrixValueDefinitionImpl extends ElementImpl implements MatrixValueDefinition {
    @objid ("4f5f4c39-3ba1-4e68-8bb8-ed6f1a15f631")
    @Override
    public ExternProcessor getProcessor() {
        return (ExternProcessor) getDepVal(MatrixValueDefinitionData.Metadata.ProcessorDep());
    }

    @objid ("d5f07a53-12ec-48ab-9ad9-14116e106420")
    @Override
    public void setProcessor(ExternProcessor value) {
        appendDepVal(MatrixValueDefinitionData.Metadata.ProcessorDep(), (SmObjectImpl)value);
    }

    @objid ("f31cd5cb-39ac-4403-82b9-205e878f3a5e")
    @Override
    public PropertyTable getParameters() {
        return (PropertyTable) getDepVal(MatrixValueDefinitionData.Metadata.ParametersDep());
    }

    @objid ("3a7a0b92-ea32-4bbe-9332-a6515947562b")
    @Override
    public void setParameters(PropertyTable value) {
        appendDepVal(MatrixValueDefinitionData.Metadata.ParametersDep(), (SmObjectImpl)value);
    }

    @objid ("7be4c81d-884b-45a0-96d6-a5b147198d63")
    @Override
    public MatrixDefinition getMatrix() {
        return (MatrixDefinition) getDepVal(MatrixValueDefinitionData.Metadata.MatrixDep());
    }

    @objid ("44b2d89a-d99e-43dc-b886-05fb5f6bffe5")
    @Override
    public void setMatrix(MatrixDefinition value) {
        appendDepVal(MatrixValueDefinitionData.Metadata.MatrixDep(), (SmObjectImpl)value);
    }

    @objid ("2cb5079f-fab8-4ef3-9ede-d0b358ce62c1")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MatrixValueDefinitionData.Metadata.MatrixDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("2d390b8b-d68d-408b-b17f-5b0f1eff9661")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MatrixValueDefinitionData.Metadata.MatrixDep());
        if (obj != null)
          return new SmDepVal(MatrixValueDefinitionData.Metadata.MatrixDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("bd24c10c-b617-4676-91ca-11792760da8f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMatrixValueDefinition(this);
        else
          return null;
    }

}
