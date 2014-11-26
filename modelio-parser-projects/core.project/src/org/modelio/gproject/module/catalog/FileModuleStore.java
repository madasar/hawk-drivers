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
                                    

package org.modelio.gproject.module.catalog;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.module.IModuleCatalog;
import org.modelio.gproject.module.IModuleHandle;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.files.Unzipper;
import org.modelio.vbasic.log.Log;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;

/**
 * Modules storage structure based on directories and files typically used to cache or to catalog module data, and avoid extracting/reading them over and over.
 * <p>
 * Needs a writable directory to store unzipped .jmdacs into.
 * <p>
 * For now, modules are stored in the cache as a directory $(jmdac name)/$(jmdac hashcode).
 */
@objid ("2c95c248-f37d-11e1-a3c7-002564c97630")
public class FileModuleStore implements IModuleCatalog {
    @objid ("43401e6b-f9b3-4f86-82ad-6cbd93bcc0b7")
    private static final int VERSION = 3;

    /**
     * This value is the max search depth (starting to cachePath) to search for the module .jmdac files in the store.
     * It depends on the store file structure. Current structure is : cachepath/hashcode/modulename/module_v.r.c.jmdac
     */
    @objid ("f7bc3fc0-965b-4c9a-ab3d-2ec1d19791cb")
    private static final int SEARCH_DEPTH = 3;

    @objid ("07d71b3e-32d3-4699-ae97-e703148fdb20")
    private Path cachePath;

    /**
     * Instantiate a new FileModuleCatalog.
     * @param cachePath the path to store unzipped .jmdacs into. Needs to be writable directory.
     */
    @objid ("2c95c24a-f37d-11e1-a3c7-002564c97630")
    public FileModuleStore(Path cachePath) {
        this.cachePath = cachePath;
        migration();
    }

    @objid ("d9530931-37da-11e2-8ba4-002564c97630")
    @Override
    public IModuleHandle findModule(String moduleName, String moduleVersion, IModelioProgress monitor) throws IOException {
        String archiveName;
        if (moduleVersion == null || moduleVersion.isEmpty()) {
            //archiveName = moduleName + "_[0-9]+\\.[0-9]+\\.[0-9]+\\.jmdac";
            archiveName = moduleName + "_.*\\.jmdac";
        } else {
            archiveName = moduleName + "_" + moduleVersion + "\\.jmdac";
        }
        
        ModuleFileSearcher visitor = new ModuleFileSearcher(archiveName);
        
        Files.walkFileTree(this.cachePath, EnumSet.of(FileVisitOption.FOLLOW_LINKS), SEARCH_DEPTH, visitor);
        
        if (visitor.foundFiles.isEmpty()) {
            return null;
        }
        
        // Return the first found file
        return getModuleHandle(visitor.foundFiles.iterator().next(), monitor);
    }

    @objid ("396e27e9-389c-11e2-aba0-002564c97630")
    @Override
    public List<IModuleHandle> findAllModules(IModelioProgress monitor) throws IOException {
        List<IModuleHandle> ret = new ArrayList<>();
        
        String archiveName = "[a-zA-Z0-9 _]+_[0-9]+\\.[0-9]+\\.[0-9]+\\.jmdac";
        
        ModuleFileSearcher visitor = new ModuleFileSearcher(archiveName);
        Files.walkFileTree(this.cachePath, EnumSet.of(FileVisitOption.FOLLOW_LINKS), SEARCH_DEPTH, visitor);
        
        for (Path moduleFile : visitor.foundFiles) {
            ret.add(getModuleHandle(moduleFile, monitor));
        }
        return ret;
    }

    /**
     * Instantiate a new ModuleHandle from a .jmdac archive file.
     */
    @objid ("2c95c24d-f37d-11e1-a3c7-002564c97630")
    @Override
    public FileCatalogModuleHandle getModuleHandle(Path jmdacPath, IModelioProgress monitor) throws IOException {
        // Check if the jmdac is valid
        if (Files.notExists(jmdacPath)) {
            return null;
        }
        
        SubProgress m = SubProgress.convert(monitor, 100);
        
        // Resolve module cache for this .jmdac
        Path moduleCachePath = computeModuleCachePath(jmdacPath);
        
        if (Files.notExists(moduleCachePath)) {
            // Unzip module
            new Unzipper().unzip(jmdacPath, moduleCachePath, m.newChild(60));
        } else {
            m.setWorkRemaining(40);
        }
        
        // Create the ModuleHandle
        FileCatalogModuleHandle moduleHandle = createModuleHandle(moduleCachePath, m.newChild(40));
        
        if (moduleHandle != null) {
            // Copy jmdac archive into the cache
            Path archivePath = moduleHandle.getArchive();
            if (Files.notExists(archivePath)) {
                Files.copy(jmdacPath, archivePath, StandardCopyOption.COPY_ATTRIBUTES);
            }
        
            // Return the module handle
            return moduleHandle;
        }
        return null;
    }

    /**
     * Returns a zip file system
     * @param zipPath to construct the file system from
     * @param create true if the zip file should be created
     * @return a zip file system
     * @throws java.io.IOException in case of failure
     */
    @objid ("2c95c259-f37d-11e1-a3c7-002564c97630")
    private static FileSystem createZipFileSystem(Path zipPath, boolean create) throws IOException {
        // convert the filename to a URI
        final URI uri = URI.create("jar:file:" + zipPath.toUri().getPath());
        
        final Map<String, String> env = new HashMap<>();
        if (create) {
            env.put("create", "true");
        }
        return FileSystems.newFileSystem(uri, env);
    }

    /**
     * Compute a checksum for a jmdac file.
     * @param jmdacPath the jmdac to check.
     * @return a SHA1 checksum.
     * @throws java.io.IOException when the path can't be read or the SHA1 algorithm is not available on the system.
     */
    @objid ("2c9748e5-f37d-11e1-a3c7-002564c97630")
    private static String computeHash(Path jmdacPath) throws IOException {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA1");
        
            try (InputStream fis = Files.newInputStream(jmdacPath)) {
                byte[] dataBytes = new byte[2048];
        
                int nread = 0;
                while ((nread = fis.read(dataBytes)) != -1) {
                    md.update(dataBytes, 0, nread);
                }
        
                fis.close();
            }
        
            byte[] mdbytes = md.digest();
        
            // convert the byte to hex format
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mdbytes.length; i++) {
                sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new IOException(e.getLocalizedMessage(), e);
        }
    }

    @objid ("d951829b-37da-11e2-8ba4-002564c97630")
    private static FileCatalogModuleHandle createModuleHandle(Path moduleCachePath, IModelioProgress m) throws IOException {
        FileCatalogModuleHandle moduleHandle = null;
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(moduleCachePath)) {
            for (Path subFile : ds) {
                if (Files.isDirectory(subFile)) {
                    moduleHandle = FileCatalogModuleHandleBuilder.readModule(subFile, m);
                    break;
                }
            }
        }
        return moduleHandle;
    }

    @objid ("0f1b8454-7f0e-4940-a319-10462765b93e")
    @Override
    public void removeModule(IModuleHandle mh) throws IOException, FileSystemException {
        Path path = ((FileCatalogModuleHandle) mh).getModuleCachePath();      
        Path path1 = path.getParent();    
        FileUtils.delete(path1);
    }

    /**
     * Copy the module handle datas into the given catalog directory and return a module
     * handle using a sub directory of the given catalog directory.
     * <p>
     * Does nothing if the module has already been copied once in the destination catalog.
     * @param handle the module handle to copy.
     * @param destStore the catalog directory where datas should be copied.
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @return a module handle using a sub directory of the new directory.
     * @throws java.io.IOException in case of other failure
     * @throws java.nio.file.FileSystemException in case of file system error.
     * Use {@link FileUtils#getLocalizedMessage(FileSystemException)} to get a human readable message.
     */
    @objid ("fa8db662-f0be-42a5-a279-b4a7a94d1868")
    public IModuleHandle copy(IModuleHandle handle, FileModuleStore destStore, IModelioProgress monitor) throws IOException, FileSystemException {
        FileCatalogModuleHandle h = (FileCatalogModuleHandle) handle;
        Path dir = h.getModuleCachePath();
        Path dirParent = dir.getParent(); // the directory with hashcode as name
        
        Path destModuleDir = destStore.cachePath.resolve(dirParent.getFileName());
        if (! Files.isDirectory(destModuleDir)) {
            Files.createDirectories(destModuleDir);
            FileUtils.copyDirectoryTo(dirParent, destModuleDir);
        }
        return createModuleHandle(destModuleDir, monitor);
    }

    /**
     * Tells whether the given .jmdac file is already contained in this catalog.
     * @param jmdacPath a jmdac archive
     * @return <code>true</code> only if the module is already contained in this catalog.
     * @throws java.io.IOException in case of I/O error.
     */
    @objid ("4b2cc34d-44ff-4aea-8024-c025643c7a95")
    public boolean contains(Path jmdacPath) throws IOException {
        Path moduleCachePath = computeModuleCachePath(jmdacPath);
        return (Files.isDirectory(moduleCachePath));
    }

    @objid ("8959ab49-b9aa-4726-aa45-3ca2d4c70161")
    private void migration() {
        if (! Files.isDirectory(this.cachePath)) 
            return;
        
        Path confFile = this.cachePath.resolve("version.dat");
        int version = 0;
        Properties props = new Properties();
        
        // Read catalog version
        try (InputStream is = Files.newInputStream(confFile)) {
            props.load(is);
            version = Integer.valueOf(props.getProperty("version", "0"));
        } catch (NoSuchFileException e) {
            // ignore
        } catch (IOException e) {
            // log and abort
            Log.warning(e);
            return;
        }
        
        if (version < VERSION) {
            try {
                Log.trace("'"+this.cachePath+"' module catalog version is "+version+" instead of "+VERSION+", cleaning the catalog...");
        
                // Workaround for windows: we have to move the old cache to a temporary directory before deleting it, in order
                // to avoid an AccessDeniedException when creating the new directory... 
                Path tmpDir = this.cachePath.resolveSibling("tmp");
                Files.move(this.cachePath, tmpDir);
                FileUtils.delete(tmpDir);
                
                // Create the catalog directory again
                Files.createDirectories(this.cachePath);
        
                // Write the version
                props.setProperty("version", String.valueOf(VERSION));
        
                try (OutputStream out = Files.newOutputStream(confFile)) {
                    props.store(out, "Module catalog");
                }
                Log.trace("'"+this.cachePath+"' module catalog cleaning done");
        
            } catch (FileSystemException e) {
                Log.warning("Cannot migrate '"+this.cachePath+"' module catalog from "+version+" to "+VERSION);
                Log.warning(FileUtils.getLocalizedMessage(e));
                Log.warning(e);
            } catch (IOException e) {
                Log.warning("Cannot migrate '"+this.cachePath+"' module catalog from "+version+" to "+VERSION);
                Log.warning(e);
            }
        }
    }

    @objid ("0011d30d-e6a1-441a-9288-eb0a3a29533e")
    private Path computeModuleCachePath(Path jmdacPath) throws IOException {
        //String jmdacName = jmdacPath.getFileName().toString().replace(".jmdac", "");
        String hashKey = computeHash(jmdacPath);
        Path moduleCachePath = this.cachePath.resolve(hashKey);
        return moduleCachePath;
    }

    /**
     * Find all modules with the given name.
     * @param moduleName the module name
     * @return all modules with the same name.
     * @throws java.io.IOException in case of I/O error
     */
    @objid ("c7dd0d2f-f369-4af9-982f-c70c10aec92d")
    public List<IModuleHandle> findModule(String moduleName) throws IOException {
        List<IModuleHandle> ret = new ArrayList<>();
         
         String archiveName = moduleName + "_.*\\.jmdac";
         
         ModuleFileSearcher visitor = new ModuleFileSearcher(archiveName);
         Files.walkFileTree(this.cachePath, EnumSet.of(FileVisitOption.FOLLOW_LINKS), SEARCH_DEPTH, visitor);
         
         for (Path moduleFile : visitor.foundFiles) {
             ret.add(getModuleHandle(moduleFile, null));
         }
        return ret;
    }

    @objid ("f29bb236-3733-419b-94c5-5cd4ce1bd8ad")
    public Path getCachePath() {
        return cachePath;
    }

    @objid ("abb2d5ba-d5a1-4c0f-b1fa-16a6ec48cb29")
    public void setCachePath(Path cachePath) {
        this.cachePath = cachePath;
    }

    @objid ("d9530939-37da-11e2-8ba4-002564c97630")
    private static class ModuleFileSearcher implements FileVisitor<Path> {
        @objid ("e529f1de-3898-11e2-aba0-002564c97630")
        private final String searchedFileName;

        @objid ("b9859d03-9c57-4ab9-a96f-b979e33ba88e")
        public final Set<Path> foundFiles;

        @objid ("d9548fd4-37da-11e2-8ba4-002564c97630")
        public ModuleFileSearcher(String searchedFile) {
            this.searchedFileName = searchedFile;
            this.foundFiles = new TreeSet<>(new ModuleArchiveComparator());
        }

        @objid ("d9548fdc-37da-11e2-8ba4-002564c97630")
        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            return FileVisitResult.CONTINUE;
        }

        @objid ("d9548fe3-37da-11e2-8ba4-002564c97630")
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            return FileVisitResult.CONTINUE;
        }

        @objid ("d9548fea-37da-11e2-8ba4-002564c97630")
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            String fileName = file.getName(file.getNameCount() - 1).toString();
            if (fileName.endsWith(".jmdac")) {
                if (fileName.matches(this.searchedFileName)) {
                    this.foundFiles.add(file);
                }
            }
            return FileVisitResult.CONTINUE;
        }

        @objid ("d9548ff0-37da-11e2-8ba4-002564c97630")
        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            return FileVisitResult.CONTINUE;
        }

        /**
         * Sorts paths in a reverse order.
         */
        @objid ("e4ba116a-3898-11e2-aba0-002564c97630")
        private static class ModuleArchiveComparator implements Comparator<Path> {
            @objid ("e4ba116c-3898-11e2-aba0-002564c97630")
            @Override
            public int compare(Path o1, Path o2) {
                // Compare the string form of those paths
                //NOTE: comparing archive filenames must ensure higher to lower version ordering for the findModule("m", null, ...) to work fine
                return o2.getFileName().toString().compareTo(o1.getFileName().toString());
            }

            @objid ("46af9948-389a-11e2-aba0-002564c97630")
            public ModuleArchiveComparator() {
                // Nothing to init
            }

        }

    }

}
