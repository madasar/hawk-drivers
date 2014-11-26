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
                                    

package org.modelio.vcore.session.api.transactions;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.session.impl.transactions.smAction.TransactionException;

@objid ("006f86be-0d1e-1f20-85a5-001ec947cd2a")
public class UndoActiveTransactionException extends TransactionException {
    @objid ("008d6206-702b-1f21-85a5-001ec947cd2a")
    private static final long serialVersionUID = 1L;

    @objid ("006ef168-0d1e-1f20-85a5-001ec947cd2a")
    public UndoActiveTransactionException(final String msg) {
        super(msg);
    }

}
