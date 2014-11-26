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

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.plugin.CoreProject;
import org.modelio.gproject.ramc.core.packaging.IModelComponentContributor.ExportedFileEntry;
import org.modelio.vbasic.log.Log;
import org.modelio.vbasic.progress.SubProgress;

@objid ("ae8240c1-608b-44f5-a471-920e2e982dfe")
class FilesExporter {
    @objid ("3b012391-28d9-4607-9374-b067b5f08b91")
    private Path exportPath;

    @objid ("e18a5475-3b21-4cab-9233-81cffb04addb")
    public FilesExporter(Path exportPath) {
        this.exportPath = exportPath;
    }

    @objid ("8f1ef777-c37c-4d27-911d-f9b4b801b080")
    public void run(List<ExportedFileEntry> filesToExport, Metadatas metadatas, SubProgress subMonitor) throws IOException {
        subMonitor.subTask(CoreProject.I18N.getString("RamcPackager.ExportFiles"));
        
        // Copy exported files in the export area
        
        int idx = 0;
        for (ExportedFileEntry fileEntry : filesToExport) {
            String metaName = "File" + idx;
            copyFile(fileEntry, metaName);
            metadatas.addExportedFileDef(metaName, fileEntry);
            idx++;
        }
    }

    @objid ("a14ef114-16d2-4cbe-afa8-cf133ec7ce1b")
    private void copyFile(ExportedFileEntry fileEntry, String metaName) throws IOException {
        Path file = Paths.get(fileEntry.getExportedFile());
        if (Files.isRegularFile(file)) {
            Files.copy(file, this.exportPath.resolve(metaName));
        } else {
            Log.warning("RamcPackager - Invalid file path: " + file.toString());
        }
    }

}
