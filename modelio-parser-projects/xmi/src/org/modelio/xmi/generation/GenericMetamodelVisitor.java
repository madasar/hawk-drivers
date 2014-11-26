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
                                    

package org.modelio.xmi.generation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;

@objid ("a8c2821f-d60f-45a4-a9d3-430c89b43668")
public class GenericMetamodelVisitor extends OwnershipMetamodelVisitor {
    @objid ("93971a58-734a-49b3-9db5-7a6f73154ab2")
    public GenericMetamodelVisitor() {
        super();
    }

    @objid ("ea226d44-d9f4-4552-a084-cc51f938be3a")
    public GenericMetamodelVisitor(IParseModelBehavior behavior) {
        super(behavior);
    }

    @objid ("992d7e4d-3f77-42a2-914a-dd9b4c129160")
    @Override
    public Object visitAssociationEnd(final AssociationEnd param) {
        Object lObject = super.visitAssociationEnd(param);
        if ( param.getAssociation() != null)
            param.getAssociation().accept(this);
        return lObject;
    }

    @objid ("c0b4f475-5a1a-44c6-98b7-fd86c0bcce20")
    @Override
    public Object visitModelElement(final ModelElement param) {
        Object lObject = super.visitModelElement(param);
        for (Constraint constraint : param.getConstraintDefinition()) {
            constraint.accept(this);
        }
        return lObject;
    }

    @objid ("1f2806d8-f7e7-403e-916e-8f0d265f2488")
    @Override
    public Object visitUseCase(final UseCase param) {
        Object lObject = super.visitUseCase(param);
        for (UseCaseDependency dep : param.getUsed()) {
            dep.accept(this);
        }
        return lObject;
    }

    @objid ("4c73ff64-8190-4db8-9aed-ff441c14dd35")
    @Override
    public Object visitNaryAssociationEnd(final NaryAssociationEnd param) {
        Object lObject = super.visitNaryAssociationEnd(param);
        param.getNaryAssociation().accept(this);
        return lObject;
    }

}
