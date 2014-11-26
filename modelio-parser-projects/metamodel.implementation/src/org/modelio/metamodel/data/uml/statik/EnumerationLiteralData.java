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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.EnumerationData;
import org.modelio.metamodel.impl.uml.statik.EnumerationLiteralImpl;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
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

@objid ("000abb26-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=EnumerationLiteral.class, factory=EnumerationLiteralData.Metadata.ObjectFactory.class)
public class EnumerationLiteralData extends ModelElementData {
    @objid ("afc154af-66d3-476e-947f-3a3e5d4cb163")
    @SmaMetaAssociation(metaName="Valuated", typeDataClass=EnumerationData.class, min=1, max=1, smAssociationClass=Metadata.ValuatedSmDependency.class)
     SmObjectImpl mValuated;

    @objid ("5043c07c-7a02-42ec-8d30-001dfc0aa90a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0070ace2-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7194f05c-76c7-452f-a9de-04d5fa2c430c")
        private static SmClass smClass = null;

        @objid ("f2ef39f6-9b57-40c5-b751-c7aa8a6e7b28")
        private static SmDependency ValuatedDep = null;

        @objid ("696e9c08-487c-4686-a3f9-775a66156d1f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EnumerationLiteralData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8b731608-dd64-4510-8157-805053a12730")
        public static SmDependency ValuatedDep() {
            if (ValuatedDep == null) {
            	ValuatedDep = classof().getDependencyDef("Valuated");
            }
            return ValuatedDep;
        }

        @objid ("aff0c23b-4ab7-4476-ad77-3e213e14017b")
        public static SmDependency getValuatedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValuatedDep;
        }

        @objid ("e337897b-9944-4dd4-bc3b-8e5dc8326dd4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0070ee14-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a7d51699-704b-4bd8-83a8-5cfa2f9718ae")
            public ISmObjectData createData() {
                return new EnumerationLiteralData();
            }

            @objid ("2b380f0c-de9c-48fb-b936-7f57341ecbfa")
            public SmObjectImpl createImpl() {
                return new EnumerationLiteralImpl();
            }

        }

        @objid ("00715066-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ValuatedSmDependency extends SmSingleDependency {
            @objid ("9aeab051-d69c-4232-9c4f-39684c12d796")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EnumerationLiteralData) data).mValuated;
            }

            @objid ("7d997833-bbc0-4877-b60f-0859346bf840")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EnumerationLiteralData) data).mValuated = value;
            }

            @objid ("8757bfec-2df9-4ea6-bb33-d16b05939958")
            @Override
            public SmDependency getSymetric() {
                return EnumerationData.Metadata.ValueDep();
            }

        }

    }

}
