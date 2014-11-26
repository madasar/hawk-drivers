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

@objid ("01f41464-0000-0192-0000-000000000000")
public interface IModulePropertyModel {
    @objid ("01f41464-0000-0196-0000-000000000000")
    int getColumnNumber();

    @objid ("01f41464-0000-0198-0000-000000000000")
    int getRowsNumber();

    @objid ("01f41464-0000-019a-0000-000000000000")
    Object getValueAt(int row, int col);

    @objid ("01f41464-0000-019e-0000-000000000000")
    void setValueAt(int row, int col, Object value);

    @objid ("01f41464-0000-01a2-0000-000000000000")
    String[] getItemsAt(int row, int col);

    @objid ("01f414c4-0000-0499-0000-000000000000")
    Class<?> getTypeAt(int row, int col);

    @objid ("01f41bf4-0000-031c-0000-000000000000")
    boolean isEditable(int row, int col);

}
