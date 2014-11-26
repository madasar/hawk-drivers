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
package org.modelio.metamodel.impl.diagrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.diagrams.DiagramSetData;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("006e3d9a-c4bf-1fd8-97fe-001ec947cd2a")
public class DiagramSetImpl extends ModelElementImpl implements DiagramSet {
    @objid ("9aaf2db6-5dd6-42ac-a169-d7c6a53567c7")
    @Override
    public EList<DiagramSet> getSub() {
        return new SmList<>(this, DiagramSetData.Metadata.SubDep());
    }

    @objid ("9e85bb5f-a693-486e-9d87-0bf964df2c1a")
    @Override
    public <T extends DiagramSet> List<T> getSub(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final DiagramSet element : getSub()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("01296eb8-5647-416b-af6c-829e5608e197")
    @Override
    public DiagramSet getParent() {
        return (DiagramSet) getDepVal(DiagramSetData.Metadata.ParentDep());
    }

    @objid ("257c3eef-ff17-4651-b500-d580c5ee3001")
    @Override
    public void setParent(DiagramSet value) {
        appendDepVal(DiagramSetData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("a77bb093-542d-4416-9ed3-56ccdd30c964")
    @Override
    public EList<AbstractDiagram> getReferencedDiagram() {
        return new SmList<>(this, DiagramSetData.Metadata.ReferencedDiagramDep());
    }

    @objid ("ab545574-8d50-4c2f-9651-a304adaa52ee")
    @Override
    public <T extends AbstractDiagram> List<T> getReferencedDiagram(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AbstractDiagram element : getReferencedDiagram()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6197f125-5155-4ae0-881c-bee87fe1c15c")
    @Override
    public Project getOwner() {
        return (Project) getDepVal(DiagramSetData.Metadata.OwnerDep());
    }

    @objid ("48db7845-8595-4172-87d1-c83f90a36d12")
    @Override
    public void setOwner(Project value) {
        appendDepVal(DiagramSetData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("17126b41-6f12-4ab4-8006-d158bc943c32")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DiagramSetData.Metadata.ParentDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(DiagramSetData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("11784c6b-f8cb-4316-b46a-728554bd6718")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DiagramSetData.Metadata.ParentDep());
        if (obj != null)
          return new SmDepVal(DiagramSetData.Metadata.ParentDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(DiagramSetData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(DiagramSetData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("d223ebd7-8e8f-4446-9ee6-431104d5ad52")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDiagramSet(this);
        else
          return null;
    }

}
