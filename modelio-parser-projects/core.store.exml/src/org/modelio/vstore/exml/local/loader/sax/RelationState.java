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
                                    

package org.modelio.vstore.exml.local.loader.sax;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.model.DuplicateObjectException;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vstore.exml.common.model.IllegalReferenceException;
import org.modelio.vstore.exml.common.model.ObjId;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Read 'COMP' and 'LINK' tags.
 */
@objid ("2afeb991-3faf-11e2-87cb-001ec947ccaf")
class RelationState extends AbstractState {
    @objid ("2b011b93-3faf-11e2-87cb-001ec947ccaf")
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (localName) {
        case TAG_COMP:
        case TAG_LINK:
        case TAG_EXTDEP:
            getDataModel().getCurrent().updateCurrentDependency();
            this.stateHandler.enterOBJECTState();
            break;
        default:
            break;
        }
    }

    @objid ("2afeb993-3faf-11e2-87cb-001ec947ccaf")
    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        try {
            ObjId objid;
            SmObjectImpl obj;
            switch (localName) {
            case TAG_COMPID:
                objid = readID(atts);
                if (objid != null) {
                    obj = getDataModel().loadHelper.getObject(objid);
                    if (obj == null)
                        obj = getDataModel().loadHelper.getRefObject(getDataModel().modelLoader, objid, objid);
        
                    if (obj != null)
                        getDataModel().getCurrent().addToDep(obj);
                }
        
        
                break;
            case TAG_REFOBJ:
                this.stateHandler.enterREFOBJState();
                break;
            case TAG_ID:
            case TAG_FOREIGNID:
                objid = readID(atts);
                if (objid != null)
                    getDataModel().addDepForeignObj(objid);
                break;
            case TAG_OBJECT:
                getDataModel().getCurrent().setCurrentState(this);
                this.stateHandler.enterOBJECTState();
                break;
            default:
                throwInvalidTag(localName);
        
            }
        } catch (DuplicateObjectException e) {
            rethrowException(e);
        } catch (RuntimeException e) {
            rethrowException(e);
        } catch (IllegalReferenceException e) {
            // TODO: Don't know whether to throw a warning or a fatal error.
            this.stateHandler.warning(new SAXParseException(e.getLocalizedMessage(), this.stateHandler.getLocator(), e));
        }
    }

}
