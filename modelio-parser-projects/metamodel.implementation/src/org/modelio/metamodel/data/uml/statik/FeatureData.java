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
import org.modelio.metamodel.impl.uml.statik.FeatureImpl;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.VisibilityMode;
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

@objid ("000b775a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Feature.class, factory=FeatureData.Metadata.ObjectFactory.class)
public abstract class FeatureData extends ModelElementData {
    @objid ("9ed02842-0fae-462d-a849-fd5c2c5a263a")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PUBLIC;

    @objid ("98ccd46d-4bc6-446b-830c-5aa1484a45c4")
    @SmaMetaAttribute(metaName="IsClass", type=Boolean.class, smAttributeClass=Metadata.IsClassSmAttribute.class)
     Object mIsClass = false;

    @objid ("2d3eba0f-09e2-42b6-9fea-020616e39695")
    @SmaMetaAttribute(metaName="IsAbstract", type=Boolean.class, smAttributeClass=Metadata.IsAbstractSmAttribute.class)
     Object mIsAbstract = false;

    @objid ("1b68797d-28cc-4f85-94b0-9af10f394f42")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00230b68-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("846efbab-e86e-460b-bc3d-8ec05040e37f")
        private static SmClass smClass = null;

        @objid ("088c0fe0-74b4-4bee-9966-79bdb1e90752")
        private static SmAttribute VisibilityAtt = null;

        @objid ("1624c71c-7384-4324-b8a4-7398a1520c96")
        private static SmAttribute IsClassAtt = null;

        @objid ("2b0eb9a7-2f3a-40d6-986f-f0665011367b")
        private static SmAttribute IsAbstractAtt = null;

        @objid ("54290353-2f31-475b-ba54-85faab743097")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(FeatureData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0532475e-0d88-46f1-9bd7-4792d3012506")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("2500c0f2-74b8-43b6-9ab7-78c4e2634611")
        public static SmAttribute IsClassAtt() {
            if (IsClassAtt == null) {
            	IsClassAtt = classof().getAttributeDef("IsClass");
            }
            return IsClassAtt;
        }

        @objid ("3974a7a6-886d-4244-9123-a62820095e89")
        public static SmAttribute IsAbstractAtt() {
            if (IsAbstractAtt == null) {
            	IsAbstractAtt = classof().getAttributeDef("IsAbstract");
            }
            return IsAbstractAtt;
        }

        @objid ("1c7041cb-118b-4605-adf9-2713a2820cdc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3a718a3e-9c20-41cf-a738-7954f6121263")
        public static SmAttribute getIsAbstractAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsAbstractAtt;
        }

        @objid ("487c76a1-24c0-4c2d-8963-b477fa8bfe18")
        public static SmAttribute getIsClassAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsClassAtt;
        }

        @objid ("aa0f6bae-d83a-407f-ae3e-18f28a33828e")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("00234b8c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("423c7729-5199-487c-8ac8-6ffe36538545")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("1bc9f8d7-69d0-4fbc-9c6f-c9c8a906c587")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0023b0fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("b804bfb4-53a6-43f9-a8d2-67cb9f0fbf44")
            public Object getValue(ISmObjectData data) {
                return ((FeatureData) data).mVisibility;
            }

            @objid ("b1abdb2d-7e07-4fa3-9358-53e039432f2b")
            public void setValue(ISmObjectData data, Object value) {
                ((FeatureData) data).mVisibility = value;
            }

        }

        @objid ("00241206-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsClassSmAttribute extends SmAttribute {
            @objid ("791b03c8-d773-48a7-90f3-98526e8cd4fe")
            public Object getValue(ISmObjectData data) {
                return ((FeatureData) data).mIsClass;
            }

            @objid ("ce2c149b-41bf-4579-b6ef-310f2e20cd20")
            public void setValue(ISmObjectData data, Object value) {
                ((FeatureData) data).mIsClass = value;
            }

        }

        @objid ("002471ec-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsAbstractSmAttribute extends SmAttribute {
            @objid ("586e314d-0c87-4cf8-96d1-18fad331e72b")
            public Object getValue(ISmObjectData data) {
                return ((FeatureData) data).mIsAbstract;
            }

            @objid ("e63de123-9823-401c-a83f-7036b925715b")
            public void setValue(ISmObjectData data, Object value) {
                ((FeatureData) data).mIsAbstract = value;
            }

        }

    }

}
