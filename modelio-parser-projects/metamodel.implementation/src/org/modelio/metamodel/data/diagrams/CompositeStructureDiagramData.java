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
import org.modelio.metamodel.diagrams.CompositeStructureDiagram;
import org.modelio.metamodel.impl.diagrams.CompositeStructureDiagramImpl;
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

@objid ("00735334-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CompositeStructureDiagram.class, factory=CompositeStructureDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class CompositeStructureDiagramData extends StaticDiagramData {
    @objid ("9c3b5a67-75b4-47ce-8c9b-af41fe6dcd44")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0007c0ec-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b97aedf5-f62b-44d8-b089-4fae03c76810")
        private static SmClass smClass = null;

        @objid ("0a923af5-51e9-4888-8b3d-0aa639960903")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CompositeStructureDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3abcc4d5-655c-4240-838f-d9ad3632978d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00080f52-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8e5831f1-46f2-4b45-8657-568011fe40e7")
            public ISmObjectData createData() {
                return new CompositeStructureDiagramData();
            }

            @objid ("3bc8ed03-8e8a-46d9-b8aa-e624b6612952")
            public SmObjectImpl createImpl() {
                return new CompositeStructureDiagramImpl();
            }

        }

    }

}
