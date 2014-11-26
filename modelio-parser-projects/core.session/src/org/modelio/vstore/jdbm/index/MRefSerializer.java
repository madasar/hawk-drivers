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
                                    

package org.modelio.vstore.jdbm.index;

import java.io.IOException;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jdbm.Serializer;
import jdbm.SerializerInput;
import jdbm.SerializerOutput;
import org.modelio.vcore.smkernel.mapi.MRef;

@objid ("62aa1817-17d2-4485-82d1-9f16bb6d0ea7")
class MRefSerializer implements Serializer<MRef> {
    @objid ("991eda0e-ea58-4778-b2f2-0302d300bdf1")
    public static final Serializer<MRef> instance = new MRefSerializer();

    @objid ("9bf0a13a-aca0-4902-9e43-f166e514ff91")
    @Override
    public void serialize(final SerializerOutput out, final MRef obj) throws IOException {
        assert (obj.name != null);
        assert (obj.uuid != null);
        assert (obj.mc != null);
        
        UuidSerializer.instance.serialize(out, obj.uuid);
        out.writeUTF(obj.name); // uncomment for debug
        out.writeUTF(obj.mc);
    }

    @objid ("94e71b4c-a6f7-4f6c-be70-585f3503df78")
    @Override
    public MRef deserialize(final SerializerInput in) throws ClassNotFoundException, IOException {
        UUID id = UuidSerializer.instance.deserialize(in);
        String name = in.readUTF(); // uncomment for debug
        //String name = "";  // comment for debug
        String cname = in.readUTF();
        return new MRef(cname, id, name);
    }

}
