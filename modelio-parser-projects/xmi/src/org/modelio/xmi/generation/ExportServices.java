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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.xmi.api.FormatExport;
import org.modelio.xmi.api.XMIExtension;
import org.modelio.xmi.model.objing.profile.PExportProfile;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.ProfileUtils;
import org.modelio.xmi.util.ScopeChecker;
import org.modelio.xmi.util.XMIFileUtils;
import org.modelio.xmi.util.XMIProperties;
import org.modelio.xmi.util.modelermodule.IModelerModuleStereotypes;
import org.osgi.framework.Bundle;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class provides the XMI export services.
 * @author ebrosse
 */
@objid ("49ec20f8-6d04-453a-850d-8e1c718de33b")
public class ExportServices {
    @objid ("2e7f0915-aa80-4bfc-b6da-c60b9a0adbe1")
    private final String version = "3.0.0";

   // @objid ("35ceb519-9815-4631-9c6a-fe252a68d26a")
    //private final Shell _shell;

    /**
     * Create an Ecore Resource in the resourcePath location
     * @param resourcePath The desired location of the Ecore Resource
     * @return
     * The Ecore Resource located in resourcePath
     */
    @objid ("4087b90b-adbb-428f-a9a5-518b4eb9b482")
    public Resource createResource(final String resourcePath) {
        File file = new File(resourcePath);

        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Xmi.LOG.error(e);
            }
        }

        ResourceSet resourceSet2 = new ResourceSetImpl();

        // Register the default resource factory -- only needed for
        // stand-alone!

        resourceSet2.getPackageRegistry().put(org.eclipse.uml2.uml.UMLPackage.eNS_URI,
                UMLPackage.eINSTANCE);

        resourceSet2.getResourceFactoryRegistry().getExtensionToFactoryMap()
        .put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
        Map<URI, URI> uriMap = resourceSet2.getURIConverter().getURIMap();
        final Bundle bundle = Platform.getBundle("org.eclipse.uml2.uml.resources");

        IPath libraries = new Path("/libraries");
        IPath metamodels = new Path("/metamodels");
        IPath profiles = new Path("/profiles");


        URI uriLibraries = URI.createURI(FileLocator.find(bundle, libraries, null).toExternalForm());
        URI uriMetamodels = URI.createURI(FileLocator.find(bundle, metamodels, null).toExternalForm());
        URI uriProfiles = URI.createURI(FileLocator.find(bundle, profiles, null).toExternalForm());

        uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uriLibraries);
        uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uriMetamodels);
        uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uriProfiles);

        resourceSet2.getResourceFactoryRegistry().getExtensionToFactoryMap()
        .put(Resource.Factory.Registry.DEFAULT_EXTENSION,
                new UMLResourceFactoryImpl());

        // Get the URI of the model file.

        URI fileURI2 = URI.createFileURI(file.getAbsolutePath());
        Resource resource2 = resourceSet2.createResource(fileURI2);
        return resource2;
    }

    @objid ("7c89c67b-f1f1-4fc8-b662-2adf59dba967")
    private void applyProfile() {
        GenerationProperties genProp = GenerationProperties.getInstance();

        Model model = genProp.getEcoreModel(); 

        for(org.eclipse.uml2.uml.Profile profile : genProp.getExportedProfiles()){
            try{
                model.applyProfile(profile);
            }catch(Exception e){
                Xmi.LOG.error(e);
            }
        }

        if (genProp.isSysMLApplied()){
            try{
                model.applyProfile(genProp.getSysMLProfile());
            }catch(Exception e){
                Xmi.LOG.error(e);
            }
            applySysML();
        }


        for (ModelElement element :  genProp.getStereotypesExported()){

            org.eclipse.uml2.uml.Element ecoreElement = genProp.getMappedElement(element);

            if  (ecoreElement != null){

                exportStereotype(element, ecoreElement);

                //Apply tagged Values
                ProfileUtils.setValue(element, ecoreElement);

            }
        }

        genProp.cleanStereotypesExported();
    }

    /**
     * @param theShell the current shell
     */
    @objid ("b540be75-ba78-4f13-90bb-fc5a60149afc")
    public ExportServices() {
    }

    /**
     * Save the Modelio model in the Ecore resource
     * @param resource The Ecore resource
     * @param progressBar The progress bar of the XMI dialog
     * @return
     * false if an error occurs during the export
     */
    @objid ("361a08c2-8d1a-41e5-85d0-7ddb2d6a661e")
    public boolean createEcoreModel(final Resource resource, final IProgressMonitor localMonitor) {

        boolean error = false;

        GenerationProperties genProp = GenerationProperties.getInstance();        
        PartialExportMap partialMap = PartialExportMap.getInstance();
        TotalExportMap totalMap = TotalExportMap.getInstance();
        Package selectedPkg = genProp.getSelectedPackage();            
        List<ModelTree> exportScopeElts = new ArrayList<>();

        partialMap.clear();
        totalMap.clear();

        exportScopeElts.add(selectedPkg);

        ScopeChecker scopeChecker = new ScopeChecker(GenerationProperties
                .getInstance().getSelectedPackage());
        genProp.setScopeChecker(scopeChecker);

        //create Model
        Model ecoreModel = UMLFactory.eINSTANCE.createModel();
        ObjingEAnnotation.setExporterVersion(ecoreModel, this.version);
        ObjingEAnnotation.setRoundTrip(ecoreModel, genProp.isRoundtripEnabled());
        ecoreModel.setName(selectedPkg.getName());
        genProp.setEcoreModel(ecoreModel);

        partialMap.put(selectedPkg.getUuid().toString(), ecoreModel);
        genProp.setExportScopeElts(exportScopeElts);

        XMIExportBehavior exportBehavior = new XMIExportBehavior(localMonitor);
        GenericMetamodelVisitor visitObjingModel = new GenericMetamodelVisitor(exportBehavior);
        genProp.setObjingVisitor(visitObjingModel);      

              
        if(localMonitor != null) 
            localMonitor.setTaskName(Xmi.I18N.getString("progressBar.content.export.XMIElementExport"));

        for (ModelTree rootElt : exportScopeElts) {
            
            rootElt.accept(visitObjingModel);

            org.eclipse.uml2.uml.PackageableElement ecoreRoot = (org.eclipse.uml2.uml.PackageableElement) genProp
                    .getMappedElement(rootElt);

            if (ecoreRoot != null) {
             
                if (!ecoreRoot.equals(ecoreModel)){
                    ecoreModel.getPackagedElements().add(ecoreRoot);
                }

                for (org.eclipse.uml2.uml.PrimitiveType primitive :  genProp.getEcoreTypes().getPredifinedTypeList()){
                    ecoreModel.getPackagedElements().add(primitive);
                }

                for (Project library :  GenerationProperties.getInstance().getExportedLibrary()){
                    Package libraryModel = library.getModel(); 
                    libraryModel.accept(visitObjingModel);              
                    ecoreModel.getPackagedElements().add((org.eclipse.uml2.uml.Package) genProp
                            .getMappedElement(libraryModel));
                }
            }
        }

        if (ecoreModel.getPackagedElements().size() > 0) {    

            resource.getContents().add(ecoreModel);
            
            if(localMonitor != null) 
                localMonitor.setTaskName(Xmi.I18N.getString("progressBar.content.export.XMIProfileSave"));

            //define the profile structure
            profileDefinition();

            //save stereotype
            profileExport(localMonitor);

            applyProfile(); 

            partialMap.clear();
            totalMap.clear();

            if(localMonitor != null) 
                localMonitor.setTaskName(Xmi.I18N.getString("progressBar.content.export.XMIFileSave"));

            error = saveRessource(resource);

            if (error) {
                /*Display.getDefault().asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        MessageBox messageBox = new MessageBox(ExportServices.this._shell, SWT.ICON_ERROR);
                        messageBox.setMessage(Xmi.I18N.getString("info.export.result_failed.inSave"));
                        messageBox.setText(Xmi.I18N.getString("info.export.result_failed"));
                        messageBox.open();
                    }
                });*/

                Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("info.export.result_failed"));
            }

        } else {
        	/* Display.getDefault().asyncExec(new Runnable() {
                @Override
                public void run() {
                    MessageBox messageBox = new MessageBox(ExportServices.this._shell, SWT.ICON_ERROR);
                    messageBox.setMessage(Xmi.I18N.getString("info.export.result_failed"));
                    messageBox.setText(Xmi.I18N.getString("info.export.result_failed.root_null"));
                    messageBox.open();
                }
            });*/


            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N
                    .getString("info.export.result_failed.root_null"));

        }

        genProp.supressProfile();
        if (genProp.isSysMLApplied())
            genProp.supressSysMLProfile();

        return error;
    }

    @objid ("f6581620-7016-432d-8bab-1fd63090a190")
    private void profileExport(IProgressMonitor localMonitor) {
        for(org.eclipse.uml2.uml.Profile profile : GenerationProperties.getInstance().getExportedProfiles()){
            if (profile.getOwner() == null) { 

                if(localMonitor != null) 
                    localMonitor.setTaskName(Xmi.I18N.getMessage("progressBar.content.export.XMIProfileSave", profile.getName()));

                String extension = null;

                if (GenerationProperties.getInstance().getFileExtension().equals(XMIExtension.XMI))
                    extension = ".xmi";
                else
                    extension = ".uml";

                String profilePath = GenerationProperties.getInstance().getFileDirectory() + java.io.File.separator
                        +  profile.getName() +  ".profile" + extension;

                Resource resourceProfile = createResource(profilePath);

                resourceProfile.getContents().add(profile);

                for (Iterator<?> allContents = UML2Util.getAllContents(profile, true, false); allContents.hasNext();) {
                    EObject eObject = (EObject) allContents.next();
                    if (eObject instanceof org.eclipse.uml2.uml.Element) {
                        resourceProfile.getContents().addAll(((org.eclipse.uml2.uml.Element) eObject).getStereotypeApplications());
                    }
                }

                try {
                    resourceProfile.save(null);

                    if (!GenerationProperties.getInstance().getExportVersion().equals(FormatExport.EMF300))
                        XMIFileUtils.changeToUML(resourceProfile.getURI().toFileString(), GenerationProperties.getInstance().getTempFolder());

                } catch (IOException ioe) {    
                    Xmi.LOG.error(ioe);
                }
            }
        }


        if (GenerationProperties.getInstance().isSysMLApplied()){

            org.eclipse.uml2.uml.Profile profile = GenerationProperties.getInstance().getSysMLProfile();

            String profileName = profile.getName();

            if(localMonitor != null) 
                localMonitor.setTaskName(Xmi.I18N.getMessage("progressBar.content.export.XMIProfileSave", profileName));

            String extension = null;

            if (GenerationProperties.getInstance().getFileExtension().equals(XMIExtension.XMI))
                extension = ".xmi";
            else
                extension = ".uml";

            String profilePath = GenerationProperties.getInstance().getFileDirectory() + java.io.File.separator
                    + profileName +  ".profile" + extension;

            Resource resourceProfile = createResource(profilePath);

            resourceProfile.getContents().add(profile);

            for (Iterator<?> allContents = UML2Util.getAllContents(profile, true, false); allContents.hasNext();) {
                EObject eObject = (EObject) allContents.next();
                if (eObject instanceof org.eclipse.uml2.uml.Element) {
                    resourceProfile.getContents().addAll(((org.eclipse.uml2.uml.Element) eObject).getStereotypeApplications());
                }
            }

            try {
                resourceProfile.save(null);

                if (!GenerationProperties.getInstance().getExportVersion().equals(FormatExport.EMF300))
                    XMIFileUtils.changeToUML(resourceProfile.getURI().toFileString(), GenerationProperties.getInstance().getTempFolder());

            } catch (IOException ioe) {
                Xmi.LOG.error(ioe);
            }
        }
    }

    /**
     * Export the Modelio model into Ecore model
     * @param selectedPkg The root of the Modelio model
     * @param progressBar The progress bar of the XMI dialog
     * @return The Ecore model
     */
    @objid ("d6620193-d27f-42c2-ba96-752cfbdb374f")
    public Model createEcoreModel(Package selectedPkg, IProgressMonitor localMonitor) {
        GenerationProperties genProp = GenerationProperties.getInstance();
        PartialExportMap partialMap = PartialExportMap.getInstance();
        TotalExportMap totalMap = TotalExportMap.getInstance();

        partialMap.clear();
        totalMap.clear();

        ScopeChecker scopeChecker = new ScopeChecker(GenerationProperties
                .getInstance().getSelectedPackage());
        genProp.setScopeChecker(scopeChecker);


        Model ecoreModel = UMLFactory.eINSTANCE.createModel();
        ObjingEAnnotation.setExporterVersion(ecoreModel, this.version);     
        ObjingEAnnotation.setRoundTrip(ecoreModel, genProp.isRoundtripEnabled());

        List<ModelTree> exportScopeElts = new ArrayList<>();
        exportScopeElts.add(selectedPkg);
        genProp.setExportScopeElts(exportScopeElts);

        ecoreModel.setName(selectedPkg.getName());
        partialMap.put(selectedPkg.getUuid().toString(), ecoreModel);

        genProp.setEcoreModel(ecoreModel);

        XMIExportBehavior exportBehavior = new XMIExportBehavior(localMonitor);
        GenericMetamodelVisitor visitObjingModel = new GenericMetamodelVisitor(exportBehavior);
        genProp.setObjingVisitor(visitObjingModel);

        boolean ecoreRootNull = true;
        for (ModelTree rootElt : exportScopeElts) {
            rootElt.accept(visitObjingModel);

            org.eclipse.uml2.uml.Namespace ecoreRoot = (org.eclipse.uml2.uml.Namespace) genProp.getMappedElement(rootElt);

            if (ecoreRoot != null) {
                ecoreRootNull = false;
                if (!ecoreRoot.equals(ecoreModel))
                    ecoreModel.getPackagedElements().add((PackageableElement)ecoreRoot);
            }
        }

        if (ecoreRootNull) {

            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N
                    .getString("info.export.result_failed.root_null"));

        }
        return ecoreModel;
    }

    /**
     * This method counts the number of ModelTree available inside a given one's
     * @param theElement The root ModelTree
     * @return
     * The number of sub ModelTree
     */
    @objid ("54eff7ad-eedc-4af9-b328-c82688e14199")
    public int countModelTrees(ModelTree theElement) {
        int sum = 1;

        List<ModelTree> ownedElts = theElement.getOwnedElement();
        for (ModelTree elt : ownedElts) {
            sum += countModelTrees(elt);
        }
        return sum;
    }

    /**
     * Export a org.eclipse.uml2.uml.Profile in EMF format
     * @param resource The EMF resource which will be the profile
     * @param progressBar The progress bar of the XMI dialog
     * @return
     * true if the profile has been exported
     */
    @objid ("d8a4ed4f-3984-4400-aeb4-073b7ab703c0")
    public boolean createEcoreProfile(final Resource resource, final IProgressMonitor localMonitor) {

        boolean error = false;

        GenerationProperties genProp = GenerationProperties.getInstance();
        PartialExportMap partialMap = PartialExportMap.getInstance();
        TotalExportMap totalMap = TotalExportMap.getInstance();

        Profile rootProfile = (Profile) genProp.getSelectedPackage();

        partialMap.clear();
        totalMap.clear();

        org.eclipse.uml2.uml.Profile ecoreProfile = ProfileUtils.createEcoreProfile(rootProfile);

        TotalExportMap.getInstance().put(rootProfile.getUuid().toString(), ecoreProfile);

        ScopeChecker scopeChecker = new ScopeChecker(GenerationProperties
                .getInstance().getSelectedPackage());
        GenerationProperties.getInstance().setScopeChecker(scopeChecker);

        ProfileExportVisitorImpl profileVisitor = new ProfileExportVisitorImpl();
        PExportProfile pprofile = new PExportProfile(rootProfile);
        profileVisitor.visit(pprofile);

        if(localMonitor!= null) 
            localMonitor.setTaskName(Xmi.I18N.getString("progressBar.content.export.XMIFileSave"));

        ObjingEAnnotation.setExporterVersion(ecoreProfile, this.version);  
        resource.getContents().add(ecoreProfile);

        try {
            resource.save(null);
        } catch (Exception ioe) {
            error = true;      
            Xmi.LOG.error(ioe);
        }


        if (error) {
            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N
                    .getString("info.export.result_failed"));

        } else {
            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N
                    .getString("info.export.result_done"));

            if(localMonitor!= null) 
                localMonitor.done();

        }

        return error;
    }

    @objid ("2b68d8a7-d5d7-4dfc-a726-5f35466017ad")
    private boolean saveRessource(Resource resource) {
        File file = new File(resource.getURI().toFileString());

        if (file.exists())
            file.delete();

        try {
            resource.save(null);
        } catch (IOException e) {
            Xmi.LOG.error(e);
            return true;
        }
        return false;
    }

    @objid ("bb4ffffb-65be-40cb-833e-1719c7fec64e")
    private void exportStereotype(ModelElement element, org.eclipse.uml2.uml.Element ecoreElement) {
        // apply existing stereotypes 

        GenerationProperties genProp  = GenerationProperties.getInstance();

        for (Stereotype stereotype : element.getExtension()){

            org.eclipse.uml2.uml.Stereotype ecoreStereotype = (org.eclipse.uml2.uml.Stereotype) genProp.getMappedElement(stereotype);

            if ((ecoreStereotype != null) &&  (ecoreElement.isStereotypeApplicable(ecoreStereotype))
                    && (!(ecoreElement.getAppliedStereotypes().contains(ecoreStereotype)))){

                try{
                    ecoreElement.applyStereotype(ecoreStereotype);

                }catch(IllegalArgumentException e){       
                    Xmi.LOG.error(e);
                }

            }
        }

        // apply exiting metaclass references
        for(TaggedValue taggedValue : element.getTag()){

            MetaclassReference metaclassReference = taggedValue.getDefinition().getOwnerReference();

            if (metaclassReference != null){

                org.eclipse.uml2.uml.Stereotype ecoreStereotype = (org.eclipse.uml2.uml.Stereotype) genProp.getMappedElement(metaclassReference);

                if ((ecoreStereotype != null) 
                        &&  ecoreElement.isStereotypeApplicable(ecoreStereotype)
                        && (!ecoreElement.getAppliedStereotypes().contains(ecoreStereotype)))
                    ecoreElement.applyStereotype(ecoreStereotype);
            }
        }
    }

    @objid ("21459bd2-d40a-4a98-b098-a31104655912")
    private void applySysML() {
        GenerationProperties genProp = GenerationProperties.getInstance();

        org.eclipse.uml2.uml.Profile sysMLProfile =  genProp.getSysMLProfile();

        for (ModelElement element :  genProp.getSysMLExported()){

            org.eclipse.uml2.uml.Element ecoreElement = genProp.getMappedElement(element);

            if  (ecoreElement != null){
                if (element instanceof Requirement){
                    Requirement requirement = (Requirement) element;
                    org.eclipse.uml2.uml.Stereotype requirementSter = sysMLProfile.getOwnedStereotype("Requirement");
                    try{
                        ecoreElement.applyStereotype(requirementSter);
                        ecoreElement.setValue(requirementSter,     "Text", requirement.getDefinition());
                        ecoreElement.setValue(requirementSter,     "Id", requirement.getName());
                    }catch(Exception e){
                        Xmi.LOG.error(e);
                    }
                }else if (element instanceof Dependency){
                    Dependency dependency  = (Dependency) element;
                    try{
                        if (element.isStereotyped(XMIProperties.modelerModuleName, IModelerModuleStereotypes.SATISFY)){
                            org.eclipse.uml2.uml.Stereotype satisfyStereotype = sysMLProfile.getOwnedStereotype("Satisfy");
                            genProp.getMappedElement(dependency).applyStereotype(satisfyStereotype);
                            setRequirementsRelated(dependency);
                        }else if (element.isStereotyped(XMIProperties.modelerModuleName, IModelerModuleStereotypes.VERIFY)){ 
                            org.eclipse.uml2.uml.Stereotype verifyStereotype = sysMLProfile.getOwnedStereotype("Verify");
                            genProp.getMappedElement(dependency).applyStereotype(verifyStereotype);
                            setRequirementsRelated(dependency);
                        }else if (element.isStereotyped(XMIProperties.modelerModuleName, IModelerModuleStereotypes.DERIVE)){ 
                            org.eclipse.uml2.uml.Stereotype deriveStereotype = sysMLProfile.getOwnedStereotype("DeriveReqt");
                            genProp.getMappedElement(dependency).applyStereotype(deriveStereotype);
                            setRequirementsRelated(dependency);
                        }
                    }catch(IllegalArgumentException e){
                        Xmi.LOG.error(e);
                    }
                }else if (element instanceof Note){
                    Note note = (Note) element;

                    if (note.getModel().getName().equals("Rationale")){
                        org.eclipse.uml2.uml.Stereotype ratStereotype = sysMLProfile.getOwnedStereotype("Rationale");
                        genProp.getMappedElement(note).applyStereotype(ratStereotype);
                    }else if (note.getModel().getName().equals("Problem")){
                        org.eclipse.uml2.uml.Stereotype ratStereotype = sysMLProfile.getOwnedStereotype("Problem");
                        genProp.getMappedElement(note).applyStereotype(ratStereotype);
                    }
                }
            }
        }

        genProp.cleanSysMLElementExported();
    }

    @objid ("d384f783-81b6-428a-ae48-945aead29160")
    private void setRequirementsRelated(final Dependency element) {
        if (!(element.getDependsOn() instanceof Requirement))
            setRequirementRelated( GenerationProperties.getInstance().getMappedElement(element.getDependsOn()));

        if (!(element.getImpacted() instanceof Requirement))
            setRequirementRelated( GenerationProperties.getInstance().getMappedElement(element.getImpacted()));
    }

    @objid ("ee4fafce-8940-4133-8d66-93f55944201c")
    private void setRequirementRelated(final org.eclipse.uml2.uml.Element mappedElement) {
        mappedElement.applyStereotype(GenerationProperties.getInstance().getSysMLProfile()
                .getOwnedStereotype("RequirementRelated"));
    }

    @objid ("4b62cbc4-dd28-4087-b797-9015e612b681")
    private void profileDefinition() {
        for(org.eclipse.uml2.uml.Profile profile : GenerationProperties.getInstance().getExportedProfiles()){
            profile.define();
        }

        if (GenerationProperties.getInstance().isSysMLApplied())
            GenerationProperties.getInstance().getSysMLProfile().define();
    }

}
