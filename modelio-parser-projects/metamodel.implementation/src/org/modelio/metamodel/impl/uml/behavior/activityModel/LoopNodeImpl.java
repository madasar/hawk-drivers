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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.activityModel.LoopNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.LoopNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00376270-c4bf-1fd8-97fe-001ec947cd2a")
public class LoopNodeImpl extends StructuredActivityNodeImpl implements LoopNode {
    @objid ("6a4b6b40-d93f-44f7-a354-1e23dd34e4bf")
    @Override
    public boolean isIsTestedFirst() {
        return (Boolean) getAttVal(LoopNodeData.Metadata.IsTestedFirstAtt());
    }

    @objid ("ca8371a7-8090-4431-bbbf-2d204f01516a")
    @Override
    public void setIsTestedFirst(boolean value) {
        setAttVal(LoopNodeData.Metadata.IsTestedFirstAtt(), value);
    }

    @objid ("16ad9cb5-4f3b-4adf-9274-41ac3c3ed9e9")
    @Override
    public String getSetup() {
        return (String) getAttVal(LoopNodeData.Metadata.SetupAtt());
    }

    @objid ("1b6c89f9-a71a-4251-8d0c-68919bd71bee")
    @Override
    public void setSetup(String value) {
        setAttVal(LoopNodeData.Metadata.SetupAtt(), value);
    }

    @objid ("34115b72-6f4f-4e7b-8626-d83e97717620")
    @Override
    public String getTest() {
        return (String) getAttVal(LoopNodeData.Metadata.TestAtt());
    }

    @objid ("ccb753dd-efc3-40b5-8e12-5dc414085b5a")
    @Override
    public void setTest(String value) {
        setAttVal(LoopNodeData.Metadata.TestAtt(), value);
    }

    @objid ("9af3d037-8d51-46f4-8ce7-1b4ffbfe29d9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("1a01b39d-2c3e-4bdd-acec-3172b9bb21dc")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("f8f10e7a-c8d3-4bc0-ac6c-a4af78a85899")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLoopNode(this);
        else
          return null;
    }

}
