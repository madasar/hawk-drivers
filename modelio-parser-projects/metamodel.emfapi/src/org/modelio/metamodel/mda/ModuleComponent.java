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
package org.modelio.metamodel.mda;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.ModuleState;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.uml.statik.Component;

@objid ("006567e2-c4bf-1fd8-97fe-001ec947cd2a")
public interface ModuleComponent extends Component {
    @objid ("3971137a-e58e-48ac-87b4-e17b6f109e58")
    int getLicenseKey();

    @objid ("19c5e67a-f05f-4bcc-84db-f0511b8a934c")
    void setLicenseKey(int value);

    @objid ("887e0d68-d35a-4b5a-a7c9-0a9063357a45")
    int getMajVersion();

    @objid ("a53a3e4d-24d0-48e6-ab0a-75b352d5c4bb")
    void setMajVersion(int value);

    @objid ("b44fe7f3-36f1-44f7-ac48-fb6fb595c76d")
    int getMinVersion();

    @objid ("37109a1c-01d2-4a60-9802-c8f0708df5be")
    void setMinVersion(int value);

    @objid ("cd3b19a4-f8a2-419d-9b9a-b72e37135222")
    String getMinMinVersion();

    @objid ("cc29f1df-309f-4db1-ad3f-b5de63bdfd69")
    void setMinMinVersion(String value);

    @objid ("3c459e40-0737-4f34-827f-e122aa06e4e1")
    String getMinBinVersionCompatibility();

    @objid ("87dd2c82-7f53-4251-ad77-e19003066ad3")
    void setMinBinVersionCompatibility(String value);

    @objid ("622027d8-8975-4223-b699-9f38e561962f")
    String getJavaClassName();

    @objid ("8be1c0e9-40d6-4351-8363-f624a9c059c0")
    void setJavaClassName(String value);

    @objid ("1c7cc118-f52f-40c1-b4ec-de094ac98b8f")
    ModuleState getState();

    @objid ("bcd934ab-6306-4d50-b68f-73ffa233b3e0")
    void setState(ModuleState value);

    @objid ("571f4a08-089e-426d-a594-9b8df754c120")
    EList<PropertyType> getDefinedPropertyType();

    @objid ("1686f39f-d9f1-4e77-8bf9-e99e910b08b9")
    <T extends PropertyType> List<T> getDefinedPropertyType(java.lang.Class<T> filterClass);

    @objid ("e02baa6b-4336-48f1-a44e-15d54a9f748f")
    EList<Profile> getOwnedProfile();

    @objid ("a51692e2-7594-4a79-bdad-1bda2cfe8fc3")
    <T extends Profile> List<T> getOwnedProfile(java.lang.Class<T> filterClass);

    @objid ("f2e94f8d-fce9-4f57-8293-2012306c660b")
    EList<ModuleParameter> getModuleParameter();

    @objid ("713780b3-2a7e-486f-9dac-70c3e36f0b0d")
    <T extends ModuleParameter> List<T> getModuleParameter(java.lang.Class<T> filterClass);

    @objid ("02bb31a4-b156-4c2c-be41-ddfb0bc1fe5e")
    EList<ModuleComponent> getDependsOn();

    @objid ("0520676e-89a3-42b0-abce-74e05a847de0")
    <T extends ModuleComponent> List<T> getDependsOn(java.lang.Class<T> filterClass);

    @objid ("f5bc76e9-d7ba-4d15-9bee-95671be1ef0c")
    EList<ModuleComponent> getImpacted();

    @objid ("8ea28629-69ed-4c9b-9aaa-661c7777debb")
    <T extends ModuleComponent> List<T> getImpacted(java.lang.Class<T> filterClass);

}
