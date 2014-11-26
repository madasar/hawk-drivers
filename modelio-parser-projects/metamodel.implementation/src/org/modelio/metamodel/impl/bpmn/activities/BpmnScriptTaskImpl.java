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
import org.modelio.metamodel.bpmn.activities.BpmnScriptTask;
import org.modelio.metamodel.data.bpmn.activities.BpmnScriptTaskData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00822bd4-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnScriptTaskImpl extends BpmnTaskImpl implements BpmnScriptTask {
    @objid ("d20f0633-8a3c-4b53-8f64-b51b5936f17c")
    @Override
    public String getScriptLanguage() {
        return (String) getAttVal(BpmnScriptTaskData.Metadata.ScriptLanguageAtt());
    }

    @objid ("9e918ab7-39ef-47db-a330-9ca7c441a14c")
    @Override
    public void setScriptLanguage(String value) {
        setAttVal(BpmnScriptTaskData.Metadata.ScriptLanguageAtt(), value);
    }

    @objid ("e5090c2f-8cc1-4f9b-b766-c95cf025e557")
    @Override
    public String getScript() {
        return (String) getAttVal(BpmnScriptTaskData.Metadata.ScriptAtt());
    }

    @objid ("9462f933-c6c0-4a18-80e7-c731c7b39ec4")
    @Override
    public void setScript(String value) {
        setAttVal(BpmnScriptTaskData.Metadata.ScriptAtt(), value);
    }

    @objid ("cbc6b538-f4c1-4a2b-8693-c7687e11656f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3a2342b7-7d97-4c96-a88d-5cab760992fa")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("065761c3-4f18-4a1a-baf0-6a668a9e4c14")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnScriptTask(this);
        else
          return null;
    }

}
