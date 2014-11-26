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
import org.modelio.metamodel.data.uml.statik.ManifestationData;
import org.modelio.metamodel.data.uml.statik.NodeData;
import org.modelio.metamodel.impl.uml.statik.ArtifactImpl;
import org.modelio.metamodel.uml.statik.Artifact;
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

@objid ("009712f6-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Artifact.class, factory=ArtifactData.Metadata.ObjectFactory.class, cmsnode=true)
public class ArtifactData extends ClassifierData {
    @objid ("62429ae4-eee7-4178-881c-ba66a101b0b2")
    @SmaMetaAttribute(metaName="FileName", type=String.class, smAttributeClass=Metadata.FileNameSmAttribute.class)
     Object mFileName = "";

    @objid ("3f1283f9-1013-405f-b888-551bc806f6dd")
    @SmaMetaAssociation(metaName="Utilized", typeDataClass=ManifestationData.class, min=0, max=-1, smAssociationClass=Metadata.UtilizedSmDependency.class, component = true)
     List<SmObjectImpl> mUtilized = null;

    @objid ("6c5f0934-081f-4b85-9aab-c7ac66f720ad")
    @SmaMetaAssociation(metaName="DeploymentLocation", typeDataClass=NodeData.class, min=0, max=-1, smAssociationClass=Metadata.DeploymentLocationSmDependency.class)
     List<SmObjectImpl> mDeploymentLocation = null;

    @objid ("d858b80d-c92c-4f55-aa8f-d9cc2da0c622")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005945de-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1b385949-a813-44f3-8757-910c8594e802")
        private static SmClass smClass = null;

        @objid ("a4c62c13-228a-4f67-9508-fc2843c15b6c")
        private static SmAttribute FileNameAtt = null;

        @objid ("c8833c10-1b58-4e4f-bc22-07481851613a")
        private static SmDependency UtilizedDep = null;

        @objid ("9619835e-df45-41bd-bdd1-982581cc450e")
        private static SmDependency DeploymentLocationDep = null;

        @objid ("87710053-2bb4-46f8-bf32-8c3775487fa1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ArtifactData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("64c0cf64-8601-4fa0-9ed9-f65e79119873")
        public static SmAttribute FileNameAtt() {
            if (FileNameAtt == null) {
            	FileNameAtt = classof().getAttributeDef("FileName");
            }
            return FileNameAtt;
        }

        @objid ("1038ce11-8b3a-4784-b2d9-d4122d5b39b5")
        public static SmDependency UtilizedDep() {
            if (UtilizedDep == null) {
            	UtilizedDep = classof().getDependencyDef("Utilized");
            }
            return UtilizedDep;
        }

        @objid ("042993cd-330c-41e9-b044-fefa310c35f7")
        public static SmDependency DeploymentLocationDep() {
            if (DeploymentLocationDep == null) {
            	DeploymentLocationDep = classof().getDependencyDef("DeploymentLocation");
            }
            return DeploymentLocationDep;
        }

        @objid ("92aa4cdd-10ac-41c4-938f-aeeaf0f80d77")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("842722ab-f145-47b1-933e-935be319906f")
        public static SmDependency getDeploymentLocationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DeploymentLocationDep;
        }

        @objid ("c66abc40-4e11-4332-ab78-99c2a2b1ae96")
        public static SmDependency getUtilizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UtilizedDep;
        }

        @objid ("f208e6ff-01ca-4da1-b4ec-405dc219aad6")
        public static SmAttribute getFileNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FileNameAtt;
        }

        @objid ("0059868e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c1f26ec1-5fb6-4ae3-96ba-f8766758486b")
            public ISmObjectData createData() {
                return new ArtifactData();
            }

            @objid ("42814f77-f6cd-485b-bc95-ea80fc261178")
            public SmObjectImpl createImpl() {
                return new ArtifactImpl();
            }

        }

        @objid ("0059e8c2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class FileNameSmAttribute extends SmAttribute {
            @objid ("33b21e4f-bd3e-4435-b794-e6efc1ade9a5")
            public Object getValue(ISmObjectData data) {
                return ((ArtifactData) data).mFileName;
            }

            @objid ("0b824e42-2343-41fb-9ef9-857ef44a1925")
            public void setValue(ISmObjectData data, Object value) {
                ((ArtifactData) data).mFileName = value;
            }

        }

        @objid ("005a4e02-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DeploymentLocationSmDependency extends SmMultipleDependency {
            @objid ("c35dfaef-9f38-4ffe-ad87-17d540edd583")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ArtifactData)data).mDeploymentLocation != null)? ((ArtifactData)data).mDeploymentLocation:SmMultipleDependency.EMPTY;
            }

            @objid ("9ecc7a9b-ab9b-40b9-8389-011872491e36")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ArtifactData) data).mDeploymentLocation = new ArrayList<>(initialCapacity);
                return ((ArtifactData) data).mDeploymentLocation;
            }

            @objid ("ae3fdca2-8b9d-423a-b140-1a718c924164")
            @Override
            public SmDependency getSymetric() {
                return NodeData.Metadata.ResidentDep();
            }

        }

        @objid ("005ab1ee-c4c3-1fd8-97fe-001ec947cd2a")
        public static class UtilizedSmDependency extends SmMultipleDependency {
            @objid ("d9d502c9-ee9a-403f-a2e6-ae1643abe5a8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ArtifactData)data).mUtilized != null)? ((ArtifactData)data).mUtilized:SmMultipleDependency.EMPTY;
            }

            @objid ("ffc21feb-13d0-4b89-bc2e-4b9d78c481f7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ArtifactData) data).mUtilized = new ArrayList<>(initialCapacity);
                return ((ArtifactData) data).mUtilized;
            }

            @objid ("9d70bab0-3aa8-4746-8da7-b40534d4d956")
            @Override
            public SmDependency getSymetric() {
                return ManifestationData.Metadata.OwnerDep();
            }

        }

    }

}
