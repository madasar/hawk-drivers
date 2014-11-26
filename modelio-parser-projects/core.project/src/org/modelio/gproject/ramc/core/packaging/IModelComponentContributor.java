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
                                    

package org.modelio.gproject.ramc.core.packaging;

import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("4296eaae-a37b-428e-a5ec-2a23e85b63f1")
public interface IModelComponentContributor {
    @objid ("36983300-24f6-4734-b644-c6cdd12b9502")
    Set<MObject> getElements();

    @objid ("d2a62245-94ac-42f7-a4b9-2815e89ca86e")
    Set<NoteType> getNoteTypes();

    @objid ("241a9fbe-ec1f-4a64-ac9f-1f82ff4e5200")
    Set<TagType> getTagTypes();

    @objid ("e18c47fe-c354-4428-8345-56fd71e5c1c0")
    Set<Stereotype> getDependencyStereotypes();

    @objid ("d0329c46-7491-43ff-a949-8c628520f859")
    Set<ExportedFileEntry> getFiles();

    @objid ("8b102bf7-bb62-4faa-a047-e44f0d0c134a")
    public static class ExportedFileEntry implements Comparable<ExportedFileEntry> {
        @objid ("10ea84ab-79cd-44b5-a86c-75a0505cb935")
        private String exportedFile;

        @objid ("31729165-c3aa-4d0a-9f1d-86642d9bb51f")
        private String exportPath;

        @objid ("3f9b2cc9-76db-4a70-922d-b6494ff3bfaa")
        public ExportedFileEntry(String exportedFile, String exportPath) {
            this.exportedFile = (exportedFile != null) ? exportedFile : "";
            this.exportPath = (exportPath != null) ? exportPath : "";
        }

        @objid ("c3b09bdd-9174-435f-b86b-b352e99b8485")
        public String getExportedFile() {
            return this.exportedFile;
        }

        @objid ("a3d987a5-638f-4ea6-b99c-08206697bada")
        public String getExportPath() {
            return this.exportPath;
        }

        @objid ("210b2cc9-c434-4139-acc6-e4c59cad155e")
        @Override
        public int compareTo(ExportedFileEntry e) {
            int ret = this.exportedFile.compareTo(e.exportedFile);
            return (ret != 0) ? ret : this.exportPath.compareTo(e.exportPath);
        }

        @objid ("54f5401f-9e9e-4734-a1bb-8c66d78f87d2")
        public Object setExportPath(String exportPath) {
            return this.exportPath = exportPath;
        }

        @objid ("6f5bfff6-1f67-4fa9-949e-8ddf64c2216d")
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((this.exportPath == null) ? 0 : this.exportPath.hashCode());
            result = prime * result + ((this.exportedFile == null) ? 0 : this.exportedFile.hashCode());
            return result;
        }

        @objid ("d7c23751-a90f-4a14-a686-bf076803744d")
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            ExportedFileEntry other = (ExportedFileEntry) obj;
            if (this.exportPath == null) {
                if (other.exportPath != null)
                    return false;
            } else if (!this.exportPath.equals(other.exportPath))
                return false;
            if (this.exportedFile == null) {
                if (other.exportedFile != null)
                    return false;
            } else if (!this.exportedFile.equals(other.exportedFile))
                return false;
            return true;
        }

    }

}
