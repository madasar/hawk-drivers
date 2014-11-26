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

import java.io.IOException;
import java.nio.file.Path;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.progress.IModelioProgress;

@objid ("973e6347-d967-4daf-b162-07a18cc15ce4")
public interface IModuleCache {
    @objid ("6b19741b-7eb2-4669-afe5-2c520e408573")
    IModuleHandle getModuleHandle(Path moduleFile, IModelioProgress monitor) throws IOException;

    @objid ("ef0eb7a3-f3b0-4288-8e7c-add9441a19d3")
    IModuleHandle getModuleHandle(GModule gModule, IModelioProgress monitor) throws IOException;

}
