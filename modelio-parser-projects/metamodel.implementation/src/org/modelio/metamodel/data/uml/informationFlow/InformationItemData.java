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
package org.modelio.metamodel.data.uml.informationFlow;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.impl.uml.informationFlow.InformationItemImpl;
import org.modelio.metamodel.uml.informationFlow.InformationItem;
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

@objid ("006434d0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InformationItem.class, factory=InformationItemData.Metadata.ObjectFactory.class)
public class InformationItemData extends ClassifierData {
    @objid ("d35ccb11-5a55-4846-9209-bc3e74b15e27")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ClassifierData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     List<SmObjectImpl> mRepresented = null;

    @objid ("dd4f5087-a97e-49c8-bc7c-58ebedf773bc")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001732f2-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7f498d3a-741c-4770-a948-7f05134c8b1f")
        private static SmClass smClass = null;

        @objid ("ef68cb94-ffc4-4d93-92c4-048d9cef164d")
        private static SmDependency RepresentedDep = null;

        @objid ("aac54722-dcae-4c1d-b60f-913ad76e0eb9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InformationItemData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4628f75c-4c77-4b8e-87f3-b40f90670d22")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("97528fd3-0666-40ea-a49f-71a42643252f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d209e393-2863-4fa4-ae45-d37a274fab2d")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("001774b0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3de55a33-cb8d-4a17-9820-d9ac3cdc902b")
            public ISmObjectData createData() {
                return new InformationItemData();
            }

            @objid ("356ef659-7f2c-4ae2-8cc8-b86684c5b1c7")
            public SmObjectImpl createImpl() {
                return new InformationItemImpl();
            }

        }

        @objid ("0017d59a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmMultipleDependency {
            @objid ("05a18a53-8210-4813-8fc7-1bf062e10737")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationItemData)data).mRepresented != null)? ((InformationItemData)data).mRepresented:SmMultipleDependency.EMPTY;
            }

            @objid ("9d844243-ec35-405f-b1cd-4837247887e2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationItemData) data).mRepresented = new ArrayList<>(initialCapacity);
                return ((InformationItemData) data).mRepresented;
            }

            @objid ("a084dac9-d05e-4485-aa0c-d994f1fe572e")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.RepresentationDep();
            }

        }

    }

}
