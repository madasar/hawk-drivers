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

/**
 * The UIFont values are named upon a formal set of rules. Here is the rules summary.<br>
 * The name has the form: XXX_ZZ where:
 * <ul>
 * <li>XXX represents the font size among SMALL, NORMAL, LARGE, XLARGE</li>
 * <li>ZZ is either nothing, I, G or GI for standard, Italic, bold or bold italic font.</li>
 * </ul>
 * 
 * The font family is the system default font family. All sizes are relative to the system default font size, a
 * multiplier is applied to compute the actual font size.
 */
@objid ("913344c6-937f-11dd-b920-001ec947cd2a")
public interface UIFont {
    @objid ("007fa4ae-cbbc-1ecb-9c61-001ec947cd2a")
    public static final float SMALL_SIZE = 0.9f;

    @objid ("007f91d0-cbbc-1ecb-9c61-001ec947cd2a")
    public static final float LARGE_SIZE = 1.40f;

    @objid ("007f7678-cbbc-1ecb-9c61-001ec947cd2a")
    public static final float XLARGE_SIZE = 1.8f;

}
