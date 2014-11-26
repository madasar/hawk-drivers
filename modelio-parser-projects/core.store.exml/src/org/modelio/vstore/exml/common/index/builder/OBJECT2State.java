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
                                    

package org.modelio.vstore.exml.common.index.builder;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.xml.sax.SAXException;

@objid ("fd26b9f7-5986-11e1-991a-001ec947ccaf")
class OBJECT2State extends AbstractState {
    @objid ("fd21f690-5986-11e1-991a-001ec947ccaf")
    @Override
    public void startElement(final String uri, final String localName, final String qName, final org.xml.sax.Attributes attributes) throws SAXException {
        if (localName.equals( "OBJECT"))
        {
            this.stateHandler.enterOBJECTState();
        }
    }

    @objid ("fd21f68f-5986-11e1-991a-001ec947ccaf")
    public OBJECT2State() {
    }

}
