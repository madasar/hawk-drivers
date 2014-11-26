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
import org.modelio.metamodel.data.uml.infrastructure.ExternDocumentData;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00927aac-c4be-1fd8-97fe-001ec947cd2a")
public class ExternDocumentImpl extends ModelElementImpl implements ExternDocument {
    @objid ("99824821-60ca-4d4a-97da-817752ad5c13")
    @Override
    public String getMimeType() {
        return (String) getAttVal(ExternDocumentData.Metadata.MimeTypeAtt());
    }

    @objid ("2e6047d4-b10f-4cb7-81d1-5adc1f16a63e")
    @Override
    public void setMimeType(String value) {
        setAttVal(ExternDocumentData.Metadata.MimeTypeAtt(), value);
    }

    @objid ("246ab12d-2a38-4c6c-bce1-4a8770ae2636")
    @Override
    public String getPath() {
        return (String) getAttVal(ExternDocumentData.Metadata.PathAtt());
    }

    @objid ("5ef9e8e1-5d38-4db5-a173-08affa3c136a")
    @Override
    public void setPath(String value) {
        setAttVal(ExternDocumentData.Metadata.PathAtt(), value);
    }

    @objid ("e2625547-7f90-496d-8b7c-806774cbf4e9")
    @Override
    public String getAbstract() {
        return (String) getAttVal(ExternDocumentData.Metadata.AbstractAtt());
    }

    @objid ("58bafa4f-a9c3-4130-a054-5c81700c7684")
    @Override
    public void setAbstract(String value) {
        setAttVal(ExternDocumentData.Metadata.AbstractAtt(), value);
    }

    @objid ("a4dbf4aa-1214-409d-9f72-cce72643a127")
    @Override
    public ExternDocumentType getType() {
        return (ExternDocumentType) getDepVal(ExternDocumentData.Metadata.TypeDep());
    }

    @objid ("dc075888-cb1e-4b52-acfa-8472f8d84754")
    @Override
    public void setType(ExternDocumentType value) {
        appendDepVal(ExternDocumentData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("da67159c-4682-443b-8d18-c4772e6b1cb7")
    @Override
    public ModelElement getSubject() {
        return (ModelElement) getDepVal(ExternDocumentData.Metadata.SubjectDep());
    }

    @objid ("6c206bf0-b2d1-480b-8375-eab67a17f588")
    @Override
    public void setSubject(ModelElement value) {
        appendDepVal(ExternDocumentData.Metadata.SubjectDep(), (SmObjectImpl)value);
    }

    @objid ("754498c0-fdd0-415d-8081-60df59df3bb0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentData.Metadata.SubjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("1544d76f-bb0b-459b-9d9a-b840a3a5e2cb")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentData.Metadata.SubjectDep());
        if (obj != null)
          return new SmDepVal(ExternDocumentData.Metadata.SubjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("706c7bc4-6287-426d-be96-0930e667b036")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExternDocument(this);
        else
          return null;
    }

}
