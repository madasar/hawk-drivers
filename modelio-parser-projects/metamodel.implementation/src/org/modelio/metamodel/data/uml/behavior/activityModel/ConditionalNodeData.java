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
import org.modelio.metamodel.data.uml.behavior.activityModel.ClauseData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ConditionalNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
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

@objid ("002db2e8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ConditionalNode.class, factory=ConditionalNodeData.Metadata.ObjectFactory.class)
public class ConditionalNodeData extends StructuredActivityNodeData {
    @objid ("041c172f-9527-4b66-b007-5c5840d2d99f")
    @SmaMetaAttribute(metaName="IsDeterminate", type=Boolean.class, smAttributeClass=Metadata.IsDeterminateSmAttribute.class)
     Object mIsDeterminate = false;

    @objid ("87aaa1ce-9876-4cdc-a6b8-7650e53818d3")
    @SmaMetaAttribute(metaName="IsAssured", type=Boolean.class, smAttributeClass=Metadata.IsAssuredSmAttribute.class)
     Object mIsAssured = false;

    @objid ("b4cf153b-54be-4078-988e-3d5cc142f437")
    @SmaMetaAssociation(metaName="OwnedClause", typeDataClass=ClauseData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedClauseSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedClause = null;

    @objid ("026c4764-993f-4855-920c-b5397b208ee7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0003d1a8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9ebc99da-1e95-4567-905f-4f29bd375109")
        private static SmClass smClass = null;

        @objid ("1921ca68-0a46-40a1-87c8-dce40dcb8c26")
        private static SmAttribute IsDeterminateAtt = null;

        @objid ("08225753-1ef1-4fe3-8283-ca877b52af96")
        private static SmAttribute IsAssuredAtt = null;

        @objid ("99668d2c-dbac-485a-b6b2-b5541d48e795")
        private static SmDependency OwnedClauseDep = null;

        @objid ("11cc5b5e-888c-4a6d-ae1a-f6db49758a50")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConditionalNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("be60f148-02c8-4e5f-acd6-d073c42fd854")
        public static SmAttribute IsDeterminateAtt() {
            if (IsDeterminateAtt == null) {
            	IsDeterminateAtt = classof().getAttributeDef("IsDeterminate");
            }
            return IsDeterminateAtt;
        }

        @objid ("df4a16c4-c771-43ec-93be-079d8c044642")
        public static SmAttribute IsAssuredAtt() {
            if (IsAssuredAtt == null) {
            	IsAssuredAtt = classof().getAttributeDef("IsAssured");
            }
            return IsAssuredAtt;
        }

        @objid ("0dbff686-87c5-4871-a268-99c662fad313")
        public static SmDependency OwnedClauseDep() {
            if (OwnedClauseDep == null) {
            	OwnedClauseDep = classof().getDependencyDef("OwnedClause");
            }
            return OwnedClauseDep;
        }

        @objid ("190dd721-1cc6-44d5-b482-e938b07d203c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("db08f57a-3eb3-4d6e-aec7-5d3eff3a6861")
        public static SmAttribute getIsDeterminateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsDeterminateAtt;
        }

        @objid ("0bffa4d8-72af-48cf-94db-f5366f449778")
        public static SmDependency getOwnedClauseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedClauseDep;
        }

        @objid ("1976d18d-1d97-4824-8a8f-26952dcf9000")
        public static SmAttribute getIsAssuredAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsAssuredAtt;
        }

        @objid ("0004248c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a153fa6e-0996-46f8-8930-495a9ec8ba01")
            public ISmObjectData createData() {
                return new ConditionalNodeData();
            }

            @objid ("cbbaf1f8-61b5-4ad1-9b59-99358e7b3f44")
            public SmObjectImpl createImpl() {
                return new ConditionalNodeImpl();
            }

        }

        @objid ("0004897c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsDeterminateSmAttribute extends SmAttribute {
            @objid ("fc77b6c4-efac-41aa-b0a2-e030ea5ee29c")
            public Object getValue(ISmObjectData data) {
                return ((ConditionalNodeData) data).mIsDeterminate;
            }

            @objid ("6d05839b-4de1-4e76-b481-2b44e15579ff")
            public void setValue(ISmObjectData data, Object value) {
                ((ConditionalNodeData) data).mIsDeterminate = value;
            }

        }

        @objid ("0004f786-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsAssuredSmAttribute extends SmAttribute {
            @objid ("76081853-ee4f-4948-a765-e9dbe534af16")
            public Object getValue(ISmObjectData data) {
                return ((ConditionalNodeData) data).mIsAssured;
            }

            @objid ("06a5f724-0367-42e9-a6f1-d5e6605c977b")
            public void setValue(ISmObjectData data, Object value) {
                ((ConditionalNodeData) data).mIsAssured = value;
            }

        }

        @objid ("00055d7a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedClauseSmDependency extends SmMultipleDependency {
            @objid ("c929555e-73a8-4864-a5de-531982181609")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ConditionalNodeData)data).mOwnedClause != null)? ((ConditionalNodeData)data).mOwnedClause:SmMultipleDependency.EMPTY;
            }

            @objid ("e1900c12-1719-4db4-90df-e588c0a1e348")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ConditionalNodeData) data).mOwnedClause = new ArrayList<>(initialCapacity);
                return ((ConditionalNodeData) data).mOwnedClause;
            }

            @objid ("3a81f948-bd70-4853-b123-d9ce46554971")
            @Override
            public SmDependency getSymetric() {
                return ClauseData.Metadata.OwnerDep();
            }

        }

    }

}
