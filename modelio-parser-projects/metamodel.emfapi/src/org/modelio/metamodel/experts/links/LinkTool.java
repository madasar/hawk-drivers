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
                                    

package org.modelio.metamodel.experts.links;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.experts.links.impl.creation.AntonymCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.AssignedCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.BindingCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.BpmnDataAssociationCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.BpmnMessageFlowCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.BpmnSequenceFlowCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.ClassAssociationCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.ContextCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.DefaultLinkExpert;
import org.modelio.metamodel.experts.links.impl.creation.DeriveCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.GuaranteeCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.HomonymCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.ImplementCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.KindOfCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.MeasureCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.NegativeInfluenceCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.PartCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.PositiveInfluenceCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.RefersCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.RefineCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.RelatedCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.SatisfyCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.SynonymCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.TemplateBindingCreationExpert;
import org.modelio.metamodel.experts.links.impl.creation.VerifyCreationExpert;
import org.modelio.metamodel.experts.links.impl.ends.ChangeDestinationVisitor;
import org.modelio.metamodel.experts.links.impl.ends.ChangeSourceVisitor;
import org.modelio.metamodel.experts.links.impl.ends.GetSourceVisitor;
import org.modelio.metamodel.experts.links.impl.ends.GetTargetVisitor;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Link experts and manipulation tools.
 */
@objid ("0000fac8-de02-1097-bcec-001ec947cd2a")
public class LinkTool implements ILinkTool {
    @objid ("005875aa-d07d-1098-bcec-001ec947cd2a")
    private final LinkExpertRegistry REGISTRY = new LinkExpertRegistry();

    @objid ("a95b9e47-9a0e-4a85-bb41-03c5d9a7f9d8")
    private final GetTargetVisitor getTargetVisitor = new GetTargetVisitor();

    @objid ("5aea8470-8d61-45a9-a0ef-27b6173f57aa")
    private final GetSourceVisitor getSourceVisitor = new GetSourceVisitor();

    @objid ("5a4f6064-ee7a-48e3-99a3-9611a409d7f7")
    private final ChangeDestinationVisitor changeDestVisitor = new ChangeDestinationVisitor();

    @objid ("45da8282-da2a-492f-8003-e3f7ff60ab58")
    private final ChangeSourceVisitor changeSourceVisitor = new ChangeSourceVisitor();

    @objid ("000103ce-de02-1097-bcec-001ec947cd2a")
    @Override
    public boolean canLink(MClass link, MClass from, MClass to) {
        return this.REGISTRY.getExpert(link).canLink(link, from, to);
    }

    @objid ("0001bee0-de02-1097-bcec-001ec947cd2a")
    @Override
    public boolean canLink(MClass link, MObject from, MObject to) {
        ILinkExpert expert = this.REGISTRY.getExpert(link);
        if (expert.canLink(link, from, to) == false) {
            return false;
        }
        return true;
    }

    @objid ("0001f356-de02-1097-bcec-001ec947cd2a")
    @Override
    public boolean canSource(MClass link, MClass from) {
        return this.REGISTRY.getExpert(link).canSource(link, from);
    }

    @objid ("000227ae-de02-1097-bcec-001ec947cd2a")
    @Override
    public boolean canSource(Stereotype stereotype, MClass link, MClass from) {
        ILinkExpert stereotypeExpert = this.REGISTRY.getExpert(stereotype);
        ILinkExpert linkExpert = this.REGISTRY.getExpert(link);
        return (stereotypeExpert == null || stereotypeExpert.canSource(link, from)) && linkExpert.canSource(link, from);
    }

    @objid ("00025698-de02-1097-bcec-001ec947cd2a")
    @Override
    public boolean canTarget(Stereotype stereotype, MClass link, MClass from) {
        ILinkExpert stereotypeExpert = this.REGISTRY.getExpert(stereotype);
        ILinkExpert linkExpert = this.REGISTRY.getExpert(link);
        return (stereotypeExpert == null || stereotypeExpert.canTarget(link, from)) && linkExpert.canTarget(link, from);
    }

    @objid ("000287bc-de02-1097-bcec-001ec947cd2a")
    @Override
    public boolean canTarget(MClass link, MClass to) {
        return this.REGISTRY.getExpert(link).canTarget(link, to);
    }

    @objid ("0002b732-de02-1097-bcec-001ec947cd2a")
    @Override
    public boolean isLink(MClass metaclass) {
        switch (metaclass.getName()) {
        case "Abstraction":
        case "ActivityEdge":
        case "AssociationEnd":
        case "Binding":
        case "BpmnDataAssociation":
        case "BpmnMessageFlow":
        case "BpmnSequenceFlow":
        case "ComponentRealization":
        case "CommunicationChannel":
        case "ConnectorEnd":
        case "ControlFlow":
        case "DataFlow":
        case "Dependency":
        case "ElementImport":
        case "ElementRealization":
        case "ExceptionHandler":
        case "Generalization":
        case "InformationFlow":
        case "InterfaceRealization":
        case "LinkEnd":
        case "Manifestation":
        case "Message":
        case "NamespaceUse":
        case "PackageImport":
        case "PackageMerge":
        case "RaisedException":
        case "Substitution":
        case "TemplateBinding":
        case "Transition":
        case "UseCaseDependency":
            return true;
        default:
            return false;
        }
    }

    /**
     * Register a stereotyped element creation expert.
     * @param ste The stereotype
     * @param expert The creation expert.
     */
    @objid ("0a547943-a681-489b-a318-0d9f71225c98")
    @Override
    public void registerExpert(final Stereotype ste, final ILinkExpert expert) {
        this.REGISTRY.registerExpert(ste, expert);
    }

    /**
     * Remove the creation expert registered for the given stereotype.
     * @param ste The stereotype to forget.
     */
    @objid ("cfae5a3f-dd86-490c-b46e-da9c31f11f99")
    @Override
    public void unregisterExpert(final Stereotype ste) {
        this.REGISTRY.unregisterExpert(ste);
    }

    @objid ("889323b1-0bd4-43da-adec-249a2846de30")
    @Override
    public boolean canLink(Stereotype stereotypedLink, MClass link, MObject from, MObject to) {
        final List<ILinkExpert> experts = stereotypedLink != null ? this.REGISTRY.getExperts(stereotypedLink) : Arrays
                .asList(this.REGISTRY.getExpert(link));
        for (ILinkExpert expert : experts) {
            if (!expert.canLink(link, from, to)) {
                return false;
            }
        }
        return true;
    }

    @objid ("fc3c8cde-ad5c-4f5e-98ad-83240629655c")
    @Override
    public boolean canSource(MObject link, MObject from) {
        for (ILinkExpert expert : this.REGISTRY.getExperts(link)) {
            if (expert.canSource(link, from) == false) {
                return false;
            }
        }
        return true;
    }

    @objid ("be7fadb4-281c-4720-a752-3f0421411165")
    @Override
    public boolean canTarget(MObject link, MObject to) {
        for (ILinkExpert expert : this.REGISTRY.getExperts(link)) {
            if (expert.canTarget(link, to) == false) {
                return false;
            }
        }
        return true;
    }

    @objid ("11bfc22f-1502-4ace-bbca-7b9d4c57764d")
    @Override
    public MObject getSource(MObject aLink) {
        return (MObject) aLink.accept(this.getSourceVisitor);
    }

    @objid ("fe54925f-39b3-4c74-a153-39dee2720cc1")
    @Override
    public MObject getTarget(MObject aLink) {
        return (MObject) aLink.accept(this.getTargetVisitor);
    }

    @objid ("42355f12-6c43-4fb0-98ac-308d83f2c9a9")
    @Override
    public void setSource(MObject link, final MObject oldSource, MObject newSource) throws IllegalArgumentException {
        this.changeSourceVisitor.oldSource = oldSource;
        this.changeSourceVisitor.newSource = newSource;
        try {
            link.accept(this.changeSourceVisitor);
        } catch (final ClassCastException e) {
            throw new IllegalArgumentException(newSource + " is not a legal source for " + link, e);
        }
    }

    @objid ("4a959dc3-cf59-48aa-ba80-344a28195da2")
    @Override
    public void setTarget(MObject link, final MObject oldTarget, MObject newTarget) throws IllegalArgumentException {
        this.changeDestVisitor.oldDest = oldTarget;
        this.changeDestVisitor.newDest = newTarget;
        try {
            link.accept(this.changeDestVisitor);
        } catch (final ClassCastException e) {
            throw new IllegalArgumentException(newTarget + " is not a legal target for " + link, e);
        }
    }

    /**
     * Registry to get the expert for a given:
     * <ul>
     * <li>parent element metaclass.</li>
     * <li>link metaclass.</li>
     * <li>stereotype.</li>
     * <li>mobject</li>
     * </ul>
     * Custom experts must implements ILinkExpert and be registered in the <tt>initialize()</tt> method.
     * <p>
     * Stereotype creation experts can be added with {@linkplain #registerExpert(Stereotype, ILinkExpert)} and removed with
     * {@linkplain #unregisterExpert(Stereotype)}.
     */
    @objid ("0002d58c-de02-1097-bcec-001ec947cd2a")
    public class LinkExpertRegistry {
        @objid ("000311fa-de02-1097-bcec-001ec947cd2a")
        private final Map<String, ILinkExpert> STEREOTYPE_EXPERTS = new HashMap<>();

        @objid ("0002e7e8-de02-1097-bcec-001ec947cd2a")
        private final Map<MClass, ILinkExpert> EXPERTS = new HashMap<>();

        @objid ("0059ee76-d07d-1098-bcec-001ec947cd2a")
        private final ILinkExpert DEFAULT_EXPERT = new DefaultLinkExpert();

        /**
         * Get the creation expert for the given element.
         * @param metaclass a metamodel class.
         * @return the matching creation expert (never returns <code>null</code>)
         */
        @objid ("00033572-de02-1097-bcec-001ec947cd2a")
        public ILinkExpert getExpert(final MClass metaclass) {
            ILinkExpert ret = this.EXPERTS.get(metaclass);
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
        @objid ("00036ea2-de02-1097-bcec-001ec947cd2a")
        public ILinkExpert getExpert(final Stereotype el) {
            if (el != null) {
                String key = el.getBaseClassName() + "." + el.getName();
                return this.STEREOTYPE_EXPERTS.get(key);
            } else {
                return null;
            }
        }

        /**
         * @param mObject a model link
         * @return all experts relative the the element
         */
        @objid ("0003a20a-de02-1097-bcec-001ec947cd2a")
        public List<ILinkExpert> getExperts(final MObject mObject) {
            List<ILinkExpert> results = new ArrayList<>();
            
            if (mObject instanceof Stereotype) {
                Stereotype ste = (Stereotype) mObject;
            
                // base expert
                MClass metaclass = Metamodel.getMClass(ste.getBaseClassName());
                results.add(getExpert(metaclass));
            
                final ILinkExpert steExpert = this.getExpert(ste);
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
                        final ILinkExpert steExpert = this.getExpert(ste);
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
        @objid ("0003d798-de02-1097-bcec-001ec947cd2a")
        public void registerExpert(final Stereotype ste, final ILinkExpert expert) {
            this.STEREOTYPE_EXPERTS.put(ste.getBaseClassName() + "." + ste.getName(), expert);
        }

        /**
         * Remove the creation expert registered for the given stereotype.
         * @param ste The stereotype to forget.
         */
        @objid ("00040d80-de02-1097-bcec-001ec947cd2a")
        public void unregisterExpert(final Stereotype ste) {
            this.STEREOTYPE_EXPERTS.remove(ste);
        }

        /**
         * This class has no instances.
         */
        @objid ("00043486-de02-1097-bcec-001ec947cd2a")
        public LinkExpertRegistry() {
            // Init experts
            this.EXPERTS.put(Metamodel.getMClass(Binding.class), new BindingCreationExpert());
            this.EXPERTS.put(Metamodel.getMClass(BpmnDataAssociation.class), new BpmnDataAssociationCreationExpert());
            this.EXPERTS.put(Metamodel.getMClass(BpmnMessageFlow.class), new BpmnMessageFlowCreationExpert());
            this.EXPERTS.put(Metamodel.getMClass(BpmnSequenceFlow.class), new BpmnSequenceFlowCreationExpert());
            this.EXPERTS.put(Metamodel.getMClass(TemplateBinding.class), new TemplateBindingCreationExpert());
            this.EXPERTS.put(Metamodel.getMClass(ClassAssociation.class), new ClassAssociationCreationExpert());
            
            MClass dependency = Metamodel.getMClass(Dependency.class);
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "+influence", new PositiveInfluenceCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "-influence", new NegativeInfluenceCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "antonym", new AntonymCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "assigned", new AssignedCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "context", new ContextCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "derive", new DeriveCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "guarantee", new GuaranteeCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "homonym", new HomonymCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "implement", new ImplementCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "kind-of", new KindOfCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "measure", new MeasureCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "part", new PartCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "refers", new RefersCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "refine", new RefineCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "related", new RelatedCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "satisfy", new SatisfyCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "synonym", new SynonymCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "verify", new VerifyCreationExpert());
        }

    }

}
