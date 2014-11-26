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
                                    

package org.modelio.gproject.module.catalog;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2ExternDocumentType;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Profiles.Jxbv2Profile.Jxbv2MetaclassReference;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Profiles.Jxbv2Profile.Jxbv2Stereotype.Jxbv2Icon;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Profiles.Jxbv2Profile.Jxbv2Stereotype.Jxbv2Image;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Profiles.Jxbv2Profile.Jxbv2Stereotype;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Profiles.Jxbv2Profile;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2NoteType;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2PropertyDefinition;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2PropertyTableDefinition;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2PropertyType;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2TagType;
import org.modelio.gproject.data.project.ProjectDescriptor;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.gproject.GProjectCreator;
import org.modelio.gproject.gproject.GProjectFactory;
import org.modelio.gproject.ramc.core.model.ModelComponent;
import org.modelio.gproject.ramc.core.packaging.RamcPackager;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.log.Log;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.session.impl.GenericFactory;
import org.modelio.vcore.session.impl.SmFactory;
import org.modelio.vcore.session.impl.permission.BasicAccessManager;
import org.modelio.vcore.session.impl.storage.memory.MemoryRepository;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * Helper class building a module model component from a {@link Jxbv2Module}.
 */
@objid ("156a6e31-0c96-11e2-b501-002564c97630")
class RamcBuilder {
    @objid ("a9855352-3530-428d-bc78-5e6d190c0a0a")
    private Map<String, PropertyType> propertyTypeCache = new HashMap<>();

    @objid ("072a479f-9fa5-4e5a-bbc9-645da488cf86")
    private Jxbv2Module loadedModule;

    /**
     * Helper method creating a model component in several steps:
     * <ol>
     * <li>create a temporary in memory {@link GProject}.</li>
     * <li>create a full {@link ModuleComponent} from a {@link Jxbv2Module}</li>
     * <li>package the model component containing this module</li>
     * <li>close the temporary project and delete it.</li>
     * </ol>
     * @param loadedModule
     * the jaxb module to create the {@link ModuleComponent} from.
     * @param ramcPath the path to package the ramc into.
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @throws java.io.IOException in case of failure
     */
    @objid ("2c95c269-f37d-11e1-a3c7-002564c97630")
    public void createRamc(Path ramcPath, IModelioProgress monitor) throws IOException {
        SubProgress mon = SubProgress.convert(monitor, 60);
        
        Path tempDirectory = Files.createTempDirectory("ModelioCatalog");
        
        ProjectDescriptor projectDescriptor = GProjectCreator.buildEmptyProject(this.loadedModule.getId(), tempDirectory);
        GProject gproject = GProjectFactory.openProject(projectDescriptor, null, null, mon.newChild(10));
        
        try {
            Artifact artifact = createRamcModel(gproject, this.loadedModule, mon.newChild(10));
            // Run packaging
            RamcPackager packager = new RamcPackager(gproject, artifact, ramcPath);
            // For module static-model ramcs do not export the artifact
            // itself because this artifact is only a temporary one used to
            // package the ramc. Furthermore, keeping it in the ramc would cause
            // trouble when removing the module.
            packager.setIncludeArtifact(false);
            packager.run(mon.newChild(30));
        } finally {
            gproject.close();
        }
        
        // TODO this is a quite naive implementation, it should deal with
        // project path for delegating project
        try {
            FileUtils.delete(tempDirectory);
        } catch (IOException e) {
            Log.warning(e);
        }
    }

    @objid ("6b4a6f4b-99aa-4e43-b1c7-e96f31534596")
    private Artifact createRamcModel(GProject gproject, Jxbv2Module loadedModule, IModelioProgress monitor) throws IOException {
        ICoreSession session = gproject.getSession();
        
        // Create a temporary memory repository
        IRepository repo = new MemoryRepository();
        session.getRepositorySupport().connectRepository(repo, new BasicAccessManager(), monitor);
        
        // Configure a dedicated model factory in the repository
        ModelFactory modelfactory = new ModelFactory(session, repo);
        
        // Create the RAMC model
        try (ITransaction t = session.getTransactionSupport().createTransaction("Init " + loadedModule.getId() + " module RAMC")) {
            // Create a project to model the ramc
            GenericFactory gf = session.getModel().getGenericFactory();
            Project ramcProject = gf.create(Project.class, repo);
            Package ramcProjectRoot = gf.create(Package.class, repo);
            ramcProject.setModel(ramcProjectRoot);
        
            // Create the module itself
            ModuleComponent module = modelfactory.createModule(loadedModule);
        
            // First create the propertyTypes
            if (loadedModule.getPropertyTypes() != null) {
                for (Jxbv2PropertyType loadedPropertyType : loadedModule.getPropertyTypes().getPropertyType()) {
                    modelfactory.createPropertyType(module, loadedPropertyType);
                }
            }
        
            // For performance reasons set up a cache of all known property types
            for (PropertyType pType : session.getModel().findByClass(PropertyType.class)) {
                this.propertyTypeCache.put(pType.getName(), pType);
            }
        
            // Import Profiles, Stereotypes, TagTypes and so on.
            for (Jxbv2Profile loadedProfile : loadedModule.getProfiles().getProfile()) {
                createProfile(modelfactory, module, loadedProfile);
            }
        
            // Import parameters
            for (org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Parameters.Jxbv2Parameter loadedParam : loadedModule
                    .getParameters().getParameter()) {
                modelfactory.createConfigParam(loadedParam, module);
            }
        
            // Post processing
            // Establish inheritance links between stereotypes
            for (Jxbv2Profile loadedProfile : loadedModule.getProfiles().getProfile()) {
                for (Jxbv2Stereotype loadedStereotype : loadedProfile.getStereotype()) {
                    if (loadedStereotype.getOwnerStereotype() != null) {
                        Stereotype current = session.getModel().findById(Stereotype.class,
                                UUID.fromString(loadedStereotype.getUid()));
                        Collection<Stereotype> owners = session.getModel().findByAtt(Stereotype.class, "Name",
                                loadedStereotype.getOwnerStereotype());
                        if (current != null && owners.size() > 0) {
                            current.setParent(owners.iterator().next());
                        }
                    }
                }
            }
        
            // Define RAMC packaging.
            // Generate the RAMC Artifact
            Artifact ramcArtifact = gf.create(Artifact.class, ramcProjectRoot);
            ramcProjectRoot.getOwnedElement().add(ramcArtifact);
            ramcArtifact.setName(loadedModule.getId());
        
            ModelComponent ramcFact = new ModelComponent(ramcArtifact);
            ramcFact.setRamcName(loadedModule.getId());
            ramcFact.setRamcVersion(new Version(loadedModule.getVersion()));
            ramcFact.getExportedElements().add(module);
            ramcFact.updateArtifact();
        
            t.commit();
        
            return ramcArtifact;
        
        }
    }

    @objid ("fa6406a5-03d1-4875-ae65-d18110d36136")
    private Profile createProfile(ModelFactory modelfactory, ModuleComponent module, Jxbv2Profile loadedProfile) {
        Profile profile = modelfactory.createProfile(loadedProfile, module);
        
        for (Jxbv2Stereotype loadedStereotype : loadedProfile.getStereotype()) {
            createStereotype(modelfactory, profile, loadedStereotype);
        }
        
        for (Jxbv2MetaclassReference loadedRef : loadedProfile.getMetaclassReference()) {
            createMetaclassReference(modelfactory, profile, loadedRef);
        }
        return profile;
    }

    @objid ("a2ff7b65-45ed-4732-ad44-ce82cb54afe2")
    private MetaclassReference createMetaclassReference(ModelFactory modelfactory, Profile profile, Jxbv2MetaclassReference loadedRef) {
        MetaclassReference mcRef = modelfactory.createMetaClassReference(loadedRef, profile);
        if (loadedRef.getTagTypes() != null) {
            for (Jxbv2TagType loadedTagType : loadedRef.getTagTypes().getTagType()) {
                modelfactory.createTagType(loadedTagType, mcRef);
            }
        }
        if (loadedRef.getNoteTypes() != null) {
            for (Jxbv2NoteType loadedNoteType : loadedRef.getNoteTypes().getNoteType()) {
                modelfactory.createNoteType(loadedNoteType, mcRef);
            }
        }
        if (loadedRef.getExternDocumentTypes() != null) {
            for (Jxbv2ExternDocumentType loadedDocumentType : loadedRef.getExternDocumentTypes().getExternDocumentType()) {
                modelfactory.createExternalDocumentType(loadedDocumentType, mcRef);
            }
        }
        return mcRef;
    }

    @objid ("560948bf-7c0d-490c-a1d3-2fc8ec0456d8")
    private Stereotype createStereotype(ModelFactory modelfactory, Profile profile, Jxbv2Stereotype loadedStereotype) {
        Stereotype stereotype = modelfactory.createStereotype(loadedStereotype, profile);
        
        if (loadedStereotype.getTagTypes() != null) {
            for (Jxbv2TagType loadedTagType : loadedStereotype.getTagTypes().getTagType()) {
                modelfactory.createTagType(loadedTagType, stereotype);
            }
        }
        if (loadedStereotype.getNoteTypes() != null) {
            for (Jxbv2NoteType loadedNoteType : loadedStereotype.getNoteTypes().getNoteType()) {
                modelfactory.createNoteType(loadedNoteType, stereotype);
            }
        }
        if (loadedStereotype.getExternDocumentTypes() != null) {
            for (Jxbv2ExternDocumentType loadedDocumentType : loadedStereotype.getExternDocumentTypes().getExternDocumentType()) {
                modelfactory.createExternalDocumentType(loadedDocumentType, stereotype);
            }
        }
        Jxbv2PropertyTableDefinition loadedTableType = loadedStereotype.getPropertyTable();
        if (loadedTableType != null) {
            createTableType(modelfactory, stereotype, loadedTableType);
        }
        return stereotype;
    }

    @objid ("8e8bdc7f-7d4f-4d31-a8a4-57292f9848e7")
    RamcBuilder(Jxbv2Module loadedModule) {
        this.loadedModule = loadedModule;
    }

    @objid ("6e1a628d-abf4-4bcf-af5d-4971fcd09032")
    private void createTableType(ModelFactory modelfactory, Stereotype stereotype, Jxbv2PropertyTableDefinition loadedTableType) {
        PropertyTableDefinition tableType = modelfactory.createTableType(loadedTableType, stereotype);
        
        for (Jxbv2PropertyDefinition loadedPropertyDefinition : loadedTableType.getPropertyDefinition()) {
            PropertyType pType = (PropertyType) modelfactory.model.getObjectReference(SmClass.getClass(PropertyType.class),
                    UUID.fromString(loadedPropertyDefinition.getTypeRef().getId()), "");
            modelfactory.createPropertyDefinition(loadedPropertyDefinition, tableType, pType);
        }
    }

    /**
     * A basic MDA elements factory from JAXB elements.
     */
    @objid ("2c90b933-f37d-11e1-a3c7-002564c97630")
    static class ModelFactory {
        @objid ("2c912e64-f37d-11e1-a3c7-002564c97630")
        private final SmFactory model;

        @objid ("2c912e65-f37d-11e1-a3c7-002564c97630")
        private final IRepository repo;

        /**
         * Constructor.
         * @param session the core modeling session.
         * @param repo the repository where elements will be created.
         */
        @objid ("2c915573-f37d-11e1-a3c7-002564c97630")
        public ModelFactory(final ICoreSession session, IRepository repo) {
            this.model = ((CoreSession) session).getSmFactory();
            this.repo = repo;
        }

        @objid ("2c917c83-f37d-11e1-a3c7-002564c97630")
        public ModuleParameter createConfigParam(final org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Parameters.Jxbv2Parameter jaxbelement, final ModuleComponent owner) {
            ModuleParameter element = (ModuleParameter) this.model.createObject(SmClass.getClass(ModuleParameter.class), this.repo,
                    UUID.fromString(jaxbelement.getUid()));
            
            element.setName(jaxbelement.getId());
            element.setOwner(owner);
            return element;
        }

        @objid ("2c943ba7-f37d-11e1-a3c7-002564c97630")
        public ExternDocumentType createExternalDocumentType(final Jxbv2ExternDocumentType jaxbelement, final Element owner) {
            ExternDocumentType element = (ExternDocumentType) this.model.createObject(SmClass.getClass(ExternDocumentType.class),
                    this.repo, UUID.fromString(jaxbelement.getUid()));
            
            element.setName(jaxbelement.getName());
            
            if (jaxbelement.getIsHidden() != null) {
                element.setIsHidden(jaxbelement.getIsHidden().equals("true"));
            }
            element.setLabelKey(jaxbelement.getLabel() != null ? jaxbelement.getLabel() : jaxbelement.getName());
            
            if (owner instanceof Stereotype) {
                element.setOwnerStereotype((Stereotype) owner);
            } else if (owner instanceof MetaclassReference) {
                element.setOwnerReference((MetaclassReference) owner);
            }
            return element;
        }

        @objid ("5694c9d2-8618-4335-84b3-f5c046b26b23")
        public PropertyTableDefinition createTableType(Jxbv2PropertyTableDefinition loadedTableType, Stereotype owner) {
            PropertyTableDefinition pdef = (PropertyTableDefinition) this.model.createObject(
                    SmClass.getClass(PropertyTableDefinition.class), this.repo, UUID.fromString(loadedTableType.getUid()));
            
            pdef.setOwnerStereotype(owner);
            pdef.setName(loadedTableType.getId());
            return pdef;
        }

        @objid ("2c91a396-f37d-11e1-a3c7-002564c97630")
        public MetaclassReference createMetaClassReference(final org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Profiles.Jxbv2Profile.Jxbv2MetaclassReference jaxbelement, final Profile owner) {
            MetaclassReference element = (MetaclassReference) this.model.createObject(SmClass.getClass(MetaclassReference.class),
                    this.repo, UUID.fromString(jaxbelement.getUid()));
            
            element.setReferencedClassName(jaxbelement.getMetaclass());
            element.setOwnerProfile(owner);
            return element;
        }

        /**
         * Create a module.
         * @param jaxbelement entry in .xml file
         * @return the created module.
         */
        @objid ("2c91f1b4-f37d-11e1-a3c7-002564c97630")
        public ModuleComponent createModule(final Jxbv2Module jaxbelement) {
            ModuleComponent element = (ModuleComponent) this.model.createObject(SmClass.getClass(ModuleComponent.class), this.repo,
                    UUID.fromString(jaxbelement.getUid()));
            
            Version version = new Version(jaxbelement.getVersion());
            element.setMajVersion(new Integer(version.getMajorVersion()));
            element.setMinVersion(new Integer(version.getMinorVersion()));
            element.setMinMinVersion(Integer.toString(version.getBuildVersion()) + "."
                    + Integer.toString(version.getMetamodelVersion()));
            
            element.setName(jaxbelement.getId());
            element.setJavaClassName(jaxbelement.getClazz());
            return element;
        }

        @objid ("2c9218c4-f37d-11e1-a3c7-002564c97630")
        public NoteType createNoteType(final Jxbv2NoteType jaxbelement, final Element owner) {
            NoteType element = (NoteType) this.model.createObject(SmClass.getClass(NoteType.class), this.repo,
                    UUID.fromString(jaxbelement.getUid()));
            
            element.setName(jaxbelement.getName());
            
            if (jaxbelement.getIsHidden() != null) {
                element.setIsHidden(jaxbelement.getIsHidden().equals("true"));
            }
            
            element.setLabelKey(jaxbelement.getLabel() != null ? jaxbelement.getLabel() : jaxbelement.getName());
            
            if (owner instanceof Stereotype) {
                element.setOwnerStereotype((Stereotype) owner);
                if (element.getOwnerReference() != null) {
                    element.setOwnerReference(null);
                }
            } else if (owner instanceof MetaclassReference) {
                element.setOwnerReference((MetaclassReference) owner);
                if (element.getOwnerStereotype() != null) {
                    element.setOwnerStereotype(null);
                }
            }
            return element;
        }

        @objid ("2c923fd6-f37d-11e1-a3c7-002564c97630")
        public Profile createProfile(final Jxbv2Profile jaxbelement, final ModuleComponent owner) {
            Profile element = (Profile) this.model.createObject(SmClass.getClass(Profile.class), this.repo,
                    UUID.fromString(jaxbelement.getUid()));
            
            element.setName(jaxbelement.getId());
            element.setOwnerModule(owner);
            return element;
        }

        /**
         * @param jaxbelement XML node
         * @param owner the project
         * @return the created stereotype.
         */
        @objid ("2c9266e8-f37d-11e1-a3c7-002564c97630")
        public Stereotype createStereotype(final org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Profiles.Jxbv2Profile.Jxbv2Stereotype jaxbelement, final Profile owner) {
            Stereotype element = (Stereotype) this.model.createObject(SmClass.getClass(Stereotype.class), this.repo,
                    UUID.fromString(jaxbelement.getUid()));
            
            element.setName(jaxbelement.getName());
            element.setOwner(owner);
            
            Jxbv2Icon icon = jaxbelement.getIcon();
            if (icon != null && icon.getPath() != null)
                element.setIcon(icon.getPath());
            
            Jxbv2Image image = jaxbelement.getImage();
            if (image != null && image.getPath() != null)
                element.setImage(image.getPath());
            
            if (jaxbelement.getIsHidden() != null) {
                element.setIsHidden(jaxbelement.getIsHidden().equals("true"));
            }
            
            if (jaxbelement.getMetaclass() != null) {
                element.setBaseClassName(jaxbelement.getMetaclass());
            }
            
            element.setLabelKey(jaxbelement.getLabel() != null ? jaxbelement.getLabel() : jaxbelement.getName());
            
            element.setOwner(owner);
            return element;
        }

        @objid ("2c92b506-f37d-11e1-a3c7-002564c97630")
        public TagType createTagType(final Jxbv2TagType jaxbelement, final Element owner) {
            TagType element = (TagType) this.model.createObject(SmClass.getClass(TagType.class), this.repo,
                    UUID.fromString(jaxbelement.getUid()));
            
            element.setName(jaxbelement.getName());
            
            if (jaxbelement.getIsHidden() != null) {
                element.setIsHidden(jaxbelement.getIsHidden().equals("true"));
            }
            
            element.setLabelKey(jaxbelement.getLabel() != null ? jaxbelement.getLabel() : jaxbelement.getName());
            
            if (jaxbelement.getParameterCard() != null) {
                element.setParamNumber(jaxbelement.getParameterCard());
            }
            
            if (jaxbelement.getIsSigned() != null) {
                element.setBelongToPrototype(jaxbelement.getIsSigned().equals("true"));
            }
            
            if (owner instanceof Stereotype) {
                element.setOwnerStereotype((Stereotype) owner);
                if (element.getOwnerReference() != null) {
                    element.setOwnerReference(null);
                }
            } else if (owner instanceof MetaclassReference) {
                element.setOwnerReference((MetaclassReference) owner);
                if (element.getOwnerStereotype() != null) {
                    element.setOwnerStereotype(null);
                }
            }
            return element;
        }

        @objid ("39a11622-b9ff-4ed1-8516-518791bb4af8")
        public PropertyDefinition createPropertyDefinition(Jxbv2PropertyDefinition loadedPropertyType, PropertyTableDefinition owner, PropertyType pType) {
            PropertyDefinition element = (PropertyDefinition) this.model.createObject(SmClass.getClass(PropertyDefinition.class),
                    this.repo, UUID.fromString(loadedPropertyType.getUid()));
            
            element.setName(loadedPropertyType.getId());
            element.setDefaultValue(loadedPropertyType.getDefaultValue());
            element.setIsEditable(loadedPropertyType.isIsEditable());
            element.setType(pType);
            element.setOwner(owner);
            
            // FIXME
            // element.setLabel();
            return element;
        }

        @objid ("e1af37d8-91f9-4238-9c40-e3787262c002")
        public PropertyType createPropertyType(ModuleComponent owner, Jxbv2PropertyType loadedPropertyType) {
            PropertyType element = (PropertyType) this.model.createObject(SmClass.getClass(PropertyType.class), this.repo,
                    UUID.fromString(loadedPropertyType.getUid()));
            
            element.setName(loadedPropertyType.getId());
            element.setModuleOwner(owner);
            return element;
        }

    }

}
