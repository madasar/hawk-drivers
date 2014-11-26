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
                                    

package org.modelio.gproject.gproject;

import java.net.URI;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.data.project.AuthDescriptor;
import org.modelio.gproject.data.project.DefinitionScope;
import org.modelio.gproject.data.project.FragmentDescriptor;
import org.modelio.gproject.data.project.GAuthConf;
import org.modelio.gproject.data.project.GProperties;
import org.modelio.gproject.data.project.ModuleDescriptor;
import org.modelio.gproject.data.project.ProjectDescriptor;
import org.modelio.gproject.fragment.IProjectFragment;
import org.modelio.gproject.module.GModule;

/**
 * Serialize a {@link GProject}, a {@link IProjectFragment} or a project
 * descriptor in a XML file.
 */
@objid ("d24b1ab1-99bb-11e1-ac83-001ec947ccaf")
public class ProjectWriter {
    @objid ("eed9bfb2-9a71-11e1-ac83-001ec947ccaf")
    private ProjectDescriptor out;

    @objid ("99dbb2d6-a711-40d0-b776-aba72903b0a1")
    private GProject project;

    /**
     * Save the project configuration to a file.
     * @param aProject the project to save
     * @return the descriptor of the project.
     */
    @objid ("eed9bfbf-9a71-11e1-ac83-001ec947ccaf")
    public ProjectDescriptor write(final GProject aProject) {
        this.out = new ProjectDescriptor();
        this.project = aProject;
        writeProject();
        return this.out;
    }

    @objid ("eed9bfb9-9a71-11e1-ac83-001ec947ccaf")
    private void writeFragmentDescriptor(final IProjectFragment projectFragment) {
        FragmentDescriptor fd = new FragmentDescriptor();
        
        fd.setId(projectFragment.getId());
        fd.setType(projectFragment.getType());
        
        URI uri = getRelativeUri(projectFragment.getUri());
        fd.setUri(uri);
        fd.setScope(projectFragment.getScope()); 
        
        fd.setProperties(new GProperties(projectFragment.getProperties()));
        fd.setAuthDescriptor(writeAuth(projectFragment.getAuthConfiguration()));
        
        this.out.getFragments().add(fd);
    }

    @objid ("eed9bfb6-9a71-11e1-ac83-001ec947ccaf")
    private void writeProject() {
        this.out.setName(this.project.getName());
        this.out.setPath(this.project.getProjectDataPath());
        this.out.setType(this.project.getType().name());
        
        if (this.project.getRemoteLocation() != null)
            this.out.setRemoteLocation(this.project.getRemoteLocation().toString());
        
        // Write properties
        
        this.out.setProperties(new GProperties(this.project.getProperties()));
        this.out.setAuthDescriptor(writeAuth(this.project.getAuthConfiguration()));
        
        // Write project fragments
        for (IProjectFragment fragment : this.project.getOwnFragments()) {
            writeFragmentDescriptor(fragment);
        }
        
        // Write modules
        for (GModule m : this.project.getModules()) {
            writeModuleDescriptor(m);
        }
    }

    @objid ("aa89539b-ec75-11e1-912e-001ec947ccaf")
    private void writeModuleDescriptor(final GModule m) {
        ModuleDescriptor d = new ModuleDescriptor();
        d.setName( m.getName());
        d.setScope(m.getScope()); 
        d.setActivated(m.isActivated());
        
        d.setVersion( m.getVersion());
        if (m.getOriginalArchiveUri() != null) {
            d.setArchiveLocation(getRelativeUri(m.getOriginalArchiveUri()));
        }
        
        d.setParameters(new GProperties(m.getParameters()));
        d.setAuthDescriptor(writeAuth(m.getAuthData()));
        
        this.out.getModules().add(d);
    }

    @objid ("b46c8a50-0baa-11e2-bed6-001ec947ccaf")
    private URI getRelativeUri(URI uri) {
        if (uri == null)
            return null;
        else
            return this.project.getProjectDataPath().toUri().relativize(uri);
    }

    @objid ("2edd7fb7-8fbf-417d-9063-d46f55c20ab8")
    private AuthDescriptor writeAuth(GAuthConf auth) {
        if (auth == null)
            return new AuthDescriptor(null, DefinitionScope.LOCAL);
        else
            return new AuthDescriptor(auth.getAuthData(), auth.getScope());
    }

}
