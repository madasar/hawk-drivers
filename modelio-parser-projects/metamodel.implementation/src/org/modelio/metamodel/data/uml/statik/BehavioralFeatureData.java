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
import org.modelio.metamodel.impl.uml.statik.BehavioralFeatureImpl;
import org.modelio.metamodel.uml.statik.BehavioralFeature;
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

@objid ("00205526-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BehavioralFeature.class, factory=BehavioralFeatureData.Metadata.ObjectFactory.class)
public class BehavioralFeatureData extends FeatureData {
    @objid ("df9adfd2-bf45-4af8-8fb7-98a50951a040")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00578b86-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("09e3f852-f29b-4768-ac88-1437d1d6515d")
        private static SmClass smClass = null;

        @objid ("0554bdf0-f42e-4ffd-a329-02d29d6665e9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BehavioralFeatureData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8b25e666-8aa8-4645-8d51-29e290c6ecb6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("005895ee-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5af7fb1a-3cd9-4e2e-b41d-2b4e9fb5a6ac")
            public ISmObjectData createData() {
                return new BehavioralFeatureData();
            }

            @objid ("da609b87-1525-4cdf-9410-2b5c5ec1907f")
            public SmObjectImpl createImpl() {
                return new BehavioralFeatureImpl();
            }

        }

    }

}
