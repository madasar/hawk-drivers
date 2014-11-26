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
import org.modelio.metamodel.impl.uml.statik.NaryConnectorImpl;
import org.modelio.metamodel.uml.statik.NaryConnector;
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

@objid ("0006480c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=NaryConnector.class, factory=NaryConnectorData.Metadata.ObjectFactory.class)
public class NaryConnectorData extends NaryLinkData {
    @objid ("a6bc8fbb-2776-469a-bf5d-067fd8e1dbe0")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("e4b681d7-c074-4dd6-8f7b-b0635441ffd5")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("058cd8a0-3954-4927-89ca-132ebf6a2a4c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00297b9c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("65ff2335-b340-4d37-a350-7dec71cc8b71")
        private static SmClass smClass = null;

        @objid ("a0ca983d-1929-49c7-9675-175577a3fffc")
        private static SmDependency RepresentationDep = null;

        @objid ("fbf8d548-bf25-4c6b-887b-a58e71d1f532")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("5e326724-9520-4ad9-8ef4-5127b735af87")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryConnectorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ce14da0d-abe5-4b27-bd33-6dfdbf6c31b3")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("8534692c-945f-48e0-9f27-980932987b1f")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("4fe0b200-75c5-4965-8a96-d970ae4e8714")
        public static SmDependency getRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentationDep;
        }

        @objid ("498d8300-8d2a-48e2-a458-1a440049ccb7")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("49f80d3d-9741-4473-b78f-efc8c8b320fc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0029bee0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4af41803-ff0c-4479-ba1f-3fb08971cbb7")
            public ISmObjectData createData() {
                return new NaryConnectorData();
            }

            @objid ("aca7a66e-cddf-4755-86ac-dad5e3996a3a")
            public SmObjectImpl createImpl() {
                return new NaryConnectorImpl();
            }

        }

        @objid ("002a2178-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("8565cb43-e24d-478d-ae03-362987795f54")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryConnectorData) data).mRepresentedFeature;
            }

            @objid ("f60d25c5-06c0-4a47-b06b-46a6a87a0b79")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryConnectorData) data).mRepresentedFeature = value;
            }

            @objid ("04469290-7874-474b-9646-cee6d4cfe1a9")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingConnectorDep();
            }

        }

        @objid ("002a9612-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("e7c8ee11-16a6-40ce-8f9e-777d28b860c7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryConnectorData)data).mRepresentation != null)? ((NaryConnectorData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("779314fd-f0a7-4196-9abd-e55bf3670a10")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryConnectorData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((NaryConnectorData) data).mRepresentation;
            }

            @objid ("5a5b8455-659d-423c-a2ac-0924e9ca11dc")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.ConnectorRoleDep();
            }

        }

    }

}
