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

import java.net.URL;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;

@objid ("23eee14b-ae7f-4a4a-9f41-ad4f3c57462c")
public class UIImages {
    /**
     * Generic 16x16 icon used to indicate an "Add" action. The dialog/button
     * context must be relevant enough for the user to guess what will be added...
     */
    @objid ("84e3fe19-d1bf-4128-9f1d-221991bdbd00")
    public static final Image ADD = getImage("icons/add.png");

    /**
     * A generic 16x16 icon used to indicate that a field supports assistance.
     */
    @objid ("063fdca1-f977-47c5-8a4f-f81ec4551209")
    public static final Image ASSIST = getImage("icons/assist.png");

    /**
     * Generic 16x16 icon used to indicate that on operation (create/add/edit)
     * will occur in a separated dialog a "Delete" or "Remove" action. The
     * dialog/button context must be relevant enough for the user to guess what will happen
     * ...
     */
    @objid ("106f7014-b0c9-4fb1-ae76-1302bc9b4425")
    public static final Image CHOOSER = getImage("icons/chooser.png");

    /**
     * Generic 16x16 icon used to indicate a "Delete" or "Remove" action. The
     * dialog/button context must be relevant enough for the user to guess what will be
     * deleted/removed...
     */
    @objid ("a08c2664-5006-4e53-9788-d255cfa5e3a1")
    public static final Image DELETE = getImage("icons/delete.png");

    /**
     * Generic 16x16 icon used to indicate a "down" move or slide operation
     */
    @objid ("0bebf1f2-1daa-47be-adf7-7796e8a7c438")
    public static final Image DOWNARROW = getImage("icons/downarrow.png");

    /**
     * A generic 16x16 icon used to indicate that a field supports D&D.
     */
    @objid ("2d937a1b-0dcd-4960-a6ee-44025a1d301d")
    public static final Image DROPAREA = getImage("icons/droparea.png");

    /**
     * Generic 16x16 icon used to indicate a "filechooser" action
     */
    @objid ("2f65d120-fe97-46f1-90a0-fb93e8388b88")
    public static final Image FILECHOOSE = getImage("icons/filechooser.png");

    /**
     * A generic 16x16 icon used for help buttons.
     */
    @objid ("14760218-1341-41f2-a359-5b2ea634c8e8")
    public static final Image HELP = getImage("icons/help.png");

    /**
     * A generic icon used to indicate that a field supports picking service.
     */
    @objid ("5d01c8b9-bb60-492f-917c-884acd9e813c")
    public static final Image INDICATOR = getImage("icons/indicator.png");

    /**
     * Generic 16x16 icon used to indicate a "left" move or slide operation
     */
    @objid ("6e3809ac-076b-47a9-810d-e5f3a85e88d0")
    public static final Image LEFTARROW = getImage("icons/leftarrow.png");

    /**
     * Generic 16x16 icon used to indicate a "maximize" operation
     */
    @objid ("54a1787f-0a69-4771-bdfa-72add238cf3e")
    public static final Image MAXIMIZE = getImage("icons/maximize.png");

    /**
     * Generic 16x16 icon used to indicate a "minimize" operation
     */
    @objid ("e662963b-d120-4310-b770-c9c179cb5cf8")
    public static final Image MINIMIZE = getImage("icons/minimize.png");

    /**
     * Generic 16x16 icon used to indicate a "right" move or slide operation
     */
    @objid ("7763ff32-b15e-4474-b5fa-0ff5bd434299")
    public static final Image RIGHTARROW = getImage("icons/rightarrow.png");

    /**
     * Generic 16x16 icon used to indicate a "up" move or slide operation
     */
    @objid ("4226554d-75f7-47e4-89d6-fabb77fd9670")
    public static final Image UPARROW = getImage("icons/uparrow.png");

    /**
     * Generic 16x16 icon used to indicate an element without icon.
     */
    @objid ("2cc2790d-b3f7-4870-9e95-1ef7d692ac43")
    public static final Image DOT = getImage("icons/dot.png");

    @objid ("165b4af5-07f9-4a23-93e2-c53c9917a9ee")
    private static Image getImage(String relativePath) {
        Bundle bundle = Platform.getBundle("org.modelio.ui");
        URL url = bundle.getEntry(relativePath);
        ImageDescriptor desc = ImageDescriptor.createFromURL(url);
        Image image = desc.createImage();
        return image;
    }

    @objid ("e507fdf4-3f36-4f39-8351-82a02b963917")
    private UIImages() {
    }

}
