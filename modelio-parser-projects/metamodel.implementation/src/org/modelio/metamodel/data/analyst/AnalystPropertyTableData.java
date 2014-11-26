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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.data.analyst.AnalystItemData;
import org.modelio.metamodel.data.uml.infrastructure.properties.TypedPropertyTableData;
import org.modelio.metamodel.impl.analyst.AnalystPropertyTableImpl;
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

@objid ("008ad1bc-ec8f-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=AnalystPropertyTable.class, factory=AnalystPropertyTableData.Metadata.ObjectFactory.class)
public class AnalystPropertyTableData extends TypedPropertyTableData {
    @objid ("8e7f0010-bc59-414b-9d55-ddb05c574a86")
    @SmaMetaAssociation(metaName="AnalystOwner", typeDataClass=AnalystItemData.class, min=0, max=1, smAssociationClass=Metadata.AnalystOwnerSmDependency.class)
     SmObjectImpl mAnalystOwner;

    @objid ("19dcd389-1415-43e3-bdcc-fc9a390ef0c9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008ece48-ec96-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("7ded2867-e2f6-4e35-b91c-a4008bb7f803")
        private static SmClass smClass = null;

        @objid ("65c9286e-cb0f-4b16-9522-8ea1ddae07e6")
        private static SmDependency AnalystOwnerDep = null;

        @objid ("27132a95-f3e8-4b3c-a0c3-80b90dd9028d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystPropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cd2e9044-eace-46b9-8740-af24ce461200")
        public static SmDependency AnalystOwnerDep() {
            if (AnalystOwnerDep == null) {
            	AnalystOwnerDep = classof().getDependencyDef("AnalystOwner");
            }
            return AnalystOwnerDep;
        }

        @objid ("50984511-55b7-4aeb-92c4-b3815392a96c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c9f988f8-8c4f-496b-acb6-1aa7ce68c567")
        public static SmDependency getAnalystOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnalystOwnerDep;
        }

        @objid ("008f337e-ec96-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("58e361be-0399-4509-a5e3-bbb2cb5d0b7d")
            public ISmObjectData createData() {
                return new AnalystPropertyTableData();
            }

            @objid ("42d31cd2-0acf-4f0f-b96b-20954779be76")
            public SmObjectImpl createImpl() {
                return new AnalystPropertyTableImpl();
            }

        }

        @objid ("8cb18adc-07cb-4e36-8e8b-2d2432beae56")
        public static class AnalystOwnerSmDependency extends SmSingleDependency {
            @objid ("b11ca707-55dd-4677-b16a-fa38a0954b06")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AnalystPropertyTableData) data).mAnalystOwner;
            }

            @objid ("23da7f2d-6684-43ca-8a99-526884e286fd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AnalystPropertyTableData) data).mAnalystOwner = value;
            }

            @objid ("3eda6307-f0e9-434d-9aa1-dcf24c3aa49c")
            @Override
            public SmDependency getSymetric() {
                return AnalystItemData.Metadata.AnalystPropertiesDep();
            }

        }

    }

}
