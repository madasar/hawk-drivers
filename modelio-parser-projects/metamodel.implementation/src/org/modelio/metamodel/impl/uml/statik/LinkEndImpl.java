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
import org.modelio.metamodel.data.uml.statik.LinkEndData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.LinkEnd;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("000ff2da-c4bf-1fd8-97fe-001ec947cd2a")
public class LinkEndImpl extends ModelElementImpl implements LinkEnd {
    /**
     * Compute the link navigation way from all roles construction.
     * @return the link navigability.
     */
    @objid ("1efdf05d-4abe-4809-a5e2-6e5cf051d3a6")
    @Override
    public boolean isNavigable() {
        return getTarget() != null;
    }

    @objid ("007a3168-2787-1080-943a-001ec947cd2a")
    @Override
    public void setNavigable(final boolean isNavigable) {
        LinkEnd opposite = getOpposite();
        boolean otherNavigable = opposite.isNavigable();
        
        // The source instance is the current source or the opposite end's target according to the old navigability
        Instance source = getSource() != null ? getSource() : opposite.getTarget();
        
        // The target instance is the opposite end's source or the current target according to the old navigability
        Instance target = opposite.getSource() != null ? opposite.getSource() : getTarget();
        
        if (isNavigable && !otherNavigable) { // THIS SIDE
            this.setSource(source);
            this.setTarget(target);
        
            opposite.setSource(null);
            opposite.setTarget(null);
        } else if (!isNavigable && otherNavigable) { // OTHER SIDE
            this.setSource(null);
            this.setTarget(null);
        
            opposite.setSource(target);
            opposite.setTarget(source);
        } else if (isNavigable && otherNavigable) { // BOTH SIDES
            this.setSource(source);
            this.setTarget(target);
        
            opposite.setSource(target);
            opposite.setTarget(source);
        } else if (!isNavigable && !otherNavigable) { // NONE
            this.setSource(source);
            this.setTarget(null);
        
            opposite.setSource(target);
            opposite.setTarget(null);
        }
    }

    @objid ("0047aacc-27d2-1080-943a-001ec947cd2a")
    @Override
    public void setTarget(final Instance value, boolean fixModel) {
        if (fixModel) {
            boolean isNavigable = isNavigable();            
        
            LinkEnd opposite = getOpposite();
            boolean otherNavigable = opposite.isNavigable();
            
            // The source instance is the current source or the opposite end's target according to the old navigability
            Instance source = getSource() != null ? getSource() : opposite.getTarget();
        
            Instance target = value;
        
            if (isNavigable && !otherNavigable) { // THIS SIDE
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(null);
                opposite.setTarget(null);
            } else if (!isNavigable && otherNavigable) { // OTHER SIDE
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(target);
                opposite.setTarget(source);
            } else if (isNavigable && otherNavigable) { // BOTH SIDES
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(target);
                opposite.setTarget(source);
            } else if (!isNavigable && !otherNavigable) { // NONE
                this.setSource(source);
                this.setTarget(target);
                
                opposite.setSource(null);
                opposite.setTarget(null);
            }
        } else {
            setTarget(value);
        }
    }

    @objid ("000aa226-27ef-1080-943a-001ec947cd2a")
    @Override
    public void setSource(final Instance value, boolean fixModel) {
        if (fixModel) {
            boolean isNavigable = isNavigable();
            
            LinkEnd opposite = getOpposite();
            boolean otherNavigable = opposite.isNavigable();
        
            Instance source = value;
        
            // The target instance is the opposite end's source or the current target according to the old navigability
            Instance target = opposite.getSource() != null ? opposite.getSource() : getTarget();
        
            if (isNavigable && !otherNavigable) { // THIS SIDE
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(null);
                opposite.setTarget(null);
            } else if (!isNavigable && otherNavigable) { // OTHER SIDE
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(target);
                opposite.setTarget(source);
            } else if (isNavigable && otherNavigable) { // BOTH SIDES
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(target);
                opposite.setTarget(source);
            } else if (!isNavigable && !otherNavigable) { // NONE
                this.setSource(source);
                this.setTarget(null);
        
                opposite.setSource(target);
                opposite.setTarget(null);
            }
        } else {
            setSource(value);
        }
    }

    @objid ("001f2be2-1a19-10a1-88a0-001ec947cd2a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        Instance src = getSource();
        if (src != null) {
            return (SmObjectImpl) src;
        } else {
            // Return the 'opposite' role only if it has a source:
            // Avoid cycle if both ends have no source.
            LinkEnd opp = getOpposite();
            if (opp != null && opp.getSource() != null)
                return (SmObjectImpl) opp;
            else
                return null;
        }
    }

    @objid ("71066600-5b42-11e2-90ce-002564c97630")
    @Override
    public List<SmObjectImpl> getCompositionChildren() {
        final List<SmObjectImpl> compositionChildren = super.getCompositionChildren();
        
        LinkEnd opp = getOpposite();
        
        // Avoid composition loops...
        if (opp != null && opp.getSource() != null) {
            // The other side has a 'strong' owner, do not return it as a child
            compositionChildren.remove(opp);
        }
        return compositionChildren;
    }

    @objid ("001f4a50-1a19-10a1-88a0-001ec947cd2a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        
        // First look for 'source'
        obj = (SmObjectImpl) getDepVal(LinkEndData.Metadata.SourceDep());
        if (obj != null) {
            return new SmDepVal(LinkEndData.Metadata.SourceDep(), obj);
        }
        
        // Return the 'opposite' role only if it has a source:
        // Avoid cycle if both ends have no source.
        LinkEnd opp = getOpposite();
        
        if (opp != null && opp.getSource() != null) {
            return new SmDepVal(LinkEndData.Metadata.OppositeOwnerDep(), opp);
        } else {
            return null;
        }
    }

    @objid ("0aed289b-c84f-4d32-9047-10a14bf76274")
    @Override
    public Instance getOwner() {
        Instance source = getSource();
        if (source != null) {
            return source;
        } else {
            LinkEnd opposite = getOpposite();
            return opposite != null ? opposite.getTarget(): null;   
        }
    }

    @objid ("891a32f4-6ac7-42a6-b286-ad0bf75273a5")
    @Override
    public void afterEraseDepVal(SmDependency dep, SmObjectImpl value) {
        super.afterEraseDepVal(dep, value);
        
        if (dep == LinkEndData.Metadata.getSourceDep()) {
            // Workaround bug where the storage handle is not updated
            LinkEnd opposite = getOpposite();
            if (opposite != null) {
                Instance src = opposite.getSource();
                if (src != null) {
                    // detach and attach again
                    opposite.setOpposite(null);
                    opposite.setSource(null);
                    opposite.setSource(src);
                    opposite.setOpposite(this);
                }
            }
        
        }
    }

    @objid ("dfce4e62-72bf-4854-aafa-65f8f970a0f5")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(LinkEndData.Metadata.IsOrderedAtt());
    }

    @objid ("136ce853-d332-4b1a-b8f3-808ad963bcf7")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(LinkEndData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("7e3ad51c-a1bd-4434-84e5-88e20d5176fe")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(LinkEndData.Metadata.IsUniqueAtt());
    }

    @objid ("0286dbbb-11a5-4684-8c7e-3c7dde9498ae")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(LinkEndData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("37997567-cdc2-4742-9c40-da71014e6f0b")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(LinkEndData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("11947113-117d-49f7-9b3f-a22253fd5191")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(LinkEndData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("0ed23346-f6be-4493-b9fb-ff29d92e4d0b")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(LinkEndData.Metadata.MultiplicityMinAtt());
    }

    @objid ("8e8cbb38-5a17-403b-b754-f040109d77dd")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(LinkEndData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("846c9083-dfec-4b2d-bd71-b0aa53bfca5b")
    @Override
    public Link getLink() {
        return (Link) getDepVal(LinkEndData.Metadata.LinkDep());
    }

    @objid ("158d36c7-d7c7-47e5-ad88-b809e386ed76")
    @Override
    public void setLink(Link value) {
        appendDepVal(LinkEndData.Metadata.LinkDep(), (SmObjectImpl)value);
    }

    @objid ("9f40455c-2140-442e-bd8c-f43436f257db")
    @Override
    public Instance getTarget() {
        return (Instance) getDepVal(LinkEndData.Metadata.TargetDep());
    }

    @objid ("e7388deb-7940-4c6f-8f90-e39a7958734a")
    @Override
    public void setTarget(Instance value) {
        appendDepVal(LinkEndData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("ee431ce6-648d-4741-9697-fb571996cc28")
    @Override
    public LinkEnd getOppositeOwner() {
        return (LinkEnd) getDepVal(LinkEndData.Metadata.OppositeOwnerDep());
    }

    @objid ("31f99c41-19e7-4d0a-a047-4fa9232279d6")
    @Override
    public void setOppositeOwner(LinkEnd value) {
        appendDepVal(LinkEndData.Metadata.OppositeOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("24366770-f533-4541-a6d6-9b40fc327f9d")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, LinkEndData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("b0593ba2-2dd4-497e-9e63-845bcb523546")
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

    @objid ("12f517d1-6658-4863-ab84-c84d9091b3ce")
    @Override
    public AssociationEnd getModel() {
        return (AssociationEnd) getDepVal(LinkEndData.Metadata.ModelDep());
    }

    @objid ("ad5fd100-06db-4268-9c70-c11e34958a0d")
    @Override
    public void setModel(AssociationEnd value) {
        appendDepVal(LinkEndData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("14471c46-3176-4928-9371-2fbd3e22fbc5")
    @Override
    public RequiredInterface getConsumer() {
        return (RequiredInterface) getDepVal(LinkEndData.Metadata.ConsumerDep());
    }

    @objid ("f830caf8-c671-45f4-a0a3-a3c3a25bb79c")
    @Override
    public void setConsumer(RequiredInterface value) {
        appendDepVal(LinkEndData.Metadata.ConsumerDep(), (SmObjectImpl)value);
    }

    @objid ("db227676-cbea-42ad-9f23-e97e32c01cbe")
    @Override
    public LinkEnd getOpposite() {
        return (LinkEnd) getDepVal(LinkEndData.Metadata.OppositeDep());
    }

    @objid ("ab13db1b-a564-4683-aabf-5a2a30d4892b")
    @Override
    public void setOpposite(LinkEnd value) {
        appendDepVal(LinkEndData.Metadata.OppositeDep(), (SmObjectImpl)value);
    }

    @objid ("0b50132b-d147-49a7-92ef-0e6ae09ef043")
    @Override
    public Instance getSource() {
        return (Instance) getDepVal(LinkEndData.Metadata.SourceDep());
    }

    @objid ("5c0e30a2-3b11-47bf-ac0b-41b73eef0ae1")
    @Override
    public void setSource(Instance value) {
        appendDepVal(LinkEndData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("35bda2ea-aee4-4535-80ac-103d61bfb02b")
    @Override
    public ProvidedInterface getProvider() {
        return (ProvidedInterface) getDepVal(LinkEndData.Metadata.ProviderDep());
    }

    @objid ("7b532df9-397d-4643-ae0a-55211cb8e978")
    @Override
    public void setProvider(ProvidedInterface value) {
        appendDepVal(LinkEndData.Metadata.ProviderDep(), (SmObjectImpl)value);
    }

    @objid ("a7ecff21-c0b4-42a0-a67f-2d455335ea20")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLinkEnd(this);
        else
          return null;
    }

}
