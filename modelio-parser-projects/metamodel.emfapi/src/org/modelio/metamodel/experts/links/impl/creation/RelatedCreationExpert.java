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

@objid ("feff15c4-f5b7-433d-af2a-6e7dc36ec36c")
public class RelatedCreationExpert extends DefaultLinkExpert {
    @objid ("631ddd79-6f71-4243-9e16-3cebacb2cfd5")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        return ((fromElement instanceof BusinessRule) &&
                (toElement instanceof BusinessRule)) ||
                ((fromElement instanceof Term) &&
                        (toElement instanceof Term));
    }

    @objid ("5a27b568-e175-4f41-a17f-30dadbda6ee8")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        return (fromMetaclass.hasBase(Metamodel.getMClass(BusinessRule.class)) && toMetaclass.hasBase(Metamodel.getMClass(BusinessRule.class))) ||
                (fromMetaclass.hasBase(Metamodel.getMClass(Term.class)) && toMetaclass.hasBase(Metamodel.getMClass(Term.class)));
    }

    @objid ("e3802328-a135-4610-bfb2-8aa62f6f2dc4")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return ((fromElement instanceof BusinessRule)) ||
                ((fromElement instanceof Term));
    }

    @objid ("35900275-5d57-4d55-abf6-2b3661a68f9e")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(BusinessRule.class)) ||
                fromMetaclass.hasBase(Metamodel.getMClass(Term.class));
    }

}
