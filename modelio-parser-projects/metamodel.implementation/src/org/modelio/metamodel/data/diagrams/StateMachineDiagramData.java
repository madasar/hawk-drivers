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
import org.modelio.metamodel.diagrams.StateMachineDiagram;
import org.modelio.metamodel.impl.diagrams.StateMachineDiagramImpl;
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

@objid ("00705882-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StateMachineDiagram.class, factory=StateMachineDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class StateMachineDiagramData extends BehaviorDiagramData {
    @objid ("81999de3-ba68-4540-85db-981fa81e220d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008f440e-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("74c2b57e-984e-4b79-96bd-5c2156d699fe")
        private static SmClass smClass = null;

        @objid ("5327d203-af17-4748-be00-0e70d07db014")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateMachineDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cb49e95c-b8d7-4df8-909c-8ee7f966bff8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008f84f0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c9154a23-a972-4089-9943-9b5f5316edc4")
            public ISmObjectData createData() {
                return new StateMachineDiagramData();
            }

            @objid ("7d294ff8-a39d-4b8c-9462-373b7b39900d")
            public SmObjectImpl createImpl() {
                return new StateMachineDiagramImpl();
            }

        }

    }

}
