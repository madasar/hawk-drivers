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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.LocalPropertyTable;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.NaryConnector;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;

@objid ("00886f12-c4be-1fd8-97fe-001ec947cd2a")
public interface ModelElement extends Element {
    /**
     * Checks if a model element has the stereotype specified by the
     * (moduleName, stereotypeName) pair.
     * @param moduleName
     * - the name of the module providing the type. Cannot be null.
     * @param stereotypeName The stereotype to find. Cannot be null.
     * @return true if the element has the given stereotype or a stereotype
     * derived from the given one.
     */
    @objid ("dcfe9255-d804-11e1-b25c-001ec947ccaf")
    boolean isStereotyped(String modulePattern, String stereotypeName);

    @objid ("4601cf60-e004-4047-a69c-5b34dad34860")
    void addStereotype(String moduleName, String stereotypeName) throws ExtensionNotFoundException;

    /**
     * This method removes the stereotype the stereotype specified by the
     * (moduleName, stereotypeName) pair. If several instances of the stereotype
     * are present, they are all removed.
     * @param type
     * - the stereotype name. Cannot be null.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     */
    @objid ("f26ff6c2-a983-47c2-bf20-913c7e441ed8")
    void removeStereotypes(String moduleName, String stereotypeName);

    /**
     * This method returns 'true' if the element has a tagged value of the type
     * indicated by the (moduleName, tagTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param tagTypeName - The tagged value type name. Cannot be null.
     * @return 'true' if the element has a tagged value with the corresponding
     * type.
     */
    @objid ("dcfe9251-d804-11e1-b25c-001ec947ccaf")
    boolean isTagged(String moduleName, String tagTypeName);

    /**
     * This method returns the (first) tagged value of the type indicated by the
     * (moduleName, tagTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param tagTypeName - The tagged value type name. Cannot be null.
     * @return The tag or null if it can't be found
     */
    @objid ("dcfe9263-d804-11e1-b25c-001ec947ccaf")
    TaggedValue getTag(String moduleName, String tagTypeName);

    /**
     * This method returns the first parameter value of the first tagged value
     * of the type indicated by the (moduleName, tagTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param tagTypeName - The tagged value type name. Cannot be null.
     * @return null if no tag can be found or there are no parameters, otherwise
     * the first parameter value.
     */
    @objid ("dcfe925f-d804-11e1-b25c-001ec947ccaf")
    String getTagValue(String moduleName, String tagTypeName);

    /**
     * This method returns the parameter values of the first tagged value of the
     * type indicated by the (moduleName, tagTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param tagTypeName - The tagged value type name. Cannot be null.
     * @return null if no tag can be found otherwise the (possibly empty)
     * parameter list
     */
    @objid ("dcfe9259-d804-11e1-b25c-001ec947ccaf")
    List<String> getTagValues(String moduleName, String tagTypeName);

    /**
     * This method sets the parameter of the tagged value of the type indicated
     * by the (moduleName, tagTypeName) pair.
     * 
     * The tagged value and the parameter are created if they don't exist.<br/>
     * 
     * If values is <tt>null</tt> or empty the existing tag is deleted.
     * @param values
     * - the values to store on the tag parameters. If value is
     * <tt>null</tt> the tag is deleted.
     * @throws ElementNotUniqueException
     * @throws ExtensionNotFoundException
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param tagTypeName - The tagged value type name. Cannot be null.
     */
    @objid ("5caef430-b9e6-4b7c-900c-b7deb17a8197")
    void putTagValue(String moduleName, String tagTypeName, String value) throws ExtensionNotFoundException;

    /**
     * This method sets the parameters of the tagged value of the type indicated
     * by the (moduleName, tagTypeName) pair.
     * 
     * The tagged value and the parameter are created if they don't exist.<br/>
     * If values is <tt>null</tt> or empty list the existing tag is deleted.
     * @throws ElementNotUniqueException
     * @throws ExtensionNotFoundException
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param tagTypeName - The tagged value type name. Cannot be null.
     */
    @objid ("d59462b8-4bf4-4878-a82a-8eede2c93613")
    void putTagValues(String moduleName, String tagTypeName, List<String> values) throws ExtensionNotFoundException;

    /**
     * This method deletes all the tagged values of the type indicated by the
     * (moduleName, tagTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param tagTypeName - The tagged value type name. Cannot be null.
     */
    @objid ("00ecbac8-6298-4f80-825f-8975409d150d")
    void removeTags(String moduleName, String tagTypeName);

    /**
     * This operation returns the first note of the type indicated by the
     * (moduleName, noteTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param noteTypeName - the note type name. Cannot be null.
     * @return The note or null if the note can't be found.
     */
    @objid ("dd00f4b1-d804-11e1-b25c-001ec947ccaf")
    Note getNote(String moduleName, String noteTypeName);

    /**
     * This method returns the content of the first note of the type indicated
     * by the (moduleName, noteTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param noteTypeName - the note type name. Cannot be null.
     * @return The note or null if the note can't be found.
     */
    @objid ("dcfe9267-d804-11e1-b25c-001ec947ccaf")
    String getNoteContent(String moduleName, String noteTypeName);

    /**
     * This method  sets the content of the first note of the type
     * indicated by the (moduleName, noteTypeName) pair.
     * 
     * If no note with the given type is found one is created.
     * @throws ElementNotUniqueException
     * @throws ExtensionNotFoundException
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param noteTypeName - the note type name. Cannot be null.
     * @param content - the note content
     */
    @objid ("73b0ebfc-5dab-4ecb-b39e-3dd5a188916f")
    void putNoteContent(String moduleName, String noteTypeName, String content) throws ExtensionNotFoundException;

    /**
     * This method deletes all the notes having this noteType of the type
     * indicated by the (moduleName, noteTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param noteTypeName - the note type name. Cannot be null.
     */
    @objid ("1ce053ff-3366-465d-a318-fba170933dff")
    void removeNotes(String moduleName, String noteTypeName);

    /**
     * Get a property value.
     * <p>
     * Return <code>null</code> if no {@link PropertyTable} with the given name
     * exist or it does not contain the given property.
     * @param tableName The table name. The table may not exist.
     * @param key a property name
     * @return The property value or <code>null</code>.
     */
    @objid ("45c55b29-2831-11e2-bf07-001ec947ccaf")
    String getProperty(String tableName, String key);

    /**
     * Get the first found {@link PropertyTable} that has the given name.
     * @param name a property table name
     * @return the found table or <code>null</code>.
     */
    @objid ("45c55b2e-2831-11e2-bf07-001ec947ccaf")
    PropertyTable getProperties(String name);

    @objid ("762030c9-3782-4956-bb25-f0dc4d749404")
    String getLocalProperty(String key);

    @objid ("2aaaa3c2-dc0c-495d-8060-07b6eb14dc6b")
    void setLocalProperty(String key, String value);

    @objid ("af98a636-ed08-4d4c-b5cd-c75eaaa59894")
    String getName();

    @objid ("bc04228c-e91e-4437-8fa3-1d4f6e4c39d3")
    void setName(String value);

    @objid ("c3bece7c-e58a-46df-ae35-55de5950bf35")
    LocalPropertyTable getLocalProperties();

    @objid ("466e5de8-54ec-4336-8ee6-f7889bf11d7e")
    void setLocalProperties(LocalPropertyTable value);

    @objid ("d3870410-ee76-4b31-88db-755b9892d576")
    EList<TemplateParameterSubstitution> getTemplateSubstitution();

    @objid ("a5a3deed-7fee-4449-9b14-b661b5fa11bf")
    <T extends TemplateParameterSubstitution> List<T> getTemplateSubstitution(java.lang.Class<T> filterClass);

    @objid ("654b7e4b-3b21-4ee6-963a-f300d822c708")
    EList<BpmnLane> getBpmnLaneRefs();

    @objid ("a48ae9fd-7c9c-40c7-8ec9-377b100f1a02")
    <T extends BpmnLane> List<T> getBpmnLaneRefs(java.lang.Class<T> filterClass);

    @objid ("37e4f2bf-912c-45a5-9be2-781799d8c561")
    EList<Stereotype> getExtension();

    @objid ("02622111-fab6-4296-9dac-107d392da72e")
    <T extends Stereotype> List<T> getExtension(java.lang.Class<T> filterClass);

    @objid ("79193757-8852-46ae-9f2f-a4cf75e33bfc")
    EList<Dependency> getDependsOnDependency();

    @objid ("cdeb3290-2ab5-4c8c-84a5-c9492d86ab82")
    <T extends Dependency> List<T> getDependsOnDependency(java.lang.Class<T> filterClass);

    @objid ("0fb9bdef-3c6e-4b60-a8b1-828a70b986f5")
    EList<TemplateParameter> getDefaultParametering();

    @objid ("52d000c6-4b3d-480e-a941-d6d1e20741f3")
    <T extends TemplateParameter> List<T> getDefaultParametering(java.lang.Class<T> filterClass);

    @objid ("218aa567-14da-4ecf-bc3c-b73e81d80285")
    EList<Binding> getRepresents();

    @objid ("59b2f255-e12c-42a2-b975-9bdb73ebd9bb")
    <T extends Binding> List<T> getRepresents(java.lang.Class<T> filterClass);

    @objid ("c62b3a3e-d58b-4438-b1a7-57c1463dd4ea")
    EList<ExternDocument> getDocument();

    @objid ("98120107-0d17-434c-8b40-7571a74b55ff")
    <T extends ExternDocument> List<T> getDocument(java.lang.Class<T> filterClass);

    @objid ("d732aa26-2cf2-4969-8266-996b01ee326f")
    EList<TaggedValue> getTag();

    @objid ("1b985546-a83e-4a84-898b-76ba254fcff3")
    <T extends TaggedValue> List<T> getTag(java.lang.Class<T> filterClass);

    @objid ("2428a37a-57fc-491a-be7e-d25b90fd083b")
    TemplateParameter getOwnerTemplateParameter();

    @objid ("213f3429-6b4a-443b-8dcf-aa491731b0a4")
    void setOwnerTemplateParameter(TemplateParameter value);

    @objid ("f7893c17-37b2-4c14-a784-79fca0d343f3")
    EList<Dependency> getImpactedDependency();

    @objid ("603bcb44-e668-478b-9edb-99cdd93b50cb")
    <T extends Dependency> List<T> getImpactedDependency(java.lang.Class<T> filterClass);

    @objid ("f74bef64-6fac-4924-8aa9-f0fb7565172a")
    EList<ConnectorEnd> getRepresentingEnd();

    @objid ("badb4146-92f8-4d40-9f70-ae04c89a762a")
    <T extends ConnectorEnd> List<T> getRepresentingEnd(java.lang.Class<T> filterClass);

    @objid ("affcae71-d08d-487e-a3c5-89dcef09f4b6")
    EList<ActivityPartition> getRepresentingPartition();

    @objid ("2918bece-ce5e-4d78-ad10-6e63b8aac2c0")
    <T extends ActivityPartition> List<T> getRepresentingPartition(java.lang.Class<T> filterClass);

    @objid ("11523f9d-11b4-4d53-95b0-6fbb0f2fb084")
    EList<Constraint> getConstraintDefinition();

    @objid ("b02c4829-a418-4dda-9f7a-e10fc79be61a")
    <T extends Constraint> List<T> getConstraintDefinition(java.lang.Class<T> filterClass);

    @objid ("471fb290-acc2-4b77-980b-eb40b4695adb")
    EList<TemplateParameter> getTypingParameter();

    @objid ("833f06b2-de00-4e43-93f2-d4a7b402277b")
    <T extends TemplateParameter> List<T> getTypingParameter(java.lang.Class<T> filterClass);

    @objid ("a9a53c07-74d4-4d8f-8d37-8d134a7b5832")
    EList<Manifestation> getManifesting();

    @objid ("40e87331-f0f8-4e5f-877b-cfa9ccea9461")
    <T extends Manifestation> List<T> getManifesting(java.lang.Class<T> filterClass);

    @objid ("d16cebca-26ee-428a-a8ff-d62005322839")
    EList<PropertyTable> getProperties();

    @objid ("e330c2fb-3ee5-4db1-9121-3d3104c60202")
    <T extends PropertyTable> List<T> getProperties(java.lang.Class<T> filterClass);

    @objid ("600e41ad-6df7-4bdd-b028-fe9a5ef560e4")
    EList<AbstractDiagram> getProduct();

    @objid ("7c9403d0-4fa2-45d5-90db-255ee77d014b")
    <T extends AbstractDiagram> List<T> getProduct(java.lang.Class<T> filterClass);

    @objid ("299365cd-cb9c-4999-b211-d24addacb491")
    EList<BindableInstance> getRepresentingInstance();

    @objid ("2886d753-5969-4906-92ef-8a3c48b714d2")
    <T extends BindableInstance> List<T> getRepresentingInstance(java.lang.Class<T> filterClass);

    @objid ("e0dbfe93-e436-4018-8299-51e77dae0b92")
    EList<InformationFlow> getReceivedInfo();

    @objid ("d05499ea-9d59-4e30-bac4-d770fd13ee3d")
    <T extends InformationFlow> List<T> getReceivedInfo(java.lang.Class<T> filterClass);

    @objid ("0f655664-7798-4a4e-9fcd-4add4800f23f")
    EList<InformationFlow> getSentInfo();

    @objid ("9170c3ab-a8cf-4aff-bc24-7595bc6fa616")
    <T extends InformationFlow> List<T> getSentInfo(java.lang.Class<T> filterClass);

    @objid ("18c4a620-6d44-4dc9-a968-530a4da59e0a")
    EList<Note> getDescriptor();

    @objid ("7d294852-b69b-4a7b-905b-80e0e654b74a")
    <T extends Note> List<T> getDescriptor(java.lang.Class<T> filterClass);

    @objid ("8d11c9f0-84cf-47ff-9305-972afa497018")
    EList<NaryConnector> getRepresentingConnector();

    @objid ("5c5728bb-0183-4280-be8a-45a38ac61b58")
    <T extends NaryConnector> List<T> getRepresentingConnector(java.lang.Class<T> filterClass);

    @objid ("276bfcbb-369c-4eae-869e-796d29083609")
    EList<MatrixDefinition> getMatrix();

    @objid ("48c668c3-fc8b-49bf-ae07-e28e7934da1c")
    <T extends MatrixDefinition> List<T> getMatrix(java.lang.Class<T> filterClass);

}
