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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.SubstitutionData;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008e0fa8-c4be-1fd8-97fe-001ec947cd2a")
public class SubstitutionImpl extends ModelElementImpl implements Substitution {
    @objid ("b06ec165-7496-446d-a173-09157c895e53")
    @Override
    public Classifier getContract() {
        return (Classifier) getDepVal(SubstitutionData.Metadata.ContractDep());
    }

    @objid ("7b4dfe99-3b40-4b3e-a6fc-3af3502143b6")
    @Override
    public void setContract(Classifier value) {
        appendDepVal(SubstitutionData.Metadata.ContractDep(), (SmObjectImpl)value);
    }

    @objid ("06ac6b95-b7e7-4a91-bdea-d2b263ed1572")
    @Override
    public Classifier getSubstitutingClassifier() {
        return (Classifier) getDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep());
    }

    @objid ("cf86f487-419a-4a0b-ae99-642120dde893")
    @Override
    public void setSubstitutingClassifier(Classifier value) {
        appendDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep(), (SmObjectImpl)value);
    }

    @objid ("69c7b2c9-91c5-4ec8-ac4a-e770a9b812ce")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ca81eb6f-80ef-45c1-8c3f-b8fb839c1e05")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep());
        if (obj != null)
          return new SmDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c6dcceb3-3023-4594-8481-2aff2f624d7b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitSubstitution(this);
        else
          return null;
    }

}
