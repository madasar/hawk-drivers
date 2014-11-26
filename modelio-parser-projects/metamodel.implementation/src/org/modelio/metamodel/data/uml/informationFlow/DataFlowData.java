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
package org.modelio.metamodel.data.uml.informationFlow;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.impl.uml.informationFlow.DataFlowImpl;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
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

@objid ("0064a956-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DataFlow.class, factory=DataFlowData.Metadata.ObjectFactory.class)
public class DataFlowData extends ModelElementData {
    @objid ("148c0439-ea81-4e30-984e-fd55a632442b")
    @SmaMetaAssociation(metaName="Destination", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.DestinationSmDependency.class, partof = true)
     SmObjectImpl mDestination;

    @objid ("b894d8d9-7f0f-4a96-a425-87de5bf0289b")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OriginSmDependency.class)
     SmObjectImpl mOrigin;

    @objid ("e1c103f4-b924-4ce2-a79a-8ef59413f96a")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("e865eb9f-0dbc-4f21-a48c-3ab3366b803b")
    @SmaMetaAssociation(metaName="SModel", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SModelSmDependency.class, partof = true)
     SmObjectImpl mSModel;

    @objid ("cae2791b-ffa7-4b86-9613-f8fc26aab9fa")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006103dc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bdc157fb-eb1d-4b4c-adf0-556523da6e42")
        private static SmClass smClass = null;

        @objid ("1104c453-6fd7-4f65-853b-3edbb4f29645")
        private static SmDependency DestinationDep = null;

        @objid ("64c9c986-7494-4354-bb35-dbc69f94acec")
        private static SmDependency OriginDep = null;

        @objid ("ae9dcf70-7028-4826-87a3-57401ff6b9aa")
        private static SmDependency OwnerDep = null;

        @objid ("07f31404-06a9-4744-846b-5e8def7ca9c4")
        private static SmDependency SModelDep = null;

        @objid ("2caf90bf-d195-4860-a17f-6964172e0a4e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DataFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8f53e255-40f5-4d42-b165-0bfd420c0098")
        public static SmDependency DestinationDep() {
            if (DestinationDep == null) {
            	DestinationDep = classof().getDependencyDef("Destination");
            }
            return DestinationDep;
        }

        @objid ("9b480976-2e88-432d-a7dd-8269dc407be7")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("0a1572ee-c122-4d70-90df-d04bb158cb49")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("213e8462-80a9-4e55-9315-72b7d260c4b9")
        public static SmDependency SModelDep() {
            if (SModelDep == null) {
            	SModelDep = classof().getDependencyDef("SModel");
            }
            return SModelDep;
        }

        @objid ("d260b63e-4c1c-4a16-9d45-0b123288a2a4")
        public static SmDependency getDestinationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DestinationDep;
        }

        @objid ("c8d8ffb1-3bcf-43de-b519-2707fb374578")
        public static SmDependency getSModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SModelDep;
        }

        @objid ("0c170f19-a841-4fd7-b78e-e1fa8f64bd89")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("4a3de9d1-c60a-4ccf-bdb3-337b71471e49")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("4004fddb-0e25-488c-8b01-ebf75fdd4d5d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00614504-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c92f3a43-c11d-47b0-98b2-56cc715f4b68")
            public ISmObjectData createData() {
                return new DataFlowData();
            }

            @objid ("214a7a7b-064e-49f1-a124-45bc1d5e318a")
            public SmObjectImpl createImpl() {
                return new DataFlowImpl();
            }

        }

        @objid ("0061a666-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DestinationSmDependency extends SmSingleDependency {
            @objid ("738cd7f9-b7d2-4774-a971-070f19203166")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mDestination;
            }

            @objid ("77097905-620a-4dc5-868e-2815fd9567be")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mDestination = value;
            }

            @objid ("4ba4df43-a671-49bc-8d4f-3edfdc19c9c2")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.ReceivedDep();
            }

        }

        @objid ("00621984-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmSingleDependency {
            @objid ("1e6f54f6-da9f-4807-9185-9dbbe7199117")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mOrigin;
            }

            @objid ("2c0a1de6-c880-4adf-9ff8-b805a7cf35eb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mOrigin = value;
            }

            @objid ("c083e8da-82bd-4f6a-a501-b17f3d968c4b")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.SentDep();
            }

        }

        @objid ("00628d88-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("feb6aa25-f093-40ce-866d-2cc98dd8af62")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mOwner;
            }

            @objid ("cfaf7883-7092-4df6-bf60-705151a4acb9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mOwner = value;
            }

            @objid ("02aa8d36-c0e7-4268-959e-9685ae3a3bcf")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedDataFlowDep();
            }

        }

        @objid ("00630362-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SModelSmDependency extends SmSingleDependency {
            @objid ("082abae7-4465-4422-90f3-eeaad116ddcc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mSModel;
            }

            @objid ("3cf67144-8230-4579-9100-5f775ab19810")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mSModel = value;
            }

            @objid ("7dce8ade-063b-49fb-a2e3-3fa28173f446")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.DOccurenceDep();
            }

        }

    }

}
