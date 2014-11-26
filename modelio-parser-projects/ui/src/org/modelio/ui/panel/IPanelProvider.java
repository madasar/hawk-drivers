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
                                    

package org.modelio.ui.panel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;

/**
 * Basic interface for reusable panels.
 */
@objid ("beb37bdb-c677-11e1-8f21-002564c97630")
public interface IPanelProvider {
    /**
     * Instantiate the panel graphical elements.
     * @param parent the composite to create the new graphical elements into.
     * @return the created panel.
     */
    @objid ("a0ad69d2-c677-11e1-8f21-002564c97630")
    Object create(Composite parent);

    /**
     * Get the panel graphical elements, usually a {@link Composite} or a {@link Viewer}.
     * @return the created panel. <code>null</code> until IPanelProvided#create is called.
     */
    @objid ("a0ad69d6-c677-11e1-8f21-002564c97630")
    Object getComposite();

    /**
     * Set a new input for the panel.
     * @param input the new input for the panel.
     */
    @objid ("a0ad69d9-c677-11e1-8f21-002564c97630")
    void setInput(Object input);

    /**
     * Get the current input of the panel.
     * @return the panel's input.
     */
    @objid ("a0ad69dc-c677-11e1-8f21-002564c97630")
    Object getInput();

}
