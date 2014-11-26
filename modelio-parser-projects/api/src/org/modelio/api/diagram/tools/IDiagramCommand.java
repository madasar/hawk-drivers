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

/**
 * Basic definition of a command for the diagram palette.<br>
 * It must provide a label, a tooltip and a bitmap.
 */
@objid ("01f41e44-0000-0101-0000-000000000000")
public interface IDiagramCommand {
    /**
     * Get the name of the command.
     * @return the name of the command.
     */
    @objid ("01f41e44-0000-0186-0000-000000000000")
    String getLabel();

    /**
     * Gets the tooltip of this command.
     * @return the text that will be displayed in the command's tooltip.
     */
    @objid ("01f41e44-0000-0189-0000-000000000000")
    String getTooltip();

    /**
     * Get the command's bitmap.
     * @return the bitmap ImageDescriptor.
     */
    @objid ("01f41e44-0000-018c-0000-000000000000")
    ImageDescriptor getBitmap();

    /**
     * Set the name of the command.
     * @param label the name of the command.
     */
    @objid ("0fad4a4b-e5f5-11e0-9cef-bc305ba4815c")
    void setLabel(final String label);

    /**
     * Set the command's bitmap.
     * @param image the bitmap ImageDescriptor.
     */
    @objid ("0fad715d-e5f5-11e0-9cef-bc305ba4815c")
    void setBitmap(final ImageDescriptor image);

    /**
     * Set the tooltip of this command.
     * @param tooltip the text that will be displayed in the command's tooltip.
     */
    @objid ("0fad986d-e5f5-11e0-9cef-bc305ba4815c")
    void setTooltip(final String tooltip);

}
