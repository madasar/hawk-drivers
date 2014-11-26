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
                                    

package org.modelio.gproject.model.api.auth;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MObject;

// isShell = false isRamc = false
@objid ("0080cdfc-d2e8-1097-bcec-001ec947cd2a")
public interface IAuthTool {
    @objid ("0053502a-d281-1098-bcec-001ec947cd2a")
    boolean canAdd(final MObject parentElement, final String metaclass);

    @objid ("f1865eab-2984-11e2-8460-002564c97630")
    boolean canAddTo(MObject child, MObject parent);

    @objid ("00539ca6-d281-1098-bcec-001ec947cd2a")
    boolean canCreateLink(Class<? extends MObject> toCreate, MObject srcElement, MObject targetEl);

    @objid ("0053c960-d281-1098-bcec-001ec947cd2a")
    boolean canCreateLinkFrom(Class<? extends MObject> toCreate, MObject srcElement);

    @objid ("00537dfc-d281-1098-bcec-001ec947cd2a")
    boolean canModify(final MObject el);

    @objid ("f1865eb0-2984-11e2-8460-002564c97630")
    boolean canRemoveFrom(MObject child, MObject parent);

}
