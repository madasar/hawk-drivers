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

import java.io.IOException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.xml.sax.SAXException;

@objid ("fd26b9f9-5986-11e1-991a-001ec947ccaf")
class EXTIDState extends AbstractState {
    @objid ("fd21f6af-5986-11e1-991a-001ec947ccaf")
    public void enterState(final org.xml.sax.Attributes attributes) throws SAXException {
        String cuid = attributes.getValue ("uid");
        String cclassof = attributes.getValue ("mc");
        String cname = attributes.getValue ("name");
                 
        try {
            this.stateHandler.addUsedCmsNode (cclassof, cuid, cname);
        } catch (IOException e) {
            this.stateHandler.throwError(e);
        }
    }

    @objid ("fd21f675-5986-11e1-991a-001ec947ccaf")
    @Override
    public void endElement(final String uri, final String localName, final String qName) throws SAXException {
        if (localName.equals("EXTID"))
        {
            this.stateHandler.enterDocumentState();
        }
    }

}
