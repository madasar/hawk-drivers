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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ConstraintData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.DurationConstraintImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.DurationConstraint;
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

@objid ("00441e70-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DurationConstraint.class, factory=DurationConstraintData.Metadata.ObjectFactory.class)
public class DurationConstraintData extends ConstraintData {
    @objid ("26a09dcd-20a6-47af-9bcc-c8519bbb31a5")
    @SmaMetaAttribute(metaName="DurationMin", type=String.class, smAttributeClass=Metadata.DurationMinSmAttribute.class)
     Object mDurationMin = "";

    @objid ("362b68c0-73eb-47c6-ad2f-dca94e2b23b3")
    @SmaMetaAttribute(metaName="DurationMax", type=String.class, smAttributeClass=Metadata.DurationMaxSmAttribute.class)
     Object mDurationMax = "";

    @objid ("6e602944-efb1-4564-8cbe-913ee61eece1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0042d6fa-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("146c0606-f07a-48b1-af35-62b4d02ab1fe")
        private static SmClass smClass = null;

        @objid ("4d88ec74-6405-4752-9661-5f1c6dc68c67")
        private static SmAttribute DurationMinAtt = null;

        @objid ("b0102215-1e83-4005-a103-68ee997d2564")
        private static SmAttribute DurationMaxAtt = null;

        @objid ("e888be89-9ffd-4f8e-8698-24fa7e906c1c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DurationConstraintData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d4b2c55b-1e8c-4dda-b2b7-cadc54cdf7c7")
        public static SmAttribute DurationMinAtt() {
            if (DurationMinAtt == null) {
            	DurationMinAtt = classof().getAttributeDef("DurationMin");
            }
            return DurationMinAtt;
        }

        @objid ("e5c2e910-282d-47c9-b155-e4b3fc4467cb")
        public static SmAttribute DurationMaxAtt() {
            if (DurationMaxAtt == null) {
            	DurationMaxAtt = classof().getAttributeDef("DurationMax");
            }
            return DurationMaxAtt;
        }

        @objid ("ab285cb1-e20a-4e6b-a063-bbbb36f1ec37")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6732f379-4745-45aa-bcce-30275f2f93ef")
        public static SmAttribute getDurationMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DurationMaxAtt;
        }

        @objid ("ff018b93-a7d2-4994-80a3-7e47f951dd25")
        public static SmAttribute getDurationMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DurationMinAtt;
        }

        @objid ("00432452-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("83bed663-cd86-411f-86a0-8d91fec3dcf8")
            public ISmObjectData createData() {
                return new DurationConstraintData();
            }

            @objid ("4ee8fb14-54e2-4acd-b271-b3e4543a25ab")
            public SmObjectImpl createImpl() {
                return new DurationConstraintImpl();
            }

        }

        @objid ("004387e4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DurationMinSmAttribute extends SmAttribute {
            @objid ("212e0aa6-99fe-457e-937d-a320f09c9095")
            public Object getValue(ISmObjectData data) {
                return ((DurationConstraintData) data).mDurationMin;
            }

            @objid ("525a1e66-df38-469e-91b2-2e7920413118")
            public void setValue(ISmObjectData data, Object value) {
                ((DurationConstraintData) data).mDurationMin = value;
            }

        }

        @objid ("0043e996-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DurationMaxSmAttribute extends SmAttribute {
            @objid ("4658f6fa-0581-4c0f-94a3-fea9f4ae8896")
            public Object getValue(ISmObjectData data) {
                return ((DurationConstraintData) data).mDurationMax;
            }

            @objid ("e498e046-9d55-45cb-aad6-36545902bfc2")
            public void setValue(ISmObjectData data, Object value) {
                ((DurationConstraintData) data).mDurationMax = value;
            }

        }

    }

}
