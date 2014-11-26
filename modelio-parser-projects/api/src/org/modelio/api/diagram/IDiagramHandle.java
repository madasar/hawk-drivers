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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.diagram.dg.IDiagramDG;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This class is used to manipulate a diagram's content.
 * 
 * @since 2.0
 */
@objid ("55f72c2f-6b43-11e0-b0b9-002564c97630")
public interface IDiagramHandle extends AutoCloseable {
    /**
     * Get the diagram graphic for the diagram itself.
     * @return a diagram node.
     */
    @objid ("55f72c30-6b43-11e0-b0b9-002564c97630")
    IDiagramDG getDiagramNode();

    /**
     * Mask a graphical element in the diagram.
     * @param graphic The graphical element to remove from the diagram.
     */
    @objid ("45696d47-77bf-11e0-bfdb-002564c97630")
    void mask(final IDiagramGraphic graphic);

    /**
     * Save the diagram in Modelio.
     */
    @objid ("55f75341-6b43-11e0-b0b9-002564c97630")
    void save();

    /**
     * Close this diagram handle and release associated ressources.<br>
     * This IDiagramHandle mustn't be used any longer after calling this method.
     */
    @objid ("053e7808-805d-11e0-b07f-002564c97630")
    @Override
    void close();

    /**
     * Saves the diagram image in a file with the specified name. The format parameter can have one of the following
     * values:
     * <ul>
     * <li>"PNG"</li>
     * <li>"BMP"</li>
     * <li>"JPEG"</li>
     * <li>"GIF"</li>
     * </ul>
     * The margin parameter allows to define the size of margins to use around the actual content.
     * @param format the format to write the images in.
     * @param targetFile the name of the file to write the image to.
     * @param margin the margins to add around the content of the diagram.
     * @since 2.1.1
     */
    @objid ("1b3c722f-4daf-11e1-ac9d-001ec947c8cc")
    void saveInFile(final String format, final String targetFile, final int margin);

    /**
     * Get the element this {@link IDiagramHandle} is related to.
     * @return the represented element.
     */
    @objid ("a42151ad-0ecc-11e2-96c4-002564c97630")
    AbstractDiagram getDiagram();

    /**
     * Returns the list of diagram graphic representing (ie: for which the getElement() method does return the element
     * of) the given reference in this diagram or an empty list if none is found.
     * @param element a model element for which we are searching graphics.
     * @return the list of all diagram graphics representing the passed reference, or an empty list if none is found.
     */
    @objid ("a42151b0-0ecc-11e2-96c4-002564c97630")
    List<IDiagramGraphic> getDiagramGraphics(final MObject element);

    /**
     * Unmask a model element in a diagram.
     * <p>
     * The model element is unmasked at the given position.
     * @param element the model element to unmask.
     * @param x the x coordinates of the unmasking position.
     * @param y the y coordinates of the unmasking position.
     * @return a list of all the new diagram graphics. Might be empty, but not <code>null</code>.
     */
    @objid ("a4219fcf-0ecc-11e2-96c4-002564c97630")
    List<IDiagramGraphic> unmask(final MObject element, final int x, final int y);

    /**
     * Sets the batch edition mode on/off. <br><br>
     * Activating the batch edition mode should be used as a memory consumption optimization when applying lots of
     * modification to a single diagram in a single transaction (e.g. when using the API to layout a diagram) to avoid
     * potential saves of intermediary states of the diagram. <br>
     * Callers should turn batch edition mode off once modifications are done and call {@link #save()} to actually save the
     * applied modifications. <br><br>
     * Note: <em>Batch edition mode is automatically turned off when {@link #close()} is called but it is
     * considered good practice to turn it off explicitly (particularly since {@link #close()} may be called silently by
     * a {@code try} -with-resources statement managing this diagram handle).</em>
     * @param batchMode true if batch mode should be engaged.
     * @since 2.2.1
     */
    @objid ("a4223c13-0ecc-11e2-96c4-002564c97630")
    void setBatchMode(boolean batchMode);

    /**
     * Return the drawing graphics matching the given identifier.
     * <p>
     * Returns <i>null</i> if no drawing graphic matches the identifier.
     * @param identifier a drawing graphic identifier
     * @return the matching drawing graphic
     * @since 3.1
     */
    @objid ("168e19e5-4358-4a29-9d28-8aec652de972")
    IDiagramGraphic getDrawingGraphic(String identifier);

    /**
     * Get the diagram graphics creation factory.
     * <p>
     * To be used to unmask elements and create new diagram drawings.
     * @return the diagrams graphics creation factory.
     * @since 3.1
     */
    @objid ("0a70fa7c-af47-45ce-b1a0-baea79006ea3")
    IDiagramGraphicFactory getCreationFactory();

}
