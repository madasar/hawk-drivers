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
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.model.importer.core.BrokenDepReport;
import org.modelio.gproject.model.importer.core.IBrokenDependencyHandler;
import org.modelio.gproject.model.importer.core.IDependencyUpdater;
import org.modelio.gproject.model.importer.core.IImportFilter;
import org.modelio.gproject.model.importer.core.IObjectFinder;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00811d2a-d3aa-108f-8d81-001ec947cd2a")
public class DefaultCompositionDependencyUpdater implements IDependencyUpdater {
    @objid ("bb886551-4467-11e2-b513-002564c97630")
    private final ICoreSession localSession;

    @objid ("009231b4-e7d6-1090-8d81-001ec947cd2a")
    private final IBrokenDependencyHandler brokenDependencyHandler;

    @objid ("00924442-e7d6-1090-8d81-001ec947cd2a")
    private final IObjectFinder objectFinder;

    @objid ("009266de-e7d6-1090-8d81-001ec947cd2a")
    private final IImportFilter importFilter;

    @objid ("00818828-d3aa-108f-8d81-001ec947cd2a")
    private static boolean setEqual(final List<?> a, final List<?> b, boolean ordered) {
        if (a.size() != b.size()) {
            return false;
        }
        
        if (!ordered) {
            // Ordering does not matter
            for (Object object : a) {
                if (!b.contains(object)) {
                    return false;
                }
            }
        } else {
            // Ordering DOES matter
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    @objid ("0081dc4c-d3aa-108f-8d81-001ec947cd2a")
    @Override
    public List<SmObjectImpl> execute(final SmObjectImpl refObject, SmDependency smDep, SmObjectImpl localObject) {
        // Get the dep values in the reference model
        List<MObject> refValues = refObject.mGet(smDep);
        
        // Find the equivalent values in the local model
        List<SmObjectImpl> equivalentLocalValues = getEquivalentLocalValues(refValues);
        
        // If some values could not be found locally, the dependency will be 'broken' after the import and will require some
        // repairing...
        if (equivalentLocalValues.size() != refValues.size()) {
            // Publish the broken dep values
            fireBrokenDepValues(refObject, refValues, smDep, localObject, equivalentLocalValues);
        }
        
        // Update the local dep values according to the reference values
        
        // Do the update according to the dependency : there are some special cases
        if (smDep == SmClass.getClass(ModelTree.class).getDependency("OwnedElement")) {
            return updateModelTreeOwnedElementModelTree(localObject, smDep, equivalentLocalValues, refValues);
        } else {
            return updateDependency(localObject, smDep, equivalentLocalValues, refValues);
        }
    }

    @objid ("00821400-d3aa-108f-8d81-001ec947cd2a")
    protected List<SmObjectImpl> updateDependency(SmObjectImpl localObject, SmDependency smDep, List<SmObjectImpl> equivalentLocalValues, List<MObject> refValues) {
        List<SmObjectImpl> toGarbage = new ArrayList<>();
        
        // Optimization: update values only if old and new dependency values are really different
        // without this optimization, all the current local values of the dep would be first marked for garbage and later
        // re-attached, wasting a lot of processing.
        // The comparison takes care of the ordering if needed.
        List<MObject> localValues = localObject.mGet(smDep);
        if (!setEqual(refValues, localValues, smDep.isOrdered())) {
            // Clean old content
            for (MObject obj : localValues) {
                toGarbage.add((SmObjectImpl) obj);
            }
        
            // Clear all values
            localValues.clear();
        
            // Replace by values from the reference model
            for (SmObjectImpl obj : equivalentLocalValues) {
                localObject.appendDepVal(smDep, obj);
            }
        }
        return toGarbage;
    }

    @objid ("00822756-d3aa-108f-8d81-001ec947cd2a")
    protected List<SmObjectImpl> getEquivalentLocalValues(List<MObject> refValues) {
        List<SmObjectImpl> equivalentLocalValues = new ArrayList<>();
        
        // Get new dependencies values and find them in the destination model
        for (MObject refDepVal : refValues) {
            if (refDepVal != null) {
                SmObjectImpl sameObj = this.objectFinder.getSameObject(this.localSession.getModel(), (SmObjectImpl) refDepVal);
                if (sameObj != null && !sameObj.isDeleted()) {
                    equivalentLocalValues.add(sameObj);
                }
            } else {
                //String msg;
                // FIXME message
                // msg.pformat(RC2::getRC("import.properties").getString("Error_Null_element_in_dependency").c_str(),
                // src.ClassOf.Name.c_str(),
                // src.name().c_str(),
                // dep.get_Name().c_str(),
                // src.get_StrSiteIdentifier().c_str());
                //
                // OLog::error(msg.c_str());
                // throw SmError(msg, SmError::Error, src);
                throw new RuntimeException("Error_Null_element_in_dependency");
            }
        }
        return equivalentLocalValues;
    }

    @objid ("00823b1a-d3aa-108f-8d81-001ec947cd2a")
    protected List<SmObjectImpl> updateModelTreeOwnedElementModelTree(SmObjectImpl localObject, SmDependency smDep, List<SmObjectImpl> equivalentLocalValues, List<MObject> refValues) {
        if (!setEqual(refValues, localObject.mGet(smDep), smDep.isOrdered())) {
            // We need to keeps ramcs
            for (MObject obj : localObject.mGet(smDep)) {
                if (!this.importFilter.select((SmObjectImpl) obj) && !equivalentLocalValues.contains(obj)) {
                    // Put the ramc in the new list
                    equivalentLocalValues.add((SmObjectImpl) obj);
                }
            }
        
            return updateDependency(localObject, smDep, equivalentLocalValues, refValues);
        }
        return Collections.emptyList();
    }

    @objid ("00927778-e7d6-1090-8d81-001ec947cd2a")
    public DefaultCompositionDependencyUpdater(IBrokenDependencyHandler brokenDependencyHandler, IObjectFinder objectFinder, ICoreSession localSession, IImportFilter importFilter) {
        super();
        this.brokenDependencyHandler = brokenDependencyHandler;
        this.objectFinder = objectFinder;
        this.localSession = localSession;
        this.importFilter = importFilter;
    }

    @objid ("009333d4-e7d6-1090-8d81-001ec947cd2a")
    private void fireBrokenDepValues(SmObjectImpl refObject, List<MObject> refValues, SmDependency smDep, SmObjectImpl localObject, List<SmObjectImpl> equivalentLocalValues) {
        for (MObject refVal : refValues) {
            if (!equivalentLocalValues.contains(refVal)) {
                this.brokenDependencyHandler.handleBrokenDep(new BrokenDepReport(refObject, localObject, smDep,
                        (SmObjectImpl) refVal));
        
            }
        }
    }

}
