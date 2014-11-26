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
                                    

package org.modelio.vstore.exml.versioned.save;

import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.xml.CloseableXMLStreamWriter;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vstore.exml.common.model.ExmlTags;

/**
 * Save references to non CMS managed objects in a separate stream.
 */
@objid ("7c3478c3-121b-11e2-816a-001ec947ccaf")
class LocalSaver implements AutoCloseable, ExmlTags {
    @objid ("4c07a266-1224-11e2-816a-001ec947ccaf")
    private XMLStreamWriter out;

    @objid ("4c07a267-1224-11e2-816a-001ec947ccaf")
    private SmObjectImpl currentObj;

    @objid ("1ee09b31-358e-11e2-a87b-001ec947ccaf")
    private CloseableXMLStreamWriter closeableWriter;

    @objid ("4c07a269-1224-11e2-816a-001ec947ccaf")
    public LocalSaver(OutputStream os) throws XMLStreamException, FactoryConfigurationError {
        this.closeableWriter = new CloseableXMLStreamWriter(os, INDENT_FILES);
        this.out = this.closeableWriter.getW();
    }

    @objid ("4c07a26d-1224-11e2-816a-001ec947ccaf")
    @Override
    public void close() throws XMLStreamException {
        try {
            if (this.currentObj != null)
                this.out.writeEndElement();
        
            this.out.writeEndDocument();
        } finally {
            this.closeableWriter.close();
        }
    }

    @objid ("4c07a270-1224-11e2-816a-001ec947ccaf")
    public void dumpCompId(SmObjectImpl object, SmDependency dep, List<SmObjectImpl> targets) throws XMLStreamException {
        if (this.currentObj == null) {
            this.out.writeStartElement(TAG_OBJECT);
            dumpID(TAG_ID, object);
            
            this.currentObj = object;
        } else if (this.currentObj != object) {
            this.out.writeEndElement();
            this.out.writeStartElement(TAG_OBJECT);
            dumpID(TAG_ID, object);
        
            this.currentObj = object;
        } 
        
        this.out.writeStartElement(TAG_COMP);
        this.out.writeAttribute(ATT_RELATION, dep.getName());
        
        for (SmObjectImpl t : targets) {
            dumpID(TAG_COMPID, t);
        }
        
        this.out.writeEndElement();
    }

    @objid ("4c07a277-1224-11e2-816a-001ec947ccaf")
    private void dumpID(final String xmlkey, final MObject object) throws XMLStreamException {
        this.out.writeEmptyElement(xmlkey);
        this.out.writeAttribute(ATT_ID_NAME, object.getName());
        this.out.writeAttribute(ATT_ID_MC, object.getMClass().getName());
        this.out.writeAttribute(ATT_ID_UID, object.getUuid().toString());
    }

    @objid ("4c07a27d-1224-11e2-816a-001ec947ccaf")
    public void begin(final SmObjectImpl object, Collection<MObject> collection) throws XMLStreamException {
        this.currentObj = null;
        
        this.out.writeStartDocument();
        this.out.writeComment("GENERATED FILE, PLEASE DO NOT EDIT!!!");
        
        this.out.writeStartElement("EXT");
        this.out.writeAttribute(ATT_EXT_OBJECT, object.getName());
        this.out.writeAttribute(ATT_EXT_VERSION, Integer.toString(FORMAT_VERSION));
        
        this.out.writeStartElement(TAG_DEPS);
        dumpID(TAG_ID, object);
        
        // dump composed
        for ( MObject it:collection)
            dumpID(TAG_COMPID, it);
        this.out.writeEndElement();
    }

}
