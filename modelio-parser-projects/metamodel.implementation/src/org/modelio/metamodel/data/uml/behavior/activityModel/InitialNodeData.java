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
import org.modelio.metamodel.impl.uml.behavior.activityModel.InitialNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.InitialNode;
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

@objid ("0034c7ae-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InitialNode.class, factory=InitialNodeData.Metadata.ObjectFactory.class)
public class InitialNodeData extends ControlNodeData {
    @objid ("859bc3a7-43bd-45a2-9f3c-159de6d9298f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0043f530-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7f63bc01-0d58-47d1-89e4-4047028f151b")
        private static SmClass smClass = null;

        @objid ("b5af869b-018b-48ff-950e-270a274986b3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InitialNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0bc267cc-3d2e-4a27-ab1a-b99b43b06c97")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00443702-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a1490862-fba0-41f7-a97f-ae5e9139249a")
            public ISmObjectData createData() {
                return new InitialNodeData();
            }

            @objid ("17200163-c5c0-4528-8eb5-6ad0572dda21")
            public SmObjectImpl createImpl() {
                return new InitialNodeImpl();
            }

        }

    }

}
