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
                                    

package org.modelio.vstore.exml.versioned.load.sax.local;

import java.text.MessageFormat;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vstore.exml.common.model.ExmlTags;
import org.modelio.vstore.exml.common.model.ObjId;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

@objid ("b5c32b95-3fbb-11e2-87cb-001ec947ccaf")
abstract class AbstractState implements ExmlTags {
    @objid ("b5c32bb4-3fbb-11e2-87cb-001ec947ccaf")
    protected DocumentContentHandler stateHandler;

    @objid ("b5c32b9a-3fbb-11e2-87cb-001ec947ccaf")
    protected AbstractState() {
    }

    /**
     * Receive notification of character data inside an element.
     * 
     * <p>By default, do nothing.  Application writers may override this
     * method to take specific actions for each chunk of character data
     * (such as adding the data to a node or buffer, or printing it to
     * a file).</p>
     * @see org.xml.sax.ContentHandler#characters
     * @param chars The characters.
     * @param start The start position in the character array.
     * @param length The number of characters to use from the
     * character array.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     * wrapping another exception.
     */
    @objid ("b5c32ba6-3fbb-11e2-87cb-001ec947ccaf")
    public void characters(final char[] chars, final int start, final int length) throws SAXException {
        // do nothing by default
    }

    /**
     * Receive notification of the end of an element.
     * 
     * <p>By default, do nothing.  Application writers may override this
     * method in a subclass to take specific actions at the end of
     * each element (such as finalising a tree node or writing
     * output to a file).</p>
     * @see org.xml.sax.ContentHandler#endElement
     * @param uri The Namespace URI, or the empty string if the
     * element has no Namespace URI or if Namespace
     * processing is not being performed.
     * @param localName The local name (without prefix), or the
     * empty string if Namespace processing is not being
     * performed.
     * @param qName The qualified name (with prefix), or the
     * empty string if qualified names are not available.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     * wrapping another exception.
     */
    @objid ("b5c32bb8-3fbb-11e2-87cb-001ec947ccaf")
    public void endElement(final String uri, final String localName, final String qName) throws SAXException {
        // do nothing by default
    }

    /**
     * Receive notification of the start of an element.
     * 
     * <p>By default, do nothing.  Application writers may override this
     * method in a subclass to take specific actions at the start of
     * each element (such as allocating a new tree node or writing
     * output to a file).</p>
     * @see org.xml.sax.ContentHandler#startElement
     * @param uri The Namespace URI, or the empty string if the
     * element has no Namespace URI or if Namespace
     * processing is not being performed.
     * @param localName The local name (without prefix), or the
     * empty string if Namespace processing is not being
     * performed.
     * @param qName The qualified name (with prefix), or the
     * empty string if qualified names are not available.
     * @param attrs The attributes attached to the element.  If
     * there are no attributes, it shall be an empty
     * Attributes object.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     * wrapping another exception.
     */
    @objid ("b5c32b9b-3fbb-11e2-87cb-001ec947ccaf")
    public void startElement(final String uri, final String localName, final String qName, final Attributes attrs) throws SAXException {
        // do nothing by default
    }

    @objid ("b5c32bcf-3fbb-11e2-87cb-001ec947ccaf")
    @Override
    public String toString() {
        return getClass().getSimpleName()+ " state";
    }

    /**
     * Initialize the state handler.
     * @param value the state handler.
     */
    @objid ("b5c32b6c-3fbb-11e2-87cb-001ec947ccaf")
    void setStateHandler(final DocumentContentHandler value) {
        this.stateHandler = value;
    }

    /**
     * Get the data model.
     * @return the data model
     */
    @objid ("b5c32b96-3fbb-11e2-87cb-001ec947ccaf")
    protected final LocalDataModel getDataModel() {
        return this.stateHandler.getDataModel();
    }

    @objid ("b5c32bc6-3fbb-11e2-87cb-001ec947ccaf")
    protected final ObjId readID(Attributes att) {
        final String xname = att.getValue(ATT_ID_NAME);
        final String xclassof = att.getValue(ATT_ID_MC);
        final String xuid = att.getValue(ATT_ID_UID);
        
        SmClass classof = SmClass.getClass(xclassof);
        if (classof == null) {
            getDataModel();
            classof = LocalDataModel.convertObsoleteClass(xclassof);
        }
        
        if (classof == null) {
            //TODO remake message
            String msg = MessageFormat.format("''{2}'' {0} {1} : Unknown {0} metaclass.",
                    xclassof, xuid, xname);
        
            this.stateHandler.warning(new SAXParseException(msg, this.stateHandler.getLocator()));
            return null;
        }
        return new ObjId (classof, xname, UUID.fromString(xuid));
    }

    /**
     * Embeds the {@link Exception} in a {@link SAXParseException} and throw it.
     * @param e the exception.
     * @throws org.xml.sax.SAXParseException the encapsulating exception
     */
    @objid ("b5c32bcb-3fbb-11e2-87cb-001ec947ccaf")
    protected final void rethrowException(Exception e) throws SAXParseException {
        throw new SAXParseException(e.getLocalizedMessage(), this.stateHandler.getLocator(), e);
    }

    /**
     * Throw a SAXParseException telling the given tag name is unexpected.
     * @param localName the tag name
     * @throws org.xml.sax.SAXParseException the thrown exception
     */
    @objid ("b5c32bc1-3fbb-11e2-87cb-001ec947ccaf")
    protected void throwInvalidTag(final String localName) throws SAXParseException {
        throw new SAXParseException("Invalid '"+localName+"' tag.", this.stateHandler.getLocator());
    }

}
