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


package org.modelio.xmi.reverse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.uml2.uml.Profile;
import org.modelio.api.modelio.Modelio;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.XMIProperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class handles the properties needed during an XMI import
 * @author ebrosse
 */
@objid ("572dfe3e-dd00-4560-9c77-f7a948817e77")
public class ReverseProperties extends XMIProperties {

    @objid ("176ebcfc-be7e-4a1e-99c1-bbd842273ac2")
    private boolean timeDisplayerActivated = false;

    @objid ("8e709433-077d-4d46-bebb-88060e6f0029")
    private boolean rollback = false;

    @objid ("2ee99225-d343-43d3-984a-cfa0a2b3cdcc")
    private List<String> appliedProfiles = new ArrayList<>();

    @objid ("65723abf-49a0-46cd-b0cf-d187aac3fcf5")
    private static final int marging = 15;

    @objid ("5af0b8dd-eef3-4cfd-ac7a-c023d8206247")
    private static final int initLine = 40;

    @objid ("385481f5-c82a-4209-afb6-bca1b2c82b3b")
    private static int currentLineNumber = 40;

    @objid ("2ccade60-64a2-47ba-aaaa-a644c04c8188")
    private static ReverseProperties INSTANCE = null;

    @objid ("6d3af560-749d-43b6-9346-c446a4884d78")
    private OwnedCompositionUml2Visitor ecoreVisitor = null;

    @objid ("738186d4-5f7a-40ae-93b1-13767bfe0852")
    private PartialCreationImportVisitor partialCreationImportVisitor = null;

    @objid ("1c9c00ce-38aa-4ccd-bc7d-854c486e5281")
    private ModelTree profileRoot = null;

    @objid ("ce873083-f543-466f-be51-bba489516bb1")
    private Set<org.eclipse.uml2.uml.Package> ecoreModel = null;

    @objid ("65986898-bac3-4e0a-b3d5-8c71f1c354db")
    private Profile ecoreProfile = null;

    @objid ("eef8e755-2bc0-4a80-82a5-788100abd372")
    private Package externalPackage = null;

    @objid ("8dd7cb59-b8de-4ee7-9624-905982e70a0c")
    private Package umlRoot = null;


    @objid ("383f9a23-f374-4736-b804-4143a7e509f3")
    private ICoreSession session = null;

    
    private GProject project = null ;


    @objid ("e971ed4d-0523-4699-82c5-d015578516df")
    private ReverseProperties() {
    }

    /**
     * Provide the instance of the class
     * @return the ReverseProperties instance
     */
    @objid ("e1ba904f-2384-481a-a4ae-525597590d0b")
    public static ReverseProperties getInstance() {
        if (INSTANCE == null)
            INSTANCE = new ReverseProperties();
        return INSTANCE;
    }

    /**
     * provide the current Ecore Visitor
     * @return EcoreVisitor
     */
    @objid ("6393960a-d1ea-4a02-819b-9a8ce460c1fb")
    public OwnedCompositionUml2Visitor getEcoreVisitor() {
        return this.ecoreVisitor;
    }

    /**
     * set the Ecore visitor for the current import
     * @param ecoreVisitor : the Ecore visitor
     */
    @objid ("42182228-7af1-447f-acda-110bb986550b")
    public void setEcoreVisitor(OwnedCompositionUml2Visitor ecoreVisitor) {
        this.ecoreVisitor = ecoreVisitor;
    }

    /**
     * Provide the Ecore model resulting of the XMI export
     * @return Ecore model
     */
    @objid ("9ea822ea-5f4e-4e31-ab08-f0217798706a")
    public Set<org.eclipse.uml2.uml.Package> getEcoreModels() {
        return this.ecoreModel;
    }

    /**
     * This method allows to know if the time displayer is activated
     * @return true if the time displayer is activated
     */
    @objid ("4ec2bef8-6b95-4d79-8d45-7e01974cbe2e")
    public boolean isTimeDisplayerActivated() {
        return this.timeDisplayerActivated;
    }

    /**
     * This method allows to activated or not the time displayer for the current export
     * @param activateTimeDisplayer : if true is able the time displayer
     */
    @objid ("5535f0bb-941c-4fc0-9822-1937414c4b47")
    public void setTimeDisplayerActivated(final boolean activateTimeDisplayer) {
        this.timeDisplayerActivated = activateTimeDisplayer;
    }

    /**
     * This method returns the partial creation visitor of the current import
     * @return the current PartialCreationImportVisitor
     */
    @objid ("f6de5505-1d45-4793-9f3c-a6c7ee798566")
    public PartialCreationImportVisitor getPartialCreationImportVisitor() {
        return this.partialCreationImportVisitor;
    }

    /**
     * This methods initializes the properties of the import
     */
    @objid ("2e014522-9117-4d1b-94d4-d7f5f00defc5")
    public void initialize(IMModelServices mmService) {
        
        super.initialize(mmService);

        TotalImportMap.getInstance().clear();
        PartialImportMap.getInstance().clear();    


        this.appliedProfiles = new ArrayList<>();
        this.externalPackage = null;
        this.partialCreationImportVisitor = new PartialCreationImportVisitor();

        if (this.ecoreModel != null){
            this.ecoreModel.clear();
        }

        this.rollback = false;
    }

    /**
     * This method allows to add an Ecore model to the current reverses
     * @param model : the Ecore model to add
     */
    @objid ("19993fa6-7067-4dfd-90b0-ead5645437ca")
    public void addEcoreModel(org.eclipse.uml2.uml.Package model) {
        if (this.ecoreModel == null){
            this.ecoreModel = new HashSet<>();
        }

        this.ecoreModel.add(model);
    }

    /**
     * This method stores the availability of Modelio annotation in a specific Ecore model
     * @param importedPck : the given Ecore model
     */
    @objid ("649d6036-150a-4fd4-9a1a-4293da7b11e7")
    public void storeImportModelRoundtripMode(final org.eclipse.uml2.uml.Package importedPck) {
        this.roundtripEnabled = ObjingEAnnotation
                .isRoundTrip(importedPck);
    }

    /**
     * This method returns the import result of a given Ecore element
     * @param ecoreElt : the imported Ecore element
     * @return the result of the import
     */
    @objid ("9f70efaf-6f5f-494c-9611-6db3ba69564f")
    public Object getMappedElement(org.eclipse.uml2.uml.Element ecoreElt) {
        PartialImportMap partialCreationMap = PartialImportMap.getInstance();
        TotalImportMap totalCreationMap = TotalImportMap.getInstance();

        Object mappedElement = totalCreationMap.get(ecoreElt);

        if (mappedElement == null)
            mappedElement = partialCreationMap.get(ecoreElt);

        if (mappedElement == null) {
            mappedElement = this.partialCreationImportVisitor
                    .createPartialObjingElt(ecoreElt);
        }
        return mappedElement;
    }

    /**
     * This method tests if a given Ecore element has been already mapped
     * @param ecoreElt : the tested element
     * @return true if the tested element has been mapped
     */
    @objid ("ac4be4bd-50ad-4e0b-905c-2a379f6c0d6a")
    public boolean isMappedElement(org.eclipse.uml2.uml.Element ecoreElt) {
        if (TotalImportMap.getInstance().get(ecoreElt) != null)
            return true;
        else if (PartialImportMap.getInstance().get(ecoreElt) != null)
            return true;
        else
            return false;
    }

    /**
     * This method supress an element form the import
     * @param ecoreElt : the ecore element to supress
     * @param objingElt : the corresponding modelio element to supress
     */
    @objid ("7fe5921b-2657-4123-86db-5b0469e2f925")
    public void deleteElement(org.eclipse.uml2.uml.Element ecoreElt, org.modelio.metamodel.uml.infrastructure.Element objingElt) {
        PartialImportMap.getInstance().remove(ecoreElt);
        TotalImportMap.getInstance().remove(ecoreElt);
        objingElt.delete();
    }

    /**
     * This method sets the profile root
     * @param root : the profile root
     */
    @objid ("82ce5c3c-1d6d-4337-af7a-5b443a70386a")
    public void setProfileRoot(ModelTree root) {
        this.profileRoot = root;
        this.project = GProject.getProject(root);
        
    }

    /**
     * This method returns the profile root of the current export
     * @return the profile root
     */
    @objid ("0e91c2c6-3898-46d1-965c-046704f36979")
    public ModelTree getProfileRoot() {
        
        if (this.profileRoot != null)
            return this.profileRoot;

        for (MObject module : getModelRoots()){            
            if ((module instanceof ModuleComponent) && (module.getName().equals("LocalModule"))){
                return (ModuleComponent) module;
            }
        }
        return null;
    }

    /**
     * This method sets the imported Ecore profile
     * @param profile : the imported profile
     */
    @objid ("4d202b32-e407-413b-9539-3b2fc6ec33bd")
    public void setEcoreProfile(final org.eclipse.uml2.uml.Profile profile) {
        this.ecoreProfile = profile;
    }

    /**
     * This method returns the imported Ecore profile
     * @return the imported Ecore profile
     */
    @objid ("68ca1303-7650-422a-b2c9-dc6fa7a9ea67")
    public org.eclipse.uml2.uml.Profile getEcoreProfile() {
        return this.ecoreProfile;
    }

    /**
     * This method allows to know if the import would be rollbacked
     * @return true if the import must be rollbacked
     */
    @objid ("81ebf9cf-4884-416c-b835-86a5ad73ccf1")
    public boolean isRollback() {
        return this.rollback;
    }

    /**
     * This method allows to specify if the import transaction must be rollbacked
     * @param rollback : need of rollbacking the current transaction
     */
    @objid ("bad277f5-b4e7-4ff4-9511-ebfd080a9c36")
    public void setRollback(boolean rollback) {
        this.rollback = rollback;
    }

    /**
     * This method clean the properties of the current import
     */
    @objid ("739d8c2f-eaea-43fb-b4f0-14dfd8dc02e5")
    public void clean() {
        this.ecoreModel.clear();
        this.externalPackage = null;
        this.appliedProfiles = null;
    }

    /**
     * This methods allows to add a profile to the list of applied profiles
     * @param appliedProfile : the profile to add
     */
    @objid ("aef02ba2-8b43-4c9d-8d54-a02c00e2f0d7")
    public void addAppliedProfile(final String appliedProfile) {
        if (!this.appliedProfiles.contains(appliedProfile))
            this.appliedProfiles.add(appliedProfile);
    }


    /**
     * This method returns the 'external' Package used in order to store additional elements
     * @return the 'external' Package
     */
    @objid ("c3f5ef85-159a-42e9-9e0d-7e95551cde77")
    public Package getExternalPackage() {
        if (this.externalPackage == null){
            this.externalPackage = this.mmServices.getModelFactory().createPackage();
            this.externalPackage.setName(Xmi.I18N.getString("Ui.ExternalPackage.Name"));
            
            for (MObject modelRoot : getModelRoots()){
                if (modelRoot instanceof Project) {
                    this.externalPackage.setOwner(((Project) modelRoot).getModel());
                }
            }

        }
        return this.externalPackage;
    }

    /**
     * This method returns the list of imported profiles
     * @return imported profiles
     */
    @objid ("e3b594d3-dbd5-4da7-87b5-bcf5c823f39f")
    public List<String> getAppliedProfiles() {
        return this.appliedProfiles;
    }

    /**
     * This method adds a given profile to the list of imported profile
     * @param importedProfiles : the profiles to add
     */
    @objid ("b3573403-434c-4e8c-9929-d6ac17308360")
    public void addAppliedProfiles(final ArrayList<String> importedProfiles) {
        this.appliedProfiles.addAll(importedProfiles);
    }


    /**
     * This method returns the Modelio package owner of the launched import
     * @return import owner package
     */
    @objid ("183f9205-f613-4f30-953e-a722bdbc9698")
    public Package getUMLRoot() {
        if (this.umlRoot != null)
            return this.umlRoot;
        return null;
    }

    /**
     * This method allows to specify the owner of the XMI import
     * @param root : the package which will own the import result
     */
    @objid ("7ff0e8a8-4a43-4277-9579-9589ca247cdb")
    public void setUMLRoot(final Package root) {
        this.umlRoot = root;
        this.project = GProject.getProject(root);

    }

    @objid ("ba8a091f-4e25-4d1f-8a84-8174dfdcc282")
    @SuppressWarnings("serial")
    private void initClassTabConvertion() {
        this.classTabConvertion = new HashMap<>();
        this.classTabConvertion.put("Abstraction",  new ArrayList<String>(){{add("Dependency");}});
        this.classTabConvertion.put("AcceptCallEventAction",  new ArrayList<String>(){{add("AcceptCallEventAction");}});
        this.classTabConvertion.put("AcceptEventAction",  new ArrayList<String>(){{add("AcceptCallEventAction"); 
        add("AcceptSignalAction");    add("AcceptChangeEventAction");add("AcceptTimeEventAction");}});
        this.classTabConvertion.put("Action",  new ArrayList<String>(){{add("ActivityAction");}});
        this.classTabConvertion.put("ActionInputPin",  new ArrayList<String>(){{add("InputPin");}});
        this.classTabConvertion.put("Activity",  new ArrayList<String>(){{add("Activity");}});
        this.classTabConvertion.put("ActivityEdge",  new ArrayList<String>(){{add("ActivityEdge");}});
        this.classTabConvertion.put("ActivityFinalNode",  new ArrayList<String>(){{add("ActivityFinalNode");}});
        this.classTabConvertion.put("ActivityParameterNode",  new ArrayList<String>(){{add("ActivityParameterNode");}});
        this.classTabConvertion.put("ActivityPartition",  new ArrayList<String>(){{add("ActivityPartition");}});
        this.classTabConvertion.put("Actor",  new ArrayList<String>(){{add("Actor");}});
        this.classTabConvertion.put("AddStructuralFeature",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("AddVariableValueAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("AnyReceiveEvent",  new ArrayList<String>(){{add("Event");}});
        this.classTabConvertion.put("Artifact",  new ArrayList<String>(){{add("Artifact");}});
        this.classTabConvertion.put("Association",  new ArrayList<String>(){{add("Association");}});
        this.classTabConvertion.put("AssociationClass",  new ArrayList<String>(){{add("Class");}});
        this.classTabConvertion.put("Behavior",  new ArrayList<String>(){{add("Behavior");}});
        this.classTabConvertion.put("BehaviorFeature",  new ArrayList<String>(){{add("Operation");}});
        this.classTabConvertion.put("BroadcastSignalAction",  new ArrayList<String>(){{add("SendSignalAction");}});
        this.classTabConvertion.put("CallBehaviorAction",  new ArrayList<String>(){{add("CallBehaviorAction");}});
        this.classTabConvertion.put("CallEvent",  new ArrayList<String>(){{add("Event");}});
        this.classTabConvertion.put("CallOperationAction",  new ArrayList<String>(){{add("CallOperationAction");}});        
        this.classTabConvertion.put("CentralBufferNode",  new ArrayList<String>(){{add("CentralBufferNode");}});
        this.classTabConvertion.put("ChangeEvent",  new ArrayList<String>(){{add("Event");}});
        this.classTabConvertion.put("Class",  new ArrayList<String>(){{add("Class");}});
        this.classTabConvertion.put("Classifier",  new ArrayList<String>(){{add("Classifier");
        add("Association"); add("Collaboration");}});
        this.classTabConvertion.put("ClassifierTemplateParameter",  new ArrayList<String>(){{add("TemplateParameter");}});
        this.classTabConvertion.put("Clause",  new ArrayList<String>(){{add("Clause");}});
        this.classTabConvertion.put("ClearAssociationAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("ClearStructuralFeatureAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("ClearVariableAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("Collaboration",  new ArrayList<String>(){{add("Collaboration");}});        
        this.classTabConvertion.put("CollaborationUse",  new ArrayList<String>(){{add("CollaborationUse");}});
        this.classTabConvertion.put("Comment",  new ArrayList<String>(){{add("Note");}});
        this.classTabConvertion.put("CommunicationPath",  new ArrayList<String>(){{add("Association");}});
        this.classTabConvertion.put("Component",  new ArrayList<String>(){{add("Component");}});       
        this.classTabConvertion.put("ConditionalNode",  new ArrayList<String>(){{add("ConditionalNode");}});
        this.classTabConvertion.put("ConnectableElement",  new ArrayList<String>(){{add("Parameter");
        add("BehaviorParameter"); add("AssociationEnd"); add("BindableInstance"); add("Attribute");}});
        this.classTabConvertion.put("Connector",  new ArrayList<String>(){{add("Connector");}});
        this.classTabConvertion.put("ConnectorEnd",  new ArrayList<String>(){{add("ConnectorEnd");}});
        this.classTabConvertion.put("Constraint",  new ArrayList<String>(){{add("Class");}});
        this.classTabConvertion.put("ControlFlow",  new ArrayList<String>(){{add("ControlFlow");}});
        this.classTabConvertion.put("CreateLinkAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("CreateLinkObject",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("CreateObjectAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("CreationEvent",  new ArrayList<String>(){{add("Event");}});
        this.classTabConvertion.put("DataStoreNode",  new ArrayList<String>(){{add("DataStoreNode");}});
        this.classTabConvertion.put("DataType",  new ArrayList<String>(){{add("DataType");}});
        this.classTabConvertion.put("DecisionNode",  new ArrayList<String>(){{add("DecisionMergeNode");}});
        this.classTabConvertion.put("Dependency",  new ArrayList<String>(){{add("Dependency");}});
        this.classTabConvertion.put("Deployment",  new ArrayList<String>(){{add("Dependency");}});
        this.classTabConvertion.put("DeploymentSpecification",  new ArrayList<String>(){{add("Artifact");}});
        this.classTabConvertion.put("DestroyLinkAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("DestroyObjectAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("DestructionEvent",  new ArrayList<String>(){{add("Event");}});
        this.classTabConvertion.put("Device",  new ArrayList<String>(){{add("Node");}});
        this. classTabConvertion.put("Element",  new ArrayList<String>(){{add("Element");}});
        this.classTabConvertion.put("ElementImport",  new ArrayList<String>(){{add("ElementImport");}});
        this.classTabConvertion.put("Enumeration",  new ArrayList<String>(){{add("Enumeration");}});
        this.classTabConvertion.put("EnumerationLiteral",  new ArrayList<String>(){{add("EnumerationLiteral");}});
        this.classTabConvertion.put("Event",  new ArrayList<String>(){{add("Event");}});
        this.classTabConvertion.put("ExceptionHandler",  new ArrayList<String>(){{add("ObjectFlow");}});
        this.classTabConvertion.put("ExecutionEnvironment",  new ArrayList<String>(){{add("Node");}});
        this.classTabConvertion.put("ExecutionEvent",  new ArrayList<String>(){{add("Event");}});
        this.classTabConvertion.put("ExpansionNode",  new ArrayList<String>(){{add("Pin");}});
        this.classTabConvertion.put("ExpansionRegion",  new ArrayList<String>(){{add("StructuredActivityNode");}});
        this.classTabConvertion.put("Extend",  new ArrayList<String>(){{add("UseCaseDependency");}});
        this.classTabConvertion.put("ExtensionPoint",  new ArrayList<String>(){{add("ExtensionPoint");}});
        this.classTabConvertion.put("Feature",  new ArrayList<String>(){{add("Feature");}});
        this.classTabConvertion.put("FinalState",  new ArrayList<String>(){{add("FinalState");}});
        this.classTabConvertion.put("FlowFinalNode",  new ArrayList<String>(){{add("FlowFinalNode");}});
        this.classTabConvertion.put("ForkNode",  new ArrayList<String>(){{add("ForkJoinNode");}});
        this.classTabConvertion.put("Gate",  new ArrayList<String>(){{add("Gate");}});
        this.classTabConvertion.put("Generalization",  new ArrayList<String>(){{add("Generalization");}});
        this.classTabConvertion.put("Include",  new ArrayList<String>(){{add("UseCaseDependency");}});
        this.classTabConvertion.put("InformationFlow",  new ArrayList<String>(){{add("InformationFlow");}});
        this.classTabConvertion.put("InformationItem",  new ArrayList<String>(){{add("InformationItem");}});
        this.classTabConvertion.put("InitialNode",  new ArrayList<String>(){{add("InitialNode");}});
        this.classTabConvertion.put("InputPin",  new ArrayList<String>(){{add("InputPin");}});
        this. classTabConvertion.put("InstanceSpecification",  new ArrayList<String>(){{add("Link");
        add("Instance");add("EnumerationLiteral");}});
        this.classTabConvertion.put("Interaction",  new ArrayList<String>(){{add("Interaction");}});
        this.classTabConvertion.put("Interface",  new ArrayList<String>(){{add("Interface");}});
        this.classTabConvertion.put("InterfaceRealization",  new ArrayList<String>(){{add("InterfaceRealization");}});
        this.classTabConvertion.put("InterruptibleActivityRegion",  new ArrayList<String>(){{add("InterruptibleActivityRegion");}});
        this.classTabConvertion.put("InvocationAction",  new ArrayList<String>(){{add("CallAction");
        add("SendSignalAction"); add("OpaqueAction");}});
        this.classTabConvertion.put("JoinNode",  new ArrayList<String>(){{add("ForkJoinNode");}});
        this.classTabConvertion.put("Lifeline",  new ArrayList<String>(){{add("Lifeline");}});
        this.classTabConvertion.put("LoopNode",  new ArrayList<String>(){{add("LoopNode");}});
        this.classTabConvertion.put("Manifestation",  new ArrayList<String>(){{add("Manifestation");}});
        this.classTabConvertion.put("MergeNode",  new ArrayList<String>(){{add("DecisionMergeNode");}});
        this.classTabConvertion.put("Message",  new ArrayList<String>(){{add("Message");}});
        this.classTabConvertion.put("MessageOccurrenceSpecification",  new ArrayList<String>(){{add("MessageOccurrenceSpecification");}});
        this.classTabConvertion.put("Model",  new ArrayList<String>(){{add("Package");}});
        this.classTabConvertion.put("ModelElement",  new ArrayList<String>(){{add("NamedElement");}});
        this.classTabConvertion.put("Node",  new ArrayList<String>(){{add("Node");}});
        this.classTabConvertion.put("ObjectFlow",  new ArrayList<String>(){{add("ObjectFlow");}});
        this.classTabConvertion.put("ObjectNode",  new ArrayList<String>(){{add("ObjectNode");}});
        this.classTabConvertion.put("OccurenceSpecification",  new ArrayList<String>(){{add("OccurenceSpecification");}});
        this.classTabConvertion.put("OpaqueAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("OpaqueBehavior",  new ArrayList<String>(){{add("Signal");}});
        this.classTabConvertion.put("Operation",  new ArrayList<String>(){{add("Operation");}});
        this.classTabConvertion.put("OperationTemplateParameter",  new ArrayList<String>(){{add("Parameter");}});
        this.classTabConvertion.put("OutputPin",  new ArrayList<String>(){{add("OutputPin");}});
        this.classTabConvertion.put("Package",  new ArrayList<String>(){{add("Package");}});
        this.classTabConvertion.put("PackageImport",  new ArrayList<String>(){{add("PackageImport");}});
        this.classTabConvertion.put("PackageMerge",  new ArrayList<String>(){{add("PackageMerge");}});
        this.classTabConvertion.put("Parameter",  new ArrayList<String>(){{add("Parameter");}});
        this.classTabConvertion.put("Pin",  new ArrayList<String>(){{add("Pin");}});
        this.classTabConvertion.put("Port",  new ArrayList<String>(){{add("Port");}});
        this.classTabConvertion.put("PrimitiveType",  new ArrayList<String>(){{add("DataType");}});
        this.classTabConvertion.put("Profile",  new ArrayList<String>(){{add("Profile");}});
        this.classTabConvertion.put("Property",  new ArrayList<String>(){{add("AssociationEnd");
        add("BindableInstance"); add("Attribute");}});
        this.classTabConvertion.put("ProtocolConformance",  new ArrayList<String>(){{add("Dependency");}});
        this.classTabConvertion.put("ProtocolStateMachine",  new ArrayList<String>(){{add("StateMachine");}});
        this.classTabConvertion.put("ProtocolTransition",  new ArrayList<String>(){{add("Transition");add("InternalTransition");}});
        this.classTabConvertion.put("PseudoState",  new ArrayList<String>(){{add("PseudoState");}});
        this.classTabConvertion.put("RaiseExceptionAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("ReadExtentAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("ReadIsClassifierAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("ReadLinkAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("ReadLinkObjectEndAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("ReadLinkObjectEndQualifierAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("ReadSelfAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("ReadStructuralFeatureAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("ReadVariableAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("Realization",  new ArrayList<String>(){{add("Realization");}});
        this.classTabConvertion.put("Reception",  new ArrayList<String>(){{add("Operation");}});
        this.classTabConvertion.put("ReclassifyObjectAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("RedefinableTemplateSignature",  new ArrayList<String>(){{add("Operation");}});
        this.classTabConvertion.put("ReduceAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("Region",  new ArrayList<String>(){{add("Region");}});
        this.classTabConvertion.put("RemoveStructuralFeatureValueAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("RemoveVariableValueAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("ReplyAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("SendObjectAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("SendSignalAction",  new ArrayList<String>(){{add("SendSignalAction");}});
        this.classTabConvertion.put("SequenceNode",  new ArrayList<String>(){{add("StructuredActivityNode");}});
        this.classTabConvertion.put("Signal",  new ArrayList<String>(){{add("Signal");}});
        this.classTabConvertion.put("Slot",  new ArrayList<String>(){{add("Port");
        add("BindableInstance");add("ConnectorEnd");add("LinkEnd");}});
        this.classTabConvertion.put("StartClassifierBehaviorAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("State",  new ArrayList<String>(){{add("State");}});
        this.classTabConvertion.put("StateInvariant",  new ArrayList<String>(){{add("StateInvariant");}});
        this.classTabConvertion.put("StateMachine",  new ArrayList<String>(){{add("StateMachine");}});
        this.classTabConvertion.put("Stereotype",  new ArrayList<String>(){{add("Stereotype");}});
        this.classTabConvertion.put("StructuredActivityNode",  new ArrayList<String>(){{add("StructuredActivityNode");}});
        this.classTabConvertion.put("StructuredClassifier",  new ArrayList<String>(){{add("Collaboration");
        add("Class");add("Behavior");add("Node");}});
        this.classTabConvertion.put("Substitution",  new ArrayList<String>(){{add("Substitution");}});
        this.classTabConvertion.put("TemplateBinding",  new ArrayList<String>(){{add("TemplateBinding");}});
        this.classTabConvertion.put("TemplateParameter",  new ArrayList<String>(){{add("TemplateParameter");}});
        this.classTabConvertion.put("TemplateParameterSubstitution",  new ArrayList<String>(){{add("TemplateParameterSubstitution");}});
        this.classTabConvertion.put("TemplateSignature",  new ArrayList<String>(){{add("Operation");}});
        this.classTabConvertion.put("TestIdentityAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("TimeEvent",  new ArrayList<String>(){{add("Event");}});
        this.classTabConvertion.put("Transition",  new ArrayList<String>(){{add("Transition");
        add("InternalTransition");}});
        this.classTabConvertion.put("UnmarshallAction",  new ArrayList<String>(){{add("OpaqueAction");}});
        this.classTabConvertion.put("Usage",  new ArrayList<String>(){{add("Usage");}});
        this.classTabConvertion.put("UseCase",  new ArrayList<String>(){{add("UseCase");}});
        this.classTabConvertion.put("ValuePin",  new ArrayList<String>(){{add("InputPin");}});
        this.classTabConvertion.put("ValueSpecificationAction",  new ArrayList<String>(){{add("OpaqueAction");}});
    }

    /**
     * This methods returns the list of Modelio classes corresponding to a given Ecore class
     * @param ecoreClassName : the name of the Ecore class
     * @return the list of the corresponding Modelio classes
     */
    @objid ("24a028c3-f703-4953-9813-a135c97e9f40")
    public List<String> getObjClassNames(final String ecoreClassName) {
        if (this.classTabConvertion == null){
            initClassTabConvertion();
        }

        List<String> result = this.classTabConvertion.get(ecoreClassName);

        if (result == null){
            return new ArrayList<>();
        }else{
            return result;
        }
    }



    @objid ("830c65c7-cac6-497c-ab45-511451968170")
    public void resetLineNumber() {
        currentLineNumber = initLine;
    }

    @objid ("344a6db3-9edc-4a5e-bfbf-6740e8c60789")
    public int getCurrentLineNumber() {
        currentLineNumber += marging ;
        return currentLineNumber;
    }


    @objid ("58bf2b31-853e-45d8-a30d-be7c7745cdc1")
    public void setCoreSession(ICoreSession session) {
        this.session = session;
    }

    @objid ("7a956841-85a0-4ce3-b7c0-70bbac2a50b1")
    public ICoreSession getCoreSession() {
        return this.session;
    }

}
