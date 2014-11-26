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
                                    

package org.modelio.metamodel.experts.meta;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * The MetaUtils expert tool can answer questions about dependencies between metaclass or elements.
 * <ol>
 * <li>is the model X <>-----dep-> Y possible?</li>
 * <li>get the default composition dependency between X and Y.</li>
 * <li>is the model X -------dep-> Y possible?</li>
 * <li>get possibles dependencies between X and Y.</li>
 * </ol>
 * where X, Y are either elements or metaclasses and dep a SmDependency name.
 */
@objid ("0040207c-d2e8-1097-bcec-001ec947cd2a")
public interface IMetaTool {
    /**
     * Tells whether the owner can own the given composed element using the given dependency name.
     * @param dependency
     * optional: The name of the dependency on the owner used to add the composed.
     * @param owner The owner node, must not be null.
     * @param composed The composed element, must not be null
     * @return true if the composed can be added, else false.
     */
    @objid ("0005b2fc-de02-1097-bcec-001ec947cd2a")
    boolean canCompose(MClass owner, MClass composed, String dep);

    /**
     * Tells whether the owner can own an instance of the given metaclass using the given dependency name.
     * @param dependency
     * optional: The name of the dependency on the owner used to add the composed.
     * @param owner The owner node, must not be null.
     * @param composed The metaclass of the composed element, must not be null
     * @return true if the composed can be added, else false.
     */
    @objid ("0005e24a-de02-1097-bcec-001ec947cd2a")
    boolean canCompose(MObject owner, MClass composed, String dep);

    /**
     * Tells whether the owner can own the given composed element using the given dependency name.
     * @param dependency
     * optional: The name of the dependency on the owner used to add the composed.
     * @param owner The owner node, must not be null.
     * @param composed The composed element, must not be null
     * @return true if the composed can be added, else false.
     */
    @objid ("000608ba-de02-1097-bcec-001ec947cd2a")
    boolean canCompose(MObject owner, MObject composed, String dep);

    @objid ("000629f8-de02-1097-bcec-001ec947cd2a")
    MDependency getDefaultCompositionDep(MObject owner, MObject composed);

    /**
     * Whether or not a dependency 'dep' can be established between the 'source' object and an instance of 'target' metaclass based
     * on their metaclass and stereotypes.
     * @param source
     * @param target
     * @param dep @return
     */
    @objid ("0006519e-de02-1097-bcec-001ec947cd2a")
    boolean canDep(MObject source, MClass target, String dep);

    /**
     * Whether or not a dependency 'dep' exists between 'source' and 'target' metaclass.
     * @param source
     * @param target
     * @param dep @return
     */
    @objid ("000673e0-de02-1097-bcec-001ec947cd2a")
    boolean canDep(MClass source, MClass target, String dep);

    /**
     * Whether or not a dependency 'dep' can be established between the 'source' and 'target' objects based on their metaclass and
     * stereotypes.
     * @param source
     * @param target
     * @param dep @return
     */
    @objid ("00069d48-de02-1097-bcec-001ec947cd2a")
    boolean canDep(MObject source, MObject target, String dep);

    /**
     * Get the lists of all possible dependencies between the 'source' and 'target' objects.
     * @param source
     * @param target @return
     */
    @objid ("0006c070-de02-1097-bcec-001ec947cd2a")
    List<MDependency> getDeps(MObject source, MObject target);

    /**
     * Register a stereotyped element creation expert.
     * @param ste The stereotype
     * @param expert The creation expert.
     */
    @objid ("f80a32d3-16ca-40e4-918d-3415f4f4f7e6")
    void registerExpert(final Stereotype ste, final IMetaExpert expert);

    /**
     * Remove the creation expert registered for the given stereotype.
     * @param ste The stereotype to forget.
     */
    @objid ("9bae9b7e-2dba-44f0-9544-dc2c726c7c4d")
    void unregisterExpert(final Stereotype ste);

    @objid ("db51e3a7-20a4-4cb3-8c07-ad85ffacba95")
    MDependency getCompositionDepVisitorByMClass(MObject owner, MClass composed);

}
