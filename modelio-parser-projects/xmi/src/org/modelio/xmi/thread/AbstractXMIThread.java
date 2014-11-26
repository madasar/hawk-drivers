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
                                    

package org.modelio.xmi.thread;

import org.eclipse.swt.widgets.Shell;
//import org.modelio.xmi.gui.AbstractSwtWizardWindow;
import org.modelio.xmi.reverse.ReverseProperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * XMI thread.
 * This abstract class define the common structure of four XMI threads
 * @author ebrosse
 */
@objid ("bfc34f29-aa2b-4899-b8ea-3a5899866152")
public abstract class AbstractXMIThread extends Thread {
    @objid ("a3d6d214-caae-4acd-8898-51831b4659e9")
    private String description = "";

    @objid ("45852736-eeb7-487d-8c67-e6cb8a06137a")
    private String title = "";

    @objid ("4be4c64b-ff85-4b58-83e1-3e73a85264ea")
    protected boolean error = false;


    @objid ("eb65aae0-b813-4b8e-a02e-3c9843e2a3a8")
    protected Shell shell = null;

    @objid ("186ffe60-a599-4c62-993b-46a1e97cf37a")
    protected void cancelation() {
       // AbstractSwtWizardWindow.setCancellation(false);
    }

    @objid ("60b9296c-df8c-4c0f-8ec7-d3d55b66ee13")
    @Override
    public void interrupt() {
        super.interrupt();
        ReverseProperties.getInstance().setRollback(true);
    }

}
