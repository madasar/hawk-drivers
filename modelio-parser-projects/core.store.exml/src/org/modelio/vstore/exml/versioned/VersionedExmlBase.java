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
                                    

package org.modelio.vstore.exml.versioned;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vcore.model.DuplicateObjectException;
import org.modelio.vcore.session.impl.storage.IModelLoader;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vstore.exml.common.AbstractExmlRepository;
import org.modelio.vstore.exml.common.ExmlStorageHandler;
import org.modelio.vstore.exml.common.ILoadHelper;
import org.modelio.vstore.exml.common.model.ObjId;
import org.modelio.vstore.exml.resource.IExmlResourceProvider.ExmlResource;
import org.modelio.vstore.exml.resource.IExmlResourceProvider;
import org.modelio.vstore.exml.versioned.load.IVersionedExmlLoader;
import org.modelio.vstore.exml.versioned.load.sax.SaxVersionedExmlLoader;
import org.modelio.vstore.exml.versioned.save.VersionedExmlSaver;
import org.xml.sax.InputSource;

/**
 * EXML repository with references to non versioned elements saved in a separate file.
 */
@objid ("f51527b6-12b9-11e2-816a-001ec947ccaf")
public abstract class VersionedExmlBase extends AbstractExmlRepository {
    @objid ("979e713f-12de-11e2-816a-001ec947ccaf")
    private IVersionedExmlLoader versionedLoader;

    @objid ("679724a2-2e7b-11e2-8aaa-001ec947ccaf")
    private VersionedLoadHelper loadHelper;

    /**
     * Initialize the repository.
     * @param resProvider an EXML resource provider.
     */
    @objid ("979e7140-12de-11e2-816a-001ec947ccaf")
    public VersionedExmlBase(IExmlResourceProvider resProvider) {
        super(resProvider);
    }

    @objid ("979e7148-12de-11e2-816a-001ec947ccaf")
    @Override
    public synchronized boolean doReloadCmsNode(SmObjectImpl obj, IModelLoader modelLoader) throws DuplicateObjectException {
        ObjId cmsNodeId = new ObjId(obj);
        IExmlResourceProvider resProvider = getResourceProvider();
        try {
            ExmlResource resource = resProvider.getResource(cmsNodeId);
            ExmlResource localRes = resProvider.getLocalResource(cmsNodeId);
            try (InputStream is = resource.read();
                    InputStream lis = localRes.read();
                    InputStream bufis = new BufferedInputStream(is);
                    InputStream buflis = new BufferedInputStream(lis)) {
                if (is == null) {
                    // Exml not found, set the object as shell.
                    loadFailed(obj, modelLoader, new FileNotFoundException(cmsNodeId+": "+resource.getPublicLocation()));
                    return false;
                } else {
                    // setup XML input sources
                    InputSource src = new InputSource(bufis);
                    InputSource lsrc = null;
                    if (lis != null ) {
                        lsrc = new InputSource(buflis);
                        lsrc.setPublicId(localRes.getPublicLocation());
                    }
        
                    src.setPublicId(resource.getPublicLocation());
        
                    // Load XML files
                    this.versionedLoader.load(src, lsrc, modelLoader);
                    return true;
        
                }
            }
        } catch (IOException e) {
            loadFailed(obj, modelLoader, e);
            return false;
        }
    }

    @objid ("979e714e-12de-11e2-816a-001ec947ccaf")
    @Override
    protected void save(ExmlStorageHandler handler, IModelioProgress progress) throws IOException {
        SmObjectImpl cmsNode = handler.getCmsNode();
        ObjId cmsNodeId = new ObjId(cmsNode);
        
        try (OutputStream os = new BufferedOutputStream(getResourceProvider().getResource(cmsNodeId).write());
                OutputStream locOs = new BufferedOutputStream(new LazyOutputStream (getResourceProvider().getLocalResource(cmsNodeId)))){
            VersionedExmlSaver saver = new VersionedExmlSaver(getErrorSupport());
            saver.externalize(cmsNode, os, locOs);
        }
    }

    @objid ("3e36dd14-1ea1-11e2-90db-001ec947ccaf")
    @Override
    protected final void initializeLoader() {
        this.loadHelper = new VersionedLoadHelper(this, getStatusInitializer(), isWriteable());
        this.versionedLoader = new SaxVersionedExmlLoader(this.loadHelper);
    }

    /**
     * Get the version status flags initializer.
     * @return the status flags initializer.
     */
    @objid ("3e36dd17-1ea1-11e2-90db-001ec947ccaf")
    protected abstract IVersionStatusInitializer getStatusInitializer();

    @objid ("679724a3-2e7b-11e2-8aaa-001ec947ccaf")
    @Override
    protected final ILoadHelper getloadHelper() {
        return this.loadHelper;
    }

}
