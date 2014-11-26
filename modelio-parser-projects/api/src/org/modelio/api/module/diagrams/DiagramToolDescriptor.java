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
import org.modelio.api.diagram.tools.IDiagramCommand;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Data structure representing a diagram tool.
 * @since 2.2.1
 */
@objid ("df460e76-0480-42c5-b69e-115ca9e1bfa5")
public class DiagramToolDescriptor {
    @objid ("44d65cf5-4745-4072-a4a3-437a4c4c7112")
    private String id;

    @objid ("8b0df268-81c5-4a3a-87ce-c397bfd066c8")
    private String dep;

    @objid ("1b541181-8621-4290-97d7-77f69228afaf")
    private Class<? extends MObject> metaclass;

    @objid ("bdef552f-2166-4192-96b2-cfec4ebd181a")
    private Stereotype stereotype;

    @objid ("9afe1b82-32b3-4c1c-9f68-36fdd2f75164")
    private IDiagramCommand handler;

    /**
     * Default constructor initializing fields.
     * @param id the tool id.
     * @param metaclass a metaclass.
     * @param stereotype a stereotype.
     * @param dep a metamodel dependency name.
     * @param handler the tool behavior.
     */
    @objid ("58af98d6-ee7c-47c9-90f6-ffac49526195")
    public DiagramToolDescriptor(String id, Class<? extends MObject> metaclass, Stereotype stereotype, String dep, IDiagramCommand handler) {
        this.id = id;
        this.metaclass = metaclass;
        this.stereotype = stereotype;
        this.dep = dep;
        this.handler = handler;
    }

    /**
     * @return the id
     */
    @objid ("5ab06903-40b3-4898-b54b-de2fe4c74f1e")
    public String getId() {
        return this.id;
    }

    /**
     * @return the metaclass
     */
    @objid ("bcb56348-9989-4011-90d7-6d1174340eeb")
    public Class<? extends MObject> getMetaclass() {
        return this.metaclass;
    }

    /**
     * @return the stereotype
     */
    @objid ("79866c0d-8ab4-4dc7-ae06-6495f9cda393")
    public Stereotype getStereotype() {
        return this.stereotype;
    }

    /**
     * @return the dep
     */
    @objid ("fa5007cb-8103-4177-9bba-a6de6774601c")
    public String getDep() {
        return this.dep;
    }

    /**
     * @return the handler
     */
    @objid ("94af2a2e-58c5-4bde-856e-83f2b76edcec")
    public IDiagramCommand getHandler() {
        return this.handler;
    }

}
