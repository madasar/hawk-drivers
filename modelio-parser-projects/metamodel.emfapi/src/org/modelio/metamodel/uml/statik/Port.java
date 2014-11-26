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
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

@objid ("0018a768-c4bf-1fd8-97fe-001ec947cd2a")
public interface Port extends BindableInstance {
    @objid ("2128f4e7-8a6d-47e1-b4b5-95c88dadc5d3")
    boolean isIsBehavior();

    @objid ("fe1b12dd-81d9-4b67-9ee7-9ac62455c15c")
    void setIsBehavior(boolean value);

    @objid ("4c86bd2c-290d-460b-ab92-133008479f93")
    boolean isIsService();

    @objid ("51904cc0-6b76-4b21-9c84-77ccc0dd2c9e")
    void setIsService(boolean value);

    @objid ("e9f6d6cd-9ad0-4e5a-91d9-0f89c1b7f7ad")
    boolean isIsConjugated();

    @objid ("eabd57b3-61db-4e0c-8423-7cebb15b1321")
    void setIsConjugated(boolean value);

    @objid ("799695a2-719c-4882-9b41-953cab1a1517")
    PortOrientation getDirection();

    @objid ("ab6f8465-2920-42f9-934f-ecb5ce9e87e3")
    void setDirection(PortOrientation value);

    @objid ("cfc48464-81df-4877-8bbb-95e4d293cd15")
    EList<ProvidedInterface> getProvided();

    @objid ("2e92cd12-8170-4a36-9bbc-a6d06f96dc9f")
    <T extends ProvidedInterface> List<T> getProvided(java.lang.Class<T> filterClass);

    @objid ("e61b4ef0-cf76-492e-90a7-a3c57a875fcb")
    EList<RequiredInterface> getRequired();

    @objid ("87839191-d69e-4b12-9aa6-b059ba0e9eec")
    <T extends RequiredInterface> List<T> getRequired(java.lang.Class<T> filterClass);

}
