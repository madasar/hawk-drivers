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
                                    

package org.modelio.gproject.gproject.remote;

import java.io.IOException;
import java.nio.file.Path;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.data.project.DescriptorWriter;
import org.modelio.gproject.data.project.ProjectDescriptor;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.gproject.ProjectWriter;
import org.modelio.vbasic.progress.IModelioProgress;

/**
 * Abstract class parent of all remote project.
 */
@objid ("eb079112-0bee-4ae3-9c1b-f09e57c13e70")
public abstract class GRemoteProject extends GProject {
    @objid ("615ad120-5eff-11e2-b557-001ec947ccaf")
    @Override
    public void save(IModelioProgress progress) throws IOException {
        if (getSession() != null) {
            getSession().save(progress);
        }
        
        Path confFilePath = getProjectPath().resolve("project.conf");
        ProjectDescriptor desc = new ProjectWriter().write(this);
        new DescriptorWriter().write(desc, confFilePath);
    }

}
