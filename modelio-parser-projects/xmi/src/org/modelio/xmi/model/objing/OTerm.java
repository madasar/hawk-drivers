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
import org.modelio.metamodel.analyst.Term;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.XMILogs;

@objid ("73964d1a-086e-411b-83d8-cd7fbcf2aec1")
public class OTerm extends OElement implements IOElement {
    @objid ("4119c01f-b216-4960-a031-7bb7169c3a32")
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

    @objid ("476860d6-eb93-4cae-8150-b7ce1c3e80a6")
    public OTerm(Term param) {
        super(param);
    }

    @objid ("f3201f9e-35e8-47b9-90d3-69b1c704c992")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        // TODO Auto-generated method stub
    }

    @objid ("55cc4ab5-2f8d-436d-920e-8ea729072ab6")
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        // TODO Auto-generated method stub
    }

}
