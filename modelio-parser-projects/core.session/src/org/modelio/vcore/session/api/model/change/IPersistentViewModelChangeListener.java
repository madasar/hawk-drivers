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
                                    

package org.modelio.vcore.session.api.model.change;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Session handlers are fired before a session (top level transaction) is committed.
 * 
 * Session handlers have the right to modify the model, contrary to session listeners.
 * These modifications will be a part of the committed transaction and handled has such.
 */
@objid ("a93f2d4e-4e79-4630-8f34-09348d9db89e")
public interface IPersistentViewModelChangeListener {
    @objid ("f5d00b18-d4fc-44e7-a9c1-d31097596c2c")
    void updateView(final IModelChangeEvent event);

}
