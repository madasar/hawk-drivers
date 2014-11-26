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
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateMachineData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateVertexData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.RegionImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
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

@objid ("005749aa-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Region.class, factory=RegionData.Metadata.ObjectFactory.class)
public class RegionData extends ModelElementData {
    @objid ("c5ab1a1b-930b-4a4f-82f3-466de8bdc32c")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class)
     SmObjectImpl mParent;

    @objid ("474146a5-8005-42a6-ade5-a1bb2c9b9f87")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class)
     SmObjectImpl mRepresented;

    @objid ("1c37ae39-21c9-4b95-bc20-ef71eff9b275")
    @SmaMetaAssociation(metaName="Sub", typeDataClass=StateVertexData.class, min=0, max=-1, smAssociationClass=Metadata.SubSmDependency.class, component = true)
     List<SmObjectImpl> mSub = null;

    @objid ("bbcb651b-1cdc-45b6-ab0f-a42bd346faee")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00772356-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5e9eef90-b56c-46a7-b626-0b8827056c76")
        private static SmClass smClass = null;

        @objid ("858fcc29-f677-49ee-849d-162d29961142")
        private static SmDependency ParentDep = null;

        @objid ("415ccb30-13ba-436f-8c0b-5859b81cd70e")
        private static SmDependency RepresentedDep = null;

        @objid ("6709ca9a-a4f5-4df8-bc14-9caa82107bec")
        private static SmDependency SubDep = null;

        @objid ("a5acca48-aad7-494b-b3ed-2a7ceb9aa932")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RegionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9c4212a7-786d-445b-bf45-26aca2312948")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("6cfbc33a-8ede-4ed8-acbb-05268c119e55")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("b068cd86-bbd9-46aa-af41-28e866f7fb83")
        public static SmDependency SubDep() {
            if (SubDep == null) {
            	SubDep = classof().getDependencyDef("Sub");
            }
            return SubDep;
        }

        @objid ("fbb1a4cd-a265-40cc-8479-8668bdcdc86c")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("25cbbb6d-00e7-4723-a8ac-d042761dce80")
        public static SmDependency getSubDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubDep;
        }

        @objid ("7e28a4b7-9f77-4124-adfa-3bd4a1b7a22e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("dcce9aab-73bb-43d4-8fdf-8ccbd9f46ab3")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("00776604-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2e86bfe5-c2b1-45ee-a481-a28c145f75b8")
            public ISmObjectData createData() {
                return new RegionData();
            }

            @objid ("fc163bf6-a6ce-4fa7-8fb0-d72c107fd87b")
            public SmObjectImpl createImpl() {
                return new RegionImpl();
            }

        }

        @objid ("0077ca40-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("e273360c-040b-42fe-bfde-55573e77701d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RegionData) data).mRepresented;
            }

            @objid ("151b900b-55b3-46fc-8642-a65feffd6c34")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RegionData) data).mRepresented = value;
            }

            @objid ("e534d1ce-1bcb-4244-9fa5-4b101fce52b1")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.TopDep();
            }

        }

        @objid ("00783fc0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("eb935794-30bc-494b-aa08-241f82f04228")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RegionData) data).mParent;
            }

            @objid ("33ab5ac5-cfb4-40b4-9f27-6821f0c311db")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RegionData) data).mParent = value;
            }

            @objid ("63869c9f-cc75-4f7a-87fe-c37e9fbd0648")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.OwnedRegionDep();
            }

        }

        @objid ("0078b4fa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubSmDependency extends SmMultipleDependency {
            @objid ("b80ec25b-50b5-4cbf-87df-e8ed24842cb6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RegionData)data).mSub != null)? ((RegionData)data).mSub:SmMultipleDependency.EMPTY;
            }

            @objid ("3327c961-77fb-4ff8-a118-6608ee22606e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RegionData) data).mSub = new ArrayList<>(initialCapacity);
                return ((RegionData) data).mSub;
            }

            @objid ("7c895635-4d6b-4cc4-aaa2-e9ff75215034")
            @Override
            public SmDependency getSymetric() {
                return StateVertexData.Metadata.ParentDep();
            }

        }

    }

}
