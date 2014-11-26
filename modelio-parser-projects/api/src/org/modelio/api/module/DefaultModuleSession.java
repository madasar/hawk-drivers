/*
 * Copyright 2013 Modeliosoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */  
                                    

package org.modelio.api.module;

import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.diagram.IDiagramService;
import org.modelio.api.diagram.tools.IAttachedBoxCommand;
import org.modelio.api.diagram.tools.IBoxCommand;
import org.modelio.api.diagram.tools.IDiagramCommand;
import org.modelio.api.diagram.tools.ILinkCommand;
import org.modelio.api.diagram.tools.IMultiLinkCommand;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.module.contrib.WizardContribution;
import org.modelio.api.module.diagrams.DiagramCustomizationDescriptor;
import org.modelio.api.module.diagrams.DiagramToolDescriptor;
import org.modelio.metamodel.Metamodel;
import org.modelio.vbasic.version.Version;

/**
 * Default implementation of the {@link IModuleSession} interface.
 * <p>
 * <p>
 * This default implementation may be inherited by the module developers in order to simplify the code writing of the mdac session.
 */
@objid ("01f40414-0000-3257-0000-000000000000")
public class DefaultModuleSession implements IModuleSession {
    /**
     * Module of the session.
     */
    @objid ("01f40414-0000-3cb0-0000-000000000000")
    protected final IModule module;

    /**
     * Creates a new session connected to a module.
     * @param module The module to connect.
     */
    @objid ("01f40414-0000-325e-0000-000000000000")
    public DefaultModuleSession(IModule module) {
        this.module = module;
    }

    /**
     * Accepts the installation by default.
     * @param modelioPath the path of modelio application
     * @param installPath the path where the module archive contents have been expanded.
     * @return true if the module accepts to be installed false otherwise.
     * @throws org.modelio.api.module.ModuleException when the installation failed.
     */
    @objid ("01f40414-0000-3262-0000-000000000000")
    public static boolean install(String modelioPath, String installPath) throws ModuleException {
        return true;
    }

    /**
     * Accepts the selection by default.
     * 
     * throws com.modeliosoft.modelio.core.mdacs.ModuleException
     */
    @objid ("01f40414-0000-326b-0000-000000000000")
    @Override
    public boolean select() throws ModuleException {
        return true;
    }

    /**
     * Accepts the start by default.
     * 
     * throws com.modeliosoft.modelio.core.mdacs.ModuleException
     */
    @objid ("01f40414-0000-3270-0000-000000000000")
    @Override
    public boolean start() throws ModuleException {
        addDiagramTools();
        addDiagramCustomizers();
        addDiagramWizardContributions();
        
        // TODO
        /*
         * Display.getDefault().syncExec(new Runnable() {
         * 
         * @Override public void run() { final IWorkbenchWindow workbenchWindow =
         * PlatformUI.getWorkbench().getActiveWorkbenchWindow(); if (workbenchWindow != null) {
         * DefaultModuleSession.this.perspectiveListener = new PerspectiveAdapter() {
         * 
         * @Override public void perspectiveActivated(IWorkbenchPage page, IPerspectiveDescriptor perspectiveDescriptor) {
         * super.perspectiveActivated(page, perspectiveDescriptor); showModulePropertyViews(); }
         * 
         * @Override public void perspectivePreDeactivate(IWorkbenchPage page, IPerspectiveDescriptor perspective) {
         * super.perspectivePreDeactivate(page, perspective); hideModulePropertyViews(); } };
         * workbenchWindow.addPerspectiveListener(DefaultModuleSession.this.perspectiveListener); } } });
         */
        return true;
    }

    /**
     * Nothing is done by default when the module is stopping.
     * 
     * throws com.modeliosoft.modelio.core.mdacs.ModuleException
     */
    @objid ("01f40414-0000-3275-0000-000000000000")
    @Override
    public void stop() throws ModuleException {
        removeDiagramCustomizers();
        removeDiagramTools();
        removeDiagramWizardContributions();
        
        /*
         * TODO Display.getDefault().syncExec(new ContextualPopupActionsRemover(this.mdac, this.handlerActivationTable));
         * 
         * Display.getDefault().syncExec(new Runnable() {
         * 
         * @Override public void run() { final IWorkbenchWindow workbenchWindow =
         * PlatformUI.getWorkbench().getActiveWorkbenchWindow(); if (workbenchWindow != null) {
         * workbenchWindow.removePerspectiveListener(DefaultModuleSession.this.perspectiveListener); } } });
         */
    }

    /**
     * Nothing is done by default when the module is unselecting.
     * 
     * throws com.modeliosoft.modelio.core.mdacs.ModuleException
     */
    @objid ("01f40414-0000-3278-0000-000000000000")
    @Override
    public void unselect() throws ModuleException {
        // Nothing to do.
    }

    /**
     * The old parameter list is copied and pasted on the new module installation.
     * <p>
     * All the parameter keys that exist in the new version are automatically updated from the old parameters.
     */
    @objid ("01f40414-0000-327b-0000-000000000000")
    @Override
    public void upgrade(Version oldVersion, Map<String, String> oldParameters) throws ModuleException {
        this.module.getConfiguration().updateFrom(oldParameters);
    }

    @objid ("0bb7e155-8ae1-4d86-99c1-d19dd2414f37")
    private void addDiagramCustomizers() {
        if (this.module.getDiagramCustomizations().size() > 0) {
            Display.getDefault().syncExec(new DiagramCustomizerAdder(this.module));
        }
    }

    @objid ("12395d6a-01fb-4b02-bfc4-cd60cdf493e9")
    private void removeDiagramCustomizers() {
        if (this.module.getDiagramCustomizations().size() > 0) {
            Display.getDefault().syncExec(new DiagramCustomizerRemover(this.module));
        }
    }

    @objid ("1c81e84d-36e5-469b-9bda-975b7b7ce2b5")
    private void addDiagramTools() {
        if (this.module.getDiagramTools().size() > 0) {
            Display.getDefault().syncExec(new DiagramToolsAdder(this.module));
        }
    }

    @objid ("177559a0-54d4-48e5-9e57-dc0e79a1e136")
    private void removeDiagramTools() {
        if (this.module.getDiagramTools().size() > 0) {
            Display.getDefault().syncExec(new DiagramToolsRemover(this.module));
        }
    }

    @objid ("cccb61ac-5aed-44c9-ae54-957b2eb4ae53")
    private void addDiagramWizardContributions() {
        if (this.module.getDiagramWizardContributions().size() > 0) {
            Display.getDefault().syncExec(new DiagramWizardContributionAdder(this.module));
        }
    }

    @objid ("67885298-810a-42b6-ac89-b9b7289cc42c")
    private void removeDiagramWizardContributions() {
        if (this.module.getDiagramWizardContributions().size() > 0) {
            Display.getDefault().syncExec(new DiagramWizardContributionRemover(this.module));
        }
    }

    @objid ("d58428e4-85c9-4f9b-b35f-d52c0f098280")
    private static class DiagramCustomizerAdder implements Runnable {
        @objid ("be550c98-8d06-4110-a64e-2bdd8790ebc2")
        private final IModule javaMdac;

        @objid ("ccd162f5-a720-41b2-a260-101782305bbd")
        public DiagramCustomizerAdder(final IModule javaMdac) {
            this.javaMdac = javaMdac;
        }

        @objid ("9e93bfc7-784e-45dd-a0e0-05a3ed77ce85")
        @Override
        public void run() {
            final IDiagramService diagramService = Modelio.getInstance().getDiagramService();
            final List<DiagramCustomizationDescriptor> diagramCustomizations = this.javaMdac.getDiagramCustomizations();
            for (DiagramCustomizationDescriptor descriptor : diagramCustomizations) {
                diagramService.registerDiagramCustomization(descriptor.getStereotype(),Metamodel.getMClass(descriptor.getBaseDiagramClass()),
                        descriptor.getCustomizer());
            }
        }

    }

    @objid ("acc95f66-dbf4-435c-9080-be79feb190d0")
    private static class DiagramCustomizerRemover implements Runnable {
        @objid ("96c281c2-fa2d-4e4f-97f2-e3a00f489165")
        private final IModule javaMdac;

        @objid ("fed81089-d181-4687-92cb-858e744a01b8")
        public DiagramCustomizerRemover(final IModule javaMdac) {
            this.javaMdac = javaMdac;
        }

        @objid ("94699e3a-2405-4eb1-99af-1eb7aede66e7")
        @Override
        public void run() {
            final IDiagramService diagramService = Modelio.getInstance().getDiagramService();
            final List<DiagramCustomizationDescriptor> diagramCustomizations = this.javaMdac.getDiagramCustomizations();
            for (DiagramCustomizationDescriptor descriptor : diagramCustomizations) {
                diagramService.unregisterDiagramCustomization(descriptor.getStereotype(),Metamodel.getMClass(descriptor.getBaseDiagramClass()),descriptor.getCustomizer());
            }
        }

    }

    @objid ("50706ca5-6045-4323-8fb9-df10be4a1d3e")
    private static class DiagramToolsAdder implements Runnable {
        @objid ("4ca296cc-0d1b-42bc-82d0-248c850146a0")
        private final IModule javaMdac;

        @objid ("971ebb0a-1ace-4b6e-83ce-8decf803c676")
        public DiagramToolsAdder(final IModule javaMdac) {
            this.javaMdac = javaMdac;
        }

        @objid ("eb95c3e1-141f-440e-99f0-beb70b3eba01")
        @Override
        public void run() {
            final IDiagramService diagramService = Modelio.getInstance().getDiagramService();
            final List<DiagramToolDescriptor> diagramTools = this.javaMdac.getDiagramTools();
            for (DiagramToolDescriptor toolDescriptor : diagramTools) {
                final IDiagramCommand handler = toolDescriptor.getHandler();
                if (handler instanceof IAttachedBoxCommand) {
            
                    diagramService.registerCustomizedTool(toolDescriptor.getId(),
                            Metamodel.getMClass(toolDescriptor.getMetaclass()), toolDescriptor.getStereotype(),
                            toolDescriptor.getDep(), (IAttachedBoxCommand) handler);
                } else if (handler instanceof IBoxCommand) {
                    diagramService.registerCustomizedTool(toolDescriptor.getId(),
                            Metamodel.getMClass(toolDescriptor.getMetaclass()), toolDescriptor.getStereotype(),
                            toolDescriptor.getDep(), (IBoxCommand) handler);
                } else if (handler instanceof ILinkCommand) {
                    diagramService.registerCustomizedTool(toolDescriptor.getId(),
                            Metamodel.getMClass(toolDescriptor.getMetaclass()), toolDescriptor.getStereotype(),
                            toolDescriptor.getDep(), (ILinkCommand) handler);
                } else if (handler instanceof IMultiLinkCommand) {
                    diagramService.registerCustomizedTool(toolDescriptor.getId(),
                            Metamodel.getMClass(toolDescriptor.getMetaclass()), toolDescriptor.getStereotype(),
                            toolDescriptor.getDep(), (IMultiLinkCommand) handler);
                }
            }
        }

    }

    @objid ("b9b3fd83-be09-4562-b27a-d1c8c35c2768")
    private static class DiagramToolsRemover implements Runnable {
        @objid ("a8bd8cff-9070-49d8-803f-e418c8311d65")
        private final IModule javaMdac;

        @objid ("770d331b-5350-4d91-a8bf-45a3fa659ad9")
        public DiagramToolsRemover(final IModule javaMdac) {
            this.javaMdac = javaMdac;
        }

        @objid ("34a00ca6-d701-4020-95ca-2f806cf52873")
        @Override
        public void run() {
            final IDiagramService diagramService = Modelio.getInstance().getDiagramService();
            final List<DiagramToolDescriptor> diagramTools = this.javaMdac.getDiagramTools();
            for (DiagramToolDescriptor toolDescriptor : diagramTools) {
                diagramService.unregisterCustomizedTool(toolDescriptor.getId());
            }
        }

    }

    @objid ("c06988da-9697-41b5-9c2f-fbf9f4fecd7c")
    private static class DiagramWizardContributionAdder implements Runnable {
        @objid ("8251c396-cda0-41df-b90f-352728100138")
        private final IModule javaMdac;

        @objid ("4234c0fc-8118-41e3-a2b1-a8d69e8f8103")
        public DiagramWizardContributionAdder(final IModule javaMdac) {
            this.javaMdac = javaMdac;
        }

        @objid ("b69e69da-4ac5-488c-93f1-206d2d20d56f")
        @Override
        public void run() {
            final IDiagramService diagramService = Modelio.getInstance().getDiagramService();
            final List<WizardContribution> diagramWizardContributions = this.javaMdac.getDiagramWizardContributions();
            for (WizardContribution contribution : diagramWizardContributions) {
                diagramService.registerDiagramContributor(contribution.getCategory(), contribution.getContributor());
            }
        }

    }

    @objid ("fac6b5a2-4b13-4326-8686-e5fc4a775be8")
    private static class DiagramWizardContributionRemover implements Runnable {
        @objid ("a668e635-4226-42f3-b4ef-3f0069a5b227")
        private final IModule javaMdac;

        @objid ("545985e6-abd0-4e6f-a0dd-1672f70b56dc")
        public DiagramWizardContributionRemover(final IModule javaMdac) {
            this.javaMdac = javaMdac;
        }

        @objid ("1d7d7ece-823b-4699-92bb-96c0170d6156")
        @Override
        public void run() {
            final IDiagramService diagramService = Modelio.getInstance().getDiagramService();
            final List<WizardContribution> diagramWizardContributions = this.javaMdac.getDiagramWizardContributions();
            for (WizardContribution contribution : diagramWizardContributions) {
                diagramService.unregisterDiagramContributor(contribution.getCategory(), contribution.getContributor());
            }
        }

    }

}
