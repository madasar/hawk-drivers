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
                                    

package org.modelio.vcore.smkernel;

import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("006b167e-861a-1f21-85a5-001ec947cd2a")
public interface ISwap {
    @objid ("006b1f34-861a-1f21-85a5-001ec947cd2a")
    void swap(final SmObjectData data);

    @objid ("006b27f4-861a-1f21-85a5-001ec947cd2a")
    SmObjectData restore(final UUID uuid);

    @objid ("561eeffc-84b6-11e1-b644-001ec947ccaf")
    void close();

}
