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

import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.WeakHashMap;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.repository.IRepositorySupport;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * {@link IModelFactory} factory.
 */
@objid ("6d72d916-5c99-400e-bafa-be356b2eb5ab")
public class ModelFactory {
    /**
     * The model element initializer used by all factories.
     */
    @objid ("991492c3-c87e-4c0e-b252-f1a7dbaa7c34")
    public static final ElementInitializer INITIALIZER = new ElementInitializer();

    /**
     * Factory cache.
     */
    @objid ("8c7cddfa-9d52-472e-9b21-8c84ca87db82")
    private static final Map<ICoreSession, SoftReference<IModelFactory>> factories = new WeakHashMap<>();

    /**
     * Create a model factory for a modeling session.
     * @param referent a referent object used to get the modeling session.
     * @return a model factory.
     */
    @objid ("512ea9f2-1d88-4cbd-bdd3-9655d14df9ce")
    public static IModelFactory getFactory(MObject referent) {
        return getFactory(CoreSession.getSession(referent));
    }

    /**
     * Create a model factory for a modeling session.
     * @param session a modeling session
     * @return a model factory.
     */
    @objid ("78b3e181-8be6-4414-987b-6793b53cafa0")
    public static IModelFactory getFactory(ICoreSession session) {
        SoftReference<IModelFactory> ref = factories.get(session);
        if (ref != null && ref.get() != null)
            return ref.get();
        
        IRepositorySupport repoSupport = session.getRepositorySupport();
        ModelFactoryImpl ret = new ModelFactoryImpl(session.getModel().getGenericFactory(), 
                repoSupport.getRepository(IRepositorySupport.REPOSITORY_KEY_SCRATCH),
                repoSupport.getRepository(IRepositorySupport.REPOSITORY_KEY_LOCAL),
                session.getModel(),
                INITIALIZER);
        
        factories.put(session, new SoftReference<IModelFactory>(ret));
        return ret;
    }

}
