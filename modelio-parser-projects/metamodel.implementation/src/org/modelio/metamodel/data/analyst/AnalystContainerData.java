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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystContainer;
import org.modelio.metamodel.impl.analyst.AnalystContainerImpl;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("ff7ecd90-d1b2-4c61-90fa-2fb3db4bfb66")
@SmaMetaClass(mmClass=AnalystContainer.class, factory=AnalystContainerData.Metadata.ObjectFactory.class)
public abstract class AnalystContainerData extends AnalystItemData {
    @objid ("ad374897-efc9-426b-8cfa-fcc87dde0a1c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("b72be232-efc6-47c2-874d-3173316a5e6d")
    public static class Metadata {
        @objid ("a4aa7287-89d7-4bab-be85-e135e6aa8599")
        private static SmClass smClass = null;

        @objid ("b893945d-c63b-444f-9b17-e6710c0223f3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9f388897-6a2b-4d96-9ba5-957b17e929a2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c1994255-df1e-488b-b75a-9d96aa394613")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("41f76a9b-5492-4133-9b63-ac2e0784ef35")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("314becd3-6db8-4e96-9405-c7e461cce772")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

    }

}
