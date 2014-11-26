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

@objid ("00d00158-0001-9f38-0000-000000000000")
public class UnknownModuleException extends RuntimeException {
    @objid ("00d00158-0001-a574-0000-000000000000")
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new exception with the specified detail message.
     * @param message the detail message.
     */
    @objid ("00d00158-0001-a578-0000-000000000000")
    public UnknownModuleException(String message) {
        super(message);
    }

}
