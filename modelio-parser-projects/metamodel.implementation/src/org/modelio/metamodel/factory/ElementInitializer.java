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
                                    

package org.modelio.metamodel.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
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
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.factory.IElementInitializer;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyBaseType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.metamodel.visitors.DefaultModelVisitor;
import org.modelio.vbasic.log.Log;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.model.IModel;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Default implementation of IElementInitializer interface
 */
@objid ("b6a6cf95-5cc6-4247-a6e7-19cbeb513d4d")
public class ElementInitializer implements IElementInitializer {
    @mdl.prop
    @objid ("3dc85bd8-12f1-4cf7-b604-cfeced71c8b6")
    private VisibilityMode defaultAttributeVisibility = null;

    @mdl.propsetter
    public void setDefaultAttributeVisibility(VisibilityMode value) {
        // Automatically generated method. Please do not modify this code.
        this.defaultAttributeVisibility = value;
    }

    @objid ("85fdcd2d-f732-4c9d-a536-8e813523a41e")
    private ElementInitializerVisitor visitor;

    @mdl.prop
    @objid ("9829d7c2-4381-430d-94cf-9cb8c79e833c")
    private GeneralClass defaultAttributeType = null;

    @mdl.propsetter
    public void setDefaultAttributeType(GeneralClass value) {
        // Automatically generated method. Please do not modify this code.
        this.defaultAttributeType = value;
    }

    @mdl.prop
    @objid ("8cddabd5-993b-47f7-879b-b93991079984")
    private GeneralClass defaultParameterType = null;

    @mdl.propsetter
    public void setDefaultParameterType(GeneralClass value) {
        // Automatically generated method. Please do not modify this code.
        this.defaultParameterType = value;
    }

    @mdl.prop
    @objid ("95e11a9b-4828-4d62-9835-90bca017f5f6")
    private GeneralClass defaultReturnType = null;

    @mdl.propsetter
    public void setDefaultReturnType(GeneralClass value) {
        // Automatically generated method. Please do not modify this code.
        this.defaultReturnType = value;
    }

    @objid ("91f49635-0a29-48a4-a0a9-eeb7c0afbcc1")
    private Geometry geometry;

    @objid ("7561bc40-1ca4-49a0-bad9-9210a4cea736")
    @Override
    public void initialize(IModelFactory modelFactory, MObject element) {
        final IModel iModel = CoreSession.getSession(element).getModel();
        
        if (this.geometry == null || !this.geometry.matches(modelFactory, iModel))
            this.geometry = new Geometry(modelFactory, iModel);
        
        this.visitor = new ElementInitializerVisitor(modelFactory,  this.geometry);
        element.accept(this.visitor);
    }

    @objid ("59e9e4d9-cc4f-4007-abf2-da46b28cc8a0")
    @SuppressWarnings("synthetic-access")
    private class ElementInitializerVisitor extends DefaultModelVisitor {
        @objid ("3e38257c-b736-4c18-9bfe-dbcf73f95b3e")
        private IModelFactory modelFactory;

        @objid ("40ffee8b-5ec4-41b7-8f9a-3b277754e4c2")
        @SuppressWarnings("hiding")
        private Geometry geometry;

        @objid ("a340fee5-19dd-430c-9594-1a7a183e06ea")
        public ElementInitializerVisitor(final IModelFactory modelFactory, Geometry geometry) {
            this.modelFactory = modelFactory;
            this.geometry = geometry;
        }

        @objid ("2e657745-1c33-4ba7-a8b0-d1b2a5b803ba")
        @Override
        public Object visitAssociationEnd(AssociationEnd theAssociationEnd) {
            if (ElementInitializer.this.defaultAttributeVisibility != null)
                theAssociationEnd.setVisibility(ElementInitializer.this.defaultAttributeVisibility);
            return super.visitAssociationEnd(theAssociationEnd);
        }

        @objid ("f5ccb62c-5538-4557-8cff-a3cac1b671f0")
        @Override
        public Object visitAttribute(Attribute theAttribute) {
            if (ElementInitializer.this.defaultAttributeVisibility != null)
                theAttribute.setVisibility(ElementInitializer.this.defaultAttributeVisibility);
            
            theAttribute.setType(ElementInitializer.this.defaultAttributeType);
            
            // Init default multiplicity
            theAttribute.setMultiplicityMin("1");
            theAttribute.setMultiplicityMax("1");
            return theAttribute;
        }

        @objid ("70d01473-833b-4862-bc85-434b6c1aecf8")
        @Override
        public Object visitBpmnBoundaryEvent(final BpmnBoundaryEvent theBpmnBoundaryEvent) {
            theBpmnBoundaryEvent.setCancelActivity(true);
            return super.visitBpmnBoundaryEvent(theBpmnBoundaryEvent);
        }

        @objid ("d1cf8a68-98af-4caf-9df7-2950b61370ca")
        @Override
        public Object visitBusinessRuleContainer(BusinessRuleContainer theBusinessRuleContainer) {
            BusinessRuleContainer ownerBusinessRuleContainer = theBusinessRuleContainer.getOwnerContainer();
            
            initializeAnalystProperties(theBusinessRuleContainer, ownerBusinessRuleContainer, this.geometry.getDEFAULT_BUSINESSRULE_TABLE());
            return super.visitBusinessRuleContainer(theBusinessRuleContainer);
        }

        @objid ("3471a91c-8976-4451-b3af-776dd6f9ecbb")
        @Override
        public Object visitBusinessRule(BusinessRule theBusinessRule) {
            initializeAnalystProperties(theBusinessRule);
            return super.visitBusinessRule(theBusinessRule);
        }

        @objid ("c4249bd5-3e99-4782-99eb-1dfbe58ca32c")
        @Override
        public Object visitDictionary(Dictionary theDictionary) {
            Dictionary ownerDictionary = theDictionary.getOwnerDictionary();
            
            initializeAnalystProperties(theDictionary, ownerDictionary, this.geometry.getDEFAULT_DICTIONARY_TABLE());
            return super.visitDictionary(theDictionary);
        }

        @objid ("da6f8750-0550-4b21-aaeb-87b253a9da53")
        @Override
        public Object visitElementImport(ElementImport theElementImport) {
            // Visibility is private by default
            theElementImport.setVisibility(VisibilityMode.PRIVATE);
            return theElementImport;
        }

        @objid ("9a36ee48-8776-4b6f-aa0f-c6d636deee49")
        @Override
        public Object visitGoal(Goal theGoal) {
            initializeAnalystProperties(theGoal);
            return super.visitGoal(theGoal);
        }

        @objid ("e8ce535c-f399-4522-a5fd-e10f9dd44318")
        @Override
        public Object visitGoalContainer(GoalContainer theGoalContainer) {
            GoalContainer ownerGoalContainer = theGoalContainer.getOwnerContainer();
            
            initializeAnalystProperties(theGoalContainer, ownerGoalContainer, this.geometry.getDEFAULT_GOAL_TABLE());
            return super.visitGoalContainer(theGoalContainer);
        }

        @objid ("ce8433ba-7ae9-4e6d-a778-881c46288152")
        @Override
        public Object visitInternalTransition(final InternalTransition theInternalTransition) {
            theInternalTransition.setReceivedEvents("Do");
            return super.visitInternalTransition(theInternalTransition);
        }

        @objid ("8b6c7953-b1d9-44ee-859e-6790c67ff6f0")
        @Override
        public Object visitLinkEnd(final LinkEnd linkEnd) {
            AssociationEnd role = linkEnd.getModel();
            if (role != null) {
                // Copy instantiated role properties here.
                linkEnd.setMultiplicityMin(role.getMultiplicityMin());
                linkEnd.setMultiplicityMax(role.getMultiplicityMax());
                linkEnd.setIsOrdered(role.isIsOrdered());
                linkEnd.setIsUnique(role.isIsUnique());
            }
            return linkEnd;
        }

        @objid ("a00ea8f1-cdd9-4786-8a9d-8253b7d4fc58")
        @Override
        public Object visitNote(Note theNote) {
            if (theNote.getModel() == null) {
            
                theNote.setModel(this.geometry.getDescriptionNoteType());
            }
            return super.visitNote(theNote);
        }

        @objid ("5208b6b9-65f0-4993-9f71-1b0b15e744d1")
        @Override
        public Object visitPackageImport(PackageImport thePackageImport) {
            // Visibility is private by default
            thePackageImport.setVisibility(VisibilityMode.PRIVATE);
            return (thePackageImport);
        }

        @objid ("389216a1-7235-4a39-aa1a-f5eabd094035")
        @Override
        public Object visitParameter(Parameter theParameter) {
            // Init multiplicity
            theParameter.setMultiplicityMin("1");
            theParameter.setMultiplicityMax("1");
            
            if (theParameter.getReturned() != null) {
                theParameter.setType(ElementInitializer.this.defaultReturnType);
            } else {
                theParameter.setType(ElementInitializer.this.defaultParameterType);
            }
            return theParameter;
        }

        @objid ("7de82050-f379-40a5-80df-006ba3d1971d")
        @Override
        public Object visitPort(Port aPort) {
            aPort.setIsService(true);
            return aPort;
        }

        @objid ("56eb4a62-392b-47b6-96c0-2596e6f6c2f0")
        @Override
        public Object visitPropertyDefinition(PropertyDefinition thePropertyDefinition) {
            CoreSession session = CoreSession.getSession(thePropertyDefinition);
            
            // Take the first available type...
            for (PropertyType type : session.getModel().findByClass(PropertyType.class)) {
                thePropertyDefinition.setType(type);
                break;
            }
            return super.visitPropertyDefinition(thePropertyDefinition);
        }

        @objid ("e627a94e-13b4-4e9f-b624-87e7440cce16")
        @Override
        public Object visitRequirement(Requirement theRequirement) {
            initializeAnalystProperties(theRequirement);
            return super.visitRequirement(theRequirement);
        }

        @objid ("f23148f9-49ba-48d3-884d-11b7a4066e0d")
        @Override
        public Object visitRequirementContainer(RequirementContainer theRequirementContainer) {
            RequirementContainer ownerRequirementContainer = theRequirementContainer.getOwnerContainer();
            
            initializeAnalystProperties(theRequirementContainer, ownerRequirementContainer, this.geometry.getDEFAULT_REQUIREMENT_TABLE());
            return super.visitRequirementContainer(theRequirementContainer);
        }

        @objid ("d51323a8-65c6-4761-96fa-99b1c88086ea")
        @Override
        public Object visitTerm(Term theTerm) {
            initializeAnalystProperties(theTerm);
            return super.visitTerm(theTerm);
        }

        @objid ("c63ff4e7-57e8-4a8b-9473-4f92e6c0a8ea")
        @Override
        public Object visitTemplateBinding(final TemplateBinding aTemplateBinding) {
            // Call inherited behavior
            super.visitTemplateBinding(aTemplateBinding);
            
            List<TemplateParameter> parameters;
            final Operation op = aTemplateBinding.getInstanciatedTemplateOperation();
            final NameSpace ns = aTemplateBinding.getInstanciatedTemplate();
            if (op != null && aTemplateBinding.getBoundOperation() != null) {
                parameters = op.getTemplate();
            } else if (ns != null) {
                parameters = ns.getTemplate();
            } else {
                parameters = new ArrayList<>();
            }
            
            // Clear all obsolete TemplateParameterSubstitution
            for (TemplateParameterSubstitution sub : aTemplateBinding.getParameterSubstitution()) {
                if (!parameters.contains(sub.getFormalParameter())) {
                    sub.delete();
                }
            }
            
            // Create missing substitutions
            List<TemplateParameterSubstitution> substitutions = aTemplateBinding.getParameterSubstitution();
            List<TemplateParameter> substituedParameters = new ArrayList<>(substitutions.size());
            
            for (TemplateParameterSubstitution sub : substitutions) {
                substituedParameters.add(sub.getFormalParameter());
            }
            
            for (TemplateParameter param : parameters) {
                if (!substituedParameters.contains(param)) {
                    if (param.getDefaultType() == null && param.getDefaultValue().isEmpty()) {
                        TemplateParameterSubstitution newSub = this.modelFactory.createTemplateParameterSubstitution();
                        newSub.setFormalParameter(param);
                        newSub.setName(param.getName());
                        aTemplateBinding.getParameterSubstitution().add(newSub);
                    }
                }
            }
            return aTemplateBinding;
        }

        @objid ("111bba3f-a727-48ca-91e6-f6d1a4b7d1f9")
        @Override
        public Object visitUseCase(final UseCase theUseCase) {
            String content = "..."; // FIXME was :
            // CoreProject.I18N.getString("CreateUseCaseAction.None");
            String[] noteTypes = { "description", "constraint", "non-functional constraint", "exception", "precondition",
            "postcondition" };
            for (String noteType : noteTypes) {
                try {
                    if (theUseCase.getNote("ModelerModule", noteType) == null) {
                        this.modelFactory.createNote("ModelerModule", noteType, theUseCase, content);
                    }
                } catch (ExtensionNotFoundException e) {
                    Log.error(e);
                }
            }
            return super.visitUseCase(theUseCase);
        }

        @objid ("2d89f99b-bd96-4f5a-8672-4030351dd14b")
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

        @objid ("a9465b68-5ed5-4513-8abb-eaa7235498f4")
        private Activity getActivity(ActivityNode aNode) {
            MObject o = aNode;
            
            while (o != null && !(o instanceof Activity)) {
                o = o.getCompositionOwner();
            }
            return (Activity) o;
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
        @objid ("92cd7060-9424-4d1c-8eaf-77324c1d3695")
        private void initializeAnalystProperties(AnalystContainer newElement, AnalystContainer owner, PropertyTableDefinition defaultType) {
            // Create the new property table
            AnalystPropertyTable newPropertyTable = this.modelFactory.createAnalystPropertyTable();
            newElement.setAnalystProperties(newPropertyTable);
            
            // Use same property table as parent
            PropertyTableDefinition ownerTableDef = owner != null ? owner.getAnalystProperties().getType() : null;
            if (ownerTableDef != null) {
            
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
            } else {
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
            
                if (defaultTableDef != null) {
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
            }
        }

        /**
         * Initialize the {@link AnalystPropertyTable} for a new
         * {@link AnalystElement}. Gets the default properties and copy all its
         * values.
         * @param newElement the element to initialize.
         */
        @objid ("3409c8ae-cafd-454f-a8a6-ca9ae7d755c5")
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

        @objid ("a3d44185-71aa-4d43-81ee-8562520b8daa")
        @Override
        public Object visitEnumeratedPropertyType(EnumeratedPropertyType obj) {
            obj.setBaseType(PropertyBaseType.ENUMERATE);
            return super.visitEnumeratedPropertyType(obj);
        }

        @objid ("ffa22527-2f55-4dd0-bb91-917a54c9cbae")
        @Override
        public Object visitQueryDefinition(QueryDefinition theQueryDefinition) {
            if (theQueryDefinition.getParameters() == null) {
                final PropertyTable parameters = this.modelFactory.createPropertyTable();
                theQueryDefinition.setParameters(parameters);
            }
            return super.visitQueryDefinition(theQueryDefinition);
        }

        @objid ("48594e1b-44f4-4dd7-a01c-e6d8470182d3")
        @Override
        public Object visitMatrixValueDefinition(MatrixValueDefinition theMatrixValueDefinition) {
            if (theMatrixValueDefinition.getParameters() == null) {
                final PropertyTable parameters = this.modelFactory.createPropertyTable();
                theMatrixValueDefinition.setParameters(parameters);
            }
            return super.visitMatrixValueDefinition(theMatrixValueDefinition);
        }

        @objid ("29475959-b656-4227-9038-8b15edaf6007")
        @Override
        public Object visitGenericAnalystContainer(GenericAnalystContainer obj) {
            GenericAnalystContainer ownerContainer = obj.getOwnerContainer();
            
            initializeAnalystProperties(obj, ownerContainer, this.geometry.getDEFAULT_GENERIC_TABLE());
            return super.visitGenericAnalystContainer(obj);
        }

        @objid ("9f3d236c-7833-42fc-a4ee-c16479166b39")
        @Override
        public Object visitGenericAnalystElement(GenericAnalystElement obj) {
            initializeAnalystProperties(obj);
            return super.visitGenericAnalystElement(obj);
        }

    }

    /**
     * Some pointers into the current model.
     * <p>
     * All elements may not be available at the instantiation time.
     */
    @objid ("2f6980b7-0b44-4272-96d9-2e22d5045fda")
    private static class Geometry {
        @objid ("2560d39e-18f5-4f92-812b-73d56b12a3e9")
        private PropertyTableDefinition DEFAULT_REQUIREMENT_TABLE;

        @objid ("5f41da2a-a482-42fa-968d-b06202a30b57")
        private PropertyTableDefinition DEFAULT_DICTIONARY_TABLE;

        @objid ("96cc8184-0a07-48ac-a4dc-808cbb873b69")
        private PropertyTableDefinition DEFAULT_GOAL_TABLE;

        @objid ("b92da39a-bea3-41f4-8280-07d4b5361b75")
        private PropertyTableDefinition DEFAULT_BUSINESSRULE_TABLE;

        @objid ("ec4d1d3f-cd3d-46d3-b4ad-fb2f81ade47a")
        private final IModelFactory modelFactory;

        @objid ("2bf20c26-ac2c-42f9-920f-ac78e7ebb698")
        private final IModel iModel;

        @objid ("d6b5596a-ebf8-4c69-9d08-f9ae395e5dab")
        private NoteType descriptionNoteType;

        @objid ("ee90f00f-cb36-4415-93d5-35251e016e0b")
        private PropertyTableDefinition DEFAULT_GENERIC_TABLE;

        @objid ("f0e5a23e-573e-448d-88cd-55814eeb2040")
        public Geometry(final IModelFactory modelFactory, IModel iModel) {
            this.modelFactory = modelFactory;
            this.iModel = iModel;
            reset();
        }

        @objid ("6daf9357-cb15-4544-b1a8-291f00f78c0d")
        public boolean matches(IModelFactory amodelFactory, IModel aiModel) {
            return this.iModel==aiModel && this.modelFactory==amodelFactory;
        }

        @objid ("3543db57-734a-4171-84b3-48055e653ee1")
        public PropertyTableDefinition getDEFAULT_BUSINESSRULE_TABLE() {
            if (this.DEFAULT_BUSINESSRULE_TABLE == null || ! this.DEFAULT_BUSINESSRULE_TABLE.isValid())
                reset();
            return this.DEFAULT_BUSINESSRULE_TABLE;
        }

        @objid ("5b61cc91-9ba1-4095-a2e6-ae7e750fbd88")
        public PropertyTableDefinition getDEFAULT_DICTIONARY_TABLE() {
            if (this.DEFAULT_DICTIONARY_TABLE == null || ! this.DEFAULT_DICTIONARY_TABLE.isValid())
                reset();
            return this.DEFAULT_DICTIONARY_TABLE;
        }

        @objid ("901fc90c-a7eb-4d05-9b36-a0688b8b2105")
        public PropertyTableDefinition getDEFAULT_GOAL_TABLE() {
            if (this.DEFAULT_GOAL_TABLE == null || ! this.DEFAULT_GOAL_TABLE.isValid())
                reset();
            return this.DEFAULT_GOAL_TABLE;
        }

        @objid ("f62724f5-a59d-4ef1-b682-b34a49f41a6b")
        public PropertyTableDefinition getDEFAULT_REQUIREMENT_TABLE() {
            if (this.DEFAULT_REQUIREMENT_TABLE == null || ! this.DEFAULT_REQUIREMENT_TABLE.isValid())
                reset();
            return this.DEFAULT_REQUIREMENT_TABLE;
        }

        @objid ("af966fe5-7ff6-426c-bc6a-8fceb292bac2")
        public NoteType getDescriptionNoteType() {
            if (this.descriptionNoteType == null || ! this.descriptionNoteType.isValid())
                reset();
            return this.descriptionNoteType;
        }

        @objid ("fd77458c-e06b-4f9a-b8d5-b15af05d6f8e")
        private void reset() {
            // Load default property tables for analyst elements
            this.DEFAULT_REQUIREMENT_TABLE = this.iModel.findById(PropertyTableDefinition.class,
                    UUID.fromString("00080cf0-0000-001a-0000-000000000000"));
            this.DEFAULT_DICTIONARY_TABLE = this.iModel.findById(PropertyTableDefinition.class,
                    UUID.fromString("01ec152c-0000-144f-0000-000000000000"));
            this.DEFAULT_GOAL_TABLE = this.iModel.findById(PropertyTableDefinition.class,
                    UUID.fromString("00bc470c-0000-0018-0000-000000000000"));
            this.DEFAULT_BUSINESSRULE_TABLE = this.iModel.findById(PropertyTableDefinition.class,
                    UUID.fromString("00bc470c-0000-0019-0000-000000000000"));
            
            // Use the same default table as requirements
            this.DEFAULT_GENERIC_TABLE = this.DEFAULT_REQUIREMENT_TABLE;
            
            List<NoteType> noteTypes = this.modelFactory.findNoteType("ModelerModule", "description",
                    Metamodel.getMClass(ModelElement.class));
            
            if (noteTypes.size() > 0) {
                this.descriptionNoteType = noteTypes.get(0);
            }
        }

        @objid ("c7089bfc-aca9-4f4d-b4d6-94b9078d1a65")
        public PropertyTableDefinition getDEFAULT_GENERIC_TABLE() {
            if (this.DEFAULT_GENERIC_TABLE == null || ! this.DEFAULT_GENERIC_TABLE.isValid())
                reset();
            return this.DEFAULT_GENERIC_TABLE;
        }

    }

}
