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
import org.modelio.metamodel.data.uml.statik.ClassAssociationData;
import org.modelio.metamodel.data.uml.statik.NaryAssociationEndData;
import org.modelio.metamodel.data.uml.statik.NaryLinkData;
import org.modelio.metamodel.impl.uml.statik.NaryAssociationImpl;
import org.modelio.metamodel.uml.statik.NaryAssociation;
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

@objid ("0021f11a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=NaryAssociation.class, factory=NaryAssociationData.Metadata.ObjectFactory.class)
public class NaryAssociationData extends ModelElementData {
    @objid ("981f43ca-64fe-4b8b-8b40-e7ddcabc0463")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=NaryLinkData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("6d47866b-370a-4829-813d-b45e63669d57")
    @SmaMetaAssociation(metaName="NaryEnd", typeDataClass=NaryAssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryEndSmDependency.class, sharedComponent = true)
     List<SmObjectImpl> mNaryEnd = null;

    @objid ("6ece1762-1a9d-4098-bb3f-231b65174e6f")
    @SmaMetaAssociation(metaName="LinkToClass", typeDataClass=ClassAssociationData.class, min=0, max=1, smAssociationClass=Metadata.LinkToClassSmDependency.class, component = true)
     SmObjectImpl mLinkToClass;

    @objid ("0735f737-6c38-4ee0-82f5-16800a5e03a9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003cd1f6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("17b717d2-6529-4edc-b11f-a8fec050201d")
        private static SmClass smClass = null;

        @objid ("4e5ac8ec-8ced-4614-a869-83d94776a13c")
        private static SmDependency OccurenceDep = null;

        @objid ("c4cf4a30-c71d-448d-95d4-ef265a83c47d")
        private static SmDependency NaryEndDep = null;

        @objid ("5155739a-9fae-4890-b45d-7f9c4883684c")
        private static SmDependency LinkToClassDep = null;

        @objid ("e438b21a-4769-4781-93e5-1e881d3d7470")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9c3a56ef-f438-49e2-a1c6-0914991b45d8")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("38d249e8-89c4-4784-81fb-a2760cadb3cf")
        public static SmDependency NaryEndDep() {
            if (NaryEndDep == null) {
            	NaryEndDep = classof().getDependencyDef("NaryEnd");
            }
            return NaryEndDep;
        }

        @objid ("b42b23c3-43e4-4435-bf88-0f0cd6348b05")
        public static SmDependency LinkToClassDep() {
            if (LinkToClassDep == null) {
            	LinkToClassDep = classof().getDependencyDef("LinkToClass");
            }
            return LinkToClassDep;
        }

        @objid ("087429d5-d668-4b4c-a67b-37961f3f0d64")
        public static SmDependency getNaryEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryEndDep;
        }

        @objid ("f512482c-5b1f-4022-ab6e-aa46a8d53f85")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8d8aeef7-554b-4f60-9727-067ac8d7b072")
        public static SmDependency getLinkToClassDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkToClassDep;
        }

        @objid ("23bf27a1-0615-4c92-8986-337379e3b39f")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("003d185a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("665e3d6e-cc4b-4291-ad1e-917e1f485a3f")
            public ISmObjectData createData() {
                return new NaryAssociationData();
            }

            @objid ("c1294d00-5e5c-4d3f-a8ba-d4de2f2df501")
            public SmObjectImpl createImpl() {
                return new NaryAssociationImpl();
            }

        }

        @objid ("003d7c0a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class NaryEndSmDependency extends SmMultipleDependency {
            @objid ("d94a618c-7040-48df-926f-6e1999590ebc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryAssociationData)data).mNaryEnd != null)? ((NaryAssociationData)data).mNaryEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("34b92d05-74a3-4098-8aee-a3dda6d8b4c6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryAssociationData) data).mNaryEnd = new ArrayList<>(initialCapacity);
                return ((NaryAssociationData) data).mNaryEnd;
            }

            @objid ("112baf98-d51f-425e-980f-5577641164de")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationEndData.Metadata.NaryAssociationDep();
            }

        }

        @objid ("003dde2a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("b7f708b9-9ebf-42c6-ab3a-e4e37c8d4319")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryAssociationData)data).mOccurence != null)? ((NaryAssociationData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("bd5ad0fa-98c4-4582-b705-8351715ec9ae")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryAssociationData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((NaryAssociationData) data).mOccurence;
            }

            @objid ("b0d9775b-df30-45d1-9d74-1ac5f19327de")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.ModelDep();
            }

        }

        @objid ("003e405e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LinkToClassSmDependency extends SmSingleDependency {
            @objid ("7f45d899-8371-42dc-976f-cc3bd34a59b5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryAssociationData) data).mLinkToClass;
            }

            @objid ("0c8517b2-531e-4f25-8318-775b60c4179a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryAssociationData) data).mLinkToClass = value;
            }

            @objid ("b81e27c0-a58a-4cf3-9a04-c3d15d4c2972")
            @Override
            public SmDependency getSymetric() {
                return ClassAssociationData.Metadata.NaryAssociationPartDep();
            }

        }

    }

}
