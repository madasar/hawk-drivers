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
                                    

package org.modelio.vbasic.auth;

import java.util.Collections;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Authentication data for URIs that don't need authentication data.
 */
@objid ("01cce00f-8bb5-426f-8236-9306f46791cf")
public class NoneAuthData extends AuthData {
    /**
     * Scheme ID for {@link NoneAuthData}.
     */
    @objid ("bf09bef2-687d-4eb7-b1db-f5dc2f4b8f46")
    public static final String AUTH_NONE_SCHEME_ID = "AUTH_NONE";

    @objid ("81868631-3870-490a-be97-4dee275cfac7")
    @Override
    public String getSchemeId() {
        return AUTH_NONE_SCHEME_ID;
    }

    @objid ("6ccbc0b9-53d2-4c8f-93ee-c02d62556c4a")
    @Override
    public boolean isComplete() {
        return true;
    }

    @objid ("0a94ec2f-ee20-43cf-81e6-bbd4605aaa8f")
    @Override
    public Map<String, String> serialize() {
        return Collections.emptyMap();
    }

}
