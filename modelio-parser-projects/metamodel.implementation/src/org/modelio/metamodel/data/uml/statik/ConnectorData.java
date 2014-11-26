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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.statik.ConnectorImpl;
import org.modelio.metamodel.uml.statik.Connector;
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

@objid ("83b26800-924c-4c83-b588-26b199d89d79")
@SmaMetaClass(mmClass=Connector.class, factory=ConnectorData.Metadata.ObjectFactory.class)
public class ConnectorData extends LinkData {
    @objid ("a2d3f74b-f74e-4a3b-844c-611b5c3d3a87")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("08b3d3f4-aa75-4b25-9b20-148b992d0173")
    public static class Metadata {
        @objid ("97c24043-7bbd-484a-b3e9-7172f121d22d")
        private static SmClass smClass = null;

        @objid ("08811d92-c7cc-4503-8424-4e86567e9375")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConnectorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("137a933b-b6fe-4f3d-806b-de4a9844b459")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c7c3d260-7c0e-4c05-8e48-e1fead0968ac")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("72b112df-9b1d-4bfa-9709-e648ba398b40")
            public ISmObjectData createData() {
                return new ConnectorData();
            }

            @objid ("7d96f31a-1c51-4f85-b3a3-03bc1881382b")
            public SmObjectImpl createImpl() {
                return new ConnectorImpl();
            }

        }

    }

}
