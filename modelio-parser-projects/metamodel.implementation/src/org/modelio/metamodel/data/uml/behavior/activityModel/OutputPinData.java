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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityActionData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.OutputPinImpl;
import org.modelio.metamodel.uml.behavior.activityModel.OutputPin;
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

@objid ("003b23ec-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=OutputPin.class, factory=OutputPinData.Metadata.ObjectFactory.class)
public class OutputPinData extends PinData {
    @objid ("a62c2427-dc8d-4b11-becb-ea87f4293cba")
    @SmaMetaAssociation(metaName="Outputing", typeDataClass=ActivityActionData.class, min=0, max=1, smAssociationClass=Metadata.OutputingSmDependency.class)
     SmObjectImpl mOutputing;

    @objid ("70640805-bcb3-47ef-83aa-f213211e8075")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050c058-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e8ec790a-4c6d-4acf-8bf1-10c0a4783428")
        private static SmClass smClass = null;

        @objid ("1f04e7d0-4080-4d31-a8d5-44d8d78fdbd6")
        private static SmDependency OutputingDep = null;

        @objid ("c8fc5c68-6c10-46f7-a607-d137fe118479")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OutputPinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("32d4a97a-fb0f-40e2-9bd2-7c706aca5c4d")
        public static SmDependency OutputingDep() {
            if (OutputingDep == null) {
            	OutputingDep = classof().getDependencyDef("Outputing");
            }
            return OutputingDep;
        }

        @objid ("7873a5fc-d831-4b9a-a0bc-e6620f1e0517")
        public static SmDependency getOutputingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputingDep;
        }

        @objid ("3ecb40be-56ac-45e1-a2e0-97412743cb13")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00510252-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6fee5c3f-3db0-4b40-818b-4a382e17da00")
            public ISmObjectData createData() {
                return new OutputPinData();
            }

            @objid ("1d777a21-8e47-4c7e-a4d9-90c34c501cbb")
            public SmObjectImpl createImpl() {
                return new OutputPinImpl();
            }

        }

        @objid ("00516562-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutputingSmDependency extends SmSingleDependency {
            @objid ("d6da712c-886e-4bfb-8f67-6859068f78b4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OutputPinData) data).mOutputing;
            }

            @objid ("2cb744e2-7a34-41ec-941e-f5c035c24ab5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OutputPinData) data).mOutputing = value;
            }

            @objid ("09a094d9-fa22-46b5-af11-ba284447c8ff")
            @Override
            public SmDependency getSymetric() {
                return ActivityActionData.Metadata.OutputDep();
            }

        }

    }

}
