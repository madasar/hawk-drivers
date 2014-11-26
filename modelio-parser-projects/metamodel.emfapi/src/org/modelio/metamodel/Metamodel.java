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
                                    

package org.modelio.metamodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0076c802-8ce5-103f-94f0-001ec947cd2a")
public class Metamodel {
    @objid ("348a33ed-da4d-44e4-9143-738602f2ac4d")
    public static String VERSION = "9022";

    @objid ("0007d294-8657-1075-a24c-001ec947cd2a")
    public static MClass getMClass(String name) {
        return SmClass.getClass(name);
    }

    @objid ("0007fbf2-8657-1075-a24c-001ec947cd2a")
    public static MClass getMClass(Class<? extends MObject> javaInterface) {
        return SmClass.getClass(javaInterface);
    }

    @objid ("006418ec-8710-1075-a24c-001ec947cd2a")
    public static Class<? extends MObject> getJavaInterface(MClass mClass) {
        return ((SmClass) mClass).getJavaInterface();
    }

}
