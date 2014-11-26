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
                                    

package org.modelio.vstore.jdbm;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jdbm.Serializer;
import jdbm.SerializerInput;
import jdbm.SerializerOutput;
import org.modelio.vcore.model.DuplicateObjectException;
import org.modelio.vcore.session.impl.storage.IModelLoader;
import org.modelio.vcore.smkernel.IPStatus;
import org.modelio.vcore.smkernel.IRStatus;
import org.modelio.vcore.smkernel.SmObjectData;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.SmStatus;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;

/**
 * JDBM {@link Serializer} optimized for {@link SmObjectData}.
 */
@objid ("f7530e95-89c0-40e4-bfe2-87dd942da578")
class SmObjectDataSerializer {
    @objid ("19e1eaca-4337-46dd-8790-aa89993caf4a")
    private byte rid;

    @objid ("c556c337-088e-4bbd-b251-c3e5f4e0d0d1")
    private static Map<Class<?>,Object[]> enumContent = new HashMap<>();

    @objid ("a7c44e99-272c-4e12-ae66-6f90a53204d2")
    private ILoadHelper loadHelper;

    @objid ("6d6984d5-1dd6-4555-b2dd-eeab6bb7ca25")
    public SmObjectDataSerializer(byte rid, ILoadHelper loadHelper) {
        assert (rid >=0);
        
        this.rid = rid;
        this.loadHelper = loadHelper;
    }

    @objid ("6cb7b562-1f6f-4967-a4ae-88db5d9eb810")
    public void serialize(SerializerOutput out, SmObjectData obj) throws IOException {
        out.writeUTF(obj.getClassOf().getName());
        
        SmClass cls = obj.getClassOf();
        for (SmAttribute att : cls.getAllAttDef()) {
            writeAttribute(out, obj, att);
        }
        
        for (SmDependency  d: cls.getAllDepDef()) {
            if (Helper.isPersistent(d))
                if (d.isMultiple())
                    writeMultipleDep(out, obj, (SmMultipleDependency)d);
                else
                    writeSimpleDep(out, obj, (SmSingleDependency)d);
        }
    }

    @objid ("5ff47953-2f25-4c9a-830b-78adb504ee80")
    public void deserialize(SerializerInput in, SmObjectImpl obj, IModelLoader loader) throws IOException, DuplicateObjectException {
        final String clsName = in.readUTF();
        final SmClass cls = SmClass.getClass(clsName);
        
        for (SmAttribute att : cls.getAllAttDef()) {
            readAttribute(in, obj, att, loader);
        }
        
        for (SmDependency  d: cls.getAllDepDef()) {
            if (Helper.isPersistent(d))
                readDep(in, obj, d, loader);
        }
    }

    @objid ("73db7707-71b7-4b3d-b80c-662ac38d1eb0")
    private void readAttribute(final DataInput in, final SmObjectImpl obj, final SmAttribute att, IModelLoader loader) throws IOException {
        final Class<?> type = att.getType();
        Object val;
        if (type == String.class){
            int len = in.readInt();
            StringBuilder s = new StringBuilder(len);
            for (int i=0; i < len; i++)
                s.append(in.readChar());
            
            val = s.toString();
        } else if (type == Integer.class) {
            val = in.readInt();
        } else if (type == Long.class) {
            val = in.readLong();
        } else if (type == Byte.class) {
            val = in.readByte();
        } else if (type == Boolean.class) {
            val = in.readBoolean();
        } else if (type == UUID.class) {
            val = new UUID(in.readLong(), in.readLong());
        } else if (type == IRStatus.class || type == IPStatus.class) {
            val = SmStatus.getPersistentBits(in.readLong());
        } else if (type.isEnum()) {
            val= getEnums(type)[in.readInt()];
        } else {
            throw new UnsupportedOperationException(type+" "+att+" attribute not supported.");
        }
        
        loader.loadAttribute(obj, att, val);
    }

    @objid ("2d6f8054-b226-44b3-8853-a88b28b824a9")
    private static void writeAttribute(final DataOutput out, final SmObjectData obj, final SmAttribute att) throws IOException {
        final Object val = att.getValue(obj);
        final Class<?> type = att.getType();
        if (type == String.class){
            final String s = (String) val;
            out.writeInt(s.length());
            out.writeChars(s);
        } else if (type == Integer.class) {
            out.writeInt((int) val);
        } else if (type == Long.class) {
            out.writeLong((long) val);
        } else if (type == Byte.class) {
            out.writeByte((int) val);
        } else if (type == Boolean.class) {
            out.writeBoolean((boolean) val);
        } else if (type == UUID.class) {
            final UUID uuid = (UUID) val;
            writeUuid(out, uuid);
        } else if (type == IRStatus.class || type == IPStatus.class) {
            // skip
            //out.writeLong(((SmStatus) val).toLong());
        } else if (type.isEnum()) {
            Enum<?> en = (Enum<?>)val;
            out.writeInt(en.ordinal());
        } else {
            throw new UnsupportedOperationException(type+" "+val+" "+att+" attribute not supported.");
        }
    }

    @objid ("a0c8d4d6-9995-4542-a85b-28dcc400d974")
    private void writeSimpleDep(final DataOutput out, final SmObjectData obj, final SmSingleDependency d) throws IOException {
        final SmObjectImpl content = d.getValue(obj);
        //out.writeUTF(d.getName());
        
        if (content == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            writeRef(out, content);
        }
    }

    @objid ("1d8b4d73-b9c1-4258-9f98-b9a5e11166cc")
    private void writeMultipleDep(DataOutput out, SmObjectData obj, SmMultipleDependency md) throws IOException {
        List<SmObjectImpl> content = md.getValueList(obj);
        
        //out.writeUTF(md.getName());
        out.writeInt(content.size());
        
        for (SmObjectImpl val : content) {
            writeRef(out, val);
        }
    }

    @objid ("3c978ea8-de8f-4528-9ac6-447b1e65baaa")
    private void readDep(DataInput in, SmObjectImpl obj, SmDependency d, IModelLoader loader) throws IOException, DuplicateObjectException {
        //String depName = in.readUTF();
        
        //assert (depName.equals(d.getName())) : depName + " !=" + d;
        
        final int size = in.readInt();
        List<SmObjectImpl> vals = new ArrayList<>(size);
        
        for (int i=0; i<size; i++) {
            final SmObjectImpl depVal = readRef(in, loader);
            if (depVal != null)
                vals.add(depVal);
        }
        
        loader.loadDependency(obj, d, vals);
    }

    @objid ("b7c5f0bd-fa9e-4e1c-bcd9-595076a80f00")
    private SmObjectImpl readRef(DataInput in, IModelLoader loader) throws IOException, DuplicateObjectException {
        boolean isLocal = in.readBoolean();
        
        String clsid = in.readUTF();
        UUID uuid = readUuid(in);
        
        SmClass cls = SmClass.getClass(clsid);
        
        if (cls == null)
            return null;
        
        SmObjectImpl ret = decodeRef(loader, isLocal, uuid, cls);
        return ret;
    }

    @objid ("50e49ea1-6a0e-495c-af64-6ba04ab0a5f4")
    private SmObjectImpl decodeRef(IModelLoader loader, boolean isLocal, UUID uuid, SmClass cls) throws DuplicateObjectException {
        SmObjectImpl ret;
        if (isLocal) {
            ret = this.loadHelper.getLocalRef(cls, uuid, loader);
        } else {
            ret = loader.loadForeignObject(cls, uuid, "");
        }
        return ret;
    }

    @objid ("634d5c23-edaf-42e4-ae1e-32046a6fcad5")
    private void writeRef(DataOutput out, SmObjectImpl val) throws IOException {
        // Write islocal
        out.writeBoolean( val.getRepositoryObject().getRepositoryId() == this.rid);
            
        out.writeUTF(val.getMClass().getName());
        writeUuid(out, val.getUuid());
    }

    /**
     * Get all possible enumeration values of an enumerate type.
     * @param type a enumerate class.
     * @return all possible values, ordered.
     */
    @objid ("cdcc6703-457f-4e72-a077-4f7125e37a4e")
    private static Object[] getEnums(final Class<?> type) {
        Object[] ret = enumContent.get(type);
        if (ret == null) {
            ret = type.getEnumConstants();
            enumContent.put(type, ret);
        }
        return ret;
    }

    @objid ("dae4d1f1-be50-41f3-b450-9115c3256c9d")
    private static UUID readUuid(DataInput in) throws IOException {
        long most = in.readLong();
        long least = in.readLong();
        
        UUID uuid = new UUID(most, least);
        return uuid;
    }

    @objid ("5fb23986-42e8-4686-b0f5-c63e8a2bf641")
    private static void writeUuid(DataOutput out, final UUID uuid) throws IOException {
        out.writeLong(uuid.getMostSignificantBits());
        out.writeLong(uuid.getLeastSignificantBits());
    }

}
