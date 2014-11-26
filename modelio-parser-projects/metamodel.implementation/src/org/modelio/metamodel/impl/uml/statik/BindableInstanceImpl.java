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
import org.modelio.metamodel.data.uml.statik.BindableInstanceData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0000df02-c4bf-1fd8-97fe-001ec947cd2a")
public class BindableInstanceImpl extends InstanceImpl implements BindableInstance {
    @objid ("eb218aba-b683-4dde-96c1-66218554e92c")
    @Override
    public Instance getCluster() {
        return (Instance) getDepVal(BindableInstanceData.Metadata.ClusterDep());
    }

    @objid ("55807826-c914-4d1a-9b32-956c47eba634")
    @Override
    public void setCluster(Instance value) {
        appendDepVal(BindableInstanceData.Metadata.ClusterDep(), (SmObjectImpl)value);
    }

    @objid ("f26fcbd1-545e-49a8-bda6-ccfdb907e97d")
    @Override
    public Classifier getInternalOwner() {
        return (Classifier) getDepVal(BindableInstanceData.Metadata.InternalOwnerDep());
    }

    @objid ("64062f6c-1289-4848-b29d-faed8db2f7af")
    @Override
    public void setInternalOwner(Classifier value) {
        appendDepVal(BindableInstanceData.Metadata.InternalOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("eb8c8e94-d020-4955-b085-6eed0bf119db")
    @Override
    public EList<Binding> getRepresentation() {
        return new SmList<>(this, BindableInstanceData.Metadata.RepresentationDep());
    }

    @objid ("469a4903-ca7c-4582-a475-acd4e762b1c0")
    @Override
    public <T extends Binding> List<T> getRepresentation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Binding element : getRepresentation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0195c3e5-d480-426a-8d8c-e3da92e8d983")
    @Override
    public ModelElement getRepresentedFeature() {
        return (ModelElement) getDepVal(BindableInstanceData.Metadata.RepresentedFeatureDep());
    }

    @objid ("032137f1-aa99-422a-9601-106184bfbe01")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(BindableInstanceData.Metadata.RepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("4085c400-87e4-41b5-aed3-2aaef237e732")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BindableInstanceData.Metadata.ClusterDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BindableInstanceData.Metadata.InternalOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("1efa1c4f-d7cd-4b98-b193-1d755e51100e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BindableInstanceData.Metadata.ClusterDep());
        if (obj != null)
          return new SmDepVal(BindableInstanceData.Metadata.ClusterDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BindableInstanceData.Metadata.InternalOwnerDep());
        if (obj != null)
          return new SmDepVal(BindableInstanceData.Metadata.InternalOwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e001cdde-25b3-4a46-ade8-dd5368746220")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBindableInstance(this);
        else
          return null;
    }

}
