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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.factory.ModelFactory;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;
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
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0088a34c-c4be-1fd8-97fe-001ec947cd2a")
public abstract class ModelElementImpl extends ElementImpl implements ModelElement {
    /**
     * {@inheritDoc}
     */
    @objid ("97ee8995-d803-11e1-b25c-001ec947ccaf")
    @Override
    public final boolean isStereotyped(String moduleName, String stereotypeName) {
        if (stereotypeName == null) {
            throw new IllegalArgumentException("isStereotyped(): stereotype name cannot be null");
        }
        
        for (Stereotype s : getExtension()) {
            if (inheritsFrom(s, stereotypeName)) {
                if (s.getModule() == null) {
                    if (moduleName == null) {
                        return true;
                    }
                } else if (s.getModule().getName().equals(moduleName)) {
                    return true;
                }
            }
        }
        return false;
    }

    @objid ("80f3dc16-cdd8-48b6-90e7-0a9e55768ac2")
    @Override
    public final void addStereotype(String moduleName, String stereotypeName) throws ExtensionNotFoundException {
        IModelFactory factory = ModelFactory.getFactory(this);
        
        List<Stereotype> stereotypes = factory.findStereotype(moduleName, stereotypeName, getMClass());
        if (stereotypes.size() == 0) {
            throw new ExtensionNotFoundException("'" + stereotypeName + "' stereotype not found");
        } else if (stereotypes.size() == 1) {
            EList<Stereotype> existingStereotypes = getExtension();
            if (!existingStereotypes.contains(stereotypes.get(0)))
                existingStereotypes.add(stereotypes.get(0));
        } else {
            throw new InvalidParameterException("'" + stereotypeName + "' stereotype is not unique in module '" + moduleName + "'");
        }
    }

    /**
     * {@inheritDoc}
     */
    @objid ("dbd8e19d-f363-4e05-9c12-87254ac70f24")
    @Override
    public void removeStereotypes(String moduleName, String stereotypeName) {
        List<Stereotype> toRemove = new ArrayList<>();
        
        for (Stereotype stereotype : getExtension()) {
            if (stereotype.getName().equals(stereotypeName)) {
                if (stereotype.getModule() == null) {
                    if (moduleName == null) {
                        toRemove.add(stereotype);
                    }
                } else if (stereotype.getModule().getName().equals(moduleName)) {
                    toRemove.add(stereotype);
                }
            }
        }
        
        getExtension().removeAll(toRemove);
    }

    /**
     * {@inheritDoc}
     */
    @objid ("97f0ecc2-d803-11e1-b25c-001ec947ccaf")
    @Override
    public final boolean isTagged(String moduleName, String tagTypeName) {
        for (TaggedValue tag : getTag()) {
            TagType tagType = tag.getDefinition();
            if (tagType != null && tagType.getName().equals(tagTypeName)) {
                if (tagType.getModule() == null) {
                    if (moduleName == null) {
                        return true;
                    }
                } else if (tagType.getModule().getName().equals(moduleName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("97ee8976-d803-11e1-b25c-001ec947ccaf")
    @Override
    public final TaggedValue getTag(String moduleName, String tagTypeName) {
        for (TaggedValue tag : getTag()) {
            TagType tagType = tag.getDefinition();
            if (tagType != null && tagType.getName().equals(tagTypeName)) {
                if (tagType.getModule() == null) {
                    if (moduleName == null) {
                        return tag;
                    }
                } else if (tagType.getModule().getName().equals(moduleName)) {
                    return tag;
                }
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("97ee897e-d803-11e1-b25c-001ec947ccaf")
    @Override
    public final String getTagValue(String moduleName, String tagTypeName) {
        TaggedValue tag = getTag(moduleName, tagTypeName);
        if (tag == null) {
            return null;
        }
        List<TagParameter> tagParameters = tag.getActual();
        return tagParameters.isEmpty() ? null : tagParameters.get(0).getValue();
    }

    /**
     * {@inheritDoc}
     */
    @objid ("97ee8989-d803-11e1-b25c-001ec947ccaf")
    @Override
    public final List<String> getTagValues(String moduleName, String tagTypeName) {
        TaggedValue tag = getTag(moduleName, tagTypeName);
        if (tag == null) {
            return null;
        }
        List<TagParameter> tagParameters = tag.getActual();
        List<String> parameters = new ArrayList<>(tagParameters.size());
        for (TagParameter parameter : tagParameters) {
            parameters.add(parameter.getValue());
        }
        return parameters;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("ce50811d-dbfa-4cea-9586-7f014f1fadd4")
    @Override
    public void putTagValue(String moduleName, String tagTypeName, String value) throws ExtensionNotFoundException {
        TaggedValue tag = getTag(moduleName, tagTypeName);
        
        if (value == null) {
            // Delete the tag if no more value
            if (tag != null)
                tag.delete();
            return;
        }
        
        IModelFactory factory = ModelFactory.getFactory(this);
        
        // Create the tag if not present
        if (tag == null) {
            tag = factory.createTaggedValue(moduleName, tagTypeName, this);
        }
        
        final List<TagParameter> oldParameters = tag.getActual();
        int cpt = 0;
        
        // Replace existing parameter values and delete spare ones
        for (int i = 0; i < oldParameters.size() && i < 1; i++) {
            oldParameters.get(i).setValue(value);
            cpt++;
        }
        
        // Delete spare parameter
        while (oldParameters.size() > 1) {
            oldParameters.get(oldParameters.size() - 1).delete();
        }
        
        // Add missing parameter
        if (cpt < 1) {
            factory.createTagParameter(value, tag);
        }
    }

    /**
     * {@inheritDoc}
     */
    @objid ("fb629575-89cc-4917-9950-111a2836ed6b")
    @Override
    public void putTagValues(String moduleName, String tagTypeName, List<String> values) throws ExtensionNotFoundException {
        TaggedValue tag = getTag(moduleName, tagTypeName);
        
        if (values == null || values.isEmpty()) {
            // Delete the tag if no more value
            if (tag != null)
                tag.delete();
            return;
        }
        
        IModelFactory factory = ModelFactory.getFactory(this);
        
        // Create tag if not present
        if (tag == null) {
            tag = factory.createTaggedValue(moduleName, tagTypeName, this);
        }
        
        // Set the tag parameters values, merging existing values and new values
        final int newSize = values.size();
        final List<TagParameter> oldParameters = tag.getActual();
        int cpt = 0;
        
        // Replace existing parameter values and delete spare ones
        for (int i = 0; i < oldParameters.size() && i < newSize; i++) {
            oldParameters.get(i).setValue(values.get(i));
            cpt++;
        }
        
        // Delete spare parameter
        while (oldParameters.size() > newSize) {
            oldParameters.get(oldParameters.size() - 1).delete();
        }
        
        // Add missing parameters
        while (cpt < newSize) {
            factory.createTagParameter(values.get(cpt), tag);
            cpt++;
        }
    }

    @objid ("fe9fdc86-7c1f-402a-a53d-bbce0f8e6d4b")
    @Override
    public void removeTags(String moduleName, String tagTypeName) {
        List<TaggedValue> toRemove = new ArrayList<>();
        
        for (TaggedValue tag : getTag()) {
            TagType tagType = tag.getDefinition();
            if (tagType != null && tagType.getName().equals(tagTypeName)) {
                if (tagType.getModule() == null) {
                    if (moduleName == null) {
                        toRemove.add(tag);
                    }
                } else if (tagType.getModule().getName().equals(moduleName)) {
                    toRemove.add(tag);
                }
            }
        }
        
        for (TaggedValue tag : toRemove) {
            tag.delete();
        }
    }

    /**
     * {@inheritDoc}
     */
    @objid ("97ee8964-d803-11e1-b25c-001ec947ccaf")
    @Override
    public final Note getNote(String moduleName, String noteTypeName) {
        for (Note note : this.getDescriptor()) {
            final NoteType model = note.getModel();
            if (model != null && model.getName().contentEquals(noteTypeName)) {
                if (model.getModule() == null) {
                    if (moduleName == null) {
                        return note;
                    }
                } else if (model.getModule().getName().equals(moduleName)) {
                    return note;
                }
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("97ee896c-d803-11e1-b25c-001ec947ccaf")
    @Override
    public final String getNoteContent(String moduleName, String noteTypeName) {
        Note note = getNote(moduleName, noteTypeName);
        return (note != null) ? note.getContent() : null;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("7abfeac2-e619-4405-9895-b83d3b8c818f")
    @Override
    public void putNoteContent(String moduleName, String noteTypeName, String content) throws ExtensionNotFoundException {
        Note theNote = getNote(moduleName, noteTypeName);
        
        if (theNote == null) {
            // No such note on element, the factory creates it if there is only
            // one matching
            // type
            IModelFactory factory = ModelFactory.getFactory(this);
            factory.createNote(moduleName, noteTypeName, this, content);
        } else {
            theNote.setContent(content);
        }
    }

    /**
     * {@inheritDoc}
     */
    @objid ("7cb75488-166c-4c68-99b1-b4c847647aa6")
    @Override
    public void removeNotes(String moduleName, String noteTypeName) {
        List<Note> toRemove = new ArrayList<>();
        for (Note note : getDescriptor()) {
            NoteType model = note.getModel();
            if (model != null && model.getName().equals(noteTypeName)) {
                if (model.getModule() == null) {
                    if (moduleName == null) {
                        toRemove.add(note);
                    }
                } else if (model.getModule().getName().equals(moduleName)) {
                    toRemove.add(note);
                }
            }
        }
        for (Note note : toRemove) {
            note.delete();
        }
    }

    /**
     * {@inheritDoc}
     */
    @objid ("aedcff9b-2830-11e2-bf07-001ec947ccaf")
    @Override
    public final PropertyTable getProperties(String name) {
        for (PropertyTable t : getProperties()) {
            if (t.getName().equals(name))
                return t;
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("aedcffa1-2830-11e2-bf07-001ec947ccaf")
    @Override
    public final String getProperty(String tableName, String key) {
        PropertyTable props = getProperties(tableName);
        if (props == null)
            return null;
        else
            return props.getProperty(key);
    }

    /**
     * Answer to the question: is 'stereotype' a child of the stereotype named
     * by 'stereotypeName' Companion method of the public isStereoyped() method
     * @param stereotype a stereotype
     * @param stereotypeName the name of another stereotype.
     * @return <code>true</code> if 'stereotype' a child of the stereotype named
     * by 'stereotypeName' else <code>false</code>.
     */
    @objid ("2bb117ce-82e7-424a-9352-c37a231c95c5")
    private static boolean inheritsFrom(Stereotype stereotype, String stereotypeName) {
        if (stereotype.getName().equals(stereotypeName)) {
            return true;
        }
        
        if (stereotype.getParent() != null) {
            if (inheritsFrom(stereotype.getParent(), stereotypeName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("0ca61d4e-418c-443f-be4b-e7c66435aba9")
    @Override
    public final String getLocalProperty(String key) {
        LocalPropertyTable table = getLocalProperties();
        return (table != null) ? table.getProperty(key) : null;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("c1843b5a-2198-47a6-9bf5-79d3435cadc5")
    @Override
    public void setLocalProperty(String key, String value) {
        LocalPropertyTable table = getLocalProperties();
        if (table == null) {
            IModelFactory factory = ModelFactory.getFactory(this);
            table = factory.createLocalPropertyTable();
            table.setLocalAnnoted(this);
        }
        table.setProperty(key, value);
    }

    @objid ("6db9c095-34f2-4e65-b3ce-003fc4a22dec")
    @Override
    public String getName() {
        return (String) getAttVal(ModelElementData.Metadata.NameAtt());
    }

    @objid ("b3682c7c-471c-472f-ade0-3bb623115387")
    @Override
    public void setName(String value) {
        setAttVal(ModelElementData.Metadata.NameAtt(), value);
    }

    @objid ("1839919b-53f2-498c-87d4-f08bd3b77787")
    @Override
    public LocalPropertyTable getLocalProperties() {
        return (LocalPropertyTable) getDepVal(ModelElementData.Metadata.LocalPropertiesDep());
    }

    @objid ("94b04370-2a0b-43b6-a024-2f090ced65d6")
    @Override
    public void setLocalProperties(LocalPropertyTable value) {
        appendDepVal(ModelElementData.Metadata.LocalPropertiesDep(), (SmObjectImpl)value);
    }

    @objid ("9267443a-b4f5-4558-be64-20dc320ac611")
    @Override
    public EList<TemplateParameterSubstitution> getTemplateSubstitution() {
        return new SmList<>(this, ModelElementData.Metadata.TemplateSubstitutionDep());
    }

    @objid ("131f881b-a9ec-4fd4-a6c0-b4b2aee432c3")
    @Override
    public <T extends TemplateParameterSubstitution> List<T> getTemplateSubstitution(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateParameterSubstitution element : getTemplateSubstitution()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6468231a-4c82-4ef9-b4bb-e016420e49d3")
    @Override
    public EList<BpmnLane> getBpmnLaneRefs() {
        return new SmList<>(this, ModelElementData.Metadata.BpmnLaneRefsDep());
    }

    @objid ("43bff5c6-cd23-4b87-992d-b84ab2756ea5")
    @Override
    public <T extends BpmnLane> List<T> getBpmnLaneRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnLane element : getBpmnLaneRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7e37bfe5-6dc6-4ee6-a2e9-0a4413026631")
    @Override
    public EList<Stereotype> getExtension() {
        return new SmList<>(this, ModelElementData.Metadata.ExtensionDep());
    }

    @objid ("05c6efae-bd7c-4a78-b812-2d7dd1b2ca12")
    @Override
    public <T extends Stereotype> List<T> getExtension(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Stereotype element : getExtension()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8a4c4137-4b23-4897-a0fe-05a1a56eb87a")
    @Override
    public EList<Dependency> getDependsOnDependency() {
        return new SmList<>(this, ModelElementData.Metadata.DependsOnDependencyDep());
    }

    @objid ("35f2cebb-b38a-4a30-94ab-1e6d3fdf37cb")
    @Override
    public <T extends Dependency> List<T> getDependsOnDependency(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Dependency element : getDependsOnDependency()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2b3c647d-c64f-44ec-950d-7f16ba105e49")
    @Override
    public EList<TemplateParameter> getDefaultParametering() {
        return new SmList<>(this, ModelElementData.Metadata.DefaultParameteringDep());
    }

    @objid ("38a901d7-1a91-4cd2-a4df-b338e0a11a05")
    @Override
    public <T extends TemplateParameter> List<T> getDefaultParametering(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateParameter element : getDefaultParametering()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4c3b1b85-87b6-4c37-812a-5a7a74407f1d")
    @Override
    public EList<Binding> getRepresents() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentsDep());
    }

    @objid ("e7ae2066-2c27-4acf-80f1-cdf26360d3d0")
    @Override
    public <T extends Binding> List<T> getRepresents(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Binding element : getRepresents()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("da1979b2-523e-4722-8699-411ff8b90325")
    @Override
    public EList<ExternDocument> getDocument() {
        return new SmList<>(this, ModelElementData.Metadata.DocumentDep());
    }

    @objid ("3dc5a91f-4940-4295-8b2c-0889ce47a77b")
    @Override
    public <T extends ExternDocument> List<T> getDocument(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExternDocument element : getDocument()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("75455ce7-a686-40df-99ec-c286b71e6ced")
    @Override
    public EList<TaggedValue> getTag() {
        return new SmList<>(this, ModelElementData.Metadata.TagDep());
    }

    @objid ("204cf422-deb1-4a95-a073-356e9207aebf")
    @Override
    public <T extends TaggedValue> List<T> getTag(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TaggedValue element : getTag()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3bca9af9-e97a-4b71-9727-663474dc2497")
    @Override
    public TemplateParameter getOwnerTemplateParameter() {
        return (TemplateParameter) getDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep());
    }

    @objid ("c05656dd-5419-4ca7-a37d-da6bd9bb4812")
    @Override
    public void setOwnerTemplateParameter(TemplateParameter value) {
        appendDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep(), (SmObjectImpl)value);
    }

    @objid ("0d21332d-a005-40aa-abd4-44f497899e24")
    @Override
    public EList<Dependency> getImpactedDependency() {
        return new SmList<>(this, ModelElementData.Metadata.ImpactedDependencyDep());
    }

    @objid ("da4b5c5b-c3d1-4254-91a0-ae52f03afedd")
    @Override
    public <T extends Dependency> List<T> getImpactedDependency(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Dependency element : getImpactedDependency()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("65c455f7-9e03-4592-9b58-5056ca8cec76")
    @Override
    public EList<ConnectorEnd> getRepresentingEnd() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingEndDep());
    }

    @objid ("1211cdcf-4224-40ac-9a86-f747bbad901e")
    @Override
    public <T extends ConnectorEnd> List<T> getRepresentingEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ConnectorEnd element : getRepresentingEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("873d2872-0425-480c-bb6c-82c4a034183b")
    @Override
    public EList<ActivityPartition> getRepresentingPartition() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingPartitionDep());
    }

    @objid ("a3d49b7e-bd00-4088-b7c3-771a2a450e2b")
    @Override
    public <T extends ActivityPartition> List<T> getRepresentingPartition(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityPartition element : getRepresentingPartition()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1b031c2c-19fa-4903-897b-9c78a38d7c5b")
    @Override
    public EList<Constraint> getConstraintDefinition() {
        return new SmList<>(this, ModelElementData.Metadata.ConstraintDefinitionDep());
    }

    @objid ("55c09f81-eeab-4a0a-8614-9f95de062ad6")
    @Override
    public <T extends Constraint> List<T> getConstraintDefinition(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Constraint element : getConstraintDefinition()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d36083d1-3fd5-44a0-b7b7-b0667df3610a")
    @Override
    public EList<TemplateParameter> getTypingParameter() {
        return new SmList<>(this, ModelElementData.Metadata.TypingParameterDep());
    }

    @objid ("4709c011-70fd-4f50-a9c0-a069aabc394d")
    @Override
    public <T extends TemplateParameter> List<T> getTypingParameter(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateParameter element : getTypingParameter()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e659e6e9-2639-4df3-bd1e-50c2f05cfcb8")
    @Override
    public EList<Manifestation> getManifesting() {
        return new SmList<>(this, ModelElementData.Metadata.ManifestingDep());
    }

    @objid ("8d857c68-542f-4016-bb4d-251eefae7fa0")
    @Override
    public <T extends Manifestation> List<T> getManifesting(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Manifestation element : getManifesting()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("38270208-fc3f-4410-b03d-7e923d74468e")
    @Override
    public EList<PropertyTable> getProperties() {
        return new SmList<>(this, ModelElementData.Metadata.PropertiesDep());
    }

    @objid ("750ce11d-67ee-48f2-a9e0-00d7d0bba982")
    @Override
    public <T extends PropertyTable> List<T> getProperties(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PropertyTable element : getProperties()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("00977428-1d6b-478b-909c-86336d641db8")
    @Override
    public EList<AbstractDiagram> getProduct() {
        return new SmList<>(this, ModelElementData.Metadata.ProductDep());
    }

    @objid ("a7d4f9b3-69d5-4257-ae3e-bfcc0587b221")
    @Override
    public <T extends AbstractDiagram> List<T> getProduct(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AbstractDiagram element : getProduct()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b44b2b3f-9b5d-41af-98a1-24e05a9e1a84")
    @Override
    public EList<BindableInstance> getRepresentingInstance() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingInstanceDep());
    }

    @objid ("3b2f59f3-a631-4a4d-b083-1161ad9ebe5c")
    @Override
    public <T extends BindableInstance> List<T> getRepresentingInstance(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BindableInstance element : getRepresentingInstance()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("82ee1ae9-98ae-4d01-a145-56f75bc8df62")
    @Override
    public EList<InformationFlow> getReceivedInfo() {
        return new SmList<>(this, ModelElementData.Metadata.ReceivedInfoDep());
    }

    @objid ("c1ceb1ad-accc-40e6-b52e-4e0508850941")
    @Override
    public <T extends InformationFlow> List<T> getReceivedInfo(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getReceivedInfo()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4cde5858-d2c6-4204-a8d0-8ed48376aade")
    @Override
    public EList<InformationFlow> getSentInfo() {
        return new SmList<>(this, ModelElementData.Metadata.SentInfoDep());
    }

    @objid ("7fcf4031-ed53-4d2a-b3ff-8ec07951e1c8")
    @Override
    public <T extends InformationFlow> List<T> getSentInfo(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getSentInfo()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("74a46281-f19f-4a00-ad03-77439393780d")
    @Override
    public EList<Note> getDescriptor() {
        return new SmList<>(this, ModelElementData.Metadata.DescriptorDep());
    }

    @objid ("c68834a7-3ae5-4b80-8c9f-fb502027cd7c")
    @Override
    public <T extends Note> List<T> getDescriptor(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Note element : getDescriptor()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("970dc19d-f159-465a-b13f-2f25c1d560f4")
    @Override
    public EList<NaryConnector> getRepresentingConnector() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingConnectorDep());
    }

    @objid ("a94040f8-83fe-4eaf-83dd-d399aaa7e19b")
    @Override
    public <T extends NaryConnector> List<T> getRepresentingConnector(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NaryConnector element : getRepresentingConnector()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("73974cc8-93a6-459b-bb14-59fef017d378")
    @Override
    public EList<MatrixDefinition> getMatrix() {
        return new SmList<>(this, ModelElementData.Metadata.MatrixDep());
    }

    @objid ("620e338c-3f47-417b-b6c6-f88f50df0497")
    @Override
    public <T extends MatrixDefinition> List<T> getMatrix(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final MatrixDefinition element : getMatrix()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("af704a72-2dfe-4592-b329-3640380ef8a5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("5f6e8cbd-8414-4c94-acbc-7bc6deab9a65")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep());
        if (obj != null)
          return new SmDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ea86ae15-5b14-4033-8af2-1560e25bf8b0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModelElement(this);
        else
          return null;
    }

}
