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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("0003f692-c4bf-1fd8-97fe-001ec947cd2a")
public interface Collaboration extends NameSpace {
    @objid ("f8e2b79a-f128-4125-b45a-bcf5e6874d17")
    boolean isIsConcurrent();

    @objid ("9ccccf47-3e05-4ba1-bd95-63133f10ab03")
    void setIsConcurrent(boolean value);

    @objid ("187816fa-b66f-4463-ac00-d8f560094b8e")
    Operation getORepresented();

    @objid ("8a2c14c9-0545-467a-9a82-8ee0b341a495")
    void setORepresented(Operation value);

    @objid ("441d21e1-2d46-4c6a-b46a-62b7b945a38e")
    Behavior getBRepresented();

    @objid ("79f4c6f3-f29d-4992-9e0b-164ec169013f")
    void setBRepresented(Behavior value);

    @objid ("8e177c27-0d2a-46f6-8ba4-aeeb906402f0")
    EList<CollaborationUse> getOccurrence();

    @objid ("f1c0e207-5f0a-40ad-ac76-e94a99e645b1")
    <T extends CollaborationUse> List<T> getOccurrence(java.lang.Class<T> filterClass);

}
