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
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.resource.ImageDescriptor;
import org.modelio.api.diagram.IDiagramGraphic;
import org.modelio.api.diagram.IDiagramHandle;
import org.modelio.api.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.diagram.ILinkPath;
import org.modelio.api.module.IModuleUserConfiguration;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Default implementation of a diagram attached box command.
 * <p>
 * 
 * In a diagram, graphic boxes attached are graphic objects that display diagram nodes linked to another diagram
 * element. For example Notes and Constraints are graphic attached boxes.
 * <code>IAttachedBoxCommand</code> is the interface that drives the interaction of creating a box attached to another
 * diagram element
 * <p>
 * 
 * The interaction is started when the user clicks on the button in the diagram palette. Once the interaction is started
 * the user can use the mouse to create a new graphic attached box in the diagram. The
 * {@link #acceptElement(IDiagramHandle, IDiagramGraphic) acceptElement} method is called to know if the element
 * flown over by the mouse is valid for the command. If it is not valid the user cannot finish the interaction. If the
 * element is valid the user can terminates the interaction.<br>
 * If the user click in the diagram background
 * {@link #actionPerformedInDiagram(IDiagramHandle, Rectangle) actionPerformedInDiagram} is called.<br>
 * If the user click on the element to attach then in the diagram background
 * {@link #actionPerformed(IDiagramHandle, IDiagramGraphic, LinkRouterKind, ILinkPath, Point)
 * actionPerformed} is called.
 * <p>
 * 
 * The
 * {@link #actionPerformed(IDiagramHandle, IDiagramGraphic, LinkRouterKind, ILinkPath, Point)
 * actionPerformed} and {@link #actionPerformedInDiagram(IDiagramHandle, Rectangle)
 * actionPerformedInDiagram} methods do nothing in this default implementation.
 * 
 * Subclass the DefaultAttachedBoxCommand to provide a behavior to the
 * {@link #actionPerformed(IDiagramHandle, IDiagramGraphic, LinkRouterKind, ILinkPath, Point)
 * actionPerformed} and {@link #actionPerformedInDiagram(IDiagramHandle, Rectangle)
 * actionPerformedInDiagram} methods.
 */
@objid ("01ec00d8-0000-5ab2-0000-000000000000")
public abstract class DefaultAttachedBoxCommand implements IAttachedBoxCommand {
    @objid ("01ec00d8-0000-5ab9-0000-000000000000")
    private String name;

    @objid ("01ec00d8-0000-5abf-0000-000000000000")
    private String tooltip;

    @objid ("28f6d037-d02a-4b92-80cd-38095883782a")
    private ImageDescriptor bitmap;

    /**
     * Construct a DefaultAttachedBoxCommand and initialize it by passing the <code>name</code>, the
     * <code>bitmap path</code> and the <code>tooltip</code> of the command.
     * @param name the name of the command.
     * @param bitmap the absolute path of the command bitmap.
     * @param tooltip the tooltip text of the command.
     */
    @objid ("01ec00d8-0000-5ac2-0000-000000000000")
    public DefaultAttachedBoxCommand(String name, ImageDescriptor bitmap, String tooltip) {
        super();
        this.name = name;
        this.bitmap = bitmap;
        this.tooltip = tooltip;
    }

    /**
     * This method accept or refuse the interaction in the diagram.
     * <p>
     * 
     * This method is called until the interaction is validated by the user.<br>
     * If the interaction is allowed the method <code>return new InteractionStatus(true, "");</code><br>
     * If the interaction is not allowed the method <code>return new InteractionStatus(false, "Tooltip message");</code>
     * . In this case the mouse pointer is changed to a "forbiden" icon and the tooltip message is displayed in a
     * tooltip near the mouse pointer<br>
     * @param diagramHandle the representation of the diagram in which the interaction occurs.
     * @param targetNode the graphic that is below the mouse pointer.
     * @return an InteractionStatus that represents the result of the acceptElement method.
     */
    @objid ("01ec00d8-0000-5ac7-0000-000000000000")
    @Override
    public abstract boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode);

    /**
     * This method is called when the user click on an existing diagram element.
     * <p>
     * 
     * The method is in charge of creating the model element in the model and of unmasking the element in the diagram.
     * <p>
     * 
     * The originNode argument contains the diagram node container corresponding to the origin graphic box.
     * <p>
     * 
     * The rect argument is the rectangle that result from the user interaction with the diagram. This rect should be
     * used to manage the unmasking of the model element in the diagram.
     * @see IDiagramHandle#unmask(MObject, int, int)
     * @param diagramHandle the representation of the diagram where the command has been triggered.
     * @param originNode the graphic parent where the user has clicked.
     * @param routerType the router type that is currently defined to compute the path of the link.
     * @param path the link path deduced from the user interactions.
     * @param point the point of the second user click.
     */
    @objid ("01ec00d8-0000-5ad2-0000-000000000000")
    @Override
    public abstract void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, LinkRouterKind routerType, ILinkPath path, Point point);

    /**
     * Get the command's bitmap path.
     * 
     * The provided path must be absolute.
     * @see IModuleUserConfiguration#getModuleResourcesPath()
     * @return the absolute path of the bitmap.
     */
    @objid ("01ec00d8-0000-5adb-0000-000000000000")
    @Override
    public ImageDescriptor getBitmap() {
        return this.bitmap;
    }

    /**
     * Get the label of the command.
     * 
     * This name must unique in the context of the MDAC that defined the command.
     * @return the name of the command.
     */
    @objid ("01ec00d8-0000-5ade-0000-000000000000")
    @Override
    public String getLabel() {
        return this.name;
    }

    /**
     * Gets the tooltip of this command.
     * @return the text that will be displayed in the command's tooltip.
     */
    @objid ("01ec00d8-0000-5ae1-0000-000000000000")
    @Override
    public String getTooltip() {
        return this.tooltip;
    }

    /**
     * This method is called when the user click in the diagram background.
     * <p>
     * 
     * The method is in charge of creating the model element in the model and of unmasking the element in the diagram.
     * <p>
     * 
     * The rect argument is the rectangle that result from the user interaction with the diagram background. This rect
     * should be used to manage the unmasking of the model element in the diagram.
     * @see IDiagramHandle#unmask(MObject,int, int)
     * @param diagramHandle the representation of the diagram where the command has been triggered.
     * @param rect the rectangle of the object to create.
     */
    @objid ("01ec00d8-0000-5d93-0000-000000000000")
    @Override
    public abstract void actionPerformedInDiagram(final IDiagramHandle diagramHandle, Rectangle rect);

    /**
     * Set the name of the command.
     * @param label the name of the command.
     */
    @objid ("2c3e7bb0-e5f5-11e0-9cef-bc305ba4815c")
    @Override
    public void setLabel(final String label) {
        this.name = label;
    }

    /**
     * Set the command's bitmap.
     * @param image the bitmap ImageDescriptor.
     */
    @objid ("2c3ea2c1-e5f5-11e0-9cef-bc305ba4815c")
    @Override
    public void setBitmap(final ImageDescriptor image) {
        this.bitmap = image;
    }

    /**
     * Set the tooltip of this command.
     * @param tooltip the text that will be displayed in the command's tooltip.
     */
    @objid ("2c3ea2c5-e5f5-11e0-9cef-bc305ba4815c")
    @Override
    public void setTooltip(final String tooltip) {
        this.tooltip = tooltip;
    }

}
