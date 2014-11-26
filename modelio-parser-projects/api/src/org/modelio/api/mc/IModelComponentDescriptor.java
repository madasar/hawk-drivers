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
                                    

package org.modelio.api.mc;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This interface describes a ModelComponent: ie a name, a version and an
 * optional URL for its archive.
 * The returned archive may be null.
 */
@objid ("e6470c4c-d5cb-11de-884b-001ec947cd2a")
public interface IModelComponentDescriptor {
    /**
     * Get the name of the model component.
     * @return the name of the model component.
     */
    @objid ("318987b6-d5cc-11de-884b-001ec947cd2a")
    String getName();

    /**
     * Get the version of the model component.
     * @return the version of the model component.
     */
    @objid ("318987b8-d5cc-11de-884b-001ec947cd2a")
    String getVersion();

}
