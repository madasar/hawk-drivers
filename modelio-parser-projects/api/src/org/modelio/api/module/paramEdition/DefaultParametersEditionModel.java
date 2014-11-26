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

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.IModuleUserConfiguration;

@objid ("3714a3cb-8ecf-11dd-bbe0-001ec947ccaf")
public class DefaultParametersEditionModel extends ParametersEditionModel {
    @objid ("bdc79d8a-8f9f-11dd-bbe0-001ec947ccaf")
    public DefaultParametersEditionModel(IModule module) {
        super(module);
        
        String description = "";
        ParameterGroupModel group = new ParameterGroupModel("default", "Default");
        addGroup(group);
        IModuleUserConfiguration conf = module.getConfiguration();
        for (Map.Entry<String, String> entry : conf.getParameters().entrySet()) {
            //ObModule obmdac = (ObModule ) mdac.getModel();
            //ModuleParameterType ptype = obmdac.getParameters().get(0).getType();
            ParameterModel p;
            String paramName = entry.getKey();
            String val = conf.getParameterValue(paramName);
            if (val.equals("TRUE") || val.equals("FALSE")) {
                p = new BoolParameterModel(conf, paramName, paramName, description, conf.getParameterValue(paramName));
            } else if (paramName.equals("GenRoot")) {
                p = new DirectoryParameterModel(conf, paramName, paramName, description, conf.getParameterValue(paramName));
            } else if (paramName.equals("ExtEditorCommandLine")) {
                FileParameterModel f = new FileParameterModel(conf, paramName, paramName, description, conf.getParameterValue(paramName));
                //f.addAllowedExtension("*.exe", "Program file");
                p = f;
            } else {
                p = new StringParameterModel(conf, paramName, paramName, description, conf.getParameterValue(paramName));
            }
            group.addParameter(p);
        }
    }

}
