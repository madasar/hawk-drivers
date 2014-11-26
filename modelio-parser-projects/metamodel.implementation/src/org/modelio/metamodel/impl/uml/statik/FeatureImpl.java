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
import org.modelio.metamodel.data.uml.statik.FeatureData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000b3ab0-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class FeatureImpl extends ModelElementImpl implements Feature {
    @objid ("f5cd3aa9-cbc0-415d-a34f-31da44f6ef74")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(FeatureData.Metadata.VisibilityAtt());
    }

    @objid ("1f803f27-7560-4458-b533-a73ae7c3f0ab")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(FeatureData.Metadata.VisibilityAtt(), value);
    }

    @objid ("bebaa602-d8ad-4a7d-92fd-06f5b06a5bea")
    @Override
    public boolean isIsClass() {
        return (Boolean) getAttVal(FeatureData.Metadata.IsClassAtt());
    }

    @objid ("a2fecd04-8027-464d-bb30-b3f1d10794cb")
    @Override
    public void setIsClass(boolean value) {
        setAttVal(FeatureData.Metadata.IsClassAtt(), value);
    }

    @objid ("d9cd3e4d-e5e7-4ea9-8f60-9bc382ba6842")
    @Override
    public boolean isIsAbstract() {
        return (Boolean) getAttVal(FeatureData.Metadata.IsAbstractAtt());
    }

    @objid ("d48f9baa-2b65-4f9f-87d8-0c98aeae6766")
    @Override
    public void setIsAbstract(boolean value) {
        setAttVal(FeatureData.Metadata.IsAbstractAtt(), value);
    }

    @objid ("f752bf3c-1511-4c31-9d15-5a260dce27e1")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("84f428fa-a818-498e-bb8b-bab6fe781c1a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("03914813-40bc-4aca-8ddb-4c43ba205911")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitFeature(this);
        else
          return null;
    }

}
