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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnScriptTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnScriptTaskImpl;
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

@objid ("00825802-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnScriptTask.class, factory=BpmnScriptTaskData.Metadata.ObjectFactory.class)
public class BpmnScriptTaskData extends BpmnTaskData {
    @objid ("72a795c4-322a-430b-8b59-7aae1d9230c6")
    @SmaMetaAttribute(metaName="ScriptLanguage", type=String.class, smAttributeClass=Metadata.ScriptLanguageSmAttribute.class)
     Object mScriptLanguage = "";

    @objid ("fbb8768e-9f1e-4e09-9de6-c87372e44a59")
    @SmaMetaAttribute(metaName="Script", type=String.class, smAttributeClass=Metadata.ScriptSmAttribute.class)
     Object mScript = "";

    @objid ("e9e51238-a335-4e67-b0a4-5c576a3243c3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006662b4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fc6c76fb-7d63-4ee0-bd2a-af6cb95ffaf1")
        private static SmClass smClass = null;

        @objid ("d49fd10a-0c65-4829-a2bb-9f8e8c878db4")
        private static SmAttribute ScriptLanguageAtt = null;

        @objid ("fd691b78-9de2-46a1-8dab-1babcf0a1365")
        private static SmAttribute ScriptAtt = null;

        @objid ("04f3a201-30b7-4729-a8cc-d9d8c41a647f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnScriptTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("acd3c7ed-0d57-41e4-8872-99df9be81643")
        public static SmAttribute ScriptLanguageAtt() {
            if (ScriptLanguageAtt == null) {
            	ScriptLanguageAtt = classof().getAttributeDef("ScriptLanguage");
            }
            return ScriptLanguageAtt;
        }

        @objid ("c1a5407f-90ea-44df-862a-0b3712b6ea41")
        public static SmAttribute ScriptAtt() {
            if (ScriptAtt == null) {
            	ScriptAtt = classof().getAttributeDef("Script");
            }
            return ScriptAtt;
        }

        @objid ("c5a86304-7b1e-4838-8601-52369e745c87")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("beef8193-938e-498b-beb7-b6c9c6f19593")
        public static SmAttribute getScriptAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ScriptAtt;
        }

        @objid ("9c79cf62-34f2-4284-abd5-f55b4d5954c4")
        public static SmAttribute getScriptLanguageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ScriptLanguageAtt;
        }

        @objid ("0066abd4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d06d6a78-fcdc-424e-a6f7-a206d837fe2d")
            public ISmObjectData createData() {
                return new BpmnScriptTaskData();
            }

            @objid ("d2c1419f-a76b-4cfd-9ea2-ad8a888b2e7e")
            public SmObjectImpl createImpl() {
                return new BpmnScriptTaskImpl();
            }

        }

        @objid ("00670f84-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ScriptLanguageSmAttribute extends SmAttribute {
            @objid ("06c8887d-fb69-46b4-80d7-52eca19a2d41")
            public Object getValue(ISmObjectData data) {
                return ((BpmnScriptTaskData) data).mScriptLanguage;
            }

            @objid ("48b053b4-c317-4031-b11c-d526ea17ada0")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnScriptTaskData) data).mScriptLanguage = value;
            }

        }

        @objid ("00677118-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ScriptSmAttribute extends SmAttribute {
            @objid ("ada29e12-fb53-4fa7-9d1f-1f09324929f8")
            public Object getValue(ISmObjectData data) {
                return ((BpmnScriptTaskData) data).mScript;
            }

            @objid ("6f49bde4-737b-4a63-88b4-df30d6bf7cf8")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnScriptTaskData) data).mScript = value;
            }

        }

    }

}
