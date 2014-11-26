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
import org.modelio.metamodel.data.diagrams.DiagramSetData;
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.impl.diagrams.AbstractDiagramImpl;
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

@objid ("00678cde-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AbstractDiagram.class, factory=AbstractDiagramData.Metadata.ObjectFactory.class)
public abstract class AbstractDiagramData extends ModelElementData {
    @objid ("119cec96-37a3-44ae-b612-4b295a05985f")
    @SmaMetaAttribute(metaName="UiDataVersion", type=Integer.class, smAttributeClass=Metadata.UiDataVersionSmAttribute.class)
     Object mUiDataVersion = 0;

    @objid ("ff4336e9-b7c9-49b8-b3f3-3c9a33e71016")
    @SmaMetaAttribute(metaName="UiData", type=String.class, smAttributeClass=Metadata.UiDataSmAttribute.class)
     Object mUiData = "";

    @objid ("058b6eef-86c8-4127-8942-a7b9a5f8571e")
    @SmaMetaAttribute(metaName="PdeProperties", type=String.class, smAttributeClass=Metadata.PdePropertiesSmAttribute.class)
     Object mPdeProperties = "";

    @objid ("03006265-0210-41c8-9989-2921b897e544")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.OriginSmDependency.class, partof = true)
     SmObjectImpl mOrigin;

    @objid ("54dc90a8-703f-44c2-9aea-4e369682ca3a")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     List<SmObjectImpl> mRepresented = null;

    @objid ("f627fce2-6298-4ddf-bf7d-c805bac155b7")
    @SmaMetaAssociation(metaName="ReferencingSet", typeDataClass=DiagramSetData.class, min=0, max=-1, smAssociationClass=Metadata.ReferencingSetSmDependency.class)
     List<SmObjectImpl> mReferencingSet = null;

    @objid ("771be7cf-7d62-4e7c-ad42-5dfa7d435fad")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000913f2-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("589c4dc5-100c-4a8c-88e6-40423c700b1e")
        private static SmClass smClass = null;

        @objid ("02a79d80-596b-4ac1-b07a-f60226760799")
        private static SmAttribute UiDataVersionAtt = null;

        @objid ("6a3256f5-506a-4f2e-8c50-fc4acad69139")
        private static SmAttribute UiDataAtt = null;

        @objid ("c1364c62-b019-4372-b152-b119a4776a36")
        private static SmAttribute PdePropertiesAtt = null;

        @objid ("74a2b12c-613f-47f7-bd8b-b41ac8fabc04")
        private static SmDependency OriginDep = null;

        @objid ("00ce1dd5-21c1-4099-ae00-dcd2541d489d")
        private static SmDependency RepresentedDep = null;

        @objid ("aff70711-ccbd-4ee6-ae45-de422565e523")
        private static SmDependency ReferencingSetDep = null;

        @objid ("7d65014e-2d59-44ba-9b99-7fc3d6b013d5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AbstractDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("67cab214-cfb7-4133-93ff-bc02199500e2")
        public static SmAttribute UiDataVersionAtt() {
            if (UiDataVersionAtt == null) {
            	UiDataVersionAtt = classof().getAttributeDef("UiDataVersion");
            }
            return UiDataVersionAtt;
        }

        @objid ("f04d0312-c989-4197-a1ef-0f208e0df710")
        public static SmAttribute UiDataAtt() {
            if (UiDataAtt == null) {
            	UiDataAtt = classof().getAttributeDef("UiData");
            }
            return UiDataAtt;
        }

        @objid ("ac2376ee-faeb-40db-b263-6057c83808a7")
        public static SmAttribute PdePropertiesAtt() {
            if (PdePropertiesAtt == null) {
            	PdePropertiesAtt = classof().getAttributeDef("PdeProperties");
            }
            return PdePropertiesAtt;
        }

        @objid ("fb9e6631-f559-43a5-ba4c-0d171f671efc")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("f58be7cc-715d-400d-9f0c-5708bda16033")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("75f063b0-eb5d-4110-9883-024a1c3b87b2")
        public static SmDependency ReferencingSetDep() {
            if (ReferencingSetDep == null) {
            	ReferencingSetDep = classof().getDependencyDef("ReferencingSet");
            }
            return ReferencingSetDep;
        }

        @objid ("a805250a-1eda-42a7-8da2-7e08ba4fc8e5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0fec9f67-a7e2-492c-9a64-746d5dd6723f")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("8114b16d-7dc9-45ab-abd2-701aa86f14a2")
        public static SmAttribute getPdePropertiesAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PdePropertiesAtt;
        }

        @objid ("27c5f012-2344-4970-9794-ba7e77129f43")
        public static SmAttribute getUiDataAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UiDataAtt;
        }

        @objid ("adddedb8-cf99-4164-a802-5aca5b745bc1")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("c2ceea31-8f7e-4531-9f12-c270fdba96a1")
        public static SmDependency getReferencingSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferencingSetDep;
        }

        @objid ("3f582e88-b4ac-44a7-9be6-86e62de5bd23")
        public static SmAttribute getUiDataVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UiDataVersionAtt;
        }

        @objid ("000952d6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5ed3dc88-e389-4bf5-96ed-be1eb66fdbfe")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("8bd5a87a-a949-4ae2-9024-28f7dc4a0343")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0009b280-c4c6-1fd8-97fe-001ec947cd2a")
        public static class UiDataSmAttribute extends SmAttribute {
            @objid ("1f4e35f8-aa2e-44cf-9912-002be142bd82")
            public Object getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mUiData;
            }

            @objid ("aa943e7d-cc28-424c-846b-40cb81f51f7a")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractDiagramData) data).mUiData = value;
            }

        }

        @objid ("000a11e4-c4c6-1fd8-97fe-001ec947cd2a")
        public static class PdePropertiesSmAttribute extends SmAttribute {
            @objid ("0bd9d83f-6fd3-4755-bf0a-c53e1d96d1da")
            public Object getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mPdeProperties;
            }

            @objid ("b8ece9c2-4302-419f-a008-791c20159b9d")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractDiagramData) data).mPdeProperties = value;
            }

        }

        @objid ("000a740e-c4c6-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmMultipleDependency {
            @objid ("26da2a46-9538-49c6-ad91-3b78c46c3160")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AbstractDiagramData)data).mRepresented != null)? ((AbstractDiagramData)data).mRepresented:SmMultipleDependency.EMPTY;
            }

            @objid ("cb3bc9af-68bd-45cd-830e-ed7ae7b1275b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AbstractDiagramData) data).mRepresented = new ArrayList<>(initialCapacity);
                return ((AbstractDiagramData) data).mRepresented;
            }

            @objid ("8f93f363-8c36-433c-9a07-cd94db734405")
            @Override
            public SmDependency getSymetric() {
                return ElementData.Metadata.DiagramElementDep();
            }

        }

        @objid ("000ad5b6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmSingleDependency {
            @objid ("fc342396-bd6d-4d0f-8c8d-37316e91999b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mOrigin;
            }

            @objid ("df4b691f-0315-403f-9ec4-3ad7e9c329b8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AbstractDiagramData) data).mOrigin = value;
            }

            @objid ("632503cd-02af-437d-9ff9-59d5995963b2")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ProductDep();
            }

        }

        @objid ("000bbfd0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ReferencingSetSmDependency extends SmMultipleDependency {
            @objid ("904f2e4c-7dee-4ef6-9253-c5673b769f84")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AbstractDiagramData)data).mReferencingSet != null)? ((AbstractDiagramData)data).mReferencingSet:SmMultipleDependency.EMPTY;
            }

            @objid ("c3f96754-3267-49e9-a601-b9080ea964fd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AbstractDiagramData) data).mReferencingSet = new ArrayList<>(initialCapacity);
                return ((AbstractDiagramData) data).mReferencingSet;
            }

            @objid ("b63179cc-ea75-4323-b870-bf06e11ec79d")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.ReferencedDiagramDep();
            }

        }

        @objid ("e9904bc6-c5d6-4d5e-ab2a-92df477da72e")
        public static class UiDataVersionSmAttribute extends SmAttribute {
            @objid ("87eff442-0ace-4d31-8170-66d8c7bf0d73")
            public Object getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mUiDataVersion;
            }

            @objid ("28c7e86f-8975-41e4-88f9-3ba8ef3913db")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractDiagramData) data).mUiDataVersion = value;
            }

        }

    }

}
