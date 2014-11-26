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
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00691798-ec87-1098-b22e-001ec947cd2a")
public class PropertyTableImpl extends ElementImpl implements PropertyTable {
    @objid ("45603d41-d582-4fc0-83ff-a25543c4c6f2")
    private int tableHash;

    @objid ("c8640425-848f-4d88-a567-c5c74b734412")
    private SoftReference<Properties> table;

    @objid ("71fabe31-282d-11e2-bf07-001ec947ccaf")
    @Override
    public String getProperty(String key) {
        Properties props = getSyncProperties();
        return props.getProperty(key);
    }

    @objid ("71fabe37-282d-11e2-bf07-001ec947ccaf")
    @Override
    public final Properties toProperties() throws IllegalStateException {
        Properties props = new Properties();
        props.putAll(getSyncProperties());
        return props;
    }

    @objid ("71fabe3c-282d-11e2-bf07-001ec947ccaf")
    @Override
    public final void setContent(Properties newContent) {
        StringWriter sw = new StringWriter();
        try {
            newContent.store(sw, null);
            final String s = sw.toString();
            setContent(s);
        
            // Update the cache
            this.table = new SoftReference<>(newContent);
            this.tableHash = s.hashCode();
        } catch (IOException e) {
            throw new Error(e); // cannot happen
        }
    }

    @objid ("71fabe40-282d-11e2-bf07-001ec947ccaf")
    @Override
    public void setProperty(String key, String value) {
        Properties props = getSyncProperties();
        
        props.setProperty(key, value);
        
        setContent(props);
    }

    /**
     * Update the cached Properties from the string content.
     * @return the new cached Properties.
     */
    @objid ("b5b0b9f3-8d2c-44a1-8173-3c97f0a44fe1")
    private Properties computeTable() {
        Properties props = new Properties();
        try {
            final String strContent = getContent();
            props.load(new StringReader(strContent));
            this.table = new SoftReference<>(props);
            this.tableHash = strContent.hashCode();
        } catch (IOException e) {
            throw new IllegalStateException("The 'Content' attribute has not the java.util.Properties format:"
                    + e.getLocalizedMessage(), e);
        }
        return props;
    }

    /**
     * Get the internal property table.
     * <p>
     * The internal property table reflects the string content at the moment it is computed.
     * @return the internal property table.
     */
    @objid ("0ab19bd3-e3e4-41f5-be52-5cee16a1623e")
    private Properties getSyncProperties() {
        final Properties syncTable = isTableSync();
        
        if (syncTable == null)
            return computeTable();
        else
            return syncTable;
    }

    /**
     * Return the cached properties if the Properties is up to date with the string content.
     * @return the cached property table or <code>null</code>.
     */
    @objid ("07ffcaec-5a48-4ecb-ba9d-767191ca6ac7")
    private Properties isTableSync() {
        if (this.table == null)
            return null;
        
        Properties props = this.table.get();
        if (props == null)
            return null;
        
        if (this.tableHash != getContent().hashCode())
            return null;
        return props;
    }

    @objid ("c99fcdee-a870-4ede-a92b-fd47f10a3317")
    @Override
    public String getName() {
        return (String) getAttVal(PropertyTableData.Metadata.nameAtt());
    }

    @objid ("93334949-6fe7-4078-acf3-648b1f340a3a")
    @Override
    public void setName(String value) {
        setAttVal(PropertyTableData.Metadata.nameAtt(), value);
    }

    @objid ("b2bf6048-f8c1-473f-b40d-51802be78ebb")
    @Override
    public String getContent() {
        return (String) getAttVal(PropertyTableData.Metadata.contentAtt());
    }

    @objid ("ea0745a2-03f5-4fd6-a33b-70d0fa46f7de")
    @Override
    public void setContent(String value) {
        setAttVal(PropertyTableData.Metadata.contentAtt(), value);
    }

    @objid ("721bb7a0-b7a1-46dd-9c0c-8894b68df610")
    @Override
    public ModelElement getOwner() {
        return (ModelElement) getDepVal(PropertyTableData.Metadata.OwnerDep());
    }

    @objid ("fe7ce0c1-90fc-492b-b6d8-96e1c764c02d")
    @Override
    public void setOwner(ModelElement value) {
        appendDepVal(PropertyTableData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("3a38ac79-3c31-454f-942e-79468dd5539f")
    @Override
    public MatrixValueDefinition getOwnerValDef() {
        return (MatrixValueDefinition) getDepVal(PropertyTableData.Metadata.OwnerValDefDep());
    }

    @objid ("e4c73d3f-02b5-4d81-b27b-911c1c00c17e")
    @Override
    public void setOwnerValDef(MatrixValueDefinition value) {
        appendDepVal(PropertyTableData.Metadata.OwnerValDefDep(), (SmObjectImpl)value);
    }

    @objid ("2717292e-7ae9-4a3a-baed-96e07d6d2fc9")
    @Override
    public QueryDefinition getOwnerQuery() {
        return (QueryDefinition) getDepVal(PropertyTableData.Metadata.OwnerQueryDep());
    }

    @objid ("1226eb50-a97a-414e-93b8-abc53774a6d0")
    @Override
    public void setOwnerQuery(QueryDefinition value) {
        appendDepVal(PropertyTableData.Metadata.OwnerQueryDep(), (SmObjectImpl)value);
    }

    @objid ("752272f1-52b6-4af9-8106-00c320c438cf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableData.Metadata.OwnerValDefDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableData.Metadata.OwnerQueryDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("267a1881-a751-4999-820a-ede01d532187")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(PropertyTableData.Metadata.OwnerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(PropertyTableData.Metadata.OwnerValDefDep());
        if (obj != null)
          return new SmDepVal(PropertyTableData.Metadata.OwnerValDefDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(PropertyTableData.Metadata.OwnerQueryDep());
        if (obj != null)
          return new SmDepVal(PropertyTableData.Metadata.OwnerQueryDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("4fe5ee33-bed7-4fc1-a1d2-884cc4e522d5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyTable(this);
        else
          return null;
    }

}
