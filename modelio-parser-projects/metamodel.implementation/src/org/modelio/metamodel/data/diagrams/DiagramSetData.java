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
package org.modelio.metamodel.data.diagrams;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.diagrams.AbstractDiagramData;
import org.modelio.metamodel.data.mda.ProjectData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.impl.diagrams.DiagramSetImpl;
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

@objid ("006e66a8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DiagramSet.class, factory=DiagramSetData.Metadata.ObjectFactory.class, cmsnode=true)
public class DiagramSetData extends ModelElementData {
    @objid ("6756e5b5-cbd6-46c7-827b-f05c88e1d1d6")
    @SmaMetaAssociation(metaName="Sub", typeDataClass=DiagramSetData.class, min=0, max=-1, smAssociationClass=Metadata.SubSmDependency.class, component = true)
     List<SmObjectImpl> mSub = null;

    @objid ("40e9aaab-0d4e-4734-a973-83f82823e2c5")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=DiagramSetData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class)
     SmObjectImpl mParent;

    @objid ("4ab2816f-e3c6-406b-bac3-e4375ceee5aa")
    @SmaMetaAssociation(metaName="ReferencedDiagram", typeDataClass=AbstractDiagramData.class, min=0, max=-1, smAssociationClass=Metadata.ReferencedDiagramSmDependency.class, partof = true)
     List<SmObjectImpl> mReferencedDiagram = null;

    @objid ("1d47be6b-8e2e-4128-8ab8-e11c3ab8abd5")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("16fe56ab-a091-4511-a679-527620ca3a14")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001f4e88-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("57a718e1-53d9-4999-82fc-3f03955ebaef")
        private static SmClass smClass = null;

        @objid ("02e7f7b1-5fe6-4d80-bd27-e28a19e77a7e")
        private static SmDependency SubDep = null;

        @objid ("651e7936-f73d-44af-acce-6d802d277b1f")
        private static SmDependency ParentDep = null;

        @objid ("03e902ab-e574-46f3-a939-8d6c5a723593")
        private static SmDependency ReferencedDiagramDep = null;

        @objid ("323ce77a-2df0-4682-80bf-bb0e078d67dc")
        private static SmDependency OwnerDep = null;

        @objid ("89057668-da1a-4641-ba1d-7e5cd66bd748")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DiagramSetData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5d3a09c2-4c71-4dc8-ad8b-7293e7656534")
        public static SmDependency SubDep() {
            if (SubDep == null) {
            	SubDep = classof().getDependencyDef("Sub");
            }
            return SubDep;
        }

        @objid ("c28a1adc-6df1-4a5e-bef7-5895aa61b602")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("83ba8624-1ee8-4a5b-a0e1-ce2e45fd0126")
        public static SmDependency ReferencedDiagramDep() {
            if (ReferencedDiagramDep == null) {
            	ReferencedDiagramDep = classof().getDependencyDef("ReferencedDiagram");
            }
            return ReferencedDiagramDep;
        }

        @objid ("8a91a136-2981-424f-8b74-c8e354e6d6fb")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("036f26ca-2f07-4a81-ba00-44037bdd5098")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("b8ab2599-deee-4390-b72b-f1ffe4ee2d09")
        public static SmDependency getReferencedDiagramDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferencedDiagramDep;
        }

        @objid ("adbf660f-6370-4e4f-b007-13ce375cc2f7")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("8163e04a-800b-4744-a4dc-8e7d23159bee")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ae8f07b9-1b7e-4721-9dec-79d64269a030")
        public static SmDependency getSubDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubDep;
        }

        @objid ("001f8cb8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f313a3d1-da5d-4852-9ed8-ed64966f769f")
            public ISmObjectData createData() {
                return new DiagramSetData();
            }

            @objid ("d33a1b67-438f-4d74-bb63-f0b9888c5e7b")
            public SmObjectImpl createImpl() {
                return new DiagramSetImpl();
            }

        }

        @objid ("0020643a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SubSmDependency extends SmMultipleDependency {
            @objid ("a1205382-c735-4cc5-a28c-edb01d96fc6e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DiagramSetData)data).mSub != null)? ((DiagramSetData)data).mSub:SmMultipleDependency.EMPTY;
            }

            @objid ("eaf0c98c-4be7-416c-ae28-fbe00463fb38")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DiagramSetData) data).mSub = new ArrayList<>(initialCapacity);
                return ((DiagramSetData) data).mSub;
            }

            @objid ("6a609cc7-0ef2-4918-83c5-44b242207e82")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.ParentDep();
            }

        }

        @objid ("0020c542-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("a222e43a-abfe-44ab-a584-401d1f922151")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DiagramSetData) data).mParent;
            }

            @objid ("ed096859-9460-49a1-ac8f-aa8711da050e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DiagramSetData) data).mParent = value;
            }

            @objid ("a6f06fa8-4055-4e8a-8633-42fda09fb45a")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.SubDep();
            }

        }

        @objid ("00213c8e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReferencedDiagramSmDependency extends SmMultipleDependency {
            @objid ("a04a10e5-f299-4f46-ad10-8e19e58801fe")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DiagramSetData)data).mReferencedDiagram != null)? ((DiagramSetData)data).mReferencedDiagram:SmMultipleDependency.EMPTY;
            }

            @objid ("cb140214-c303-4aaa-be84-aa13163179a0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DiagramSetData) data).mReferencedDiagram = new ArrayList<>(initialCapacity);
                return ((DiagramSetData) data).mReferencedDiagram;
            }

            @objid ("f86853b0-8b4e-4630-bb29-71bcb33e46d3")
            @Override
            public SmDependency getSymetric() {
                return AbstractDiagramData.Metadata.ReferencingSetDep();
            }

        }

        @objid ("005cd410-70e0-1048-a9ad-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("73bed730-37c3-4afd-be6c-359e942cc08a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DiagramSetData) data).mOwner;
            }

            @objid ("b2eb884e-a30f-452d-9841-47a8f0525119")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DiagramSetData) data).mOwner = value;
            }

            @objid ("dc3dc327-2a46-46e6-98c0-12d1b97ec8b6")
            @Override
            public SmDependency getSymetric() {
                return ProjectData.Metadata.DiagramRootDep();
            }

        }

    }

}
