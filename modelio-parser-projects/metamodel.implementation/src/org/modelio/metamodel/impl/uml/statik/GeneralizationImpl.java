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
import org.modelio.metamodel.data.uml.statik.GeneralizationData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000cb930-c4bf-1fd8-97fe-001ec947cd2a")
public class GeneralizationImpl extends ModelElementImpl implements Generalization {
    @objid ("fbb98d2c-e155-4257-838c-75d1c44e141a")
    @Override
    public String getDiscriminator() {
        return (String) getAttVal(GeneralizationData.Metadata.DiscriminatorAtt());
    }

    @objid ("9e0186f1-6c96-433e-8cfb-c36ac202f4d9")
    @Override
    public void setDiscriminator(String value) {
        setAttVal(GeneralizationData.Metadata.DiscriminatorAtt(), value);
    }

    @objid ("ebbad82a-59a8-42d6-81b2-84dbdf288fa1")
    @Override
    public NameSpace getSuperType() {
        return (NameSpace) getDepVal(GeneralizationData.Metadata.SuperTypeDep());
    }

    @objid ("602c9292-ce8f-4e98-bf02-87d236b601b5")
    @Override
    public void setSuperType(NameSpace value) {
        appendDepVal(GeneralizationData.Metadata.SuperTypeDep(), (SmObjectImpl)value);
    }

    @objid ("5bd33493-162c-4c1d-a722-e2967b1fd4f3")
    @Override
    public NameSpace getSubType() {
        return (NameSpace) getDepVal(GeneralizationData.Metadata.SubTypeDep());
    }

    @objid ("578e9fbc-cec4-44b8-adac-10c538b24790")
    @Override
    public void setSubType(NameSpace value) {
        appendDepVal(GeneralizationData.Metadata.SubTypeDep(), (SmObjectImpl)value);
    }

    @objid ("80a2b720-058c-405f-a33a-6beeb6492e4f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralizationData.Metadata.SubTypeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("f1741b50-6771-40b7-b6a3-6700e057b490")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralizationData.Metadata.SubTypeDep());
        if (obj != null)
          return new SmDepVal(GeneralizationData.Metadata.SubTypeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("a480afa3-10e2-4969-83d0-07afd5fdf55c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGeneralization(this);
        else
          return null;
    }

}
