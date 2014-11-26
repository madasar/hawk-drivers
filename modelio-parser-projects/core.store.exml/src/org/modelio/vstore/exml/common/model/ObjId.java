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
                                    

package org.modelio.vstore.exml.common.model;

import java.io.IOException;
import java.io.Serializable;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MRef;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * Represents an object identifier.
 */
@objid ("fd26ba09-5986-11e1-991a-001ec947ccaf")
public final class ObjId implements Serializable {
    /**
     * Object name.
     */
    @objid ("fd1f92d1-5986-11e1-991a-001ec947ccaf")
    public String name;

    @objid ("e8195f72-55ba-11e2-81b0-001ec947ccaf")
    private static final long serialVersionUID = 1111222233334444555L;

    /**
     * Object identifier.
     */
    @objid ("fd21f564-5986-11e1-991a-001ec947ccaf")
    public UUID id;

    /**
     * Object metaclass
     */
    @objid ("fd21f565-5986-11e1-991a-001ec947ccaf")
    public SmClass classof;

    /**
     * Empty constructor
     */
    @objid ("fd245760-5986-11e1-991a-001ec947ccaf")
    public ObjId() {
    }

    /**
     * Constructor from a {@link SmObjectImpl}.
     * @param object a model object.
     */
    @objid ("fd24575e-5986-11e1-991a-001ec947ccaf")
    public ObjId(SmObjectImpl object) {
        this.id = object.getUuid();
        this.name = object.getName();
        this.classof = object.getClassOf();
    }

    /**
     * Constructor.
     * @param classof the metaclass
     * @param name the object name
     * @param id the object identifier.
     */
    @objid ("fd24574d-5986-11e1-991a-001ec947ccaf")
    public ObjId(SmClass classof, final String name, final UUID id) {
        this.classof = classof;
        this.name = name;
        this.id = id;
    }

    /**
     * Indicates whether some other ObjId is "equal to" this one.
     * @param other another ObjId
     * @return <code>true</code> if they are equal else <code>false</code>
     */
    @objid ("fd21f729-5986-11e1-991a-001ec947ccaf")
    public boolean equals(final ObjId other) {
        return (this.id.equals(other.id) && this.classof == other.classof);
    }

    @objid ("d5bf847d-6231-11e1-b31a-001ec947ccaf")
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.classof == null) ? 0 : this.classof.hashCode());
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        return result;
    }

    @objid ("d5bf8482-6231-11e1-b31a-001ec947ccaf")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        
        ObjId other = (ObjId) obj;
        if (this.classof == null) {
            if (other.classof != null)
                return false;
        } else if (!this.classof.equals(other.classof))
            return false;
        
        if (this.id == null) {
            if (other.id != null)
                return false;
        } else if (!this.id.equals(other.id))
            return false;
        return true;
    }

    @objid ("d503c743-7f1a-11e1-ba70-001ec947ccaf")
    @Override
    public String toString() {
        return "'"+this.name+"' {"+this.id+"} "+this.classof.getName()+" ObjId";
    }

    @objid ("e81bc1b3-55ba-11e2-81b0-001ec947ccaf")
    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(this.id);
        out.writeObject(this.name);
        out.writeObject(this.classof.getName());
    }

    @objid ("e81bc1b7-55ba-11e2-81b0-001ec947ccaf")
    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        this.id = (UUID) in.readObject();
        this.name = (String) in.readObject();
        this.classof = SmClass.getClass((String) in.readObject());
    }

    @objid ("d24d862c-7039-49f0-9e3e-12d0f2563ff5")
    public void init(SmObjectImpl object) {
        this.id = object.getUuid();
        this.name = object.getName();
        this.classof = object.getClassOf();
    }

    /**
     * Constructor from a MRef.
     * @param r a MRef.
     */
    @objid ("46271ae4-b0c9-4a20-926d-e8b6dd596f3a")
    public void init(MRef r) {
        this.classof = SmClass.getClass(r.mc);
        this.name = r.name;
        this.id = r.uuid;
    }

}
