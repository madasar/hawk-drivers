/*
s * Copyright 2013 Modeliosoft
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
                                    

package org.modelio.xmi.model.objing;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.util.ObjingEAnnotation;

@objid ("af4d387f-d847-4bdd-a57b-666369650bc0")
public class OProvidedInterface extends OElement implements IOElement{
    @objid ("7fc1e77d-ab1b-4ee0-b812-8f4429c5c07e")
    private ProvidedInterface objingElement = null;

    @objid ("865e000d-ec9f-4f06-868b-f1efa8ba6451")
    @Override
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        Port owner = this.objingElement.getProviding();
        NameSpace base = owner.getBase();
        
        if ((base == null)  &&  (GenerationProperties.getInstance().isRoundtripEnabled())) { 
            if (this.objingElement.getProvidedElement().size() == 0)
                return UMLFactory.eINSTANCE.createInterfaceRealization();
            else
                return UMLFactory.eINSTANCE.createDependency();
        }
        return null;
    }

    @objid ("dcf8e38a-11df-405e-b929-c17c2ef8449f")
    public OProvidedInterface(ProvidedInterface param) {
        super(param);
        this.objingElement = param;
    }

    @objid ("ad0397df-d074-4cc2-af82-5271acd54a4f")
    @Override
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        GenerationProperties genprop = GenerationProperties.getInstance();
        Port objingPort = this.objingElement.getProviding();
        org.eclipse.uml2.uml.Element ecorePort = genprop.getMappedElement(objingPort);
        
        if (ecorePort != null){
            NameSpace base = objingPort.getBase();
        
            if (base == null){
        
                if (genprop.isRoundtripEnabled()){
        
                    if (this.objingElement.getProvidedElement().size() == 0){
                        setNumberProvidedInterface();    
                        ecoreElt.destroy();
                    }else{
                        if (ecorePort instanceof org.eclipse.uml2.uml.NamedElement){
                            org.eclipse.uml2.uml.Dependency dependency =  (org.eclipse.uml2.uml.Dependency) ecoreElt;
                            dependency.getClients().add((org.eclipse.uml2.uml.NamedElement) ecorePort);
        
                            for (Interface inter : this.objingElement.getProvidedElement())
                                dependency.getSuppliers().add((org.eclipse.uml2.uml.NamedElement)genprop.getMappedElement(inter));
        
                            ObjingEAnnotation.setProvidedInterface(dependency, true);
        
                            Package pack = ecorePort.getNearestPackage();
                            org.eclipse.uml2.uml.Element temp = ecorePort.getOwner();
                            while((pack == null) && (temp != null)){
                                pack = temp.getNearestPackage();
                                temp = temp.getOwner();
                            }
        
                            if (pack == null)
                                pack =  genprop.getEcoreModel();
        
                            pack.getPackagedElements().add(dependency);
                        }else{
                            ecoreElt.destroy();
                        }
                    }
                }
        
            }else{
        
                org.eclipse.uml2.uml.Element ecoreClient = genprop.getMappedElement(base);
        
                org.eclipse.uml2.uml.InterfaceRealization temp = (org.eclipse.uml2.uml.InterfaceRealization) ecoreElt;
        
                for (Interface objingSupplier : this.objingElement.getProvidedElement()){
        
                    if (temp == null)
                        temp = UMLFactory.eINSTANCE.createInterfaceRealization();
        
                    if ( objingSupplier != null) {
        
                        org.eclipse.uml2.uml.Element ecoreSupplier = genprop.getMappedElement(objingSupplier);
        
                        if ((ecoreClient != null) && ecoreSupplier != null 
                                && ecoreClient instanceof org.eclipse.uml2.uml. BehavioredClassifier 
                                && ecoreSupplier instanceof org.eclipse.uml2.uml.Interface) {
        
                            Boolean exist = false;
        
                            for (Object interRealization : ((org.eclipse.uml2.uml.BehavioredClassifier) ecoreClient).getInterfaceRealizations()){
                                if (((org.eclipse.uml2.uml.InterfaceRealization) interRealization).getContract().equals(ecoreSupplier))
                                    exist = true;
                            }
        
                            if (!exist){
        
                                org.eclipse.uml2.uml.InterfaceRealization interRealiz = temp;
                                interRealiz.setImplementingClassifier((org.eclipse.uml2.uml.BehavioredClassifier)ecoreClient);
                                interRealiz.setContract((org.eclipse.uml2.uml.Interface) ecoreSupplier);
                            }
        
                        }
                        temp = null;
                    }
                }
            }
        }
    }

    @objid ("1d33e6ce-a1c1-4a96-9654-99da57b4ad9b")
    private void setNumberProvidedInterface() {
        int number = 0;
        for (ProvidedInterface provided : this.objingElement.getProviding().getProvided()){
            if (provided.getProvidedElement().size() == 0)
                number++;
        }
        
        if (number != 0)
            ObjingEAnnotation.setNumberProvidedInterface(
                    GenerationProperties.getInstance().getMappedElement(this.objingElement.getProviding()), number);
    }

    @Override
    public void setProperties(Element ecoreElt) {
        // Nothing to do
    }


}
