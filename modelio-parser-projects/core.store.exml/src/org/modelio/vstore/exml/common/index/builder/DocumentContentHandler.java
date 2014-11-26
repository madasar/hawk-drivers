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

import java.io.IOError;
import java.io.IOException;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.log.Log;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vstore.exml.common.index.ICmsNodeIndex;
import org.modelio.vstore.exml.common.index.IUserNodeIndex;
import org.modelio.vstore.exml.common.model.ObjId;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * SAX handler that parses the document.
 * <p>
 * Uses the state machine design pattern. Delegates the work to XxxState classes beginning with . The first State is the
 * {@link DocumentState}.
 */
@objid ("fd26b9fe-5986-11e1-991a-001ec947ccaf")
class DocumentContentHandler extends DefaultHandler {
    @objid ("fd21f6e4-5986-11e1-991a-001ec947ccaf")
    private boolean errorEncountered;

    @objid ("fd21f6df-5986-11e1-991a-001ec947ccaf")
    private boolean parentSet = false;

    @objid ("fd21f6e8-5986-11e1-991a-001ec947ccaf")
    private AbstractState currentState;

    @objid ("fd1f92d0-5986-11e1-991a-001ec947ccaf")
    private ICmsNodeIndex cmsNodeIndex;

    @objid ("fd21f54a-5986-11e1-991a-001ec947ccaf")
    private IUserNodeIndex userNodeIndex;

    @objid ("fd21f6e3-5986-11e1-991a-001ec947ccaf")
    private OBJECTState objectState;

    @objid ("fd21f6e2-5986-11e1-991a-001ec947ccaf")
    private EXTIDState extIdState;

    @objid ("fd21f6e1-5986-11e1-991a-001ec947ccaf")
    private REFOBJState refObjState;

    @objid ("fd21f6e0-5986-11e1-991a-001ec947ccaf")
    private OBJECT2State object2State;

    @objid ("fd21f6de-5986-11e1-991a-001ec947ccaf")
    private DocumentState documentState;

    @objid ("fd21f5d5-5986-11e1-991a-001ec947ccaf")
    private ObjId cmsNodeId;

    @objid ("fd21f67b-5986-11e1-991a-001ec947ccaf")
    private Locator locator;

    @objid ("fd21f716-5986-11e1-991a-001ec947ccaf")
    public DocumentContentHandler(ICmsNodeIndex parentIndex, IUserNodeIndex userIndex) {
        this.cmsNodeIndex = parentIndex;
        this.userNodeIndex = userIndex;
        
        this.extIdState = new EXTIDState();
        this.objectState = new OBJECTState();
        this.object2State = new OBJECT2State();
        this.refObjState = new REFOBJState();
        
        this.documentState = new DocumentState();
        this.extIdState = new EXTIDState();
        this.object2State = new OBJECT2State();
        this.objectState = new OBJECTState();
        this.refObjState = new REFOBJState();
        
        this.documentState.setStateHandler(this);
        this.extIdState.setStateHandler(this);
        this.object2State.setStateHandler(this);
        this.objectState.setStateHandler(this);
        this.refObjState.setStateHandler(this);
        
        this.currentState = (this.documentState);
        this.errorEncountered = false;
    }

    @objid ("fd21f715-5986-11e1-991a-001ec947ccaf")
    public void addContainedObject(final String className, final String uid, final String name) throws IOException {
        final UUID tuuid = UUID.fromString(uid);
        final SmClass smClass = SmClass.getClass(className);
        
        if (smClass != null) {
            ObjId childId = new ObjId(smClass, name, tuuid);
        
            this.cmsNodeIndex.addObject(this.cmsNodeId, childId);
        }
    }

    @objid ("fd21f714-5986-11e1-991a-001ec947ccaf")
    public void addUsedCmsNode(final String className, final String uid, final String name) throws IOException {
        final UUID tuuid = UUID.fromString(uid);
        final SmClass smClass = SmClass.getClass(className);
        if (smClass != null) {
            ObjId usedId = new ObjId(smClass, name, tuuid);
        
            this.userNodeIndex.addUsed(this.cmsNodeId, usedId);
        } else {
            // TODO better reporting
            Log.warning("'" + className + "' metaclass not found at " + getLocator().getLineNumber() + " in "
                    + getLocator().getSystemId());
        }
    }

    @objid ("fd21f711-5986-11e1-991a-001ec947ccaf")
    @Override
    public void characters(final char[] chars, final int start, final int length) throws SAXException {
        this.currentState.characters(chars, start, length);
    }

    @objid ("fd21f710-5986-11e1-991a-001ec947ccaf")
    @Override
    public void endElement(final String uri, final String localName, final String qName) throws SAXException {
        this.currentState.endElement(uri, localName, qName);
    }

    @objid ("fd21f70d-5986-11e1-991a-001ec947ccaf")
    public void enterDocumentState() {
        this.currentState = (this.documentState);
    }

    @objid ("fd21f70c-5986-11e1-991a-001ec947ccaf")
    public void enterEXTIDState(final Attributes attributes) throws SAXException {
        this.currentState = this.extIdState;
        this.extIdState.enterState(attributes);
    }

    @objid ("fd21f70b-5986-11e1-991a-001ec947ccaf")
    public void enterOBJECT2State() {
        this.currentState = this.object2State;
    }

    @objid ("fd21f70a-5986-11e1-991a-001ec947ccaf")
    public void enterOBJECTState() {
        this.currentState = this.objectState;
    }

    @objid ("fd21f709-5986-11e1-991a-001ec947ccaf")
    public void enterREFOBJState() {
        this.currentState = this.refObjState;
    }

    @objid ("fd21f707-5986-11e1-991a-001ec947ccaf")
    @Override
    public void error(final SAXParseException exc) throws SAXException {
        throw exc;
    }

    @objid ("fd21f703-5986-11e1-991a-001ec947ccaf")
    public Locator getLocator() {
        return this.locator;
    }

    @objid ("fd21f702-5986-11e1-991a-001ec947ccaf")
    public boolean hasEncounteredError() {
        return this.errorEncountered;
    }

    @objid ("fd21f6f6-5986-11e1-991a-001ec947ccaf")
    public void setCmsNode(final String className, final String uid, final String name) throws IOException {
        UUID tuuid = UUID.fromString(uid);
        this.cmsNodeId = new ObjId(SmClass.getClass(className), name, tuuid);
        this.cmsNodeIndex.addCmsNode(this.cmsNodeId);
    }

    @objid ("fd21f6ea-5986-11e1-991a-001ec947ccaf")
    @Override
    public void setDocumentLocator(final Locator aLocator) {
        this.locator = aLocator;
    }

    @objid ("fd21f6e9-5986-11e1-991a-001ec947ccaf")
    public void setErrorEncountered() {
        this.errorEncountered = true;
    }

    @objid ("fd21f6e7-5986-11e1-991a-001ec947ccaf")
    public void setParent(final String className, final String uid, final String name) throws IOException {
        if (!this.parentSet) {
            this.parentSet = true;
        
            UUID tuuid = UUID.fromString(uid);
            SmClass smClass = SmClass.getClass(className);
        
            if (smClass != null) {
                this.cmsNodeIndex.setParent(this.cmsNodeId, new ObjId(smClass, name, tuuid));
            }
        }
    }

    @objid ("fd21f6e6-5986-11e1-991a-001ec947ccaf")
    @Override
    public void startElement(final String uri, final String localName, final String qName, final org.xml.sax.Attributes atts) throws SAXException {
        try {
            this.currentState.startElement(uri, localName, qName, atts);
        } catch (IOError err) {
            throwError((Exception) err.getCause());
        }
    }

    @objid ("fd21f6e5-5986-11e1-991a-001ec947ccaf")
    void throwError(final Exception e) throws SAXParseException {
        String msg = e.getLocalizedMessage();
        if (msg==null || msg.isEmpty())
            msg = e.toString();
        
        throw new SAXParseException(msg, getLocator(), e);
    }

    @objid ("fd21f6d2-5986-11e1-991a-001ec947ccaf")
    @Override
    public void warning(final SAXParseException exc) {
        Log.warning(exc); // TODO better reporting
    }

    @objid ("f06b505b-92d7-11e1-be7e-001ec947ccaf")
    public void addForeignObject(final String className, final String uid, final String name) throws IOException {
        final UUID tuuid = UUID.fromString(uid);
        final SmClass smClass = SmClass.getClass(className);
        if (smClass != null) {
            ObjId usedId = new ObjId(smClass, name, tuuid);
        
            this.userNodeIndex.addUsedForeignObj(this.cmsNodeId, usedId);
        } else {
            // TODO better reporting
            Log.warning("'" + className + "' metaclass not found at " + getLocator().getLineNumber() + " in "
                    + getLocator().getSystemId());
        }
    }

    /**
     * Reset the model between 2 runs.
     */
    @objid ("4086635d-1878-11e2-9dfc-001ec947ccaf")
    public void resetModel() {
        this.cmsNodeId = null;
        this.errorEncountered = false;
        this.parentSet = false;
    }

}
