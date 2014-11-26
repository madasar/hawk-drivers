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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyEnumerationLitteralData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.EnumeratedPropertyTypeImpl;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
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

@objid ("00718aa4-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=EnumeratedPropertyType.class, factory=EnumeratedPropertyTypeData.Metadata.ObjectFactory.class, cmsnode=true)
public class EnumeratedPropertyTypeData extends PropertyTypeData {
    @objid ("3e6f6eba-839c-40a5-bb9e-e741f773303e")
    @SmaMetaAssociation(metaName="Litteral", typeDataClass=PropertyEnumerationLitteralData.class, min=0, max=-1, smAssociationClass=Metadata.LitteralSmDependency.class, component = true)
     List<SmObjectImpl> mLitteral = null;

    @objid ("dfef8684-802d-41c3-8f21-de4c8bce184f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00591c3a-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("2cc608fb-6a4b-49b6-9648-d820caedec51")
        private static SmClass smClass = null;

        @objid ("382150ac-90d8-47f0-867c-af6d8da2a2c2")
        private static SmDependency LitteralDep = null;

        @objid ("d1837970-b0e9-43e1-a7b9-a549b5ddbcaa")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EnumeratedPropertyTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("da90760c-a24c-4b1c-be7b-467e11db22cf")
        public static SmDependency LitteralDep() {
            if (LitteralDep == null) {
            	LitteralDep = classof().getDependencyDef("Litteral");
            }
            return LitteralDep;
        }

        @objid ("941992f1-d692-411f-9513-831bcbfbae78")
        public static SmDependency getLitteralDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LitteralDep;
        }

        @objid ("6e0e9f0f-4011-4e75-bb7c-636a463bf740")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00597d1a-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3acb9e23-7885-41f8-9702-33ed394c4725")
            public ISmObjectData createData() {
                return new EnumeratedPropertyTypeData();
            }

            @objid ("d97f43b0-ae17-4522-81c7-09fe9e46e7ef")
            public SmObjectImpl createImpl() {
                return new EnumeratedPropertyTypeImpl();
            }

        }

        @objid ("005a5816-ec98-1098-b22e-001ec947cd2a")
        public static class LitteralSmDependency extends SmMultipleDependency {
            @objid ("2e73053e-8f7e-4223-b2a8-0a94f3df5b0e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EnumeratedPropertyTypeData)data).mLitteral != null)? ((EnumeratedPropertyTypeData)data).mLitteral:SmMultipleDependency.EMPTY;
            }

            @objid ("652859d9-30c7-487a-ae3f-0b4921d11f82")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EnumeratedPropertyTypeData) data).mLitteral = new ArrayList<>(initialCapacity);
                return ((EnumeratedPropertyTypeData) data).mLitteral;
            }

            @objid ("508d86e8-ea55-438b-b416-0bafa5306f6e")
            @Override
            public SmDependency getSymetric() {
                return PropertyEnumerationLitteralData.Metadata.OwnerDep();
            }

        }

    }

}
