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
                                    

package org.modelio.metamodel.experts.meta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.experts.meta.impl.BpmnLaneCreationExpert;
import org.modelio.metamodel.experts.meta.impl.DefaultMetaExpert;
import org.modelio.metamodel.experts.meta.impl.PartDecompositionCreationExpert;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.DefaultModelVisitor;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

/**
 * The implementation uses an internal extensible registry to delegate specific cases to the so-called proper 'expert'.
 */
@objid ("00926f6c-de01-1097-bcec-001ec947cd2a")
public class MetaTool implements IMetaTool {
    @objid ("00928326-de01-1097-bcec-001ec947cd2a")
    private final MetaExpertRegistry REGISTRY = new MetaExpertRegistry();

// typical usage: creation tools
    @objid ("0092974e-de01-1097-bcec-001ec947cd2a")
    @Override
    public boolean canCompose(MClass owner, MClass composed, String dep) {
        return this.REGISTRY.getExpert(owner).canCompose(owner, composed, dep);
    }

// typical usage: creation tools where stereotypes count
    @objid ("0092d830-de01-1097-bcec-001ec947cd2a")
    @Override
    public boolean canCompose(MObject owner, MClass composed, String dep) {
        for (IMetaExpert expert : this.REGISTRY.getExperts(owner)) {
            if (expert.canCompose(owner, composed, dep) == false) {
                return false;
            }
        }
        return true;
    }

// typical usage: drag and drop
    @objid ("00935c10-de01-1097-bcec-001ec947cd2a")
    @Override
    public boolean canCompose(MObject owner, MObject composed, String dep) {
        for (IMetaExpert expert : this.REGISTRY.getExperts(owner)) {
            if (expert.canCompose(owner, composed, dep) == false) {
                return false;
            }
        }
        return true;
    }

// typical usage: move objects, import
    @objid ("0094215e-de01-1097-bcec-001ec947cd2a")
    @Override
    public MDependency getDefaultCompositionDep(MObject owner, MObject composed) {
        CompositionDepVisitor v = new CompositionDepVisitor(composed);
        return (MDependency) owner.accept(v);
    }

// typical usage : property box for element editor ?
    @objid ("0094af34-de01-1097-bcec-001ec947cd2a")
    @Override
    public boolean canDep(MClass source, MClass target, String dep) {
        return this.REGISTRY.getExpert(source).canDep(source, target, dep);
    }

// typical usage : property box for element editor ?
    @objid ("0094f14c-de01-1097-bcec-001ec947cd2a")
    @Override
    public boolean canDep(MObject source, MClass target, String dep) {
        for (IMetaExpert expert : this.REGISTRY.getExperts(source)) {
            if (expert.canDep(source, target, dep) == false) {
                return false;
            }
        }
        return true;
    }

// typical usage : property box for element editor ?
    @objid ("00953418-de01-1097-bcec-001ec947cd2a")
    @Override
    public boolean canDep(MObject source, MObject target, String dep) {
        for (IMetaExpert expert : this.REGISTRY.getExperts(source)) {
            if (expert.canDep(source, target, dep) == false) {
                return false;
            }
        }
        return true;
    }

// typical usage: doc publisher template editor
    @objid ("00957ff4-de01-1097-bcec-001ec947cd2a")
    @Override
    public List<MDependency> getDeps(MObject source, MObject target) {
        List<MDependency> results = new ArrayList<>();
        
        SmClass classDest = ((SmObjectImpl) target).getClassOf();
        
        // Get all the 'non-component' dependencies supported by the metaclass of the 'from' object
        List<SmDependency> allDependency = ((SmObjectImpl) source).getClassOf().getAllReferenceDepDef();
        
        // Loop through the dependencies to find the first one whose supported target type matches the metaclass of the 'to' object.
        for (SmDependency dep : allDependency) {
            if (classDest.hasBase(dep.getTarget())) {
                results.add(dep);
            }
        }
        return results;
    }

    /**
     * Register a stereotyped element creation expert.
     * @param ste The stereotype
     * @param expert The creation expert.
     */
    @objid ("0095ce46-de01-1097-bcec-001ec947cd2a")
    @Override
    public void registerExpert(final Stereotype ste, final IMetaExpert expert) {
        this.REGISTRY.registerExpert(ste, expert);
    }

    /**
     * Remove the creation expert registered for the given stereotype.
     * @param ste The stereotype to forget.
     */
    @objid ("0096060e-de01-1097-bcec-001ec947cd2a")
    @Override
    public void unregisterExpert(final Stereotype ste) {
        this.REGISTRY.unregisterExpert(ste);
    }

    @objid ("ebc66784-3217-4862-97aa-ecc45983fe3b")
    @Override
    public MDependency getCompositionDepVisitorByMClass(MObject owner, MClass composed) {
        CompositionDepVisitorByMClass v = new CompositionDepVisitorByMClass(composed);
        return (MDependency) owner.accept(v);
    }

    /**
     * Registry to get the expert for a given:
     * <ul>
     * <li>parent element metaclass.</li>
     * <li>link metaclass.</li>
     * <li>stereotype.</li>
     * <li>mobject</li>
     * </ul>
     * Custom experts must implements IMetaExpert and be registered in the <tt>initialize()</tt> method.
     * <p>
     * Stereotype creation experts can be added with {@linkplain #registerExpert(Stereotype, IMetaExpert)} and removed with
     * {@linkplain #removeStereotypeExpert(Stereotype)}.
     */
    @objid ("00962f58-de01-1097-bcec-001ec947cd2a")
    static class MetaExpertRegistry {
        @objid ("0096cd8c-de01-1097-bcec-001ec947cd2a")
        private final Map<Stereotype, IMetaExpert> STEREOTYPE_EXPERTS = new HashMap<>();

        @objid ("00964bf0-de01-1097-bcec-001ec947cd2a")
        private final Map<MClass, IMetaExpert> EXPERTS = new HashMap<>();

        @objid ("004ed842-d07d-1098-bcec-001ec947cd2a")
        private final IMetaExpert DEFAULT_EXPERT = new DefaultMetaExpert();

        /**
         * Get the creation expert for the given element.
         * @param metaclass a metamodel class.
         * @return the matching creation expert (never returns <code>null</code>)
         */
        @objid ("0096f2c6-de01-1097-bcec-001ec947cd2a")
        public IMetaExpert getExpert(final MClass metaclass) {
            IMetaExpert ret = this.EXPERTS.get(metaclass);
            if (ret == null) {
                // No specific expert, return the default one
                ret = this.DEFAULT_EXPERT;
            }
            return ret;
        }

        /**
         * Get the creation expert for the given stereotype.
         * @param el a stereotype.
         * @return the matching creation expert or <code>null</code>
         */
        @objid ("00972f20-de01-1097-bcec-001ec947cd2a")
        public IMetaExpert getExpert(final Stereotype el) {
            return this.STEREOTYPE_EXPERTS.get(el);
        }

        @objid ("00976a12-de01-1097-bcec-001ec947cd2a")
        public List<IMetaExpert> getExperts(final MObject mObject) {
            List<IMetaExpert> results = new ArrayList<>();
            
            if (mObject instanceof Stereotype) {
                Stereotype ste = (Stereotype) mObject;
            
                // base expert
                MClass metaclass = Metamodel.getMClass(ste.getBaseClassName());
                results.add(getExpert(metaclass));
            
                final IMetaExpert steExpert = this.getExpert(ste);
                if (steExpert != null) {
                    results.add(steExpert);
                }
            } else {
                // base expert
                MClass metaclass = mObject.getMClass();
                results.add(getExpert(metaclass));
            
                // stereotype expert
                // TODO: view points might later filter this list
                if (mObject instanceof ModelElement) {
                    final ModelElement modelElement = (ModelElement) mObject;
                    for (Stereotype ste : modelElement.getExtension()) {
                        final IMetaExpert steExpert = this.getExpert(ste);
                        if (steExpert != null) {
                            results.add(steExpert);
                        }
                    }
                }
            }
            return results;
        }

        /**
         * Register a stereotyped element creation expert.
         * @param ste The stereotype
         * @param expert The creation expert.
         */
        @objid ("00979f32-de01-1097-bcec-001ec947cd2a")
        public void registerExpert(final Stereotype ste, final IMetaExpert expert) {
            this.STEREOTYPE_EXPERTS.put(ste, expert);
        }

        /**
         * Remove the creation expert registered for the given stereotype.
         * @param ste The stereotype to forget.
         */
        @objid ("0097d470-de01-1097-bcec-001ec947cd2a")
        public void unregisterExpert(final Stereotype ste) {
            this.STEREOTYPE_EXPERTS.remove(ste);
        }

        /**
         * This class has no instances.
         */
        @objid ("0097fbc6-de01-1097-bcec-001ec947cd2a")
        public MetaExpertRegistry() {
            // Init experts
            this.EXPERTS.put(Metamodel.getMClass(Lifeline.class), new PartDecompositionCreationExpert());
            this.EXPERTS.put(Metamodel.getMClass(BpmnLane.class), new BpmnLaneCreationExpert());
        }

    }

    @objid ("80e7d037-272c-11e2-a9d1-002564c97630")
    private static class CompositionDepVisitor extends DefaultModelVisitor {
        @objid ("80e7d039-272c-11e2-a9d1-002564c97630")
        private final MObject objDest;

        @objid ("80ea318e-272c-11e2-a9d1-002564c97630")
        public CompositionDepVisitor(MObject to) {
            this.objDest = to;
        }

        @objid ("80ea3197-272c-11e2-a9d1-002564c97630")
        @Override
        public Object visitClassifier(Classifier theElement) {
            if (this.objDest instanceof BindableInstance) {
                return theElement.getMClass().getDependency("InternalStructure");
            }
            // the rest of the cases seem correctly handled by the generic algorithm
            return visitElement(theElement);
        }

        @objid ("80ea31a3-272c-11e2-a9d1-002564c97630")
        @Override
        public Object visitOperation(Operation theElement) {
            if (this.objDest instanceof Parameter) {
                Parameter param = (Parameter) this.objDest;
                if (param.getReturned() != null) {
                    return theElement.getMClass().getDependency("Return");
                } else {
                    return theElement.getMClass().getDependency("IO");
                }
            }
            // the rest of the cases seem correctly handled by the generic algorithm
            return visitElement(theElement);
        }

        @objid ("80ea31a9-272c-11e2-a9d1-002564c97630")
        @Override
        public Object visitProject(Project theElement) {
            if (this.objDest instanceof Package) {
                return theElement.getMClass().getDependency("Model");
            } else if (this.objDest instanceof AnalystProject) {
                return theElement.getMClass().getDependency("RootRequirement");
            }
            // the rest of the cases seem correctly handled by the generic algorithm
            return visitElement(theElement);
        }

        @objid ("80ea31af-272c-11e2-a9d1-002564c97630")
        @Override
        public Object visitState(State theState) {
            if (this.objDest instanceof InternalTransition) {
                return theState.getMClass().getDependency("Internal");
            }
            // the rest of the cases seem correctly handled by the generic algorithm
            return visitElement(theState);
        }

        @objid ("80ea31b5-272c-11e2-a9d1-002564c97630")
        @Override
        public Object visitElement(Element theElement) {
            // The visitor did not find, try a more generic approach
            SmClass classDest = ((SmObjectImpl) this.objDest).getClassOf();
            
            // Get all the 'component' dependencies supported by the metaclass of the 'from' object
            List<SmDependency> allCompoDeps = ((SmObjectImpl) theElement).getClassOf().getAllComponentDepDef();
            
            // Loop through the dependencies to find the first one whose supported target type matches
            // the metaclass of the 'to' object.
            for (SmDependency compoDep : allCompoDeps) {
                if (classDest.hasBase(compoDep.getTarget())) {
                    // This dependency is a good candidate but it has to be checked against some exceptions
                    // whether or not there are potential exceptions is indicated by the presence of the "dependOnClass" directive
                    // on the SmDependency
            
                    // standard case, got it!
                    return compoDep;
                }
            }
            return null;
        }

    }

    @objid ("0cd2f20c-79d7-4cd3-9cd2-fee58f5dbd15")
    private static class CompositionDepVisitorByMClass extends DefaultModelVisitor {
        @objid ("50527964-f2e2-4bac-928d-8b5a8373bfc2")
        private final MClass objDest;

        @objid ("3322ecf6-163e-44cd-8518-3533ab04297c")
        public CompositionDepVisitorByMClass(MClass to) {
            this.objDest = to;
        }

        @objid ("8e63f448-2191-4a59-b706-868a86c3d223")
        @Override
        public Object visitClassifier(Classifier theElement) {
            if (this.objDest instanceof BindableInstance) {
                return theElement.getMClass().getDependency("InternalStructure");
            }
            // the rest of the cases seem correctly handled by the generic algorithm
            return visitElement(theElement);
        }

        @objid ("c86add56-6e23-4c3b-ab39-c1441b36e3c0")
        @Override
        public Object visitOperation(Operation theElement) {
            return theElement.getMClass().getDependency("IO");
        }

        @objid ("fcb88bea-68c2-4e4d-abc0-305028dbe4eb")
        @Override
        public Object visitProject(Project theElement) {
            if (this.objDest instanceof Package) {
                return theElement.getMClass().getDependency("Model");
            }
            // the rest of the cases seem correctly handled by the generic algorithm
            return visitElement(theElement);
        }

        @objid ("b6de1568-3fcb-4b52-9e81-ad9620897873")
        @Override
        public Object visitState(State theState) {
            if (this.objDest instanceof InternalTransition) {
                return theState.getMClass().getDependency("Internal");
            }
            // the rest of the cases seem correctly handled by the generic algorithm
            return visitElement(theState);
        }

        @objid ("5a2a2c63-6792-4675-b218-20d65a42ed48")
        @Override
        public Object visitElement(Element theElement) {
            // The visitor did not find, try a more generic approach
            //SmClass classDest = ((SmObjectImpl) this.objDest).getClassOf();
            
            // Get all the 'component' dependencies supported by the metaclass of the 'from' object
            List<SmDependency> allCompoDeps = ((SmObjectImpl) theElement).getClassOf().getAllComponentDepDef();
            
            // Loop through the dependencies to find the first one whose supported target type matches
            // the metaclass of the 'to' object.
            for (SmDependency compoDep : allCompoDeps) {
                if (this.objDest.equals(compoDep.getTarget())) {
                    // This dependency is a good candidate but it has to be checked against some exceptions
                    // whether or not there are potential exceptions is indicated by the presence of the "dependOnClass" directive
                    // on the SmDependency
            
                    // standard case, got it!
                    return compoDep;
                }
            }
            return null;
        }

    }

}
