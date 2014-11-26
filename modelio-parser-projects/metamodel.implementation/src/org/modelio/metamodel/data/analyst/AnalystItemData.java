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
import org.modelio.metamodel.analyst.AnalystItem;
import org.modelio.metamodel.data.analyst.AnalystPropertyTableData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.analyst.AnalystItemImpl;
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

@objid ("d56b278b-bf80-40c6-a568-104b8de90603")
@SmaMetaClass(mmClass=AnalystItem.class, factory=AnalystItemData.Metadata.ObjectFactory.class)
public abstract class AnalystItemData extends ModelElementData {
    @objid ("be0360ad-0ca5-4c92-8790-8e0d78b001e5")
    @SmaMetaAttribute(metaName="Definition", type=String.class, smAttributeClass=Metadata.DefinitionSmAttribute.class)
     Object mDefinition = "";

    @objid ("71655829-bfcd-4ea8-9e3d-d8553a32915f")
    @SmaMetaAssociation(metaName="AnalystProperties", typeDataClass=AnalystPropertyTableData.class, min=1, max=1, smAssociationClass=Metadata.AnalystPropertiesSmDependency.class, component = true)
     SmObjectImpl mAnalystProperties;

    @objid ("a64844c5-006b-4600-9fce-0d0b22168bf9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("02ff5cdd-9877-466c-8285-f1b4962fbef1")
    public static class Metadata {
        @objid ("d32fbefc-40c7-4144-80b4-a3c7c4362738")
        private static SmClass smClass = null;

        @objid ("adb069f9-0a5f-4b02-9b98-74186700f2d4")
        private static SmAttribute DefinitionAtt = null;

        @objid ("bbe369f1-7e56-4b16-a1c0-ace3a614326f")
        private static SmDependency AnalystPropertiesDep = null;

        @objid ("5917369f-3ad3-4a4e-9d02-e7af043f6ba9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystItemData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b1dc5008-34d4-4007-a0f7-b781f2d86c73")
        public static SmAttribute DefinitionAtt() {
            if (DefinitionAtt == null) {
            	DefinitionAtt = classof().getAttributeDef("Definition");
            }
            return DefinitionAtt;
        }

        @objid ("53ba0a8d-aca5-4d12-b882-a9e5376fafe3")
        public static SmDependency AnalystPropertiesDep() {
            if (AnalystPropertiesDep == null) {
            	AnalystPropertiesDep = classof().getDependencyDef("AnalystProperties");
            }
            return AnalystPropertiesDep;
        }

        @objid ("8e51b24b-1a0d-425f-ba3f-de230fb81926")
        public static SmAttribute getDefinitionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinitionAtt;
        }

        @objid ("8254a041-9bdc-4ab2-8c48-2860bc05bed4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8b4e7281-9fd6-4ff6-ad32-8e0917a23f88")
        public static SmDependency getAnalystPropertiesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnalystPropertiesDep;
        }

        @objid ("fda94f61-2256-4668-9a92-1bb3f1942409")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4c981bd0-25f2-42f5-bce2-c1924d50ce56")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("16eea3e5-b77b-46bc-aa87-10b5f9e76168")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("5f88e06e-6ed0-4c60-9c2d-c61ff8169506")
        public static class DefinitionSmAttribute extends SmAttribute {
            @objid ("e53333e3-e05c-4cd2-9c9a-ceb7626bcb29")
            public Object getValue(ISmObjectData data) {
                return ((AnalystItemData) data).mDefinition;
            }

            @objid ("e66b2a5b-6636-4179-91a8-6359e35ef7da")
            public void setValue(ISmObjectData data, Object value) {
                ((AnalystItemData) data).mDefinition = value;
            }

        }

        @objid ("067a03ba-79ed-4568-b849-c9b6e04277c1")
        public static class AnalystPropertiesSmDependency extends SmSingleDependency {
            @objid ("4d043522-37b4-44c1-9fcf-522bc0dd1944")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AnalystItemData) data).mAnalystProperties;
            }

            @objid ("5a5688e5-5c5d-4fa6-8689-73051bcd5cba")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AnalystItemData) data).mAnalystProperties = value;
            }

            @objid ("30e0af09-5122-4899-844c-f44003800d86")
            @Override
            public SmDependency getSymetric() {
                return AnalystPropertyTableData.Metadata.AnalystOwnerDep();
            }

        }

    }

}
