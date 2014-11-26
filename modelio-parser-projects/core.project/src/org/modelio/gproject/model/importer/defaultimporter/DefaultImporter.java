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
                                    

package org.modelio.gproject.model.importer.defaultimporter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.model.facilities.CompositionInitializer;
import org.modelio.gproject.model.importer.core.AbstractImporter;
import org.modelio.gproject.model.importer.core.IAttributesImporter;
import org.modelio.gproject.model.importer.core.IBrokenDependencyHandler;
import org.modelio.gproject.model.importer.core.ICompositionGetter;
import org.modelio.gproject.model.importer.core.IDependencyGetter;
import org.modelio.gproject.model.importer.core.IDependencyUpdater;
import org.modelio.gproject.model.importer.core.IImportFilter;
import org.modelio.gproject.model.importer.core.IObjectFinder;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.visitors.DefaultModelVisitor;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmDependency;

/**
 * Service class used to import model from a ICoreSession to another one.
 * <p>
 * The identifiers are kept same.
 */
@objid ("006b567a-d3aa-108f-8d81-001ec947cd2a")
public class DefaultImporter extends AbstractImporter {
    @mdl.prop
    @objid ("006c15e2-d3aa-108f-8d81-001ec947cd2a")
    private IAttributesImporter attributesImporter;

    @mdl.propgetter
    protected IAttributesImporter getAttributesImporter() {
        // Automatically generated method. Please do not modify this code.
        return this.attributesImporter;
    }

    @mdl.propsetter
    protected void setAttributesImporter(IAttributesImporter value) {
        // Automatically generated method. Please do not modify this code.
        this.attributesImporter = value;
    }

    @mdl.prop
    @objid ("006bf4c2-d3aa-108f-8d81-001ec947cd2a")
    private IBrokenDependencyHandler brokenDependencyHandler;

    @mdl.propgetter
    protected IBrokenDependencyHandler getBrokenDependencyHandler() {
        // Automatically generated method. Please do not modify this code.
        return this.brokenDependencyHandler;
    }

    @mdl.propsetter
    protected void setBrokenDependencyHandler(IBrokenDependencyHandler value) {
        // Automatically generated method. Please do not modify this code.
        this.brokenDependencyHandler = value;
    }

    @mdl.prop
    @objid ("006c7d34-d3aa-108f-8d81-001ec947cd2a")
    private IDependencyUpdater compositionDepUpdater;

    @mdl.propgetter
    protected IDependencyUpdater getCompositionDepUpdater() {
        // Automatically generated method. Please do not modify this code.
        return this.compositionDepUpdater;
    }

    @mdl.propsetter
    protected void setCompositionDepUpdater(IDependencyUpdater value) {
        // Automatically generated method. Please do not modify this code.
        this.compositionDepUpdater = value;
    }

    @mdl.prop
    @objid ("006bfd50-d3aa-108f-8d81-001ec947cd2a")
    private ICompositionGetter compositionGetter;

    @mdl.propgetter
    protected ICompositionGetter getCompositionGetter() {
        // Automatically generated method. Please do not modify this code.
        return this.compositionGetter;
    }

    @mdl.propsetter
    protected void setCompositionGetter(ICompositionGetter value) {
        // Automatically generated method. Please do not modify this code.
        this.compositionGetter = value;
    }

    @mdl.prop
    @objid ("006c0548-d3aa-108f-8d81-001ec947cd2a")
    private IDependencyGetter dependencyGetter;

    @mdl.propgetter
    protected IDependencyGetter getDependencyGetter() {
        // Automatically generated method. Please do not modify this code.
        return this.dependencyGetter;
    }

    @mdl.propsetter
    protected void setDependencyGetter(IDependencyGetter value) {
        // Automatically generated method. Please do not modify this code.
        this.dependencyGetter = value;
    }

    @mdl.prop
    @objid ("006c912a-d3aa-108f-8d81-001ec947cd2a")
    private IImportFilter importFilter;

    @mdl.propgetter
    protected IImportFilter getImportFilter() {
        // Automatically generated method. Please do not modify this code.
        return this.importFilter;
    }

    @mdl.propsetter
    protected void setImportFilter(IImportFilter value) {
        // Automatically generated method. Please do not modify this code.
        this.importFilter = value;
    }

    @mdl.prop
    @objid ("006c0d68-d3aa-108f-8d81-001ec947cd2a")
    private IObjectFinder objectFinder;

    @mdl.propgetter
    protected IObjectFinder getObjectFinder() {
        // Automatically generated method. Please do not modify this code.
        return this.objectFinder;
    }

    @mdl.propsetter
    protected void setObjectFinder(IObjectFinder value) {
        // Automatically generated method. Please do not modify this code.
        this.objectFinder = value;
    }

    @mdl.prop
    @objid ("006c8766-d3aa-108f-8d81-001ec947cd2a")
    private IDependencyUpdater referenceDepUpdater;

    @mdl.propgetter
    protected IDependencyUpdater getReferenceDepUpdater() {
        // Automatically generated method. Please do not modify this code.
        return this.referenceDepUpdater;
    }

    @mdl.propsetter
    protected void setReferenceDepUpdater(IDependencyUpdater value) {
        // Automatically generated method. Please do not modify this code.
        this.referenceDepUpdater = value;
    }

    @objid ("000341f2-5247-1091-8d81-001ec947cd2a")
    private AnalystFixerVisitor analystFixer;

    @objid ("006cc262-d3aa-108f-8d81-001ec947cd2a")
    @Override
    protected void prepare(final ICoreSession localSession, final SmObjectImpl localRoot, final ICoreSession refSession, List<SmObjectImpl> refRoots) {
        if (this.importFilter == null) {
            this.importFilter = new IgnoreRamcsImportFilter();
        }
        if (this.objectFinder == null) {
            this.objectFinder = new DefaultObjectFinder();
        }
        
        if (this.brokenDependencyHandler == null) {
            this.brokenDependencyHandler = new DefaultBrokenDependencyHandler();
        }
        
        if (this.referenceDepUpdater == null) {
            this.referenceDepUpdater = new DefaultReferenceDependencyUpdater(this.brokenDependencyHandler, this.objectFinder,
                    localSession);
        }
        
        if (this.compositionDepUpdater == null) {
            this.compositionDepUpdater = new DefaultCompositionDependencyUpdater(this.brokenDependencyHandler, this.objectFinder,
                    localSession, this.importFilter);
        }
        
        if (this.dependencyGetter == null) {
            this.dependencyGetter = new DefaultDependencyGetter();
        }
        
        if (this.compositionGetter == null) {
            this.compositionGetter = new DefaultCompositionGetter();
        }
        
        if (this.attributesImporter == null) {
            this.attributesImporter = new DefaultAttributesImporter();
        }
        
        this.analystFixer = new AnalystFixerVisitor(localSession);
    }

    @objid ("0003ef8a-5247-1091-8d81-001ec947cd2a")
    @Override
    protected void importElements(ICoreSession localSession, SmObjectImpl localRoot, ICoreSession refSession, List<SmObjectImpl> refRoots) {
        for (SmObjectImpl refToImport : this.compositionGetter.getAllChildren(refRoots)) {
        
            // If 'toImport' is a shell object the import will not be viable
            // BrokenDependencyHandler will be called as soon as an imported element needs the missing element.
            if (refToImport.isShell() || this.importFilter.select(refToImport) == false) {
                continue;
            }
        
            SmObjectImpl localObject = this.objectFinder.getSameObject(localSession.getModel(), refToImport);
            if (localObject == null) {
                // there is no local object equivalent to 'toImport' => create a new object
                localObject = ((CoreSession)localSession).getSmFactory().createObject(refToImport.getClassOf(), localSession.getRepositorySupport().getRepository(localRoot), refToImport.getUuid());
        
                // import its attributes
                this.attributesImporter.importAttributes(refToImport, localObject);
        
                // store the created object in the results
                this.result.addCreatedObject(localObject, refToImport);
        
            } else {
                assert (refToImport.equals(localObject) == false);
        
                if (localObject.isDeleted()) {
                    // restore before import
                    localObject.getMetaOf().objUndeleted(localObject);
                }
        
                // import its attributes
                this.attributesImporter.importAttributes(refToImport, localObject);
        
                // store the updated object in the results
                this.result.addUpdatedObject(localObject, refToImport);
            }
        }
    }

    @objid ("006df060-d3aa-108f-8d81-001ec947cd2a")
    @Override
    protected void importCompositionDependencies(final SmObjectImpl refObject, SmObjectImpl localObject) {
        // import all the composition dependencies
        for (SmDependency smDep : getDependencyGetter().getCompositionDeps(localObject)) {
            this.compositionDepUpdater.execute(refObject, smDep, localObject);
        }
    }

    @objid ("00045e3e-5247-1091-8d81-001ec947cd2a")
    @Override
    protected void importReferenceDependencies(final SmObjectImpl refObject, SmObjectImpl localObject) {
        // import all the reference (not-composition) dependencies
        for (SmDependency smDep : getDependencyGetter().getReferenceDeps(localObject)) {
            this.referenceDepUpdater.execute(refObject, smDep, localObject);
        }
    }

    @objid ("0003a58e-5247-1091-8d81-001ec947cd2a")
    @Override
    protected void reparentElements(Map<SmObjectImpl, SmDependency> orphans, ICoreSession localSession, SmObjectImpl localRoot) {
        // Process broken links by delegation to the customized IBrokenDependencyHandler
        this.brokenDependencyHandler.postProcess();
        
        // Re-attach orphan roots
        if (localRoot != null) {
            AddToRootProcessor addProc = new AddToRootProcessor();
            for (SmObjectImpl stillOrphan : addProc.reparentOrphans(orphans, localRoot, localSession)) {
                // Some elements are still orphan, delete them
                this.result.addObjectToDelete(stillOrphan);
            }
        }
    }

    @objid ("0087f532-e548-108f-8d81-001ec947cd2a")
    @Override
    protected void fixElement(SmObjectImpl localObject, SmObjectImpl refObject, ICoreSession localSession, ICoreSession refSession) {
        // Fix the Analyst model
        if (localObject != null && !localObject.isDeleted()) {
            this.analystFixer.fixModel(refObject, localObject);
        }
        
        // Copy related blobs
        localSession.getBlobSupport().fireObjectCopied(refObject, localObject);
    }

    @objid ("0086434a-e548-108f-8d81-001ec947cd2a")
    private static class AddToRootProcessor {
        @objid ("00865c9a-e548-108f-8d81-001ec947cd2a")
        protected AddToRootProcessor() {
            // Nothing to do
        }

        @objid ("008669b0-e548-108f-8d81-001ec947cd2a")
        public List<SmObjectImpl> reparentOrphans(final Map<SmObjectImpl, SmDependency> orphans, SmObjectImpl fallbackParent, ICoreSession session) {
            ImportCompositionInitializer initializer = new ImportCompositionInitializer(fallbackParent, session);
            
            List<SmObjectImpl> stillOrphans = new ArrayList<>();
            
            for (Entry<SmObjectImpl, SmDependency> orphan : orphans.entrySet()) {
                if (orphan != null && !orphan.getKey().isDeleted()) {
                    if (!attach(orphan.getKey(), orphan.getValue(), initializer)) {
                        stillOrphans.add(orphan.getKey());
                    }
                }
            }
            return stillOrphans;
        }

        @objid ("0086b500-e548-108f-8d81-001ec947cd2a")
        private static boolean attach(final SmObjectImpl orphan, SmDependency smDependency, ImportCompositionInitializer initializer) {
            // Try adding it to the local root
            boolean res = initializer.execute(orphan, smDependency);
            return (res || isRoot(orphan)) ;
        }

        @objid ("0086e0d4-e548-108f-8d81-001ec947cd2a")
        private static class ImportCompositionInitializer extends CompositionInitializer {
            @objid ("0086f0f6-e548-108f-8d81-001ec947cd2a")
            private final AnalystProject reqProject;

            @objid ("008700be-e548-108f-8d81-001ec947cd2a")
            protected ImportCompositionInitializer(final SmObjectImpl aParent, ICoreSession destSession) {
                super(aParent);
                // FIXME get analyst project
                this.reqProject = (AnalystProject) destSession.getModel().findByClass(Metamodel.getMClass(AnalystProject.class)).iterator()
                        .next();
            }

            @objid ("00872152-e548-108f-8d81-001ec947cd2a")
            @Override
            public Object visitPropertyTableDefinition(PropertyTableDefinition thePropertyTableDefinition) {
                if (this.parent instanceof PropertyContainer) {
                    thePropertyTableDefinition.setOwner((PropertyContainer) this.parent);
                    return true;
                } else {
                    thePropertyTableDefinition.setOwner(this.reqProject.getPropertyRoot());
                    return true;
                }
            }

            @objid ("00873f8e-e548-108f-8d81-001ec947cd2a")
            @Override
            public Object visitPropertyType(PropertyType thePropertyType) {
                if (this.parent instanceof PropertyContainer) {
                    thePropertyType.setAnalystOwner((PropertyContainer) this.parent);
                    return true;
                } else {
                    thePropertyType.setAnalystOwner(this.reqProject.getPropertyRoot());
                    return true;
                }
            }

            @objid ("00875dfc-e548-108f-8d81-001ec947cd2a")
            @Override
            public Object visitPropertyDefinition(PropertyDefinition theProperty) {
                if (this.parent instanceof PropertyTableDefinition) {
                    theProperty.setOwner((PropertyTableDefinition) this.parent);
                    return true;
                }
                return false;
            }

        }

    }

    @objid ("0088a4c8-e548-108f-8d81-001ec947cd2a")
    private class AnalystFixerVisitor extends DefaultModelVisitor {
        @objid ("bb755a4c-4467-11e2-b513-002564c97630")
        private final ICoreSession localSession;

        @objid ("0088ac16-e548-108f-8d81-001ec947cd2a")
        private final DefaultReferenceDependencyUpdater referenceUpdater;

        @objid ("0088bbb6-e548-108f-8d81-001ec947cd2a")
        private SmObjectImpl refObject;

        @objid ("0088c228-e548-108f-8d81-001ec947cd2a")
        private SmObjectImpl localObject;

        @objid ("0088c7dc-e548-108f-8d81-001ec947cd2a")
        protected AnalystFixerVisitor(ICoreSession localSession) {
            this.localSession = localSession;
            this.referenceUpdater = new DefaultReferenceDependencyUpdater(
                    getBrokenDependencyHandler(), getObjectFinder(), this.localSession);
        }

        @objid ("0088d506-e548-108f-8d81-001ec947cd2a")
        @SuppressWarnings("hiding")
        protected void fixModel(final SmObjectImpl refObject, SmObjectImpl localObject) {
            this.refObject = refObject;
            this.localObject = localObject;
            
            // Do the post update according to the metaclass
            this.localObject.accept(this);
            
            this.refObject = null;
            this.localObject = null;
        }

        @objid ("0088f5d6-e548-108f-8d81-001ec947cd2a")
        @Override
        public Object visitPropertyTableDefinition(PropertyTableDefinition thePropertyTableDefinition) {
            visitModelElement(thePropertyTableDefinition);
            // A PropertyTableDefinition may be imported without its PropertyContainer.
            // It has then to be attached to its PropertyContainer.
            if (thePropertyTableDefinition.getOwner() == null) {
                this.referenceUpdater.execute(this.refObject,
                        (SmDependency) thePropertyTableDefinition.getMClass().getDependency("OwnerProperty"), this.localObject);
            }
            return null;
        }

        @objid ("00891e26-e548-108f-8d81-001ec947cd2a")
        @Override
        public Object visitPropertyType(PropertyType thePropertyType) {
            visitModelElement(thePropertyType);
            // A PropertyType may be imported without its PropertyContainer.
            // It has then to be attached to its PropertyContainer.
            if (thePropertyType.getAnalystOwner() == null) {
                this.referenceUpdater.execute(this.refObject,
                        (SmDependency) thePropertyType.getMClass().getDependency("OwnerProperty"), this.localObject);
            }
            return null;
        }

    }

}
