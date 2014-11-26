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
                                    

package org.modelio.gproject.ramc.core.packaging.filters;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.NameSpace;

/**
 * {@link ConfigurableModelFilter} builder service to use to package a model component.
 */
@objid ("6179089a-c746-11e1-96e9-001ec947ccaf")
public class RamcFilterBuilder {
    @objid ("1a5a6fe5-c789-11e1-96e9-001ec947ccaf")
    private final StereotypeFilter dependencyFilter = new StereotypeFilter();

    @objid ("1a5a6fe6-c789-11e1-96e9-001ec947ccaf")
    private final FeatureFilter featureFilter = new FeatureFilter();

    @objid ("1a5a6fe8-c789-11e1-96e9-001ec947ccaf")
    private final NameSpaceFilter namespaceFilter = new NameSpaceFilter();

    @objid ("1a5a6fe9-c789-11e1-96e9-001ec947ccaf")
    private final NoteFilter noteFilter;

    @objid ("1a5a6fea-c789-11e1-96e9-001ec947ccaf")
    private final TaggedValueFilter tagFilter;

    @objid ("26dc20ce-aa37-48f5-a4ec-2aaf74a84dbd")
    private final IgnoreFilter ignoreFilter;

    /**
     * Initialize the builder.
     * @param artifact the model component artifact.
     */
    @objid ("61790927-c746-11e1-96e9-001ec947ccaf")
    public RamcFilterBuilder(Artifact artifact) {
        this.noteFilter = new NoteFilter(artifact);
        this.tagFilter  = new TaggedValueFilter(artifact);
        this.ignoreFilter = new IgnoreFilter();
    }

    /**
     * Tells to accept {@link Dependency UML Dependencies} with the given stereotype.
     * @param type a stereotype on {@link Dependency} metaclass.
     */
    @objid ("6179078e-c746-11e1-96e9-001ec947ccaf")
    public void addDependencyStereotype(final Stereotype type) {
        this.dependencyFilter.addStereotype(type);
    }

    /**
     * Add a type of notes to accept.
     * @param type a note type
     */
    @objid ("617907d6-c746-11e1-96e9-001ec947ccaf")
    public void addNoteType(final NoteType type) {
        this.noteFilter.addNoteType(type);
    }

    /**
     * Add a type of tags to accept.
     * @param type a tag type.
     */
    @objid ("6179090a-c746-11e1-96e9-001ec947ccaf")
    public void addTagType(final TagType type) {
        this.tagFilter.addTagType(type);
    }

    /**
     * Build the RAMC packaging model filter.
     * @return the RAMC model filter.
     */
    @objid ("f166aaa3-c9a1-11e1-96e9-001ec947ccaf")
    public ConfigurableModelFilter getModelFilter() {
        ConfigurableModelFilter modelFilter = new ConfigurableModelFilter();
        modelFilter.setFilter(Dependency.class, this.dependencyFilter);
        modelFilter.setFilter(Feature.class, this.featureFilter);
        modelFilter.setFilter(NameSpace.class, this.namespaceFilter);
        modelFilter.setFilter(TaggedValue.class, this.tagFilter);
        modelFilter.setFilter(Note.class, this.noteFilter);
        modelFilter.setFilter(AbstractDiagram.class, this.ignoreFilter);
        modelFilter.setFilter(MatrixDefinition.class, this.ignoreFilter);
        modelFilter.setFilter(ExternDocument.class, this.ignoreFilter);
        return modelFilter;
    }

}
