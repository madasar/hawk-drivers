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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.infrastructure.properties;

import java.util.Properties;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;

@objid ("00688c1a-ec87-1098-b22e-001ec947cd2a")
public interface PropertyTable extends Element {
    /**
     * Get a property value.
     * @param key a property
     * @return its value or <code>null</code>.
     */
    @objid ("5652fdad-2826-11e2-bf07-001ec947ccaf")
    String getProperty(String key);

    /**
     * Set the property table content.
     * @param newContent the new table content.
     */
    @objid ("12071b01-282d-11e2-bf07-001ec947ccaf")
    void setContent(Properties newContent);

    /**
     * Set a property value.
     * @param key a property.
     * @param value its value.
     */
    @objid ("5652fdb0-2826-11e2-bf07-001ec947ccaf")
    void setProperty(String key, String value);

    /**
     * Get a copy of the property table content.
     * <p>
     * Modifying the returned Properties will not have any effect on
     * the PropertyTable.
     * @return a copy of the properties.
     * @throws java.lang.IllegalStateException if the 'Content' attribute has an illegal format.
     * This can only happen if {@link #setContent(String)} is called directly.
     */
    @objid ("5652fdb3-2826-11e2-bf07-001ec947ccaf")
    Properties toProperties() throws IllegalStateException;

    @objid ("5f8d2705-d82c-46ca-9d89-a9c31d6047a3")
    String getName();

    @objid ("a64b14a8-6159-4ed7-8c01-17ffbb3a64ac")
    void setName(String value);

    @objid ("d790f5d9-a118-471b-b544-cef5bd27287d")
    String getContent();

    @objid ("142b0b64-b2e0-46ef-a8e3-9ad37e7de95f")
    void setContent(String value);

    @objid ("6a9b1079-02a4-4753-9a32-4164052cdca3")
    ModelElement getOwner();

    @objid ("0b821166-8666-4e39-a919-1d7267e51a20")
    void setOwner(ModelElement value);

    @objid ("9e788e21-f97d-42e3-b633-d64bcd27fbeb")
    MatrixValueDefinition getOwnerValDef();

    @objid ("e19fe89d-f097-47e8-adcd-610182d14f75")
    void setOwnerValDef(MatrixValueDefinition value);

    @objid ("4fb0a3b1-69c0-4c0b-a620-bedadd9ed620")
    QueryDefinition getOwnerQuery();

    @objid ("2385fdef-c13a-449e-8c64-47dee38dd7de")
    void setOwnerQuery(QueryDefinition value);

}
