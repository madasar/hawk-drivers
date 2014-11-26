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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.interactionModel.DurationConstraintData;
import org.modelio.metamodel.impl.uml.infrastructure.ConstraintImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.DurationConstraint;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0043f6ca-c4bf-1fd8-97fe-001ec947cd2a")
public class DurationConstraintImpl extends ConstraintImpl implements DurationConstraint {
    @objid ("a9e4b646-5b23-4642-8be2-24250d61370c")
    @Override
    public String getDurationMin() {
        return (String) getAttVal(DurationConstraintData.Metadata.DurationMinAtt());
    }

    @objid ("8ef35feb-e168-4eed-99bf-f3c0a47fc97b")
    @Override
    public void setDurationMin(String value) {
        setAttVal(DurationConstraintData.Metadata.DurationMinAtt(), value);
    }

    @objid ("443be045-ef2a-492a-b684-2c9df422c14d")
    @Override
    public String getDurationMax() {
        return (String) getAttVal(DurationConstraintData.Metadata.DurationMaxAtt());
    }

    @objid ("d30a0e7e-67d7-4d0e-8321-fa16b156fa6d")
    @Override
    public void setDurationMax(String value) {
        setAttVal(DurationConstraintData.Metadata.DurationMaxAtt(), value);
    }

    @objid ("145bea11-0194-4e7f-9987-6448c0177a4c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("412d6991-fc3d-42c6-b1e8-30d696eae984")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("159dfdfe-cbf3-4168-a8cb-a046d6a530ef")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDurationConstraint(this);
        else
          return null;
    }

}
