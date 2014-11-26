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
import org.modelio.metamodel.impl.uml.behavior.activityModel.CallActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.CallAction;
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

@objid ("002ac010-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CallAction.class, factory=CallActionData.Metadata.ObjectFactory.class)
public abstract class CallActionData extends ActivityActionData {
    @objid ("5e47e183-3be5-40dd-a844-8fdfbe0261e6")
    @SmaMetaAttribute(metaName="IsSynchronous", type=Boolean.class, smAttributeClass=Metadata.IsSynchronousSmAttribute.class)
     Object mIsSynchronous = true;

    @objid ("e4ed8139-8b88-43be-9a94-7e0bbd6ff41b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0080c50a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ea09a76e-8eb0-4efc-9566-98e05761a50a")
        private static SmClass smClass = null;

        @objid ("ca86d477-3ef4-4517-8092-cceb3823962d")
        private static SmAttribute IsSynchronousAtt = null;

        @objid ("a304d9dd-8bf4-4a63-81a9-2209245e9035")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CallActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("07134e78-dbc4-4478-8c76-31ab3c18cf3a")
        public static SmAttribute IsSynchronousAtt() {
            if (IsSynchronousAtt == null) {
            	IsSynchronousAtt = classof().getAttributeDef("IsSynchronous");
            }
            return IsSynchronousAtt;
        }

        @objid ("30856ffc-d816-4fec-8953-7dba878eced1")
        public static SmAttribute getIsSynchronousAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSynchronousAtt;
        }

        @objid ("88b7b498-cdd9-468f-bae3-bf72d08ffae7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0081063c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("12b155fd-4a4c-4429-a64b-d7697366cdf0")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("3a23176f-0fb1-4e2e-9ce9-66deaf879283")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0081683e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsSynchronousSmAttribute extends SmAttribute {
            @objid ("341a2340-d92c-4cd3-9f73-a923d13aef47")
            public Object getValue(ISmObjectData data) {
                return ((CallActionData) data).mIsSynchronous;
            }

            @objid ("c22cf402-bb58-4992-a3d5-91d03acaf8b8")
            public void setValue(ISmObjectData data, Object value) {
                ((CallActionData) data).mIsSynchronous = value;
            }

        }

    }

}
