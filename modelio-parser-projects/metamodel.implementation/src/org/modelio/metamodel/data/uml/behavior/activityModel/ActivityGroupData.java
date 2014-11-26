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
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityGroupImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
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

@objid ("0028695a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityGroup.class, factory=ActivityGroupData.Metadata.ObjectFactory.class)
public abstract class ActivityGroupData extends ModelElementData {
    @objid ("42d29ee5-b348-4932-81c6-01de2373dd99")
    @SmaMetaAssociation(metaName="InActivity", typeDataClass=ActivityData.class, min=0, max=1, smAssociationClass=Metadata.InActivitySmDependency.class)
     SmObjectImpl mInActivity;

    @objid ("4c1de321-fe1c-4512-ae4c-24ee29d0a53b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001f39c0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("44a7fb9b-8d63-433d-b39d-f7eab0ee6491")
        private static SmClass smClass = null;

        @objid ("2dd84b66-7547-4af2-88b4-db71c296f2a9")
        private static SmDependency InActivityDep = null;

        @objid ("2dcc855d-3b7c-49e0-a14c-e1c640a85b65")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityGroupData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("19156c07-3ac3-42de-a9a8-c9eb2b75d3a9")
        public static SmDependency InActivityDep() {
            if (InActivityDep == null) {
            	InActivityDep = classof().getDependencyDef("InActivity");
            }
            return InActivityDep;
        }

        @objid ("e543d413-d698-4651-a831-da82b73a7604")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7ddd259c-698c-4524-809c-708f6a9d60c4")
        public static SmDependency getInActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InActivityDep;
        }

        @objid ("001f7b2e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("137e9089-de24-492c-b215-7022ec951091")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("da305896-3389-4472-9d50-1c64504767b5")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("001fe096-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InActivitySmDependency extends SmSingleDependency {
            @objid ("9efcf673-43bc-4e62-ba27-78de6803ceaf")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityGroupData) data).mInActivity;
            }

            @objid ("4683ce1c-a157-431c-91ba-ab32505cde19")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityGroupData) data).mInActivity = value;
            }

            @objid ("e4de4850-8979-4db3-8158-2471a5bae515")
            @Override
            public SmDependency getSymetric() {
                return ActivityData.Metadata.OwnedGroupDep();
            }

        }

    }

}
