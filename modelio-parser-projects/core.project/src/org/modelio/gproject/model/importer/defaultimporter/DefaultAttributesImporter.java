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
                                    

package org.modelio.gproject.model.importer.defaultimporter;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.model.importer.core.IAttributesImporter;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007b0412-d3aa-108f-8d81-001ec947cd2a")
public class DefaultAttributesImporter implements IAttributesImporter {
    @objid ("007b14de-d3aa-108f-8d81-001ec947cd2a")
    @Override
    public void importAttributes(final SmObjectImpl refObject, SmObjectImpl localObject) {
        SmClass cls = (SmClass) localObject.getMClass();
        
        for (SmAttribute attr : cls.getAllAttDef()) {
            if (attr.getName().equals("Uuid")) {
                // Ignore the Uuid
            } else {
                Object oldVal = localObject.getAttVal(attr);
                Object newVal = refObject.getAttVal(attr);
                if (oldVal != newVal) {
                    localObject.setAttVal(attr, newVal);
                }
            }
        }
    }

}
