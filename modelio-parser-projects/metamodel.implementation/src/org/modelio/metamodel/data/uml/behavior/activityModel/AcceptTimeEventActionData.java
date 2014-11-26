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
import org.modelio.metamodel.impl.uml.behavior.activityModel.AcceptTimeEventActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptTimeEventAction;
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

@objid ("0025dabe-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AcceptTimeEventAction.class, factory=AcceptTimeEventActionData.Metadata.ObjectFactory.class)
public class AcceptTimeEventActionData extends ActivityActionData {
    @objid ("f6fb25ed-7dcf-436c-b155-d3de044b4ccc")
    @SmaMetaAttribute(metaName="TimeExpresion", type=String.class, smAttributeClass=Metadata.TimeExpresionSmAttribute.class)
     Object mTimeExpresion = "";

    @objid ("ca30a777-f634-4c13-8fbd-b0c429e0561b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000f808e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("239d5f96-318f-4b03-ae8a-59af25b41d6d")
        private static SmClass smClass = null;

        @objid ("2f8bcbe4-0864-4fb1-bf1d-4f845f6942c7")
        private static SmAttribute TimeExpresionAtt = null;

        @objid ("4b8f6f0c-307b-4413-9610-b60216f15295")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptTimeEventActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("02962ce3-5068-4aa7-9672-16c0a720e78b")
        public static SmAttribute TimeExpresionAtt() {
            if (TimeExpresionAtt == null) {
            	TimeExpresionAtt = classof().getAttributeDef("TimeExpresion");
            }
            return TimeExpresionAtt;
        }

        @objid ("221ffb4e-5bf6-4b0c-a9e1-084e5e110aa7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4b6f58de-e4fc-488b-93e1-34fce864be95")
        public static SmAttribute getTimeExpresionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TimeExpresionAtt;
        }

        @objid ("000fc2ec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6892460d-5a57-4d88-87ae-72c7048eab17")
            public ISmObjectData createData() {
                return new AcceptTimeEventActionData();
            }

            @objid ("512d2a22-f230-4c67-821c-d5514a4d3121")
            public SmObjectImpl createImpl() {
                return new AcceptTimeEventActionImpl();
            }

        }

        @objid ("00102584-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TimeExpresionSmAttribute extends SmAttribute {
            @objid ("3911de83-8c2b-40c6-a25b-29897175b366")
            public Object getValue(ISmObjectData data) {
                return ((AcceptTimeEventActionData) data).mTimeExpresion;
            }

            @objid ("471a8bb7-0aec-4362-8707-a23c0db1a577")
            public void setValue(ISmObjectData data, Object value) {
                ((AcceptTimeEventActionData) data).mTimeExpresion = value;
            }

        }

    }

}
