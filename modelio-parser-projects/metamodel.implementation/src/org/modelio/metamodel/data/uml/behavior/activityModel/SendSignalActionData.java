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
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.SendSignalActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
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

@objid ("003db58a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=SendSignalAction.class, factory=SendSignalActionData.Metadata.ObjectFactory.class)
public class SendSignalActionData extends ActivityActionData {
    @objid ("877812cd-0d7e-4db6-9c60-1971fc5d4568")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SentSmDependency.class, partof = true)
     SmObjectImpl mSent;

    @objid ("78af1150-3a48-45e9-a69a-3e28e8e6d5ef")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0071b484-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0c3922c8-dd02-4d00-a4a4-9986092fd522")
        private static SmClass smClass = null;

        @objid ("261dd45c-36fe-4e26-830d-33aa1a099841")
        private static SmDependency SentDep = null;

        @objid ("0201d4e9-9b08-4e51-b1b5-217f573556fc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SendSignalActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7d3f711a-c137-4c27-906e-dd3c0d4cf9bc")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("44716355-90e1-41e0-92c7-887b1472fdd5")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("3b07489b-7338-425d-8be7-94e9d04dcf20")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0071f6b0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4924b17c-2d94-4bc3-bf43-459274466ad7")
            public ISmObjectData createData() {
                return new SendSignalActionData();
            }

            @objid ("bd221da4-c9cb-440e-8623-f8afc941bdde")
            public SmObjectImpl createImpl() {
                return new SendSignalActionImpl();
            }

        }

        @objid ("00725a4c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SentSmDependency extends SmSingleDependency {
            @objid ("ea0b2973-b505-474e-a2d7-6ea65c13bc20")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SendSignalActionData) data).mSent;
            }

            @objid ("7113f4ca-8045-4788-ab0e-a9da71a6bb4a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SendSignalActionData) data).mSent = value;
            }

            @objid ("69d20555-73a0-4d9a-b7af-4aa89c3b339b")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.SenderDep();
            }

        }

    }

}
