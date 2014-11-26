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
                                    

package org.modelio.vcore.smkernel.meta;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.ecore.EAttribute;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;

/**
 * Cette classe permet d'acc?der ? un attribut d'un objet.\CR\ Elle v?rifie la coherence du type.\CR\ Elle peut tracer ses
 * appels.\CR\ Elle provoque une erreur.\CR\ si le type est erron?.\CR\ si l'attribut est inaccessible.\CR\
 * 
 * \CHAP>\ G?n?ration de d?finition d'un attribut en C++. La d?finition d'un attribut d'un ?l?ment s?mantique se traduit par la
 * cr?ation d'une instance de la classe \BSmAttributB\ en C++.\CR\
 * 
 * \CHAP>\Exemple de G?n?ration de la d?finition de l'attribut \B<Attribute>B\ de la classe \B<Class>B\ du type \B<Type>B\.
 * 
 * SmAttribute* <Class><Attribute>()\CR\ {\CR\ static SmAttribute* member=NULL;
 * 
 * if(member == NULL) { member = new SmAttribute();
 * 
 * //==== Definition de l'attribut ================== member->init("<Attribute>",<Class>Class(),<Type>Class()); member->GetRoutine =
 * get_<Class><Attribute>; member->SetRoutine = set_<Class><Attribute>; member->CardRoutine = card_<Class><Attribute>;
 * 
 * member->Min = 0; member->Max = 1;
 * 
 * //==== Definition des directives s'il y en a ===== .... SmDirective *dir_<directive> = new SmDirective;
 * dir_<directive>->init("<directive>"); ... Ajouter les parametres de directives .. member->append(dir_<directive>); } return
 * member;\CR\ }
 */
@objid ("008436ae-ed97-1f1f-85a5-001ec947cd2a")
public abstract class SmAttribute extends SmFeature implements MAttribute {
    @objid ("3d4dbd47-2f3f-11e2-8359-001ec947ccaf")
    private boolean isNameAtt;

    /**
     * The SmClass instance owning the attribute
     */
    @objid ("00841ad4-ed97-1f1f-85a5-001ec947cd2a")
    private SmClass owner;

    @objid ("778c4987-9b64-11e1-94a3-001ec947ccaf")
    private Class<?> type;

    /**
     * The EMF attribute.
     */
    @objid ("704d8856-3e62-4179-8ee1-9e1afefd59d2")
    private EAttribute emfAdapter;

    @objid ("00841a34-ed97-1f1f-85a5-001ec947cd2a")
    protected SmAttribute() {
    }

    @objid ("0053762c-df7d-1fe9-93a7-001ec947cd2a")
    @Override
    public void assertValueType(final SmObjectImpl smObjectImpl, final Object value) {
        if (!this.type.isInstance(value)) {
            throw new IllegalArgumentException(value + " is not a " + this.type.getSimpleName());
        }
    }

    /**
     * Get the EMF adapter for this attribute.
     * @return The EMF {@link EAttribute}.
     */
    @objid ("ef779bcd-bea9-11e1-b576-001ec947ccaf")
    public EAttribute getEmfAdapter() {
        return this.emfAdapter;
    }

    /**
     * @return the class owner.
     */
    @objid ("00841840-ed97-1f1f-85a5-001ec947cd2a")
    public SmClass getOwner() {
        // Automatically generated method. Please delete this comment before
        // entering specific code.
        return this.owner;
    }

    @objid ("0091dc14-eb1b-1f22-8c06-001ec947cd2a")
    @Override
    public Class<?> getType() {
        return this.type;
    }

    /**
     * Get the attribute value on the given model object.
     * @param object the model object
     * @return the attribute value
     */
    @objid ("008bac2c-0a97-1f20-85a5-001ec947cd2a")
    public abstract Object getValue(final ISmObjectData object);

    /**
     * Initialize the attribute.
     * @param name the attribute name
     * @param owner the owner
     * @param sma the attribute annotations.
     */
    @objid ("0084199e-ed97-1f1f-85a5-001ec947cd2a")
    @SuppressWarnings("hiding")
    public void init(final String name, final SmClass owner, final SmaMetaAttribute sma) {
        setName(name);
        initSmFlags(sma);
        // phv: semantic attribute cannot be multiple for now (Jan 2012)
        setMin(0);
        setMax(1);
        this.owner = owner;
        this.type = sma.type();
        this.isNameAtt = name.equalsIgnoreCase("name");
    }

    /**
     * Initialize the EMF attribute adapter.
     * @param emfAdapter the EMF attribute.
     */
    @objid ("ef779bd2-bea9-11e1-b576-001ec947ccaf")
    public void setEmfAdapter(EAttribute emfAdapter) {
        this.emfAdapter = emfAdapter;
    }

    /**
     * Set the attribute value on the given model object data.
     * @param object a model object data
     * @param value the new attribute value
     */
    @objid ("008bc450-0a97-1f20-85a5-001ec947cd2a")
    public abstract void setValue(final ISmObjectData object, final Object value);

    @objid ("00923542-eb1b-1f22-8c06-001ec947cd2a")
    @Override
    public String toString() {
        return getName() + ": " + getType().getSimpleName() + " [" + getMin() + ".." + getMax() + "]";
    }

    /**
     * Tells whether this attribute is a name attribute.
     * <p>
     * The name of the attribute is compared to "name" case insensitively.
     * @return <code>true</code> if the attribute is a name attribute.
     */
    @objid ("3d4dbd4e-2f3f-11e2-8359-001ec947ccaf")
    public boolean isNameAtt() {
        return this.isNameAtt;
    }

}
