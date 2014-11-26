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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * Formats versions used by a repository.
 * <p>
 * Can tell whether a repository can be read/written by this binary.
 */
@objid ("5dc65c2e-b7c3-41ec-878c-b0255c4bdb31")
public class RepositoryVersions {
    @objid ("75d90a8a-c121-4f59-998f-d6278242e2cf")
    private int repositoryFormat;

    @objid ("1fdca20a-e7db-49eb-adec-3c43280a8e60")
    private List<String> cmsNodesSig;

    /**
     * History: <ul>
     * <li> 0 : before this class exist
     * <li> 1 : current repository format.
     * </ul>
     */
    @objid ("ca97c930-e00a-4a24-9d40-7b5d80df7e15")
    private static final int CURRENT_FORMAT = 1;

    @objid ("84e8250b-3089-46cf-91d0-ea24fe1cb984")
    private static final String PROP_REPOSITORY_FORMAT = "repository_format";

    @objid ("cbd3a65f-a164-426f-9a16-2a071d088f32")
    private static final String PROP_CMSNODES = "cmsnodes";

    /**
     * Constructor from a property map written with {@link #write(Map)}.
     * @param properties a property map.
     */
    @objid ("c1ecc9df-9773-472c-84dd-e066d92578dd")
    public RepositoryVersions(Map<Object, Object> properties) {
        this.repositoryFormat = Integer.valueOf((String) properties.get(PROP_REPOSITORY_FORMAT));
        final String cmsnodes_str = (String) properties.get(PROP_CMSNODES);
        this.cmsNodesSig = Arrays.asList(cmsnodes_str.split(","));
    }

    /**
     * Constructor for the current version.
     */
    @objid ("4c84eefd-4b78-408e-b1df-e5f66598cf19")
    private RepositoryVersions() {
        final List<SmClass> registeredClasses = SmClass.getRegisteredClasses();
        this.cmsNodesSig = new ArrayList<>();
        
        for (SmClass c : registeredClasses) {
            if (c.isCmsNode()) 
                this.cmsNodesSig.add(c.getName());
        }
        Collections.sort(this.cmsNodesSig);
        
        
        this.repositoryFormat = CURRENT_FORMAT;
    }

    /**
     * Write this version in a property map
     * @param properties the write destination
     */
    @objid ("5c9a1281-2a9e-4af9-b09c-4769db46e32f")
    public void write(Map<Object, Object> properties) {
        StringBuilder s = new StringBuilder(this.cmsNodesSig.size() * 10);
        for (String c : this.cmsNodesSig) {
            s.append(c);
            s.append(",");
        }
        
        properties.put(PROP_CMSNODES, s.toString());
        
        properties.put(PROP_REPOSITORY_FORMAT, String.valueOf(this.repositoryFormat));
    }

    /**
     * Check whether this version is compatible with the current one.
     * @throws org.modelio.vstore.exml.common.RepositoryVersions.IncompatibleVersionException if the version is not compatible.
     */
    @objid ("8f0136d2-ecb7-42ca-8d52-bcc4a469497e")
    public void checkCompatible() throws IncompatibleVersionException {
        checkCompatible(current());
    }

    @objid ("f1446c54-34d5-413f-9e98-817fcc09fc6a")
    private void checkCompatible(RepositoryVersions reference) throws IncompatibleVersionException {
        if (this.repositoryFormat != reference.repositoryFormat)
            throw new IncompatibleVersionException("Repository format "+this.repositoryFormat+" is incompatible with "+reference.repositoryFormat+ " version.");
        
        /*if (! this.cmsNodesSig.equals(reference.cmsNodesSig)) {
            ArrayList<String> unknown = new ArrayList<>(this.cmsNodesSig);
            unknown.removeAll(reference.cmsNodesSig);
            
            ArrayList<String> missing = new ArrayList<>(reference.cmsNodesSig);
            missing.removeAll(this.cmsNodesSig);
            
            StringBuilder msg = new StringBuilder();
            if (! unknown.isEmpty()) {
                msg.append("The repository knows unknown CMS node metaclasses: ");
                msg.append(unknown);
                msg.append(".");
            }
        
            if (! missing.isEmpty()) {
                if (! unknown.isEmpty())
                    msg.append("\n");
                msg.append("The repository ignores needed CMS node metaclasses: ");
                msg.append(missing);
                msg.append(".");
            }
            
            throw new IncompatibleVersionException(msg.toString());
        }*/
    }

    /**
     * @return the current version.
     */
    @objid ("271375a1-f959-4244-8b33-fa09bb00636a")
    public static RepositoryVersions current() {
        return new RepositoryVersions();
    }

    /**
     * Tells the repository format is not compatible with the current format.
     */
    @objid ("1c14b4bf-ede9-44b0-b075-f83c7294786c")
    public static class IncompatibleVersionException extends IOException {
        @objid ("ce27da4d-9233-4d87-8f1c-bdadeaf14bd6")
        private static final long serialVersionUID = 1L;

        /**
         * Constructs an <code>IncompatibleVersionException</code> with the specified detail message.
         * @param message the message
         */
        @objid ("aee7c652-11d3-4734-bb35-5b661972a21e")
        public IncompatibleVersionException(String message) {
            super(message);
        }

    }

}
