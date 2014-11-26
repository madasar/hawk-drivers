/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */  


package org.modelio.xmi.reverse;

import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.xmi.model.ecore.IEElement;
import org.modelio.xmi.plugin.Xmi;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("84a8a797-3c11-4e05-b8c1-66fe64583225")
public class ImportModel {

    private IProgressMonitor localMonitor = null;

    private int eltExported = 0;

    @objid ("0680e182-25dc-4a8f-a394-ef84c20a2b88")
    private boolean external = false;

    @objid ("22f33c3d-09db-49cc-964f-9e1b1dbfcc63")
    public void importXMI(IEElement ieelem) {
        PartialImportMap partialCreationMap = PartialImportMap.getInstance();
        TotalImportMap totalCreationMap = TotalImportMap.getInstance();

        org.eclipse.uml2.uml.Element ecoreElt = ieelem.getEcoreElement();

        Object objingElt = totalCreationMap.get(ecoreElt);

        if (objingElt == null) {
            objingElt = partialCreationMap.get(ecoreElt);

            if (objingElt == null &&
                    isMapperOfCurrentElt(getCurrentClassName(ieelem), ieelem.getEcoreElement())) {
                // Creation:
                objingElt = ieelem.createObjingElt();

                if (objingElt != null) {
                    partialCreationMap.put(ecoreElt, objingElt);
                }

            }

            if (objingElt != null) {

                // Finish creation:
                setMapping(objingElt, ieelem);

                partialCreationMap.remove(ecoreElt);
                totalCreationMap.put(ecoreElt, objingElt);

            }
                        
            // Update the progress Monitor
            if ((this.localMonitor != null) 
                    && (ecoreElt instanceof org.eclipse.uml2.uml.Namespace)) {
                this.eltExported += 1;
                this.localMonitor.worked(this.eltExported + 1); 
                this.localMonitor.setTaskName(Xmi.I18N.getMessage("Import.importedElements", this.eltExported));
            }
        }
    }


    @objid ("1b89b0f9-ed18-4fe5-870a-f67296819766")
    private void setMapping(Object objingElt, IEElement ieelem) {
        try {
            if ((objingElt != null) &&
                    (objingElt instanceof Element) &&
                    (((Element) objingElt).getStatus().isModifiable())) {
                if (this.external) {
                    if (objingElt instanceof ModelTree) {
                        ((ModelTree) objingElt).setOwner(ReverseProperties.getInstance()
                                .getExternalPackage());
                        this.external = false;
                    }
                } else {
                    ieelem.attach((Element) objingElt);
                }
                ieelem.setProperties((Element) objingElt);
                ieelem.setStereotypes();

            } else if (objingElt instanceof ArrayList<?>) {
                ieelem.attach((ArrayList<Object>) objingElt);
                for (Element elt : (ArrayList<Element>) objingElt) {
                    if (elt.getStatus().isModifiable()) {
                        ieelem.setProperties(elt);
                        ieelem.setStereotypes();
                    }
                }
            }

        } catch (RuntimeException e) {

            if ("Joni org.eclipse.uml2.uml.Element Not Found".equals(e.getMessage())) {
                PartialImportMap.getInstance().remove(ieelem.getEcoreElement());
            }

            Xmi.LOG.error(e);

        }
    }

    @objid ("639792cb-a7ba-406c-9bd5-f04b88af727b")
    private String getCurrentClassName(IEElement ieelem) {
        String name = ieelem.getClass().getSimpleName();
        return name.substring(1, name.length());
    }

    @objid ("03dacf2f-a1dd-45f8-a565-122237e57f35")
    public ImportModel(IProgressMonitor progressMonitor) {
        this.localMonitor = progressMonitor;
    }

    @objid ("2ba13eb0-048f-4946-912f-d6526f401aa5")
    private boolean isMapperOfCurrentElt(String mapperName, org.eclipse.uml2.uml.Element ecoreElement) {
        return (ecoreElement.getClass().getSimpleName().contains(mapperName));
    }

}
