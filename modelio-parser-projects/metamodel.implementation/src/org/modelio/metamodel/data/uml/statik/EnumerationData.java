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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.EnumerationLiteralData;
import org.modelio.metamodel.impl.uml.statik.EnumerationImpl;
import org.modelio.metamodel.uml.statik.Enumeration;
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

@objid ("0009fc7c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Enumeration.class, factory=EnumerationData.Metadata.ObjectFactory.class)
public class EnumerationData extends GeneralClassData {
    @objid ("79410900-3a27-41c2-9414-f18fca90ed10")
    @SmaMetaAssociation(metaName="Value", typeDataClass=EnumerationLiteralData.class, min=0, max=-1, smAssociationClass=Metadata.ValueSmDependency.class, component = true)
     List<SmObjectImpl> mValue = null;

    @objid ("6ee0dae0-ccef-11e1-a996-001ec947ccaf")
    public EnumerationData() {
        this.mIsElementary = Boolean.TRUE;
    }

    @objid ("9c96b8f8-9e49-400e-a556-5cb5513a8962")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00933492-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2bd1870c-9d74-4c13-bb18-a4b168afdaa9")
        private static SmClass smClass = null;

        @objid ("cad3c596-4dec-4ae0-8d3e-a97210510220")
        private static SmDependency ValueDep = null;

        @objid ("cd570bce-5416-4360-86d9-363e81719375")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EnumerationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d8e4ba6f-03fb-4bef-8b08-b5e518e9c9ca")
        public static SmDependency ValueDep() {
            if (ValueDep == null) {
            	ValueDep = classof().getDependencyDef("Value");
            }
            return ValueDep;
        }

        @objid ("703c43ae-9352-47f2-a68f-011261d7d8b7")
        public static SmDependency getValueDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueDep;
        }

        @objid ("711271e2-5fc9-4155-bc2a-cb75ac2c22e9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00937592-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("96cf9af1-11b1-4b67-be90-7c7edd5c8344")
            public ISmObjectData createData() {
                return new EnumerationData();
            }

            @objid ("6c6541cb-ea0e-4099-83e1-d35d82d48ca8")
            public SmObjectImpl createImpl() {
                return new EnumerationImpl();
            }

        }

        @objid ("0093d9d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ValueSmDependency extends SmMultipleDependency {
            @objid ("393b04e5-13bb-4c62-b403-f52bd7a0d1c4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EnumerationData)data).mValue != null)? ((EnumerationData)data).mValue:SmMultipleDependency.EMPTY;
            }

            @objid ("358578fe-bcf2-457b-9a15-c3ebc69a3063")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EnumerationData) data).mValue = new ArrayList<>(initialCapacity);
                return ((EnumerationData) data).mValue;
            }

            @objid ("dc775ea0-bc6f-4683-86e3-75c3130ba3e5")
            @Override
            public SmDependency getSymetric() {
                return EnumerationLiteralData.Metadata.ValuatedDep();
            }

        }

    }

}
