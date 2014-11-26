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
import org.modelio.metamodel.data.uml.statik.BindingData;
import org.modelio.metamodel.impl.uml.statik.ConnectorEndImpl;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
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

@objid ("000701ac-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ConnectorEnd.class, factory=ConnectorEndData.Metadata.ObjectFactory.class)
public class ConnectorEndData extends LinkEndData {
    @objid ("110e1935-aba9-4012-a62d-4a336fcf9f97")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("da680558-d59c-4e7b-ac98-18cf60f5ae67")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("83f2c281-16b9-43dd-9730-4a01892204d8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00972548-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("126e255e-e62b-479c-bd27-668103030fd3")
        private static SmClass smClass = null;

        @objid ("4c5cc137-c9dd-468d-8657-5ad47bf848ac")
        private static SmDependency RepresentationDep = null;

        @objid ("2bbb56b0-7678-4356-9f44-aa4f834be822")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("b185b486-a97e-4f11-b5d5-3d51692a0896")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConnectorEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("817f51c6-b8aa-4b3f-9092-6d1e92d99eef")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("eec11317-8483-4cd8-939a-e7428521bd49")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("7d69ba21-5ffb-476a-9d90-53443052f7d8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ddeaffb7-d8c2-4272-9d6b-a6bc3e1bb5c1")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("bc052e5d-cb31-4396-beae-6c694874d77f")
        public static SmDependency getRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentationDep;
        }

        @objid ("009775f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4a52c6d2-28b6-4c95-af96-92b72250e61c")
            public ISmObjectData createData() {
                return new ConnectorEndData();
            }

            @objid ("871c25b4-889a-4754-8a3c-00fd7b0c59d0")
            public SmObjectImpl createImpl() {
                return new ConnectorEndImpl();
            }

        }

        @objid ("0097ef82-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("55fa1acf-e719-4d3f-97f1-6cdeb0b1bad9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectorEndData) data).mRepresentedFeature;
            }

            @objid ("762058f9-e1fd-4530-94e0-89ec9a297ed9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectorEndData) data).mRepresentedFeature = value;
            }

            @objid ("10e3e2aa-90d4-4743-9c9c-43ee9a4b1e16")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingEndDep();
            }

        }

        @objid ("009879c0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("e4e63e78-819d-473f-bcc5-3cb2b5635bdc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ConnectorEndData)data).mRepresentation != null)? ((ConnectorEndData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("654242f3-c782-4151-b3bc-74bfa6bbf2a2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ConnectorEndData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((ConnectorEndData) data).mRepresentation;
            }

            @objid ("ee1715b2-2341-42ca-b179-e1bb2b5a21db")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.ConnectorEndRoleDep();
            }

        }

    }

}
