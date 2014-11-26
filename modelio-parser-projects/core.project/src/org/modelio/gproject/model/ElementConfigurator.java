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
                                    

package org.modelio.gproject.model;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystContainer;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GenericAnalystElement;
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityParameterNode;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.visitors.DefaultModelVisitor;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.model.IModel;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Default implementation of {@link IElementConfigurator}.
 */
@objid ("dc130502-e9e1-41d8-9e62-ee45aae6a134")
public class ElementConfigurator implements IElementConfigurator {
    /**
     * Property name for {@link #configure(IModelFactory, MObject, Map)}
     * to configure aggregation kind for associations.
     */
    @objid ("9ba6a0e8-6ef8-47f1-b976-29f2b5117786")
    public static final String AGGREGATION = "aggregation";

    @objid ("af9a094d-544e-4695-9e49-af785ce51313")
    private ElementConfiguratorVisitor visitor;

    /**
     * Property name for {@link #configure(IModelFactory, MObject, Map)}
     * to configure activity nodes and activity parameters.
     */
    @objid ("f4629918-aa7f-4ea8-93ee-00f36a7a1406")
    public static final Object COMPLETE = "complete";

    @objid ("4cb27afe-9379-478d-88e7-23e973100aab")
    @Override
    public void configure(IModelFactory modelFactory, MObject element, Map<String, Object> properties) {
        this.visitor = new ElementConfiguratorVisitor(modelFactory, CoreSession.getSession(element).getModel(), properties);
        element.accept(this.visitor);
    }

    @objid ("ddc02cb7-9098-41cd-8fbf-3b83fe4b4fd4")
    private static class ElementConfiguratorVisitor extends DefaultModelVisitor {
        @objid ("27c7211c-965c-4162-979f-a6fa9ecfd423")
        private Map<String, Object> properties;

        @objid ("78e24877-afec-4a4f-9c1f-1699eb0e8fa4")
        private IModelFactory modelFactory;

        @objid ("35bd156b-1285-4550-bc7e-8b57ab1a4c8a")
        private final PropertyTableDefinition DEFAULT_BUSINESSRULE_TABLE;

        @objid ("373eeffb-cc05-4911-80b9-9baf2d3e53cc")
        private final PropertyTableDefinition DEFAULT_DICTIONARY_TABLE;

        @objid ("dcea93c1-e1a0-4a28-ac6b-6752c0f0215f")
        private final PropertyTableDefinition DEFAULT_GOAL_TABLE;

        @objid ("a73901af-cfe0-44f3-8e54-de97e59a916c")
        private final PropertyTableDefinition DEFAULT_REQUIREMENT_TABLE;

        @objid ("7ed29b5d-701a-496d-90a0-b9f78aaf7b2f")
        private final PropertyTableDefinition DEFAULT_GENERIC_TABLE;

        @objid ("63ae6187-35f0-4867-a7a2-71b87a0ccc14")
        @Override
        public Object visitAssociationEnd(AssociationEnd theAssociationEnd) {
            AggregationKind v = theAssociationEnd.getAggregation();
            String prop = (String) this.properties.get(AGGREGATION);
            if (prop != null) {
                v = AggregationKind.valueOf(prop);
            }
            if (v != null) {
                theAssociationEnd.setAggregation(v);
            
                if (v == AggregationKind.KINDISCOMPOSITION) {
                    AssociationEnd opposite = theAssociationEnd.getOpposite();
                    opposite.setMultiplicityMin("1");
                    opposite.setMultiplicityMax("1");
                } else if (v == AggregationKind.KINDISAGGREGATION) {
                    AssociationEnd opposite = theAssociationEnd.getOpposite();
                    opposite.setMultiplicityMin("0");
                    opposite.setMultiplicityMax("1");
                } else {
                    theAssociationEnd.setMultiplicityMin("0");
                    theAssociationEnd.setMultiplicityMax("1");
                }
            
            }
            return super.visitAssociationEnd(theAssociationEnd);
        }

        @objid ("817bbef7-90c2-4cec-a610-8e734d8ef1cf")
        @Override
        public Object visitActivityParameterNode(ActivityParameterNode theActivityParameterNode) {
            if (this.properties.containsKey(COMPLETE)) {
                // Create the behavior parameter
                final BehaviorParameter param = this.modelFactory.createBehaviorParameter();
            
                final Activity activity = theActivityParameterNode.getOwner();
                activity.getParameter().add(param);
            
                // Associate the behavior parameter to the activity parameter
                // node.
                theActivityParameterNode.setRepresentedRealParameter(param);
                theActivityParameterNode.setName(param.getName());
            
            }
            return theActivityParameterNode;
        }

        @objid ("f60cb054-fcdb-4438-968e-775c45223d97")
        @Override
        public Object visitObjectNode(ObjectNode theObjectNode) {
            if (this.properties.containsKey(COMPLETE)) {
                // Create a variable in the activity local collaboration
                final Activity activity = getActivity(theObjectNode);
                final Collaboration locals = getLocalCollaboration(activity);
                final BindableInstance var = this.modelFactory.createBindableInstance();
            
                var.setOwner(locals);
            
                // Let the node reference the variable
                theObjectNode.setRepresented(var);
                theObjectNode.setName(var.getName());
            
            }
            return theObjectNode;
        }

        @objid ("20d7484e-d060-458f-bca5-9f0aa4805d61")
        private Collaboration getLocalCollaboration(Activity activity) {
            final List<Collaboration> collabs = activity.getOwnedCollaboration();
            // Return the first collaboration names "locals"
            for (Collaboration c : collabs) {
                if (c.getName().equals("locals")) {
                    return c;
                }
            }
            
            // Return the first collaboration
            if (!collabs.isEmpty()) {
                return collabs.get(0);
            }
            
            // Create a "locals" collaboration and return it.
            final Collaboration created = this.modelFactory.createCollaboration();
            created.setName("locals");
            activity.getOwnedCollaboration().add(created);
            return created;
        }

        @objid ("855c3284-47dd-4605-8baa-f71c264ff051")
        private static Activity getActivity(ActivityNode aNode) {
            MObject o = aNode;
            
            while (o != null && !(o instanceof Activity)) {
                o = o.getCompositionOwner();
            }
            return (Activity) o;
        }

        @objid ("51cb5419-3b26-4681-9691-e615a05bb706")
        public ElementConfiguratorVisitor(IModelFactory modelFactory, IModel iModel, Map<String, Object> properties) {
            this.modelFactory = modelFactory;
            this.properties = properties;
            
            // Load default property tables for analyst elements
            this.DEFAULT_REQUIREMENT_TABLE = iModel.findById(PropertyTableDefinition.class,
                    UUID.fromString("00080cf0-0000-001a-0000-000000000000"));
            this.DEFAULT_DICTIONARY_TABLE = iModel.findById(PropertyTableDefinition.class,
                    UUID.fromString("01ec152c-0000-144f-0000-000000000000"));
            this.DEFAULT_GOAL_TABLE = iModel.findById(PropertyTableDefinition.class,
                    UUID.fromString("00bc470c-0000-0018-0000-000000000000"));
            this.DEFAULT_BUSINESSRULE_TABLE = iModel.findById(PropertyTableDefinition.class,
                    UUID.fromString("00bc470c-0000-0019-0000-000000000000"));
            
            // Use the same default table as requirement
            this.DEFAULT_GENERIC_TABLE = this.DEFAULT_REQUIREMENT_TABLE;
        }

        /**
         * Initialize the {@link AnalystPropertyTable} for a new
         * {@link AnalystContainer}.
         * <p>
         * The initialization algorithm has 3 cases:
         * <ul>
         * <li>If the owner container has a table definition and no values,
         * reference the table definition and take all default values from the
         * property definitions.</li>
         * <li>If the owner container has a table definition and defines
         * specific values, copy those values.</li>
         * <li>If the owner container is missing or without table definition,
         * find the default table definition all take default values from it.</li>
         * </ul>
         * </p>
         * @param newElement the element to initialize.
         * @param owner the owner to take default properties from.
         * @param defaultType the default property table definition.
         */
        @objid ("6e0f7d32-c68c-45ed-9774-a87dc0b49452")
        private void initializeAnalystProperties(AnalystContainer newElement, AnalystContainer owner, PropertyTableDefinition defaultType) {
            AnalystPropertyTable newPropertyTable = newElement.getAnalystProperties();
            if (newPropertyTable == null) {
                // Create the new property table
                newPropertyTable = this.modelFactory.createAnalystPropertyTable();
                newElement.setAnalystProperties(newPropertyTable);
            }
            
            // Use same property table as parent
            PropertyTableDefinition ownerTableDef = owner != null ? owner.getAnalystProperties().getType() : null;
            if (ownerTableDef == null) {
                // Parent provides neither default property value set nor
                // property set: look for default table definition
                ICoreSession session = CoreSession.getSession(newElement);
            
                PropertyTableDefinition defaultTableDef = defaultType;
            
                // When predefined types are missing, take the first table...
                if (defaultTableDef == null) {
                    for (PropertyTableDefinition table : session.getModel().findByClass(PropertyTableDefinition.class)) {
                        defaultTableDef = table;
                        break;
                    }
                }
            
                if (defaultTableDef != null && !defaultTableDef.equals(newPropertyTable.getType())) {
                    // Add references to the property table
                    newPropertyTable.setType(defaultTableDef);
            
                    // Take default values from the property table
                    for (PropertyDefinition propertyDef : defaultTableDef.getOwned()) {
                        newPropertyTable.setProperty(propertyDef, propertyDef.getDefaultValue());
                    }
                } else {
                    // No default table found, the core audit will be
                    // triggered...
                }
            } else if (!ownerTableDef.equals(newPropertyTable.getType())) {
                // Add references to the property table
                newPropertyTable.setType(ownerTableDef);
            
                // Take values from the parent
                AnalystPropertyTable ownerValues = owner != null ? owner.getAnalystProperties() : null;
                if (ownerValues != null) {
                    newPropertyTable.setContent(ownerValues.toProperties());
                } else {
                    // No values on parent, take default values from the
                    // property table
                    for (PropertyDefinition propertyDef : ownerTableDef.getOwned()) {
                        newPropertyTable.setProperty(propertyDef, propertyDef.getDefaultValue());
                    }
                }
            }
        }

        /**
         * Initialize the {@link AnalystPropertyTable} for a new
         * {@link AnalystElement}. Gets the default properties and copy all its
         * values.
         * @param newElement the element to initialize.
         */
        @objid ("2e6f2a2c-b61a-487e-8644-49fd20f17375")
        private void initializeAnalystProperties(AnalystElement newElement) {
            AnalystPropertyTable defaultValues = newElement.getDefaultProperties();
            if (defaultValues != null) {
                // Create the new property table
                AnalystPropertyTable newPropertyTable = this.modelFactory.createAnalystPropertyTable();
                newElement.setAnalystProperties(newPropertyTable);
            
                // Add references to the property table
                newPropertyTable.setType(defaultValues.getType());
            
                // Take values from the default
                newPropertyTable.setContent(defaultValues.toProperties());
            }
            
            // If no parent table is found, no AnalystPropertyTable is
            // created...
        }

        @objid ("46709b93-3959-4c85-aed4-af81cb684604")
        @Override
        public Object visitBusinessRule(BusinessRule theBusinessRule) {
            initializeAnalystProperties(theBusinessRule);
            return super.visitBusinessRule(theBusinessRule);
        }

        @objid ("86eb4ec9-d1ac-4f23-919d-a5963b5d7893")
        @Override
        public Object visitBusinessRuleContainer(BusinessRuleContainer theBusinessRuleContainer) {
            BusinessRuleContainer ownerBusinessRuleContainer = theBusinessRuleContainer.getOwnerContainer();
            
            initializeAnalystProperties(theBusinessRuleContainer, ownerBusinessRuleContainer, this.DEFAULT_BUSINESSRULE_TABLE);
            return super.visitBusinessRuleContainer(theBusinessRuleContainer);
        }

        @objid ("5ff6a43d-b8e7-4726-8cdf-f05fd97cce1f")
        @Override
        public Object visitDictionary(Dictionary theDictionary) {
            Dictionary ownerDictionary = theDictionary.getOwnerDictionary();
            
            initializeAnalystProperties(theDictionary, ownerDictionary, this.DEFAULT_DICTIONARY_TABLE);
            return super.visitDictionary(theDictionary);
        }

        @objid ("7d977db9-fea8-4c83-b126-a5c78b17b609")
        @Override
        public Object visitGoal(Goal theGoal) {
            initializeAnalystProperties(theGoal);
            return super.visitGoal(theGoal);
        }

        @objid ("d7fe6ba0-e0ca-4bf6-acb3-5eddbee3a6dd")
        @Override
        public Object visitGoalContainer(GoalContainer theGoalContainer) {
            GoalContainer ownerGoalContainer = theGoalContainer.getOwnerContainer();
            
            initializeAnalystProperties(theGoalContainer, ownerGoalContainer, this.DEFAULT_GOAL_TABLE);
            return super.visitGoalContainer(theGoalContainer);
        }

        @objid ("a70521ac-f4cf-4ee0-8cd5-e56d8b8fea65")
        @Override
        public Object visitRequirement(Requirement theRequirement) {
            initializeAnalystProperties(theRequirement);
            return super.visitRequirement(theRequirement);
        }

        @objid ("9dab826d-47af-4db1-b226-20a1050ec190")
        @Override
        public Object visitRequirementContainer(RequirementContainer theRequirementContainer) {
            RequirementContainer ownerRequirementContainer = theRequirementContainer.getOwnerContainer();
            
            initializeAnalystProperties(theRequirementContainer, ownerRequirementContainer, this.DEFAULT_REQUIREMENT_TABLE);
            return super.visitRequirementContainer(theRequirementContainer);
        }

        @objid ("2e69dc2b-9a5b-440e-8860-5f319c87014a")
        @Override
        public Object visitTerm(Term theTerm) {
            initializeAnalystProperties(theTerm);
            return super.visitTerm(theTerm);
        }

        @objid ("5e92fed9-ec20-46c7-af6c-e704e446d630")
        @Override
        public Object visitGenericAnalystElement(GenericAnalystElement obj) {
            initializeAnalystProperties(obj);
            return super.visitGenericAnalystElement(obj);
        }

        @objid ("3a7cdf56-5cde-4771-a747-d5ef239fb437")
        @Override
        public Object visitGenericAnalystContainer(GenericAnalystContainer obj) {
            GenericAnalystContainer ownerContainer = obj.getOwnerContainer();
            
            initializeAnalystProperties(obj, ownerContainer, this.DEFAULT_GENERIC_TABLE);
            return super.visitGenericAnalystContainer(obj);
        }

    }

}
