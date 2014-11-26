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
                                    

package org.modelio.gproject.module;

import java.util.Comparator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.module.ModuleId;

/**
 * Sort modules so that required modules are before requiring ones.
 * <p>
 * Use this comparator when you need to deploy a bunch modules in the right order.
 * </p>
 * Note: this comparator imposes orderings that are inconsistent with equals.
 * @deprecated Does not work transitively. Fixing it would not be efficient.<br>
 * Use {@link ModuleSorter} to do a topological sort instead.
 * <p>
 * This class is to be deleted as soon as possible.
 * @todelete This class is to be deleted as soon as possible.
 */
@objid ("55d2debc-ba71-4264-9c70-676ced6cb301")
@Deprecated
public class ModuleHandleComparator implements Comparator<IModuleHandle> {
    @objid ("7dd109db-bf49-4081-8f10-607269c7d6cd")
    @Override
    public int compare(IModuleHandle module1, IModuleHandle module2) {
        if (dependsOn(module1, module2)) {
            return -1;
        } else if (dependsOn(module2, module1)) {
            return 1;
        } else {
            return module1.getName().compareTo(module2.getName());
        }
    }

    @objid ("b2fc43da-1cc4-4744-bf9f-b8c42bbbcd0b")
    private boolean dependsOn(IModuleHandle module1, IModuleHandle module2) {
        for (ModuleId requiredRef : module2.getDependencies()) {
            if (module1 != null && module1.getName().equals(requiredRef.getName()) && !module1.getVersion().isOlderThan(requiredRef.getVersion())) {
                return true;
            }
        }
        
        for (ModuleId weakRef : module2.getWeakDependencies()) {
            if (module1 != null && module1.getName().equals(weakRef.getName()) && !module1.getVersion().isOlderThan(weakRef.getVersion())) {
                return true;
            }
        }
        return false;
    }

}
