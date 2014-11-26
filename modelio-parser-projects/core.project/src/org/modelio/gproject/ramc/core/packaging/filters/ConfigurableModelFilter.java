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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.model.filter.IObjectFilter;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

/**
 * Configurable {@link IModelDepWalker model filter}.
 * <p>
 * Use methods of {@link IModelFilterConfigurer} to configure it.
 */
@objid ("5a22d9fa-9dc8-41bc-a245-109c6bcb88a6")
public class ConfigurableModelFilter implements IModelFilterConfigurer, IObjectFilter {
    @objid ("8f8bbe90-912f-4cd1-99e7-2615c409c7ed")
    private Map<MClass, IObjectFilter> classDescriptors;

    @objid ("871694ab-1b3f-4889-abb6-e0122ae97e3a")
    public ConfigurableModelFilter() {
        List<SmClass> allMetaclasses = SmClass.getRegisteredClasses();
        this.classDescriptors = new HashMap<>(allMetaclasses.size());
    }

    @objid ("b76fcf68-7f2f-45ba-97e1-c13cf3af24ce")
    @Override
    public boolean accept(MObject obj) {
        IObjectFilter filter = this.classDescriptors.get(obj.getMClass());
        if (filter == null)
            return true;
        else
            return filter.accept(obj);
    }

    @objid ("729f32df-60f0-4344-a0ed-dc6950d95076")
    @Override
    public void setFilter(final Class<? extends MObject> mmClass, final IObjectFilter objectFilter) {
        SmClass cls = SmClass.getClass(mmClass.getSimpleName());
        this.classDescriptors.put(cls, objectFilter);
        for (SmClass c : cls.getAllSubClasses()) {
            this.classDescriptors.put(c, objectFilter);
        }
    }

}
