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
                                    

package org.modelio.metamodel.experts.meta.impl;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.behavior.interactionModel.PartDecomposition;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Custom expert enforcing the following rule:
 * - It is not possible to add a PartDecomposition when a Lifeline already has one.
 */
@objid ("6345f879-e5d1-41b7-8d86-e6fa5e83c449")
public class PartDecompositionCreationExpert extends DefaultMetaExpert {
    @objid ("63966836-3c83-4256-aef3-8280e204634c")
    @Override
    public boolean canCompose(MObject owner, MClass composed, String dep) {
        if ((dep == null || "DecomposedAs".equals(dep)) && owner instanceof Lifeline && (composed == Metamodel.getMClass(PartDecomposition.class))) {
            return ((Lifeline)owner).getDecomposedAs() == null;
        }
        return super.canCompose(owner, composed, dep);
    }

    @objid ("a347cad3-a6d6-4794-bf25-77780c51c42a")
    @Override
    public boolean canCompose(MObject owner, MObject composed, String dep) {
        if ((dep == null || "DecomposedAs".equals(dep)) && owner instanceof Lifeline && (composed.getMClass() == Metamodel.getMClass(PartDecomposition.class))) {
            return ((Lifeline)owner).getDecomposedAs() == null;
        }
        return super.canCompose(owner, composed, dep);
    }

}
