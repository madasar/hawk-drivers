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
                                    

package org.modelio.gproject.data.ramc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.version.Version;

@objid ("f124f692-cc2f-11e1-87f1-001ec947ccaf")
class ModelComponentInfos implements IModelComponentInfos {
    @objid ("74507b64-cc3e-11e1-87f1-001ec947ccaf")
    private String name;

    @objid ("74507b6a-cc3e-11e1-87f1-001ec947ccaf")
    private String description;

    @objid ("7d0386ee-d27d-11e1-a594-001ec947ccaf")
    private Version version;

    @objid ("1390da3e-45ab-45f8-9bad-8e04be18026c")
    private List<VersionedItem> requiredModelComponents = new ArrayList<>();

    @objid ("6e227dee-9133-468e-bfe6-7858ba5c17b5")
    private List<VersionedItem> contributingModule = new ArrayList<>();

    @objid ("887ff53e-518a-45f4-89ce-df3dab16eb60")
    private List<ExportedFile> exportedFiles = new ArrayList<>();

    @objid ("b047d08f-2dc9-4298-a430-260285c24ab3")
    private List<ModelRef> roots = new ArrayList<>();

    @objid ("a01c03b2-cc36-11e1-87f1-001ec947ccaf")
    @Override
    public String getName() {
        return this.name;
    }

    @objid ("a01e6602-cc36-11e1-87f1-001ec947ccaf")
    @Override
    public String getDescription() {
        return this.description;
    }

    @objid ("a01e65fc-cc36-11e1-87f1-001ec947ccaf")
    @Override
    public Version getVersion() {
        return this.version;
    }

    @objid ("1a37df4b-7b85-4157-8830-56b94933e25f")
    @Override
    public List<VersionedItem> getRequiredModelComponents() {
        return Collections.unmodifiableList(this.requiredModelComponents);
    }

    @objid ("a122b70d-242a-4ab1-915c-8d9365a80579")
    @Override
    public List<VersionedItem> getContributingModules() {
        return Collections.unmodifiableList(this.contributingModule);
    }

    @objid ("8f227e6f-8cd0-4eba-b242-b01aa816eef2")
    @Override
    public List<ExportedFile> getExportedFiles() {
        return Collections.unmodifiableList(this.exportedFiles);
    }

    @objid ("a01c03ad-cc36-11e1-87f1-001ec947ccaf")
    ModelComponentInfos() {
    }

    @objid ("a01c03af-cc36-11e1-87f1-001ec947ccaf")
    void setName(String name) {
        this.name = name;
    }

    @objid ("a01e6606-cc36-11e1-87f1-001ec947ccaf")
    void setDescription(String description) {
        this.description = description;
    }

    @objid ("a01c03b6-cc36-11e1-87f1-001ec947ccaf")
    void setVersion(Version version) {
        this.version = version;
    }

    @objid ("a01e6609-cc36-11e1-87f1-001ec947ccaf")
    void addDependency(VersionedItem dep) {
        this.requiredModelComponents.add(dep);
    }

    @objid ("740b5796-cc3e-11e1-87f1-001ec947ccaf")
    void addModule(VersionedItem module) {
        this.contributingModule.add(module);
    }

    @objid ("740b57a5-cc3e-11e1-87f1-001ec947ccaf")
    void addFile(ExportedFile f) {
        this.exportedFiles.add(f);
    }

    @objid ("fe7648ed-53c6-4d0c-b390-bb7df17cb36c")
    void addRoot(ModelRef mref) {
        this.roots.add(mref);
    }

    @objid ("9d139939-c9e9-49b9-a953-d0c34706b61b")
    @Override
    public List<ModelRef> getRoots() {
        return this.roots;
    }

}
