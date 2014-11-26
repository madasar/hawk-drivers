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
import org.modelio.metamodel.data.uml.statik.LinkData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("01170c7c-f6f1-4d69-b50e-5f5e0b067212")
public class LinkImpl extends ModelElementImpl implements Link {
    @objid ("8a613814-6158-4adc-a1ab-5dac81598ce7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        for (SmObjectImpl obj : this.getDepValList(LinkData.Metadata.LinkEndDep())) {
            return obj;
        }
        return super.getCompositionOwner();
    }

    @objid ("4fb95fb2-6b47-4648-9ee9-8381d233fe17")
    @Override
    public SmDepVal getCompositionRelation() {
        for (SmObjectImpl obj : this.getDepValList(LinkData.Metadata.LinkEndDep())) 
          return new SmDepVal(LinkData.Metadata.LinkEndDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("74f99276-7264-4308-ad8d-1300bab74311")
    @Override
    public Association getModel() {
        return (Association) getDepVal(LinkData.Metadata.ModelDep());
    }

    @objid ("9079693e-571b-4e42-b48a-9577ef8b83c5")
    @Override
    public void setModel(Association value) {
        appendDepVal(LinkData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("ee9b5261-b381-4805-be86-0bcd65d321b7")
    @Override
    public EList<LinkEnd> getLinkEnd() {
        return new SmList<>(this, LinkData.Metadata.LinkEndDep());
    }

    @objid ("7ab06fc9-19dd-4fe6-a84c-ee2d35d81d2a")
    @Override
    public <T extends LinkEnd> List<T> getLinkEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final LinkEnd element : getLinkEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e095979b-1c33-4419-a0c8-2435a7e2f31d")
    @Override
    public CommunicationChannel getSent() {
        return (CommunicationChannel) getDepVal(LinkData.Metadata.SentDep());
    }

    @objid ("2f71ff4e-c4a9-4c9a-b76e-1a12bc024e04")
    @Override
    public void setSent(CommunicationChannel value) {
        appendDepVal(LinkData.Metadata.SentDep(), (SmObjectImpl)value);
    }

    @objid ("47859d6c-7d30-40b8-b50c-cef42228e84b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLink(this);
        else
          return null;
    }

}
