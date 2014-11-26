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
                                    

package org.modelio.metamodel.factory;

import java.util.HashMap;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MClass;

/**
 * Metamodel extension request cache.
 * <p>
 * Used to cache requests to find a single note type, tag type, or stereotype.
 * <p>
 * Extensions that are not valid anymore are removed when found.
 * Extensions have to be added to this cache manually.
 */
@objid ("08ad383f-18b9-4718-a73d-36594f2cbe79")
public class ExtensionCache {
    @objid ("2421efc0-ca68-436f-ba41-7085f054d716")
    private Map<Integer, NoteType> nmap = new HashMap<>();

    @objid ("7f93405f-88b5-470a-8a3e-62254d94bc93")
    private Map<Integer, TagType> tmap = new HashMap<>();

    @objid ("2b1d8fc0-786c-4db0-be2e-8dda3d500beb")
    private Map<Integer, Stereotype> smap = new HashMap<>();

    /**
     * Compute a hash key.
     * @param moduleName a module spec
     * @param name the note/tag/stereotype name
     * @param metaclass the metaclass
     * @return the hash key
     */
    @objid ("690fc0c9-f129-4f05-ab0b-4c61f7cb7c27")
    private static int getKey(String moduleName, String name, MClass metaclass) {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((metaclass == null) ? 0 : metaclass.hashCode());
        result = prime * result + ((moduleName == null) ? 0 : moduleName.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /**
     * Add a note type to the cache
     * @param moduleName the module name
     * @param metaclass the metaclass to register
     * @param element the note type
     */
    @objid ("97e52d00-275c-41b2-ad4b-8ab429554e92")
    public void add(String moduleName, MClass metaclass, NoteType element) {
        int key = getKey(moduleName, element.getName(), metaclass);
        this.nmap.put(key, element);
    }

    /**
     * Add a tag type to the cache
     * @param moduleName the module name
     * @param metaclass the metaclass to register
     * @param element the tag type
     */
    @objid ("2fa8ddd4-4850-4614-b48f-e2daa4ed2811")
    public void add(String moduleName, MClass metaclass, TagType element) {
        int key = getKey(moduleName, element.getName(), metaclass);
        this.tmap.put(key, element);
    }

    /**
     * Add a stereotype to the cache
     * @param moduleName the module name
     * @param metaclass the metaclass to register
     * @param element the stereotype
     */
    @objid ("1f896dc0-906d-4f79-841b-6433be77eeb6")
    public void add(String moduleName, MClass metaclass, Stereotype element) {
        int key = getKey(moduleName, element.getName(), metaclass);
        this.smap.put(key, element);
    }

    /**
     * Find a note type.
     * @param moduleName the module name
     * @param name the note type name
     * @param metaclass the metaclass
     * @return the found element or <code>null</code>.
     */
    @objid ("1841446a-ea02-4b7a-a68a-c8c59b2dfef8")
    public NoteType getNoteType(String moduleName, String name, MClass metaclass) {
        int key = getKey(moduleName, name, metaclass);
        
        NoteType n = this.nmap.get(key);
        
        if (n != null) {
            final ModuleComponent module = n.getModule();
            final MClass foundMClass = getBaseClass(n.getOwnerReference(), n.getOwnerStereotype());
            if (name.equals(n.getName()) 
                    && module != null 
                    && foundMClass != null
                    && moduleName.equals(module.getName())
                    && metaclass.hasBase(foundMClass))
                return n;
            
            this.nmap.remove(key);
        }
        return null;
    }

    /**
     * Find a tag type.
     * @param moduleName the module name
     * @param name the note type name
     * @param metaclass the metaclass
     * @return the found element or <code>null</code>.
     */
    @objid ("fb8a1b47-2686-46ad-a37d-9298c1a43604")
    public TagType getTagType(String moduleName, String name, MClass metaclass) {
        int key = getKey(moduleName, name, metaclass);
        
        TagType n = this.tmap.get(key);
        
        if (n != null) {
            final ModuleComponent module = n.getModule();
            final MClass foundMClass = getBaseClass(n.getOwnerReference(), n.getOwnerStereotype());
            if (name.equals(n.getName()) 
                    && module != null 
                    && foundMClass != null
                    && moduleName.equals(module.getName())
                    && metaclass.hasBase(foundMClass))
                return n;
            
            this.tmap.remove(key);
        }
        return null;
    }

    /**
     * Find a stereotype.
     * @param moduleName the module name
     * @param name the note type name
     * @param metaclass the metaclass
     * @return the found element or <code>null</code>.
     */
    @objid ("934cddf2-8fd9-425d-aa05-fbb76ee6dff0")
    public Stereotype getStereotype(String moduleName, String name, MClass metaclass) {
        int key = getKey(moduleName, name, metaclass);
        
        
        Stereotype n = this.smap.get(key);
        
        if (n != null) {
            final ModuleComponent module = n.getModule();
            final MClass foundMClass = getBaseClass(n.getBaseClassName());
            if (name.equals(n.getName()) 
                    && module != null 
                    && foundMClass != null
                    && moduleName.equals(module.getName())
                    && metaclass.hasBase(foundMClass))
                return n;
        
            this.smap.remove(key);
        }
        return null;
    }

    @objid ("5b47b485-d2f8-4c7b-a9b4-f254856cdaf4")
    private static MClass getBaseClass(MetaclassReference classRef, Stereotype ste) {
        if (ste != null) {
            return getBaseClass(ste.getBaseClassName());
        } else if (classRef != null) {
            return getBaseClass(classRef.getReferencedClassName());
        }
        return null;
    }

    @objid ("f407c4b0-d9b0-468b-8ce0-3bf2a671c86b")
    private static MClass getBaseClass(String baseName) {
        return Metamodel.getMClass(baseName);
    }

}
