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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.InterfaceData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.impl.uml.statik.InterfaceRealizationImpl;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
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

@objid ("000f6478-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InterfaceRealization.class, factory=InterfaceRealizationData.Metadata.ObjectFactory.class)
public class InterfaceRealizationData extends ModelElementData {
    @objid ("6013cbae-26a1-471f-a9b1-76dc252c3af2")
    @SmaMetaAssociation(metaName="Implemented", typeDataClass=InterfaceData.class, min=1, max=1, smAssociationClass=Metadata.ImplementedSmDependency.class, partof = true)
     SmObjectImpl mImplemented;

    @objid ("515457d0-97a3-4739-9a9a-74eb3192f2b7")
    @SmaMetaAssociation(metaName="Implementer", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ImplementerSmDependency.class)
     SmObjectImpl mImplementer;

    @objid ("f756b059-b7af-4e5d-9d69-45c6ede112f8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ebae8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ec23a7a3-02f4-4f62-aea3-f47d7528f81c")
        private static SmClass smClass = null;

        @objid ("f5a1e8fc-c004-4651-b08b-ab9b1111a413")
        private static SmDependency ImplementedDep = null;

        @objid ("d70a8dac-b82d-450d-a0b2-9860468f3d75")
        private static SmDependency ImplementerDep = null;

        @objid ("8eab12d9-2dd5-49a5-b540-519ea004d18e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InterfaceRealizationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e8d05bc2-3809-4875-89f1-d0234c4ab75c")
        public static SmDependency ImplementedDep() {
            if (ImplementedDep == null) {
            	ImplementedDep = classof().getDependencyDef("Implemented");
            }
            return ImplementedDep;
        }

        @objid ("2f0f00ae-a76a-4048-8238-bca15541729f")
        public static SmDependency ImplementerDep() {
            if (ImplementerDep == null) {
            	ImplementerDep = classof().getDependencyDef("Implementer");
            }
            return ImplementerDep;
        }

        @objid ("27402a04-a4e3-433c-adea-023cf2c06e14")
        public static SmDependency getImplementerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementerDep;
        }

        @objid ("f4849fd8-79ed-47da-80e7-1d01a538c515")
        public static SmDependency getImplementedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementedDep;
        }

        @objid ("184a0949-7d5d-4265-aa1d-35bb1d336816")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003efb02-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9280fbc1-f7da-4ca3-84b3-67735c64145b")
            public ISmObjectData createData() {
                return new InterfaceRealizationData();
            }

            @objid ("a7799f15-1c5b-4d79-89fe-74c88671e8f3")
            public SmObjectImpl createImpl() {
                return new InterfaceRealizationImpl();
            }

        }

        @objid ("003f5c50-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImplementerSmDependency extends SmSingleDependency {
            @objid ("7c7b0925-f57e-402c-a02e-691e705ffc25")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InterfaceRealizationData) data).mImplementer;
            }

            @objid ("127e3fc3-e23b-463b-a19b-300ef36c423f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InterfaceRealizationData) data).mImplementer = value;
            }

            @objid ("ef4b8b30-081f-4feb-9aa3-fc015a9e31e8")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.RealizedDep();
            }

        }

        @objid ("003fd00e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImplementedSmDependency extends SmSingleDependency {
            @objid ("3d875433-9f21-4666-860e-fcbeec6c1055")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InterfaceRealizationData) data).mImplemented;
            }

            @objid ("94ff9bd4-442b-42e3-b8da-f20218736b04")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InterfaceRealizationData) data).mImplemented = value;
            }

            @objid ("ed7c6836-e8fb-461f-b5a6-dd6057d2b6ac")
            @Override
            public SmDependency getSymetric() {
                return InterfaceData.Metadata.ImplementedLinkDep();
            }

        }

    }

}
