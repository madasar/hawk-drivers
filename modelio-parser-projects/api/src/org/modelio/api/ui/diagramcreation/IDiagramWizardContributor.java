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
                                    

package org.modelio.api.ui.diagramcreation;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.graphics.Image;
import org.modelio.api.ui.text.IElementFilter;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MClass;

@objid ("5bfbaf98-911c-11e0-9de7-002564c97630")
public interface IDiagramWizardContributor extends IElementFilter {
    @objid ("5bfbaf99-911c-11e0-9de7-002564c97630")
    String getLabel();

    @objid ("5bfbd6a9-911c-11e0-9de7-002564c97630")
    String getInformation();

    @objid ("5bfbfdb8-911c-11e0-9de7-002564c97630")
    List<MClass> getAcceptedMetaclasses();

    @objid ("5bfc24cb-911c-11e0-9de7-002564c97630")
    String getHelpUrl();

    @objid ("3ad878c8-c8ec-11e0-9f93-002564c97630")
    String getDetails();

    @objid ("d94e0d28-5b07-11e2-9c97-002564c97630")
    Image getIcon();

    @objid ("d94e0d2a-5b07-11e2-9c97-002564c97630")
    AbstractDiagram actionPerformed(final ModelElement diagramContext, final String diagramName, final String diagramDescription);

}
