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
                                    

package org.modelio.vcore.session.api.blob;

import java.io.InputStream;
import java.io.OutputStream;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Information about a blob.
 * <p>
 * Instances of this classe are immutable.
 * Blob informations can be read/written on any {@link InputStream} / {@link OutputStream}.
 */
@objid ("9abe7eee-1f62-4ef8-9472-da87332f5721")
public class BlobInfo implements IBlobInfo {
    @objid ("f2dfbae7-98d5-4558-a2fb-31518737d620")
    private final String key;

    @objid ("72448f48-11a0-4704-a3ee-5e709c0c7884")
    private final String label;

    /**
     * @param key the blob key
     * @param label the blob label
     */
    @objid ("6fb9e474-0e38-4091-b91e-e91dfa4bfa74")
    public BlobInfo(String key, String label) {
        this.key = key;
        this.label = label;
    }

    /**
     * Copy constructor
     * @param other the blob info to copy.
     */
    @objid ("7228adb5-b5b3-4ef3-b33e-00093ffd7258")
    public BlobInfo(BlobInfo other) {
        this.key = other.getKey();
        this.label = other.getLabel();
    }

    @objid ("9ab16808-d70f-47c3-975e-5e828edb535c")
    @Override
    public String getKey() {
        return this.key;
    }

    @objid ("5a35c2f8-ee5f-4b07-baba-d796aa79a0c3")
    @Override
    public String getLabel() {
        return this.label;
    }

    @objid ("ca90191c-c074-4008-bb0e-10c863a149ec")
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.key == null) ? 0 : this.key.hashCode());
        result = prime * result + ((this.label == null) ? 0 : this.label.hashCode());
        return result;
    }

    @objid ("934a1d77-d941-4049-8391-d8e6edea1d5b")
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BlobInfo other = (BlobInfo) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        } else if (!this.key.equals(other.key))
            return false;
        if (this.label == null) {
            if (other.label != null)
                return false;
        } else if (!this.label.equals(other.label))
            return false;
        return true;
    }

    @objid ("10f06429-4ee1-4558-bc19-d08091073baf")
    @Override
    public String toString() {
        return "'"+this.key+"' "+getClass().getSimpleName();
    }

}
