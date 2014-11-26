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
import org.modelio.metamodel.impl.uml.infrastructure.AbstractionImpl;
import org.modelio.metamodel.uml.infrastructure.Abstraction;
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

@objid ("0084fefe-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Abstraction.class, factory=AbstractionData.Metadata.ObjectFactory.class)
public class AbstractionData extends DependencyData {
    @objid ("27bded81-bf50-4108-b8db-51c16c4f1897")
    @SmaMetaAttribute(metaName="Mapping", type=String.class, smAttributeClass=Metadata.MappingSmAttribute.class)
     Object mMapping = "";

    @objid ("f5224000-caac-468d-919d-1a1b18d52122")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008018c6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("88ab6f22-0240-4044-bf7a-9378e33df32c")
        private static SmClass smClass = null;

        @objid ("0d3c951d-087a-4525-830a-82a835272802")
        private static SmAttribute MappingAtt = null;

        @objid ("3d46de10-a7aa-43fa-a809-3b0c2b3be99f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AbstractionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a02ba734-1268-4657-950e-10b4a51b303e")
        public static SmAttribute MappingAtt() {
            if (MappingAtt == null) {
            	MappingAtt = classof().getAttributeDef("Mapping");
            }
            return MappingAtt;
        }

        @objid ("36994559-4424-45d2-97ea-d3b7d42d6588")
        public static SmAttribute getMappingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MappingAtt;
        }

        @objid ("63504645-2aaa-4119-955d-455008b86039")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00806830-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("148323ee-a28b-456d-b812-7dc100d2d5fd")
            public ISmObjectData createData() {
                return new AbstractionData();
            }

            @objid ("b27833c0-d4c1-4d00-a9b7-26d1f0e90f01")
            public SmObjectImpl createImpl() {
                return new AbstractionImpl();
            }

        }

        @objid ("0080db30-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MappingSmAttribute extends SmAttribute {
            @objid ("d1666c4e-7a0b-4612-9191-b6f02c0a9f35")
            public Object getValue(ISmObjectData data) {
                return ((AbstractionData) data).mMapping;
            }

            @objid ("0ec321b1-8d18-4ec2-b1fa-2c6612e4d124")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractionData) data).mMapping = value;
            }

        }

    }

}
