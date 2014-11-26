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
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jdbm.Serializer;
import jdbm.SerializerInput;
import jdbm.SerializerOutput;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vstore.exml.common.model.ObjId;

@objid ("ea207749-5c87-11e1-863f-001ec947ccaf")
class ObjIdSerializer implements Serializer<ObjId> {
    @objid ("d55738a2-7f1a-11e1-ba70-001ec947ccaf")
    public static final Serializer<ObjId> instance = new ObjIdSerializer();

    @objid ("82d690e7-5ca7-11e1-863f-001ec947ccaf")
    @Override
    public void serialize(final SerializerOutput out, final ObjId obj) throws IOException {
        assert (obj.name != null);
        assert (obj.id != null);
        assert (obj.classof != null);
        
        UuidSerializer.instance.serialize(out, obj.id);
        out.writeUTF(obj.name); // uncomment for debug
        out.writeUTF(obj.classof.getName());
    }

    @objid ("82d690ee-5ca7-11e1-863f-001ec947ccaf")
    @Override
    public ObjId deserialize(final SerializerInput in) throws IOException, ClassNotFoundException {
        UUID id = UuidSerializer.instance.deserialize(in);
        String name = in.readUTF(); // uncomment for debug
        //String name = "";  // comment for debug
        String cname = in.readUTF();
        return new ObjId(SmClass.getClass(cname), name, id);
    }

}
