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
import org.eclipse.swt.graphics.Image;
import org.modelio.api.model.IModelingSession;
import org.modelio.api.module.propertiesPage.IModulePropertyPage;

@objid ("9eb8d634-6c12-11e0-b589-002564c97630")
public interface IModulePropertyView {
    @objid ("9c25cbaf-6c19-11e0-b589-002564c97630")
    public static final String VIEW_ID = "com.modeliosoft.modelio.edition.ModulePropertyViewID";

    @objid ("9c25f2c0-6c19-11e0-b589-002564c97630")
    void start(final IModelingSession modelingSession, final IModulePropertyPage propertyPage);

    @objid ("9c2619d0-6c19-11e0-b589-002564c97630")
    void setPartName(final String label);

    @objid ("9c2619d2-6c19-11e0-b589-002564c97630")
    void setPartImage(final Image bitmap);

    @objid ("9c2619d4-6c19-11e0-b589-002564c97630")
    void setInput(final IModulePropertyModel propertyTable);

    @objid ("9c2640e0-6c19-11e0-b589-002564c97630")
    void stop();

}
