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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.UsageImpl;
import org.modelio.metamodel.uml.infrastructure.Usage;
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

@objid ("00913aa2-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Usage.class, factory=UsageData.Metadata.ObjectFactory.class)
public class UsageData extends DependencyData {
    @objid ("622d8ab0-6376-46fa-8bcd-8f7610621cd3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0009b80c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("41019774-9a21-42e8-9288-229bc50319e1")
        private static SmClass smClass = null;

        @objid ("b012963b-b964-4bfe-9883-56037855e41a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(UsageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("218874fb-68a8-452c-bb75-baa2a1f0cf99")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0009f920-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a17775d2-cc6c-4490-9716-8d208415f37a")
            public ISmObjectData createData() {
                return new UsageData();
            }

            @objid ("140228cf-dc38-4972-a5e4-2fc4b58cfd7d")
            public SmObjectImpl createImpl() {
                return new UsageImpl();
            }

        }

    }

}
