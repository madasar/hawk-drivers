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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.statik.RaisedExceptionImpl;
import org.modelio.metamodel.uml.statik.RaisedException;
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

@objid ("001afd60-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=RaisedException.class, factory=RaisedExceptionData.Metadata.ObjectFactory.class)
public class RaisedExceptionData extends ModelElementData {
    @objid ("61179c75-5d23-4e84-9c1f-5c0983d78359")
    @SmaMetaAssociation(metaName="ThrownType", typeDataClass=ClassifierData.class, min=1, max=1, smAssociationClass=Metadata.ThrownTypeSmDependency.class, partof = true)
     SmObjectImpl mThrownType;

    @objid ("ea7b4534-daf0-43be-97e7-21286bf5b7da")
    @SmaMetaAssociation(metaName="Thrower", typeDataClass=OperationData.class, min=1, max=1, smAssociationClass=Metadata.ThrowerSmDependency.class)
     SmObjectImpl mThrower;

    @objid ("ada34a31-40ad-4a2a-bd96-cb96bfe7a2d9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0032c044-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("42852c73-2416-4a39-ab63-91ff4f0a63eb")
        private static SmClass smClass = null;

        @objid ("0b77b01f-6e26-4a3f-abde-25605f66951d")
        private static SmDependency ThrownTypeDep = null;

        @objid ("44e1333e-a9a0-4122-bc47-c4b9132a9b6a")
        private static SmDependency ThrowerDep = null;

        @objid ("3d92dbca-395a-4b54-bbf8-cdfbf4442ca4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RaisedExceptionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3507c09e-e4b4-4d34-83f5-cb8cefec693d")
        public static SmDependency ThrownTypeDep() {
            if (ThrownTypeDep == null) {
            	ThrownTypeDep = classof().getDependencyDef("ThrownType");
            }
            return ThrownTypeDep;
        }

        @objid ("850f582b-f2b7-4c56-9fea-0ab731e06acd")
        public static SmDependency ThrowerDep() {
            if (ThrowerDep == null) {
            	ThrowerDep = classof().getDependencyDef("Thrower");
            }
            return ThrowerDep;
        }

        @objid ("f539fb4e-b4d0-4df2-a3ed-f06c37c9707d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("50e39704-f203-44fc-a276-47927a587dd6")
        public static SmDependency getThrownTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ThrownTypeDep;
        }

        @objid ("36fc398f-14db-4d4b-94bd-424e92a47475")
        public static SmDependency getThrowerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ThrowerDep;
        }

        @objid ("00330270-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c2c344d4-0c9f-4a18-9be4-95353f5badf6")
            public ISmObjectData createData() {
                return new RaisedExceptionData();
            }

            @objid ("5526dd5f-8204-4df8-9070-996fcb991bab")
            public SmObjectImpl createImpl() {
                return new RaisedExceptionImpl();
            }

        }

        @objid ("003366fc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ThrowerSmDependency extends SmSingleDependency {
            @objid ("7c67f7d4-90ae-454b-8185-4abc49c8db26")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RaisedExceptionData) data).mThrower;
            }

            @objid ("8bb5b658-b9dc-42b6-957a-28523ee3903e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RaisedExceptionData) data).mThrower = value;
            }

            @objid ("f2237609-0262-4733-bc54-c19288b90441")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.ThrownDep();
            }

        }

        @objid ("0033db82-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ThrownTypeSmDependency extends SmSingleDependency {
            @objid ("0c7c47c9-8344-4f42-991e-a84dafc8c5c7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RaisedExceptionData) data).mThrownType;
            }

            @objid ("2df84b69-411b-4f6f-b7b5-3b98defd6b77")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RaisedExceptionData) data).mThrownType = value;
            }

            @objid ("cf21fb11-df7e-4808-b387-9e2cce4e16ce")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.ThrowingDep();
            }

        }

    }

}
