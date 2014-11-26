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
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

@objid ("fd26b9f8-5986-11e1-991a-001ec947ccaf")
class REFOBJState extends AbstractState {
    @objid ("fd21f69f-5986-11e1-991a-001ec947ccaf")
    @Override
    public void startElement(final String uri, final String localName, final String qName, final Attributes attrs) throws SAXException {
        if (localName.equals( "PID"))
        {
            String cuid = attrs.getValue ("uid");
            String cclassof = attrs.getValue ("mc");
            String cname = attrs.getValue ("name");
                 
            try {
                this.stateHandler.addUsedCmsNode (cclassof, cuid, cname);
            } catch (IOException e) {
                this.stateHandler.throwError(e);
            }
                 
        }
    }

    @objid ("fd21f69d-5986-11e1-991a-001ec947ccaf")
    @Override
    public void endElement(final String uri, final String localName, final String qName) throws SAXException {
        if (localName.equals( "REFOBJ"))
        {
            this.stateHandler.enterDocumentState();
        }
    }

    @objid ("fd21f601-5986-11e1-991a-001ec947ccaf")
    public REFOBJState() {
    }

}
