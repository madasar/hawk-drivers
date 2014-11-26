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
import org.modelio.metamodel.diagrams.SequenceDiagram;
import org.modelio.metamodel.impl.diagrams.SequenceDiagramImpl;
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

@objid ("006fd556-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=SequenceDiagram.class, factory=SequenceDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class SequenceDiagramData extends BehaviorDiagramData {
    @objid ("fd801885-2ab1-49da-ab1a-f3140040dd49")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0011cd94-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("783f8735-d7c1-4b59-8a0d-ee18c635daf3")
        private static SmClass smClass = null;

        @objid ("eca29b8c-a034-4c21-a7a7-07ddb467357f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SequenceDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5fc9df48-a66b-42f2-8079-99750ed395dd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00120c28-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bee01b7f-766a-4473-ad09-5997f66ec0ea")
            public ISmObjectData createData() {
                return new SequenceDiagramData();
            }

            @objid ("fe957545-7952-4d49-96f9-270202ccf35c")
            public SmObjectImpl createImpl() {
                return new SequenceDiagramImpl();
            }

        }

    }

}
