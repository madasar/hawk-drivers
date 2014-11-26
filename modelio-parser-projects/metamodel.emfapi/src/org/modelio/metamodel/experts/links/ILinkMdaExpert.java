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
                                    

package org.modelio.metamodel.experts.links;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("6282decf-c308-441c-86bc-ba4161cb8bd9")
public interface ILinkMdaExpert {
    /**
     * Tells whether a link can have the given source.
     * @param stereotype The stereotype of the link.
     * @param link The link to test.
     * @param from The source of the link element.
     * @return true if the source is accepted, else false.
     */
    @objid ("2030b705-9158-47bb-a99a-4a7d2447d178")
    boolean canSource(Stereotype stereotype, MClass link, MClass from);

    /**
     * /**
     * Tells whether a link can have the given target.
     * @param stereotype The stereotype of the link.
     * @param link The link to test.
     * @param from The target of the link element.
     * @return true if the target is accepted, else false.
     */
    @objid ("a1811d9d-44cd-4046-8f49-aeb34804c2c8")
    boolean canTarget(Stereotype stereotype, MClass link, MClass from);

    /**
     * Tells whether a stereotyped link can have the given source, destination and owner.
     * @param owner The optional owner of the link element. Used for link that have a specific owner.
     * @param stereotypedLink the stereotype put on the link to check.
     * @param link the link to check.
     * @param from The source of the link element.
     * @param to The target of the link element.
     * @return true if the link can be created, else false.
     */
    @objid ("d3264d95-eb9b-4ff2-b6ab-2663f3172b89")
    boolean canLink(Stereotype stereotypedLink, MClass link, MObject from, MObject to);

}
