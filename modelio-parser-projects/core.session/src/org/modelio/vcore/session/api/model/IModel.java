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
                                    

package org.modelio.vcore.session.api.model;

import java.util.Collection;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.session.UnknownMetaclassException;
import org.modelio.vcore.session.impl.GenericFactory;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Interface used to access the model, listen for and hook model changes of a modeling session.
 */
@objid ("0fc4a30a-9083-11e1-81e9-001ec947ccaf")
public interface IModel {
    @objid ("158ef48a-aed6-4746-a113-8d9f740481b4")
    public static final IMObjectFilter ISVALID = new IMObjectFilter() {
		@Override
		public boolean accept(MObject obj) {
			return obj != null && obj.isValid();
		}
	};

    @objid ("899f8ec3-25d4-4441-b499-c889c4e125a7")
    public static final IMObjectFilter NOSHELL = new IMObjectFilter() {
		@Override
		public boolean accept(MObject obj) {
			return obj != null && ! obj.isShell();
		}
	};

    @objid ("f85615e6-6ad2-4a7a-9784-cf8d466faa65")
    public static final IMObjectFilter NODELETED = new IMObjectFilter() {
		@Override
		public boolean accept(MObject obj) { 
			return obj != null && ! obj.isDeleted();
		}
	};

    /**
     * Find elements by a metaclass an an attribute value.
     * @param cls the metaclass.
     * @param att the attribute to search
     * @param val the attribute value
     * @return the found elements.
     */
    @objid ("17c23aa0-9083-11e1-81e9-001ec947ccaf")
    Collection<? extends MObject> findByAtt(MClass cls, final String att, Object val, IMObjectFilter filter);

    /**
     * Get all elements of a given class and the class descendants.
     * @param cls a metaclass.
     * @return all elements of this class.
     */
    @objid ("17c23aa1-9083-11e1-81e9-001ec947ccaf")
    Collection<? extends MObject> findByClass(MClass cls, IMObjectFilter filter);

    /**
     * Find an element from its MClass and its identifier.
     * @param cls a metaclass
     * @param siteIdentifier an UUID
     * @return the found element or <code>null</code>.
     */
    @objid ("17c23aa2-9083-11e1-81e9-001ec947ccaf")
    MObject findById(MClass cls, final UUID siteIdentifier, IMObjectFilter filter);

    /**
     * Find an element from a reference.
     * @param ref an element reference
     * @return the found element or <code>null</code>.
     * @throws org.modelio.vcore.session.UnknownMetaclassException if the referenced metaclass does not exist.
     */
    @objid ("10a41285-16e7-11e2-b24b-001ec947ccaf")
    MObject findByRef(MRef ref, IMObjectFilter filter) throws UnknownMetaclassException;

    /**
     * Get the generic factory.
     * @return the generic factory.
     */
    @objid ("0078ca26-5a20-10c8-842f-001ec947cd2a")
    GenericFactory getGenericFactory();

    @objid ("00955b82-61a5-10c8-842f-001ec947cd2a")
    Collection<? extends MObject> findByClass(MClass cls);

    @objid ("0096d304-61a5-10c8-842f-001ec947cd2a")
    Collection<? extends MObject> findByAtt(MClass cls, final String att, Object val);

    @objid ("009711de-61a5-10c8-842f-001ec947cd2a")
    MObject findById(MClass cls, final UUID siteIdentifier);

    @objid ("33fb2113-b8a3-4b3b-95ed-3481c65d2881")
    MObject findByRef(MRef ref) throws UnknownMetaclassException;

    @objid ("261fe5dc-cfbf-40ee-886d-fc3c529c0e47")
    <T extends MObject> Collection<T> findByClass(Class<T> metaclass, IMObjectFilter filter);

    @objid ("e46abe41-187e-4d12-b565-c9e92df02519")
    <T extends MObject> Collection<T> findByAtt(Class<T> metaclass, final String att, Object val, IMObjectFilter filter);

    @objid ("83ef71a2-04ef-4e59-bf55-2bffe3069024")
    <T extends MObject> T findById(Class<T> metaclass, final UUID siteIdentifier, IMObjectFilter filter);

    @objid ("610f2f86-624b-469c-9c0c-6bf78147fba1")
    <T extends MObject> Collection<T> findByClass(Class<T> metaclass);

    @objid ("1540131b-bdd6-466c-a417-9e0efd220dda")
    <T extends MObject> Collection<T> findByAtt(Class<T> metaclass, final String att, Object val);

    @objid ("1b63d157-9858-4691-8636-7c625e97c65e")
    <T extends MObject> T findById(Class<T> metaclass, final UUID siteIdentifier);

}
