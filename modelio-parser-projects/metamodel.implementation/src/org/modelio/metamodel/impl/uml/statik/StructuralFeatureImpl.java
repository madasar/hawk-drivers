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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.StructuralFeatureData;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.KindOfAccess;
import org.modelio.metamodel.uml.statik.StructuralFeature;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("001f3344-c4bf-1fd8-97fe-001ec947cd2a")
public class StructuralFeatureImpl extends FeatureImpl implements StructuralFeature {
    @objid ("0c3933a7-8bf8-4ac9-9352-0ac9202d43fa")
    @Override
    public KindOfAccess getChangeable() {
        return (KindOfAccess) getAttVal(StructuralFeatureData.Metadata.ChangeableAtt());
    }

    @objid ("bc7659b9-bc77-4507-811e-6dd28ecde793")
    @Override
    public void setChangeable(KindOfAccess value) {
        setAttVal(StructuralFeatureData.Metadata.ChangeableAtt(), value);
    }

    @objid ("3fabf035-1f55-4853-ab9c-4a08e617cd45")
    @Override
    public boolean isIsDerived() {
        return (Boolean) getAttVal(StructuralFeatureData.Metadata.IsDerivedAtt());
    }

    @objid ("bf0c1fc0-94b4-47ef-9f22-91976a2ecd4a")
    @Override
    public void setIsDerived(boolean value) {
        setAttVal(StructuralFeatureData.Metadata.IsDerivedAtt(), value);
    }

    @objid ("ad1c52d6-1fc5-472f-9741-f82c7b0ec30c")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(StructuralFeatureData.Metadata.IsOrderedAtt());
    }

    @objid ("d576c2fa-aba9-4c67-a35b-4a9f9b7fe3db")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(StructuralFeatureData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("96813071-46a4-45ed-abf3-19040309091a")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(StructuralFeatureData.Metadata.IsUniqueAtt());
    }

    @objid ("fa530500-0d48-4833-a220-14f378cc1281")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(StructuralFeatureData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("212c7f16-f09f-4f32-9395-5ead1c3df5b5")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(StructuralFeatureData.Metadata.MultiplicityMinAtt());
    }

    @objid ("4ad5da09-e101-40d3-adcd-ee4d64ef1c28")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(StructuralFeatureData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("e59ca8c0-3a1c-4051-8da8-33d801c1697a")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(StructuralFeatureData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("9cb4afd1-72c4-4478-b9ae-9a4cbbda05c8")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(StructuralFeatureData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("747ff8d4-022b-49c7-854a-f07dc9902c9b")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, StructuralFeatureData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("9a5721cd-cbb9-4a30-9c10-a7d50750c8f7")
    @Override
    public <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getRealizedInformationFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9647046c-7b39-4cde-87ff-bb543743aba0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f702f765-fb31-42a4-8704-6c1800fdc137")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("fc451ca7-4839-4b89-844b-54be3e4f8d69")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStructuralFeature(this);
        else
          return null;
    }

}
