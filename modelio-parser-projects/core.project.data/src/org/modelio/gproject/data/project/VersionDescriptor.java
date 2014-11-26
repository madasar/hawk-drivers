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

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Describe a metamodel with its version.
 */
@objid ("2d145843-dd38-4faf-ad5d-d80e28f3e2b3")
public class VersionDescriptor {
    /**
     * The Modelio metamodel name.
     */
    @objid ("44183eb7-cb37-4962-b2c9-c39a173375da")
    public static final String MM_NAME = "Modelio";

    /**
     * Metamodel name.
     */
    @objid ("18ff3e4b-1d6a-4a73-b3ad-45cd7e2ec684")
    private String name;

    /**
     * Metamodel version.
     */
    @objid ("cda7838d-71fa-46ff-b20c-54b02fb6f204")
    private int version;

    /**
     * @return the metamodel name
     */
    @objid ("af8231a2-b5ce-4f78-a229-d0dc8fca9cf4")
    public String getName() {
        return this.name;
    }

    /**
     * @return the metamodel version
     */
    @objid ("c709442c-6c44-431a-b8a1-a2f72f8cf9f7")
    public int getVersion() {
        return this.version;
    }

    /**
     * @param name the metamodel name
     */
    @objid ("422d70a2-38c9-42fe-9548-ba3c116a0c0e")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param version the metamodel version
     */
    @objid ("79ba9bf5-8bb5-4f1f-9a4f-5e1beda13803")
    public void setVersion(int version) {
        this.version = version;
    }

    @objid ("5aba4bd6-1bd6-4aed-8530-c00faa115d12")
    @Override
    public String toString() {
        return this.name + " v"+ this.version;
    }

    @objid ("4a69221c-4186-4102-be73-897b76e5bf3f")
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + this.version;
        return result;
    }

    @objid ("2bdfe291-70f3-469f-b4df-7a6741886c6e")
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VersionDescriptor other = (VersionDescriptor) obj;
        if (this.name == null) {
            if (other.name != null)
                return false;
        } else if (!this.name.equals(other.name))
            return false;
        if (this.version != other.version)
            return false;
        return true;
    }

}
