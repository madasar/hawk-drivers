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
                                    

package org.modelio.api.module;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This enumeration lists all possible states of a Module.
 */
@objid ("342a1e0b-b57b-11dd-9c93-0014222a9f79")
public enum ModuleState {
    /**
     * Module is installed but should not be started at project opening. Persistent state, (should be) written in ofpx.
     */
    Desactivated,
    /**
     * Module is installed and should be started at project opening. Persistent state, (should be) written in ofpx.
     * Formerly known as the "Selected" state.
     */
    Activated;
}
