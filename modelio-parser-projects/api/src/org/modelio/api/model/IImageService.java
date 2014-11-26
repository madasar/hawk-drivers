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
                                    

package org.modelio.api.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.graphics.Image;
import org.modelio.api.module.IPeerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This class provide the API to get the image of a model element.
 */
@objid ("71d0e1d2-e3cf-11dd-a49b-0014222a9f79")
public interface IImageService {
    /**
     * Get the stereotyped image of an element.
     * <p>
     * The returned image depends on the filter:
     * <ul>
     * <li>if filter is not <code>null</code>, the first stereotype belonging to that module having an image is used. <br>
     * If no such stereotype is found, the method returns <code>null</code></li>
     * <li>otherwise, the first stereotype with an image is used. <br>
     * If no such stereotype is found, the method returns the UML image for this element.</li>
     * </ul>
     * @param element the element for which the image must be returned.
     * @param filter the module to use as filter.
     * @param useCmsDecoration if <code>true</code> the image will be decorated with the CMS state.
     * @return the image or <code>null</code>.
     */
    @objid ("a3ea13a3-0ecc-11e2-96c4-002564c97630")
    Image getStereotypedImage(MObject element, final IPeerModule filter, final boolean useCmsDecoration);

    /**
     * Get the UML standard image of an model object.
     * <p>
     * This method return the standard image of the model object ignoring the stereotypes owned by the object.
     * <p>
     * The returned image can be decorated with CMS state image depending on the <code>useCmsDecoration</code>
     * parameter.
     * @param element the model object for which the image must be displayed.
     * @param useCmsDecoration true if the image must be decorated with the CMS state, false otherwise.
     * @return the image corresponding to the model element.
     */
    @objid ("a3ea3ab6-0ecc-11e2-96c4-002564c97630")
    Image getUmlImage(MObject element, final boolean useCmsDecoration);

    /**
     * Get the small icon (16x16 pixels) representing the given metaclass.
     * @param metaclass A metamodel metaclass.
     * @return The representing icon.
     */
    @objid ("a3ea61c6-0ecc-11e2-96c4-002564c97630")
    Image getMetaclassImage(final Class<? extends MObject> metaclass);

}
