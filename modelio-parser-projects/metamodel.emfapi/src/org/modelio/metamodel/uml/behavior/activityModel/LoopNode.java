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
package org.modelio.metamodel.uml.behavior.activityModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("00372b20-c4bf-1fd8-97fe-001ec947cd2a")
public interface LoopNode extends StructuredActivityNode {
    @objid ("fa2932da-bbf5-4380-bac7-8907936769db")
    boolean isIsTestedFirst();

    @objid ("ef710b5d-df89-4568-9d2d-995829c482cb")
    void setIsTestedFirst(boolean value);

    @objid ("11a813a5-dab5-477c-b69c-35da44e5bf0d")
    String getSetup();

    @objid ("a7d6ca3a-802b-4696-90f1-c6f602a63888")
    void setSetup(String value);

    @objid ("1fa8534d-dbcd-44c1-8171-2482531d4e73")
    String getTest();

    @objid ("d4d5bac8-88ee-4124-9652-c7f73c0cd282")
    void setTest(String value);

}
