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
import org.modelio.metamodel.data.uml.statik.NaryLinkEndData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0075d726-17e8-10a1-88a0-001ec947cd2a")
public class NaryLinkEndImpl extends ModelElementImpl implements NaryLinkEnd {
    @objid ("4bc0ee45-c192-4dd0-b588-0c7c264629f2")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(NaryLinkEndData.Metadata.IsOrderedAtt());
    }

    @objid ("881ffb80-be62-4c52-91b8-3dd6a0956e8b")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(NaryLinkEndData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("c992e272-3c8d-4a38-b4cb-c65eb302e533")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(NaryLinkEndData.Metadata.IsUniqueAtt());
    }

    @objid ("f5b7df01-5c94-4736-a54e-6e11b25e2f46")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(NaryLinkEndData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("b456bed2-9921-4e08-b903-01798174a9fc")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(NaryLinkEndData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("4524fd30-a025-498f-9a1e-e78418e0823b")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(NaryLinkEndData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("f48fbf0c-3c43-464d-9c92-c3ee47449936")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(NaryLinkEndData.Metadata.MultiplicityMinAtt());
    }

    @objid ("e183545f-ce59-441e-8730-9ea6bb796efc")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(NaryLinkEndData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("cc90ec9f-1d2b-4fdb-bdfc-98cde0c64d77")
    @Override
    public Instance getSource() {
        return (Instance) getDepVal(NaryLinkEndData.Metadata.SourceDep());
    }

    @objid ("afd3c092-0db9-4585-81de-b74fceb64d65")
    @Override
    public void setSource(Instance value) {
        appendDepVal(NaryLinkEndData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("a9922243-5aaf-4cdd-8370-6cbabfef605d")
    @Override
    public NaryLink getNaryLink() {
        return (NaryLink) getDepVal(NaryLinkEndData.Metadata.NaryLinkDep());
    }

    @objid ("4c7b3a1a-2756-470d-af51-f8be6cc9a455")
    @Override
    public void setNaryLink(NaryLink value) {
        appendDepVal(NaryLinkEndData.Metadata.NaryLinkDep(), (SmObjectImpl)value);
    }

    @objid ("38014b50-8e21-49e3-9ff0-23f4d795ec4b")
    @Override
    public RequiredInterface getConsumer() {
        return (RequiredInterface) getDepVal(NaryLinkEndData.Metadata.ConsumerDep());
    }

    @objid ("cbf4a31c-870c-42e4-8ab6-dd6504c0b607")
    @Override
    public void setConsumer(RequiredInterface value) {
        appendDepVal(NaryLinkEndData.Metadata.ConsumerDep(), (SmObjectImpl)value);
    }

    @objid ("4ffdb745-7d87-4e15-850a-484308b625e7")
    @Override
    public ProvidedInterface getProvider() {
        return (ProvidedInterface) getDepVal(NaryLinkEndData.Metadata.ProviderDep());
    }

    @objid ("6ca14982-e9fd-4be1-8313-a9d11d2f01a0")
    @Override
    public void setProvider(ProvidedInterface value) {
        appendDepVal(NaryLinkEndData.Metadata.ProviderDep(), (SmObjectImpl)value);
    }

    @objid ("3017dcb1-88b3-406e-9a80-be16f900faff")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NaryLinkEndData.Metadata.SourceDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(NaryLinkEndData.Metadata.NaryLinkDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("633f20c1-38e3-4ea3-92dd-4ff5dc2b1d9d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NaryLinkEndData.Metadata.SourceDep());
        if (obj != null)
          return new SmDepVal(NaryLinkEndData.Metadata.SourceDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(NaryLinkEndData.Metadata.NaryLinkDep());
        if (obj != null)
          return new SmDepVal(NaryLinkEndData.Metadata.NaryLinkDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("4a022f0e-15b6-42b3-a199-ee096374d47f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryLinkEnd(this);
        else
          return null;
    }

}
