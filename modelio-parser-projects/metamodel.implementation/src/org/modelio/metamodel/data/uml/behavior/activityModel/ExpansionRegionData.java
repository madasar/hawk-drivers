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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ExpansionNodeData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ExpansionRegionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionKind;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;
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

@objid ("00322346-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExpansionRegion.class, factory=ExpansionRegionData.Metadata.ObjectFactory.class)
public class ExpansionRegionData extends StructuredActivityNodeData {
    @objid ("b26771de-5948-4a86-8577-0be74d9189c5")
    @SmaMetaAttribute(metaName="Mode", type=ExpansionKind.class, smAttributeClass=Metadata.ModeSmAttribute.class)
     Object mMode = ExpansionKind.ITERATIVE;

    @objid ("ee630322-24e4-44d0-870e-79a1602fb2b5")
    @SmaMetaAssociation(metaName="OutputElement", typeDataClass=ExpansionNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OutputElementSmDependency.class, component = true, partof = true)
     List<SmObjectImpl> mOutputElement = null;

    @objid ("b23b749b-5477-4f8d-ab0d-3d35b5006754")
    @SmaMetaAssociation(metaName="InputElement", typeDataClass=ExpansionNodeData.class, min=1, max=-1, smAssociationClass=Metadata.InputElementSmDependency.class, component = true, partof = true)
     List<SmObjectImpl> mInputElement = null;

    @objid ("4d215043-6fff-4c2e-9c83-328dfdabcd6f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008dd3da-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0bbdcfa1-e252-46b0-af85-bd6b15c51cc1")
        private static SmClass smClass = null;

        @objid ("514f4c4b-145f-4825-8868-003dcd852127")
        private static SmAttribute ModeAtt = null;

        @objid ("a0f59840-bc7e-4def-bf84-5a679220646d")
        private static SmDependency OutputElementDep = null;

        @objid ("f40d6b70-45be-44ea-926c-664709668a86")
        private static SmDependency InputElementDep = null;

        @objid ("19b87d1b-6f93-492f-ae6f-bf48a02fade4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExpansionRegionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("11a072c0-928f-4cb0-a9de-c66690d0fc90")
        public static SmAttribute ModeAtt() {
            if (ModeAtt == null) {
            	ModeAtt = classof().getAttributeDef("Mode");
            }
            return ModeAtt;
        }

        @objid ("10378dad-661d-41a2-91c9-02b6a7c902e9")
        public static SmDependency OutputElementDep() {
            if (OutputElementDep == null) {
            	OutputElementDep = classof().getDependencyDef("OutputElement");
            }
            return OutputElementDep;
        }

        @objid ("0ef30b7e-8624-4990-8efb-064757deec55")
        public static SmDependency InputElementDep() {
            if (InputElementDep == null) {
            	InputElementDep = classof().getDependencyDef("InputElement");
            }
            return InputElementDep;
        }

        @objid ("68aa1380-be02-4a1a-be50-7a0d58fecd35")
        public static SmAttribute getModeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModeAtt;
        }

        @objid ("430dbb99-f524-4303-882a-7092058741e8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("567bc04b-b300-48d0-9aaf-1ccd6bded871")
        public static SmDependency getOutputElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputElementDep;
        }

        @objid ("c414ce4d-666d-4178-b52a-0c71860ba7d5")
        public static SmDependency getInputElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputElementDep;
        }

        @objid ("008e2a2e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4d16dd01-223c-4023-8c3a-d271fe0233c9")
            public ISmObjectData createData() {
                return new ExpansionRegionData();
            }

            @objid ("cfe400dd-3bfb-4616-a9f3-ebd295c97f54")
            public SmObjectImpl createImpl() {
                return new ExpansionRegionImpl();
            }

        }

        @objid ("008e9842-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ModeSmAttribute extends SmAttribute {
            @objid ("8045978e-ee18-4723-804f-95f65146dd46")
            public Object getValue(ISmObjectData data) {
                return ((ExpansionRegionData) data).mMode;
            }

            @objid ("091a5a6c-5ec2-421b-8068-3a2927f6a878")
            public void setValue(ISmObjectData data, Object value) {
                ((ExpansionRegionData) data).mMode = value;
            }

        }

        @objid ("008ff340-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InputElementSmDependency extends SmMultipleDependency {
            @objid ("72f52463-0a95-4956-9db2-de96e8496d9d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExpansionRegionData)data).mInputElement != null)? ((ExpansionRegionData)data).mInputElement:SmMultipleDependency.EMPTY;
            }

            @objid ("37fd1085-82e7-4c8c-a7fb-e726904cfdc8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExpansionRegionData) data).mInputElement = new ArrayList<>(initialCapacity);
                return ((ExpansionRegionData) data).mInputElement;
            }

            @objid ("c8d74ebc-c2b5-45ee-8635-189c83aa6451")
            @Override
            public SmDependency getSymetric() {
                return ExpansionNodeData.Metadata.RegionAsInputDep();
            }

        }

        @objid ("00907252-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutputElementSmDependency extends SmMultipleDependency {
            @objid ("5d5252e3-44ad-4c1b-a6aa-eedcca9fb483")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExpansionRegionData)data).mOutputElement != null)? ((ExpansionRegionData)data).mOutputElement:SmMultipleDependency.EMPTY;
            }

            @objid ("d3514bc9-efa1-422c-a347-37ba91873234")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExpansionRegionData) data).mOutputElement = new ArrayList<>(initialCapacity);
                return ((ExpansionRegionData) data).mOutputElement;
            }

            @objid ("a28e7129-fc28-48d7-a3d8-d2c5d68b7d3d")
            @Override
            public SmDependency getSymetric() {
                return ExpansionNodeData.Metadata.RegionAsOutputDep();
            }

        }

    }

}
