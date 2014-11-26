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
import org.eclipse.emf.ecore.EReference;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;

/**
 * A SmDependency represents a type of relation between two SmClass instances.
 * 
 * <p>
 * There are several kind of SmDependency:
 * <ul>
 * <li>strong or weak</li>
 * <li>simple or multiple</li>
 * <li>dynamic or real</li>
 * </ul>
 * </p>
 * 
 * <p>
 * <b>simple</b> - when max card is 1
 * </p>
 * <p>
 * <b>multiple</b> - when card max is >1 or *
 * </p>
 * 
 * <p>
 * <b>weak</b> - the dependency is linking two objects whose life cycle are independent, ie deleting one of them does not delete the
 * other one.
 * </p>
 * 
 * 
 * <p>
 * <b>strong</b> - the dependency is linking two objects coupling their life cycles which are no longer independent, ie deleting one
 * of them does not delete the other one. In fact such a dependency defines a composition, where one side is the owner and the other
 * side is the owned object. Destroying a owner deletes the owned objects.
 * </p>
 * 
 * <p>
 * <b>dynamic</b> - the dependency is a weak dependency whose current value, when queried, is computed instead of being stored by
 * the objects it is linking. As the consequence, the append() and erase() method have no meaning for such a dependency (there is no
 * set to update). Dynamic dependencies can be costly to navigate because of the computed returned value.
 * </p>
 * 
 * 
 * <p>
 * <b>real</b> - the dependency is implemented on the linked object, ie there is a concrete set holding its values. <u>Any
 * non-dynamic dependency, whether it is simple or multiple, strong or weak is a real dependency</u>.
 * </p>
 * 
 * THE STUFF I DO NOT UNDERSTAND (YET) <blockquote><i>
 * <p>
 * Dependance pursymetrique. Cette dependance est n'est pas implementee au niveau d'objet. Elle permet de connaitre les classes qui
 * peuvent avoir une dependance vers cette objet.
 * </p>
 */
@objid ("0084376c-ed97-1f1f-85a5-001ec947cd2a")
public abstract class SmDependency extends SmFeature implements MDependency {
    /**
     * Tells whether modifiying this dependency content should be considered
     * as modifying the source model object.
     */
    @objid ("1c50a995-01a4-4c2c-9eba-728c0bfcb0a5")
    private boolean modifyObject;

    /**
     * Tells whether this dependency is a way to get an object composition owner.
     * <p>
     * The opposite dependency is either a composition or a shared composition.
     */
    @objid ("b5b3c411-69ff-41ba-ac6d-92fa1743d9b1")
    private boolean compositionOpposite;

    @objid ("71e213a0-2984-49a3-802a-9be387f989e5")
    private boolean postInit;

    /**
     * The dependency owner
     */
    @objid ("00840bca-ed97-1f1f-85a5-001ec947cd2a")
    private SmClass owner;

    /**
     * The dependency target
     */
    @objid ("00840a4e-ed97-1f1f-85a5-001ec947cd2a")
    private SmClass target;

    /**
     * The dependency type checker. Must never be null.
     */
    @objid ("000bda92-df81-1fe9-93a7-001ec947cd2a")
    protected SmDependencyTypeChecker checker;

    /**
     * The EMF adapter dependency.
     */
    @objid ("d7fec45f-ef06-4c2a-a9b6-4f735cc72367")
    private EReference emfAdapter;

    @objid ("008426b4-ed97-1f1f-85a5-001ec947cd2a")
    protected SmDependency() {
        this.checker = new DefaultTypeChecker(this);
    }

    /**
     * Add/set value to the dependency. This method is specialized by subclasses.
     * @param obj the model object to modify
     * @param value the model object to add
     * @return <code>true</code> if the value was added, <code>false</code> if the value was already present.
     */
    @objid ("00830112-ed97-1f1f-85a5-001ec947cd2a")
    public abstract boolean add(final SmObjectImpl obj, final SmObjectImpl value);

    /**
     * Insert a value in the dependency. This method is specialized by subclasses.
     * @param obj The object to modify
     * @param value The value to add
     * @param index The index where the value must be inserted.
     */
    @objid ("008304aa-ed97-1f1f-85a5-001ec947cd2a")
    public abstract void insert(final SmObjectImpl obj, final SmObjectImpl value, final int index);

    /**
     * Remove value from the dependency. This method is specialized by subclasses.
     * @param obj the source model object
     * @param value the value to remove
     * @return true if the value was removed, <code>false</code> if the value was absent.
     */
    @objid ("0082fd66-ed97-1f1f-85a5-001ec947cd2a")
    public abstract boolean remove(final SmObjectImpl obj, final SmObjectImpl value);

    /**
     * This method returns <code>true</code> if a modification to the dependency must be considered as also modifying its owner.
     * @return <code>true</code> to tell the source model object is modified.
     */
    @objid ("00841f3e-ed97-1f1f-85a5-001ec947cd2a")
    public boolean doModifyObject() {
        if (!this.postInit)
            postInit();
        return this.modifyObject;
    }

    /**
     * @return the source of the SmDependency.
     */
    @objid ("00842010-ed97-1f1f-85a5-001ec947cd2a")
    public SmClass getOwner() {
        return this.owner;
    }

    /**
     * Get the SmDependency used to walk the meta association from the opposite side.
     * @return The opposite SmDependency.
     */
    @objid ("00830838-ed97-1f1f-85a5-001ec947cd2a")
    @Override
    public abstract SmDependency getSymetric();

    /**
     * @return the target of the dependency.
     */
    @objid ("00830a0e-ed97-1f1f-85a5-001ec947cd2a")
    public SmClass getType() {
        return this.target;
    }

    /**
     * Initialize the dependency.
     * @param name its name
     * @param owner the source metamodel class
     * @param sma the java annotation on the attribute declaration.
     */
    @objid ("008420ba-ed97-1f1f-85a5-001ec947cd2a")
    @SuppressWarnings("hiding")
    public void init(final String name, final SmClass owner, final SmaMetaAssociation sma) {
        setName(name);
        
        // Init semantic flags
        initSmFlags(sma);
        
        this.owner = owner;
        this.target = SmClass.getSmClassFor(sma.typeDataClass());
        
        setMin(sma.min());
        setMax(sma.max());
        if (sma.max() == -1) {
            this.smFlags.add(SmDirective.SMCDMULTIPLE);
        }
        
        // Compute flags from annotation attributes
        if (sma.component()) {
            this.smFlags.add(SmDirective.SMCDCOMPONENT);
        }
        
        if (sma.partof()) {
            this.smFlags.add(SmDirective.SMCDPARTOF);
        }
        
        if (sma.performanceRisk()) {
            this.smFlags.add(SmDirective.SMCDDYNAMIC);
        }
        
        if (sma.sharedComponent()) {
            this.smFlags.add(SmDirective.SMCDSHAREDCOMPONENT);
        }
        
        if (sma.istodelete()) {
            this.smFlags.add(SmDirective.SMCDTODELETE);
        }
        
        // Simulate a symmetric dependency
        // if (smFlags.contains(SmDirective.SYMETRIC)) {
        // SmDependency symDep = createSymetricDependency(this);
        // this.target.purDependency.add(symDep);
        // }
    }

    /**
     * Tells whether this dependency is a composition.
     * @return <code>true</code> if this dependency is a composition
     */
    @objid ("00842146-ed97-1f1f-85a5-001ec947cd2a")
    public boolean isComponent() {
        return this.smFlags.contains(SmDirective.SMCDCOMPONENT);
    }

    /**
     * Tells whether the storing repository should better avoid storing this dependency content.
     * <p>
     * Walking this dependency is inefficient in most implementation. The inverse relation should be used when possible. when
     * requested.
     * <p>
     * This flag is used when storing the dependency would use a lot of space and/or is often modified but is not often read. The
     * store is advised to use the content from the opposite side to compute its content.
     * @return true to advice the store to not write the content.
     */
    @objid ("008421e6-ed97-1f1f-85a5-001ec947cd2a")
    public boolean isDynamic() {
        return this.smFlags.contains(SmDirective.SMCDDYNAMIC);
    }

    /**
     * Tells whether the dependency from this side is the main navigable way to walk it.
     * <p>
     * If not the main navigable way is usually the {@link #getSymetric() opposite} dependency. The main side is the side used to
     * walk the dependency on copy/paste, export, diff/merge, and most storing formats...
     * @return <code>true</code> if the dependency is the main navigation way.
     */
    @objid ("00842362-ed97-1f1f-85a5-001ec947cd2a")
    public boolean isPartOf() {
        return this.smFlags.contains(SmDirective.SMCDPARTOF);
    }

    /**
     * Tells whether the dependency is a shared composition.
     * <p>
     * The shared composition means that the target elements may be owned by more than one element. There is also more chances to be
     * a cycle in the composition graph.
     * @return <code>true</code> if it is a shared composition.
     */
    @objid ("d63cb2ff-5989-11e1-be4a-001ec947ccaf")
    @Override
    public boolean isSharedComposition() {
        return this.smFlags.contains(SmDirective.SMCDSHAREDCOMPONENT);
    }

    /**
     * Tells whether the target elements must be deleted when deleting the source element.
     * <p>
     * Composition associations and shared compositions are all in this case.
     * @return <code>true</code> to delete targets with the source, else <code>false</code>.
     */
    @objid ("00842574-ed97-1f1f-85a5-001ec947cd2a")
    public boolean isToDelete() {
        return this.smFlags.contains(SmDirective.SMCDTODELETE) || isComponent() || isSharedComposition();
    }

    /**
     * @return true to avoid storing the dependency on the disk.
     */
    @objid ("0084261e-ed97-1f1f-85a5-001ec947cd2a")
    public boolean isTransient() {
        return this.smFlags.contains(SmDirective.SMCDTRANSIENT);
    }

    /**
     * Move a dependency value by an offset
     * @param refered the source object
     * @param ref the value to move
     * @param offset the offset
     */
    @objid ("00830cc0-ed97-1f1f-85a5-001ec947cd2a")
    @SuppressWarnings("static-method")
    public void moveRef(final SmObjectImpl refered, final SmObjectImpl ref, final int offset) {
        // TODO To be implemented
        throw new UnsupportedOperationException("To be implemented.");
    }

    @objid ("00786716-eb1b-1f22-8c06-001ec947cd2a")
    @Override
    public String toString() {
        return getName() + ": " + getType().getName() + " [" + getMin() + ".." + getMax() + "]";
    }

    /**
     * Generate and initialize a fake opposite dependency that does nothing.
     * <p>
     * Was used for dependencies that could be walked from only one side.
     * @param directDep a dependency
     * @return its opposite fake dependency
     * @deprecated Not used anymore, there are no more such dependencies.
     */
    @objid ("00842754-ed97-1f1f-85a5-001ec947cd2a")
    @Deprecated
    private static SmDependency createFakeSymetricDependency(final SmDependency directDep) {
        // SmDependency symDep = new
        // SmMultipleDependency.SmFakeDependency(directDep);
        //
        // symDep.setName(directDep.getName() + directDep.owner.getName() +
        // "Symetric");
        // symDep.owner = directDep.target;
        // symDep.target = directDep.owner;
        //
        // symDep.smFlags.add(SmDirective.SMCDDYNAMIC);
        // symDep.smFlags.add(SmDirective.SMCDPURSYM);
        //
        // symDep.setMin(0);
        // symDep.setMax(-1);
        
        // return symDep;
        return null;
    }

    /**
     * @return <code>true</code> if the dependency is ordered, else <code>false</code>.
     */
    @objid ("6b0d94ab-5c78-11e1-b6d1-001ec947ccaf")
    @SuppressWarnings("static-method")
    public boolean isOrdered() {
        return true;
        // TODO add non ordered associations if needed.
        // return this.smFlags.contains(SmDirective.SMCDORDERED);
    }

    /**
     * Get the EMF adapter for this dependency.
     * @return the EMF dependency.
     */
    @objid ("efae71ca-bea9-11e1-b576-001ec947ccaf")
    public EReference getEmfAdapter() {
        return this.emfAdapter;
    }

    /**
     * Initialize the EMF adapter for this dependency.
     * @param emfAdapter the EMF dependency.
     */
    @objid ("efae71cf-bea9-11e1-b576-001ec947ccaf")
    public void setEmfAdapter(EReference emfAdapter) {
        this.emfAdapter = emfAdapter;
    }

    /**
     * @param value the dependency content type checker.
     */
    @objid ("007905b8-e20e-1fe9-93a7-001ec947cd2a")
    public void setChecker(final SmDependencyTypeChecker value) {
        // Automatically generated method. Please delete this comment before
        // entering specific code.
        this.checker = value;
    }

    @objid ("0092c548-4c5e-1ffc-8433-001ec947cd2a")
    @Override
    public MClass getSource() {
        return this.owner;
    }

    @objid ("0092fa54-4c5e-1ffc-8433-001ec947cd2a")
    @Override
    public MClass getTarget() {
        return this.target;
    }

    @objid ("00932f9c-4c5e-1ffc-8433-001ec947cd2a")
    @Override
    public boolean isComposition() {
        return isComponent();
    }

    @objid ("00939aea-4c5e-1ffc-8433-001ec947cd2a")
    @Override
    public int getMinCardinality() {
        return getMin();
    }

    @objid ("0093d0c8-4c5e-1ffc-8433-001ec947cd2a")
    @Override
    public int getMaxCardinality() {
        return getMax();
    }

    /**
     * Get the dependency type checker.
     * @return the dependency checker.
     */
    @objid ("44ea0a02-2cda-11e2-81f1-001ec947ccaf")
    public SmDependencyTypeChecker getChecker() {
        return this.checker;
    }

    /**
     * Tells whether this dependency is a way to get an object composition owner.
     * <p>
     * The opposite dependency is either a composition or a shared composition.
     * @return <code>true</code> if the dependency is a composition opposite.
     */
    @objid ("c289b8ec-e325-4041-b8a9-1a0380cbe46e")
    public boolean isCompositionOpposite() {
        if (!this.postInit)
            postInit();
        return this.compositionOpposite;
    }

    /**
     * Post initialization.
     * <p>
     * To be called after all the metamodel is loaded.
     */
    @objid ("96031116-1cf5-4d74-9b31-a06bc6e57da8")
    private void postInit() {
        this.modifyObject = isPartOf() || isComponent();
        
        final SmDependency opposite = getSymetric();
        if (opposite!= null) {
            this.compositionOpposite = opposite.isComponent() | opposite.isSharedComposition(); 
            this.modifyObject |= this.compositionOpposite;
        }
        
        this.postInit = true;
    }

    @objid ("008c6946-e207-1fe9-93a7-001ec947cd2a")
    private static class DefaultTypeChecker implements SmDependencyTypeChecker {
        @objid ("008c7256-e207-1fe9-93a7-001ec947cd2a")
        private final SmDependency smDep;

        @objid ("008c7af8-e207-1fe9-93a7-001ec947cd2a")
        public DefaultTypeChecker(SmDependency smDep) {
            this.smDep = smDep;
        }

        @objid ("008c8d7c-e207-1fe9-93a7-001ec947cd2a")
        @Override
        public void assertType(SmObjectImpl obj, Object value) throws IllegalArgumentException {
            if (!checkType(obj, value)) {
                throw new IllegalArgumentException(value + " is not a " + this.smDep.getType().getName());
            }
        }

        /**
         * 'null' is treated as matching any type
         */
        @objid ("008cae4c-e207-1fe9-93a7-001ec947cd2a")
        @Override
        public boolean checkType(SmObjectImpl obj, Object value) {
            return value == null || this.smDep.getType().getJavaInterface().isAssignableFrom(value.getClass());
        }

        @objid ("008cdc78-e207-1fe9-93a7-001ec947cd2a")
        @Override
        public void register() {
            // nothing to do here
        }

    }

}
