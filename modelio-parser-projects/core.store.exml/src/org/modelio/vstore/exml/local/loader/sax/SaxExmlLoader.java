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

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.model.DuplicateObjectException;
import org.modelio.vcore.session.impl.storage.IModelLoader;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vstore.exml.common.ILoadHelper;
import org.modelio.vstore.exml.local.loader.IExmlLoader;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

/**
 * SAX model loader.
 * <p>
 * Usage: instantiate and the call {@link #load(InputSource, IModelLoader)} for each EXML file in the repository.
 */
@objid ("2b011b99-3faf-11e2-87cb-001ec947ccaf")
public class SaxExmlLoader implements IExmlLoader {
    @objid ("2b011b9d-3faf-11e2-87cb-001ec947ccaf")
    private boolean loadInProgress = false;

    @objid ("2b011b9b-3faf-11e2-87cb-001ec947ccaf")
    private DocumentContentHandler defaultHandler;

    @objid ("2b011b9c-3faf-11e2-87cb-001ec947ccaf")
    private XMLReader xmlReader;

    @objid ("2b011b9e-3faf-11e2-87cb-001ec947ccaf")
    private DataModel dataModel;

    /**
     * Initialize the SAX loader.
     * @param loadHelper a load helper
     */
    @objid ("2b011b9f-3faf-11e2-87cb-001ec947ccaf")
    public SaxExmlLoader(ILoadHelper loadHelper) {
        this.dataModel = new DataModel(loadHelper);
        this.defaultHandler = new DocumentContentHandler(this.dataModel);
        
        try {
            SAXParserFactory saxFactory = SAXParserFactory.newInstance();
            SAXParser parser = saxFactory.newSAXParser();
            this.xmlReader = parser.getXMLReader();
        
            this.xmlReader.setFeature("http://xml.org/sax/features/namespaces", true);
        
            this.xmlReader.setContentHandler(this.defaultHandler);
            this.xmlReader.setErrorHandler(this.defaultHandler);
        } catch (ParserConfigurationException e) {
            // should never happen
            throw new Error(e);
        } catch (SAXException e) {
            // should never happen
            throw new Error(e);
        }
    }

    /**
     * Load an EXML resource from an XML {@link InputSource}.
     * @param is the EXML source.
     * @param loader the API to use to load the content.
     * @return the loaded CMS node.
     * @throws java.io.IOException in case of failure
     * @throws org.modelio.vcore.model.DuplicateObjectException if another object with the same identifier as a loaded object already exists in another repository.
     */
    @objid ("2b011ba4-3faf-11e2-87cb-001ec947ccaf")
    @Override
    public SmObjectImpl load(final InputSource is, IModelLoader loader) throws IOException, DuplicateObjectException {
        if (this.loadInProgress)
            throw new IllegalStateException("Reentrant call not allowed.");
        
        this.loadInProgress = true;
        this.dataModel.reset();
        this.defaultHandler.reset();
        this.dataModel.setModelLoader (loader);
        
        
        try {
            this.xmlReader.parse(is);
            return this.dataModel.getRootObject();
        } catch(SAXParseException toCatch) {
            String msg = toCatch.getPublicId()
                    +":"+toCatch.getLineNumber()
                    +":"+toCatch.getColumnNumber()
                    +": "+toCatch.getLocalizedMessage();
            throw new IOException(msg, toCatch );
        } catch (SAXException e) {
            String msg = is.getPublicId()+": "+e.getLocalizedMessage();
            throw new IOException (msg, e);
        } catch (IOException e) {
            String msg = is.getPublicId()+": "+e.getLocalizedMessage();
            throw new IOException (msg, e);
        } catch (Error | RuntimeException e) {
            e.addSuppressed(new Throwable("Error occurred while reading '"+is.getPublicId()+"'"));
            throw e;
        } finally {
            this.loadInProgress = false;
            this.dataModel.setModelLoader (null);
        }
    }

    @objid ("ddef07b7-407a-11e2-87cb-001ec947ccaf")
    protected final void setDependencyContentHook(IDependencyContentHook hook) {
        this.dataModel.setDependencyContentHook(hook);
    }

}
