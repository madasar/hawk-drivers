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
                                    

package org.modelio.api.module.paramEdition;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModuleUserConfiguration;

@objid ("05ae8715-8fa2-11dd-bbe0-001ec947ccaf")
public class StringParameterModel extends ParameterModel {
    @objid ("e47ebfa8-feb1-11dd-8b31-0014222a9f79")
    public StringParameterModel(IModuleUserConfiguration conf, String name, String label, String description, String defaultValue) {
        super(conf, name, label, description, defaultValue);
    }

}
