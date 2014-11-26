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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystItem;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.data.analyst.AnalystItemData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("901bf652-8771-4ad2-9eff-9f03ee6e7461")
public abstract class AnalystItemImpl extends ModelElementImpl implements AnalystItem {
    @objid ("855e29d0-4502-4181-8f2a-6037f2e970dc")
    @Override
    public String getDefinition() {
        return (String) getAttVal(AnalystItemData.Metadata.DefinitionAtt());
    }

    @objid ("7ccab82a-e973-453d-893b-a92f4fa6a963")
    @Override
    public void setDefinition(String value) {
        setAttVal(AnalystItemData.Metadata.DefinitionAtt(), value);
    }

    @objid ("27c276e8-2d27-4ad0-a4aa-175d62ee3375")
    @Override
    public AnalystPropertyTable getAnalystProperties() {
        return (AnalystPropertyTable) getDepVal(AnalystItemData.Metadata.AnalystPropertiesDep());
    }

    @objid ("908ee91d-d942-447e-8bc8-54e7256876c4")
    @Override
    public void setAnalystProperties(AnalystPropertyTable value) {
        appendDepVal(AnalystItemData.Metadata.AnalystPropertiesDep(), (SmObjectImpl)value);
    }

    @objid ("7bada9d4-f793-4d6e-ba6d-2821d90e8e7e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("93fedc5c-50d8-4bd0-94ac-5a68dc66faf2")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("4b9b05a0-0579-465e-ab35-a625f961b65a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAnalystItem(this);
        else
          return null;
    }

}
