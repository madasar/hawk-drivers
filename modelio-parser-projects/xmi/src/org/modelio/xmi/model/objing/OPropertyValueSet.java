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
                                    

package org.modelio.xmi.model.objing;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.XMILogs;

@objid ("394c7463-a3a1-4f91-b12e-8369e524bd1a")
public class OPropertyValueSet extends OElement implements IOElement {
    @objid ("5f9499af-539e-4d5e-ae93-2905358868ff")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        // TODO Auto-generated method stub
        String metaClassName = this.getClass().getSimpleName();
        // String packagingStr = "org.modelio.xmi.model.objing";
        metaClassName = metaClassName.substring(1);
                
        XMILogs.getInstance().writelnInLog(
                Xmi.I18N.getMessage("logFile.warning.elementNotMapped",
                        metaClassName));
        return null;
    }

    @objid ("3a12af86-b197-4a01-bed2-94e53be5cc76")
    public OPropertyValueSet(AnalystPropertyTable param) {
        super(param);
    }

    @objid ("929b0979-02fc-4614-b3cb-d109bd418fa5")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        // TODO Auto-generated method stub
    }

    @objid ("2ccbb91f-ba43-479d-accb-2ed7445fdc42")
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        // TODO Auto-generated method stub
    }

}
