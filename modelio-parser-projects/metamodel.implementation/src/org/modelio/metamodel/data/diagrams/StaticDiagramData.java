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
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.impl.diagrams.StaticDiagramImpl;
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

@objid ("00710426-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StaticDiagram.class, factory=StaticDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class StaticDiagramData extends AbstractDiagramData {
    @objid ("6eb31ad2-1e12-4442-825d-fd0a6c75794a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008d3560-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c347b09a-cec2-4edd-97ec-ec8e14fd1276")
        private static SmClass smClass = null;

        @objid ("aca11569-41e3-4b41-93a4-6cd124d78e8b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StaticDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4f2c0d9e-1900-4ed7-bf2a-9314980be215")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008d746c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8cbb0a2d-535d-4318-bd0b-a8f7f900f01f")
            public ISmObjectData createData() {
                return new StaticDiagramData();
            }

            @objid ("6f1275ba-0498-470e-a4b3-2f73d3cbd1ed")
            public SmObjectImpl createImpl() {
                return new StaticDiagramImpl();
            }

        }

    }

}
