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
package org.modelio.metamodel.data.diagrams;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.ActivityDiagram;
import org.modelio.metamodel.impl.diagrams.ActivityDiagramImpl;
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

@objid ("00682d06-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityDiagram.class, factory=ActivityDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class ActivityDiagramData extends BehaviorDiagramData {
    @objid ("43aa4d74-78a3-4de4-88bf-6fa8f3676a52")
    @SmaMetaAttribute(metaName="IsVertical", type=Boolean.class, smAttributeClass=Metadata.IsVerticalSmAttribute.class)
     Object mIsVertical = false;

    @objid ("29c5cda4-6526-41b3-9678-6f23bdf4298d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000befbe-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e83b93c9-9e97-4e29-a1bb-35c895e0f584")
        private static SmClass smClass = null;

        @objid ("94787735-4632-4601-b66c-512bbfeac996")
        private static SmAttribute IsVerticalAtt = null;

        @objid ("4195b5bc-1016-4461-9a49-baca0b0fd012")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2bf60120-ffe0-4ac4-b33f-4219b9da263e")
        public static SmAttribute IsVerticalAtt() {
            if (IsVerticalAtt == null) {
            	IsVerticalAtt = classof().getAttributeDef("IsVertical");
            }
            return IsVerticalAtt;
        }

        @objid ("9410ed39-aac3-45be-8acc-0bafc04df876")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("cb506658-e475-4d48-8006-05d95e8343ec")
        public static SmAttribute getIsVerticalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsVerticalAtt;
        }

        @objid ("000c4810-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3c808179-619a-48be-9285-2dda1862bd78")
            public ISmObjectData createData() {
                return new ActivityDiagramData();
            }

            @objid ("65fef172-815a-4abc-853f-95cdbbbcb8c0")
            public SmObjectImpl createImpl() {
                return new ActivityDiagramImpl();
            }

        }

        @objid ("000cbd18-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsVerticalSmAttribute extends SmAttribute {
            @objid ("5e1a2b59-d181-463d-9d7c-eacd08ac8039")
            public Object getValue(ISmObjectData data) {
                return ((ActivityDiagramData) data).mIsVertical;
            }

            @objid ("fc0f4c94-da7d-4179-bea7-16ce7daa7ad9")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityDiagramData) data).mIsVertical = value;
            }

        }

    }

}
