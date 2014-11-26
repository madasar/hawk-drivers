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
                                    

package org.modelio.api.ui;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

@objid ("7c12d53f-704b-11dd-933a-001ec947cd2a")
public interface IModelioDialog {
    @objid ("7c12d530-704b-11dd-933a-001ec947cd2a")
    void init();

    @objid ("bbf20faa-120f-11e2-b5c6-002564c97630")
    Control createContentArea(Composite parent);

    @objid ("bbf20fad-120f-11e2-b5c6-002564c97630")
    void addButtonsInButtonBar(Composite parent);

}
