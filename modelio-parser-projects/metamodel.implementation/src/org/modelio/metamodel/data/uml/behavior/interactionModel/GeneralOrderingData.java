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
import org.modelio.metamodel.data.uml.behavior.interactionModel.OccurrenceSpecificationData;
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.GeneralOrderingImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;
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

@objid ("0046463c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=GeneralOrdering.class, factory=GeneralOrderingData.Metadata.ObjectFactory.class)
public class GeneralOrderingData extends ElementData {
    @objid ("3e83da7e-c10f-4356-b8c6-a751797ed820")
    @SmaMetaAssociation(metaName="Before", typeDataClass=OccurrenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.BeforeSmDependency.class)
     SmObjectImpl mBefore;

    @objid ("5a319797-1559-469f-afd9-0583c334dcf4")
    @SmaMetaAssociation(metaName="After", typeDataClass=OccurrenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.AfterSmDependency.class, partof = true)
     SmObjectImpl mAfter;

    @objid ("c9f66cce-840c-4481-b36c-2ebb69ec4c4d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0015b59e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d9011e5e-a3cb-4d2a-889a-c2c2c4e49476")
        private static SmClass smClass = null;

        @objid ("f116a00f-ab51-40bb-9136-c4b76106bc6b")
        private static SmDependency BeforeDep = null;

        @objid ("72a3753d-22e9-4f81-8968-fad420fb3780")
        private static SmDependency AfterDep = null;

        @objid ("6df5c897-de59-4e8c-8299-b3cdf7a64ddc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GeneralOrderingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a6bf4e23-0996-4f41-95c0-cb8c0bded099")
        public static SmDependency BeforeDep() {
            if (BeforeDep == null) {
            	BeforeDep = classof().getDependencyDef("Before");
            }
            return BeforeDep;
        }

        @objid ("01bb0485-bb97-4dc1-91d3-3b630391af87")
        public static SmDependency AfterDep() {
            if (AfterDep == null) {
            	AfterDep = classof().getDependencyDef("After");
            }
            return AfterDep;
        }

        @objid ("8e6b2c84-37c3-4060-ae9a-76dab8e2cffe")
        public static SmDependency getAfterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AfterDep;
        }

        @objid ("d3394e4e-1db3-4253-ba00-4762b0f73cec")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("598fe0d1-3db3-40db-ba6c-5b6eb1ca2769")
        public static SmDependency getBeforeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BeforeDep;
        }

        @objid ("0015f6d0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("502ff22e-8b5b-4ccd-8761-b670b69320cc")
            public ISmObjectData createData() {
                return new GeneralOrderingData();
            }

            @objid ("50eca1ca-e674-4a9f-8d68-c299273128a8")
            public SmObjectImpl createImpl() {
                return new GeneralOrderingImpl();
            }

        }

        @objid ("00165bca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class AfterSmDependency extends SmSingleDependency {
            @objid ("6978cbe0-9e65-41a7-b917-a3f1c54082dc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralOrderingData) data).mAfter;
            }

            @objid ("94b4cce1-9156-4a14-ae15-44f843e5c49e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralOrderingData) data).mAfter = value;
            }

            @objid ("675566ef-e011-4e80-b5f4-6042ba440ade")
            @Override
            public SmDependency getSymetric() {
                return OccurrenceSpecificationData.Metadata.ToBeforeDep();
            }

        }

        @objid ("0016d078-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BeforeSmDependency extends SmSingleDependency {
            @objid ("fe797a5a-6ebf-42a6-94cf-2ce44f559099")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralOrderingData) data).mBefore;
            }

            @objid ("9fbcfaef-98e3-4a99-bcd8-48dc41b2d652")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralOrderingData) data).mBefore = value;
            }

            @objid ("d9856b37-35db-4899-bac0-a807cd184ce3")
            @Override
            public SmDependency getSymetric() {
                return OccurrenceSpecificationData.Metadata.ToAfterDep();
            }

        }

    }

}
