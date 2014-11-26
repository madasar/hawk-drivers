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

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.ecore.EClass;
import org.modelio.vbasic.log.Log;
import org.modelio.vcore.smkernel.IPStatus;
import org.modelio.vcore.smkernel.IRStatus;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.mapi.MAttribute;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

/**
 * A <code>SmClass</code> describes a semantic type, ie a metamodel metaclass.
 * <p>
 * Objects managed by the kernel (ie SmObject) are typed by their SmClass associated instance. Therefore, all SmObject instances
 * sharing the same SmClass instance are said to belong to the metaclass defined by SmClass. There is a unique instance of SmClass
 * per meta-class.
 * <p>
 * SmClass instances are build at run-time from the Java class that defines their meta-class. The Java reflection API along with
 * Java annotations are used to find out what are the SmAttribute and SmDependency instances to declare on the SmClass instance.
 * <p>
 * Meta class annotations are defined in {@link SmaMetaClass}.
 * 
 * @author phv
 */
@objid ("008435a0-ed97-1f1f-85a5-001ec947cd2a")
public final class SmClass extends SmElement implements MClass {
    /**
     * Whether the represented metaclass is abstract or not.
     */
    @objid ("0083eb86-ed97-1f1f-85a5-001ec947cd2a")
    private boolean isAbstract;

    /**
     * Whether the represented metaclass is a 'cms node' or not.
     */
    @objid ("0083ec80-ed97-1f1f-85a5-001ec947cd2a")
    private boolean isCmsNode = false;

    /**
     * The integer-based identifier of the metaclass.
     */
    @objid ("0083ed70-ed97-1f1f-85a5-001ec947cd2a")
    private short metaclassId;

    /**
     * The parent SmClass of this SmClass. The inheritance relation between SmClass instances reproduces the inheritance relation
     * between metaclasses.
     */
    @objid ("008404ea-ed97-1f1f-85a5-001ec947cd2a")
    private SmClass parentClass;

    /**
     * The children SmClass of this SmClass.
     * <p>
     * The inheritance relation between SmClass instances reproduces the inheritance relation between metaclasses. To compute this
     * list of 'sub-classes' the inheritance tree is flattened so that all possible sub-classes, whatever the depth in the
     * inheritance tree, are listed.
     */
    @objid ("00840814-ed97-1f1f-85a5-001ec947cd2a")
    private final List<SmClass> subClasses = new ArrayList<>();

    /**
     * The SmAttribute instances representing the meta-attributes of the metaclass.
     */
    @objid ("00840026-ed97-1f1f-85a5-001ec947cd2a")
    private final List<SmAttribute> selfAttributes = new ArrayList<>();

    @objid ("006ca804-4412-1f74-8a7a-001ec947cd2a")
    private List<SmAttribute> allAttributes = null;

    @objid ("00840288-ed97-1f1f-85a5-001ec947cd2a")
    private final List<SmDependency> selfDependencies = new ArrayList<>();

    @objid ("00548684-45d1-1f74-8a7a-001ec947cd2a")
    private List<SmDependency> allDependencies = null;

    @objid ("0084017a-ed97-1f1f-85a5-001ec947cd2a")
    private final List<SmDependency> selfComponentDep = new ArrayList<>();

    /**
     * Self and inherited composition dependencies.
     */
    @objid ("005e8648-4939-1f74-8a7a-001ec947cd2a")
    private List<SmDependency> allComponentDep = null;

    /**
     * Self reference dependencies.
     */
    @objid ("00840710-ed97-1f1f-85a5-001ec947cd2a")
    private final List<SmDependency> selfReferenceDep = new ArrayList<>();

    /**
     * Self and inherited reference dependencies.
     */
    @objid ("005ec806-4939-1f74-8a7a-001ec947cd2a")
    private List<SmDependency> allReferenceDep = null;

    @objid ("005144b0-fd1a-1f27-a7da-001ec947cd2a")
    private ISmObjectFactory objectFactory;

    /**
     * Composition and shared composition dependencies.
     */
    @objid ("ef7c607b-bea9-11e1-b576-001ec947ccaf")
    private final List<SmDependency> selfComponentAndSharedDep = new ArrayList<>();

    /**
     * Self and inherited composition and shared composition dependencies.
     */
    @objid ("ef7c6080-bea9-11e1-b576-001ec947ccaf")
    private List<SmDependency> allComponentAndSharedDep = null;

    /**
     * The interface implemented by all objects of this metaclass.
     */
    @objid ("ef7ec2d6-bea9-11e1-b576-001ec947ccaf")
    private Class<? extends MObject> javaInterface;

    /**
     * Shared composition dependencies.
     */
    @objid ("f2e7fb0e-bfa2-11e1-b511-001ec947ccaf")
    private final List<SmDependency> selfSharedDep = new ArrayList<>();

    /**
     * Self and inherited shared composition dependencies.
     */
    @objid ("f2e7fb12-bfa2-11e1-b511-001ec947ccaf")
    private List<SmDependency> allSharedDep = null;

    /**
     * The matching EMF class.
     */
    @objid ("c7147cf5-389a-4fc2-9c78-495cc088b1db")
    private EClass emfAdapter;

    /**
     * Get a SmClass from its ID.
     * @param classid the class id.
     * @return the found class
     */
    @objid ("00571246-fd1a-1f27-a7da-001ec947cd2a")
    public static SmClass getClass(final short classid) {
        return SmMetamodel.getClass(classid);
    }

    /**
     * Get the SmClass instance of a meta class given its name.
     * <p>
     * This method DOES NOT create the SmClass instance if it does not already exist.
     * @param name the name of the metaclass whose SmClass is to be returned
     * @return a unique SmClass instance for the meta class named <code>name</code>, null if not found.
     */
    @objid ("0083f306-ed97-1f1f-85a5-001ec947cd2a")
    public static SmClass getClass(final String name) {
        return SmMetamodel.getClass(name);
    }

    /**
     * Get the SmClass instance of a meta class given its interface.
     * <p>
     * This method DOES NOT create the SmClass instance if it does not already exist.
     * @param metaclass the interface implemented by elements of this metaclass.
     * @return a unique SmClass instance for the meta class named <code>name</code>, <code>null</code> if not found.
     * @throws java.lang.IllegalArgumentException if the class is not an interface.
     */
    @objid ("f71d6457-cb3e-11e1-87f1-001ec947ccaf")
    public static SmClass getClass(final Class<? extends MObject> metaclass) throws IllegalArgumentException {
        if (!metaclass.isInterface()) {
            throw new IllegalArgumentException(metaclass + " is not an interface.");
        }
        
        // look for already registered metaclass or create and register a new
        // one
        return SmMetamodel.getClass(metaclass);
    }

    /**
     * Get the list of all the currently registered SmClass instances.
     * @return the list of the currently registered SmClass instances.
     */
    @objid ("0083f554-ed97-1f1f-85a5-001ec947cd2a")
    public static List<SmClass> getRegisteredClasses() {
        return SmClass.SmMetamodel.getRegisteredClasses();
    }

    /**
     * Get the SmClass instance representing a given meta class.
     * <p>
     * The meta class must be passed as an {@link SmaMetaClass annotated} Java class defining the meta class structure. This method
     * creates the SmClass instance if it does not already exist.
     * @param dataClass the java class defining the meta class data.
     * @return a unique SmClass instance for the meta class, <code>null</code> if the passed java class does not actually define a
     * meta class (bad, missing or inconsistent java annotations)
     */
    @objid ("0083f70c-ed97-1f1f-85a5-001ec947cd2a")
    public static SmClass getSmClassFor(final Class<? extends ISmObjectData> dataClass) {
        SmaMetaClass mca = dataClass.getAnnotation(SmaMetaClass.class);
        if (mca == null) {
            return null;
        }
        
        // look for already registered metaclass or create and register a new
        // one
        SmClass smClass = SmMetamodel.getClass(mca.mmClass().getSimpleName());
        if (smClass == null) {
            smClass = SmClass.create(dataClass);
        }
        return smClass;
    }

    /**
     * Instantiate a new SmClass for the given metamodel interface.
     * <p>
     * The interface must be an {@link SmaMetaClass annotated} Java class defining the meta class structure.
     * @param metaclass a metamodel interface.
     * @return the created SmClass.
     * @throws java.lang.IllegalArgumentException if the interface does not have the {@link SmaMetaClass} annotation.
     */
    @objid ("0083fbda-ed97-1f1f-85a5-001ec947cd2a")
    private static SmClass create(final Class<? extends ISmObjectData> metaclass) throws IllegalArgumentException {
        if (Log.ENABLED) {
            Log.trace("SmClass - create SmClass for '%s'", metaclass.getName());
        }
        
        SmaMetaClass sma = metaclass.getAnnotation(SmaMetaClass.class);
        if (sma == null) {
            throw new IllegalArgumentException(metaclass+" is non semantic java class");
        }
        
        // New instance
        SmClass cls = new SmClass();
        cls.setName(sma.mmClass().getSimpleName());
        cls.javaInterface = sma.mmClass();
        
        // Register the metaclass and give it its 'metaclassId' value
        cls.metaclassId = SmMetamodel.registerClass(cls, cls.getName());
        
        // Set flags
        cls.initSmFlags(sma);
        
        cls.isAbstract = Modifier.isAbstract(metaclass.getModifiers());
        cls.isCmsNode = sma.cmsnode();
        
        try {
            cls.setFactory(sma.factory().newInstance());
        } catch (InstantiationException e) {
            throw new Error(e);
        } catch (IllegalAccessException e) {
            throw new Error(e);
        }
        
        @SuppressWarnings("unchecked")
        SmClass parentClass = SmClass.getSmClassFor((Class<? extends ISmObjectData>) metaclass.getSuperclass());
        cls.parentClass = parentClass;
        if (parentClass != null) {
            parentClass.subClasses.add(cls);
        }
        
        // Declared Attributes and assocs
        for (Field field : metaclass.getDeclaredFields()) {
            SmaMetaAttribute smaAtt = field.getAnnotation(SmaMetaAttribute.class);
            if (smaAtt != null) {
                try {
                    SmAttribute smAtt = smaAtt.smAttributeClass().newInstance();
                    smAtt.init(smaAtt.metaName(), cls, smaAtt);
                    cls.selfAttributes.add(smAtt);
                } catch (InstantiationException e) {
                    throw new Error(e);
                } catch (IllegalAccessException e) {
                    throw new Error(e);
                }
            }
        
            SmaMetaAssociation smaAssoc = field.getAnnotation(SmaMetaAssociation.class);
            if (smaAssoc != null) {
                try {
                    SmDependency smAssoc = smaAssoc.smAssociationClass().newInstance();
                    smAssoc.init(smaAssoc.metaName(), cls, smaAssoc);
        
                    cls.selfDependencies.add(smAssoc);
        
                    if (smAssoc.isComponent()) {
                        cls.selfComponentDep.add(smAssoc);
                        cls.selfComponentAndSharedDep.add(smAssoc);
                    } else if (smAssoc.isSharedComposition()) {
                        cls.selfComponentAndSharedDep.add(smAssoc);
                        cls.selfSharedDep.add(smAssoc);
                    } else if (smAssoc.isPartOf()) {
                        cls.selfReferenceDep.add(smAssoc);
                    }
        
                } catch (InstantiationException e) {
                    throw new Error(e);
                } catch (IllegalAccessException e) {
                    throw new Error(e);
                }
        
            }
        }
        
        // Log class definition
        if (Log.ENABLED) {
            Log.trace("SMCLASS LOADED DEFINITION (from java class '%s')", metaclass.getName());
            Log.trace("  name='%s', id=%d", cls.getName(), cls.metaclassId);
            Log.trace("  parent='%s'", (cls.parentClass != null) ? cls.parentClass.getName() : "none");
            Log.trace("  FEATURES:");
            for (SmAttribute smAtt : cls.getSelfAttDef()) {
                Log.trace("      . %s", smAtt.toString());
            }
            for (SmDependency smDep : cls.getSelfDepDef()) {
                Log.trace("    --> %s", smDep.toString());
            }
            Log.trace("---");
        }
        return cls;
    }

    /**
     * Private constructor
     */
    @objid ("0083fb12-ed97-1f1f-85a5-001ec947cd2a")
    private SmClass() {
    }

    @objid ("86233e2f-7d84-11e1-bee3-001ec947ccaf")
    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof SmClass)) {
            return false;
        }
        return ((SmClass) obj).getName().equals(getName());
    }

    /**
     * Get self and inherited attribute definitions.
     * <p>
     * @return attribute definitions.
     */
    @objid ("0083ee2e-ed97-1f1f-85a5-001ec947cd2a")
    public List<SmAttribute> getAllAttDef() {
        return this.allAttributes;
    }

    /**
     * Get self and inherited composition and shared composition dependencies.
     * <p>
     * @return composition and shared composition dependencies.
     */
    @objid ("ef85e9e0-bea9-11e1-b576-001ec947ccaf")
    public List<SmDependency> getAllComponentAndSharedDepDef() {
        return this.allComponentAndSharedDep;
    }

    /**
     * Get self and inherited composition dependencies.
     * <p>
     * Excludes shared compositions.
     * @return composition dependencies.
     */
    @objid ("0083eec4-ed97-1f1f-85a5-001ec947cd2a")
    public List<SmDependency> getAllComponentDepDef() {
        return this.allComponentDep;
    }

    /**
     * Get all defined dependencies.
     * @return all dependencies.
     */
    @objid ("0083ef82-ed97-1f1f-85a5-001ec947cd2a")
    public List<SmDependency> getAllDepDef() {
        return this.allDependencies;
    }

    /**
     * Get self and inherited reference dependencies.
     * <p>
     * Excludes compositions, shared compositions, and "non navigable" dependencies..
     * @return composition dependencies.
     */
    @objid ("0083f0b8-ed97-1f1f-85a5-001ec947cd2a")
    public List<SmDependency> getAllReferenceDepDef() {
        return this.allReferenceDep;
    }

    /**
     * Get self and inherited shared composition dependencies.
     * @return self and inherited shared composition dependencies.
     */
    @objid ("f2e7fb1e-bfa2-11e1-b511-001ec947ccaf")
    public Collection<SmDependency> getAllSharedCompositionDep() {
        return this.allSharedDep;
    }

    /**
     * Get all the sub classes recursively.
     * @return all the sub classes.
     */
    @objid ("0083f1e4-ed97-1f1f-85a5-001ec947cd2a")
    public List<SmClass> getAllSubClasses() {
        List<SmClass> results = new ArrayList<>();
        
        // Add direct sub classes
        results.addAll(this.subClasses);
        
        for (SmClass c : this.subClasses) {
            results.addAll(c.getAllSubClasses());
        }
        return results;
    }

    /**
     * Get the attribute definition with the given name.
     * <p>
     * Look into the class attributes and inherited attributes.
     * @param att_name the attribute name
     * @return the found attribute or <code>null</code> if none has the given name.
     */
    @objid ("0083f27a-ed97-1f1f-85a5-001ec947cd2a")
    public SmAttribute getAttributeDef(final String att_name) {
        // TODO optimization of the name lookup ?!
        for (SmAttribute att : this.allAttributes) {
            if (att.getName().equals(att_name)) {
                return att;
            }
        }
        return null;
    }

    /**
     * Get the dependency definition with the given name.
     * <p>
     * Look into the class dependency and inherited dependency.
     * @param dep_name the dependency name
     * @return the found dependency or <code>null</code> if none has the given name.
     */
    @objid ("0083f3a6-ed97-1f1f-85a5-001ec947cd2a")
    public SmDependency getDependencyDef(final String dep_name) {
        for (SmDependency dep : this.allDependencies) {
            if (dep.getName().equals(dep_name)) {
                return dep;
            }
        }
        return null;
    }

    /**
     * Get the EMF adapter for this class.
     * @return the EMF class.
     */
    @objid ("ef9437fd-bea9-11e1-b576-001ec947ccaf")
    public EClass getEmfAdapter() {
        return this.emfAdapter;
    }

    /**
     * Get the metaclass id.
     * <p>
     * This identifier must not be used in long term storage as may change at each metamodel change.
     * @return the metaclass id.
     */
    @objid ("0056e398-fd1a-1f27-a7da-001ec947cd2a")
    public final short getId() {
        return this.metaclassId;
    }

    /**
     * Get the interface implemented by all objects of this metaclass.
     * @return The java interface.
     */
    @objid ("ef9437f6-bea9-11e1-b576-001ec947ccaf")
    public Class<? extends MObject> getJavaInterface() {
        return this.javaInterface;
    }

    /**
     * Get the factory to use to instantiate model objects of this class.
     * @return the model object factory.
     */
    @objid ("0054a61e-fd1a-1f27-a7da-001ec947cd2a")
    public ISmObjectFactory getObjectFactory() {
        return this.objectFactory;
    }

    /**
     * Get the parent class.
     * @return the parent class.
     */
    @objid ("00840936-ed97-1f1f-85a5-001ec947cd2a")
    public SmClass getParent() {
        return this.parentClass;
    }

    /**
     * Get the attributes defined on this class excluding inherited attributes.
     * @return the class attribute definitions.
     */
    @objid ("0083f5f4-ed97-1f1f-85a5-001ec947cd2a")
    public List<SmAttribute> getSelfAttDef() {
        return this.selfAttributes;
    }

    /**
     * Get the metamodel dependencies defined on this class.
     * @return the metamodel dependencies.
     */
    @objid ("0083f680-ed97-1f1f-85a5-001ec947cd2a")
    public List<SmDependency> getSelfDepDef() {
        return this.selfDependencies;
    }

    /**
     * Check that <code>this</code> metaclass is a sub-metaclass of <code>parent</code> metaclass.
     * @param parent a metamodel class
     * @return <code>true</code> if <code>this</code> class inherits from the given class. <code>false</code> otherwise.
     */
    @objid ("0083f7ac-ed97-1f1f-85a5-001ec947cd2a")
    @Override
    public boolean hasBase(MClass parent) {
        SmClass cls = this;
        while (cls != parent && cls != null) {
                    cls = cls.parentClass;
        }
        return (cls == parent);
    }

    /**
     * Tells whether this class or an inherited class has the given {@link SmDirective}.
     * @param flag a flag to test
     * @return <code>true</code> if the class has the flag, else <code>false</code>
     */
    @objid ("0083f8ce-ed97-1f1f-85a5-001ec947cd2a")
    public boolean hasDirectiveInGraph(final SmDirective flag) {
        SmClass c = this;
        while (c != null && !c.hasDirective(flag)) {
            c = c.getParent();
        }
        return c != null;
    }

    @objid ("86233e2a-7d84-11e1-bee3-001ec947ccaf")
    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @objid ("0083f9f0-ed97-1f1f-85a5-001ec947cd2a")
    @Override
    public boolean isAbstract() {
        return this.isAbstract;
    }

    @objid ("0083fa7c-ed97-1f1f-85a5-001ec947cd2a")
    @Override
    public boolean isCmsNode() {
        return this.isCmsNode;
    }

    @objid ("00034a76-4c5f-1ffc-8433-001ec947cd2a")
    @Override
    public MAttribute getAttribute(final String name) {
        return getAttributeDef(name);
    }

    @objid ("000420e0-4c5f-1ffc-8433-001ec947cd2a")
    @Override
    public List<MAttribute> getAttributes(boolean includeInherited) {
        ArrayList<MAttribute> results = new ArrayList<>();
        
        if (includeInherited) {
            for (MAttribute dep : getAllAttDef()) {
                results.add(dep);
            }
        } else {
        
            for (MAttribute dep : getSelfAttDef()) {
                results.add(dep);
            }
        }
        return results;
    }

    @objid ("0004a236-4c5f-1ffc-8433-001ec947cd2a")
    @Override
    public List<MClass> getSub(boolean recursive) {
        ArrayList<MClass> results = new ArrayList<>();
        if (recursive) {
            for (MClass c : getAllSubClasses()) {
                results.add(c);
            }
        } else {
            for (MClass c : this.subClasses) {
                results.add(c);
            }
        }
        return results;
    }

    @objid ("0003d806-4c5f-1ffc-8433-001ec947cd2a")
    @Override
    public List<MDependency> getDependencies(boolean includeInherited) {
        ArrayList<MDependency> results = new ArrayList<>();
        
        if (includeInherited) {
            for (MDependency dep : getAllDepDef()) {
                results.add(dep);
            }
        } else {
        
            for (MDependency dep : getSelfDepDef()) {
                results.add(dep);
            }
        }
        return results;
    }

    @objid ("000391d4-4c5f-1ffc-8433-001ec947cd2a")
    @Override
    public MDependency getDependency(final String name) {
        return getDependencyDef(name);
    }

    @objid ("00046a1e-4c5f-1ffc-8433-001ec947cd2a")
    @Override
    public MClass getSuper() {
        return this.parentClass;
    }

    /**
     * Finish the class initialization.
     */
    @objid ("00715c6e-4412-1f74-8a7a-001ec947cd2a")
    public void postInit() {
        // flatten attributes and dependencies
        this.allAttributes = new ArrayList<>(this.selfAttributes);
        this.allDependencies = new ArrayList<>(this.selfDependencies);
        this.allComponentDep = new ArrayList<>(this.selfComponentDep);
        this.allReferenceDep = new ArrayList<>(this.selfReferenceDep);
        this.allSharedDep = new ArrayList<>(this.selfSharedDep);
        this.allComponentAndSharedDep = new ArrayList<>(this.selfComponentAndSharedDep);
        
        SmClass parent = getParent();
        
        while (parent != null) {
            this.allAttributes.addAll(parent.selfAttributes);
        
            this.allDependencies.addAll(parent.selfDependencies);
            this.allComponentDep.addAll(parent.selfComponentDep);
            this.allSharedDep.addAll(parent.selfSharedDep);
            this.allReferenceDep.addAll(parent.selfReferenceDep);
            this.allComponentAndSharedDep.addAll(parent.selfComponentAndSharedDep);
        
            parent = parent.getParent();
        }
    }

    /**
     * Initialize the EMF EClass adapter.
     * @param emfAdapter the EMS EClass adapter
     */
    @objid ("ef943802-bea9-11e1-b576-001ec947ccaf")
    public void setEmfAdapter(EClass emfAdapter) {
        this.emfAdapter = emfAdapter;
    }

    @objid ("00031448-eb1c-1f22-8c06-001ec947cd2a")
    @Override
    public String toString() {
        return getName() + " SmClass";
    }

    @objid ("0056c9b2-fd1a-1f27-a7da-001ec947cd2a")
    private void setFactory(final ISmObjectFactory objectFactory) {
        this.objectFactory = objectFactory;
    }

    /**
     * Registry of SmClasses.
     */
    @objid ("00841110-ed97-1f1f-85a5-001ec947cd2a")
    private static class SmMetamodel {
        /**
         * All registered metaclass as a table to provide a direct indexed access. This is the reference list of all known
         * metaclasses. Do not use this data field directly.
         */
        @objid ("00840d82-ed97-1f1f-85a5-001ec947cd2a")
        private static final ArrayList<SmClass> _registeredClasses = new ArrayList<>();

        /**
         * A cache of registered metaclass to provide a fast acccess by name. This cache can only be maintained in synch with the
         * registered classes table above as long as it is not directly manipulated. Only use the provided accessors.
         */
        @objid ("00840f12-ed97-1f1f-85a5-001ec947cd2a")
        private static final HashMap<String, SmClass> _cache = new HashMap<>();

        /**
         * A cache of registered metaclass to provide a fast acccess by name. This cache can only be maintained in synch with the
         * registered classes table above as long as it is not directly manipulated. Only use the provided accessors.
         */
        @objid ("f7222903-cb3e-11e1-87f1-001ec947ccaf")
        private static final HashMap<Class<? extends MObject>, SmClass> _interfaceCache = new HashMap<>();

        @objid ("00837188-ed97-1f1f-85a5-001ec947cd2a")
        public static List<SmClass> getRegisteredClasses() {
            return Collections.unmodifiableList(_registeredClasses);
        }

        @objid ("00837232-ed97-1f1f-85a5-001ec947cd2a")
        public static SmClass getClass(final String name) {
            return _cache.get(name);
        }

        /**
         * Register a SmClass.
         * @param smClass the SmClass to register
         * @param name the metamodel name of the metaclass (from {@link SmaMetaClass} mmType())
         * @return the class id
         */
        @objid ("008372d2-ed97-1f1f-85a5-001ec947cd2a")
        public static short registerClass(final SmClass smClass, final String name) {
            int id = _registeredClasses.size();
            
            _registeredClasses.add(smClass);
            _cache.put(name, smClass);
            _interfaceCache.put(smClass.getJavaInterface(), smClass);
            return (short) id;
        }

        @objid ("0056a28e-fd1a-1f27-a7da-001ec947cd2a")
        public static SmClass getClass(final short classid) {
            return _registeredClasses.get(classid);
        }

        @objid ("f7248b56-cb3e-11e1-87f1-001ec947ccaf")
        public static SmClass getClass(Class<? extends MObject> metaclass) {
            return _interfaceCache.get(metaclass);
        }

    }

}
