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
                                    

package org.modelio.metamodel.experts.links.impl.creation;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Creation expert for {@link ClassAssociation}.
 * <p>
 * ClassAssociation must go from an Association to a Classifier. The Class must not be one of the Association ends.
 */
@objid ("7e99a2e8-1eb2-11e2-8009-002564c97630")
public class ClassAssociationCreationExpert extends DefaultLinkExpert {
    @objid ("7e99a2ed-1eb2-11e2-8009-002564c97630")
    @Override
    public boolean canSource(final MClass link, final MClass fromMetaclass) {
        return AssociationEnd.class.isAssignableFrom(Metamodel.getJavaInterface(fromMetaclass)) ||  NaryAssociation.class.isAssignableFrom(Metamodel.getJavaInterface(fromMetaclass));
    }

    @objid ("7e9c03f8-1eb2-11e2-8009-002564c97630")
    @Override
    public boolean canSource(final MObject from, final MObject owner) {
        if (from instanceof AssociationEnd) {
            if (((AssociationEnd)from).getAssociation().getLinkToClass() != null) {
                return false;
            }
            return true;
        } else if (from instanceof NaryAssociation) {
            if (((NaryAssociation)from).getLinkToClass() != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    @objid ("7e9c0401-1eb2-11e2-8009-002564c97630")
    @Override
    public boolean canLink(final MClass link, final MObject from, final MObject to) {
        List<Classifier> linkedElements = new ArrayList<>();
        // ClassAssociation must go from an Association to a Classifier.
        if (from instanceof AssociationEnd) {
            final AssociationEnd fromEnd = (AssociationEnd)from;
            if (fromEnd.getAssociation().getLinkToClass() != null) {
                return false;
            }
            linkedElements.add(fromEnd.getOwner());
            linkedElements.add(fromEnd.getOpposite().getOwner());
        } else if (from instanceof NaryAssociation) {
            final NaryAssociation fromNary = (NaryAssociation)from;
            if (fromNary.getLinkToClass() != null) {
                return false;
            }
            for(NaryAssociationEnd end : fromNary.getNaryEnd()) {
                linkedElements.add(end.getOwner());
            }
        }
        if (!(to instanceof Class)) {
            return false;
        } else {
            return !linkedElements.contains(to);
        }
    }

}
