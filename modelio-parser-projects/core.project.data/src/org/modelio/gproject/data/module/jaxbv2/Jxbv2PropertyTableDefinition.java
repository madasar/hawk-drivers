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
                                    

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.07.08 at 06:09:31 PM CEST
//
package org.modelio.gproject.data.module.jaxbv2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for _PropertyTableDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_PropertyTableDefinition">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="Jxbv2PropertyDefinition" type="{}_PropertyDefinition" maxOccurs="unbounded"/>
 * &lt;/sequence>
 * &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="uid" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("82736df9-b101-48c1-803d-13d63092739d")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_PropertyTableDefinition", propOrder = {
    "propertyDefinition"
})
public class Jxbv2PropertyTableDefinition {
    @objid ("3dc81f9e-584f-4e5a-bf15-63dee2c30f8e")
    @XmlAttribute(name = "id", required = true)
    protected String id;

    @objid ("3b57954e-121b-4495-a120-d0ebe243e203")
    @XmlAttribute(name = "label")
    protected String label;

    @objid ("e19bb06a-d01c-45fa-9958-1734639f4e94")
    @XmlAttribute(name = "uid")
    protected String uid;

    @objid ("8aac24bd-c3dc-4fa1-aa58-cbf6e2a66064")
    @XmlElement(name = "PropertyDefinition", required = true)
    protected List<Jxbv2PropertyDefinition> propertyDefinition;

    /**
     * Gets the value of the propertyDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getPropertyDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jxbv2PropertyDefinition }
     */
    @objid ("81bcd34f-07d3-4eeb-86e6-ba58d2567e1b")
    public List<Jxbv2PropertyDefinition> getPropertyDefinition() {
        if (this.propertyDefinition == null) {
            this.propertyDefinition = new ArrayList<>();
        }
        return this.propertyDefinition;
    }

    /**
     * Gets the value of the id property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("28b28ab6-6761-4aed-83a7-89d6846c8cf5")
    public String getId() {
        return this.id;
    }

    /**
     * Sets the value of the id property.
     * @param value allowed object is
     * {@link String }
     */
    @objid ("a6080dad-e4ef-4d17-8818-d698c6137823")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the label property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("738d5552-aef8-4bba-ad1e-f2f9a94e27be")
    public String getLabel() {
        return this.label;
    }

    /**
     * Sets the value of the label property.
     * @param value allowed object is
     * {@link String }
     */
    @objid ("03cf0bad-65c2-42c5-bb6f-9e0b960454d8")
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the uid property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("7cdd8d2d-1fe1-4c9b-8583-c8e1bee3f57a")
    public String getUid() {
        return this.uid;
    }

    /**
     * Sets the value of the uid property.
     * @param value allowed object is
     * {@link String }
     */
    @objid ("0a136c65-5df8-4a4e-b1ea-4fa17dc412a4")
    public void setUid(String value) {
        this.uid = value;
    }

}