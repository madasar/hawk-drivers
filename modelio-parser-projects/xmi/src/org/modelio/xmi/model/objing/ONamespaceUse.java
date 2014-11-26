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
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.XMILogs;

@objid ("505eff8e-b21b-4869-8386-999b1c769d4c")
public class ONamespaceUse extends OElement implements IOElement {
    @objid ("5681ad1f-3767-486c-9f05-0d5b792bbda2")
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

    @objid ("c6eaf605-760d-493e-8234-04e88a9051b5")
    public ONamespaceUse(NamespaceUse param) {
        super(param);
    }

    @objid ("cf42f9f2-244f-4d66-afd4-8ed465a6a29f")
    public List<String> getEcoreClassName() {
        return new ArrayList<String>();
    }

    @objid ("446404b8-a73a-4b98-9947-059f3e9012dc")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        // TODO Auto-generated method stub
    }

    @objid ("377fe4b1-f775-4c31-8d6c-6a8d29c4f540")
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        // TODO Auto-generated method stub
    }

}
