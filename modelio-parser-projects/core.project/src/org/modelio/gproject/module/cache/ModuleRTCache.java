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
                                    

package org.modelio.gproject.module.cache;

import java.io.IOException;
import java.nio.file.Path;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.module.GModule;
import org.modelio.gproject.module.IModuleCache;
import org.modelio.gproject.module.IModuleHandle;
import org.modelio.gproject.module.catalog.FileModuleStore;
import org.modelio.vbasic.progress.IModelioProgress;

/**
 * Cache for a file module catalog.
 * <p>
 * Works by copying in a cache directory the module files.
 */
@objid ("a731a18e-dfa0-4d58-a433-71ab0367c395")
public class ModuleRTCache implements IModuleCache {
    @objid ("3b707c01-d763-4a72-ab8a-16161c063e52")
    private FileModuleStore catalog;

    @objid ("1a6c18bf-f509-4220-a9c9-9d7033e54abd")
    private FileModuleStore cache;

    /**
     * C'tor the module catalog cache.
     * @param catalog the cached catalog
     * @param cachePath the cache path
     */
    @objid ("08d572ed-641d-4243-81b5-6ea4bd7fc40a")
    public ModuleRTCache(FileModuleStore catalog, Path cachePath) {
        this.catalog = catalog;
        this.cache = new FileModuleStore(cachePath);
    }

    @objid ("5f6ac1b3-e763-4e70-81a4-e06123f2e5a3")
    @Override
    public IModuleHandle getModuleHandle(Path archivePath, IModelioProgress monitor) throws IOException {
        if (this.cache.contains(archivePath))
            return this.cache.getModuleHandle(archivePath, monitor);
        else
            return this.catalog.copy(this.catalog.getModuleHandle(archivePath, monitor), this.cache, monitor);
    }

    @objid ("8a9da0a0-4996-4850-a4e0-5f6793c21f22")
    @Override
    public IModuleHandle getModuleHandle(GModule gModule, IModelioProgress monitor) throws IOException {
        IModuleHandle rtModuleHandle = this.cache.findModule(gModule.getName(), gModule.getVersion().toString("V.R.C"), monitor);
        if (rtModuleHandle == null) {
            IModuleHandle handleInCatalog = this.catalog.findModule(gModule.getName(), gModule.getVersion().toString("V.R.C"), monitor);    
            if (handleInCatalog != null) {
                rtModuleHandle = this.catalog.copy(handleInCatalog, this.cache, monitor);
            }
        }
        return rtModuleHandle;
    }

}
