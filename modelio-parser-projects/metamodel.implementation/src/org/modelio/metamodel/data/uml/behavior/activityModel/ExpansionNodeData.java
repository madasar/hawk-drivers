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
import org.modelio.metamodel.data.uml.behavior.activityModel.ExpansionRegionData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ExpansionNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;
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

@objid ("00318170-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExpansionNode.class, factory=ExpansionNodeData.Metadata.ObjectFactory.class)
public class ExpansionNodeData extends ObjectNodeData {
    @objid ("1879695b-c847-44f2-99a3-928ec62076f5")
    @SmaMetaAssociation(metaName="RegionAsOutput", typeDataClass=ExpansionRegionData.class, min=0, max=1, smAssociationClass=Metadata.RegionAsOutputSmDependency.class)
     SmObjectImpl mRegionAsOutput;

    @objid ("e5b80b12-00ff-4ff4-ad69-53325be217cb")
    @SmaMetaAssociation(metaName="RegionAsInput", typeDataClass=ExpansionRegionData.class, min=0, max=1, smAssociationClass=Metadata.RegionAsInputSmDependency.class)
     SmObjectImpl mRegionAsInput;

    @objid ("1fb8894c-2094-45ce-9dac-d8a3a73b7ed6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00374c86-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("64ac2f37-83ae-4b04-9772-560f46140f2d")
        private static SmClass smClass = null;

        @objid ("fa012320-0ecc-44de-affa-a6ab8d1c3626")
        private static SmDependency RegionAsOutputDep = null;

        @objid ("2d5edf3f-168b-4f38-a72d-a5d49f234ce1")
        private static SmDependency RegionAsInputDep = null;

        @objid ("5c66b221-a0c5-42ab-9ea9-33df7e1519b8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExpansionNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("46305db8-a1a4-441f-b230-a96cc2fd1da3")
        public static SmDependency RegionAsOutputDep() {
            if (RegionAsOutputDep == null) {
            	RegionAsOutputDep = classof().getDependencyDef("RegionAsOutput");
            }
            return RegionAsOutputDep;
        }

        @objid ("b4e451a6-055d-4805-a9f7-b08882a2adf0")
        public static SmDependency RegionAsInputDep() {
            if (RegionAsInputDep == null) {
            	RegionAsInputDep = classof().getDependencyDef("RegionAsInput");
            }
            return RegionAsInputDep;
        }

        @objid ("6d72bd02-9b42-4585-b4ac-8a64549760f6")
        public static SmDependency getRegionAsOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RegionAsOutputDep;
        }

        @objid ("9a2b3285-9647-44ae-acfe-01d5064e7df6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6e073ec5-c196-4444-a8b4-d026a66c9b8b")
        public static SmDependency getRegionAsInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RegionAsInputDep;
        }

        @objid ("0037998e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3bfa9bbd-8289-4adb-aae1-51dfd82984b4")
            public ISmObjectData createData() {
                return new ExpansionNodeData();
            }

            @objid ("9287bf62-cab7-4a07-93fa-d0daa021c3d8")
            public SmObjectImpl createImpl() {
                return new ExpansionNodeImpl();
            }

        }

        @objid ("003807fc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RegionAsInputSmDependency extends SmSingleDependency {
            @objid ("efc64a19-4a06-43a1-9dd2-8f9f04727396")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExpansionNodeData) data).mRegionAsInput;
            }

            @objid ("fd362f78-e52f-4146-92e6-741b2ed82543")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExpansionNodeData) data).mRegionAsInput = value;
            }

            @objid ("d3871b1f-b249-420b-adc7-b1b1ca9d36a2")
            @Override
            public SmDependency getSymetric() {
                return ExpansionRegionData.Metadata.InputElementDep();
            }

        }

        @objid ("0038892a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RegionAsOutputSmDependency extends SmSingleDependency {
            @objid ("2cfd0e25-732d-4f54-a2c3-18befb337835")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExpansionNodeData) data).mRegionAsOutput;
            }

            @objid ("f2f53dac-2403-4506-ab3e-55f8235595c8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExpansionNodeData) data).mRegionAsOutput = value;
            }

            @objid ("7472d914-b29f-4625-85b1-5e79e769c2fd")
            @Override
            public SmDependency getSymetric() {
                return ExpansionRegionData.Metadata.OutputElementDep();
            }

        }

    }

}
