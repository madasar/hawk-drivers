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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.impl.PackageImpl;
import org.eclipse.uml2.uml.internal.impl.ProfileImpl;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.modelio.api.model.IModelingSession;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.EcoreModelNavigation;
import org.modelio.xmi.util.ResourceLoader;
import org.modelio.xmi.util.XMIFileUtils;
import org.modelio.xmi.util.XMILogs;
import org.osgi.framework.Bundle;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class provides all import services
 * @author ebrosse
 */
@objid ("50c0c8f2-7390-46f9-b380-d79dd470008d")
public class ImportServices {
    @objid ("dd0291cc-7ad7-422f-9923-1d7a3709a175")
    private int ownedElements = 0;

    @objid ("379d1b50-de78-4b0c-8bb9-acdaf444751e")
    private List<String> profiles = new ArrayList<>();

    @objid ("178269f7-c1d6-40dd-8299-8c64c15addec")
    private Resource loadEcoreModel(File xmiFile) {
        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();
        // Register the default resource factory -- only needed for
        // stand-alone!
        resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
        
        
        final Bundle bundle = Platform.getBundle("org.eclipse.uml2.uml.resources");
        
        IPath libraries = new Path("/libraries");
        IPath metamodels = new Path("/metamodels");
        IPath profile = new Path("/profiles");
        
        
        URI uriLibraries = URI.createURI(FileLocator.find(bundle, libraries, null).toExternalForm());
        URI uriMetamodels = URI.createURI(FileLocator.find(bundle, metamodels, null).toExternalForm());
        URI uriProfiles = URI.createURI(FileLocator.find(bundle, profile, null).toExternalForm());
        
        
        URIConverter.URI_MAP.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uriLibraries);
        URIConverter.URI_MAP.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uriMetamodels);
        URIConverter.URI_MAP.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uriProfiles);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new UMLResourceFactoryImpl());
        
        URI fileURI = URI.createFileURI(xmiFile.getAbsolutePath());
        
        Resource result = null;
        
        try{
            result = resourceSet.getResource(fileURI, true);
        }catch(Exception e){
        
            deleteUnresolvedReference(xmiFile, fileURI, resourceSet );
        
            result = resourceSet.getResource(fileURI, false);
        
            //ecriture du log
            if (result != null){
                XMILogs xmilogs = XMILogs.getInstance();
        
                for (Resource.Diagnostic diagnostic : result.getErrors()){
                    xmilogs.writelnInLog(Xmi.I18N.getMessage("info.import.emf.error", diagnostic.getMessage()));
                }
        
            }
        }
        return result;
    }

    @objid ("1c27fa27-dc7e-4a87-a788-f6d4dc9007bb")
    private void attachExternalElements(OwnedCompositionUml2Visitor visitEcoreModel) {
        PartialImportMap partialImportMap = PartialImportMap.getInstance();
        TotalImportMap totalImportMap = TotalImportMap.getInstance();
        
        List <org.eclipse.uml2.uml.Element> externalElements = new ArrayList <>();
        
        for (Object key : partialImportMap.keySet()) {
            if (key != null){
                if (key instanceof org.eclipse.uml2.uml.Element) {
                    externalElements.add((org.eclipse.uml2.uml.Element) key);
                }
            }else{
                partialImportMap.remove(key);
            }
        }
        
        for (org.eclipse.uml2.uml.Element externalElt : externalElements) {  
            if (EcoreModelNavigation.isModelChild(externalElt)){
                if (externalElt instanceof org.eclipse.uml2.uml.Model){        
                    totalImportMap.put(externalElt, partialImportMap.remove(externalElt));
                } else if (totalImportMap.get(externalElt) != null) {
                    partialImportMap.remove(externalElt);
                } else if (externalElt instanceof org.eclipse.uml2.uml.PrimitiveType) {
                    attachExternalPrimitiveType((org.eclipse.uml2.uml.PrimitiveType) externalElt, partialImportMap, totalImportMap);          
                }
            }else{
        
                Object result = partialImportMap.get(externalElt);
                if (result != null){
                    if (result instanceof Element){ 
                        if(((Element) result).getStatus().isModifiable()){
                            ((Element) result).delete();
                        }
                    }else{
                        for (Element elt: (List<Element>) result){
                            if(elt.getStatus().isModifiable()){
                                elt.delete();
                            }
                        }
                    }
                }
            }
            partialImportMap.remove(externalElt);
        }
        
        if (partialImportMap.size() != 0) {
            attachExternalElements(visitEcoreModel);
        }
    }

    /**
     * @throws Exception
     * @param xmiFile @return
     */
    @objid ("3c930297-3485-4ed3-a72c-c7fa35a33fcd")
    public Resource getResource(File xmiFile) throws Exception {
        //load file
        if (XMIFileUtils.containsPatterns(xmiFile, getUMLPatterns())){
            return loadModel(xmiFile, getOldUMLPatterns(), getNewUMLPatterns());
        }else{
            return loadModel(xmiFile, getOldEMFPatterns(), getNewEMFPatterns());
        }
    }

    /**
     * @param resource : the Ecore resource
     * @param progressBar : the progressBar
     * @param shell : the parent Shell
     * @return false if any errors occurs
     */
    @objid ("9843ce16-2b0e-4701-8a22-b0a2c6d98ada")
    public boolean importEcoreModel(final Resource resource, final Shell shell, final IProgressMonitor localMonitor) {
        boolean error = false;
        
        if (resource != null) {
        
            boolean isAEcoreModel = isEcoreModel(resource);
        
            if (isAEcoreModel) {
                importModel(localMonitor);
                cleanResource(resource);
            } else {
                error = true;
        
                shell.getDisplay().asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        MessageBox messageBox = new MessageBox(shell, SWT.ICON_INFORMATION);
                        messageBox.setMessage(Xmi.I18N.getString("info.import.result_failed.notModel"));
                        messageBox.setText(Xmi.I18N.getString("info.import.result_failed.notModel"));
                        messageBox.open();
                    }
                });
                Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N
                        .getString("info.import.result_failed.notModel"));
        
            }
        
            resource.unload();
        
        }
        return error;
    }

    /**
     * @param model
     * @param progressBar
     * @param shell
     * @param session
     * @param t @return
     */
    @objid ("14554c61-1832-4c07-a4c2-2c02c0334aab")
    public boolean importEcoreModel(org.eclipse.uml2.uml.Model model, IProgressMonitor localMonitor, Shell shell, IModelingSession session) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        TotalImportMap totalImportMap = TotalImportMap.getInstance();
        boolean error = false;
        
        revProp.addEcoreModel(model);
        
        revProp.storeImportModelRoundtripMode(model);
        
        XMIImportBehavior importBehavior = new XMIImportBehavior(localMonitor);
        OwnedCompositionUml2Visitor visitEcoreModel = new OwnedCompositionUml2Visitor(
                importBehavior, model);
        revProp.setEcoreVisitor(visitEcoreModel);
        
        org.modelio.metamodel.uml.statik.Package objingTechnicalRoot = revProp.getUMLRoot();
        
        totalImportMap.put(model, objingTechnicalRoot);
        
        // Launch visit of the model:
        visitEcoreModel.doSwitch(model);
        
        localMonitor.setTaskName(Xmi.I18N
                .getString("progressBar.content.import.checkConsistency"));
        
        
        attachExternalElements(visitEcoreModel);
        cleanExternalElements();
        
        
        localMonitor.done();
        return error;
    }

    @objid ("a30d057e-ac4d-4783-b9a1-9a28874b4c29")
    private int initProgressBar(org.eclipse.uml2.uml.Package modelToImport) {
        this.ownedElements = 0;
        
        for (Object elem : modelToImport.getOwnedMembers()) {
            if (elem instanceof org.eclipse.uml2.uml.Namespace)
                countOwnedElements((org.eclipse.uml2.uml.Namespace) elem);
        }
        return this.ownedElements * 2;
    }

    @objid ("f3a2189e-0e32-4411-a91c-f32b4949826a")
    private void countOwnedElements(org.eclipse.uml2.uml.Namespace elem) {
        this.ownedElements++;
        for (Object elt : elem.getOwnedElements()) {
            if (elt instanceof org.eclipse.uml2.uml.Namespace)
                countOwnedElements((org.eclipse.uml2.uml.Namespace) elt);
        }
    }

    @objid ("ce85c084-ca87-47d4-8bff-ee6c2e9c6794")
    private void attachExternalPrimitiveType(org.eclipse.uml2.uml.PrimitiveType externalElt, PartialImportMap partialImportMap, TotalImportMap totalImportMap) {
        DataType temp = (DataType) partialImportMap.remove(externalElt);
        
        if (temp.getOwner() == null){
            temp.setIsElementary(true);
            temp.setName(externalElt.getName());
        
            org.modelio.metamodel.uml.statik.Package root = ReverseProperties.getInstance().getExternalPackage();
            root.getOwnedElement().add(temp);
            temp.setOwner(root);
        
            totalImportMap.put(externalElt, partialImportMap.remove(externalElt));
        }
    }

    /**
     * This Method export a given profile in a given Ecore Resource
     * @param resource : the Ecore Resource
     * @param root : the root of the export
     * @param progressBar : the progressBar
     * @param shell : the current shell
     * @return true if no error happen
     */
    @objid ("db6b95e9-771e-4565-ac3b-932cd280aa2f")
    public boolean importEcoreProfile(Resource resource, MObject root, IProgressMonitor localMonitor,final Shell shell) {
        boolean error = false;
        
        ReverseProperties revProp = ReverseProperties.getInstance();
        
        if (resource != null) {
            ProfileImpl profileToImport = null;
            boolean isAProfile = false;
        
            for (Object elem : resource.getContents()) {
                if (elem.getClass().getSimpleName().compareTo("ProfileImpl") == 0) {
                    isAProfile = true;
                    profileToImport = (ProfileImpl) elem;
                    revProp.setEcoreProfile(profileToImport);
                }
        
                if (elem.getClass().getSimpleName().compareTo("ModelImpl") == 0) {
                    for (Object packaged : ((org.eclipse.uml2.uml.Model) elem).getPackagedElements()) {
                        if (packaged.getClass().getSimpleName().compareTo("ProfileImpl") == 0) {
                            isAProfile = true;
                            profileToImport = (ProfileImpl) packaged;
                            revProp.setEcoreProfile(profileToImport);
                        }
                    }
                }
            }    
        
            if (isAProfile) {
        
                revProp.storeImportModelRoundtripMode(profileToImport);
        
                revProp.addEcoreModel(profileToImport);
        
                if(localMonitor != null) 
                    localMonitor.beginTask(Xmi.I18N.getString("progressBar.content.export.XMIFileInit"), initProgressBar(profileToImport));
        
                XMIImportBehavior importBehavior = new XMIImportBehavior(localMonitor);
                
                OwnedCompositionUml2Visitor visitEcoreModel = new OwnedCompositionUml2Visitor(
                        importBehavior, profileToImport);
                revProp.setEcoreVisitor(visitEcoreModel);
        
                visitEcoreModel.doSwitch(profileToImport); 
        
                if(localMonitor != null)  
                    localMonitor.setTaskName(Xmi.I18N
                            .getString("progressBar.content.import.checkConsistency"));
        
            } else {
                error = true;
        
                shell.getDisplay().asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        MessageBox messageBox = new MessageBox(shell, SWT.ICON_INFORMATION);
                        messageBox.setMessage(Xmi.I18N.getString("info.import.result_failed.notProfile"));
                        messageBox.setText(Xmi.I18N.getString("info.import.result_failed.notProfile"));
                        messageBox.open();
                    }
                });
                Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N
                        .getString("info.import.result_failed.notProfile"));
            }
        
        }
        return error;
    }

    @objid ("8347ea4e-1f98-466c-bdc9-283897573a5e")
    private boolean isEcoreModel(Resource resource) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        
        boolean result = false;
        
        for (Object elem : resource.getContents()) {
        
            String className = elem.getClass().getSimpleName();
            if (className.equals("ModelImpl") || className.equals("PackageImpl")) {
                revProp.addEcoreModel((PackageImpl) elem);
                result = true;      
            }
        
        }
        return result;
    }

    @objid ("d9938fd3-af55-4fbc-9897-40a9205f3a8f")
    private void cleanResource(Resource resource) {
        File tempFolder = ReverseProperties.getInstance().getTempFolder();
        
        for( File file : Arrays.asList(tempFolder.listFiles())){
            file.delete();
        }
        
        tempFolder.delete();
        resource.unload();
    }

    @objid ("635dc388-58eb-48f0-a930-63c5edbd4f7b")
    private void importModel(IProgressMonitor localMonitor) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        
        try{
        PartialImportMap.getInstance().clear();
        TotalImportMap.getInstance().clear();
        
        
        for(org.eclipse.uml2.uml.Package modelToImport : revProp.getEcoreModels()){
        
            revProp.storeImportModelRoundtripMode(modelToImport);    
        
            XMIImportBehavior importBehavior = new XMIImportBehavior(localMonitor);
            
            OwnedCompositionUml2Visitor visitEcoreModel = new OwnedCompositionUml2Visitor(
                    importBehavior, modelToImport);
            revProp.setEcoreVisitor(visitEcoreModel);
        
            org.modelio.metamodel.uml.statik.Package objingTechnicalRoot = revProp.getUMLRoot();
            TotalImportMap.getInstance().put(modelToImport, objingTechnicalRoot);
            
            visitEcoreModel.doSwitch(modelToImport); 
            attachExternalElements(visitEcoreModel);
        
        }
        
        if (localMonitor != null) 
            localMonitor.setTaskName((Xmi.I18N.getString("progressBar.content.import.checkConsistency")));
        
        // To finish when it.next working !
        
        }finally{
            
        if (localMonitor != null) 
            localMonitor.done();
        
        revProp.clean();
        }
    }

    @objid ("3cf1765e-63aa-4aa5-8cfe-9d4004cf51a4")
    private void deleteUnresolvedReference(File currentfile, URI fileURI2, ResourceSet resourceSet2) {
        Resource result = resourceSet2.getResource(fileURI2, false);    
        
        if ((result != null) && (result.getErrors() != null) && (result.getErrors().size() != 0)){
            XMIFileUtils.removeReferences(currentfile.getAbsolutePath(),result.getErrors());
        }
    }

    @objid ("da4aab7b-db1d-456c-8b8f-630b65580c9e")
    private Resource loadModel(final File oldFile, final List<String> oldPatterns, final List<String> newPatterns) {
        File newFile = null;
        File tempFile = null;
        List<File> listeFile = new ArrayList<>();
        Resource newresource = null; 
        File tempFolder = ReverseProperties.getInstance().getTempFolder();
        
        try{
            newFile = updateFile(oldFile, oldPatterns, newPatterns, tempFolder);
        
            this.profiles = XMIFileUtils.getAllAppliedProfiles(oldFile.getAbsolutePath());
        
            String directory = oldFile.getParent();
        
            for (String profile : this.profiles){
                try{
                    File profileFile =  new File(directory + java.io.File.separator + profile);
                    if (profileFile.exists()){
                        tempFile = updateFile(profileFile, oldPatterns, newPatterns, tempFolder);
                        listeFile.add(tempFile);
                    }
                }catch(Exception e){
                    Xmi.LOG.error(e);
                }
        
            }
        
            newresource = loadEcoreModel(newFile);
        
            ResourceSet resourceset = newresource.getResourceSet();
        
            for (Resource resource : resourceset.getResources()){
        
                if (resource.getURI().toFileString() != null){ 
                    tempFile = updateFile(new File(resource.getURI().toFileString()), 
                            oldPatterns, newPatterns, tempFolder);
        
                    resource.setURI(URI.createFileURI(tempFile.getAbsolutePath()));
                    listeFile.add(tempFile);
                }
            }
        
            newresource = loadEcoreModel(newFile);
        
        }catch (Exception e){
            Xmi.LOG.error(e);
            if (newFile != null){
                newFile.delete();
                for (File fileTemp : listeFile){
                    fileTemp.delete();
                }
            }
        }
        return newresource;
    }

    @objid ("b91a9b44-fef8-4131-8ff1-5822664649be")
    private File updateFile(final File oldFile, final List<String> oldPatterns, final List<String> newPatterns, File tempFolder) {
        String fileName = oldFile.getName();
       
        String tempFolderPath =  tempFolder.getAbsolutePath();
        
        String newFilePath = tempFolderPath + java.io.File.separator  + fileName;
        File newFile = new File(newFilePath);
        
        String tempPath = tempFolderPath + java.io.File.separator  + fileName + ".temp";
        File tempFile = new File(tempPath);
        
        String tempPath2 = tempFolderPath + java.io.File.separator + fileName + ".temp2";
        File tempFile2 = new File(tempPath2);
        
        String tempPath3 = tempFolderPath + java.io.File.separator + fileName  + ".temp3";
        File tempFile3 = new File(tempPath3);
        
        String tempPath4 = tempFolderPath + java.io.File.separator + fileName  + ".temp4";
        File tempFile4 = new File(tempPath4);
        
        try{
        
            if (tempFile.exists())
                tempFile.delete();
        
            if (tempFile2.exists())
                tempFile2.delete();
        
        
            XMIFileUtils.replace(oldFile.getAbsolutePath(), tempPath, oldPatterns, newPatterns); 
        
            File xslImportFile = ResourceLoader.getInstance().getResource("xslt" + java.io.File.separator + "import.xsl");
            XMIFileUtils.applyXSLT(tempPath, tempPath2, xslImportFile); 
        
        
            if (tempFile3.exists())
                tempFile3.delete();
        
            File xslImport2File = ResourceLoader.getInstance().getResource("xslt" + java.io.File.separator + "import2.xsl");
            XMIFileUtils.applyXSLT(tempPath2, tempPath3, xslImport2File); 
        
            if (tempFile4.exists())
                tempFile4.delete();
        
            File xslImport3File = ResourceLoader.getInstance().getResource("xslt" + java.io.File.separator + "import3.xsl");
            XMIFileUtils.applyXSLT(tempPath3, tempPath4, xslImport3File); 
        
            try{
                newFile.delete();
                newFile.createNewFile();
            }catch(IOException e){
                Xmi.LOG.error(e);
            }
        
            XMIFileUtils.copyFile(tempFile4, newFile);
        
        }finally{
            tempFile.delete();
            tempFile2.delete();
            tempFile3.delete();
            tempFile4.delete();
        }
        return newFile;
    }

    @objid ("73adb37d-ba61-4908-912d-d0cb284caf22")
    private List<String> getOldUMLPatterns() {
        List<String> patterns = new LinkedList<>();
        patterns.add("xmlns:xmi=\"http://www.omg.org/spec/XMI/20110701");  
        patterns.add("xmlns:uml=\"http://schema.omg.org/spec/UML/2.1.1/uml.xml");  
        patterns.add("xmlns:uml[\\s]?=[\\s]?[\"]?[\']?http://www.omg.org/spec/UML/20090901[\"]?[\']?");
        patterns.add("xmlns:uml[\\s]?=[\\s]?[\"]?[\']?http://www.omg.org/spec/UML/20100901[\"]?[\']?");
        patterns.add("xmlns:uml[\\s]?=[\\s]?[\"]?[\']?http://www.omg.org/spec/UML/20110701[\"]?[\']?");
        patterns.add("xmlns:uml[\\s]?=[\\s]?\'?\"?http://schema.omg.org/spec/UML/2.[1.1]?[1.2]?[1]?[2]?[3]?\'?\"");
        patterns.add("http://schema.omg.org/spec/UML/2.2/ [http://www.eclipse.org/uml2/3.0.0/UML]?");
        patterns.add("http://schema.omg.org/spec/UML/2.1.1/uml.xml");
        patterns.add("http://schema.omg.org/spec/UML/2.2/uml.xml");
        patterns.add("http://www.omg.org/spec/UML/20090901/UML.xmi");
        patterns.add("http://www.omg.org/spec/UML/20110701/UML.xmi");
        patterns.add("http://www.omg.org/spec/UML/20110701/PrimitiveTypes.xmi");
        return patterns;
    }

    @objid ("90f607a8-4379-4aa5-bb79-9dec705ed493")
    private List<String> getNewUMLPatterns() {
        List<String> patterns = new LinkedList<>();
        patterns.add("xmlns:xmi=\"http://schema.omg.org/spec/XMI/2.1");  
        patterns.add("xmlns:uml=\"http://www.eclipse.org/uml2/3.0.0/UML" );
        patterns.add("xmlns:uml=\"http://www.eclipse.org/uml2/3.0.0/UML\"" );
        patterns.add("xmlns:uml=\"http://www.eclipse.org/uml2/3.0.0/UML\"" );
        patterns.add("xmlns:uml=\"http://www.eclipse.org/uml2/3.0.0/UML\"" );
        patterns.add("xmlns:uml=\"http://www.eclipse.org/uml2/3.0.0/UML\"" );
        patterns.add("http://www.eclipse.org/uml2/3.0.0/UML/");
        patterns.add("pathmap://UML_METAMODELS/UML.metamodel.uml");
        patterns.add("pathmap://UML_METAMODELS/UML.metamodel.uml");
        patterns.add("pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml");
        patterns.add("http://www.eclipse.org/uml2/3.0.0/UM");
        patterns.add("pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml");
        return patterns;
    }

    @objid ("5b43ef46-fdcd-41f9-81ed-774baf5356ac")
    private List<String> getNewEMFPatterns() {
        List<String> patterns = new LinkedList<>();
        patterns.add("xmlns:xmi=\"http://schema.omg.org/spec/XMI/2.1");          
        patterns.add("xmlns:uml=\"http://www.eclipse.org/uml2/3.0.0/UML\"");
        patterns.add("xmlns:uml=\"http://www.eclipse.org/uml2/3.0.0/UML\"");
        patterns.add("href=\"http://www.eclipse.org/uml2/3.0.0/UML");
        patterns.add("pathmaphref=\"http://www.eclipse.org/uml2/3.0.0/UML");
        return patterns;
    }

    @objid ("34de1e69-677d-4fb8-9262-83c3e60479ec")
    private List<String> getOldEMFPatterns() {
        List<String> patterns = new LinkedList<>();
        patterns.add("xmlns:xmi=\"http://www.omg.org/spec/XMI/20110701");  
        patterns.add("xmlns:uml[\\s]?=[\\s]?\"?\'?http://www.eclipse.org/uml2/3.1.0/UML[/]?\"?\'?");
        patterns.add("xmlns:uml[\\s]?=[\\s]?\"?\'?http://www.eclipse.org/uml2/2.[01]+.0/UML[/]?\"?\'?");
        patterns.add("href[\\s]?=[\\s]?\"?\'?http://www.eclipse.org/uml2/2.[01]+.0/UML");
        return patterns;
    }

    @objid ("6ae77646-9a78-4335-9491-cc519c70bbc5")
    private void cleanExternalElements() {
        PartialImportMap partialImportMap = PartialImportMap.getInstance();
        
        List <org.eclipse.uml2.uml.Element> externalElements = new ArrayList <>();
        
        for (Object key : partialImportMap.keySet()) {
            if (key != null){
                if (key instanceof org.eclipse.uml2.uml.Element) {
                    externalElements.add((org.eclipse.uml2.uml.Element) key);
                }
            }else{
                partialImportMap.remove(key);
            }
        }
        
        ReverseProperties revProp = ReverseProperties.getInstance();
        for (org.eclipse.uml2.uml.Element externalElt : externalElements) {  
            Object objElts = revProp.getMappedElement(externalElt);
            if (objElts instanceof Element){
                ((Element) objElts).delete();
            }else{
                for(Object objElt : (List<Element>)objElts ){
                    if (objElt instanceof Element){
                        ((Element) objElt).delete();
                    }
                }
            }
        }
    }

    @objid ("5606038a-92ef-4753-871a-832904188f1e")
    private List<String> getUMLPatterns() {
        List<String> patterns = new LinkedList<>();
        patterns.add("xmlns:uml=\"http://schema.omg.org/spec/UML/2.1.1/uml.xml");  
        patterns.add("xmlns:uml[\\s]?=[\\s]?[\"]?[\']?http://www.omg.org/spec/UML/20090901[\"]?[\']?");
        patterns.add("xmlns:uml[\\s]?=[\\s]?[\"]?[\']?http://www.omg.org/spec/UML/20100901[\"]?[\']?");
        patterns.add("xmlns:uml[\\s]?=[\\s]?[\"]?[\']?http://www.omg.org/spec/UML/20110701[\"]?[\']?");
        patterns.add("xmlns:uml[\\s]?=[\\s]?\'?\"?http://schema.omg.org/spec/UML/2.[1.1]?[1.2]?[1]?[2]?[3]?\'?\"");
        patterns.add("http://schema.omg.org/spec/UML/2.2/ [http://www.eclipse.org/uml2/3.0.0/UML]?");
        patterns.add("http://schema.omg.org/spec/UML/2.1.1/uml.xml");
        patterns.add("http://schema.omg.org/spec/UML/2.2/uml.xml");
        patterns.add("http://www.omg.org/spec/UML/20090901/UML.xmi");
        patterns.add("http://www.omg.org/spec/UML/20110701/PrimitiveTypes.xmi");
        return patterns;
    }

}
