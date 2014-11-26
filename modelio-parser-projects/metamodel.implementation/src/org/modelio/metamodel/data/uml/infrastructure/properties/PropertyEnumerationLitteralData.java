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
import org.modelio.metamodel.data.uml.infrastructure.properties.EnumeratedPropertyTypeData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyEnumerationLitteralImpl;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
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

@objid ("007387fa-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=PropertyEnumerationLitteral.class, factory=PropertyEnumerationLitteralData.Metadata.ObjectFactory.class)
public class PropertyEnumerationLitteralData extends ModelElementData {
    @objid ("33e22909-ac8c-4276-9643-04f1de76e788")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=EnumeratedPropertyTypeData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("badb7f74-308c-4585-9f56-30362400fae8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00038842-ec99-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("eb54e4a8-a046-4ee6-b3a4-16210f9bb52f")
        private static SmClass smClass = null;

        @objid ("56aef0ff-0546-4ad4-8c3b-25292d18c186")
        private static SmDependency OwnerDep = null;

        @objid ("38b72fc7-bda6-49ef-8d7f-41520743e541")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyEnumerationLitteralData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4ff1c144-7c77-4c43-b519-8dfa2fb1faf0")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("02b55f28-8c6f-4ba4-bd55-1ce5765d7490")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("475eb075-62f1-4530-84e6-0753176e1593")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("0003ec74-ec99-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("204efc66-4a7a-42db-89fb-52553986134f")
            public ISmObjectData createData() {
                return new PropertyEnumerationLitteralData();
            }

            @objid ("80886626-0cc7-4a6c-8b55-cc813c13ad64")
            public SmObjectImpl createImpl() {
                return new PropertyEnumerationLitteralImpl();
            }

        }

        @objid ("0004ca18-ec99-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("fced27fe-236a-4300-b564-e0c52e0b94e7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyEnumerationLitteralData) data).mOwner;
            }

            @objid ("3e3db8b5-2d32-4c49-ae56-1a5c92907141")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyEnumerationLitteralData) data).mOwner = value;
            }

            @objid ("8fc6511c-d67a-4ace-9fd1-3974ed7d0c27")
            @Override
            public SmDependency getSymetric() {
                return EnumeratedPropertyTypeData.Metadata.LitteralDep();
            }

        }

    }

}
