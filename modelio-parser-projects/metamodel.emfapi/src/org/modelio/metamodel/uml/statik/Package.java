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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.PackageMerge;

@objid ("001529ee-c4bf-1fd8-97fe-001ec947cd2a")
public interface Package extends NameSpace {
    @objid ("e15d244b-a208-4432-852f-b6438f3e4d39")
    boolean isIsInstantiable();

    @objid ("4fd59cc2-06f2-4102-8c7f-f138575adc1a")
    void setIsInstantiable(boolean value);

    @objid ("0d2d2038-6f87-4a50-985c-31c7abb35ebf")
    EList<BpmnParticipant> getBpmnRepresents();

    @objid ("7977a106-fbc4-43b8-9c9e-d277f686153c")
    <T extends BpmnParticipant> List<T> getBpmnRepresents(java.lang.Class<T> filterClass);

    @objid ("d34d6afc-cc4c-4dc0-99c9-6d7ea6d3eab7")
    EList<PackageMerge> getReceivingMerge();

    @objid ("b9c03edc-f936-4f71-86be-c0c919d911d8")
    <T extends PackageMerge> List<T> getReceivingMerge(java.lang.Class<T> filterClass);

    @objid ("b6005a22-b23b-4bf5-bf81-64b1378f858b")
    Project getRepresented();

    @objid ("2a7a0f55-c200-43a3-b445-e66af5a3c3dc")
    void setRepresented(Project value);

    @objid ("e501d24f-e44d-47c3-aa8f-01353f45c94c")
    EList<PackageMerge> getMerge();

    @objid ("faecaa45-73b6-40df-8223-e9d41e10ac3c")
    <T extends PackageMerge> List<T> getMerge(java.lang.Class<T> filterClass);

    @objid ("c46c9c22-f5ab-4155-b095-8333167c8796")
    EList<PackageImport> getPackageImporting();

    @objid ("54c93d58-426d-439f-8b88-b560083e7b1b")
    <T extends PackageImport> List<T> getPackageImporting(java.lang.Class<T> filterClass);

}
