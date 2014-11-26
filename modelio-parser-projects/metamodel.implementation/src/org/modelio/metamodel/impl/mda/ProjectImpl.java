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
package org.modelio.metamodel.impl.mda;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.mda.ProjectData;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("006633d4-c4bf-1fd8-97fe-001ec947cd2a")
public class ProjectImpl extends ModelElementImpl implements Project {
    @objid ("470e8c93-2764-46cf-a24d-affc3d7b4e5f")
    @Override
    public String getProjectContext() {
        return (String) getAttVal(ProjectData.Metadata.ProjectContextAtt());
    }

    @objid ("1f2ac22e-6d80-4fe2-98b0-59048fbe9fc3")
    @Override
    public void setProjectContext(String value) {
        setAttVal(ProjectData.Metadata.ProjectContextAtt(), value);
    }

    @objid ("af11c97d-b08f-47ae-ab51-512bff5dc02c")
    @Override
    public String getProjectDescr() {
        return (String) getAttVal(ProjectData.Metadata.ProjectDescrAtt());
    }

    @objid ("b6dca859-5592-4a59-b5d7-56e1c3ac35a0")
    @Override
    public void setProjectDescr(String value) {
        setAttVal(ProjectData.Metadata.ProjectDescrAtt(), value);
    }

    @objid ("cd34649e-3991-40f2-b865-96e24a84c8dc")
    @Override
    public DiagramSet getDiagramRoot() {
        return (DiagramSet) getDepVal(ProjectData.Metadata.DiagramRootDep());
    }

    @objid ("13fdf6a0-3fc8-4554-bc5b-8b624ba72569")
    @Override
    public void setDiagramRoot(DiagramSet value) {
        appendDepVal(ProjectData.Metadata.DiagramRootDep(), (SmObjectImpl)value);
    }

    @objid ("7e947f30-5ac5-47f0-9c59-1ef5a7f76e6a")
    @Override
    public Package getModel() {
        return (Package) getDepVal(ProjectData.Metadata.ModelDep());
    }

    @objid ("69835011-0910-43b1-a18e-7883f2832ecb")
    @Override
    public void setModel(Package value) {
        appendDepVal(ProjectData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("76617008-0b16-4012-a890-bd200dc7f40b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("88899d55-fa8c-457b-b0ab-17031aaf5522")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("0088701d-25f1-4808-be72-cb423e697cfb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitProject(this);
        else
          return null;
    }

}
