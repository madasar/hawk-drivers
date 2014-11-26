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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.data.uml.statik.ClassAssociationData;
import org.modelio.metamodel.data.uml.statik.LinkData;
import org.modelio.metamodel.impl.uml.statik.AssociationImpl;
import org.modelio.metamodel.uml.statik.Association;
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

@objid ("60b053d8-9a17-42c3-83bc-888ce3e68a7d")
@SmaMetaClass(mmClass=Association.class, factory=AssociationData.Metadata.ObjectFactory.class)
public class AssociationData extends ModelElementData {
    @objid ("5fe3e7ca-6964-4271-89e8-a2c8eb8be224")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=LinkData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("12c3226f-06dd-430d-865c-f6a77f30da24")
    @SmaMetaAssociation(metaName="End", typeDataClass=AssociationEndData.class, min=2, max=2, smAssociationClass=Metadata.EndSmDependency.class)
     List<SmObjectImpl> mEnd = null;

    @objid ("9c91f1a3-bde2-466f-84ab-7ab90ace0dc4")
    @SmaMetaAssociation(metaName="LinkToClass", typeDataClass=ClassAssociationData.class, min=0, max=1, smAssociationClass=Metadata.LinkToClassSmDependency.class, component = true)
     SmObjectImpl mLinkToClass;

    @objid ("0418457f-a36a-4766-a09b-807d8dfa81b1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("32600112-9aaa-4552-95c6-cbae64b630dc")
    public static class Metadata {
        @objid ("4d6d0330-06c9-47de-ba4e-29b7deb8ca89")
        private static SmClass smClass = null;

        @objid ("9330582d-6509-4160-891a-e5e7db7d7478")
        private static SmDependency OccurenceDep = null;

        @objid ("c02dea37-1c9d-4b0c-8666-3c6bea61ff90")
        private static SmDependency EndDep = null;

        @objid ("11bf2836-e2f7-4ecb-b283-f805b5c8f3e2")
        private static SmDependency LinkToClassDep = null;

        @objid ("fa7fda49-1bd1-4612-8c50-9eafc2c7a9cf")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9ae5e804-6514-49ed-8dc0-e6ed86e70f3e")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("af492481-b6c0-4a5d-89eb-198c73eeed08")
        public static SmDependency EndDep() {
            if (EndDep == null) {
            	EndDep = classof().getDependencyDef("End");
            }
            return EndDep;
        }

        @objid ("df859115-fcee-40f5-acec-e04abe5d159d")
        public static SmDependency LinkToClassDep() {
            if (LinkToClassDep == null) {
            	LinkToClassDep = classof().getDependencyDef("LinkToClass");
            }
            return LinkToClassDep;
        }

        @objid ("4d2a2eb1-ee46-4f8c-8bed-854a21caf25e")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("22b4bd37-16a4-4786-8190-4605fd02bca6")
        public static SmDependency getEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndDep;
        }

        @objid ("18cd8aa8-5d46-42d9-90c3-13356520a6e0")
        public static SmDependency getLinkToClassDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkToClassDep;
        }

        @objid ("4219f5c4-8a38-49f2-8f30-b281d8a0c91e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a7dff537-813d-4f3b-a464-3d0e86192921")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0013bc37-bd8e-4342-9aab-fb200772f93d")
            public ISmObjectData createData() {
                return new AssociationData();
            }

            @objid ("bdebdeee-6c25-4488-ace8-1cf07dc04fe3")
            public SmObjectImpl createImpl() {
                return new AssociationImpl();
            }

        }

        @objid ("0261e29d-1a44-42cd-8f82-3bf54f78ece7")
        public static class EndSmDependency extends SmMultipleDependency {
            @objid ("e4ac2a44-8f28-4f46-81c5-c0d9e07b7576")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationData)data).mEnd != null)? ((AssociationData)data).mEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("34590a6d-a524-4493-92c5-4ea07a2c6beb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationData) data).mEnd = new ArrayList<>(initialCapacity);
                return ((AssociationData) data).mEnd;
            }

            @objid ("c38593fa-aecd-4cfe-8983-22c2ff706a54")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.AssociationDep();
            }

        }

        @objid ("8fa6978e-a66a-4ff0-9125-51324bfe6778")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("c6d58da5-56fe-4a6f-957e-5b25ecc931fc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationData)data).mOccurence != null)? ((AssociationData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("2d178dca-1539-41ab-a42c-12eb4a8bb169")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((AssociationData) data).mOccurence;
            }

            @objid ("6c4201f5-05a7-4bfe-a352-9bb19fd9119b")
            @Override
            public SmDependency getSymetric() {
                return LinkData.Metadata.ModelDep();
            }

        }

        @objid ("01ab63fa-43bb-4b31-baf2-66e380e75c27")
        public static class LinkToClassSmDependency extends SmSingleDependency {
            @objid ("4a689cd4-979e-4296-96aa-180dc2cb3558")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationData) data).mLinkToClass;
            }

            @objid ("541e3bc3-4691-45f1-946f-45b0db57edf4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationData) data).mLinkToClass = value;
            }

            @objid ("07c49088-fd50-47d2-8d72-b4e324af5ba6")
            @Override
            public SmDependency getSymetric() {
                return ClassAssociationData.Metadata.AssociationPartDep();
            }

        }

    }

}
