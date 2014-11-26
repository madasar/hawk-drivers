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
                                    

package org.modelio.gproject.fragment;

import java.io.IOException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.data.project.VersionDescriptor;
import org.modelio.gproject.data.project.VersionDescriptors;
import org.modelio.gproject.plugin.CoreProject;
import org.modelio.vbasic.files.FileUtils;

/**
 * Indicates that a fragment needs to be migrated because the metamodel is outdated.
 * <p>
 * Throw when {@link IProjectFragment#mount(org.modelio.gproject.gproject.GProject, org.modelio.vbasic.progress.IModelioProgress) mounting} fragment and set as {@link IProjectFragment#getDownError() fragment down cause}.
 */
@objid ("f33dc38b-c7d4-421a-98b5-0d4c4d4849f1")
public class FragmentMigrationNeededException extends Exception {
    @objid ("5715f25b-2201-4fef-985f-ab8ca2a925db")
    private String fragmentId;

    @objid ("056119ed-b724-4f34-91c7-7759a4d10f3e")
    private static final long serialVersionUID = 1L;

    @objid ("97cef184-03b6-4141-bc62-4c51fde68436")
    private VersionDescriptors fragmentVersion;

    @objid ("1885cd02-c4d4-4cae-8330-1c22f99e2ae2")
    private VersionDescriptors targetVersion;

    /**
     * @param fragment the fragment that needs migration.
     * @param targetVersion the needed metamodel version
     */
    @objid ("e757dced-f50b-4622-9110-a78f3ceccb73")
    public FragmentMigrationNeededException(IProjectFragment fragment, VersionDescriptors targetVersion) {
        super();
        
        init(fragment, targetVersion);
    }

    /**
     * @param fragment the fragment that needs migration.
     * @param targetVersion the needed metamodel version
     * @param detail additional details about the needed migration.
     */
    @objid ("5b35eb86-1a46-42be-a2a2-de90ced5e036")
    public FragmentMigrationNeededException(IProjectFragment fragment, VersionDescriptors targetVersion, String detail) {
        super(detail);
        init(fragment, targetVersion);
    }

    @objid ("c1db3301-480e-4fd9-ab7f-7a4dfb5e2acb")
    private void init(IProjectFragment fragment, VersionDescriptors targetVersion) {
        this.targetVersion = targetVersion;
        this.fragmentId = fragment.getId();
        try {
            this.fragmentVersion = fragment.getMetamodelVersion();
        } catch (IOException e) {
            VersionDescriptor d = new VersionDescriptor();
            d.setName(FileUtils.getLocalizedMessage(e));
            d.setVersion(0);
            
            this.fragmentVersion = new VersionDescriptors(d);
        }
    }

    /**
     * Get the additional details about the migration.
     * <p>
     * Return <i>null</i> if there is no detail.
     * @return the additional details about the migration or <i>null</i>.
     */
    @objid ("c79560e3-34b2-4f6e-9fec-75d772e95f48")
    public String getDetails() {
        return super.getMessage();
    }

    /**
     * Get the identifier of the fragment to migrate.
     * @return the fragment identifier.
     */
    @objid ("8b32a0cd-360e-47fa-8cd7-a8615d2e8108")
    public String getFragmentId() {
        return this.fragmentId;
    }

    /**
     * Get the metamodel version of the fragment to migrate.
     * @return the fragment metamodel version.
     */
    @objid ("82f680f3-5d9c-4a85-9b82-70c5167a6b61")
    public VersionDescriptors getFragmentVersion() {
        return this.fragmentVersion;
    }

    @objid ("3ec883d1-b426-43bc-b192-ff740ca50acd")
    @Override
    public String getMessage() {
        return getSummary();
    }

    /**
     * Get the metamodel version the fragment must be migrated to.
     * @return the target metamodel version.
     */
    @objid ("8022e424-f360-4941-908f-955b80da8bb4")
    public VersionDescriptors getTargetVersion() {
        return this.targetVersion;
    }

    /**
     * Get the summary message.
     * @return the summary message.
     */
    @objid ("3fcf35f9-f568-43c0-a277-923a1739849d")
    public String getSummary() {
        return CoreProject.getMessage("FragmentMigrationNeededException.summary",
                this.fragmentId,
                this.fragmentVersion,
                this.targetVersion);
    }

}
