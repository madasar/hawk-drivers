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
                                    

package org.modelio.vcore.smkernel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.ecore.resource.Resource;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;

/**
 * Repository object interface.
 * <p>
 * Called by the meta object ({@link IMetaOf}) to load parts of a {@link SmObjectImpl} when required.<br>
 * Notified for each {@link SmObjectImpl} modification.
 */
@objid ("00766e16-10dd-1f20-85a5-001ec947cd2a")
public interface IRepositoryObject {
    @objid ("007666be-10dd-1f20-85a5-001ec947cd2a")
    void attModified(SmObjectImpl obj, SmAttribute att);

    @objid ("00766768-10dd-1f20-85a5-001ec947cd2a")
    void depValAppended(SmObjectImpl obj, SmDependency dep, SmObjectImpl val);

    @objid ("00766812-10dd-1f20-85a5-001ec947cd2a")
    void depValErased(SmObjectImpl obj, SmDependency dep, SmObjectImpl val);

    /**
     * Called when the dependency content of a model object is reordered.
     * @param obj the modified model object.
     * @param dep the reordered dependency.
     * @param val the moved dependency value.
     */
    @objid ("007668bc-10dd-1f20-85a5-001ec947cd2a")
    void depValMoved(SmObjectImpl obj, SmDependency dep, SmObjectImpl val);

    /**
     * @param obj the object to load.
     * @param dep the dependency to test.
     * @return <code>true</code> if the dependency value is already loaded, else <code>false</code>.
     */
    @objid ("00766966-10dd-1f20-85a5-001ec947cd2a")
    boolean isDepLoaded(SmObjectImpl obj, SmDependency dep);

    /**
     * Tells whether the given SmDependency is stored in the database.
     * 
     * The answer should be the same for any element in the database, but it is not required.
     * @param dep a metamodel dependency.
     * @return <code>true</code> if stored, else <code>false</code>.
     */
    @objid ("00766a06-10dd-1f20-85a5-001ec947cd2a")
    boolean isPersistent(SmDependency dep);

    /**
     * @param obj the object to load.
     * @param att the attribute to test.
     * @return <code>true</code> if the attribute value is already loaded, else <code>false</code>.
     */
    @objid ("00766ab0-10dd-1f20-85a5-001ec947cd2a")
    boolean isAttLoaded(SmObjectImpl obj, SmAttribute att);

    /**
     * Load an object dependency content if not already done.
     * <p>
     * Should do nothing if the dependency is already loaded.
     * @param obj the object to load.
     * @param dep the dependency to load.
     */
    @objid ("00766b5a-10dd-1f20-85a5-001ec947cd2a")
    void loadDep(SmObjectImpl obj, SmDependency dep);

    /**
     * Load the attribute value if not already done.
     * @param obj the object to load.
     * @param att the attribute to load.
     */
    @objid ("00766c04-10dd-1f20-85a5-001ec947cd2a")
    void loadAtt(SmObjectImpl obj, SmAttribute att);

    /**
     * The repository id is attributed by the {@link IRepository}.
     * @return the repository id.
     */
    @objid ("008478bc-eb1b-1f22-8c06-001ec947cd2a")
    byte getRepositoryId();

    /**
     * Get the EMF Resource object mapping this repository object.
     * @return the EMF Resource.
     */
    @objid ("17bcf492-c064-11e1-b511-001ec947ccaf")
    Resource getEmfResource();

    @objid ("00273512-3ddf-1ffc-8433-001ec947cd2a")
    void detach(SmObjectImpl obj);

    @objid ("002746ce-3ddf-1ffc-8433-001ec947cd2a")
    void attach(SmObjectImpl obj);

    @objid ("c66aaf03-0884-11e2-b33c-001ec947ccaf")
    void unload(SmObjectImpl obj);

    @objid ("dc274961-4868-11e2-91c9-001ec947ccaf")
    boolean isDirty(SmObjectImpl obj);

}
