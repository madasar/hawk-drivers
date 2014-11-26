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
import org.modelio.metamodel.data.uml.statik.InterfaceRealizationData;
import org.modelio.metamodel.data.uml.statik.ProvidedInterfaceData;
import org.modelio.metamodel.data.uml.statik.RequiredInterfaceData;
import org.modelio.metamodel.impl.uml.statik.InterfaceImpl;
import org.modelio.metamodel.uml.statik.Interface;
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

@objid ("000e976e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Interface.class, factory=InterfaceData.Metadata.ObjectFactory.class, cmsnode=true)
public class InterfaceData extends GeneralClassData {
    @objid ("9a2cc707-b1a8-4af3-8a16-70b1c30aa9fe")
    @SmaMetaAssociation(metaName="Requiring", typeDataClass=RequiredInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.RequiringSmDependency.class)
     List<SmObjectImpl> mRequiring = null;

    @objid ("71a3e071-fe76-4382-9bc1-ffea8221fba5")
    @SmaMetaAssociation(metaName="ImplementedLink", typeDataClass=InterfaceRealizationData.class, min=0, max=-1, smAssociationClass=Metadata.ImplementedLinkSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mImplementedLink = null;

    @objid ("9f62591d-7bf2-4606-8422-81d2b947aa8d")
    @SmaMetaAssociation(metaName="Providing", typeDataClass=ProvidedInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.ProvidingSmDependency.class)
     List<SmObjectImpl> mProviding = null;

    @objid ("a8b3faf7-ccef-11e1-a996-001ec947ccaf")
    public InterfaceData() {
        this.mIsAbstract = Boolean.TRUE;
    }

    @objid ("ea6e6953-1ad9-496c-8d58-de9726586943")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00548940-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("318a3ad0-75c0-4c42-bf85-9d5793aee512")
        private static SmClass smClass = null;

        @objid ("07bdf31b-afb6-4b66-a099-7887edbec30c")
        private static SmDependency RequiringDep = null;

        @objid ("1b4dc139-451c-4039-827f-6365ea102bce")
        private static SmDependency ImplementedLinkDep = null;

        @objid ("e39a6731-fa33-4456-a914-502e7239552d")
        private static SmDependency ProvidingDep = null;

        @objid ("4d9444bc-d458-4c45-b39d-aa379b37fda8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a07ce13e-fdba-4dfb-ac7d-435efb0b737c")
        public static SmDependency RequiringDep() {
            if (RequiringDep == null) {
            	RequiringDep = classof().getDependencyDef("Requiring");
            }
            return RequiringDep;
        }

        @objid ("2966fc2c-9815-4a26-8047-1822aebe7934")
        public static SmDependency ImplementedLinkDep() {
            if (ImplementedLinkDep == null) {
            	ImplementedLinkDep = classof().getDependencyDef("ImplementedLink");
            }
            return ImplementedLinkDep;
        }

        @objid ("06759951-630e-4112-8572-3221d7e50738")
        public static SmDependency ProvidingDep() {
            if (ProvidingDep == null) {
            	ProvidingDep = classof().getDependencyDef("Providing");
            }
            return ProvidingDep;
        }

        @objid ("1380d61c-836a-4da9-b735-49a3d6cce8bc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b0fb93a5-7632-4a42-a889-31b6b015b42a")
        public static SmDependency getImplementedLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementedLinkDep;
        }

        @objid ("a5b0554d-15b4-4459-bf45-796a3a476213")
        public static SmDependency getRequiringDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiringDep;
        }

        @objid ("f4a23fa0-85c7-4300-b9b3-c77d3b2b6085")
        public static SmDependency getProvidingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidingDep;
        }

        @objid ("0054ca18-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2fce8cb2-ae5c-4e76-89bc-f1fcc9ca19b2")
            public ISmObjectData createData() {
                return new InterfaceData();
            }

            @objid ("93921ef7-27f8-4438-9169-6736c14a2ac5")
            public SmObjectImpl createImpl() {
                return new InterfaceImpl();
            }

        }

        @objid ("00552cec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementedLinkSmDependency extends SmMultipleDependency {
            @objid ("e149ec78-6c98-4040-b9a5-9edbd3725a1e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterfaceData)data).mImplementedLink != null)? ((InterfaceData)data).mImplementedLink:SmMultipleDependency.EMPTY;
            }

            @objid ("2009af9e-5b6e-4421-8056-ae3c7de2952a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterfaceData) data).mImplementedLink = new ArrayList<>(initialCapacity);
                return ((InterfaceData) data).mImplementedLink;
            }

            @objid ("bb198bc0-c725-41ad-b2d7-71f35bfff5db")
            @Override
            public SmDependency getSymetric() {
                return InterfaceRealizationData.Metadata.ImplementedDep();
            }

        }

        @objid ("00558fb6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RequiringSmDependency extends SmMultipleDependency {
            @objid ("8e58892e-6c31-4e07-85d4-7d356b9e7991")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterfaceData)data).mRequiring != null)? ((InterfaceData)data).mRequiring:SmMultipleDependency.EMPTY;
            }

            @objid ("c9751ad1-ecef-475c-8f68-8002cb1ddc26")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterfaceData) data).mRequiring = new ArrayList<>(initialCapacity);
                return ((InterfaceData) data).mRequiring;
            }

            @objid ("13c41cbd-38b9-4eb7-a2b3-12b045c6e121")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.RequiredElementDep();
            }

        }

        @objid ("0055f2bc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProvidingSmDependency extends SmMultipleDependency {
            @objid ("a3914aeb-3473-4ef5-94cb-153a58b90587")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterfaceData)data).mProviding != null)? ((InterfaceData)data).mProviding:SmMultipleDependency.EMPTY;
            }

            @objid ("4b84b44f-8e8e-4033-8b74-912e02371d58")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterfaceData) data).mProviding = new ArrayList<>(initialCapacity);
                return ((InterfaceData) data).mProviding;
            }

            @objid ("72dbd0f1-b600-4be8-bfec-5b9c3362e413")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.ProvidedElementDep();
            }

        }

    }

}
