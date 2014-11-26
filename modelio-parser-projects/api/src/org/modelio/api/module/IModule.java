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

import java.util.Collection;
import java.util.List;
import javax.script.ScriptEngine;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.graphics.Image;
import org.modelio.api.diagram.ContributorCategory;
import org.modelio.api.diagram.IDiagramCustomizer;
import org.modelio.api.diagram.tools.IAttachedBoxCommand;
import org.modelio.api.diagram.tools.IBoxCommand;
import org.modelio.api.diagram.tools.ILinkCommand;
import org.modelio.api.diagram.tools.IMultiLinkCommand;
import org.modelio.api.model.IModelingSession;
import org.modelio.api.module.commands.ActionLocation;
import org.modelio.api.module.commands.IModuleAction;
import org.modelio.api.module.contrib.WizardContribution;
import org.modelio.api.module.diagrams.DiagramCustomizationDescriptor;
import org.modelio.api.module.diagrams.DiagramToolDescriptor;
import org.modelio.api.module.propertiesPage.IModulePropertyPage;
import org.modelio.api.ui.diagramcreation.IDiagramWizardContributor;
import org.modelio.gproject.ramc.core.model.IModelComponent;
import org.modelio.gproject.ramc.core.packaging.IModelComponentContributor;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * All Modelio module classes must implement this interface.
 * <p>
 * <p>
 * <p>
 * <p>
 * In practice, the Modelio modules implement the {@link IModule} interface .
 * <p>
 * <p>
 * The {@link IModule} interface is implemented by the <i>MDA Designer</i> tool thanks to the {@code AbstractJavaModule}
 * class.<br>
 * The {@link IModule} can never be used by another module developer.<br>
 * Only the peer module ({@link IPeerModule}) can be accessed, as described below:
 * <p>
 * <p>
 * <code>
 * IPeerModule module = Modelio.getModelingSession().getPeerModule (MacroPeerModule.class);
 * </code>
 * <p>
 * <p>
 */
@objid ("01f40414-0000-32a9-0000-000000000000")
public interface IModule {
    /**
     * Get the configuration associated to this module.
     * 
     * Module configuration provide access to module parameter and resource paths
     * @see IModuleUserConfiguration
     * @return the module configuration.
     */
    @objid ("01f40414-0000-32d1-0000-000000000000")
    IModuleUserConfiguration getConfiguration();

    /**
     * Used to return the module description.
     * @return The module description
     */
    @objid ("01f40414-0000-32b2-0000-000000000000")
    String getDescription();

    /**
     * Get the image provided by the module for a given stereotype. The module should return an image if the stereotype
     * is provided by itself, null in the other case. The image life cycle must be handled by the module.
     * @param stereotype a stereotype
     * @param type the image type
     * @return the stereotype image, or null if the module provides none.
     */
    @objid ("e3b2b60f-de71-11dd-afed-0014222a9f79")
    Image getImage(Stereotype stereotype, ImageType type);

    /**
     * Get the Jython scripting engine configured for having access to all the module classes and the public classes of
     * all required modules.
     * 
     * The following variables are already bound:
     * <ul>
     * <li>SESSION : the MDA modeling session</li>
     * <li> {@link IModule} MODULE : this module</li>
     * <li> {@link ClassLoader} CLASSLOADER : the class loader of the module</li>
     * </ul>
     * @see <a href="http://www.jython.org" > The Jython project homepage</a>
     * @return The Jython scripting engine.
     */
    @objid ("864713ba-6248-11de-9398-001ec947ccaf")
    ScriptEngine getJythonEngine();

    @objid ("21c1f31d-75dc-11dd-9866-0014222a9f79")
    String getLabel(Stereotype stereotype);

    @objid ("c84d65ab-3c3a-4cd0-a94b-64db4b821fe1")
    String getLabel(TagType tagType);

    @objid ("e7e0e25f-aaf4-4f0f-bb3b-286cfc6bb10a")
    String getLabel(NoteType noteType);

    @objid ("b8f127fa-71e4-4e5f-8b43-184e9b77c62f")
    String getLabel(ExternDocumentType docType);

    @objid ("4f710aac-819b-48e2-9cac-ec4e804e5ab9")
    String getLabel();

    @objid ("d7e1eff0-1d64-4d07-a6b0-00135b260e18")
    String getLabel(String key);

    /**
     * Returns an Image for this module.
     * @return an Image for this module. Might be <code>null</code>.
     */
    @objid ("9567ce16-8bc1-11dd-ad20-0014222a9f79")
    Image getModuleImage();

    /**
     * Returns the {@link ModuleComponent} model associated with this module.
     * @return the {@link ModuleComponent} model associated with this module.
     */
    @objid ("01f40414-0000-3b83-0000-000000000000")
    ModuleComponent getModel();

    /**
     * Used to return the module name.
     * <p>
     * <p>
     * The module name corresponds to the name of the module, as defined in the <i>MDA Designer<i> tool.
     * @return The module name
     */
    @objid ("01f40414-0000-32ae-0000-000000000000")
    String getName();

    /**
     * Get the parameters model as it must be shown in the module parameters edition dialog.
     * @return The parameters edition model.
     */
    @objid ("f8cddd33-8f94-11dd-bbe0-001ec947ccaf")
    IParameterEditionModel getParametersEditionModel();

    /**
     * Returns the peer module, connected to this module.
     * <p>
     * The peer module represents the public services of this current module.
     * @return The associated peer module
     */
    @objid ("01f40414-0000-32c3-0000-000000000000")
    IPeerModule getPeerModule();

    /**
     * Returns the session that is connected to the module.
     * <p>
     * <p>
     * The developer can:
     * <p>
     * 
     * <ul>
     * <li>return <code>this</code> and redefine all the operations directly in the module definition.</li>
     * <li>return an new instance of IModuleSession and implement all the needed operations.</li>
     * </ul>
     * @see IModuleSession
     * @return the session that is connected to the module
     */
    @objid ("01f40414-0000-3206-0000-000000000000")
    IModuleSession getSession();

    /**
     * Used to return the module version.
     * @return The module version
     */
    @objid ("01f40414-0000-32b6-0000-000000000000")
    Version getVersion();

    /**
     * Method automatically called just after the creation of the module.
     * <p>
     * <p>
     * 
     * The module is automatically instantiated at the beginning of the mda lifecycle and the constructor implementation
     * is not accessible to the module developer.
     * <p>
     * <p>
     * 
     * The <code>init</code> method allows the developer to execute the desired initialization code at this step. For
     * example, this is the perfect place to register any IViewpoint this module provides.
     * <p>
     * <p>
     * 
     * This method should never be called by the developer because it is already invoked by the tool.
     */
    @objid ("01f40414-0000-320a-0000-000000000000")
    void init();

    /**
     * Returns the minimum Modelio version that authorize the Module to be activated.
     * @return The minimum Modelio version
     */
    @objid ("45f75358-65cd-11e0-b0ca-001ec947cd2a")
    Version getRequiredModelioVersion();

    /**
     * Returns the collection of {@link IModuleAction} associated with passed location.
     * @param location the location for which actions are to be returned.
     * @return the collection of {@link IModuleAction} associated with passed location.
     */
    @objid ("45f75357-65cd-11e0-b0ca-001ec947cd2a")
    Collection<IModuleAction> getModuleActions(ActionLocation location);

    /**
     * Register a module action for the contextual popupmenu(s) of the application.
     * @param location The action insertion point in the popupmenu (see {@link ActionLocation})
     * @param action Action to store
     */
    @objid ("45f75359-65cd-11e0-b0ca-001ec947cd2a")
    void registerAction(ActionLocation location, IModuleAction action);

    /**
     * Returns the collection of {@link IModuleAction} associated with passed location.
     * @param location the location for which actions are to be returned.
     * @return the collection of {@link IModuleAction} associated with passed location.
     */
    @objid ("45f7535b-65cd-11e0-b0ca-001ec947cd2a")
    List<IModuleAction> getActions(ActionLocation location);

    /**
     * Returns the modeling session this module is loaded into.
     * @return the modeling session this module is loaded into.
     */
    @objid ("7990c085-65db-11e0-9853-001ec947cd2a")
    IModelingSession getModelingSession();

    /**
     * Return the defined property pages
     * @return The collection of property pages
     */
    @objid ("b6dd5fcd-65e1-11e0-9853-001ec947cd2a")
    Collection<IModulePropertyPage> getPropertyPages();

    /**
     * Get the ModelComponent contributor associated to this module.
     * @see IModelComponentContributor
     * @return the module configuration.
     */
    @objid ("1f42ee4a-65e6-11e0-9853-001ec947cd2a")
    IModelComponentContributor getModelComponentContributor(IModelComponent mc);

    /**
     * Returns current runtime state of this module.
     * @return the current runtime state of this module.
     */
    @objid ("0cf32e9f-99de-11e1-b1e0-001ec947c8cc")
    ModuleRuntimeState getState();

    /**
     * Method automatically called just before the disposal of the module.
     * <p>
     * <p>
     * 
     * 
     * The <code>uninit</code> method allows the developer to execute the desired un-initialization code at this step.
     * For example, if IViewpoints have been registered in the {@link #init()} method, this method is the perfect place
     * to remove them.
     * <p>
     * <p>
     * 
     * This method should never be called by the developer because it is already invoked by the tool.
     */
    @objid ("0a40ab62-a354-11e1-abf7-001ec947c8cc")
    void uninit();

    /**
     * Returns an Image Path for this module.
     * @return an Image Path for this module. Might be <code>null</code>.
     */
    @objid ("9c32ee31-1cf2-11e2-9c7e-bc305ba4815c")
    String getModuleImagePath();

    /**
     * Get all defined diagram tools.
     * @return the toolIds.
     * @since 2.2.1
     */
    @objid ("95bb2bb4-dcc8-440e-97e6-142a6ef06048")
    List<DiagramToolDescriptor> getDiagramTools();

    /**
     * Get all defined diagram custommizations.
     * @return the toolIds.
     * @since 2.2.1
     */
    @objid ("e2451778-d148-4ae8-a844-4b8f1d595e29")
    List<DiagramCustomizationDescriptor> getDiagramCustomizations();

    /**
     * Register a new palette 'box' Tool.<br>
     * The 'metaclass', 'stereotype' and 'dep' parameters are needed for the feedback mechanism when launching the tool interaction.
     * Therefore, they should match as close as possible the created elements in the handler.
     * A metamodel check based on the 'metaclass' to create is done beforehand by Modelio, which might trigger a 'red' feedback and prevent the handler to be called.
     * @see IBoxCommand
     * @param id The new tool id.
     * @param metaclass the metaclass of the element to create.
     * @param stereotype an optional stereotype.
     * @param dep the optional "parent to child" meta dependency used to attach the new element to its owner.
     * @param handler The new 'box' tool behavior.
     * @since 2.2.1
     */
    @objid ("9dc478cd-b9db-4f31-a6bb-7f023e137a36")
    void registerCustomizedTool(String id, Class<? extends MObject> metaclass, Stereotype stereotype, String dep, IBoxCommand handler);

    /**
     * Register a new palette 'attached box' Tool.<br>
     * The 'metaclass', 'stereotype' and 'dep' parameters are needed for the feedback mechanism when launching the tool interaction.
     * Therefore, they should match as close as possible the created elements in the handler.<br>
     * A metamodel check based on the 'metaclass' to create is done beforehand by Modelio, which might trigger a 'red' feedback and prevent the handler to be called.
     * @see IAttachedBoxCommand
     * @param id The new tool id.
     * @param metaclass the metaclass of the element to create.
     * @param stereotype an optional stereotype.
     * @param dep the "parent to child" meta dependency used to attach the new element to its owner.
     * @param handler The new 'attached box' tool behavior.
     * @since 2.2.1
     */
    @objid ("ade8ca2a-eb64-4b18-851d-daa62308de98")
    void registerCustomizedTool(String id, Class<? extends MObject> metaclass, Stereotype stereotype, String dep, IAttachedBoxCommand handler);

    /**
     * Register a new palette 'link' Tool.<br>
     * The 'metaclass', 'stereotype' and 'dep' parameters are needed for the feedback mechanism when launching the tool interaction.
     * Therefore, they should match as close as possible the created elements in the handler.<br>
     * A metamodel check based on the 'metaclass' to create is done beforehand by Modelio, which might trigger a 'red' feedback and prevent the handler to be called.
     * @see ILinkCommand
     * @param id The new tool id.
     * @param metaclass the metaclass of the element to create.
     * @param stereotype an optional stereotype.
     * @param dep the "parent to child" meta dependency used to attach the new element to its owner.
     * @param handler The new 'link' tool behavior.
     * @since 2.2.1
     */
    @objid ("26b7c48e-b58c-417f-ac18-94d1a8bf8070")
    void registerCustomizedTool(String id, Class<? extends MObject> metaclass, Stereotype stereotype, String dep, ILinkCommand handler);

    /**
     * Register a new palette 'multi link' Tool.<br>
     * The 'metaclass', 'stereotype' and 'dep' parameters are needed for the feedback mechanism when launching the tool interaction.
     * Therefore, they should match as close as possible the created elements in the handler.<br>
     * A metamodel check based on the 'metaclass' to create is done beforehand by Modelio, which might trigger a 'red' feedback and prevent the handler to be called.
     * @see IMultiLinkCommand
     * @param id The new tool id.
     * @param metaclass the metaclass of the element to create.
     * @param stereotype an optional stereotype.
     * @param dep the "parent to child" meta dependency used to attach the new element to its owner.
     * @param handler The new 'multi link' tool behavior.
     * @since 2.2.1
     */
    @objid ("d9fb453b-a8e6-4d8c-9fc7-745f2754fc2d")
    void registerCustomizedTool(String id, Class<? extends MObject> metaclass, Stereotype stereotype, String dep, IMultiLinkCommand handler);

    /**
     * Register a customizer for a stereotyped diagram.
     * @param stereotype the diagram stereotype which the customizer is intended for
     * @param baseDiagramClass the base diagram editor to customize
     * @param customizer the customizer implementation
     * @since 2.2.1
     */
    @objid ("8aa419b1-2030-4444-9e9b-423219fec74a")
    void registerDiagramCustomization(Stereotype stereotype, Class<? extends AbstractDiagram> baseDiagramClass, IDiagramCustomizer customizer);

    @objid ("d0f20abf-b0ac-404e-ae01-2c75875c3643")
    ILicenseInfos getLicenseInfos();

    @objid ("4b8ff81b-0d93-4388-87e9-1a8cbf5fbf9c")
    <I> I instanciateExternProcessor(String className, Class<I> clazz, Object... initargs);

    @objid ("6311e30d-8d61-45f4-9d7e-5d56b94c942d")
    List<WizardContribution> getDiagramWizardContributions();

    @objid ("d6afacce-53ab-44f2-903c-a62e32bc8fd9")
    void registerDiagramWizardContribution(ContributorCategory category, IDiagramWizardContributor contributor);

    @objid ("bc5436a9-9dbd-4d67-87b4-b4a90dc2f387")
    void unregisterDiagramWizardContribution(ContributorCategory category, IDiagramWizardContributor contributor);

    @objid ("8e52ef63-72a1-11dd-a1d1-001ec947cd2a")
    public enum ImageType {
        ICON,
        IMAGE;
    }

    /**
     * Enumeration of the states a module can have at runtime.
     */
    @objid ("4d148035-99dd-11e1-b1e0-001ec947c8cc")
    public enum ModuleRuntimeState {
        /**
         * This state indicates the module is loaded but not started.
         */
        Loaded,
        /**
         * This states indicates the module is loaded and started.
         */
        Started,
        /**
         * This state indicates the module could not be loaded at all.
         */
        Incompatible;
    }

}
