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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.NoteData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008a098a-c4be-1fd8-97fe-001ec947cd2a")
public class NoteImpl extends ModelElementImpl implements Note {
    @objid ("194d4e76-b694-44f8-ac87-8745c7d1a06b")
    @Override
    public String getContent() {
        return (String) getAttVal(NoteData.Metadata.ContentAtt());
    }

    @objid ("a03821ee-6297-4a08-a224-1050f7b7c246")
    @Override
    public void setContent(String value) {
        setAttVal(NoteData.Metadata.ContentAtt(), value);
    }

    @objid ("c8ef6643-288f-4f4c-ba6b-bfbbe0025f6a")
    @Override
    public NoteType getModel() {
        return (NoteType) getDepVal(NoteData.Metadata.ModelDep());
    }

    @objid ("b39dbbad-eba6-46b9-94f5-74be4bce4e3f")
    @Override
    public void setModel(NoteType value) {
        appendDepVal(NoteData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("aba61077-f00f-4262-babb-ba1747fe3a61")
    @Override
    public ModelElement getSubject() {
        return (ModelElement) getDepVal(NoteData.Metadata.SubjectDep());
    }

    @objid ("ee4eac90-e4df-429d-aa60-b62221bbb9c9")
    @Override
    public void setSubject(ModelElement value) {
        appendDepVal(NoteData.Metadata.SubjectDep(), (SmObjectImpl)value);
    }

    @objid ("8d575772-9b81-4fa5-9a6d-4a401864c1c3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NoteData.Metadata.SubjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("093d2ba0-f800-4aff-bbca-bf63970931fd")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NoteData.Metadata.SubjectDep());
        if (obj != null)
          return new SmDepVal(NoteData.Metadata.SubjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c8381568-48c4-4859-9660-f85011549aca")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNote(this);
        else
          return null;
    }

}
