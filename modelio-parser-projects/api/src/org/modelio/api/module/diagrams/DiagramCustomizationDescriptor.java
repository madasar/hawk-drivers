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
                                    

package org.modelio.api.module.diagrams;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.diagram.IDiagramCustomizer;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

/**
 * Data structure representing a diagram customizer.
 * @since 2.2.1
 */
@objid ("dc8f2fa1-8c0a-4a86-a7ed-433a83ff72cc")
public class DiagramCustomizationDescriptor {
    @objid ("e6db5ef7-58f9-434c-a6a1-c33f2eef55ef")
    private Stereotype stereotype;

    @objid ("5426600e-2b0d-4cfa-bdcf-e0ca3742ce51")
    private Class<? extends AbstractDiagram> baseDiagramClass;

    @objid ("b13e7d51-f64a-4335-969f-9ab3a5014a66")
    private IDiagramCustomizer customizer;

    /**
     * Default constructor initializing fields.
     * @param stereotype a stereotype.
     * @param baseDiagramClass a diagram metaclass.
     * @param customizer a diagram customizer.
     */
    @objid ("7d6b76e0-3a4c-4c40-b534-22b4275b2a9a")
    public DiagramCustomizationDescriptor(Stereotype stereotype, Class<? extends AbstractDiagram> baseDiagramClass, IDiagramCustomizer customizer) {
        this.stereotype = stereotype;
        this.baseDiagramClass = baseDiagramClass;
        this.customizer = customizer;
    }

    /**
     * @return the stereotype
     */
    @objid ("c8df26d7-2198-4ce1-918c-30b18ac3515b")
    public Stereotype getStereotype() {
        return this.stereotype;
    }

    /**
     * @return the baseDiagramClass
     */
    @objid ("2c8016c6-68da-4d07-b62f-922cd9d9c7dc")
    public Class<? extends AbstractDiagram> getBaseDiagramClass() {
        return this.baseDiagramClass;
    }

    /**
     * @return the customizer
     */
    @objid ("2b5da504-0ace-457c-902c-90f14500d8ac")
    public IDiagramCustomizer getCustomizer() {
        return this.customizer;
    }

}
