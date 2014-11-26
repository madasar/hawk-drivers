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
                                    

package org.modelio.vbasic.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;

@objid ("0006e5d2-b816-1ffa-8e11-001ec947cd2a")
public class Unzipper {
    @objid ("00590c36-b821-1ffa-8e11-001ec947cd2a")
    public void unzip(final Path archive, final Path folder, IModelioProgress monitor) throws IOException {
        int entriesNumber = this.countEntries(archive);
        SubProgress subMonitor = SubProgress.convert(monitor, entriesNumber);
        
        try (ZipInputStream zis = new ZipInputStream(new BufferedInputStream(new FileInputStream(archive.toFile())))) {
            ZipEntry ze = null;
            while ((ze = zis.getNextEntry()) != null) {
                final File f = new File(folder.toFile(), ze.getName());
        
                if (f.exists())
                    f.delete();
        
                // directory
                if (ze.isDirectory()) {
                    f.mkdirs();
                    continue;
                } else {
                    // subMonitor.subTask("Unzipper.subTask", archiveName,
                    // String.valueOf(cpt), String.valueOf(entriesNumber)));
                    f.getParentFile().mkdirs();
                    extractFile(zis, f);
                    subMonitor.worked(1);
                }
                f.setLastModified(ze.getTime());
            }
        }
    }

    @objid ("0059db34-b821-1ffa-8e11-001ec947cd2a")
    public void unzip(final File archive, final String entry, final File folder, IModelioProgress monitor) throws IOException {
        SubProgress subMonitor = SubProgress.convert(monitor, 1);
        
        try (ZipFile zipFile = new ZipFile(archive.getCanonicalFile())) {
        
            ZipEntry ze = zipFile.getEntry(entry);
        
            // String archiveName = archive.getAbsolutePath();
            int cpt = 0;
        
            if (ze != null) {
                final File f = new File(folder, ze.getName());
        
                if (f.exists())
                    f.delete();
        
                // directory
                if (ze.isDirectory()) {
                    f.mkdirs();
                } else {
                    // subMonitor.subTask(RC.getMessage("Unzipper.subTask",
                    // archiveName, String.valueOf(cpt), String.valueOf(1)));
                    f.getParentFile().mkdirs();
                    try (InputStream zis = zipFile.getInputStream(ze)) {
                        extractFile(zis, f);
                        zis.close();
                    }
                    subMonitor.worked(1);
                }
                f.setLastModified(ze.getTime());
            }
        }
    }

    /**
     * Read file contents from the Zip and write the file
     */
    @objid ("00587988-b821-1ffa-8e11-001ec947cd2a")
    private void extractFile(InputStream zis, File file) throws IOException {
        final OutputStream fos = new BufferedOutputStream(new FileOutputStream(file));
        try {
            try {
                final byte[] buf = new byte[8192];
                int bytesRead;
                while ((bytesRead = zis.read(buf)) != -1)
                    fos.write(buf, 0, bytesRead);
            } finally {
                fos.close();
            }
        } catch (final IOException e) {
            file.delete();
            throw e;
        }
    }

    @objid ("0058e62a-b821-1ffa-8e11-001ec947cd2a")
    private int countEntries(Path archive) throws IOException {
        int count = 0;
        try (ZipInputStream zis = new ZipInputStream(new BufferedInputStream(new FileInputStream(archive.toFile())))) {
        
            while (zis.getNextEntry() != null) {
                count++;
            }
            zis.close();
        }
        return count;
    }

    @objid ("0059a268-b821-1ffa-8e11-001ec947cd2a")
    public ZipEntry[] findEntry(File archive, String regexp) throws IOException {
        List<ZipEntry> entries = new ArrayList<>();
        
        try (ZipInputStream zis = new ZipInputStream(new BufferedInputStream(new FileInputStream(archive.getCanonicalFile())))) {
            ZipEntry ze = null;
        
            Pattern p = Pattern.compile((regexp != null) ? regexp : ".*", Pattern.CASE_INSENSITIVE);
            while ((ze = zis.getNextEntry()) != null) {
                if (p.matcher(ze.getName()).matches())
                    entries.add(ze);
            }
        
        }
        return entries.toArray(new ZipEntry[entries.size()]);
    }

    @objid ("005a1ee6-b821-1ffa-8e11-001ec947cd2a")
    private InputStream getEntryStream(final File archive, final String entry) throws IOException {
        InputStream zis = null;
        try (ZipFile zipFile = new ZipFile(archive.getCanonicalFile())) {
            ZipEntry ze = zipFile.getEntry(entry);
            if (ze != null) {
                // directory
                if (!ze.isDirectory()) {
                    zis = zipFile.getInputStream(ze);
                }
            }
        }
        return zis;
    }

}
