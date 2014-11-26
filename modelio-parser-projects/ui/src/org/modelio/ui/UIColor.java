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
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

/**
 * The UIColor values are named upon a more or less formal set of rules.
 * <p>
 * Here is the rules summary:
 * <ul>
 * <li>'color-named' colors are named from the color they represent, for example BLACK, WHITE and so on
 * <li>'functional-colors' are named from their intended context and usage
 * </ul>
 * For 'functional-colors' the name has the form: XXX_YYY_ZZ where:
 * <ul>
 * <li>XXX stands for the SWT widget or category of widget the color applies to.
 * <li>YYY stands for the functional context of the color
 * <li>ZZ is either BG for background, FG for foreground
 * </ul>
 * Example:
 * <ul>
 * <li>TEXT_WRITABLE_BG => background color of a writable SWT Text widget
 * <li>TABLE_EVENROW_BG => background color of the even rows of a table
 * </ul>
 */
@objid ("8d550e35-c068-11e1-8c0a-002564c97630")
public interface UIColor {
    @objid ("2e35436e-6f5a-460a-9df1-fe4842fcb1e8")
    public static final Color BLACK = new Color(Display.getCurrent(), 0, 0, 0);

    @objid ("5de595a3-f382-4a17-aae6-39bdc39cb822")
    public static final Color WHITE = new Color(Display.getCurrent(), 255, 255, 255);

    @objid ("538ae918-32e9-4ea7-af41-f2499091f8eb")
    public static final Color RED = new Color(Display.getCurrent(), 255, 0, 0);

    /**
     * KTable even/odd row colors
     */
    @objid ("5b2dbf7e-3a56-44f3-9b1f-18ea5a439ef7")
    public static final Color TABLE_EVENROW_BG = new Color(Display.getCurrent(), 230, 240, 255);

    @objid ("437f9b75-ad58-40f6-a707-0e1ac8bbc4a6")
    public static final Color TABLE_ODDROW_BG = new Color(Display.getCurrent(), 245, 255, 255);

    @objid ("49f5619d-a70a-4f3c-a3df-2faa1b846f4d")
    public static final Color TABLE_HEADER_BG = new Color(Display.getCurrent(), 212, 208, 200);

    /**
     * Text Field colors
     */
    @objid ("357a9357-bbad-442b-a301-ebe0e5eb7a7b")
    public static final Color TEXT_WRITABLE_BG = new Color(Display.getCurrent(), 255, 255, 255);

    @objid ("bc506949-94e5-4fdc-9fa6-841665df3a81")
    public static final Color TEXT_READONLY_BG = new Color(Display.getCurrent(), 232, 232, 232);

    /**
     * Editors highlighting colors
     */
    @objid ("123d2e37-2c63-4cc4-af7a-cf85f4789f8b")
    public static final Color EDITOR_ROTEXT_FG = new Color(Display.getCurrent(), 0, 0, 0);

    @objid ("bf6db22f-205f-499b-ad05-89a5259f835a")
    public static final Color EDITOR_RWTEXT_FG = new Color(Display.getCurrent(), 0, 0, 160);

    @objid ("c2ff6735-b87f-49fc-a07e-7b636174b03c")
    public static final Color EDITOR_KEYWORD_FG = new Color(Display.getCurrent(), 120, 0, 164);

    @objid ("ace73310-bf48-4487-82c1-4e74bdc91b12")
    public static final Color EDITOR_MDDTAG_FG = new Color(Display.getCurrent(), 160, 160, 160);

    @objid ("df4da4c9-a066-4ec9-bf54-73893e08d57c")
    public static final Color EDITOR_COMMENT_FG = new Color(Display.getCurrent(), 0, 128, 0);

    /**
     * Label
     */
    @objid ("97613193-2647-4278-a53a-64c35b101ce0")
    public static final Color LABEL_TIP_FG = new Color(Display.getCurrent(), 113, 111, 100);

    /**
     * Hyperlink color.
     */
    @objid ("23a9519e-77b8-4067-931f-572b5492edca")
    public static final Color HYPERLINK_FG = new Color(Display.getCurrent(), 0, 0, 128);

    /**
     * Ramc model elements font color is modified yellow #3d5c99
     */
    @objid ("af49841f-c6f2-49b5-aefb-af920d759944")
    public static final Color RAMC_ELEMENT = new Color(Display.getCurrent(), 61, 92, 153);

    /**
     * Incomplete model elements font color is light red #FF8080.
     */
    @objid ("1adf4f60-46cf-48e2-9290-2a20366bec58")
    public static final Color SHELL_ELEMENT = new Color(Display.getCurrent(), 255, 128, 128);

    /**
     * Modifiable model elements font color is black #000000.
     */
    @objid ("69673c9c-df55-46cb-b4e4-ac9e45efe51b")
    public static final Color MODIFIABLE_ELEMENT = BLACK;

    /**
     * Non-modifiable model component elements font color is dark grey #606060.
     */
    @objid ("98a4dbca-8ddc-48d2-9462-0fb2fce0636a")
    public static final Color NONMODIFIABLE_ELEMENT = new Color(Display.getCurrent(), 96, 96, 96);

    @objid ("5f82ae00-4565-49fc-a29f-6a7711107df9")
    public static final Color POST_IT_BG = new Color(Display.getCurrent(), 255, 255, 210);

}
