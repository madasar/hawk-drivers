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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.ComponentRealizationData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.ComponentRealization;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("ea0e67c5-5b02-447c-aae3-d3ef908c1f2a")
public class ComponentRealizationImpl extends ModelElementImpl implements ComponentRealization {
    @objid ("54e5ab01-82e4-4ced-b49a-e7d8e38555b8")
    @Override
    public Classifier getRealizingClassifier() {
        return (Classifier) getDepVal(ComponentRealizationData.Metadata.RealizingClassifierDep());
    }

    @objid ("f641d41e-df74-4d65-8f54-503cb2cbab7e")
    @Override
    public void setRealizingClassifier(Classifier value) {
        appendDepVal(ComponentRealizationData.Metadata.RealizingClassifierDep(), (SmObjectImpl)value);
    }

    @objid ("450a0762-bf20-4f23-b070-27f079b0a59c")
    @Override
    public Component getAbstraction() {
        return (Component) getDepVal(ComponentRealizationData.Metadata.AbstractionDep());
    }

    @objid ("16db38d9-04ce-48c1-8363-39863334dde3")
    @Override
    public void setAbstraction(Component value) {
        appendDepVal(ComponentRealizationData.Metadata.AbstractionDep(), (SmObjectImpl)value);
    }

    @objid ("ee8506bc-5d9d-4a89-af42-e2e1571f031a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ComponentRealizationData.Metadata.AbstractionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("553c5aff-1adc-49fc-a881-add35b1df24a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ComponentRealizationData.Metadata.AbstractionDep());
        if (obj != null)
          return new SmDepVal(ComponentRealizationData.Metadata.AbstractionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("bba370a5-a1ed-4b74-abaa-e61cd6645017")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitComponentRealization(this);
        else
          return null;
    }

}
