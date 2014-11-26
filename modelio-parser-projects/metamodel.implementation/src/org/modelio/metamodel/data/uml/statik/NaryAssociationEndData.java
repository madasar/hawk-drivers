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
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.NaryAssociationData;
import org.modelio.metamodel.impl.uml.statik.NaryAssociationEndImpl;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
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

@objid ("00211b5a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=NaryAssociationEnd.class, factory=NaryAssociationEndData.Metadata.ObjectFactory.class)
public class NaryAssociationEndData extends StructuralFeatureData {
    @objid ("b083d0db-e9f9-4293-8a20-37648a5c41d8")
    @SmaMetaAssociation(metaName="NaryAssociation", typeDataClass=NaryAssociationData.class, min=1, max=1, smAssociationClass=Metadata.NaryAssociationSmDependency.class, sharedComponent = true)
     SmObjectImpl mNaryAssociation;

    @objid ("18396c23-201a-41e9-9723-8563847e5601")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ClassifierData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("9df26006-84fe-469d-a1b6-bde3abc8a478")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000d229e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f11f0963-26b3-429a-a70f-2886885c474c")
        private static SmClass smClass = null;

        @objid ("c5cf0584-b123-4394-91ae-39fe702e46ee")
        private static SmDependency NaryAssociationDep = null;

        @objid ("91d11a69-9a78-4dfc-a892-93f1b2efe519")
        private static SmDependency OwnerDep = null;

        @objid ("78a44c35-9214-4ab0-978e-d505b86bad07")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryAssociationEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("90037472-95b3-46b6-9ea2-49dea126adf4")
        public static SmDependency NaryAssociationDep() {
            if (NaryAssociationDep == null) {
            	NaryAssociationDep = classof().getDependencyDef("NaryAssociation");
            }
            return NaryAssociationDep;
        }

        @objid ("e1a6eef1-82b2-47c7-944d-865bba0e3257")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("e76554d8-ca0f-4bbe-9444-eb794c9ae1a5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5cfd2a42-0298-4fdc-90d9-cb22eb6afc50")
        public static SmDependency getNaryAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryAssociationDep;
        }

        @objid ("184fb1c1-1215-462d-9a9e-11f3436d869b")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("000d78ca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a966b7d2-c4f6-4cfa-89d0-c1f47f9d1d0b")
            public ISmObjectData createData() {
                return new NaryAssociationEndData();
            }

            @objid ("88a2c3d2-0636-429b-9eab-bc58756e8ee5")
            public SmObjectImpl createImpl() {
                return new NaryAssociationEndImpl();
            }

        }

        @objid ("000df32c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("48154986-43a1-44b0-9397-fb66a16da324")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryAssociationEndData) data).mOwner;
            }

            @objid ("e3ca5f87-98f7-40fe-92ce-de0fd90c14fb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryAssociationEndData) data).mOwner = value;
            }

            @objid ("619e7cf3-0ff4-447e-bdd6-a62963e3b8c8")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedNaryEndDep();
            }

        }

        @objid ("000e7004-c4c4-1fd8-97fe-001ec947cd2a")
        public static class NaryAssociationSmDependency extends SmSingleDependency {
            @objid ("304cbfb3-093f-4972-a5c4-c3a5c961c0a2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryAssociationEndData) data).mNaryAssociation;
            }

            @objid ("d951ba62-d12f-4a30-b07a-cb7c9b76f12c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryAssociationEndData) data).mNaryAssociation = value;
            }

            @objid ("a410a6e5-35c4-4517-a728-54c0891ae450")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationData.Metadata.NaryEndDep();
            }

        }

    }

}
