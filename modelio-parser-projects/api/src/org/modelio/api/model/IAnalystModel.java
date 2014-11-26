/*
 * Copyright 2013 Modeliosoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */  
                                    

package org.modelio.api.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;

/**
 * This class represents the root model of requirement classes.
 * <p>
 * <p>
 * Add the requirement containers and dictionaries can be accessed using this class.<br>
 * To get the current requirement model, please do as following:
 * <p>
 * <p>
 * <code>
 * IModelingSession session = Modelio.getInstance().getModelingSession();<br>
 * IAnalystModel = session.getRequirementModel();
 * </code>
 * <p>
 * <p>
 * This requirement model is accessible only if the Requirement MDAC is deployed in the project.
 * 
 * @see IUmlModel
 */
@objid ("c6139cd3-644e-11e0-b650-001ec947cd2a")
public interface IAnalystModel {
    /**
     * The name of the stereotype defining a Business Rule Container.
     */
    @objid ("8931416f-779f-11de-a429-001ec947ccaf")
    public static final String BUSINESS_RULE_CONTAINER_STEREOTYPE = "business_rule_container";

    /**
     * The name of the stereotype defining a Goal Container.
     */
    @objid ("892edf3d-779f-11de-a429-001ec947ccaf")
    public static final String GOAL_CONTAINER_STEREOTYPE = "goal_container";

    /**
     * The name of the stereotype defining a Requirement Container.
     */
    @objid ("892edf36-779f-11de-a429-001ec947ccaf")
    public static final String REQUIREMENT_CONTAINER_STEREOTYPE = "requirement_container";

    /**
     * The name of the stereotype defining a Business Rule.
     */
    @objid ("f05ecc34-9bb7-11de-80b3-001ec947ccaf")
    public static final String BUSINESS_RULE_STEREOTYPE = "business_rule";

    /**
     * The name of the stereotype defining a Business Rule PropertySet.
     */
    @objid ("f0612e5e-9bb7-11de-80b3-001ec947ccaf")
    public static final String BUSINESS_RULE_PROPERTYSET_STEREOTYPE = "business_rule_propertyset";

    /**
     * The name of the stereotype defining a Business Rule Diagram.
     */
    @objid ("f0612e65-9bb7-11de-80b3-001ec947ccaf")
    public static final String BUSINESS_RULE_DIAGRAM_STEREOTYPE = "business_rule_diagram";

    /**
     * The name of the stereotype defining a Dictionary Diagram.
     */
    @objid ("f0612e6c-9bb7-11de-80b3-001ec947ccaf")
    public static final String DICTIONARY_DIAGRAM_STEREOTYPE = "dictionary_diagram";

    /**
     * The name of the stereotype defining a Goal.
     */
    @objid ("f06390bc-9bb7-11de-80b3-001ec947ccaf")
    public static final String GOAL_STEREOTYPE = "goal";

    /**
     * The name of the stereotype defining a Goal PropertySet.
     */
    @objid ("f06390c3-9bb7-11de-80b3-001ec947ccaf")
    public static final String GOAL_PROPERTYSET_STEREOTYPE = "goal_propertyset";

    /**
     * The name of the stereotype defining a Goal Diagram.
     */
    @objid ("f065f313-9bb7-11de-80b3-001ec947ccaf")
    public static final String GOAL_DIAGRAM_STEREOTYPE = "goal_diagram";

    /**
     * The name of the stereotype defining a Requirement.
     */
    @objid ("f0685565-9bb7-11de-80b3-001ec947ccaf")
    public static final String REQUIREMENT_STEREOTYPE = "requirement";

    /**
     * The name of the stereotype defining a Requirement PropertySet.
     */
    @objid ("f068556c-9bb7-11de-80b3-001ec947ccaf")
    public static final String REQUIREMENT_PROPERTYSET_STEREOTYPE = "requirement_propertyset";

    /**
     * The name of the stereotype defining a Requirement Diagram.
     */
    @objid ("f0685573-9bb7-11de-80b3-001ec947ccaf")
    public static final String REQUIREMENT_DIAGRAM_STEREOTYPE = "requirement_diagram";

    /**
     * Create a new BusinessRule without container.<br>
     * The returned BusinessRule has to be added in the BusinessRule hierarchy.
     * @return The created BusinessRule
     */
    @objid ("ab0d493a-5a72-484f-ad81-87b313015c9e")
    BusinessRule createBusinessRule();

    /**
     * Create a new BusinessRule without container.<br>
     * The returned BusinessRule has to be added in the BusinessRule hierarchy.
     * @return The created BusinessRule
     */
    @objid ("925b5193-d746-4277-9d44-f420f3186166")
    BusinessRule createBusinessRule(String name, BusinessRule owner);

    /**
     * Create a new BusinessRule without container.<br>
     * The returned BusinessRule has to be added in the BusinessRule hierarchy.
     * @return The created BusinessRule
     */
    @objid ("82fb17ad-0155-4692-8cf8-faefa8e031da")
    BusinessRule createBusinessRule(String name, BusinessRuleContainer owner);

    /**
     * Create a new BusinessRule container without container.<br>
     * The returned BusinessRule container has to be added in the BusinessRule hierarchy.
     * @return The created BusinessRule container
     */
    @objid ("76e35cef-e5df-4934-89de-845f7e20b849")
    BusinessRuleContainer createBusinessRuleContainer();

    /**
     * Create a new BusinessRule container without container.<br>
     * The returned BusinessRule container has to be added in the BusinessRule hierarchy.
     * @return The created BusinessRule container
     */
    @objid ("2ec9e147-a3b3-47cc-8c6b-bf21ae2dea59")
    BusinessRuleContainer createBusinessRuleContainer(String name, BusinessRuleContainer owner);

    /**
     * Create a new dictionary without container.<br>
     * The returned dictionary has to be added in the dictionary hierarchy. The following example shows a creation of a
     * dictionary element directly in the root dictionary.
     * <p>
     * <p>
     * <code>
     * IModelingSession session = Modelio.getInstance().getModelingSession();<br>
     * IAnalystModel model = session.getRequirementModel();<br>
     * Dictionary root = model.getRootDictionary();<br><br>
     * 
     * Dictionary newDictionary = model.createDictionary();<br>
     * newDictionary.setName ("dic1");<br>
     * root.addOwned (newDictionary);
     * </code>
     * @return The created dictionary
     */
    @objid ("a3b4aa69-0ecc-11e2-96c4-002564c97630")
    Dictionary createDictionary();

    /**
     * Create a new dictionary without container.<br>
     * The returned dictionary has to be added in the dictionary hierarchy. The following example shows a creation of a
     * dictionary element directly in the root dictionary.
     * <p>
     * <p>
     * <code>
     * IModelingSession session = Modelio.getInstance().getModelingSession();<br>
     * IAnalystModel model = session.getRequirementModel();<br>
     * Dictionary root = model.getRootDictionary();<br><br>
     * 
     * Dictionary newDictionary = model.createDictionary();<br>
     * newDictionary.setName ("dic1");<br>
     * root.addOwned (newDictionary);
     * </code>
     * @return The created dictionary
     */
    @objid ("e6abd686-be91-4e2f-9291-29b1eb5d84d6")
    Dictionary createDictionary(String name, Dictionary owner);

    /**
     * Create a new goal without container.<br>
     * The returned goal has to be added in the goal hierarchy.
     * @return The created goal
     */
    @objid ("aff1da96-2880-40dc-a8b6-bb1bbd64b446")
    Goal createGoal();

    /**
     * Create a new goal without container.<br>
     * The returned goal has to be added in the goal hierarchy.
     * @return The created goal
     */
    @objid ("6c5644c2-6bad-4e47-97a3-674190d8f2c8")
    Goal createGoal(String name, GoalContainer owner);

    /**
     * Create a new goal without container.<br>
     * The returned goal has to be added in the goal hierarchy.
     * @return The created goal
     */
    @objid ("183d2ebe-84c4-4ee0-afd5-be2a72adc479")
    Goal createGoal(String name, Goal owner);

    /**
     * Create a new goal container without container.<br>
     * The returned goal container has to be added in the goal hierarchy.
     * @return The created goal container
     */
    @objid ("792aad7e-70cf-4673-beaf-d40a461b1fc7")
    GoalContainer createGoalContainer();

    /**
     * Create a new goal container without container.<br>
     * The returned goal container has to be added in the goal hierarchy.
     * @return The created goal container
     */
    @objid ("63316c04-aa11-4b82-9d98-a5e5e6ce53fb")
    GoalContainer createGoalContainer(String name, GoalContainer owner);

    /**
     * Create a new enumerated property type.<br>
     * The returned property type has to be added in the admin requirement model, using the
     * {@link IAnalystModel#addPropertyType(PropertyType)} method.
     * @see IAnalystModel#addPropertyType(PropertyType)
     * @return The created enumerated property type
     */
    @objid ("a3b4d177-0ecc-11e2-96c4-002564c97630")
    EnumeratedPropertyType createEnumeratedPropertyType();

    /**
     * Create a new requirement without container.<br>
     * The returned requirement has to be added in the requirement container hierarchy. The following example shows the
     * creation of a requirement directly in the root requirement container.
     * <p>
     * <p>
     * <code>
     * IModelingSession session = Modelio.getInstance().getModelingSession();<br>
     * IAnalystModel model = session.getRequirementModel();<br>
     * RequirementContainer root = model.getRootContainer();<br><br>
     * 
     * Requirement newRequirement = model.createRequirement();<br>
     * newRequirement.setName ("req1");<br>
     * newRequirement.setText ("All the methods have to be documented");<br>
     * root.addOwned (newRequirement);<br>
     * </code>
     * @return The created requirement
     */
    @objid ("a3b546aa-0ecc-11e2-96c4-002564c97630")
    Requirement createRequirement();

    /**
     * Create a new requirement without container.<br>
     * The returned requirement has to be added in the requirement container hierarchy. The following example shows the
     * creation of a requirement directly in the root requirement container.
     * <p>
     * <p>
     * <code>
     * IModelingSession session = Modelio.getInstance().getModelingSession();<br>
     * IAnalystModel model = session.getRequirementModel();<br>
     * RequirementContainer root = model.getRootContainer();<br><br>
     * 
     * Requirement newRequirement = model.createRequirement();<br>
     * newRequirement.setName ("req1");<br>
     * newRequirement.setText ("All the methods have to be documented");<br>
     * root.addOwned (newRequirement);<br>
     * </code>
     * @return The created requirement
     */
    @objid ("ef5f50dc-658d-49e5-8b78-8fc970ef020c")
    Requirement createRequirement(String name, Requirement owner);

    /**
     * Create a new requirement container without container.<br>
     * The returned requirement container has to be added in the requirement container hierarchy. The following example
     * shows the creation of a requirement container directly in the root requirement container.
     * <p>
     * <p>
     * <code>
     * IModelingSession session = Modelio.getInstance().getModelingSession();<br>
     * IAnalystModel model = session.getRequirementModel();<br>
     * RequirementContainer root = model.getRootContainer();<br><br>
     * 
     * RequirementContainer newRequirementContainer = model.createRequirement();<br>
     * newRequirementContainer.setName ("functional requirements");<br>
     * root.addOwned (newRequirementContainer);<br>
     * </code>
     * @return The created requirement container
     */
    @objid ("a3b546ad-0ecc-11e2-96c4-002564c97630")
    RequirementContainer createRequirementContainer();

    /**
     * Create a new requirement container without container.<br>
     * The returned requirement container has to be added in the requirement container hierarchy. The following example
     * shows the creation of a requirement container directly in the root requirement container.
     * <p>
     * <p>
     * <code>
     * IModelingSession session = Modelio.getInstance().getModelingSession();<br>
     * IAnalystModel model = session.getRequirementModel();<br>
     * RequirementContainer root = model.getRootContainer();<br><br>
     * 
     * RequirementContainer newRequirementContainer = model.createRequirement();<br>
     * newRequirementContainer.setName ("functional requirements");<br>
     * root.addOwned (newRequirementContainer);<br>
     * </code>
     * @return The created requirement container
     */
    @objid ("4ea9a87b-bca0-49fd-9e2e-a9b59b93d714")
    RequirementContainer createRequirementContainer(String name, RequirementContainer owner);

    /**
     * Create a new requirement without container.<br>
     * The returned requirement has to be added in the requirement container hierarchy. The following example shows the
     * creation of a requirement directly in the root requirement container.
     * <p>
     * <p>
     * <code>
     * IModelingSession session = Modelio.getInstance().getModelingSession();<br>
     * IAnalystModel model = session.getRequirementModel();<br>
     * RequirementContainer root = model.getRootContainer();<br><br>
     * 
     * Requirement newRequirement = model.createRequirement();<br>
     * newRequirement.setName ("req1");<br>
     * newRequirement.setText ("All the methods have to be documented");<br>
     * root.addOwned (newRequirement);<br>
     * </code>
     * @return The created requirement
     */
    @objid ("c4e4c7d1-cf92-48e5-a016-47aedbbee5e0")
    Requirement createRequirement(String name, RequirementContainer owner);

    /**
     * Create a new term without container.<br>
     * The returned term has to be added in the dictionary hierarchy. The following example shows the creation of a term
     * directly in the root dictionary.
     * <p>
     * <p>
     * <code>
     * IModelingSession session = Modelio.getInstance().getModelingSession();<br>
     * IAnalystModel model = session.getRequirementModel();<br>
     * Dictionary root = model.getRootDictionary();<br><br>
     * 
     * Term newTerm = model.createRequirement();<br>
     * newTerm.setName ("system");<br>
     * newTerm.setDefinition ("The system is the place where the program should run");<br>
     * root.addOwned (newTerm);<br>
     * </code>
     * @return The created requirement
     */
    @objid ("a3b56dbb-0ecc-11e2-96c4-002564c97630")
    Term createTerm();

    /**
     * Create a new term without container.<br>
     * The returned term has to be added in the dictionary hierarchy. The following example shows the creation of a term
     * directly in the root dictionary.
     * <p>
     * <p>
     * <code>
     * IModelingSession session = Modelio.getInstance().getModelingSession();<br>
     * IAnalystModel model = session.getRequirementModel();<br>
     * Dictionary root = model.getRootDictionary();<br><br>
     * 
     * Term newTerm = model.createRequirement();<br>
     * newTerm.setName ("system");<br>
     * newTerm.setDefinition ("The system is the place where the program should run");<br>
     * root.addOwned (newTerm);<br>
     * </code>
     * @return The created requirement
     */
    @objid ("f1e220c2-c311-4562-9948-aff62747b305")
    Term createTerm(String name, Dictionary owner);

    /**
     * Create a new property.<br>
     * The returned property has to be added to a property set, defined in the admin requirement model, using the
     * {@link PropertySet#getOwned()}
     * @see PropertySet#getOwned()
     * @return The created enumerated property type
     */
    @objid ("a3b4d17a-0ecc-11e2-96c4-002564c97630")
    PropertyDefinition createProperty();

    /**
     * Create a new enumeration litteral for the enumerated property type.<br>
     * The returned enumeration litteral has to be added to a enumerated property type.
     * @see EnumeratedPropertyType#getLitteral()
     * @return The created enumeration litteral
     */
    @objid ("a3b4f887-0ecc-11e2-96c4-002564c97630")
    PropertyEnumerationLitteral createPropertyEnumerationLitteral();

    /**
     * Create a new property set.<br>
     * The returned property set has to be added to the admin requirement model, using the
     * {@link IAnalystModel#addPropertySet(PropertySet)} method.
     * @see IAnalystModel#addPropertySet(PropertySet)
     * @return The created property set
     */
    @objid ("a3b4f88a-0ecc-11e2-96c4-002564c97630")
    PropertyTableDefinition createPropertySet();

    /**
     * Create a new simple property type.<br>
     * The returned property type has to be added to the admin requirement model, using the
     * {@link IAnalystModel#addPropertyType(PropertyType)} method.
     * @see IAnalystModel#addPropertyType(PropertyType)
     * @return The created property type
     */
    @objid ("a3b4f88d-0ecc-11e2-96c4-002564c97630")
    PropertyType createPropertyType();

    /**
     * Create a new property value set.<br>
     * The returned property value set has to be defined on the following elements: RequirementContainer, Requirement,
     * Dictionary, Term.
     * @see RequirementContainer#setDefaultSet(PropertyValueSet)
     * @see Requirement#setProperties(PropertyValueSet)
     * @see Dictionary#setDefaultSet(PropertyValueSet)
     * @see Term#setProperties(PropertyValueSet)
     * @return The created property value set
     */
    @objid ("a3b51f9d-0ecc-11e2-96c4-002564c97630")
    AnalystPropertyTable createPropertyTable();

    /**
     * Add a new property type in the requirement admin model.
     * <p>
     * <p>
     * New property types can be created, using the {@link IAnalystModel#createPropertyType()} method and can added
     * to this model through the use of this method.
     * @see #removePropertyType(PropertyType)
     * @param type property type
     */
    @objid ("a3b45c4a-0ecc-11e2-96c4-002564c97630")
    void addPropertyType(PropertyType type);

    /**
     * Get the list of known property types.
     * <p>
     * <p>
     * Default property types already exist and can be extended by the user. This method permits to return the list of
     * known property types.
     * @return The list of known property types.
     */
    @objid ("a3b43533-0ecc-11e2-96c4-002564c97630")
    List<PropertyType> getPropertyTypes();

    /**
     * Remove an existing property type from the requirement administration model.
     * @see #addPropertyType(PropertyType)
     * @param type property type
     */
    @objid ("a3b48356-0ecc-11e2-96c4-002564c97630")
    void removePropertyType(PropertyType type);

    /**
     * Add a new property set in the requirement administration model.
     * <p>
     * <p>
     * New property sets can be created, using the {@link IAnalystModel#createPropertySet()} method and can added to
     * this model through the use of this method.
     * @see #removePropertySet(PropertySet)
     * @param set property set
     */
    @objid ("a3b48359-0ecc-11e2-96c4-002564c97630")
    void addPropertySet(PropertyTableDefinition set);

    /**
     * Get the list of known property sets.
     * <p>
     * <p>
     * Default property sets already exist and can be extended by the user. This method permits to return the list of
     * known property sets.
     * @return The list of known property sets.
     */
    @objid ("a3b45c45-0ecc-11e2-96c4-002564c97630")
    List<PropertyTableDefinition> getPropertySets();

    /**
     * Remove an existing property set from the requirement administration model.
     * @see #addPropertySet(PropertySet)
     * @param set property set
     */
    @objid ("a3b4aa66-0ecc-11e2-96c4-002564c97630")
    void removePropertySet(PropertyTableDefinition set);

    /**
     * Get the main business rules container that owns the business rules elements.<br>
     * The requirement elements are the business rules containers and business rules.
     * @return The root business rules container
     */
    @objid ("a3b594cc-0ecc-11e2-96c4-002564c97630")
    List<BusinessRuleContainer> getRootBusinessRuleContainer();

    /**
     * Get the main dictionary that owns the sub dictionaries and terms.
     * @return The root dictionary
     */
    @objid ("a3b594cf-0ecc-11e2-96c4-002564c97630")
    List<Dictionary> getRootDictionary();

    /**
     * Get the main goal container that owns the goal elements.<br>
     * The requirement elements are the goal containers and goals.
     * @return The root goal container
     */
    @objid ("a3b5bbde-0ecc-11e2-96c4-002564c97630")
    List<GoalContainer> getRootGoalContainer();

    /**
     * Get the main requirement container that owns the requirement elements.<br>
     * The requirement elements are the requirement containers and requirements.
     * @return The root requirement container
     */
    @objid ("a3b5bbe1-0ecc-11e2-96c4-002564c97630")
    List<RequirementContainer> getRootRequirementContainer();

}
