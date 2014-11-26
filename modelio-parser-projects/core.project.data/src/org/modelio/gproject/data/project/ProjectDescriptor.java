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
                                    

package org.modelio.gproject.data.project;

import java.io.Serializable;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.auth.NoneAuthData;

/**
 * Descriptor of a GProject.
 * <p>
 * Descriptors can be created either by reading from a file with {@link ProjectDescriptorReader#read(Path, DefinitionScope)},
 * or by creating an empty one with {@link #createEmpty(String, Path)}.
 */
@objid ("50c8e5d0-985a-11e1-ac83-001ec947ccaf")
public final class ProjectDescriptor implements Serializable {
    /**
     * Project descriptor format version.
     * <p>
     * History:<ul>
     * <li> 1 : initial version
     * <li> 2 : fragments and module paths are now URI relative to the project or absolute.
     * </ul>
     */
    @objid ("eed75d53-9a71-11e1-ac83-001ec947ccaf")
    public static final long serialVersionUID = 2L;

    @objid ("eed9bf98-9a71-11e1-ac83-001ec947ccaf")
    private String name;

    /**
     * Project type : local, svn, git, http...
     */
    @objid ("40dec619-0c6e-11e2-bed6-001ec947ccaf")
    private String type;

    /**
     * Remote path of the project for shared projects.
     */
    @objid ("40dec621-0c6e-11e2-bed6-001ec947ccaf")
    private String remoteLocation;

    @objid ("b63bb0bf-99bb-11e1-ac83-001ec947ccaf")
    private final List<FragmentDescriptor> fragments = new ArrayList<>();

    @objid ("f478e90d-aa5a-11e1-8392-001ec947ccaf")
    private GProperties properties = new GProperties();

    /**
     * The physical path of the project
     * Note : the project space can be either local or delegated to another directory.
     */
    @objid ("001f69c2-34d4-1fc7-b42e-001ec947cd2a")
    private Path projectPath;

    @objid ("aa848eec-ec75-11e1-912e-001ec947ccaf")
    private final List<ModuleDescriptor> modules = new ArrayList<>();

    @objid ("e285be30-4cd0-40a3-b8dc-09d11f13e19e")
    private AuthDescriptor auth;

    /**
     * Lock informations if the project is locked.
     */
    @objid ("e3f2e4eb-b9f5-48ad-b8a7-8d2edf2b98ee")
    private ILockInfo lockInfo;

    /**
     * Create an empty local project descriptor.
     * <p>
     * Authorization data is set to none.
     * @param projectName the project name.
     * @param projectPath the project path.
     * @return the new project descriptor.
     */
    @objid ("0010f5ae-92ee-1060-84ef-001ec947cd2a")
    public static ProjectDescriptor createEmpty(String projectName, Path projectPath) {
        ProjectDescriptor descriptor = new ProjectDescriptor();
        descriptor.setName(projectName);
        descriptor.setPath(projectPath);
        descriptor.setType(ProjectType.LOCAL.name());
        descriptor.setRemoteLocation("");
        descriptor.setAuthDescriptor(new AuthDescriptor(new NoneAuthData(), DefinitionScope.LOCAL));
        return descriptor;
    }

    /**
     * Instantiate an empty project descriptor.
     */
    @objid ("001113fe-92ee-1060-84ef-001ec947cd2a")
    public ProjectDescriptor() {
    }

    /**
     * @return the fragments.
     */
    @objid ("005fb70c-3590-1fc6-b42e-001ec947cd2a")
    public List<FragmentDescriptor> getFragments() {
        // Automatically generated method. Please delete this comment before
        // entering specific code.
        return this.fragments;
    }

    /**
     * @return the module descriptors.
     */
    @objid ("aa86f144-ec75-11e1-912e-001ec947ccaf")
    public List<ModuleDescriptor> getModules() {
        return this.modules;
    }

    /**
     * @return the project name.
     */
    @objid ("eed9bf9b-9a71-11e1-ac83-001ec947ccaf")
    public String getName() {
        return this.name;
    }

    /**
     * Get the project space path.
     * @return the project space path.
     */
    @objid ("49be8d30-ab3f-11e1-8392-001ec947ccaf")
    public Path getPath() {
        return this.projectPath;
    }

    /**
     * Get the project properties.
     * @return the project properties.
     */
    @objid ("f478e911-aa5a-11e1-8392-001ec947ccaf")
    public GProperties getProperties() {
        return this.properties;
    }

    /**
     * Get the project remote location.
     * <p>
     * Returns <code>null</code> for local projects.
     * @return the project remote location.
     */
    @objid ("380d01f6-0c6e-11e2-bed6-001ec947ccaf")
    public String getRemoteLocation() {
        return this.remoteLocation;
    }

    /**
     * Get the project type as a string.
     * <p>
     * The string value should match one of the {@link ProjectType} enumeration values.
     * @return the project type.
     */
    @objid ("b473b153-0baa-11e2-bed6-001ec947ccaf")
    public String getType() {
        return this.type;
    }

    /**
     * Set the project name.
     * @param name the project name.
     */
    @objid ("eed9bf9f-9a71-11e1-ac83-001ec947ccaf")
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Set the project type.
     * <p>
     * The string value should match one of the {@link ProjectType} enumeration values.
     * @param type the project type.
     */
    @objid ("b473b157-0baa-11e2-bed6-001ec947ccaf")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Set the project path.
     * @param projectPath the project path, or <code>null</code> for the default path.
     */
    @objid ("001ff676-34d4-1fc7-b42e-001ec947cd2a")
    public void setPath(final Path projectPath) {
        this.projectPath = projectPath;
    }

    /**
     * Set the project properties.
     * <p>
     * Since Modelio 3.2 properties are initialized to an empty GProperties, you don't need to set one.
     * @param gProperties the project properties.
     */
    @objid ("f478e915-aa5a-11e1-8392-001ec947ccaf")
    public void setProperties(final GProperties gProperties) {
        this.properties = gProperties;
    }

    /**
     * Set the project remote location.
     * @param remoteLocation the project remote location.
     */
    @objid ("380d01fb-0c6e-11e2-bed6-001ec947ccaf")
    public void setRemoteLocation(String remoteLocation) {
        this.remoteLocation = remoteLocation;
    }

    @objid ("0448f7ca-3019-11e2-8f81-001ec947ccaf")
    ModuleDescriptor getModule(String moduleName) {
        for (ModuleDescriptor m : getModules()) {
            if (m.getName().equals(moduleName))
                return m;
        }
        return null;
    }

    @objid ("0448f7cf-3019-11e2-8f81-001ec947ccaf")
    FragmentDescriptor getFragment(String id) {
        for (FragmentDescriptor  f: getFragments()) {
            if (f.getId().equals(id))
                return f;
        }
        return null;
    }

    /**
     * Remove incomplete module and fragment descriptors.
     * @return A report of all incomplete descriptors that were deleted.
     */
    @objid ("0448f7d4-3019-11e2-8f81-001ec947ccaf")
    public String cleanup() {
        StringBuilder sb = new StringBuilder();
        
        Iterator<FragmentDescriptor> it = this.fragments.iterator();
        while (it.hasNext()) {
            FragmentDescriptor d = it.next();
            if (! d.isValid()) {
                sb.append("Removed incomplete '"+d+"' fragment descriptor.\n");
                it.remove();
            }
        }
        
        Iterator<ModuleDescriptor> mit = this.modules.iterator();
        while (mit.hasNext()) {
            ModuleDescriptor d = mit.next();
            if (! d.isValid()) {
                sb.append("Removed incomplete '"+d+"' module descriptor.\n");
                mit.remove();
            }
        }
        return sb.toString();
    }

    @objid ("0f8e359d-782f-43a4-b80e-5c42fd8b0c46")
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.fragments == null) ? 0 : this.fragments.hashCode());
        result = prime * result + ((this.modules == null) ? 0 : this.modules.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.projectPath == null) ? 0 : this.projectPath.hashCode());
        result = prime * result + ((this.properties == null) ? 0 : this.properties.hashCode());
        result = prime * result + ((this.remoteLocation == null) ? 0 : this.remoteLocation.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        return result;
    }

    @objid ("db30f14c-f60c-4d41-bfa1-b62f741d92c8")
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        
        ProjectDescriptor other = (ProjectDescriptor) obj;
        
        if (this.fragments == null) {
            if (other.fragments != null)
                return false;
        } else if (!sameContent(this.fragments, other.fragments))
            return false;
        
        if (this.modules == null) {
            if (other.modules != null)
                return false;
        } else if (!sameContent(this.modules, other.modules))
            return false;
        
        if (this.name == null) {
            if (other.name != null)
                return false;
        } else if (!this.name.equals(other.name))
            return false;
        
        if (this.projectPath == null) {
            if (other.projectPath != null)
                return false;
        } else if (!this.projectPath.equals(other.projectPath))
            return false;
        
        if (this.properties == null) {
            if (other.properties != null)
                return false;
        } else if (!this.properties.equals(other.properties))
            return false;
        
        if (this.remoteLocation == null) {
            if (other.remoteLocation != null)
                return false;
        } else if (!this.remoteLocation.equals(other.remoteLocation))
            return false;
        
        if (this.type == null) {
            if (other.type != null)
                return false;
        } else if (!this.type.equals(other.type))
            return false;
        return true;
    }

    /**
     * Compare 2 lists regardless of the order.
     * @param c1 a list
     * @param c2 another list
     * @return <code>true</code> if they contain the same elements, whatever the order.
     */
    @objid ("dc7f7c43-cd40-44bf-b252-f6df372fdbe2")
    private boolean sameContent(List<?> c1, List<?> c2) {
        return c1.size() == c2.size() 
                && c1.containsAll(c2);
    }

    /**
     * Get the authentication data descriptor.
     * @return the authentication data descriptor.
     */
    @objid ("e56af036-c4ad-476c-9bea-80bd4aff34e5")
    public AuthDescriptor getAuthDescriptor() {
        return this.auth;
    }

    /**
     * set the authentication descriptor.
     * @param auth the authentication descriptor
     */
    @objid ("7a1b901b-1130-43df-a23c-b63c13b1b567")
    public void setAuthDescriptor(AuthDescriptor auth) {
        this.auth = auth;
    }

    /**
     * Get lock informations if the project is locked.
     * @return the lock informations or <i>null</i>.
     */
    @objid ("0a6603c2-92d9-4d31-8a54-139bf7b43b26")
    public ILockInfo getLockInfo() {
        return this.lockInfo;
    }

    /**
     * Set lock informations if the project is locked.
     * @param lockInfo lock informations
     */
    @objid ("a8fe0c95-328b-474e-b986-1968dd2a39a1")
    public void setLockInfo(ILockInfo lockInfo) {
        this.lockInfo = lockInfo;
    }

}
