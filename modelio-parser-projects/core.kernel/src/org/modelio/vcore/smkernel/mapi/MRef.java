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
                                    

package org.modelio.vcore.smkernel.mapi;

import java.io.Serializable;
import java.util.UUID;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.DeadObjectException;

/**
 * Model object reference.
 * <p>
 * Allows to reference a model object that may or not be known. The reference is made of the object metaclass name, the object
 * identifier and optionally the object name.
 */
@objid ("7852f43e-13ae-11e2-8f8e-001ec947ccaf")
public class MRef implements Serializable {
    @objid ("710f777c-298c-11e2-8adc-001ec947ccaf")
    private static final long serialVersionUID = 1L;

    /**
     * Metaclass name.
     */
    @objid ("dcadb035-13af-11e2-8f8e-001ec947ccaf")
    public String mc;

    /**
     * Optional element name.
     */
    @objid ("dcb01263-13af-11e2-8f8e-001ec947ccaf")
    public String name;

    /**
     * Element UUID.
     */
    @objid ("dcadb008-13af-11e2-8f8e-001ec947ccaf")
    public UUID uuid;

    @objid ("79a0f2d3-200a-4bfb-8095-16620edd6336")
    private static final Pattern pattern = Pattern.compile("'?([^']*)'?\\s?\\{(.*)\\} (.*)");

    /**
     * Creates a reference for the given element.
     * @param element The element to reference.
     */
    @objid ("dcadb00c-13af-11e2-8f8e-001ec947ccaf")
    public MRef(MObject element) {
        this.mc = element.getMClass().getName();
        this.uuid = element.getUuid();
        try {
            this.name = element.getName();
        } catch (DeadObjectException e) {
            this.name = e.toString();
        }
    }

    /**
     * Creates a reference.
     * @param mc The metaclass name.
     * @param tuuid The UUID
     */
    @objid ("dcadb010-13af-11e2-8f8e-001ec947ccaf")
    public MRef(String mc, String tuuid) {
        this.mc = mc;
        this.uuid = UUID.fromString(tuuid);
        this.name = "";
    }

    /**
     * Creates a reference.
     * @param mc The metaclass name.
     * @param tuuid The UUID
     * @param name an object name, may be <code>null</code>.
     */
    @objid ("dcadb015-13af-11e2-8f8e-001ec947ccaf")
    public MRef(String mc, String tuuid, String name) {
        this.mc = mc;
        this.uuid = UUID.fromString(tuuid);
        this.name = name;
    }

    /**
     * Creates a reference.
     * @param mc The metaclass name.
     * @param tuuid The UUID
     * @param name an object name, may be <code>null</code>.
     */
    @objid ("dcadb01b-13af-11e2-8f8e-001ec947ccaf")
    public MRef(String mc, UUID tuuid, String name) {
        this.mc = mc;
        this.uuid = tuuid;
        this.name = name;
    }

    @objid ("dcadb021-13af-11e2-8f8e-001ec947ccaf")
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        
        if (obj.getClass() != getClass()) {
            return false;
        }
        
        final MRef other = (MRef) obj;
        return this.mc.equals(other.mc) && this.uuid.equals(other.uuid);
    }

    @objid ("dcadb027-13af-11e2-8f8e-001ec947ccaf")
    @Override
    public int hashCode() {
        return this.mc.hashCode() ^ this.uuid.hashCode();
    }

    /**
     * Produces a string representing this MRef object.
     * 
     * 'nnnn' {xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx} mmmmm
     * 
     * 
     * 'nnnn' = name {xxx...xx} = uuid mmmm = metaclass
     */
    @objid ("dcadb02c-13af-11e2-8f8e-001ec947ccaf")
    @Override
    public String toString() {
        final StringBuilder s = new StringBuilder(80);
        if (this.name != null) {
            s.append("'");
            s.append(this.name);
            s.append("' ");
        }
        s.append("{");
        s.append(this.uuid);
        s.append("} ");
        s.append(this.mc);
        return s.toString();
    }

    /**
     * Construct a MRef instance from a String whose format is the MRef.toString() format so that:<br>
     * given <i>mref</i> a MRef, <code>new MRef(mref.toString()).equals(mref)</code> is guaranteed to be <code>true</code>.
     * @param s a string
     */
    @objid ("21ba15fc-c3cd-4f9f-a436-e5ba1e769c3f")
    public MRef(String s) {
        final Matcher m = pattern.matcher(s);
        
        if (m.matches()) {
            final MatchResult r = m.toMatchResult();
            if (r.groupCount() == 3) {
        
                this.name = (r.group(1).isEmpty() ? null : r.group(1));
                this.uuid = UUID.fromString(r.group(2));
                this.mc = r.group(3);
            } else {
                throw new IllegalArgumentException("Invalid MRef string: " + s);
            }
        
        } else {
            throw new IllegalArgumentException("Invalid MRef string: " + s);
        }
    }

    /**
     * Test main method
     * @param argvs unused
     */
    @objid ("da2385d8-c837-4d49-8ca4-b1f489c67a88")
    public static void main(String[] argvs) {
        final String s1 = "'MRef' {7852f43e-13ae-11e2-8f8e-001ec947ccaf} Class";
        final MRef mref1 = new MRef(s1);
        
        System.out.println("   s1   = " + s1);
        System.out.println("mref1   = " + mref1.toString());
        System.out.println("control = " + new MRef(mref1.toString()).toString());
        
        final String s2 = "{7852f43e-13ae-11e2-8f8e-001ec947ccaf} Class";
        final MRef mref2 = new MRef(s2);
        
        System.out.println("   s2   = " + s2);
        System.out.println("mref2   = " + mref2.toString());
        System.out.println("control = " + new MRef(mref2.toString()).toString());
    }

}
