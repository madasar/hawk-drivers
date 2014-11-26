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
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.resource.ImageDescriptor;
import org.modelio.api.diagram.IDiagramGraphic;
import org.modelio.api.diagram.IDiagramHandle;
import org.modelio.api.module.IModuleUserConfiguration;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Default implementation of a diagram box command.
 * <p>
 * 
 * In a diagram, graphic boxes are graphic objects that display diagram nodes. For example Packages and Classes
 * are graphic boxes. <code>IBoxCommand</code> is the interface that drives the interaction of creating a box
 * <p>
 * 
 * The interaction is started when the user clicks on the button in the diagram palette. Once the interaction is started
 * the user can use the mouse to create a new graphic box in the diagram. The
 * {@link #acceptElement(IDiagramHandle, IDiagramGraphic) acceptElement} method is called to know if the element
 * flown over by the mouse is valid for the command. If it is not valid the user cannot finish the interaction. If the
 * element is valid the user can terminates the interaction by either clicking or by pressing the left mouse button
 * doing a drag and drop and releasing the mouse button. Once this is done the
 * {@link #actionPerformed(IDiagramHandle, IDiagramGraphic, Rectangle) actionPerformed} is called.
 * <p>
 * 
 * The {@link #actionPerformed(IDiagramHandle, IDiagramGraphic, Rectangle) actionPerformed} does nothing in
 * this default implementation.<br>
 * 
 * Subclass the DefaultBoxCommand to provide a behavior to the
 * {@link #actionPerformed(IDiagramHandle, IDiagramGraphic, Rectangle) actionPerformed} method.
 */
@objid ("01e402b4-0000-6b5d-0000-000000000000")
public abstract class DefaultBoxCommand implements IBoxCommand {
    @objid ("01e402b4-0000-6b83-0000-000000000000")
    private String name;

    @objid ("01e402b4-0000-6b89-0000-000000000000")
    private String tooltip;

    @objid ("dcf711db-81f2-4845-b08a-e3f7723c483f")
    private ImageDescriptor bitmap;

    /**
     * This method accept or refuse the interaction in the diagram.
     * <p>
     * 
     * This method is called until the interaction is validated by the user.<br>
     * This default implementation always accept the interaction.
     * @param diagramHandle the representation of the diagram in which the interaction occurs.
     * @param targetNode the graphic that is below the mouse pointer.
     * @return an boolean that represents the result of the acceptElement method.
     */
    @objid ("01e402b4-0000-6b91-0000-000000000000")
    @Override
    public abstract boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode);

    /**
     * Get the label of the command.
     * 
     * This name must unique in the context of the MDAC that defined the command.
     * @return the name of the command.
     */
    @objid ("01e402b4-0000-6ba1-0000-000000000000")
    @Override
    public String getLabel() {
        return this.name;
    }

    /**
     * Gets the tooltip of this command.
     * @return the text that will be displayed in the command's tooltip.
     */
    @objid ("01e402b4-0000-6ba5-0000-000000000000")
    @Override
    public String getTooltip() {
        return this.tooltip;
    }

    /**
     * Set the name of the command.
     * @param label the name of the command.
     */
    @objid ("2c39999f-e5f5-11e0-9cef-bc305ba4815c")
    @Override
    public void setLabel(final String label) {
        this.name = label;
    }

    /**
     * Set the tooltip of this command.
     * @param tooltip the text that will be displayed in the command's tooltip.
     */
    @objid ("2c39e7c0-e5f5-11e0-9cef-bc305ba4815c")
    @Override
    public void setTooltip(final String tooltip) {
        this.tooltip = tooltip;
    }

    /**
     * Construct a DefaultBoxCommand and initialize it by passing the <code>name</code>, the <code>bitmap path</code>
     * and the <code>tooltip</code> of the command.
     * @param name the name of the command.
     * @param bitmap the absolute path of the command bitmap.
     * @param tooltip the tooltip text of the command.
     */
    @objid ("a3d4dd6b-0ecc-11e2-96c4-002564c97630")
    public DefaultBoxCommand(String name, ImageDescriptor bitmap, String tooltip) {
        super();
        this.name = name;
        this.bitmap = bitmap;
        this.tooltip = tooltip;
    }

    /**
     * This method is called when the interaction is validated by the user.
     * <p>
     * 
     * This default implementation does nothing.
     * <p>
     * 
     * If the user click or click and drag in a graphic box the parent argument contains the diagram node container
     * corresponding to graphic box. If the user click or click and drag in the diagram background parent is null.
     * <p>
     * 
     * The rect argument is the rectangle that result from the user interaction with the diagram. This rect should be
     * used to manage the unmasking of the model element in the diagram.
     * @see IDiagramHandle#unmask(MObject, int, int)
     * @param diagramHandle the representation of the diagram where the command has been triggered.
     * @param parent the graphic parent where the user has clicked.
     * @param rect the rectangle of the object to create.
     */
    @objid ("a3d52b8a-0ecc-11e2-96c4-002564c97630")
    @Override
    public abstract void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic parent, Rectangle rect);

    /**
     * Get the command's bitmap path.
     * 
     * The provided path must be absolute.
     * @see IModuleUserConfiguration#getModuleResourcesPath()
     * @return the absolute path of the bitmap.
     */
    @objid ("a3d552a0-0ecc-11e2-96c4-002564c97630")
    @Override
    public ImageDescriptor getBitmap() {
        return this.bitmap;
    }

    /**
     * Set the command's bitmap.
     * @param image the bitmap ImageDescriptor.
     */
    @objid ("a3d5eedf-0ecc-11e2-96c4-002564c97630")
    @Override
    public void setBitmap(final ImageDescriptor image) {
        this.bitmap = image;
    }

}
