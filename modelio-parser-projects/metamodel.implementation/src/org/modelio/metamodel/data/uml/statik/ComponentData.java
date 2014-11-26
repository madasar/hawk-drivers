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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.ComponentRealizationData;
import org.modelio.metamodel.impl.uml.statik.ComponentImpl;
import org.modelio.metamodel.uml.statik.Component;
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

@objid ("00058f48-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Component.class, factory=ComponentData.Metadata.ObjectFactory.class, cmsnode=true)
public class ComponentData extends ClassData {
    @objid ("d63e25ed-efca-4baa-a9a3-c9561be75d62")
    @SmaMetaAssociation(metaName="Realization", typeDataClass=ComponentRealizationData.class, min=0, max=-1, smAssociationClass=Metadata.RealizationSmDependency.class, component = true)
     List<SmObjectImpl> mRealization = null;

    @objid ("14983202-2610-41e8-a2d3-b9029aa46ee9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002e8efc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("27b5e16d-199d-46eb-919d-9bd750944483")
        private static SmClass smClass = null;

        @objid ("a1775cc9-8172-4864-9b4a-c5a33fb723f2")
        private static SmDependency RealizationDep = null;

        @objid ("4e7e6eb9-bf96-4878-860c-9b7122d55cce")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ComponentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a2f0a74b-9e17-4614-add3-cde17df0a2b6")
        public static SmDependency RealizationDep() {
            if (RealizationDep == null) {
            	RealizationDep = classof().getDependencyDef("Realization");
            }
            return RealizationDep;
        }

        @objid ("1f7a9ea1-024e-41f1-b5cb-53604bf0a4c5")
        public static SmDependency getRealizationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizationDep;
        }

        @objid ("dd1f989f-ba0e-4ab2-a964-0adbae194160")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002ecfb6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f1360a46-b651-4f4f-a025-703e2d90a07c")
            public ISmObjectData createData() {
                return new ComponentData();
            }

            @objid ("ba3ddf29-2c4c-4e03-a377-25862a1bd36c")
            public SmObjectImpl createImpl() {
                return new ComponentImpl();
            }

        }

        @objid ("20c1eac7-3feb-44c9-b5e0-20c5f30638e1")
        public static class RealizationSmDependency extends SmMultipleDependency {
            @objid ("8f165d91-74f9-4ffc-9eb9-fb29de9178d7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ComponentData)data).mRealization != null)? ((ComponentData)data).mRealization:SmMultipleDependency.EMPTY;
            }

            @objid ("5b2c35aa-e8e0-48e7-a793-0cdbed1e1b4b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ComponentData) data).mRealization = new ArrayList<>(initialCapacity);
                return ((ComponentData) data).mRealization;
            }

            @objid ("174c8510-7e60-4c7a-bda4-b4bb58e0484d")
            @Override
            public SmDependency getSymetric() {
                return ComponentRealizationData.Metadata.AbstractionDep();
            }

        }

    }

}
