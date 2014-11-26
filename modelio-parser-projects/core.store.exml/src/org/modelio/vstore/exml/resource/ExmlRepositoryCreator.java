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
                                    

package org.modelio.vstore.exml.resource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * EXML repository creator.
 */
@objid ("c898981d-5f0b-11e1-a535-001ec947ccaf")
class ExmlRepositoryCreator {
    @objid ("0396e17b-6132-11e1-a535-001ec947ccaf")
    private Path repositoryPath;

    @objid ("03bd06db-6132-11e1-a535-001ec947ccaf")
    public ExmlRepositoryCreator(final Path path) {
        this.repositoryPath = path;
    }

    /**
     * Create the repository directory structure in the given directory
     * @throws java.io.IOException in case of error creating the repository structure.
     */
    @objid ("03fb0397-6132-11e1-a535-001ec947ccaf")
    public void createRepositoryStructure() throws IOException {
        // Create "model" directory
        final Path modelDir = getWcModelDirectory();
        Files.createDirectories(modelDir);
        
        // Create index directory.
        Files.createDirectories(this.repositoryPath.resolve(IExmlRepositoryGeometry.INDEX_DIRNAME));
        
        // Create directory for each CMS node metaclass
        for (final SmClass cmsNodeClass : getCmsNodeClasses())
        {
            Files.createDirectories(modelDir.resolve(cmsNodeClass.getName()));
        }
        
        // Create "blobs/*" directories
        final Path blobDir = this.repositoryPath.resolve(IExmlRepositoryGeometry.BLOBS_DIRNAME);
        for (int i=0; i<256; i++) {
            Files.createDirectories(blobDir.resolve(String.format("%02x", i)));
        }
    }

    /**
     * Delete the repository
     * @throws java.io.IOException in case of failure
     */
    @objid ("03ffc844-6132-11e1-a535-001ec947ccaf")
    public void delete() throws IOException {
        FileUtils.delete(this.repositoryPath);
    }

    /**
     * Get all CMS node metaclasses.
     * @return CMS node metaclasses.
     */
    @objid ("04022a9b-6132-11e1-a535-001ec947ccaf")
    private static Collection<SmClass> getCmsNodeClasses() {
        Collection<SmClass> ret = new ArrayList<>(40);
        for (SmClass c : SmClass.getRegisteredClasses()) {
            if (c.isCmsNode()) {
                ret.add(c);
            }
        }
        return ret;
    }

    /**
     * @return the working copy administration directory.
     */
    @objid ("041ec6a2-6132-11e1-a535-001ec947ccaf")
    private Path getWcAdminDirectory() {
        return this.repositoryPath.resolve( IExmlRepositoryGeometry.ADMIN_DIRNAME);
    }

    /**
     * @return the 'model' directory under the working copy directory.
     */
    @objid ("042128f9-6132-11e1-a535-001ec947ccaf")
    private Path getWcModelDirectory() {
        return this.repositoryPath.resolve( IExmlRepositoryGeometry.MODEL_DIRNAME);
    }

}
