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
                                    

package org.modelio.metamodel.control;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class is registering synchronous checkers for SmDependencies, like ModelTree.Owner.
 */
@objid ("006320b8-5404-1fdf-a6ee-001ec947cd2a")
public class ControlRegistry {
    /**
     * Register all checkers on the metamodel.
     */
    @objid ("0063296e-5404-1fdf-a6ee-001ec947cd2a")
    public static final void registerCheckers() {
        new AttributeTypeChecker().register();
        new BindableInstanceInternalOwnerChecker().register();
        new ConnectorEndRepresentedFeatureChecker().register();
        new CollaborationUseNRepresentedChecker().register();
        new ExternDocumentSubjectChecker().register();
        new InstanceOwnerChecker().register();
        new InterfaceRealizationImplementerChecker().register();
        new NoteSubjectChecker().register();
        new ModelTreeOwnerChecker().register();
        new ParameterTypeChecker().register();
        new RaisedExceptionThrownTypeChecker().register();
        new StereotypeExtendedElementChecker().register();
        new TaggedValueAnnotedChecker().register();
        new TemplateBindingBoundElementChecker().register();
        new TemplateParameterParametrizedChecker().register();
    }

}
