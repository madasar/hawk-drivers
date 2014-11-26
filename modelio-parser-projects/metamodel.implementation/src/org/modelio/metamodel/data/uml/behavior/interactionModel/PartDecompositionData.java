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
import org.modelio.metamodel.data.uml.behavior.interactionModel.LifelineData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.PartDecompositionImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.PartDecomposition;
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

@objid ("004b4588-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=PartDecomposition.class, factory=PartDecompositionData.Metadata.ObjectFactory.class)
public class PartDecompositionData extends InteractionUseData {
    @objid ("8c8d3f10-8b09-4595-948d-c6f4d775a076")
    @SmaMetaAssociation(metaName="Decomposed", typeDataClass=LifelineData.class, min=1, max=1, smAssociationClass=Metadata.DecomposedSmDependency.class)
     SmObjectImpl mDecomposed;

    @objid ("0c847745-ef0b-4e0b-9907-53341da7e0c1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00719e54-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("54b255d0-b593-4034-ba6a-3d99bb6e13f9")
        private static SmClass smClass = null;

        @objid ("6feeef9c-3740-4ef1-8440-fdcb37ca27a0")
        private static SmDependency DecomposedDep = null;

        @objid ("ca7c4eeb-a989-4399-ba8b-8f52bf8c3c04")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PartDecompositionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6f7762f4-d53c-483c-b834-54c8a608fdd8")
        public static SmDependency DecomposedDep() {
            if (DecomposedDep == null) {
            	DecomposedDep = classof().getDependencyDef("Decomposed");
            }
            return DecomposedDep;
        }

        @objid ("db2c809c-f1a0-4580-bdf3-97fc287ce1e1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c4c13c23-1593-4c5b-bda8-2b2ec99e4862")
        public static SmDependency getDecomposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecomposedDep;
        }

        @objid ("0071f03e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("159577a4-ac25-4e12-9347-78a5d59f5c2c")
            public ISmObjectData createData() {
                return new PartDecompositionData();
            }

            @objid ("104fcfe8-8aff-4a6b-b501-4105259c2263")
            public SmObjectImpl createImpl() {
                return new PartDecompositionImpl();
            }

        }

        @objid ("00726280-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DecomposedSmDependency extends SmSingleDependency {
            @objid ("b4ba6eb5-bf2e-4384-920a-d5a026997905")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PartDecompositionData) data).mDecomposed;
            }

            @objid ("295e46a6-d01d-4ab9-ab95-63b334ff9dc8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PartDecompositionData) data).mDecomposed = value;
            }

            @objid ("89d6f896-a407-4457-bac0-65a6edb3cdc7")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.DecomposedAsDep();
            }

        }

    }

}
