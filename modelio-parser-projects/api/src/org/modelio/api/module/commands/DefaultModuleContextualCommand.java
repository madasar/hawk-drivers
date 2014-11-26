/*
 * Copyright 2013 Modeliosoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */  
                                    

package org.modelio.api.module.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Default implementation of the {@link IModuleContextualCommand} interface.
 * <p><p>
 * This default implementation may be inherited by the module developers in order to
 * simplify the code writing of a contextual command.
 * <p><p>
 */
@objid ("00d00158-0001-5e0d-0000-000000000000")
public class DefaultModuleContextualCommand implements IModuleContextualCommand {
    /**
     * Nothing is done, by default when the command is launched.
     */
    @objid ("00d012e4-0000-58fe-0000-000000000000")
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        // Do nothing
    }

    /**
     * The command accepts by default the selected elements.
     */
    @objid ("00d012e4-0000-5905-0000-000000000000")
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        return true;
    }

    /**
     * The command is active by default.
     */
    @objid ("00d012e4-0000-590e-0000-000000000000")
    @Override
    public boolean isActiveFor(List<MObject> selectedElements, IModule module) {
        return true;
    }

}
