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
                                    

package org.modelio.xmi.model.objing;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.util.AbstractObjingModelNavigation;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.SysMLProfileUtils;

/**
 * This class handles the export of Note elements
 * @author ebrosse
 */
@objid ("095ecaf0-91db-40f8-9f35-5174e7a62172")
public class ONote extends OElement implements IOElement {
    @objid ("bfaffe25-8d3a-4b42-941c-7462491932fa")
    private Note objingElement = null;

    @objid ("f09b84c7-a880-476a-b417-93a2e84a1d06")
    @Override
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        ModelElement subject = this.objingElement.getSubject();
        org.eclipse.uml2.uml.Element annotatedElement =GenerationProperties.getInstance()
                .getMappedElement(subject);
        
        if (this.objingElement.getModel().getName().equals("TimedObservation") && (annotatedElement instanceof org.eclipse.uml2.uml.NamedElement)){
            return UMLFactory.eINSTANCE.createTimeObservation();
        
        }else{
             org.eclipse.uml2.uml.Comment ecoreComment = UMLFactory.eINSTANCE.createComment();
            if ((this.objingElement.getModel() != null ) 
                    && (((this.objingElement.getModel().getOwnerStereotype() != null ) && (SysMLProfileUtils.isSysML(this.objingElement.getModel().getOwnerStereotype().getOwner()))
                            || ((this.objingElement.getModel().getOwnerReference() != null ) && (SysMLProfileUtils.isSysML(this.objingElement.getModel().getOwnerReference().getOwnerProfile()))))))
                GenerationProperties.getInstance().addSysMLExported(this.objingElement);
        
            return ecoreComment;
        
        }
    }

    /**
     * @param element : the exported Note
     */
    @objid ("9dea1ffc-5d4c-4c5f-ad14-780aab9db96f")
    public ONote(final Note element) {
        super(element);
        this.objingElement = element;
    }

    @objid ("4be1d339-b2ea-4ae4-a495-7e75c5d46235")
    @Override
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        GenerationProperties genProp = GenerationProperties.getInstance();
        
        ModelElement subjectModelElement = this.objingElement.getSubject();
        
        if (subjectModelElement != null) {
            // Gets or creates the ecore element that owns the Note:
            org.eclipse.uml2.uml.Element annotatedElement = genProp.getMappedElement(subjectModelElement);
        
            if (annotatedElement != null) {
        
                if (ecoreElt instanceof  org.eclipse.uml2.uml.Comment){
                    annotatedElement.getOwnedComments().add( (org.eclipse.uml2.uml.Comment)ecoreElt);
                }else{
                    org.eclipse.uml2.uml.Element ecoreOwner = genProp.getMappedElement(AbstractObjingModelNavigation.getNearestPackage(subjectModelElement));
                    if (ecoreOwner instanceof Package){
                        org.eclipse.uml2.uml.TimeObservation timeObs = (org.eclipse.uml2.uml.TimeObservation) ecoreElt;
                        ((org.eclipse.uml2.uml.Package) ecoreOwner).getPackagedElements().add(timeObs);
                        timeObs.setEvent((org.eclipse.uml2.uml.NamedElement) annotatedElement );
                        
                    }else{
                        ecoreElt.destroy();
                    }
                }
            }
        }
    }

    @objid ("7a40312c-7075-4cd4-a011-3fa5c2712165")
    @Override
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        if (ecoreElt instanceof  org.eclipse.uml2.uml.Comment){
            setTypeEAnnotation( (org.eclipse.uml2.uml.Comment) ecoreElt);
            setContents( (org.eclipse.uml2.uml.Comment) ecoreElt);
            setOwnerAnnotation( (org.eclipse.uml2.uml.Comment) ecoreElt);
        }else{
            setName((org.eclipse.uml2.uml.TimeObservation) ecoreElt);
        }
    }

    @objid ("a520f5e8-d478-4e6e-bb2a-89d09887c8d3")
    private void setContents(org.eclipse.uml2.uml.Comment ecoreElt) {
        ecoreElt.setBody(this.objingElement.getContent());
    }

    @objid ("bee7381f-3331-4772-9506-c09d811c5b68")
    private void setTypeEAnnotation(org.eclipse.uml2.uml.Comment ecoreElt) {
        NoteType noteType = this.objingElement.getModel();
        ObjingEAnnotation.setNoteTypeName(ecoreElt, noteType.getName());
    }

    @objid ("83494a5d-8a85-4d13-963f-541b134c407d")
    private void setOwnerAnnotation(final org.eclipse.uml2.uml.Comment ecoreElt) {
        if (ecoreElt.getOwner() instanceof org.eclipse.uml2.uml.AssociationClass){
            if (this.objingElement.getSubject() instanceof Association)
                ObjingEAnnotation.setOwnedByAssociation(ecoreElt, true);
            else if (this.objingElement.getSubject() instanceof ClassAssociation){
                ObjingEAnnotation.setOwnedByAssociationClass(ecoreElt, true);
            }
        }
    }

    @objid ("dfcf25f2-8f34-4c04-a5cc-ffbee21cf8bf")
    private void setName(final org.eclipse.uml2.uml.TimeObservation ecoreElt) {
        String name = this.objingElement.getName();
        
        if ((name != null) &&  (!name.equals(""))){
            ecoreElt.setName(name);
        }
    }

}
