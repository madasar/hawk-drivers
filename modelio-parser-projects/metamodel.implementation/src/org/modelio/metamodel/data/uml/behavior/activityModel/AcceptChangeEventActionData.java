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
import org.modelio.metamodel.impl.uml.behavior.activityModel.AcceptChangeEventActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptChangeEventAction;
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

@objid ("0024e258-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AcceptChangeEventAction.class, factory=AcceptChangeEventActionData.Metadata.ObjectFactory.class)
public class AcceptChangeEventActionData extends ActivityActionData {
    @objid ("b7500de3-9d75-4e3e-a9b9-e91d9727e5a2")
    @SmaMetaAttribute(metaName="ChangeExpresion", type=String.class, smAttributeClass=Metadata.ChangeExpresionSmAttribute.class)
     Object mChangeExpresion = "";

    @objid ("70094174-2e86-44d3-be87-2d0bdd12abe7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001765b0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b2496822-4089-45e9-98ce-28e6cbd369c8")
        private static SmClass smClass = null;

        @objid ("59bef425-623f-434c-848f-c2efe34d4327")
        private static SmAttribute ChangeExpresionAtt = null;

        @objid ("018adefe-7c82-4faa-b77f-95d42a79cda3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptChangeEventActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a8b19081-defc-4856-97eb-09b758e6962b")
        public static SmAttribute ChangeExpresionAtt() {
            if (ChangeExpresionAtt == null) {
            	ChangeExpresionAtt = classof().getAttributeDef("ChangeExpresion");
            }
            return ChangeExpresionAtt;
        }

        @objid ("cbcae6c5-1f73-4067-b6ee-892849bb803a")
        public static SmAttribute getChangeExpresionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChangeExpresionAtt;
        }

        @objid ("c3292be1-af8b-4fe5-98f6-59fbc443c468")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0017a908-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fe54ae7f-027f-41cd-9b50-c9b9d91aa1ac")
            public ISmObjectData createData() {
                return new AcceptChangeEventActionData();
            }

            @objid ("bd1c05ed-f295-46ca-866b-f8841351a1b9")
            public SmObjectImpl createImpl() {
                return new AcceptChangeEventActionImpl();
            }

        }

        @objid ("00180c9a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ChangeExpresionSmAttribute extends SmAttribute {
            @objid ("583ae429-db68-440d-89fc-c832b39a2b83")
            public Object getValue(ISmObjectData data) {
                return ((AcceptChangeEventActionData) data).mChangeExpresion;
            }

            @objid ("ed1da4e2-c7bc-428f-b5f3-6a88752cbe81")
            public void setValue(ISmObjectData data, Object value) {
                ((AcceptChangeEventActionData) data).mChangeExpresion = value;
            }

        }

    }

}
