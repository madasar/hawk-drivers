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
                                    

package org.modelio.api.diagram;

import java.io.File;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.gef.palette.PaletteEntry;
import org.modelio.api.diagram.autodiagram.IAutoDiagramFactory;
import org.modelio.api.diagram.style.IStyleHandle;
import org.modelio.api.diagram.tools.IAttachedBoxCommand;
import org.modelio.api.diagram.tools.IBoxCommand;
import org.modelio.api.diagram.tools.ILinkCommand;
import org.modelio.api.diagram.tools.IMultiLinkCommand;
import org.modelio.api.ui.diagramcreation.IDiagramWizardContributor;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;

/**
 * This interface gives an entry point to manipulate the Modelio diagrams.<br>
 * It also manages diagram customization and diagram styles.
 */
@objid ("e05b1536-6bf4-11e0-a371-001ec947cd2a")
public interface IDiagramService {
    /**
     * Get the auto diagram factory.
     * @since 2.2
     * @return The auto diagram factory.
     */
    @objid ("ff24e6ef-7e65-11e1-b95c-002564c97630")
    IAutoDiagramFactory getAutoDiagramFactory();

    /**
     * Get an installed diagram styles from its name.
     * @since 2.2
     * @param name the name of the style to look for.
     * @return The style with the given name, or <code>null</code> if it isn't installed.
     */
    @objid ("ff24bfde-7e65-11e1-b95c-002564c97630")
    IStyleHandle getStyle(final String name);

    /**
     * List all diagram styles that are currently installed.
     * @return A list of styles. Might be empty, but not <code>null</code>.
     */
    @objid ("7ed90eca-d7a5-11e0-9245-001ec947cd2a")
    List<IStyleHandle> listStyles();

    /**
     * Register a new named style along with its 'data' file.<br>
     * @param styleName then name of the style to register.
     * @param baseStyleName the cascaded style.
     * @param styleData the list of all properties defined in the style.
     * @return then newly created IStyleHandle or <code>null</code> if the style could not be created. When the style already exists it is simply returned.
     */
    @objid ("7ed90ec3-d7a5-11e0-9245-001ec947cd2a")
    IStyleHandle registerStyle(final String styleName, final String baseStyleName, final File styleData);

    /**
     * Get a diagram handle on 'diagram'.<br>
     * It opens a new diagram editor in Modelio, or select it if already opened.
     * @param diagram the AbstractDiagram to open.
     * @return a diagram handle representing this diagram.
     */
    @objid ("a3e9293d-0ecc-11e2-96c4-002564c97630")
    IDiagramHandle getDiagramHandle(final AbstractDiagram diagram);

    /**
     * Get the palette tool from the given id.
     * @param id An id.
     * @return the found palette tool or <i>null</i> if none found.
     */
    @objid ("a3e9504f-0ecc-11e2-96c4-002564c97630")
    PaletteEntry getRegisteredTool(final String id);

    @objid ("18c7be9c-b77a-48b5-a511-141901dd0505")
    void registerCustomizedTool(final String id, MClass metaclass, final Stereotype stereotype, final String dependency, final IBoxCommand handler);

    @objid ("05e80879-c80a-4f2d-9639-944ba48ebbb7")
    void registerCustomizedTool(final String id, MClass metaclass, final Stereotype stereotype, final String dependency, final IAttachedBoxCommand handler);

    @objid ("7a79e9af-8dcc-4270-8610-e4772d06b691")
    void registerCustomizedTool(final String id, MClass metaclass, final Stereotype stereotype, final String dependency, final ILinkCommand handler);

    @objid ("9b03c21d-8ec5-4808-8a4f-df434b644246")
    void registerCustomizedTool(final String id, MClass metaclass, final Stereotype stereotype, final String dependency, final IMultiLinkCommand handler);

    @objid ("e90872ae-6052-46a6-9557-0a94d5ab1914")
    void registerDiagramCustomization(final Stereotype stereotype, MClass baseDiagramClass, final IDiagramCustomizer customizer);

    @objid ("63ae1f44-0c8e-4c9b-b67d-27d875d82cdc")
    void unregisterDiagramCustomization(final Stereotype stereotype, MClass baseDiagramClass, final IDiagramCustomizer customizer);

    @objid ("78f2438e-ba22-44fa-a765-88b4787638ae")
    void unregisterCustomizedTool(String id);

    /**
     * Register diagram contributor
     * @param contributor
     * @param category of the diagram contributor
     */
    @objid ("bda5f375-7af3-49b4-8d3f-54537aff2a13")
    void registerDiagramContributor(ContributorCategory category, IDiagramWizardContributor contributor);

    /**
     * Unregister diagram contributor
     * @param contributor
     * @param category of the diagram contributor
     */
    @objid ("ec9cb413-7f27-4591-8222-d7ab2e780484")
    void unregisterDiagramContributor(ContributorCategory category, IDiagramWizardContributor contributor);

}
