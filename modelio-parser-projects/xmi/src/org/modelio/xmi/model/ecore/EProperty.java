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
                                    

package org.modelio.xmi.model.ecore;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.Property;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.KindOfAccess;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.StructuralFeature;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.reverse.ReverseProperties;
import org.modelio.xmi.util.AbstractObjingModelNavigation;
import org.modelio.xmi.util.EcoreModelNavigation;
import org.modelio.xmi.util.NotFoundException;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.ProfileUtils;
import org.modelio.xmi.util.XMIProperties;
import org.modelio.xmi.util.modelermodule.IModelerModuleStereotypes;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class manages the import of UML Property elements
 * @author ebrosse
 */
@objid ("5c942ba9-9bc1-45fb-b626-1f61d56f9432")
public class EProperty extends EFeature {
    @objid ("02e84f41-51c9-4d37-ad0f-6c23ab6de794")
    @Override
    public List<ModelElement> createObjingElt() {
        Property ecoreElement = (Property) getEcoreElement();
        
        if (ecoreElement.getOwner() instanceof org.eclipse.uml2.uml.Stereotype){       
            ProfileUtils.visitProperty(ecoreElement);      
        }else{
        
            List<ModelElement> result = new ArrayList<>();
        
            IModelFactory objingModel = ReverseProperties.getInstance().getMModelServices().getModelFactory();
        
            // association
            if (EcoreModelNavigation.isAssocEnd(ecoreElement)) {
        
                int endNumber = EcoreModelNavigation.getValidEndNumber(ecoreElement.getAssociation());
        
                if (endNumber == 2 ){
                    result.add(objingModel.createAssociationEnd());
                }else  if (endNumber > 2 ){
                    result.add(objingModel.createNaryAssociationEnd()); 
                }
            } 
        
            if (EcoreModelNavigation.isPart(ecoreElement)){
                BindableInstance inst = objingModel.createBindableInstance();
                if (EcoreModelNavigation.isAssocEnd(ecoreElement)){
                    inst.setRepresentedFeature(result.get(0));
                }
                result.add(inst);
            } else if (EcoreModelNavigation.isPort(ecoreElement)){
                result.add( objingModel.createPort());
            }
        
            if (EcoreModelNavigation.isConnectorEnd(ecoreElement)){
                result.add(objingModel.createBindableInstance());
            }
        
            if (result.size() == 0 ){ 
                org.eclipse.uml2.uml.Element ecoreOwner = getEcoreElement().getOwner();
        
                if (ecoreOwner != null){
                    Object objingOwner = ReverseProperties.getInstance().getMappedElement(ecoreOwner);
                    // case qualifier
                    if ((objingOwner instanceof Classifier) ||  
                            ((ecoreOwner instanceof Property) 
                                    && (EcoreModelNavigation.isAssocEnd((Property)ecoreOwner)))){
                        result.add(objingModel.createAttribute());
                    }else{ 
                        result.add(objingModel.createBindableInstance());
                    }
                }
            }
            return result;
        }
        return null;
    }

    @objid ("aea527ae-2968-4862-a929-0e3afe7a7dc0")
    public EProperty(Property element) {
        super(element);
    }

    @objid ("5679ed55-c778-4f48-ba49-b91d81999fc3")
    @Override
    public void attach(Element objingElt) {
        Property ecoreElement = ((Property) getEcoreElement());
        if (!(ecoreElement.getOwner() instanceof org.eclipse.uml2.uml.Stereotype)){
            if (objingElt instanceof Attribute){
                attachAttribute((Attribute) objingElt);
            } else if ((EcoreModelNavigation.isAssocEnd(ecoreElement)) 
                    && !(objingElt instanceof Attribute)) {
        
                if (EcoreModelNavigation.isPart(ecoreElement)){
        
                    if (objingElt instanceof BindableInstance){
                        attachBindableInstance(objingElt);
                    }
        
                }else{
        
                    if (objingElt instanceof BindableInstance){  
                        attachBindableInstance(objingElt);
                    }
        
                }
        
            } else if ((objingElt instanceof BindableInstance) 
                    && !(objingElt instanceof Port)){
                attachBindableInstance(objingElt);
            }else{
                objingElt.delete();
            }
        }else{
            objingElt.delete();
        }
    }

    @objid ("d57e9364-a17a-478a-89a1-d59a58e83521")
    @Override
    public void attach(List<Object> objingElts) {
        for (Object objingElt : objingElts){
            if (objingElt instanceof Element)
                attach((Element) objingElt);
        }
    }

    @objid ("7c9ae24e-cadd-4129-b7aa-5ba8452ff4e2")
    @Override
    public void setProperties(Element objingElt) {
        if (!(((Property) getEcoreElement()).getOwner() instanceof org.eclipse.uml2.uml.Stereotype)){
        
            super.setProperties(objingElt);
            if (objingElt instanceof Feature)
                setFeature( (Feature) objingElt);
            else if (objingElt instanceof Instance){
                AbstractObjingModelNavigation.setInstance((Instance)objingElt, (Property) getEcoreElement() );
                if (objingElt instanceof BindableInstance){
                    ModelElement represented = ((BindableInstance)objingElt).getRepresentedFeature();
                    if ((represented != null) && (represented instanceof AssociationEnd)){
                        setFeature( (Feature) represented);
                    }
                }
            }
        }
    }

    @objid ("6e4bfc73-fe60-42d4-8032-c16a8fa790a1")
    private void setFeature(Feature objingElt) {
        boolean roundTripEnable = ReverseProperties.getInstance().isRoundtripEnabled();
        if (objingElt instanceof StructuralFeature) {
        
            setOrdered((StructuralFeature) objingElt);
            setUnique((StructuralFeature) objingElt);
            setAccessMode((StructuralFeature) objingElt);
        
            if (roundTripEnable) {
                setChangeableEAnnotation((StructuralFeature) objingElt);
                setDerivedEAnnotation((StructuralFeature) objingElt);
            }
        
        
            if  (objingElt instanceof AssociationEnd) {
                setAssociationKind((AssociationEnd) objingElt);
                setNavigation((AssociationEnd) objingElt);
                setChangeable((AssociationEnd) objingElt);
                if (roundTripEnable) {
                    setAccessModeEAnnotation((AssociationEnd) objingElt);
                }
        
            } else if (objingElt instanceof Attribute) {
                setType((Attribute) objingElt);
                setOrdered((Attribute) objingElt);
                setValue((Attribute) objingElt);
        
                if (roundTripEnable) {
                    setTargetIsClassEAnnotation((Attribute) objingElt);
                    setTypeConstraint((Attribute) objingElt);
                    setValueEAnnotation((Attribute) objingElt);
                }
            } else   if  (objingElt instanceof NaryAssociationEnd) {
                setNaryAssociationKind((NaryAssociationEnd) objingElt);
                setOwner((NaryAssociationEnd) objingElt);  
            }
        }
        
        setMultiplicity(objingElt);
        
        if (roundTripEnable) {
            setAbstractEAnnotation(objingElt);
        }
    }

    @objid ("10535903-9334-4b5b-9307-8a1bbe521731")
    private void setNavigation(AssociationEnd objEnd) {
        AssociationEnd objOppositeEnd = null;
        Property currentEnd = ((Property) getEcoreElement());
        Property oppositeEnd = currentEnd.getOtherEnd();
        
        List<Element> objEnds = (List<Element>) ReverseProperties.getInstance().getMappedElement(oppositeEnd);
        for (Element temp : objEnds){
            if (temp instanceof AssociationEnd){
                objOppositeEnd = (AssociationEnd) temp;
                break;
            }
        }
        
        
        if(objOppositeEnd != null){
        
            if(currentEnd.isNavigable()){ 
                objEnd.setTarget((Classifier)  ReverseProperties.getInstance().getMappedElement(currentEnd.getType())) ;
                objEnd.setSource((Classifier)  ReverseProperties.getInstance().getMappedElement(oppositeEnd.getType()));
                objEnd.setOpposite(objOppositeEnd);
        
            }else{
                if (oppositeEnd.isNavigable()){
                    objEnd.setOpposite(objOppositeEnd);
        
                } else{
                    objEnd.setSource((Classifier)  ReverseProperties.getInstance().getMappedElement(oppositeEnd.getType()));
                    objEnd.setOpposite(objOppositeEnd);
                }
            }
        
        
            Association objAssoc = null;
            org.eclipse.uml2.uml.Association assoc = currentEnd.getAssociation();
        
            if (assoc instanceof AssociationClass){
                objAssoc = ((org.modelio.metamodel.uml.statik.Class) ReverseProperties.getInstance().getMappedElement(currentEnd.getAssociation())).getLinkToAssociation().getAssociationPart();
            }else{
                objAssoc = (Association)  ReverseProperties.getInstance().getMappedElement(assoc);
            }
        
            objEnd.setAssociation(objAssoc);
        }else{
            objEnd.delete();
        }
    }

    @objid ("23bd6341-e7ed-4e88-9cf1-d82e92c1f149")
    private void setType(Attribute objingElt) {
        org.eclipse.uml2.uml.Type ecoreType = ((Property) getEcoreElement()).getType();
        
        if (ecoreType != null) {
            // If the Attribute is typed by another element, we get this
            // org.eclipse.uml2.uml.Classifier:
            Object objingType = ReverseProperties.getInstance()
                    .getMappedElement(ecoreType);
            if ((objingType != null) && (objingType instanceof GeneralClass))
                objingElt.setType((GeneralClass) objingType);
        }
    }

    @objid ("1c934eb7-6fab-4293-b397-c33abf2a7df0")
    private void setAssociationKind(AssociationEnd end) {
        org.eclipse.uml2.uml.AggregationKind ecoreAggType = ((Property) getEcoreElement()).getAggregation();
        if (ecoreAggType != null) {
            switch (ecoreAggType.getValue()) {
            case org.eclipse.uml2.uml.AggregationKind.NONE:
                end.setAggregation(AggregationKind.KINDISASSOCIATION);
                break;
            case org.eclipse.uml2.uml.AggregationKind.SHARED:
                end.setAggregation(AggregationKind.KINDISAGGREGATION);
                break;
            case org.eclipse.uml2.uml.AggregationKind.COMPOSITE:
                end.setAggregation(AggregationKind.KINDISCOMPOSITION);
                break;
            default:
                break;
            }
        }
    }

    @objid ("3a3fcf74-1097-4d70-84cd-084a31bb377d")
    private void setChangeable(AssociationEnd objingElt) {
        objingElt.setIsChangeable(((Property) getEcoreElement()).isReadOnly());
    }

    @objid ("98dcb020-df5e-4d47-8355-12f6996e0386")
    private void setMultiplicity(Feature feature) {
        String multMin = EcoreModelNavigation.getMultiplicityMin(((Property) getEcoreElement()));
        String multMax = EcoreModelNavigation.getMultiplicityMax(((Property) getEcoreElement()));
        
        if (feature instanceof Attribute) {
            if (!("".equals(multMin))) {
                ((Attribute) feature).setMultiplicityMin(multMin);
            }
            if (!("".equals(multMax))) {
                ((Attribute) feature).setMultiplicityMax(multMax);
            }
        } else if (feature instanceof AssociationEnd) {
            if (!("".equals(multMin))) {
                ((AssociationEnd) feature).setMultiplicityMin(multMin);
            }
            if (!("".equals(multMax))) {
                ((AssociationEnd) feature).setMultiplicityMax(multMax);
            }
        
            if(("".equals(multMax))&&("".equals(multMin))){
                ((AssociationEnd) feature).setMultiplicityMin("undefined");
                ((AssociationEnd) feature).setMultiplicityMax("undefined");
            }
        
        } else {
            throw new NotFoundException("Feature element ("
                    + feature.getClass().getSimpleName() + ") Not Found");
        }
        if (feature instanceof Attribute) 
            testMutiplicity((Attribute)feature);
        else if (feature instanceof AssociationEnd) 
            testMutiplicity((AssociationEnd)feature);
    }

    @objid ("0e5b2ca9-6a98-4cce-912c-7633352b594a")
    private void setChangeableEAnnotation(StructuralFeature attribute) {
        String accessMode = ObjingEAnnotation.getAccessMode(getEcoreElement());
        
        if (ObjingEAnnotation.READ_VALUE.equals(accessMode)) {
            attribute.setChangeable(KindOfAccess.READ);
        } else if (ObjingEAnnotation.WRITE_VALUE.equals(accessMode)) {
            attribute.setChangeable(KindOfAccess.WRITE);
        } else if (ObjingEAnnotation.READ_WRITE_VALUE.equals(accessMode)) {
            attribute.setChangeable(KindOfAccess.READWRITE);
        } else if (ObjingEAnnotation.ACCESS_NONE_VALUE.equals(accessMode)) {
            attribute.setChangeable(KindOfAccess.ACCESNONE);
        }
    }

    @objid ("2d6fa9bb-82d6-4182-95a1-a893763b9f96")
    private void setDerivedEAnnotation(StructuralFeature attribute) {
        attribute.setIsDerived(ObjingEAnnotation
                .isDynamicDependency(getEcoreElement()));
    }

    @objid ("18a5d2b8-58cb-4c0d-92cc-23e9fbaca1a7")
    private void setValueEAnnotation(Attribute attribute) {
        String value = ObjingEAnnotation.getValue(getEcoreElement());
        if ((value != null) && (!value.equals("")))
            attribute.setValue(value);
    }

    @objid ("8fe9d3b2-7153-4538-bbce-9d5c564e9b8b")
    private void setOrdered(StructuralFeature attribute) {
        attribute.setIsOrdered(((Property) getEcoreElement()).isOrdered());
    }

    @objid ("c7f9767a-89bb-41be-86fc-3f84e747abf9")
    private void setAbstractEAnnotation(Feature objingElt) {
        objingElt.setIsAbstract(ObjingEAnnotation.isIsAbstract(getEcoreElement()));
    }

    @objid ("50789a5d-e4c1-455d-a3e1-0d3d6beb3842")
    private void setAccessModeEAnnotation(AssociationEnd objingElt) {
        String access = ObjingEAnnotation.getAccessMode(getEcoreElement());
        
        if (access != null){
            if (access.equals(ObjingEAnnotation.READ_VALUE))
                objingElt.setChangeable(KindOfAccess.READ);
            else if (access.equals(ObjingEAnnotation.WRITE_VALUE))     
                objingElt.setChangeable(KindOfAccess.WRITE);
        
            else if (access.equals(ObjingEAnnotation.READ_WRITE_VALUE))
                objingElt.setChangeable(KindOfAccess.READWRITE); 
            else if (!((Property) getEcoreElement()).isReadOnly())
                objingElt.setChangeable(KindOfAccess.ACCESNONE);
        }
    }

    @objid ("9e9d3a8f-aa60-4406-b0b3-5a52aeb0e296")
    private void setUnique(StructuralFeature attribute) {
        attribute.setIsUnique(((Property) getEcoreElement()).isUnique());
    }

    @objid ("b74bb45f-0314-4466-a789-de7ddebcaf35")
    private void setTargetIsClassEAnnotation(Attribute attribute) {
        attribute.setTargetIsClass(ObjingEAnnotation
                .isTargetIsClass(getEcoreElement()));
    }

    @objid ("de8fc352-0d90-4891-bb92-45d895e07ba5")
    private void setTypeConstraint(Attribute attribute) {
        String typeConstraint = ObjingEAnnotation.getTypeConstraint(getEcoreElement());
        if (typeConstraint != null)
            attribute.setTypeConstraint(typeConstraint);
    }

    @objid ("abb7b465-98e1-4889-a667-fa19d11c43a3")
    private void setValue(Attribute attribute) {
        String defaultValue = ((Property) getEcoreElement()).getDefault();
        
        if (defaultValue != null) {
            attribute.setValue(defaultValue);
        }else{ 
            org.eclipse.uml2.uml.ValueSpecification value = ((Property) getEcoreElement()).getDefaultValue();
        
            if (value instanceof InstanceValue){
                InstanceSpecification spec = ((InstanceValue) value).getInstance();
                if (spec != null){
                    Object instance = ReverseProperties.getInstance().getMappedElement(spec);
                    if ((instance instanceof Instance) 
                            && (instance != null))
                        try {
                            ReverseProperties.getInstance().getMModelServices().getModelFactory().createDependency(
                                    attribute, (Instance) instance, XMIProperties.modelerModuleName, IModelerModuleStereotypes.UML2INSTANCEVALUE);
                        } catch (ExtensionNotFoundException e) {
                            Xmi.LOG.warning(Xmi.PLUGIN_ID, e);       
                        }
        
                }
            }else{
                attribute.setValue(EcoreModelNavigation.getValue(value));
            }      
        }
    }

    @objid ("d608a602-2862-46c0-9e2e-0af5579c55e0")
    private void attachAttribute(Attribute objingAttribute) {
        org.eclipse.uml2.uml.Element ecoreOwner = getEcoreElement().getOwner();
        Object objingOwner = ReverseProperties.getInstance().getMappedElement(ecoreOwner);
        
        if (objingOwner instanceof Classifier)
            objingAttribute.setOwner((Classifier) objingOwner);
        else if ((ecoreOwner instanceof Property) 
                && (EcoreModelNavigation.isAssocEnd((Property) ecoreOwner))) {
            for (Element objElt : (ArrayList<? extends Element>) objingOwner){
                if (objElt instanceof AssociationEnd)
                    objingAttribute.setQualified((AssociationEnd) objElt);
            }
        
        }
    }

    @objid ("d598d38c-7c23-414b-a0d7-22dd63ad828b")
    private void attachBindableInstance(Element objingElt) {
        if (!(objingElt instanceof Port)){
            // The objing element is an BindableInstance
        
            Property ecoreElement = ((Property) getEcoreElement());
            BindableInstance objingAttribute = (BindableInstance) objingElt;
        
            org.eclipse.uml2.uml.Element ecoreOwner = ecoreElement.getOwner();
        
            if (ecoreOwner instanceof Property){
                while (ecoreOwner instanceof Property){
                    ecoreOwner = ecoreOwner.getOwner();
                }
            }else if (ecoreOwner instanceof org.eclipse.uml2.uml.Association){            
                ecoreOwner = ecoreElement.getType();              
            }
        
            Element objingOwner = (Element) ReverseProperties.getInstance().getMappedElement(ecoreOwner);
        
            Boolean attached = false ;
        
            if (ReverseProperties.getInstance().isRoundtripEnabled()){
        
                if (ObjingEAnnotation.isDeleted(ecoreElement)){
                    attached = true;
                    objingElt.delete();
        
                }else {
                    String ownerID = ObjingEAnnotation.getOwner(ecoreElement);  
        
                    if ((ownerID != null) && ( !ownerID.equals(""))){
        
                        if (ecoreOwner instanceof org.eclipse.uml2.uml.StructuredClassifier)
                            for (Object attribute : ((org.eclipse.uml2.uml.StructuredClassifier) ecoreOwner).getOwnedAttributes()){
                                if (attribute instanceof Property){
                                    Property prop = (Property) attribute;
                                    List<String> ids = ObjingEAnnotation.getObjingIDs(prop);
                                    if (ids.size() > 0){
                                        String id = ids.get(0);
                                        if (id.equals(ownerID)){
                                            if ((((BindableInstance) objingElt).getInternalOwner()== null) && (((BindableInstance) objingElt).getOwner() == null))
                                                objingAttribute.setCluster(((BindableInstance) ReverseProperties.getInstance().getMappedElement(prop)));
                                            attached = true;
                                        }
                                    }
                                }
                            }
                    }
                }
            }
        
        
            if (!attached){ 
                if (objingOwner instanceof Classifier){
                    if (objingAttribute.getCluster() == null)
                        objingAttribute.setInternalOwner((Classifier) objingOwner);
        
                }else if ((objingOwner instanceof Collaboration)){
                    objingAttribute.setOwner((Collaboration) objingOwner);
                }else if ((objingOwner instanceof Interaction)){
                    List<?> collabList =  ((Interaction) objingOwner).getOwnedCollaboration();
                    Collaboration collab = null;
                    if (!collabList.isEmpty()){
                        collab = ((Collaboration)collabList.get(0));
                    }else{
                        collab = ReverseProperties.getInstance().getMModelServices().getModelFactory().createCollaboration();
                        collab.setName("locals");
                        ((Interaction) objingOwner).getOwnedCollaboration().add(collab);
                    }
        
                    objingAttribute.setOwner(collab);
                }
            }
        }
    }

//    @objid ("08661b76-613c-4419-9b59-aafcb45d351c")
//    private void setAssociation(AssociationEnd end) {
//        // Links to the org.eclipse.uml2.uml.Association:
//        org.eclipse.uml2.uml.Association ecoreAssoc =  ((Property) getEcoreElement()).getAssociation();
//
//        Object objingAssoc = ReverseProperties.getInstance().getMappedElement(ecoreAssoc);
//
//        if (objingAssoc instanceof Association) {
//
//            end.setAssociation((Association) objingAssoc);
//            for (Property otherEnd : ecoreAssoc.getMemberEnds()){
//                List<Element> objEnds = (List<Element>) ReverseProperties.getInstance().getMappedElement(otherEnd);
//                for(Element objEnd : objEnds){
//                    if ((objEnd instanceof AssociationEnd) && !(objEnd.equals(end))){
//                        end.setOpposite((AssociationEnd) objEnd);
//                    }
//                }
//
//            }
//        }else if ((objingAssoc instanceof org.modelio.metamodel.uml.statik.Class)
//                && (ecoreAssoc instanceof AssociationClass)) {
//
//            end.setAssociation(((org.modelio.metamodel.uml.statik.Class) objingAssoc).getLinkToAssociation().getAssociationPart());
//            for (Property otherEnd : ecoreAssoc.getMemberEnds()){
//                List<Element> objEnds = (List<Element>) ReverseProperties.getInstance().getMappedElement(otherEnd);
//                for(Element objEnd : objEnds){
//                    if ((objEnd instanceof AssociationEnd) && !(objEnd.equals(end))){
//                        end.setOpposite((AssociationEnd) objEnd);
//                    }
//                }
//
//            }
//        }
//    }
    @objid ("c1c2b6cd-35e5-4a67-a968-647bd29bd230")
    private void testMutiplicity(Attribute attribute) {
        String multMin = attribute.getMultiplicityMin();
        String multMax = attribute.getMultiplicityMax();
        
        if (multMin.equals("*")){
            if (multMax.equals("*")){
                attribute.setMultiplicityMin("undefined");
            }else{
                attribute.setMultiplicityMin(multMax);
                attribute.setMultiplicityMax("*");
            }
        }
    }

    @objid ("3869a638-faa4-434e-baa6-54ed4162ccb9")
    private void testMutiplicity(AssociationEnd assocEnd) {
        String multMin = assocEnd.getMultiplicityMin();
        String multMax = assocEnd.getMultiplicityMax();
        
        if (multMin.equals("*")){
            if (multMax.equals("*")){
                assocEnd.setMultiplicityMin("undefined");
            }else{
                assocEnd.setMultiplicityMin(multMax);
                assocEnd.setMultiplicityMax("*");
            }
        }
    }

    @objid ("575cea15-2fe9-4a1b-ae3f-33967c10cfaf")
    private void setAccessMode(StructuralFeature objingElt) {
        if (((Property) getEcoreElement()).isReadOnly()){
            objingElt.setChangeable(KindOfAccess.READ);
        }
    }

    @objid ("b016659d-952e-46d1-858c-407bac359307")
    private void setOwner(NaryAssociationEnd objingElt) {
        Object classifier = ReverseProperties.getInstance().getMappedElement(((Property) getEcoreElement()).getType());
        if (classifier instanceof Classifier){
            objingElt.setOwner((Classifier) classifier);
        }
    }

    @objid ("09f2cb4e-44ed-453a-a64b-7dbd35313ed3")
    private void setNaryAssociationKind(NaryAssociationEnd objingElt) {
        Object naryassociation = ReverseProperties.getInstance().getMappedElement(((Property) getEcoreElement()).getAssociation());
        if (naryassociation instanceof NaryAssociation){
            objingElt.setNaryAssociation((NaryAssociation) naryassociation);
        }
    }

}
