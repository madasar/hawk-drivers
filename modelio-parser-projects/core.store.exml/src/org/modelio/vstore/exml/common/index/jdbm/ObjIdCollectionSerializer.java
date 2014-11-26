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
                                    

package org.modelio.vstore.exml.common.index.jdbm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jdbm.Serializer;
import jdbm.SerializerInput;
import jdbm.SerializerOutput;
import org.modelio.vstore.exml.common.model.ObjId;

@objid ("434e4120-622a-11e1-b31a-001ec947ccaf")
class ObjIdCollectionSerializer implements Serializer<Collection<ObjId>> {
    @objid ("434e4119-622a-11e1-b31a-001ec947ccaf")
    public static final Serializer<Collection<ObjId>> instance = new ObjIdCollectionSerializer();

    @objid ("d59e23f1-6231-11e1-b31a-001ec947ccaf")
    @Override
    public void serialize(final SerializerOutput out, final Collection<ObjId> obj) throws IOException {
        out.writeInt(obj.size());
        for (ObjId o : obj) {
            ObjIdSerializer.instance.serialize(out, o);
        }
    }

    @objid ("d5a08622-6231-11e1-b31a-001ec947ccaf")
    @Override
    public Collection<ObjId> deserialize(final SerializerInput in) throws IOException, ClassNotFoundException {
        int nb = in.readInt();
        Collection<ObjId> ret = new ArrayList<>(nb);
        
        for (int i=0; i<nb; i++){
            ObjId id = ObjIdSerializer.instance.deserialize(in);
            ret.add(id);
        }
        return ret;
    }

    /**
     * Don't instantiate directly, use singleton.
     */
    @objid ("d5a0862c-6231-11e1-b31a-001ec947ccaf")
    private ObjIdCollectionSerializer() {
    }

}
