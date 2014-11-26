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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.diagrams.AbstractDiagramData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.QueryDefinitionData;
import org.modelio.metamodel.data.uml.statik.NamespaceUseData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectData;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("0086e58e-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Element.class, factory=ElementData.Metadata.ObjectFactory.class)
public abstract class ElementData extends SmObjectData {
    @objid ("1b977936-2e67-477b-a576-7eb35c34db33")
    @SmaMetaAssociation(metaName="DiagramElement", typeDataClass=AbstractDiagramData.class, min=0, max=-1, smAssociationClass=Metadata.DiagramElementSmDependency.class)
     List<SmObjectImpl> mDiagramElement = null;

    @objid ("0090c9d0-7ff0-4bed-83b9-8848f1a45b1b")
    @SmaMetaAssociation(metaName="Causing", typeDataClass=NamespaceUseData.class, min=0, max=-1, smAssociationClass=Metadata.CausingSmDependency.class)
     List<SmObjectImpl> mCausing = null;

    @objid ("ae996f35-4b82-42d0-86f6-931cf8d46258")
    @SmaMetaAssociation(metaName="AddedToQuery", typeDataClass=QueryDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.AddedToQuerySmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mAddedToQuery = null;

    @objid ("dd57e72b-451d-442c-bd54-b57b01c799b5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000669ae-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("43309da2-487a-4e68-83e3-d1842b8f8919")
        private static SmClass smClass = null;

        @objid ("1486ed05-81d2-431e-bc9f-6f6b45479609")
        private static SmDependency DiagramElementDep = null;

        @objid ("f9b7b596-db6a-4f21-9040-a89ce024b99c")
        private static SmDependency CausingDep = null;

        @objid ("86988070-62c4-48ed-b033-ba61c6e51884")
        private static SmDependency AddedToQueryDep = null;

        @objid ("dac5a744-ba7d-4a12-9df2-f7adcb0bde78")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e7ab561e-9efe-4e64-b6f2-7454acdea1fa")
        public static SmDependency DiagramElementDep() {
            if (DiagramElementDep == null) {
            	DiagramElementDep = classof().getDependencyDef("DiagramElement");
            }
            return DiagramElementDep;
        }

        @objid ("01d9f423-88c4-4507-ad4b-891002088369")
        public static SmDependency CausingDep() {
            if (CausingDep == null) {
            	CausingDep = classof().getDependencyDef("Causing");
            }
            return CausingDep;
        }

        @objid ("ea906369-93c5-4fb3-8b04-ff118f6e2829")
        public static SmDependency AddedToQueryDep() {
            if (AddedToQueryDep == null) {
            	AddedToQueryDep = classof().getDependencyDef("AddedToQuery");
            }
            return AddedToQueryDep;
        }

        @objid ("ab3a9f5e-32b5-4eb4-8c26-9cc9e03caf10")
        public static SmDependency getDiagramElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DiagramElementDep;
        }

        @objid ("8e27376b-eca8-4e86-a1d6-d58e597eb763")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6c3db29d-d747-4c7d-b941-943f9a16a677")
        public static SmDependency getAddedToQueryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AddedToQueryDep;
        }

        @objid ("7dec66bd-efb7-476c-8aaf-0d22259edc03")
        public static SmDependency getCausingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CausingDep;
        }

        @objid ("0006aa22-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3ac40d86-00f4-49c9-92e7-73ec1dd97d10")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("af36561d-86a4-4ea8-af27-45c3c75b8d7d")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00070c6a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CausingSmDependency extends SmMultipleDependency {
            @objid ("b905d65e-b1f3-4e5a-8444-6e3e8d81dc57")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ElementData)data).mCausing != null)? ((ElementData)data).mCausing:SmMultipleDependency.EMPTY;
            }

            @objid ("67f10912-c583-461c-bc6d-9610e90c13b5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ElementData) data).mCausing = new ArrayList<>(initialCapacity);
                return ((ElementData) data).mCausing;
            }

            @objid ("db13ed98-06e6-4f44-9d0a-a446eeb73202")
            @Override
            public SmDependency getSymetric() {
                return NamespaceUseData.Metadata.CauseDep();
            }

        }

        @objid ("00077042-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DiagramElementSmDependency extends SmMultipleDependency {
            @objid ("3a422a65-d811-46a5-a699-00daafb9ec99")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ElementData)data).mDiagramElement != null)? ((ElementData)data).mDiagramElement:SmMultipleDependency.EMPTY;
            }

            @objid ("0ab186cd-2c28-4bab-8047-baff2c833868")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ElementData) data).mDiagramElement = new ArrayList<>(initialCapacity);
                return ((ElementData) data).mDiagramElement;
            }

            @objid ("7b5ba945-fb90-4640-aae3-540e4b3fc299")
            @Override
            public SmDependency getSymetric() {
                return AbstractDiagramData.Metadata.RepresentedDep();
            }

        }

        @objid ("ca85f4fa-79d9-4bab-bdf8-d9bac22bc9a7")
        public static class AddedToQuerySmDependency extends SmMultipleDependency {
            @objid ("feb31839-514d-4eb1-9925-687e37cbe532")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ElementData)data).mAddedToQuery != null)? ((ElementData)data).mAddedToQuery:SmMultipleDependency.EMPTY;
            }

            @objid ("ae835697-2709-4662-bee1-c8f602a34a11")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ElementData) data).mAddedToQuery = new ArrayList<>(initialCapacity);
                return ((ElementData) data).mAddedToQuery;
            }

            @objid ("23b9a622-9fd7-4d71-a135-eb7e48905996")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.AddedDep();
            }

        }

    }

}
