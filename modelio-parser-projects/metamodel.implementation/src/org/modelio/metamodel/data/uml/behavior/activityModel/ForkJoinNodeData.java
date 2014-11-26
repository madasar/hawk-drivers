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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ForkJoinNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ForkJoinNode;
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

@objid ("00341f8e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ForkJoinNode.class, factory=ForkJoinNodeData.Metadata.ObjectFactory.class)
public class ForkJoinNodeData extends ControlNodeData {
    @objid ("fb4bf661-a730-4fd7-bb49-faa510867009")
    @SmaMetaAttribute(metaName="IsCombineDuplicate", type=Boolean.class, smAttributeClass=Metadata.IsCombineDuplicateSmAttribute.class)
     Object mIsCombineDuplicate = true;

    @objid ("de0d3490-6c83-4627-b14b-bad295a1dcbe")
    @SmaMetaAttribute(metaName="JoinSpec", type=String.class, smAttributeClass=Metadata.JoinSpecSmAttribute.class)
     Object mJoinSpec = "and";

    @objid ("63736b2c-6077-4c39-8f35-604d5c20a85e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004db002-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("64428042-6c4f-4b75-b6e1-cc20c0e521a9")
        private static SmClass smClass = null;

        @objid ("5f41d8df-934a-4bbb-b4ec-e76e5d053cba")
        private static SmAttribute IsCombineDuplicateAtt = null;

        @objid ("827d7a79-cff0-454d-95b8-be5e8fec8a45")
        private static SmAttribute JoinSpecAtt = null;

        @objid ("60dff3fb-cb48-466e-8e15-864b0f0f40db")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ForkJoinNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9486c642-1336-46a3-b47c-85e037ad5fa9")
        public static SmAttribute IsCombineDuplicateAtt() {
            if (IsCombineDuplicateAtt == null) {
            	IsCombineDuplicateAtt = classof().getAttributeDef("IsCombineDuplicate");
            }
            return IsCombineDuplicateAtt;
        }

        @objid ("5753f07d-a780-4716-9887-d87de96d9530")
        public static SmAttribute JoinSpecAtt() {
            if (JoinSpecAtt == null) {
            	JoinSpecAtt = classof().getAttributeDef("JoinSpec");
            }
            return JoinSpecAtt;
        }

        @objid ("7ad0bbdd-e601-4655-9599-a9c04e29f7b3")
        public static SmAttribute getJoinSpecAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return JoinSpecAtt;
        }

        @objid ("b5fc3b8b-a60c-4df2-ae2b-dd6ae518875d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("97f9956e-67c0-4842-967a-fdfb9671bf1f")
        public static SmAttribute getIsCombineDuplicateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsCombineDuplicateAtt;
        }

        @objid ("004df1b6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bceb8fc6-5635-4183-91a5-c8e896ff16e8")
            public ISmObjectData createData() {
                return new ForkJoinNodeData();
            }

            @objid ("2ef03141-363f-47b1-b601-9d818a7bfefe")
            public SmObjectImpl createImpl() {
                return new ForkJoinNodeImpl();
            }

        }

        @objid ("004e5a70-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsCombineDuplicateSmAttribute extends SmAttribute {
            @objid ("35237055-dd87-4611-ba5c-36f7f0850d99")
            public Object getValue(ISmObjectData data) {
                return ((ForkJoinNodeData) data).mIsCombineDuplicate;
            }

            @objid ("05f2ede3-0d29-463d-af0d-9a681e2c1f9c")
            public void setValue(ISmObjectData data, Object value) {
                ((ForkJoinNodeData) data).mIsCombineDuplicate = value;
            }

        }

        @objid ("004ebd44-c4c2-1fd8-97fe-001ec947cd2a")
        public static class JoinSpecSmAttribute extends SmAttribute {
            @objid ("7cb35061-ab12-4c23-985e-f00fc739b0ba")
            public Object getValue(ISmObjectData data) {
                return ((ForkJoinNodeData) data).mJoinSpec;
            }

            @objid ("da827d56-d294-4b81-8fbf-0094e2963ebb")
            public void setValue(ISmObjectData data, Object value) {
                ((ForkJoinNodeData) data).mJoinSpec = value;
            }

        }

    }

}
