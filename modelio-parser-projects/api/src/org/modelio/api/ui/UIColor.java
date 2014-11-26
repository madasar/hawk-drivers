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
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

/**
 * The UIColor values are named upon a more or less formal set of rules.
 * Here is the rules summary:
 * - 'color-named' colors are named from the color they represent, for example BLACK, WHITE and so on
 * - 'functional-colors' are named from their intended context and usage
 * For 'functional-colors' the name has the form: XXX_YYY_ZZ where:
 * + XXX stands for the SWT widget or category of widget the color applies to.
 * + YYY stands for the functional context of the color
 * + ZZ is either BG for background, FG for foreground
 * Example:
 * TEXT_WRITABLE_BG  => background color of a writable SWT Text widget
 * TABLE_EVENROW_BG  => background color of the even rows of a table
 */
@objid ("976613ad-9135-11dd-bf4c-001ec947cd2a")
public interface UIColor {
    @objid ("dffc56d2-120f-11e2-b5c6-002564c97630")
    public static final Color BLACK = new Color(Display.getCurrent(), 0, 0, 0);

    @objid ("dffc56d4-120f-11e2-b5c6-002564c97630")
    public static final Color WHITE = new Color(Display.getCurrent(), 255, 255, 255);

    /**
     * KTable even/odd row colors
     */
    @objid ("dffc56d6-120f-11e2-b5c6-002564c97630")
    public static final Color TABLE_EVENROW_BG = new Color(Display.getCurrent(), 230, 240, 255);

    @objid ("dffc56d9-120f-11e2-b5c6-002564c97630")
    public static final Color TABLE_ODDROW_BG = new Color(Display.getCurrent(), 245, 255, 255);

    @objid ("dffc56db-120f-11e2-b5c6-002564c97630")
    public static final Color TABLE_HEADER_BG = new Color(Display.getCurrent(), 212, 208, 200);

    /**
     * Text Field colors
     */
    @objid ("dffc56dd-120f-11e2-b5c6-002564c97630")
    public static final Color TEXT_WRITABLE_BG = new Color(Display.getCurrent(), 255, 255, 255);

    @objid ("dffeb833-120f-11e2-b5c6-002564c97630")
    public static final Color TEXT_READONLY_BG = new Color(Display.getCurrent(), 232, 232, 232);

    /**
     * Editors highlighting colors
     */
    @objid ("dffeb835-120f-11e2-b5c6-002564c97630")
    public static final Color EDITOR_ROTEXT_FG = new Color(Display.getCurrent(), 0, 0, 0);

    @objid ("dffeb838-120f-11e2-b5c6-002564c97630")
    public static final Color EDITOR_RWTEXT_FG = new Color(Display.getCurrent(), 0, 0, 160);

    @objid ("dffeb83a-120f-11e2-b5c6-002564c97630")
    public static final Color EDITOR_KEYWORD_FG = new Color(Display.getCurrent(), 120, 0, 164);

    @objid ("dffeb83c-120f-11e2-b5c6-002564c97630")
    public static final Color EDITOR_MDDTAG_FG = new Color(Display.getCurrent(), 160, 160, 160);

    @objid ("dffeb83e-120f-11e2-b5c6-002564c97630")
    public static final Color EDITOR_COMMENT_FG = new Color(Display.getCurrent(), 0, 128, 0);

    /**
     * Label
     */
    @objid ("dffeb840-120f-11e2-b5c6-002564c97630")
    public static final Color LABEL_TIP_FG = new Color(Display.getCurrent(), 113, 111, 100);

    /**
     * Hyperlink color.
     */
    @objid ("dffeb843-120f-11e2-b5c6-002564c97630")
    public static final Color HYPERLINK_FG = new Color(Display.getCurrent(), 0, 0, 128);

    @objid ("e8e1d185-64c9-4809-8792-0da37518ee89")
    public static final Color POST_IT_BG = new Color(Display.getCurrent(), 255, 255, 210);

}
