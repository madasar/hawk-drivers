/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */  
                                    

package org.modelio.ui;

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
@objid ("c1ada416-5e66-11e2-a8be-00137282c51b")
public interface UIFont {
    @objid ("0904810f-5e67-11e2-a8be-00137282c51b")
    public static final float SMALL_SIZE = 0.9f;

    @objid ("0906e369-5e67-11e2-a8be-00137282c51b")
    public static final float LARGE_SIZE = 1.40f;

    @objid ("0906e36b-5e67-11e2-a8be-00137282c51b")
    public static final float XLARGE_SIZE = 1.8f;

}
