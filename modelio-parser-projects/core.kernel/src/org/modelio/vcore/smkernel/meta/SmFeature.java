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
                                    

package org.modelio.vcore.smkernel.meta;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

/**
 * A
 * 
 * <pre>
 * SmFeature
 * </pre>
 * 
 * represents a metaclass property, ie an attribute or an association. SmFeature provides min/max cardinality values.
 * 
 * @author phv
 */
@objid ("00843622-ed97-1f1f-85a5-001ec947cd2a")
public abstract class SmFeature extends SmElement {
    /**
     * The max cardinality of the feature. The value <code>-1</code> represents '*' cardinality
     */
    @mdl.prop
    @objid ("008411ce-ed97-1f1f-85a5-001ec947cd2a")
    private int max = 0;

    /**
     * The min cardinality of the feature
     */
    @mdl.prop
    @objid ("008412b4-ed97-1f1f-85a5-001ec947cd2a")
    private int min = 0;

    @objid ("00841502-ed97-1f1f-85a5-001ec947cd2a")
    public boolean isMultiple() {
        return (this.max > 1 || this.max == -1);
    }

    @objid ("60f6f5e6-9b6a-11e1-94a3-001ec947ccaf")
    public int getMax() {
        // Automatically generated method. Please do not modify this code.
        return this.max;
    }

    @objid ("60f6f5ea-9b6a-11e1-94a3-001ec947ccaf")
    protected void setMax(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.max = value;
    }

    @objid ("60f6f5ef-9b6a-11e1-94a3-001ec947ccaf")
    public int getMin() {
        // Automatically generated method. Please do not modify this code.
        return this.min;
    }

    @objid ("60f6f5f3-9b6a-11e1-94a3-001ec947ccaf")
    protected void setMin(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.min = value;
    }

    @objid ("00454f7a-dfa2-1fe9-93a7-001ec947cd2a")
    public abstract void assertValueType(final SmObjectImpl smObjectImpl, final Object value);

}
