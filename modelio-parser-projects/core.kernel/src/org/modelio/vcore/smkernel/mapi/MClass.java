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
                                    

package org.modelio.vcore.smkernel.mapi;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This interface defines the services available to programmers outside 'vcore' for handling SmClass instances.
 * <p>
 * The MClass services are obviously a subset of those provided by SmClass.
 * This is because external programmers are not expected to
 * modify the metamodel and therefore only limited 'get-like' accessors are provided.
 * 
 * @author phv
 */
@objid ("00433ca8-2596-1ffc-8433-001ec947cd2a")
public interface MClass {
    /**
     * @return the metaclass name.
     */
    @objid ("0090268a-2ef5-1ffc-8433-001ec947cd2a")
    String getName();

    /**
     * Get the attribute with the given name.
     * @param name an attribute name.
     * @return the found attribute or <code>null</code>.
     */
    @objid ("00903b16-2ef5-1ffc-8433-001ec947cd2a")
    MAttribute getAttribute(String name);

    /**
     * Get the metamodel dependency with the given name.
     * @param name a metamodel dependency name.
     * @return the found metamodel dependency or <code>null</code>.
     */
    @objid ("00904e8a-2ef5-1ffc-8433-001ec947cd2a")
    MDependency getDependency(String name);

    /**
     * Get all defined metamodel dependencies
     * @param includeInherited <code>true</code> to include inherited metamodel dependency.
     * @return metamodel dependencies.
     */
    @objid ("00905b0a-2ef5-1ffc-8433-001ec947cd2a")
    List<MDependency> getDependencies(boolean includeInherited);

    /**
     * Get the class attributes.
     * @param includeInherited <code>true</code> to include inherited attributes.
     * @return the defined attributes.
     */
    @objid ("0090bee2-2ef5-1ffc-8433-001ec947cd2a")
    List<MAttribute> getAttributes(boolean includeInherited);

    /**
     * Get the parent metamodel class.
     * @return the parent class.
     */
    @objid ("0090d86e-2ef5-1ffc-8433-001ec947cd2a")
    MClass getSuper();

    /**
     * Get the sub classes.
     * @param recursive <code>true</code> to include all sub classe recursively.
     * @return the sub classes.
     */
    @objid ("0090e0fc-2ef5-1ffc-8433-001ec947cd2a")
    List<MClass> getSub(boolean recursive);

    /**
     * @return <code>true</code> if the class is abstract.
     */
    @objid ("d54ee427-137e-11e2-816a-001ec947ccaf")
    boolean isAbstract();

    /**
     * Tells whether this metamodel class is a CMS node.
     * <p>
     * CMS nodes define a structuring unit for some storages implementations.
     * For EXML repositories, a CMS node represents an EXML file.
     * @return <code>true</code> if the class is a CMS node.
     */
    @objid ("d54ee428-137e-11e2-816a-001ec947ccaf")
    boolean isCmsNode();

    /**
     * Check that <code>this</code> metaclass is a sub-metaclass of <code>parent</code> metaclass.
     * @param parent a metamodel class
     * @return <code>true</code> if <code>this</code> class inherits from the given class. <code>false</code> otherwise.
     */
    @objid ("497adf3c-9db8-4e20-8fc9-4f8ee2846981")
    boolean hasBase(MClass parent);

}
