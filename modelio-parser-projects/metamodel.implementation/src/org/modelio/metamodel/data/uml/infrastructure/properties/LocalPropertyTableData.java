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
package org.modelio.metamodel.data.uml.infrastructure.properties;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.LocalPropertyTableImpl;
import org.modelio.metamodel.uml.infrastructure.properties.LocalPropertyTable;
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

@objid ("006d9110-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=LocalPropertyTable.class, factory=LocalPropertyTableData.Metadata.ObjectFactory.class, cmsnode=true)
public class LocalPropertyTableData extends PropertyTableData {
    @objid ("80616630-00e9-4819-9eac-1ef355929ec1")
    @SmaMetaAssociation(metaName="LocalAnnoted", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.LocalAnnotedSmDependency.class, partof = true)
     SmObjectImpl mLocalAnnoted;

    @objid ("3703339c-ce3c-4e91-a384-3aa020b41fb9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0069776a-ec97-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("2dc3252b-82bb-4fc1-b5b8-5c86312a7109")
        private static SmClass smClass = null;

        @objid ("99b00de6-d296-4a40-bd22-e08237c69e70")
        private static SmDependency LocalAnnotedDep = null;

        @objid ("86562fd8-e66a-4c46-ad41-36ce3fdae97a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LocalPropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7ef67d16-82e0-46b5-80b4-f930c9f29eab")
        public static SmDependency LocalAnnotedDep() {
            if (LocalAnnotedDep == null) {
            	LocalAnnotedDep = classof().getDependencyDef("LocalAnnoted");
            }
            return LocalAnnotedDep;
        }

        @objid ("4cacd96b-0526-4e4e-bc92-9778d135215e")
        public static SmDependency getLocalAnnotedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalAnnotedDep;
        }

        @objid ("41b15836-29c0-401c-8747-1a59be3bd8a4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("006a0202-ec97-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e8ab8cb1-3855-4959-bd92-ec5474f10ed1")
            public ISmObjectData createData() {
                return new LocalPropertyTableData();
            }

            @objid ("2bbc2c16-6c19-47b6-8f40-671dc597c35b")
            public SmObjectImpl createImpl() {
                return new LocalPropertyTableImpl();
            }

        }

        @objid ("006af61c-ec97-1098-b22e-001ec947cd2a")
        public static class LocalAnnotedSmDependency extends SmSingleDependency {
            @objid ("46ac59fd-79df-4f8d-8656-7135a80f9012")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LocalPropertyTableData) data).mLocalAnnoted;
            }

            @objid ("b1914b93-91c7-45cf-aaf9-37d7b5fb3a68")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LocalPropertyTableData) data).mLocalAnnoted = value;
            }

            @objid ("f99cb357-3980-4449-ae05-cf6d668de31a")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.LocalPropertiesDep();
            }

        }

    }

}
