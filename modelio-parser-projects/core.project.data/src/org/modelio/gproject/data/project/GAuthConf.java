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

import java.util.Map.Entry;
import java.util.Map;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.auth.IAuthData;

/**
 * Authentication configuration for GProject, IProjectFragment and GModule.
 * <p>
 * Contains authentication data and a definition scope.
 * The authentication data may be null, meaning the project authentication data should be used.
 */
@objid ("9240828a-516f-4eb6-b2e3-65f14e407ec7")
public class GAuthConf {
    @objid ("5db54cf0-36db-4b6a-81ee-bd9ee313340a")
    private DefinitionScope scope;

    @objid ("69ca87f8-45d7-46fa-a866-4eaa518da5d9")
    private IAuthData authData;

    /**
     * Initialize an empty data.
     */
    @objid ("e43ca658-898e-41f0-af6d-7b38f6e13f56")
    public GAuthConf() {
        // nothing
    }

    /**
     * initialize an authentication configuration from an authentication data.
     * @param data an authentication data.
     * @param scope the definition scope
     */
    @objid ("b89d91d7-fcc4-49d3-909c-d40a00b314f1")
    public GAuthConf(IAuthData data, DefinitionScope scope) {
        this.authData = data;
        this.scope = scope;
    }

    /**
     * Initialize an authentication configuration from the descriptor.
     * <p>
     * Returns a local empty GAuthConf if no descriptor is passed.
     * @param desc an authentication data descriptor.
     * @return the authentication configuration or <code>null</code>.
     */
    @objid ("44c9aff2-1cde-4d7b-9f0f-81ca86974300")
    public static GAuthConf from(AuthDescriptor desc) {
        if (desc == null)
            return new GAuthConf(null, DefinitionScope.LOCAL);
        
        GAuthConf ret = new GAuthConf();
        ret.scope = desc.getScope();
        ret.authData = desc.getData();
        return ret;
    }

    /**
     * @return the authentication data.
     */
    @objid ("7d657f60-3600-4114-a0f8-8efa77a5be84")
    public IAuthData getAuthData() {
        return this.authData;
    }

    /**
     * @param authData the authentication data.
     */
    @objid ("56f96b2b-ad47-416c-a9d3-b60817a19ca8")
    public void setAuthData(IAuthData authData) {
        this.authData = authData;
    }

    /**
     * @return the definition scope.
     */
    @objid ("ac992a1e-b961-49ec-b81e-81c226718755")
    public DefinitionScope getScope() {
        return this.scope;
    }

    /**
     * @param scope the definition scope.
     */
    @objid ("3e804527-5246-432e-9589-f322bdf58e0c")
    public void setScope(DefinitionScope scope) {
        this.scope = scope;
    }

    /**
     * Reconfigure this authentication configuration from the provided authentication descriptor.
     * <p>
     * If no descriptor is provided, the configuration is left unmodified.
     * @param authDescriptor The new authentication descriptor
     * @return <code>true</code> if the authentication changed else <code>false</code>.
     */
    @objid ("4a683c89-d666-4597-bad3-1c1a24200668")
    public boolean reconfigure(AuthDescriptor authDescriptor) {
        if (authDescriptor == null)
            return false;
        
        // Do nothing if empty descriptor, unless the scope changed
        if (!authDescriptor.isDefined() && authDescriptor.getScope() == getScope())
            return false;
        
        IAuthData newData = authDescriptor.getData();
        IAuthData oldData = getAuthData();
        
        if (oldData == null) {
            setAuthData(newData);
            setScope(authDescriptor.getScope());
            return true;
        } else if (isToReplace(oldData, newData)) {
            setAuthData(newData);
            setScope(authDescriptor.getScope());
            return true;
        } else {
            setScope(authDescriptor.getScope());
        
            return false;
        }
    }

    /**
     * Compare 2 authentication data.
     * <p>
     * Returns <code>false</code> if the second authentication should replace the first one.
     * Compares the schemes, then test whether all the first authentication properties
     * are contained in the second one.
     * @param old an current authentication data
     * @param newData the new authentication data.
     * @return <code>true</code> if the 2 authentications represents the same login,
     * <code>false</code> if the second authentication should replace the first one.
     */
    @objid ("68312348-712e-4dae-a48d-b37131835557")
    private static boolean isToReplace(IAuthData old, IAuthData newData) {
        if (old == null)
            return newData != null;
        
        if (newData == null)
            return true;
        
        Map<String, String> oldProp = old.getData();
        if (! old.getSchemeId().equals(newData.getSchemeId()))
            return true;
        
        for (Entry<String, String> prop : newData.getData().entrySet()) {
            if (! Objects.equals(oldProp.get(prop.getKey()), prop.getValue())) {
                return true;
            }
        }
        return false;
    }

    @objid ("9c8534a2-36be-445f-8f7f-d79e7153960e")
    @Override
    public String toString() {
        return "auth: ("+this.authData+" scope:"+this.scope+")";
    }

}
