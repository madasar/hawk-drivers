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
                                    

package org.modelio.gproject.model.facilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystContainer;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.factory.ModelFactory;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This helper is in charge of synchronizing the AnalystProperties between AnalystElements and AnalystContainers.
 * <p>
 * Using this helper should prevent the rule E291 from triggering: <i>Analyst elements must be of the same type as their composition owner.</i>
 * </p>
 */
@objid ("4a02278c-d7ce-4977-a934-0896e06d78af")
public class AnalystPropertiesHelper {
    @objid ("b7c4ab87-0cb7-4593-8485-130aaf4cff5a")
    public static <T extends AnalystElement> void synchronizeAnalystProperties(T referenceElement, List<T> toSynchronize) {
        synchronizeAnalystProperties(referenceElement.getAnalystProperties(), toSynchronize);
    }

    /**
     * Change the edited analyst container type.
     * @param newType the new type, must be a {@link PropertyTableDefinition}.
     */
    @objid ("2358051b-0bf8-45ca-bc34-8ec704e4e5e9")
    public static <T extends AnalystElement> void synchronizeAnalystProperties(AnalystContainer referenceElement, List<T> toSynchronize) {
        synchronizeAnalystProperties(referenceElement.getAnalystProperties(), toSynchronize);
    }

    /**
     * Change the edited analyst container type.
     * @param newType the new type, must be a {@link PropertyTableDefinition}.
     */
    @objid ("dad0464a-09ed-4c76-9c05-f8563e6ba07d")
    public static void synchronizeAnalystProperties(AnalystPropertyTable referencePropertyTable, List<? extends AnalystElement> toSynchronize) {
        final PropertyTableDefinition referenceProperties = referencePropertyTable != null ? referencePropertyTable.getType() : null;
        
        // Apply all new properties
        for (final AnalystElement elt : toSynchronize) {
            applyNewPropertySet(referenceProperties, elt);
        
            // Recurse on children
            List<AnalystElement> analystChildren = new ArrayList<>();
            for (MObject child : elt.getCompositionChildren()) {
                if (child instanceof AnalystElement && ! toSynchronize.contains(child)) {
                    analystChildren.add((AnalystElement) child);
                }
            }
            synchronizeAnalystProperties(referencePropertyTable, analystChildren);
        }
    }

    @objid ("a71b414b-a6af-4e45-ae56-4efe0820c507")
    private static void applyNewPropertySet(PropertyTableDefinition referenceProperties, AnalystElement toSynchronize) {
        AnalystPropertyTable outdatedPropertyTable = toSynchronize.getAnalystProperties();
        if (outdatedPropertyTable == null) {
            // Create a new property table
            outdatedPropertyTable = ModelFactory.getFactory(toSynchronize).createAnalystPropertyTable();
            outdatedPropertyTable.setOwner(toSynchronize);
            outdatedPropertyTable.setType(null);
        }
        
        // Set the new type
        outdatedPropertyTable.setType(referenceProperties);
        
        if (referenceProperties == null) {
            // If setting type to null, empty the values.
            outdatedPropertyTable.setContent(new Properties());
        } else {
            // Clean invalid property values, keep the corresponding ones
            keepValidValues(referenceProperties, outdatedPropertyTable);
        
            // Add all missing values
            addMissingValues(referenceProperties, outdatedPropertyTable);
        }
    }

    @objid ("b56518dc-287b-47ed-b6f8-07f07e57e564")
    private static void keepValidValues(PropertyTableDefinition referenceProperties, AnalystPropertyTable outdatedPropertyTable) {
        Properties toUpdate = outdatedPropertyTable.toProperties();
        
        Properties newProps = new Properties();
        for (PropertyDefinition  referenceProperty: referenceProperties.getOwned()) {
            String name = referenceProperty.getName();
            String value = toUpdate.getProperty(name);
        
            // Keep values corresponding to a reference property
            if (value != null) {
                newProps.setProperty(name, value);
            }
        }
        outdatedPropertyTable.setContent(newProps);
    }

    @objid ("94090b69-d53a-4e80-9bfe-f821bc2e4499")
    private static void addMissingValues(PropertyTableDefinition referenceProperties, AnalystPropertyTable outdatedPropertyTable) {
        Properties toUpdate = outdatedPropertyTable.toProperties();
        
        boolean diff = false;
        for (PropertyDefinition referenceProperty : referenceProperties.getOwned()) {
            String key = referenceProperty.getName();
        
            // Set a value for each missing property
            if (! toUpdate.containsKey(key)) {
                toUpdate.setProperty(key, referenceProperty.getDefaultValue());
                diff = true;
            }
        }
        
        // Optimization: store the content only if a property was missing
        if (diff) {
            outdatedPropertyTable.setContent(toUpdate);
        }
    }

}
