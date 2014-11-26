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
                                    

package org.modelio.gproject.fragment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * State of a {@link IProjectFragment}.
 */
@objid ("4bafae5a-d637-11e1-9f03-001ec947ccaf")
public enum FragmentState {
    /**
     * Initial state.
     */
    INITIAL,
    /**
     * Being mounted.
     */
    MOUNTING,
    /**
     * Operational.
     */
    UP_FULL,
    /**
     * Operational in light mode.
     */
    UP_LIGHT,
    /**
     * Down, broken.
     */
    DOWN;
}
