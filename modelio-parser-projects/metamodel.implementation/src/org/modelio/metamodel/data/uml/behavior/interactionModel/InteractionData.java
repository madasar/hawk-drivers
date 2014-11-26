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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.GateData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionFragmentData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionUseData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.LifelineData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
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

@objid ("0046e4ac-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Interaction.class, factory=InteractionData.Metadata.ObjectFactory.class, cmsnode=true)
public class InteractionData extends BehaviorData {
    @objid ("750ddfd0-32cb-4267-89e9-abc0d59dfb67")
    @SmaMetaAssociation(metaName="FormalGate", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.FormalGateSmDependency.class, component = true)
     List<SmObjectImpl> mFormalGate = null;

    @objid ("2ecf039c-0dc0-4510-b854-94d1f29e38b2")
    @SmaMetaAssociation(metaName="Fragment", typeDataClass=InteractionFragmentData.class, min=0, max=-1, smAssociationClass=Metadata.FragmentSmDependency.class, component = true)
     List<SmObjectImpl> mFragment = null;

    @objid ("d745f537-9ae6-4790-a2c7-ab2cc35de795")
    @SmaMetaAssociation(metaName="OwnedLine", typeDataClass=LifelineData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedLineSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedLine = null;

    @objid ("869fd22a-4cd4-41dd-9040-416d726b61c7")
    @SmaMetaAssociation(metaName="ReferedUse", typeDataClass=InteractionUseData.class, min=0, max=-1, smAssociationClass=Metadata.ReferedUseSmDependency.class)
     List<SmObjectImpl> mReferedUse = null;

    @objid ("7d44dc86-24de-4c37-8426-68ae80a1e100")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003107c2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("989f8e46-d82c-4b8c-9587-4c8f241d5f18")
        private static SmClass smClass = null;

        @objid ("1519c569-6541-4370-9bd4-a22331a1f3bf")
        private static SmDependency FormalGateDep = null;

        @objid ("ffb471b7-4387-4814-beab-bad176d317ee")
        private static SmDependency FragmentDep = null;

        @objid ("f3ca32a6-06d6-4bb6-b7a5-1f55d68c39d2")
        private static SmDependency OwnedLineDep = null;

        @objid ("88a862f3-3a0a-41ae-a7be-097bf21e3e55")
        private static SmDependency ReferedUseDep = null;

        @objid ("793ba25b-c0f0-446b-a3dd-12c369cbbdf1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("826d3782-56ef-4d0b-ac59-734ff3474863")
        public static SmDependency FormalGateDep() {
            if (FormalGateDep == null) {
            	FormalGateDep = classof().getDependencyDef("FormalGate");
            }
            return FormalGateDep;
        }

        @objid ("94924261-5208-4330-8fc4-2f67890da9a7")
        public static SmDependency FragmentDep() {
            if (FragmentDep == null) {
            	FragmentDep = classof().getDependencyDef("Fragment");
            }
            return FragmentDep;
        }

        @objid ("b7427716-56da-4397-9889-4345dcadd0a5")
        public static SmDependency OwnedLineDep() {
            if (OwnedLineDep == null) {
            	OwnedLineDep = classof().getDependencyDef("OwnedLine");
            }
            return OwnedLineDep;
        }

        @objid ("6a393263-7c4b-4382-8817-a636c5c2c03c")
        public static SmDependency ReferedUseDep() {
            if (ReferedUseDep == null) {
            	ReferedUseDep = classof().getDependencyDef("ReferedUse");
            }
            return ReferedUseDep;
        }

        @objid ("6ca5b8b9-5570-4813-9214-a768d5afcb6b")
        public static SmDependency getFormalGateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FormalGateDep;
        }

        @objid ("338adcec-c35c-4a31-8273-3a967f226111")
        public static SmDependency getReferedUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferedUseDep;
        }

        @objid ("58112751-8d03-42c9-a5c2-77c436605679")
        public static SmDependency getOwnedLineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedLineDep;
        }

        @objid ("870ce8d7-7819-4fcc-a6fa-f3e6cc022c8f")
        public static SmDependency getFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FragmentDep;
        }

        @objid ("d2f2b49e-4935-4a4a-abe4-b40812f3f2c1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0031499e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bc06a218-394e-4a05-9dd2-b82940e7f3b8")
            public ISmObjectData createData() {
                return new InteractionData();
            }

            @objid ("ffb9be53-4c51-42ab-b7c9-095491bb1631")
            public SmObjectImpl createImpl() {
                return new InteractionImpl();
            }

        }

        @objid ("0031ad58-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FormalGateSmDependency extends SmMultipleDependency {
            @objid ("f85a950c-2c11-47a3-8d1d-166d742f1228")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mFormalGate != null)? ((InteractionData)data).mFormalGate:SmMultipleDependency.EMPTY;
            }

            @objid ("772887bf-8510-4457-8ea0-3a7882eef494")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mFormalGate = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mFormalGate;
            }

            @objid ("60651284-c512-4ef6-a443-a57791a3e2a1")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.OwnerInteractionDep();
            }

        }

        @objid ("00321234-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FragmentSmDependency extends SmMultipleDependency {
            @objid ("b4022048-5137-41eb-8ca2-3726866465de")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mFragment != null)? ((InteractionData)data).mFragment:SmMultipleDependency.EMPTY;
            }

            @objid ("fd941a24-5130-4945-9bd5-99775bb3c350")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mFragment = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mFragment;
            }

            @objid ("f68924fa-70bb-47fc-bbf3-57cd8a0f3d7e")
            @Override
            public SmDependency getSymetric() {
                return InteractionFragmentData.Metadata.EnclosingInteractionDep();
            }

        }

        @objid ("00327544-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedLineSmDependency extends SmMultipleDependency {
            @objid ("7679bf51-72ec-4f67-b4fb-fdb6b92fb472")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mOwnedLine != null)? ((InteractionData)data).mOwnedLine:SmMultipleDependency.EMPTY;
            }

            @objid ("38726905-3349-4409-b190-43264083cbca")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mOwnedLine = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mOwnedLine;
            }

            @objid ("e7d3ff26-1314-44ec-a3de-b9579b27b6e8")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.OwnerDep();
            }

        }

        @objid ("0032da5c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReferedUseSmDependency extends SmMultipleDependency {
            @objid ("52020452-0de0-4246-8cf6-3ee02a6f023c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mReferedUse != null)? ((InteractionData)data).mReferedUse:SmMultipleDependency.EMPTY;
            }

            @objid ("bc3c8ab6-e9a2-4f35-b3e3-a26de25ae21f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mReferedUse = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mReferedUse;
            }

            @objid ("f18b85bb-52a3-4507-a066-b5cba709bdd1")
            @Override
            public SmDependency getSymetric() {
                return InteractionUseData.Metadata.RefersToDep();
            }

        }

    }

}
