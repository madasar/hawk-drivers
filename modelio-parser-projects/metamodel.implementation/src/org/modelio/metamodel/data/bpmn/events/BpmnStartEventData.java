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
package org.modelio.metamodel.data.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnStartEvent;
import org.modelio.metamodel.impl.bpmn.events.BpmnStartEventImpl;
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

@objid ("0092bf4e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnStartEvent.class, factory=BpmnStartEventData.Metadata.ObjectFactory.class)
public class BpmnStartEventData extends BpmnCatchEventData {
    @objid ("4d6734f1-70e6-453e-9029-62fdbdd6391f")
    @SmaMetaAttribute(metaName="IsInterrupting", type=Boolean.class, smAttributeClass=Metadata.IsInterruptingSmAttribute.class)
     Object mIsInterrupting = false;

    @objid ("ca4d8768-d8a3-458a-b0a3-7737b04a03e3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000835fe-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3c449616-77bf-4907-8640-f182a077e1dc")
        private static SmClass smClass = null;

        @objid ("697c510e-5a4c-4459-aacb-56e33a465317")
        private static SmAttribute IsInterruptingAtt = null;

        @objid ("25080536-2a35-4e0b-9505-f30cf0ae517a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnStartEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("095cae0e-689b-46a7-beaa-e938ee47ce29")
        public static SmAttribute IsInterruptingAtt() {
            if (IsInterruptingAtt == null) {
            	IsInterruptingAtt = classof().getAttributeDef("IsInterrupting");
            }
            return IsInterruptingAtt;
        }

        @objid ("8121bf6c-58ef-4106-bcb0-20e71e1d1e8f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d7e3da6a-d004-49e8-91de-2ee1b72eae19")
        public static SmAttribute getIsInterruptingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsInterruptingAtt;
        }

        @objid ("000876d6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2c342a13-6010-47eb-b0ee-fc7d04141229")
            public ISmObjectData createData() {
                return new BpmnStartEventData();
            }

            @objid ("0bb3e859-87b2-4eee-9075-2ef302fd74fb")
            public SmObjectImpl createImpl() {
                return new BpmnStartEventImpl();
            }

        }

        @objid ("0008d810-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsInterruptingSmAttribute extends SmAttribute {
            @objid ("a9aeab12-1687-4100-8c52-e1815746213e")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStartEventData) data).mIsInterrupting;
            }

            @objid ("9146f29c-8a37-4b3e-9432-bdcad0b7a5f0")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStartEventData) data).mIsInterrupting = value;
            }

        }

    }

}
