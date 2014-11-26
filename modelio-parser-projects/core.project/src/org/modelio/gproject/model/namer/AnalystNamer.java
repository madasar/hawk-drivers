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
                                    

package org.modelio.gproject.model.namer;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.model.IElementNamer;
import org.modelio.gproject.model.namer.helpers.GetSiblingsVisitor;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This visitor tries to compute a 'smart' name. For example, it builds REQ7 for a requirement in a container where other
 * requirements are REQ1,REQ2,REQ3,REQ4,REQ5,REQ6
 * 
 * @author phv
 */
@objid ("02a07aa3-c434-402a-919b-1c8a5c43c76c")
class AnalystNamer implements IElementNamer {
    @objid ("18021b7a-16d5-4819-90ae-722cc79d8db0")
    private static final String PATTERN = "(\\D+)(\\d+)";

    @objid ("e24d4f17-e991-4673-b3ce-8b200bf74673")
    private Pattern pattern = Pattern.compile(PATTERN);

    @objid ("2ae6ddfc-1bf5-452b-ae53-58911b402542")
    public AnalystNamer() {
        // nothing to do
    }

    /**
     * Algorithm:
     * <ol>
     * <li>the brothers of the new element are checked agains'st a regexp for being in the form XXXXDDD</li>
     * <li>if all brothers match, the maximum value for DDD is kept and incremented</li>
     * <li>the returned new identifier is build as XXXXDDD+1
     * </ol>
     */
    @objid ("0d07e0e0-80c3-44c4-a061-99749c3cb2a3")
    private String computeSmartName(String prefix, MObject obj, Set<String> siblings) {
        int index = 0;
        
        for (String s : siblings) {
            Matcher x = this.pattern.matcher(s);
            if (x.matches()) {
                int siblingIndex = Integer.parseInt(x.group(2));
                if (siblingIndex > index) {
                    index = siblingIndex;
                    prefix = x.group(1);
                }
        
            } else {
                // no general pattern
                return null;
            }
        }
        return index > 0 ? (prefix + Integer.toString(index + 1)) : prefix;
    }

    @objid ("9ba2565f-ee16-48b5-82e8-357642e624e2")
    @Override
    public String getBaseName(MClass metaclass) {
        return new BasicNamer().getBaseName(metaclass);
    }

    @objid ("2da86578-6c6d-410d-afec-922a0f657d99")
    @Override
    public String getBaseName(MObject object) {
        return new BasicNamer().getBaseName(object);
    }

    @objid ("6b8c3790-bbb8-4030-a486-bdcd79a55aee")
    @Override
    public String getUniqueName(MObject object) {
        return getUniqueName(getBaseName(object), object);
    }

    @objid ("3a833b07-009a-476c-b035-b806a5984b8f")
    @Override
    public String getUniqueName(String basename, MObject object) {
        if ((object instanceof AnalystElement)) { // Keep the code rock solid whatever object is passed
            // Compute siblings
            Set<String> siblings = new GetSiblingsVisitor().getSiblings((Element) object);
            String smartName = computeSmartName(basename, object, siblings);
            if (smartName != null)
                return smartName;
        }
        // if reached, use the BasicNamer() as a fallback solution
        return new BasicNamer().getUniqueName(basename, object);
    }

}
