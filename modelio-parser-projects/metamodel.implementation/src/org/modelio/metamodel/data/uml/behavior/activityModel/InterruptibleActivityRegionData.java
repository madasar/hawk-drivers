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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityEdgeData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.InterruptibleActivityRegionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.InterruptibleActivityRegion;
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

@objid ("0036eb56-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InterruptibleActivityRegion.class, factory=InterruptibleActivityRegionData.Metadata.ObjectFactory.class)
public class InterruptibleActivityRegionData extends ActivityGroupData {
    @objid ("7dcc47bf-3431-4ea6-bb3a-adeb596e2bee")
    @SmaMetaAssociation(metaName="InterruptingEdge", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.InterruptingEdgeSmDependency.class, partof = true)
     List<SmObjectImpl> mInterruptingEdge = null;

    @objid ("8d929cea-730e-4868-b00a-14a27f8c27a9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006e2fb2-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6246f385-c174-46f8-ba76-7cb55d3180bb")
        private static SmClass smClass = null;

        @objid ("44e11454-fa6b-4fca-9876-f60c01fe2618")
        private static SmDependency InterruptingEdgeDep = null;

        @objid ("9d5d3ce3-4704-4db9-b642-28662e72d5b0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InterruptibleActivityRegionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("80e793d6-e552-4258-bfee-05130454a37f")
        public static SmDependency InterruptingEdgeDep() {
            if (InterruptingEdgeDep == null) {
            	InterruptingEdgeDep = classof().getDependencyDef("InterruptingEdge");
            }
            return InterruptingEdgeDep;
        }

        @objid ("4676c2ee-d4c1-4de7-baf4-8ba88dbd9053")
        public static SmDependency getInterruptingEdgeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InterruptingEdgeDep;
        }

        @objid ("ef23b5c8-ec45-4ae8-ac6a-787627cc9e6f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("006e706c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3c11267c-f841-4113-814b-66f9e2131c77")
            public ISmObjectData createData() {
                return new InterruptibleActivityRegionData();
            }

            @objid ("a3e4d1cb-b6a7-42aa-b3ad-30a37eaa434a")
            public SmObjectImpl createImpl() {
                return new InterruptibleActivityRegionImpl();
            }

        }

        @objid ("006ed2a0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InterruptingEdgeSmDependency extends SmMultipleDependency {
            @objid ("94613e0a-4b2b-4ef9-b508-5c801929b86a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterruptibleActivityRegionData)data).mInterruptingEdge != null)? ((InterruptibleActivityRegionData)data).mInterruptingEdge:SmMultipleDependency.EMPTY;
            }

            @objid ("e4c34931-1196-4b2d-b944-8c35eee35b54")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterruptibleActivityRegionData) data).mInterruptingEdge = new ArrayList<>(initialCapacity);
                return ((InterruptibleActivityRegionData) data).mInterruptingEdge;
            }

            @objid ("3f5f5312-4b54-4371-9698-e54d291bbae7")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.InterruptsDep();
            }

        }

    }

}
