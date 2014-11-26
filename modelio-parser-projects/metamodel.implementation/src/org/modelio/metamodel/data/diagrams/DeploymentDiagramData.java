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
import org.modelio.metamodel.diagrams.DeploymentDiagram;
import org.modelio.metamodel.impl.diagrams.DeploymentDiagramImpl;
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

@objid ("006d73c4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DeploymentDiagram.class, factory=DeploymentDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class DeploymentDiagramData extends StaticDiagramData {
    @objid ("43f64aac-266b-450d-a51d-77ec26392398")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00966248-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0c707710-75b9-4bb7-9b9a-69a5eb3d4e9c")
        private static SmClass smClass = null;

        @objid ("c144df7f-52df-435e-a3cc-7caa39f944d3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DeploymentDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b540f759-dc5f-407c-a5fe-7ea75294ca6f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0096a352-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7f48b178-5657-4472-a2f2-1e9ddf2a9418")
            public ISmObjectData createData() {
                return new DeploymentDiagramData();
            }

            @objid ("7dc3d83e-0555-4ae0-8743-bbc37dc58bc3")
            public SmObjectImpl createImpl() {
                return new DeploymentDiagramImpl();
            }

        }

    }

}
