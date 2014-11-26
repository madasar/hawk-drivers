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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.analyst.Term;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("a3a9a06f-48e6-44ea-b27c-a3c5fee107ab")
public class RefersCreationExpert extends DefaultLinkExpert {
    @objid ("334d2f8c-30bf-41b1-9ffa-243f3881c4c4")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        return (fromElement instanceof BusinessRule) &&
               (toElement instanceof Term);
    }

    @objid ("2c5a8a45-67d6-4faf-a861-a4e0d485cc11")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(BusinessRule.class)) &&
               toMetaclass.hasBase(Metamodel.getMClass(Term.class));
    }

    @objid ("a6bf4f8d-8d5a-407b-a09a-dacb17d72a9e")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return (fromElement instanceof BusinessRule);
    }

    @objid ("eeb55baf-b85d-4c22-b92b-dcf2c774b737")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(BusinessRule.class));
    }

}
