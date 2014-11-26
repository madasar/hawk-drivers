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
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.Normalizer;
import java.util.Collections;
import java.util.List;
import java.util.zip.Adler32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.NullProgress;

/**
 * Service class to compress one or more directories into one .zip file.
 * <p>
 * One instance is configured to produce one unique zip archive.
 * The zip archive is build by calling one
 * of the compress methods. Each time a compress method is called the
 * complete archive contents are replaced.
 */
@objid ("c98a8cd5-a5a3-11e1-aa98-001ec947ccaf")
public class Zipper {
    @objid ("c98a8cd7-a5a3-11e1-aa98-001ec947ccaf")
    private static final int BUFFER = 2048;

    @objid ("c98cef10-a5a3-11e1-aa98-001ec947ccaf")
    private boolean aborted = false;

    @objid ("c98a8cd9-a5a3-11e1-aa98-001ec947ccaf")
    private Path archive = null;

    @objid ("c98cef11-a5a3-11e1-aa98-001ec947ccaf")
     ZipOutputStream out = null;

    /**
     * Construct a Zipper instance.
     * <p>
     * Note that the instance is configured to
     * produce one unique zip archive. The zip archive is build by calling one
     * of the compress methods. Each time a compress method is called the
     * complete archive contents are replaced.
     * @param archive the full pathname of the archive to be produced by this
     * zipper.
     */
    @objid ("c98cef12-a5a3-11e1-aa98-001ec947ccaf")
    public Zipper(final Path archive) {
        this.archive = archive;
    }

    /**
     * Compress the directory content or file given by 'path'.
     * @param path the pathname of the directory or file to compress
     * @param monitor an IModelioProgress object to report compression progression. Can be null.
     * @param title the title displayed for the compression task. Requires a 'monitor' instance. Can be null.
     */
    @objid ("c98cef16-a5a3-11e1-aa98-001ec947ccaf")
    public void compressContent(final Path path, final IModelioProgress monitor, final String title) throws IOException {
        compressContent(Collections.singletonList(path), monitor, title);
    }

    /**
     * Compress the contents of the directories list 'pathes'
     * @throws IOException
     * @param monitor an IModelioProgress object to report compression progression. Can be null.
     * @param pathes a list of directories or files (full pathes)
     * @param title the title displayed for the compression task. Requires a 'monitor' instance. Can be null.
     */
    @objid ("c98cef1c-a5a3-11e1-aa98-001ec947ccaf")
    public void compressContent(final Iterable<Path> pathes, IModelioProgress progressMonitor, final String title) throws IOException {
        IModelioProgress monitor = (progressMonitor != null) ? progressMonitor : new NullProgress();
        int nTotal = countEntries(pathes);
        this.aborted = false;
        
        try (ZipOutputStream zipOutput = openZip(this.archive)) {
        
            monitor.beginTask(null, nTotal);
            monitor.setTaskName((title == null) ? ("Creating  " + this.archive) : title);
            
            for (Path path : pathes) {
                compressContent(path, null, null, null, monitor);
            }
        } finally {
            if (this.aborted) {
                Files.deleteIfExists(this.archive);
            }
        }
    }

    /**
     * Compress the directory or file given by 'path'.
     * @param path the pathname of the directory or file to compress
     * @param monitor an IModelioProgress object to report compression progression. Can be null.
     * @param title the title displayed for the compression task. Requires a 'monitor' instance. Can be null.
     */
    @objid ("c98cef24-a5a3-11e1-aa98-001ec947ccaf")
    public void compress(final Path path, final IModelioProgress monitor, final String title) throws IOException {
        compress(Collections.singletonList(path), null, null, monitor, title);
    }

    @objid ("c98cef2a-a5a3-11e1-aa98-001ec947ccaf")
    public void compress(final Path path, final List<PathMatcher> skipDirectoryMatchers, final List<PathMatcher> skipFileMatchers, final IModelioProgress monitor, final String title) throws IOException {
        compress(Collections.singletonList(path), skipDirectoryMatchers, skipFileMatchers, monitor, title);
    }

    @objid ("c98cef32-a5a3-11e1-aa98-001ec947ccaf")
    private static int countEntries(final Iterable<Path> pathes) throws IOException {
        final int[] ret = new int[] {0};
        
        for (Path path : pathes) {
            FileVisitor<Path> visitor = new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file,
                        BasicFileAttributes attrs) throws IOException {
                    ret[0]++;
                    return super.visitFile(file, attrs);
                }
                
                @Override
                public FileVisitResult preVisitDirectory(Path dir,
                        BasicFileAttributes attrs) throws IOException {
                    ret[0]++;
                    
                    return super.preVisitDirectory(dir, attrs);
                }
                
            };
            
            Files.walkFileTree(path, visitor );
            
            
        }
        return ret [0];
    }

    /**
     * Compress the contents of the directory or file given by 'path'.
     * 
     * The path directory itself will not be part of the compressed file.
     * Only the files and directories that it contains will be compressed.
     * @param title the title displayed for the compression task. Requires a 'monitor' instance. Can be null.
     * @param srcPath the pathname of the directory or file to compress
     * @param intoDir the destination directory inside the zip file.
     * @param skipDirectoryMatchers the list of PathMatchers which used to skip some directories to compress.
     * @param skipFileMatchers the list of PathMatchers which used to skip some files to compress.
     * @param monitor an initialized IProgressMonitor object to report compression progression. .
     */
    @objid ("c98cef39-a5a3-11e1-aa98-001ec947ccaf")
    private void compressContent(final Path srcPath, final String intoDir, final List<PathMatcher> skipDirectoryMatchers, final List<PathMatcher> skipFileMatchers, final IModelioProgress monitor) throws IOException {
        FileVisitor<Path> visitor = new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file,
                    BasicFileAttributes attrs) throws IOException {
                if (monitor.isCanceled()) 
                    return FileVisitResult.TERMINATE;
                if (skipFileMatchers != null && !skipFileMatchers.isEmpty()) {
                    for (PathMatcher skipFileMatcher : skipFileMatchers) {
                        if (skipFileMatcher.matches(file.toAbsolutePath())) {                        
                            return FileVisitResult.SKIP_SIBLINGS;
                        }
                    }
                }
                compressFile(Zipper.this.out, file, monitor);
                monitor.worked(1);
                
                return FileVisitResult.CONTINUE;
            }
            
            @Override
            public FileVisitResult preVisitDirectory(Path dir,
                    BasicFileAttributes attrs) throws IOException {
                if (monitor.isCanceled()) 
                    return FileVisitResult.TERMINATE;
        
                if (skipDirectoryMatchers != null && !skipDirectoryMatchers.isEmpty()) {
                    for (PathMatcher skipDirectoryMatcher : skipDirectoryMatchers) {
                        if (skipDirectoryMatcher.matches(dir.toAbsolutePath())) {                        
                            return FileVisitResult.SKIP_SUBTREE;
                        }
                    }
                }
                return super.preVisitDirectory(dir, attrs);
            }
        
            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc)
                    throws IOException {
                monitor.worked(1);
        
                if (exc==null && monitor.isCanceled()) 
                    return FileVisitResult.TERMINATE;
                
                return super.postVisitDirectory(dir, exc);
            }
            
            protected void compressFile(ZipOutputStream zipOutput, Path f, IModelioProgress mon) throws IOException {
        
                mon.subTask(f.toString());
        
                byte data[] = new byte[BUFFER];
        
                try (InputStream fi = Files.newInputStream(f);
                        BufferedInputStream buffi = new BufferedInputStream(fi, BUFFER)) {
        
                    // Compute file path in the zip archive
                    Path relativePath = srcPath.relativize(f);
                    if (relativePath == null)
                        relativePath = srcPath;
                    
                    String zipPath = relativePath.toString().replace("\\", "/");
                    if (intoDir != null)
                        zipPath = intoDir + "/" + zipPath;
        
                    // Create zip entry
                    ZipEntry entry = new ZipEntry(unAccent(zipPath));
                    entry.setTime(Files.getLastModifiedTime(f).toMillis());
                    zipOutput.putNextEntry(entry);
                    
                    // write file data in the zip stream
                    int count;
                    while ((count = buffi.read(data, 0, BUFFER)) != -1) {
                        zipOutput.write(data, 0, count);
                    }
                    
                    // Close the current entry
                    zipOutput.closeEntry();
                    buffi.close();
        
                }
            }            
        };
        
        Files.walkFileTree(srcPath, visitor );
        
        if (monitor.isCanceled()) 
            this.aborted = true;
    }

    @objid ("c98cef42-a5a3-11e1-aa98-001ec947ccaf")
    protected ZipOutputStream openZip(final Path archivePath) throws IOException {
        OutputStream dest = Files.newOutputStream(archivePath);
        CheckedOutputStream checksum = new CheckedOutputStream(dest, new Adler32());
        BufferedOutputStream buff = new BufferedOutputStream(checksum);
        this.out = new ZipOutputStream(buff);
        this.out.setMethod(ZipOutputStream.DEFLATED);
        this.out.setLevel(Deflater.BEST_COMPRESSION);
        return this.out;
    }

    @objid ("c98cef47-a5a3-11e1-aa98-001ec947ccaf")
    protected static String unAccent(final String s) {
        String temp = Normalizer.normalize(s, Normalizer.Form.NFC);
        return temp.replaceAll("[^\\p{ASCII}]", "");
    }

    @objid ("c98cef4c-a5a3-11e1-aa98-001ec947ccaf")
    public Path getArchive() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.archive;
    }

    @objid ("c98cef50-a5a3-11e1-aa98-001ec947ccaf")
    public boolean isAborted() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.aborted;
    }

    /**
     * Creates a dummy progress monitor.
     * @return a dummy progress monitor.
     */
    @objid ("c98cef54-a5a3-11e1-aa98-001ec947ccaf")
    private static IModelioProgress emptyProgress() {
        return new NullProgress();
    }

    /**
     * Compress the contents of the directories list 'pathes'
     * @throws IOException
     * @param pathes a list of directories or files (full pathes)
     * @param initialMonitor an IModelioProgress object to report compression progression. Can be null.
     * @param title the title displayed for the compression task. Requires a 'monitor' instance. Can be null.
     */
    @objid ("ce7a5c79-78ab-4448-88b4-c7f98eaae65d")
    public void compress(final Iterable<Path> pathes, final List<PathMatcher> skipDirectoryMatchers, final List<PathMatcher> skipFileMatchers, IModelioProgress initialMonitor, final String title) throws IOException {
        int nTotal = countEntries(pathes);
        this.aborted = false;
        
        IModelioProgress monitor = initialMonitor;
        if (monitor == null)
            monitor = emptyProgress();
        
        try (ZipOutputStream zipOutput = openZip(this.archive)) { 
        
            monitor.beginTask(null, nTotal);
            monitor.setTaskName((title == null) ? ("Creating  " + this.archive) : title);
            
            for (Path path : pathes) {
                compressContent(path, path.getFileName().toString(), skipDirectoryMatchers, skipFileMatchers, monitor);
            }
        } finally {
            if (this.aborted) {
                Files.deleteIfExists(this.archive);
            }
        }
    }

}
