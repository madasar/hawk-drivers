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

/**
 * First state of the document.
 * <p>
 * Parses the content of the DEPS tag.
 * Switches to {@link OBJECTState} when finding the first OBJECT tag.
 */
@objid ("fd26b9fb-5986-11e1-991a-001ec947ccaf")
class DocumentState extends AbstractState {
    @objid ("fd21f6c6-5986-11e1-991a-001ec947ccaf")
    public DocumentState() {
    }

    @objid ("fd21f6c2-5986-11e1-991a-001ec947ccaf")
    @Override
    public void startElement(final String uri, final String localName, final String qName, final org.xml.sax.Attributes attrs) throws SAXException {
        if (localName.equals( "ID"))
        {
            // Read the CMS node
            String cuid = attrs.getValue ("uid");
            String cclassof = attrs.getValue ("mc");
            String cname = attrs.getValue ("name");
        
            try {
                this.stateHandler.setCmsNode (cclassof, cuid, cname);
            } catch (IOException e) {
                this.stateHandler.throwError(e);
            }
        
        }
        else if (localName.equals( "EXTID"))
        {
            this.stateHandler.enterEXTIDState(attrs);
        }
        else if (localName.equals( "FOREIGNID"))
        {
            String cuid = attrs.getValue ("uid");
            String cclassof = attrs.getValue ("mc");
            String cname = attrs.getValue ("name");
                     
            try {
                this.stateHandler.addForeignObject (cclassof, cuid, cname);
            } catch (IOException e) {
                this.stateHandler.throwError(e);
            }
        }
        else if (localName.equals( "REFOBJ"))
        {
            this.stateHandler.enterREFOBJState();
        }
        else if (localName.equals( "OBJECT"))
        {
            this.stateHandler.enterOBJECTState();
        }
    }

}
