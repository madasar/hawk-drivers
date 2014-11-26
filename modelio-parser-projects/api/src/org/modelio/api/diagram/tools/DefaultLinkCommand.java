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
                                    

package org.modelio.api.diagram.tools;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.resource.ImageDescriptor;
import org.modelio.api.diagram.IDiagramGraphic;
import org.modelio.api.diagram.IDiagramHandle;
import org.modelio.api.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.diagram.ILinkPath;
import org.modelio.api.module.IModuleUserConfiguration;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Default implementation of a diagram link command.
 * <p>
 * 
 * In a diagram, graphic links are graphic objects that display diagram links. For example an
 * ElementImport is a graphic link. <code>ILinkCommand</code> is the
 * interface that drives the interaction of creating a link
 * <p>
 * 
 * The interaction is started when the user clicks on the button in the diagram palette. Once the interaction is started
 * the user can use the mouse to create a new graphic link in the diagram. The
 * {@link #acceptFirstElement(IDiagramHandle, IDiagramGraphic) acceptFirstElement} method is called to know if the
 * element flown over by the mouse is valid to be the origin of the link. If it is not valid the user cannot click. If
 * the element is valid the interaction moves on to the next step. The
 * {@link #acceptSecondElement(IDiagramHandle, IDiagramGraphic, IDiagramGraphic) acceptSecondElement} is called
 * until the user click on the destination of the link. When the user clicks on the destination the
 * {@link #actionPerformed(IDiagramHandle, IDiagramGraphic, IDiagramGraphic, LinkRouterKind, ILinkPath)
 * actionPerformed} method is called.
 * <p>
 * 
 * The
 * {@link #actionPerformed(IDiagramHandle, IDiagramGraphic, IDiagramGraphic, LinkRouterKind, ILinkPath)
 * actionPerformed} is in charge of creating the link in the model and of unmasking the element in the diagram.<br>
 * 
 * Subclass the DefaultLinkCommand to provide a behavior to the
 * {@link #actionPerformed(IDiagramHandle, IDiagramGraphic, IDiagramGraphic, LinkRouterKind, ILinkPath)
 * actionPerformed} method.
 */
@objid ("01e402b4-0000-6b5f-0000-000000000000")
public abstract class DefaultLinkCommand implements ILinkCommand {
    @objid ("01e402b4-0000-6bb5-0000-000000000000")
    private String name;

    @objid ("01e402b4-0000-6bbb-0000-000000000000")
    private String tooltip;

    @objid ("b3d49bc4-7cb7-41e8-903c-4f5e39797fd1")
    private ImageDescriptor bitmap;

    /**
     * This method accept or refuse the interaction in the diagram for the origin of the link.
     * <p>
     * 
     * This method is called until the user clicks on an element.<br>
     * This default implementation always accept the interaction.
     * @param diagramHandle the representation of the diagram in which the interaction occurs.
     * @param targetNode the graphic that is below the mouse pointer.
     * @return an boolean that represents the result of the acceptFirstElement method.
     */
    @objid ("01e402b4-0000-6bc3-0000-000000000000")
    @Override
    public abstract boolean acceptFirstElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode);

    /**
     * This method accept or refuse the interaction with the diagram for the destination element of the link.
     * <p>
     * 
     * This method is called after the user has choosen the origin of the link.<br>
     * This default implementation always accept the interaction.
     * @param diagramHandle the representation of the diagram in which the interaction occurs.
     * @param originNode the graphic that is the origin of the link.
     * @param targetNode the graphic the is below the mouse pointer.
     * @return an boolean that represents the result of the acceptSecondElement method.
     */
    @objid ("01e402b4-0000-6bc9-0000-000000000000")
    @Override
    public abstract boolean acceptSecondElement(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode);

    /**
     * This method is invoked when the command is launched.
     * <p>
     * 
     * The actionPerformed is called after user has choosen the destination of the link.<br>
     * 
     * This default implementation does nothing.
     * <p>
     * @see IDiagramHandle#unmask(MObject, int, int)
     * @param diagramHandle the representation of the diagram where the command has been triggered.
     * @param originNode the origin graphic of the link to create.
     * @param targetNode the destination graphic of the link to create.
     * @param path the link path deduced from the user interactions.
     */
    @objid ("01e402b4-0000-6bd0-0000-000000000000")
    @Override
    public abstract void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind touterType, ILinkPath path);

    /**
     * Get the name of the command.
     * 
     * This name must unique in the context of the MDAC that defined the command.
     * @return the name of the command.
     */
    @objid ("01e402b4-0000-6bdb-0000-000000000000")
    @Override
    public String getLabel() {
        return this.name;
    }

    /**
     * Gets the tooltip of this command.
     * @return the text that will be displayed in the command's tooltip.
     */
    @objid ("01e402b4-0000-6bdf-0000-000000000000")
    @Override
    public String getTooltip() {
        return this.tooltip;
    }

    /**
     * Set the name of the command.
     * @param label the name of the command.
     */
    @objid ("2c41b00d-e5f5-11e0-9cef-bc305ba4815c")
    @Override
    public void setLabel(final String label) {
        this.name = label;
    }

    /**
     * Set the tooltip of this command.
     * @param tooltip the text that will be displayed in the command's tooltip.
     */
    @objid ("2c41fe2f-e5f5-11e0-9cef-bc305ba4815c")
    @Override
    public void setTooltip(final String tooltip) {
        this.tooltip = tooltip;
    }

    /**
     * Construct a DefaultLinkCommand and initialize it by passing the <code>name</code>, the <code>bitmap path</code>
     * and the <code>tooltip</code> of the command.
     * @param name the name of the command.
     * @param bitmap the absolute path of the command bitmap.
     * @param tooltip the tooltip text of the command.
     */
    @objid ("a3ecf9e9-0ecc-11e2-96c4-002564c97630")
    public DefaultLinkCommand(String name, ImageDescriptor bitmap, String tooltip) {
        super();
        this.name = name;
        this.bitmap = bitmap;
        this.tooltip = tooltip;
    }

    /**
     * Get the command's bitmap path.
     * 
     * The provided path must be absolute.
     * @see IModuleUserConfiguration#getModuleResourcesPath()
     * @return the absolute path of the bitmap.
     */
    @objid ("a3edbd3b-0ecc-11e2-96c4-002564c97630")
    @Override
    public ImageDescriptor getBitmap() {
        return this.bitmap;
    }

    /**
     * Set the command's bitmap.
     * @param image the bitmap ImageDescriptor.
     */
    @objid ("a3ee597f-0ecc-11e2-96c4-002564c97630")
    @Override
    public void setBitmap(final ImageDescriptor image) {
        this.bitmap = image;
    }

}
