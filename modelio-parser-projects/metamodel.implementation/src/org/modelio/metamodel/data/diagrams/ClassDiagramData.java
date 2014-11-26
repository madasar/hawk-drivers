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
package org.modelio.metamodel.data.diagrams;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.impl.diagrams.ClassDiagramImpl;
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

@objid ("006c82f2-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ClassDiagram.class, factory=ClassDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class ClassDiagramData extends StaticDiagramData {
    @objid ("a6488c7f-eb22-4af7-9ee4-5b7ff7ac5ae5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002dff1e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5ae3c745-acd5-4e13-9f9f-aca3376543ff")
        private static SmClass smClass = null;

        @objid ("5172f8dd-9451-4a5f-9cd9-b1a9afb551d5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e720914e-37f0-4405-8782-e5aa4b575873")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002e3e48-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("727869e9-16d0-4476-9efd-552e5aea6cc2")
            public ISmObjectData createData() {
                return new ClassDiagramData();
            }

            @objid ("4ab4b15f-b21e-472f-ac87-eeafda235831")
            public SmObjectImpl createImpl() {
                return new ClassDiagramImpl();
            }

        }

    }

}
