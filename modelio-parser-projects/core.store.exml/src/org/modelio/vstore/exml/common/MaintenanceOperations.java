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
                                    

package org.modelio.vstore.exml.common;

import java.io.IOException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;
import org.modelio.vstore.exml.common.index.ExmlIndex;

/**
 * Implementation of {@link IMaintenanceOperations maintenance operations} on an EXML repository.
 */
@objid ("8cb837d5-4fe3-4c24-b883-5ed6320c42ac")
public class MaintenanceOperations implements IMaintenanceOperations {
    @objid ("da4641c9-06bb-461f-b5de-23f538f44a2b")
    protected final AbstractExmlRepository repo;

    /**
     * Initialize the maintenance.
     * @param repo the EXML repository.
     */
    @objid ("7ce77667-441c-4ac0-b3f9-6eeac37350bc")
    public MaintenanceOperations(AbstractExmlRepository repo) {
        this.repo = repo;
    }

    @objid ("98d52c73-71dd-4011-bfb3-aa9fcc433adc")
    @Override
    public void rebuildIndexes(IModelioProgress monitor) throws IOException {
        SubProgress mon = SubProgress.convert(monitor, 200);
        
        ExmlIndex indexes = this.repo.getIndexes(mon.newChild(20));
        
        mon.subTask("Deleting "+this.repo.getResProvider().getName()+" indexes ...");
        indexes.deleteIndexes();
        
        mon.subTask("Rebuilding "+this.repo.getResProvider().getName()+" indexes ...");
        indexes.open(mon.newChild(30));
        indexes.buildIndexes(mon.newChild(150));
    }

    @objid ("a7b8b3fd-fe1a-4007-a2d6-ca03723c8bed")
    @Override
    public void compressIndexes(IModelioProgress monitor) throws IOException {
        SubProgress mon = SubProgress.convert(monitor, 200);
        
        ExmlIndex indexes = this.repo.getIndexes(mon.newChild(20));
        
        mon.subTask("Compressing "+this.repo.getResProvider().getName()+" indexes ...");
        indexes.compress(mon.newChild(180));
    }

    @objid ("a7f3ee50-7301-42c9-b184-1d4096c12f1e")
    public void deleteIndexes(IModelioProgress monitor) throws IOException {
        ExmlIndex indexes = this.repo.getIndexes(monitor);
        
        monitor.subTask("Deleting "+this.repo.getResProvider().getName()+" indexes ...");
        indexes.deleteIndexes();
    }

}
