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

/**
 * Parses the first found ID tag to record a contained object
 * Parses the first PID tag, to record the parent CMS node.
 * 
 * then switches to the {@link OBJECT2State}.
 */
@objid ("fd26b9fa-5986-11e1-991a-001ec947ccaf")
class OBJECTState extends AbstractState {
    @objid ("fd21f6b9-5986-11e1-991a-001ec947ccaf")
    @Override
    public void startElement(final String uri, final String localName, final String qName, final Attributes attrs) throws SAXException {
        if (localName.equals( "ID"))
        {
            String cuid = attrs.getValue ("uid");
            String cclassof = attrs.getValue ("mc");
            String cname = attrs.getValue ("name");
        
            try {
                this.stateHandler.addContainedObject (cclassof, cuid, cname);
            } catch (IOException e) {
                this.stateHandler.throwError(e);
            }
        }
        else if (localName.equals( "PID"))
        {
            String cuid = attrs.getValue ("uid");
            String cclassof = attrs.getValue ("mc");
            String cname = attrs.getValue ("name");
        
            try {
                // Called for all PID found but the handler will remeber
                // only the first call.
                this.stateHandler.setParent (cclassof, cuid, cname);
            } catch (IOException e) {
                this.stateHandler.throwError(e);
            }
        }
    }

    @objid ("fd21f6b7-5986-11e1-991a-001ec947ccaf")
    @Override
    public void endElement(final String uri, final String localName, final String qName) throws SAXException {
        if (localName.equals("PID"))
        {
            this.stateHandler.enterOBJECT2State();
        }
    }

    @objid ("fd21f6b4-5986-11e1-991a-001ec947ccaf")
    public OBJECTState() {
    }

}
