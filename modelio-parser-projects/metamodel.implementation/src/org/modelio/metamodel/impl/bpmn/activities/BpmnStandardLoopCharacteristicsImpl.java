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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnStandardLoopCharacteristics;
import org.modelio.metamodel.data.bpmn.activities.BpmnStandardLoopCharacteristicsData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0083ce8a-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnStandardLoopCharacteristicsImpl extends BpmnLoopCharacteristicsImpl implements BpmnStandardLoopCharacteristics {
    @objid ("0dea1906-673c-43f9-94fa-119889334508")
    @Override
    public boolean isTestBefore() {
        return (Boolean) getAttVal(BpmnStandardLoopCharacteristicsData.Metadata.TestBeforeAtt());
    }

    @objid ("3cc0523a-b971-450e-b685-74c4e513f9b2")
    @Override
    public void setTestBefore(boolean value) {
        setAttVal(BpmnStandardLoopCharacteristicsData.Metadata.TestBeforeAtt(), value);
    }

    @objid ("083ef39d-594a-4149-98a5-7eac74ad198c")
    @Override
    public String getLoopCondition() {
        return (String) getAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopConditionAtt());
    }

    @objid ("098be0cf-4158-44d7-bbd0-93cc8f377295")
    @Override
    public void setLoopCondition(String value) {
        setAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopConditionAtt(), value);
    }

    @objid ("2dbbc533-b123-4b2f-864d-4a8037b47fcb")
    @Override
    public String getLoopMaximum() {
        return (String) getAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopMaximumAtt());
    }

    @objid ("bd599c6b-433a-4a1e-9803-1deefbee23f7")
    @Override
    public void setLoopMaximum(String value) {
        setAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopMaximumAtt(), value);
    }

    @objid ("74d8af88-ad8e-47eb-8628-54beed5f400e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("66562d2e-26f9-4feb-bdf1-56d03c332234")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("ceaee91a-de76-4524-80af-c50bfd9ee5f7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnStandardLoopCharacteristics(this);
        else
          return null;
    }

}
