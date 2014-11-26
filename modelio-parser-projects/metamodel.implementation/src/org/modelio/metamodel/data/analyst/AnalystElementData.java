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
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.impl.analyst.AnalystElementImpl;
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

@objid ("c469b8a6-17c2-4568-b3ee-39110eb6291b")
@SmaMetaClass(mmClass=AnalystElement.class, factory=AnalystElementData.Metadata.ObjectFactory.class)
public abstract class AnalystElementData extends AnalystItemData {
    @objid ("cd540ba1-5060-4db5-9aef-1ea6198894d3")
    @SmaMetaAttribute(metaName="Version", type=Integer.class, smAttributeClass=Metadata.VersionSmAttribute.class)
     Object mVersion = 0;

    @objid ("d22c4fa6-b65a-47b1-abd7-79e5bf6f5c79")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("35ee7ca1-df47-49be-a357-598ee4c4efd2")
    public static class Metadata {
        @objid ("8cd68471-6a85-4e6d-bc9d-43bda57655c1")
        private static SmClass smClass = null;

        @objid ("4467c74b-ffc2-4a80-897a-a0d35686ddc7")
        private static SmAttribute VersionAtt = null;

        @objid ("47fe18a5-8a24-45f2-aa96-548d9f017f22")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("27235fb8-9690-4080-b123-a470907bf980")
        public static SmAttribute VersionAtt() {
            if (VersionAtt == null) {
            	VersionAtt = classof().getAttributeDef("Version");
            }
            return VersionAtt;
        }

        @objid ("1e2c8450-c1a0-48f8-91c5-795527e2745b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0221b992-f575-40fd-9fcf-da01c224e70d")
        public static SmAttribute getVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VersionAtt;
        }

        @objid ("10a7b11d-a7cb-4dfa-be29-d2f8c7d0664f")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0a0a0aff-5905-4bfb-a60c-03a1cc667c42")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("0f1a7226-824e-4717-a57d-963378ddd292")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("ddf3e6b1-a5ae-4d61-a56f-9f24fc09be38")
        public static class VersionSmAttribute extends SmAttribute {
            @objid ("78356e9f-9374-42ec-be30-da06f9f372b7")
            public Object getValue(ISmObjectData data) {
                return ((AnalystElementData) data).mVersion;
            }

            @objid ("79ce5b5e-86b9-4ac1-9b1c-7ca9d8a51616")
            public void setValue(ISmObjectData data, Object value) {
                ((AnalystElementData) data).mVersion = value;
            }

        }

    }

}
