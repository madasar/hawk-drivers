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
                                    

package org.modelio.xmi.generation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Stereotype;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.xmi.api.FormatExport;
import org.modelio.xmi.api.XMIExtension;
import org.modelio.xmi.model.objing.profile.PExportProfile;
import org.modelio.xmi.util.EcoreTypes;
import org.modelio.xmi.util.ScopeChecker;
import org.modelio.xmi.util.XMIProperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9a42d229-6232-45c2-b9b3-5a2f11c08129")
public class GenerationProperties extends XMIProperties {
   
    @objid ("fbb07531-e053-4f0d-9c7c-a85356310819")
    private boolean timeDisplayerActivated = false;

    
    private FormatExport exportVersion = FormatExport.UML211;

    private XMIExtension fileExtension = XMIExtension.XMI;

    @objid ("7059ca3b-a7af-4813-a6bc-0edd36d1adf7")
    private boolean sysmlApplied = false;

    @objid ("9b8e7bf2-7a65-4b10-8d29-2f42c17fa516")
    private static GenerationProperties INSTANCE = null;

    @objid ("fe4bd2c3-6229-499f-8869-cbbac128b222")
    private GenericMetamodelVisitor objingVisitor = null;

    @objid ("6d16eba4-9750-4f77-9aab-d3689d6781bf")
    private List<ModelTree> exportScopeElts;

    @objid ("977f3ef7-484a-4f05-85c6-d6e3412d4a56")
    private Package selectedPackage = null;

    @objid ("28c2b34d-8456-483d-88d2-51b6f3dfd6dd")
    private PartialCreationExportVisitor partialCreationExportVisitor = new PartialCreationExportVisitor();

    @objid ("ae751d9e-2611-4a6d-86fe-b3a017cd9fd0")
    private ScopeChecker scopeChecker;

    @objid ("5d482f13-d0d9-4169-ae70-7b061c034517")
    private List<ModelElement> stereotypesExported = new ArrayList<>();

    @objid ("154d06cd-05bd-4061-a025-2b6c593b6c72")
    private List<Stereotype> defaultStereotyped = new ArrayList<>();

    @objid ("c2051c32-041d-4c1d-8aa9-9916f9735444")
    private Model ecoreModel = null;

    @objid ("3e625fca-02f3-48a1-9637-f9533faefdee")
    private List<ModelElement> sysMLElementExported = new ArrayList<>();



    @objid ("5dd91275-6529-4ec6-95f1-ca16e743b0d2")
    private org.eclipse.uml2.uml.Profile sysMLProfile = null;

    @objid ("4b98ec69-5fab-4a07-9445-906be04cdd40")
    private List<org.eclipse.uml2.uml.Profile> exportedProfiles = new ArrayList<>();


    @objid ("66db909b-66ee-48b6-9bb5-b6e558bfc864")
    private List<Project> libraryExported = new ArrayList<>();

    private EcoreTypes ecoreTypes = null;
    
    @objid ("f6b1a4f3-dbf0-44df-9d03-14499e99fb84")
    private GenerationProperties() {
    }

    @objid ("c4a425ce-63e8-4e65-bb1b-8dd015618809")
    public static GenerationProperties getInstance() {
        if (INSTANCE == null)
            INSTANCE = new GenerationProperties();
        return INSTANCE;
    }


    @objid ("2758ebc9-6564-4b68-ac0c-f0f19076b9b4")
    public void setObjingVisitor(GenericMetamodelVisitor objingVisitor) {
        this.objingVisitor = objingVisitor;
    }

    @objid ("10366ce5-08f6-46a6-8118-cf78d9c47bb6")
    public Model getEcoreModel() {
        return this.ecoreModel;
    }

    @objid ("13a508a3-376e-4462-a305-f67740e9c657")
    public void setTimeDisplayerActivated(boolean activateTimeDisplayer) {
        this.timeDisplayerActivated = activateTimeDisplayer;
    }

    @objid ("5787b1cd-de8c-4a1b-9a98-2f8543c18c6d")
    public void setScopeChecker(ScopeChecker theScopeChecker) {
        this.scopeChecker = theScopeChecker;
    }

    @objid ("bd681edf-8521-439d-a6e6-790ca951ef42")
    public void cleanStereotypesExported() {
        this.stereotypesExported = new ArrayList<>();
    }

    @objid ("8ae2b41a-ab3c-411b-9478-280f8443b67d")
    public void supressProfile() {
        for (org.eclipse.uml2.uml.Profile current : this.exportedProfiles){
            if (this.ecoreModel.isProfileApplied(current))
                this.ecoreModel.unapplyProfile(current);
        }
        this.exportedProfiles = new ArrayList<>();
    }

    @objid ("8d39655f-9afc-4d23-84a7-856a17adbb66")
    public void setExportScopeElts(List<ModelTree> rootElements) {
        this.exportScopeElts = rootElements;
    }

    @objid ("6b5b3ec7-b455-404d-b1ac-150727fb2ce5")
    public void setEcoreModel(org.eclipse.uml2.uml.Model ecoreModel) {
        this.ecoreModel = ecoreModel;
    }

    @objid ("ba40e3d3-637a-4721-b8a7-db23ae61a1cb")
    public void setSelectedPackage(Package selectedPkg) {
        this.selectedPackage = selectedPkg;
    }

    @objid ("314184fb-0768-4801-a3e9-3709d716fa3b")
    public org.eclipse.uml2.uml.Element getMappedElement(MObject objingElt) {
        PartialExportMap partialCreationMap = PartialExportMap.getInstance();
        TotalExportMap totalCreationMap = TotalExportMap.getInstance();
        
        org.eclipse.uml2.uml.Element mappedElement = totalCreationMap.get(objingElt.getUuid().toString());
        
        if (mappedElement == null)
            mappedElement = partialCreationMap.get(objingElt.getUuid().toString());
        
        if (mappedElement == null) {
            // If the element is not in the scope, it will not be created
            // partially:
            if (this.scopeChecker.contains(objingElt)) {
                mappedElement = this.partialCreationExportVisitor
                        .createPartialEcoreElt(objingElt);
            }
        }
        return mappedElement;
    }

    @objid ("d676f2df-e7ba-45f4-948c-2ed50b0dbc95")
    public boolean isMappedElement(Element objingElt) {
        if (TotalExportMap.getInstance().get(objingElt.getUuid().toString()) != null)
            return true;
        else if (PartialExportMap.getInstance().get(objingElt.getUuid().toString()) != null)
            return true;
        else
            return false;
    }

    @objid ("8a538bba-9b3e-42fe-bde3-81610ec1146e")
    public void addStereotypeExported(ModelElement element) {
        if (!this.stereotypesExported.contains(element))
            this.stereotypesExported.add(element);
    }

    @objid ("40f8ebc8-1b4a-4b39-8037-8f08fa111b27")
    public GenericMetamodelVisitor getObjingVisitor() {
        return this.objingVisitor;
    }

    @objid ("801a4f11-7e1d-4d51-a673-abd6e54faa8c")
    public List<ModelTree> getExportScopeElts() {
        return this.exportScopeElts;
    }

    @objid ("6ff37ef0-b522-4db4-a93e-b0b0da6d928c")
    public boolean isTimeDisplayerActivated() {
        return this.timeDisplayerActivated;
    }

    @objid ("f234434e-6349-4672-902b-0cf8796d2357")
    public Package getSelectedPackage() {
        return this.selectedPackage;
    }

    @objid ("e1eab8d5-70c9-4178-8775-3a3c34b42213")
    public PartialCreationExportVisitor getPartialCreationExportVisitor() {
        return this.partialCreationExportVisitor;
    }

    @objid ("2276a533-3616-4894-a185-c713a6296e2a")
    public ScopeChecker getScopeChecker() {
        return this.scopeChecker;
    }

    @objid ("96fdc245-086c-43ab-b0bd-b1ca4dca22b5")
    public List<ModelElement> getStereotypesExported() {
        return this.stereotypesExported;
    }

    @Override
    @objid ("23d44bef-8e0a-4140-8297-7e6b7376764a")
    public void initialize(IMModelServices mmoServices) {
        super.initialize(mmoServices);
        
        TotalExportMap.getInstance().clear();
        PartialExportMap.getInstance().clear();

        this.libraryExported.clear();
    }

    @objid ("5566bb47-9411-49db-a239-edef9639b9c2")
    public List<Stereotype> getDefaultStereotyped() {
        return this.defaultStereotyped;
    }

    @objid ("2a1929f1-7608-4de3-b1dd-9bbf79edb221")
    public List<org.eclipse.uml2.uml.Profile> getExportedProfiles() {
        return this.exportedProfiles;
    }

    @objid ("b013d437-e07e-4931-8803-ef17ab9f04f4")
    public void addExportedProfile(final org.eclipse.uml2.uml.Profile newProfile) {
        if (!(this.exportedProfiles.contains(newProfile)))
            this.exportedProfiles.add(newProfile);
    }

    @objid ("cd78a3b0-a44c-4708-95da-c2c801caf9f4")
    public void addSysMLExported(final ModelElement element) {
        if (!this.sysMLElementExported.contains(element))
            this.sysMLElementExported.add(element);
    }

    @objid ("2b0a0f9a-ae5e-4990-9d0e-60f8a57aa0bf")
    public List<ModelElement> getSysMLExported() {
        return this.sysMLElementExported;
    }

    @objid ("61966f7c-01d8-4fbf-8758-47a2e90e615b")
    public void supressSysMLProfile() {
        if (this.sysMLProfile != null){
            if (this.ecoreModel.isProfileApplied(this.sysMLProfile)){
                this.ecoreModel.unapplyProfile(this.sysMLProfile);
            }
            this.sysMLProfile = null;   
        }
    }

    @objid ("2e8ff273-97d1-4e72-9d2f-582aa9adf85f")
    public void cleanSysMLElementExported() {
        this.sysMLElementExported = new ArrayList<>();
    }

    @objid ("61d89b8a-b8e4-4a25-a74a-c8c4cbd89d0e")
    public org.eclipse.uml2.uml.Profile getSysMLProfile() {
        if (this.sysMLProfile == null){
        
            Profile obSysMLProfile = (Profile) this.mmServices.findById(SmClass.getClass(Profile.class), UUID.fromString("00bc42a4-0000-1968-0000-000000000000"));
        
            if (obSysMLProfile != null){
                this.sysMLProfile = (org.eclipse.uml2.uml.Profile) TotalExportMap.getInstance().get(obSysMLProfile.getUuid().toString());
                //SysML export
                if (this.sysMLProfile == null) {
                    ProfileExportVisitorImpl profileVisitor = new ProfileExportVisitorImpl();
                    PExportProfile pprofile = new PExportProfile(obSysMLProfile);
                    profileVisitor.visit(pprofile);
                    this.sysMLProfile = (org.eclipse.uml2.uml.Profile) TotalExportMap.getInstance().get(obSysMLProfile.getUuid().toString());
        
                }
        
        
            }
        }
        return this.sysMLProfile;
    }

    @objid ("5eef827a-f1c7-49ac-8bab-87660326e816")
    public void inverseProfiles(final org.eclipse.uml2.uml.Profile profileFirst, final org.eclipse.uml2.uml.Profile profileLast) {
        int indexFirst = this.exportedProfiles.indexOf(profileFirst);
        int indexLast = this.exportedProfiles.indexOf(profileLast);
        if (indexFirst > indexLast){
            this.exportedProfiles.remove(profileFirst);
            this.exportedProfiles.remove(profileLast);
            if (indexFirst < this.exportedProfiles.size() -1)
                this.exportedProfiles.add(indexFirst,  profileFirst);
            else 
                this.exportedProfiles.add(profileFirst);
        
            if (indexLast < this.exportedProfiles.size() -1)
                this.exportedProfiles.add(indexLast, profileLast);
            else 
                this.exportedProfiles.add(profileLast);
        
        }
    }

    public FormatExport getExportVersion() {
        return this.exportVersion;
    }

    public void setVersionExport(FormatExport version) {
        this.exportVersion = version;
        this.ecoreTypes = new EcoreTypes(version);
    }

    public XMIExtension getFileExtension() {
        return this.fileExtension;
    }

    public void setFileExtension(XMIExtension ext) {
        this.fileExtension = ext;
    }
    

    @objid ("6f2359fb-2cbc-433a-aab3-953191bff306")
    public List<String> getEcoreClassNames(final String objClassName) {
        if (this.classTabConvertion == null)
            initClassTabConvertion();
        
        List<String> result = this.classTabConvertion.get(objClassName);
        
        if (result == null)
            return new ArrayList<>();
        else
            return result;
    }

    @objid ("45903e53-b622-43a3-9025-cd0d06ba1f2c")
    @SuppressWarnings("serial")
    private void initClassTabConvertion() {
        this.classTabConvertion = new HashMap<>();
        this.classTabConvertion.put("Abstraction",  new ArrayList<String>(){{add("Abstraction");}});
        this.classTabConvertion.put("AcceptCallEventAction",  new ArrayList<String>(){{add("AcceptEventAction");}});
        this.classTabConvertion.put("AcceptChangeEventAction",  new ArrayList<String>(){{add("AcceptEventAction");}});
        this.classTabConvertion.put("AcceptSignalAction",  new ArrayList<String>(){{add("AcceptEventAction");}});
        this.classTabConvertion.put("AcceptTimeEventAction",  new ArrayList<String>(){{add("AcceptEventAction");}});
        this.classTabConvertion.put("Activity",  new ArrayList<String>(){{add("Activity");}});
        this.classTabConvertion.put("ActivityEdge",  new ArrayList<String>(){{add("ActivityEdge");}});
        this.classTabConvertion.put("ActivityFinalNode",  new ArrayList<String>(){{add("ActivityFinalNode");}});
        this.classTabConvertion.put("ActivityNode",  new ArrayList<String>(){{add("ActivityNode");}});
        this.classTabConvertion.put("ActivityParameterNode",  new ArrayList<String>(){{add("ActivityParameterNode");}});
        this.classTabConvertion.put("ActivityPartition",  new ArrayList<String>(){{add("ActivityPartition");}});
        this.classTabConvertion.put("Actor",  new ArrayList<String>(){{add("Actor");}});
        this.classTabConvertion.put("Artifact",  new ArrayList<String>(){{add("Artifact");}});
        this.classTabConvertion.put("Association",  new ArrayList<String>(){{add("Association"); add("AssociationClass");}});
        this.classTabConvertion.put("AssociationEnd",  new ArrayList<String>(){{add("Property");}});
        this.classTabConvertion.put("Attribute",  new ArrayList<String>(){{add("Property");}});
        this.classTabConvertion.put("AttributeLink",  new ArrayList<String>(){{add("Slot");}});
        this.classTabConvertion.put("Behavior",  new ArrayList<String>(){{add("Behavior");}});
        this.classTabConvertion.put("BehaviorParameter",  new ArrayList<String>(){{add("Parameter");}});
        this.classTabConvertion.put("BindableInstance",  new ArrayList<String>(){{add("Property");}});
        this.classTabConvertion.put("Binding",  new ArrayList<String>(){{add("Dependency");}});
        this.classTabConvertion.put("CallBehaviorAction",  new ArrayList<String>(){{add("CallBehaviorAction");}});
        this.classTabConvertion.put("CallOperationAction",  new ArrayList<String>(){{add("CallOperationAction");}});
        this.classTabConvertion.put("CentralBufferNode",  new ArrayList<String>(){{add("CentralBufferNode");}});
        this.classTabConvertion.put("Class",  new ArrayList<String>(){{add("Class");}});
        this.classTabConvertion.put("ClassAssociation",  new ArrayList<String>(){{add("AssociationClass");}});
        this.classTabConvertion.put("Classifier",  new ArrayList<String>(){{add("Classifier");}});
        this.classTabConvertion.put("Clause",  new ArrayList<String>(){{add("Clause");}});
        this.classTabConvertion.put("Collaboration",  new ArrayList<String>(){{add("Collaboration");}});
        this.classTabConvertion.put("CollaborationUse",  new ArrayList<String>(){{add("CollaborationUse");}});
        this.classTabConvertion.put("Component",  new ArrayList<String>(){{add("Component");}});
        this.classTabConvertion.put("ConditionalNode",  new ArrayList<String>(){{add("ConditionalNode");}});
        this.classTabConvertion.put("Connector",  new ArrayList<String>(){{add("Connector");}});
        this.classTabConvertion.put("ConnectorEnd",  new ArrayList<String>(){{add("ConnectorEnd");add("Slot");}});
        this.classTabConvertion.put("Constraint",  new ArrayList<String>(){{add("Constraint");}});
        this.classTabConvertion.put("ControlFlow",  new ArrayList<String>(){{add("ControlFlow");}});
        this.classTabConvertion.put("DataFlow",  new ArrayList<String>(){{add("InformationFlow");}});
        this.classTabConvertion.put("DataStoreNode",  new ArrayList<String>(){{add("DataStoreNode");}});
        this.classTabConvertion.put("DataType",  new ArrayList<String>(){{add("DataType"); add("PrimitiveType");}});
        this.classTabConvertion.put("DecisionMergeNode",  new ArrayList<String>(){{add("DecisionNode"); add("MergeNode");}});
        this.classTabConvertion.put("DeepHistoryPseudoState",  new ArrayList<String>(){{add("PseudoState");}});
        this.classTabConvertion.put("Dependency",  new ArrayList<String>(){{add("Dependency"); add("Extend"); add("Include");}});
        this.classTabConvertion.put("ElementImport",  new ArrayList<String>(){{add("ElementImport");}});
        this.classTabConvertion.put("ElementRealization",  new ArrayList<String>(){{add("Realization");}});
        this.classTabConvertion.put("EntryPointPseudoState",  new ArrayList<String>(){{add("PseudoState");}});
        this.classTabConvertion.put("Enumeration",  new ArrayList<String>(){{add("Enumeration");}});
        this.classTabConvertion.put("EnumerationLiteral",  new ArrayList<String>(){{add("EnumerationLiteral");}});
        this.classTabConvertion.put("Event",  new ArrayList<String>(){{add("CallEvent"); add("SignalEvent");
        add("TimeEvent"); add("ChangeEvent"); add("CreationEvent"); add("DestructionEvent"); add("ExecutionEvent");}});
        this.classTabConvertion.put("ExecutionOccurenceSpecification",  new ArrayList<String>(){{add("ExecutionOccurenceSpecification");}});
        this.classTabConvertion.put("ExecutionSpecification",  new ArrayList<String>(){{add("ExecutionSpecification");}});
        this.classTabConvertion.put("ExitPointPseudoState",  new ArrayList<String>(){{add("PseudoState");}});
        this.classTabConvertion.put("ExtensionPoint",  new ArrayList<String>(){{add("ExtensionPoint");}});
        this.classTabConvertion.put("Feature",  new ArrayList<String>(){{add("Feature");}});
        this.classTabConvertion.put("FinalState",  new ArrayList<String>(){{add("FinalState");}});
        this.classTabConvertion.put("FlowFinalNode",  new ArrayList<String>(){{add("FlowFinalNode");}});
        this.classTabConvertion.put("ForkJoinNode",  new ArrayList<String>(){{add("ForkNode"); add("JoinNode");}});
        this.classTabConvertion.put("ForkPseudoState",  new ArrayList<String>(){{add("PseudoState");}});
        this.classTabConvertion.put("Generalization",  new ArrayList<String>(){{add("Generalization");}});
        this.classTabConvertion.put("InformationFlow",  new ArrayList<String>(){{add("InformationFlow");}});
        this.classTabConvertion.put("InformationItem",  new ArrayList<String>(){{add("InformationItem");}});
        this.classTabConvertion.put("InitialNode",  new ArrayList<String>(){{add("InitialNode");}});
        this.classTabConvertion.put("InitialPseudoState",  new ArrayList<String>(){{add("PseudoState");}});      
        this.classTabConvertion.put("InputPin",  new ArrayList<String>(){{add("InputPin");add("ValuePin");
        add("ExpansionNode");add("ActionInputPin");}});
        this.classTabConvertion.put("Instance",  new ArrayList<String>(){{add("InstanceSpecification"); add("Property");}});
        this.classTabConvertion.put("InstanceNode",  new ArrayList<String>(){{add("CentralBufferNode");}});
        this.classTabConvertion.put("Interaction",  new ArrayList<String>(){{add("Interaction");}});
        this.classTabConvertion.put("Interface",  new ArrayList<String>(){{add("Interface");}});
        this.classTabConvertion.put("InterfaceRealization",  new ArrayList<String>(){{add("InterfaceRealization");}});
        this.classTabConvertion.put("InternalTransition",  new ArrayList<String>(){{add("Transition");}});
        this.classTabConvertion.put("InterruptibleActivityRegion",  new ArrayList<String>(){{add("InterruptibleActivityRegion");}});
        this.classTabConvertion.put("JoinPseudoState",  new ArrayList<String>(){{add("PseudoState");}});
        this.classTabConvertion.put("JunctionPseudoState",  new ArrayList<String>(){{add("PseudoState");}});
        this.classTabConvertion.put("Lifeline",  new ArrayList<String>(){{add("Lifeline");}});
        this.classTabConvertion.put("Link",  new ArrayList<String>(){{add("InstanceSpecification");}});
        this.classTabConvertion.put("LinkEnd",  new ArrayList<String>(){{add("Slot");}});
        this.classTabConvertion.put("LoopNode",  new ArrayList<String>(){{add("LoopNode");}});
        this.classTabConvertion.put("Manifestation",  new ArrayList<String>(){{add("Manifestation");}});
        this.classTabConvertion.put("ModelElement",  new ArrayList<String>(){{add("NamedElement");}});
        this.classTabConvertion.put("Node",  new ArrayList<String>(){{add("Node");}});
        this.classTabConvertion.put("Note",  new ArrayList<String>(){{add("Comment");}});
        this.classTabConvertion.put("ObjectFlow",  new ArrayList<String>(){{add("ObjectFlow");add("ExceptionHandler");}});
        this.classTabConvertion.put("ObjectNode",  new ArrayList<String>(){{add("ObjectNode");}});
        this.classTabConvertion.put("OpaqueAction",  new ArrayList<String>(){{add("OpaqueAction");add("ValueSpecificationAction");}});
        this.classTabConvertion.put("Operation",  new ArrayList<String>(){{add("Operation");add("Reception");
        add("RedefinableTemplateSignature");add("TemplateSignature");}});
        this.classTabConvertion.put("OutputPin",  new ArrayList<String>(){{add("OutputPin");}});
        this.classTabConvertion.put("Package",  new ArrayList<String>(){{add("Package");}});
        this.classTabConvertion.put("PackageImport",  new ArrayList<String>(){{add("PackageImport");}});
        this.classTabConvertion.put("PackageMerge",  new ArrayList<String>(){{add("PackageMerge");}});
        this.classTabConvertion.put("Parameter",  new ArrayList<String>(){{add("Parameter");add("ClassifierTemplateParameter");
        add("OperationTemplateParameter");}});
        this.classTabConvertion.put("Pin",  new ArrayList<String>(){{add("Pin");}});
        this.classTabConvertion.put("Port",  new ArrayList<String>(){{add("Port");}});
        this.classTabConvertion.put("RaisedException",  new ArrayList<String>(){{add("Operation");}});
        this.classTabConvertion.put("Region",  new ArrayList<String>(){{add("Region");}});
        this.classTabConvertion.put("RequirementContainer",  new ArrayList<String>(){{add("Package");}});
        this.classTabConvertion.put("SendSignalAction",  new ArrayList<String>(){{add("SendSignalAction");}});
        this.classTabConvertion.put("Signal",  new ArrayList<String>(){{add("Signal");}});
        this.classTabConvertion.put("State",  new ArrayList<String>(){{add("State");}});
        this.classTabConvertion.put("StateMachine",  new ArrayList<String>(){{add("StateMachine");add("ProtocolStateMachine");}});
        this.classTabConvertion.put("StructuredActivityNode",  new ArrayList<String>(){{add("StructuredActivityNode");add("ExpansionRegion");}});
        this.classTabConvertion.put("Substitution",  new ArrayList<String>(){{add("Substitution");}});
        this.classTabConvertion.put("TemplateBinding",  new ArrayList<String>(){{add("TemplateBinding");}});
        this.classTabConvertion.put("TemplateParameter",  new ArrayList<String>(){{add("TemplateParameter");add("ConnectableElementTemplateParameter");}});
        this.classTabConvertion.put("TemplateParameterSubstitution",  new ArrayList<String>(){{add("TemplateParameterSubstitution");}});
        this.classTabConvertion.put("TerminatePseudoState",  new ArrayList<String>(){{add("PseudoState");}});
        this.classTabConvertion.put("Transition",  new ArrayList<String>(){{add("Transition");add("ProtocolTransition");}});
        this.classTabConvertion.put("Usage",  new ArrayList<String>(){{add("Usage");}});
        this.classTabConvertion.put("UseCase",  new ArrayList<String>(){{add("UseCase");}});
        this.classTabConvertion.put("UseCaseDependency",  new ArrayList<String>(){{add("Extend");add("Include");}});
    }


    @objid ("546678ba-e137-4307-9ed4-a4d8b59d4d84")
    public boolean isSysMLApplied() {
        return this.sysmlApplied;
    }

    @objid ("c9b21349-292b-497a-88b2-553ac6bbd6dc")
    public void setSysMLApplied() {
        this.sysmlApplied = true;
    }

    @objid ("fb013641-9695-476c-a0b7-4129306f49f7")
    public List<Project> getExportedLibrary() {
        return this.libraryExported;
    }

    @objid ("a2f4c3e2-0e55-4d75-ad0a-d2fad2edc6f8")
    public void addExportedLibrary(final Project libraryProject) {
        if (!(this.libraryExported.contains(libraryProject)))
            this.libraryExported.add(libraryProject);
    }
    
    
    public EcoreTypes getEcoreTypes() {
        return this.ecoreTypes;
    }
    


}
