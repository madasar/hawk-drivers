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

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.XMILogs;

@objid ("1ae7cab2-13df-4fef-9253-094a915ba9c7")
public class ODictionary extends OElement implements IOElement {
    @objid ("0e7b4223-6fe2-405e-9de1-712dc195802a")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        String metaClassName = this.getClass().getSimpleName();
        metaClassName = metaClassName.substring(1);
                
        XMILogs.getInstance().writelnInLog(
                Xmi.I18N.getMessage("logFile.warning.elementNotMapped",
                        metaClassName));
        return null;
    }

    @objid ("ba286581-c209-4f31-a6b1-631d0066f808")
    public ODictionary(Dictionary param) {
        super(param);
    }

    @objid ("7b0120c5-63e6-4a0d-ac20-41c449145d7d")
    public List<String> getEcoreClassName() {
        return new ArrayList<String>();
    }

    @objid ("78ee27e7-a909-4bd8-80eb-44d2c4d863dc")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        // TODO Auto-generated method stub
    }

    @objid ("6797ebdf-ee15-4760-9798-95835f80b8bf")
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        // TODO Auto-generated method stub
    }

}
