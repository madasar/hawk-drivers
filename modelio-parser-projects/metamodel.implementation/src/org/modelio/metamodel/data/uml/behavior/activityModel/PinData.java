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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.PinImpl;
import org.modelio.metamodel.uml.behavior.activityModel.Pin;
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

@objid ("003cf4e2-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Pin.class, factory=PinData.Metadata.ObjectFactory.class)
public abstract class PinData extends ObjectNodeData {
    @objid ("f3804d77-7786-4e3c-9dd5-28dcde605ec0")
    @SmaMetaAttribute(metaName="IsControl", type=Boolean.class, smAttributeClass=Metadata.IsControlSmAttribute.class)
     Object mIsControl = false;

    @objid ("6819bbea-7f6f-4f73-b680-0d2d2b13561d")
    @SmaMetaAttribute(metaName="IsExpansion", type=Boolean.class, smAttributeClass=Metadata.IsExpansionSmAttribute.class)
     Object mIsExpansion = false;

    @objid ("7deba86f-a3d6-4a96-89a6-604a43b2561d")
    @SmaMetaAssociation(metaName="Matched", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.MatchedSmDependency.class, partof = true)
     SmObjectImpl mMatched;

    @objid ("cf1ff2f6-07e5-4e66-8bcd-7617073ffff2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002fdd34-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0c82429e-03c2-4c43-ad0e-139b6c186055")
        private static SmClass smClass = null;

        @objid ("a1e32ba1-2f42-4312-9fe8-8ebd1d679f4e")
        private static SmAttribute IsControlAtt = null;

        @objid ("f09cda8e-ec43-48b7-a615-34c56e45d208")
        private static SmAttribute IsExpansionAtt = null;

        @objid ("04ac8cac-10f3-4e6d-94c2-aa9098d47dd6")
        private static SmDependency MatchedDep = null;

        @objid ("ed8037ea-1e8f-49e5-bfd2-c603e9f21bdd")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b8855bda-226c-4fea-a4af-2027539cdfaf")
        public static SmAttribute IsControlAtt() {
            if (IsControlAtt == null) {
            	IsControlAtt = classof().getAttributeDef("IsControl");
            }
            return IsControlAtt;
        }

        @objid ("66cd9299-88b8-481b-91d7-2b6315720489")
        public static SmAttribute IsExpansionAtt() {
            if (IsExpansionAtt == null) {
            	IsExpansionAtt = classof().getAttributeDef("IsExpansion");
            }
            return IsExpansionAtt;
        }

        @objid ("bab7ee7b-2ba1-4fe1-a107-b6b94551f267")
        public static SmDependency MatchedDep() {
            if (MatchedDep == null) {
            	MatchedDep = classof().getDependencyDef("Matched");
            }
            return MatchedDep;
        }

        @objid ("698fdab2-6926-4a1c-a9fd-9e24d3ccc2ae")
        public static SmAttribute getIsExpansionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExpansionAtt;
        }

        @objid ("7c2b1516-045a-4e74-99ed-c7b77b597fbd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7ccdde73-e19b-4f55-add0-2c2556b32504")
        public static SmDependency getMatchedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MatchedDep;
        }

        @objid ("afe1fa62-f35d-4b79-890b-2d0b5c9f4ee1")
        public static SmAttribute getIsControlAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsControlAtt;
        }

        @objid ("0030205a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0607dcfe-0c15-4c45-ba01-216a27ebbe4c")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("10069aa0-f694-4cf6-9c8d-2628cc68b3c7")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00308342-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsControlSmAttribute extends SmAttribute {
            @objid ("2a63302b-b9cd-4ddb-b162-d290f44e11a3")
            public Object getValue(ISmObjectData data) {
                return ((PinData) data).mIsControl;
            }

            @objid ("17c847aa-4d89-45f7-a22e-bf03e22d2235")
            public void setValue(ISmObjectData data, Object value) {
                ((PinData) data).mIsControl = value;
            }

        }

        @objid ("0030e7ba-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsExpansionSmAttribute extends SmAttribute {
            @objid ("79fdd70e-c138-4bdb-96f3-e8480d9a4bb9")
            public Object getValue(ISmObjectData data) {
                return ((PinData) data).mIsExpansion;
            }

            @objid ("ca55f8d2-116f-4646-b0b7-53065025eb8b")
            public void setValue(ISmObjectData data, Object value) {
                ((PinData) data).mIsExpansion = value;
            }

        }

        @objid ("00314c50-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MatchedSmDependency extends SmSingleDependency {
            @objid ("df020356-b22e-45c8-9051-d05ffed3fedc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PinData) data).mMatched;
            }

            @objid ("78587d49-8aa4-493b-8f55-7797c0b0fa81")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PinData) data).mMatched = value;
            }

            @objid ("5d981084-c12c-4cd6-82c4-db44cb34d10d")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.MatchingDep();
            }

        }

    }

}
