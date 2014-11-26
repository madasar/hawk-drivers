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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.InternalTransitionImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
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

@objid ("0051a63a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InternalTransition.class, factory=InternalTransitionData.Metadata.ObjectFactory.class)
public class InternalTransitionData extends TransitionData {
    @objid ("0fc09395-277b-4a46-beed-9554ddd66ee4")
    @SmaMetaAssociation(metaName="SComposed", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.SComposedSmDependency.class)
     SmObjectImpl mSComposed;

    @objid ("dcf12d68-5c08-48b5-b035-efc9419eb6c3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005e8472-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("dccd9083-1b4f-4f00-bcec-678698bda952")
        private static SmClass smClass = null;

        @objid ("af88406c-3353-4a98-a4d1-15f4bb183941")
        private static SmDependency SComposedDep = null;

        @objid ("19428842-42fb-42f6-b2a1-611ca01919c1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InternalTransitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("40d70c96-dffb-4653-99b1-5254f9342fb6")
        public static SmDependency SComposedDep() {
            if (SComposedDep == null) {
            	SComposedDep = classof().getDependencyDef("SComposed");
            }
            return SComposedDep;
        }

        @objid ("5d77d6ee-6944-48e2-80ab-35b50c337335")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("186c9b61-d207-499b-bcc5-9b4c20887978")
        public static SmDependency getSComposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SComposedDep;
        }

        @objid ("005ec6da-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9b7158b6-980e-43f1-9801-f15cf3633b32")
            public ISmObjectData createData() {
                return new InternalTransitionData();
            }

            @objid ("b84b9e34-d234-40b1-98ea-d6be4f251901")
            public SmObjectImpl createImpl() {
                return new InternalTransitionImpl();
            }

        }

        @objid ("005f2a1c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SComposedSmDependency extends SmSingleDependency {
            @objid ("3d0d9131-59c7-453d-ab01-741438871c1a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InternalTransitionData) data).mSComposed;
            }

            @objid ("6ea8cbb6-c7b6-4b60-9ad5-cca3ab0c9cac")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InternalTransitionData) data).mSComposed = value;
            }

            @objid ("7678588a-9eb9-462d-8fbd-a385db85932f")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.InternalDep();
            }

        }

    }

}
