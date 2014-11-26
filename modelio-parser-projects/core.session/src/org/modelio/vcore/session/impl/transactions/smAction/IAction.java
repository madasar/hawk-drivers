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
                                    

package org.modelio.vcore.session.impl.transactions.smAction;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.session.impl.transactions.smAction.smActionInteractions.IActionVisitor;

@objid ("006b243e-0d1e-1f20-85a5-001ec947cd2a")
public interface IAction {
    @objid ("006bd1f4-0d1e-1f20-85a5-001ec947cd2a")
    void accept(final IActionVisitor v);

    @objid ("006bd352-0d1e-1f20-85a5-001ec947cd2a")
    boolean isTransaction();

    /**
     * Execute le redo de l'action
     */
    @objid ("006b1d36-0d1e-1f20-85a5-001ec947cd2a")
    void redo();

    /**
     * Permet de positinner toutes les transactions contenue dans la transaction ? notUndoable. Cette m?thode est appell?e par le reset.
     */
    @objid ("006b1e6c-0d1e-1f20-85a5-001ec947cd2a")
    void disableUndo();

    /**
     * Execute le undo de l'action
     */
    @objid ("006b1f98-0d1e-1f20-85a5-001ec947cd2a")
    void undo(final boolean rollback);

}
