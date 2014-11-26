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
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("ce758e96-007e-4b95-9c1f-1964de5db680")
public class MatrixDefinitionImpl extends ModelElementImpl implements MatrixDefinition {
    @objid ("de91f04d-db61-4db4-b24b-71bc7b1dc327")
    @Override
    public QueryDefinition getLinesDefinition() {
        return (QueryDefinition) getDepVal(MatrixDefinitionData.Metadata.LinesDefinitionDep());
    }

    @objid ("49672c97-6776-4bbd-833b-0dd33311eadc")
    @Override
    public void setLinesDefinition(QueryDefinition value) {
        appendDepVal(MatrixDefinitionData.Metadata.LinesDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("a0ed79b1-fa3e-46b8-9bd2-737555d8737e")
    @Override
    public QueryDefinition getColumnsDefinition() {
        return (QueryDefinition) getDepVal(MatrixDefinitionData.Metadata.ColumnsDefinitionDep());
    }

    @objid ("62ecb45e-e417-4ec2-9e42-8a5b1124f57a")
    @Override
    public void setColumnsDefinition(QueryDefinition value) {
        appendDepVal(MatrixDefinitionData.Metadata.ColumnsDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("98f6cf76-73ba-4822-9c03-bf161ad39fda")
    @Override
    public MatrixValueDefinition getValuesDefinition() {
        return (MatrixValueDefinition) getDepVal(MatrixDefinitionData.Metadata.ValuesDefinitionDep());
    }

    @objid ("018c4ec1-341a-47c5-826c-bd2696606869")
    @Override
    public void setValuesDefinition(MatrixValueDefinition value) {
        appendDepVal(MatrixDefinitionData.Metadata.ValuesDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("4e60e81b-9828-464d-9f95-85e363a2e56a")
    @Override
    public QueryDefinition getDepthDefinition() {
        return (QueryDefinition) getDepVal(MatrixDefinitionData.Metadata.DepthDefinitionDep());
    }

    @objid ("5a534b46-c796-49c2-a7f9-5ca4607fc598")
    @Override
    public void setDepthDefinition(QueryDefinition value) {
        appendDepVal(MatrixDefinitionData.Metadata.DepthDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("c78eefe7-2de4-4024-bf51-d60e7b9e11f3")
    @Override
    public ModelElement getOwner() {
        return (ModelElement) getDepVal(MatrixDefinitionData.Metadata.OwnerDep());
    }

    @objid ("ca351839-bc31-4f0d-a8bf-f1d5ddd6885b")
    @Override
    public void setOwner(ModelElement value) {
        appendDepVal(MatrixDefinitionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("6df9b5d4-1134-4c20-b3e0-0cce4b916361")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MatrixDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("931bc102-771f-4490-9ab9-456a4640d4b3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MatrixDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(MatrixDefinitionData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("83309c7d-b8d0-42d3-97ac-8a40c4e19c1f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMatrixDefinition(this);
        else
          return null;
    }

}
