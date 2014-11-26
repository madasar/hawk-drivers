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

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.ramc.core.model.ModelComponent;
import org.modelio.gproject.ramc.core.packaging.IModelComponentContributor.ExportedFileEntry;
import org.modelio.vbasic.log.Log;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Used to store and write the contents of the metadata.xml file of a
 * ModelComponent
 * 
 * @author phv
 */
@objid ("aa3687e8-7908-41f1-9c19-eff0d2ab45c3")
class Metadatas {
    @objid ("179828c2-8443-47b3-a284-ba9a3075f7e2")
    private static final String MANIFEST_VERSION = "2.0";

    @objid ("2a5bdb90-833c-4193-aeca-dd4e44dd723d")
    private ModelComponent ramc;

    @objid ("284a82fd-846d-4af0-bed8-c7141323bcc9")
    private Map<String, ExportedFileEntry> files = new TreeMap<>();

    @objid ("63d147eb-f1da-4338-a0a7-4dd686d074a7")
    private List<MRef> roots = new ArrayList<>();

    /**
     * initialize the meta datas.
     * @param ramc the model component representation.
     */
    @objid ("154faeef-56c6-4de9-85db-0e9deb66ef4b")
    public Metadatas(ModelComponent ramc) {
        this.ramc = ramc;
    }

    /**
     * Add files to export
     * @param metafileName the file name in the archive
     * @param fileEntry the entry telling where the file must be deployed.
     */
    @objid ("4e57c868-9fca-491d-8f77-95fdd210f821")
    public void addExportedFileDef(String metafileName, ExportedFileEntry fileEntry) {
        this.files.put(metafileName, fileEntry);
    }

    /**
     * @param root a model element to include
     */
    @objid ("92e4ce92-4d49-4975-be1b-d04b09e09640")
    public void addRoot(MRef root) {
        this.roots.add(root);
    }

    /**
     * Write the RAMC metadata file in the given directory.
     * @param exportPath the directory where to write the metadatas.xml file.
     * @throws java.io.IOException in case of I/O error
     */
    @objid ("9ffcedf6-e353-4f69-a321-1d35164be6e2")
    public void write(Path exportPath) throws IOException {
        Path metadataFile = exportPath.resolve("metadatas.xml");
        
        try (BufferedWriter metadataWriter = Files.newBufferedWriter(metadataFile, StandardCharsets.UTF_8)) {
        
            // Header
            writeMetadataHeader(metadataWriter);
        
            // Dependencies
            writeMetadataDependencies(metadataWriter);
        
            // Contributors
            writeMetadataContributors(metadataWriter);
        
            // Roots
            writeMetadataRoots(metadataWriter);
        
            // Exported files
            for (Entry<String, ExportedFileEntry> entry : this.files.entrySet()) {
                writeFileEntry(metadataWriter, entry.getKey(), entry.getValue());
            }
        
            // Footer
            writeMetadataFooter(metadataWriter);
        
        }
    }

    @objid ("040987c6-86f8-4d11-adae-d4c39044ee6e")
    private void writeMetadataHeader(BufferedWriter buffer) throws IOException {
        Version ramcVersion = this.ramc.getVersion();
        String ramcDescription = this.ramc.getDescription();
        
        buffer.append("<?xml version=\"1.0\" encoding=\"" + StandardCharsets.UTF_8.name() + "\"?>\n");
        
        buffer.append("<ram-component manifest-version=\"" + MANIFEST_VERSION + "\"\n");
        buffer.append("               name=\"" + this.ramc.getName() +
                "\" version=\"" + ramcVersion.getMajorVersion() +
                "\" release=\"" + ramcVersion.getMinorVersion() + 
                "\" clevel=\"" + ramcVersion.getBuildVersion() + 
                "\" metamodel=\"" + ramcVersion.getMetamodelVersion() +
                "\">\n");
        
        buffer.append("    <description>\n");
        buffer.append("        <![CDATA[" + ramcDescription + "]" + "]>\n");
        buffer.append("    </description>\n");
    }

    @objid ("ca05c9d7-b482-4192-b8ea-a4d1ff268d24")
    private void writeMetadataDependencies(BufferedWriter metadata) throws IOException {
        metadata.append("    <dependencies>\n");
        
        for (ModelComponent parentRamc : this.ramc.getRequiredModelComponents()) {
            Version parentVersion = parentRamc.getVersion();
            String parentVersionStr = parentVersion.getMajorVersion() + "." + parentVersion.getMinorVersion() + "." + parentVersion.getBuildVersion();
        
            metadata.append("      <dependency name=\"" + parentRamc.getName() + "\" version=\"" + parentVersionStr + "\" id=\"" + parentRamc.getArtifact().getUuid() + "\"></dependency>\n");
        }
        metadata.append("    </dependencies>\n");
    }

    @objid ("efdf919e-bb59-4572-b00a-10e0a4df854f")
    private void writeMetadataContributors(BufferedWriter metadata) throws IOException {
        metadata.append("    <contributors>\n");
        
        for (Entry<String, String> entry : this.ramc.getContributingModules().entrySet()) {
            metadata.append("      <contributor name=\"" + entry.getKey() + "\" version=\"" + entry.getValue() + "\"></contributor>\n");
        }
        metadata.append("    </contributors>\n");
    }

    @objid ("888e2e36-9c6f-4b99-8a39-d754444ca14e")
    private void writeMetadataRoots(BufferedWriter metadata) throws IOException {
        metadata.append("    <roots>\n");
        
        for (MRef mref : this.roots) {
            metadata.append("      <root metaclass=\"" + mref.mc + "\" name=\"" + mref.name + "\" uuid=\"" + mref.uuid
                    + "\"></root>\n");
        }
        metadata.append("    </roots>\n");
    }

    @objid ("522d7894-b36b-4df4-8131-065ca8ab28ee")
    private void writeFileEntry(BufferedWriter metadata, String metafileName, ExportedFileEntry fileEntry) throws IOException {
        Path file = Paths.get(fileEntry.getExportedFile());
        if (Files.isRegularFile(file)) {
            metadata.append("    <file archive-name=\"");
            metadata.append(metafileName);
            metadata.append("\" destination-path=\"");
            metadata.append(fileEntry.getExportPath());
            metadata.append("\" mtime=\"");
            metadata.append(String.valueOf(Files.getLastModifiedTime(file).to(TimeUnit.SECONDS)));
            metadata.append("\"/>\n");
        } else {
            Log.warning(getClass().getName()+" - Invalid file path: " + file.toString());
        }
    }

    @objid ("6cbd0cee-1d87-4510-8561-138cd20b9177")
    private static void writeMetadataFooter(BufferedWriter metadataWriter) throws IOException {
        metadataWriter.append("</ram-component>");
    }

    @objid ("aa085837-52e2-4ad0-ad5c-39b0a4ae6426")
    List<MRef> getRoots() {
        return this.roots;
    }

}
