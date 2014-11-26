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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityFinalNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityFinalNode;
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

@objid ("0027e354-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityFinalNode.class, factory=ActivityFinalNodeData.Metadata.ObjectFactory.class)
public class ActivityFinalNodeData extends FinalNodeData {
    @objid ("9cbb2035-066d-4d2d-adeb-345dbbc6a38c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00107638-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d76d3676-b2cf-4dfe-8a76-02c6cc1166bd")
        private static SmClass smClass = null;

        @objid ("f1474032-4cc9-4fd9-866c-91992c290915")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityFinalNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e41506f0-eb16-4e45-8a64-10488bb6f2e6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0010b878-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f422424c-a751-4388-b4ac-23cd1275ba12")
            public ISmObjectData createData() {
                return new ActivityFinalNodeData();
            }

            @objid ("ccbba99c-e4ab-42bc-aa90-51d2fa4a45cd")
            public SmObjectImpl createImpl() {
                return new ActivityFinalNodeImpl();
            }

        }

    }

}
