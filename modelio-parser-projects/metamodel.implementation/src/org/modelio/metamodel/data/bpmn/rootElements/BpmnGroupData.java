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
package org.modelio.metamodel.data.bpmn.rootElements;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnGroup;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnGroupImpl;
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

@objid ("007a84d8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnGroup.class, factory=BpmnGroupData.Metadata.ObjectFactory.class)
public class BpmnGroupData extends BpmnArtifactData {
    @objid ("8db26f68-4905-450d-bf90-3e69aa143832")
    @SmaMetaAttribute(metaName="Category", type=String.class, smAttributeClass=Metadata.CategorySmAttribute.class)
     Object mCategory = "";

    @objid ("c575921c-4cbe-44cb-9349-531f6c224ad9")
    @SmaMetaAssociation(metaName="Categorized", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.CategorizedSmDependency.class, partof = true)
     List<SmObjectImpl> mCategorized = null;

    @objid ("e6ad12d1-c002-4097-abfe-138b3c24e01a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00942bb8-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("05fdd0b1-4409-4472-93d2-8e5dde843c64")
        private static SmClass smClass = null;

        @objid ("064fb837-e5ac-49ae-97e0-d44746789f69")
        private static SmAttribute CategoryAtt = null;

        @objid ("ee34aeb1-8480-4831-9d67-7974f343d096")
        private static SmDependency CategorizedDep = null;

        @objid ("f52741ca-ce65-4fe3-9cb0-607f9206b512")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnGroupData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("da694d0b-5e16-43af-8aa9-aa5c7baf9b07")
        public static SmAttribute CategoryAtt() {
            if (CategoryAtt == null) {
            	CategoryAtt = classof().getAttributeDef("Category");
            }
            return CategoryAtt;
        }

        @objid ("9dc43b9f-d862-42d0-ab20-b96991f49d83")
        public static SmDependency CategorizedDep() {
            if (CategorizedDep == null) {
            	CategorizedDep = classof().getDependencyDef("Categorized");
            }
            return CategorizedDep;
        }

        @objid ("1b4bacce-9556-4b49-be24-bedf794a5440")
        public static SmDependency getCategorizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CategorizedDep;
        }

        @objid ("d8a24d85-1ce7-417b-9399-5b429b74a5d2")
        public static SmAttribute getCategoryAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CategoryAtt;
        }

        @objid ("adf6a16a-abf7-4094-8cae-d3434f8aa5d8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("009533dc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("706957ae-cd72-4e8f-b70d-93a36732ae2f")
            public ISmObjectData createData() {
                return new BpmnGroupData();
            }

            @objid ("13adef95-dba1-42b7-8ff3-d63d293de0a9")
            public SmObjectImpl createImpl() {
                return new BpmnGroupImpl();
            }

        }

        @objid ("0095a7ea-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CategorySmAttribute extends SmAttribute {
            @objid ("cc93461e-ae14-4d9c-9dbd-e4812100f922")
            public Object getValue(ISmObjectData data) {
                return ((BpmnGroupData) data).mCategory;
            }

            @objid ("189367a6-60cb-4bec-86b9-bd1b8d8b30cd")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnGroupData) data).mCategory = value;
            }

        }

        @objid ("00960bae-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CategorizedSmDependency extends SmMultipleDependency {
            @objid ("fbe76bdd-38b1-4f2b-bd4d-56e1b1df9a67")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnGroupData)data).mCategorized != null)? ((BpmnGroupData)data).mCategorized:SmMultipleDependency.EMPTY;
            }

            @objid ("a778eaa0-2a87-4e22-aac2-6976ffe641ea")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnGroupData) data).mCategorized = new ArrayList<>(initialCapacity);
                return ((BpmnGroupData) data).mCategorized;
            }

            @objid ("9686ae19-6d78-420b-a496-00109c9e033a")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.GroupsDep();
            }

        }

    }

}
