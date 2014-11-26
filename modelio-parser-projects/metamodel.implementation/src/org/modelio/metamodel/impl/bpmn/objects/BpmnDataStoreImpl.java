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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnDataStore;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataStoreData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00041136-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataStoreImpl extends BpmnItemAwareElementImpl implements BpmnDataStore {
    @objid ("57ee53e7-343d-469a-a909-b239669bf99b")
    @Override
    public int getCapacity() {
        return (Integer) getAttVal(BpmnDataStoreData.Metadata.CapacityAtt());
    }

    @objid ("b0b83340-8773-458e-b76d-6e2d1742b971")
    @Override
    public void setCapacity(int value) {
        setAttVal(BpmnDataStoreData.Metadata.CapacityAtt(), value);
    }

    @objid ("d7b8cd4d-fedf-40c0-944c-45bc2089e14e")
    @Override
    public boolean isIsUnlimited() {
        return (Boolean) getAttVal(BpmnDataStoreData.Metadata.IsUnlimitedAtt());
    }

    @objid ("5324ade3-3b8a-44a6-91d4-44083249c29d")
    @Override
    public void setIsUnlimited(boolean value) {
        setAttVal(BpmnDataStoreData.Metadata.IsUnlimitedAtt(), value);
    }

    @objid ("f45b6b5c-7fec-4d96-865c-5207442fb38f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("bad4c3fd-329e-441f-a582-65530a7046c3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("19b727ce-68f2-469a-b963-cb8fab9c6677")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataStore(this);
        else
          return null;
    }

}
