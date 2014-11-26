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
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.MessageFormat;
import java.util.Scanner;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.plugin.CoreUtils;

/**
 * This class consists exclusively of static methods that operate on files,
 * directories, or other types of files.
 * <p>
 * This class uses {@link java.nio.file.Files} that give better diagnostics on
 * failure than {@link java.io.File}.
 * <p>
 * <b>Note:</b> Most of the methods may throw a {@link FileSystemException}.
 * Its {@linkplain FileSystemException#getMessage() getMessage()} method usually does not return a user friendly message.
 * Use {@linkplain #getLocalizedMessage(FileSystemException)} to get a user friendly error message.
 */
@objid ("e9ac6715-8541-11e1-afeb-001ec947ccaf")
public final class FileUtils {
    /**
     * Compute the size of all files stored in a directory tree.
     * @param path a directory path.
     * @return the size of the directory.
     * @throws java.io.IOException if an I/O error occurs. call {@linkplain IOException#getMessage()} to get the error cause.
     * @throws java.nio.file.FileSystemException if a file system exception occurs. <b>Note:</b> {@linkplain FileSystemException#getMessage() getMessage()}
     * usually does not return a user friendly message. Call
     * {@linkplain FileUtils#getLocalizedMessage(FileSystemException)} to get a user friendly error message.
     */
    @objid ("0028e5a6-b977-1ffa-8e11-001ec947cd2a")
    public static long computeSize(Path path) throws IOException, FileSystemException {
        DirectorySizeVisitor dsv = new DirectorySizeVisitor();
        dsv.compute(path);
        return dsv.totalSize;
    }

    /**
     * Copy recursively the given directory to (not into) the destination directory.
     * <p>
     * The destination directory does not have to exist.
     * @param from the directory to copy
     * @param toDir the directory copy path
     * @throws java.io.IOException in case of failure
     * @throws java.nio.file.FileSystemException if a file system exception occurs.
     * <b>Note:</b> {@linkplain FileSystemException#getMessage() getMessage()} usually does not return a user friendly message.
     * Call {@linkplain FileUtils#getLocalizedMessage(FileSystemException)} to get a user friendly error message.
     */
    @objid ("fabda4a4-d023-11e1-bf59-001ec947ccaf")
    public static void copyDirectoryTo(Path from, Path toDir) throws IOException, FileSystemException {
        CopyDirVisitor copyVisitor = new CopyDirVisitor(from, toDir, StandardCopyOption.REPLACE_EXISTING);
        Files.walkFileTree(from, copyVisitor);
    }

    /**
     * Creates a directory by creating all nonexistent parent directories first. Unlike the {@link Files#createDirectory
     * createDirectory} method, an exception is not thrown if the directory could not be created because it already exists.
     * 
     * <p>
     * If this method fails, then it may do so after creating some, but not all, of the parent directories.
     * @param dir the directory to create
     * @throws java.io.IOException if an I/O error occurs. call {@linkplain IOException#getMessage()} to get the error cause.
     * @throws java.nio.file.FileSystemException if a file system exception occurs. <b>Note:</b> {@linkplain FileSystemException#getMessage()} usually does not
     * return a user friendly message. Call {@linkplain #getLocalizedMessage(FileSystemException)} to get a user
     * friendly error message.
     * @throws java.lang.SecurityException in the case of the default provider, and a security manager is installed, the
     * {@link SecurityManager#checkWrite(String) checkWrite} method is invoked prior to attempting to create a directory
     * and its {@link SecurityManager#checkRead(String) checkRead} is invoked for each parent directory that is checked.
     * If {@code dir} is not an absolute path then its {@link Path#toAbsolutePath toAbsolutePath} may need to be invoked
     * to get its absolute path. This may invoke the security manager's
     * {@link SecurityManager#checkPropertyAccess(String) checkPropertyAccess} method to check access to the system
     * property {@code user.dir}
     * @throws java.nio.file.FileAlreadyExistsException if {@code dir} exists but is not a directory <i>(optional specific exception)</i>
     * @throws java.nio.file.InvalidPathException - if a Path object cannot be constructed from the abstract path (see FileSystem.getPath)
     */
    @objid ("e9ac671b-8541-11e1-afeb-001ec947ccaf")
    public static void createDir(final File dir) throws InvalidPathException, SecurityException, IOException, FileSystemException, FileAlreadyExistsException {
        Files.createDirectories(dir.toPath());
    }

    /**
     * Deletes the given file or directory recursively.
     * <p>
     * If the path denotes a directory, tries to delete it with all its content.
     * @param path the path to the file or directory to delete
     * @throws java.io.IOException if an I/O error occurs. call {@linkplain IOException#getMessage()} to
     * get the error cause.
     * @throws java.nio.file.FileSystemException if a file system exception occurs.
     * <b>Note:</b> {@linkplain FileSystemException#getMessage()} usually does not return a user friendly message.
     * Call {@linkplain #getLocalizedMessage(FileSystemException)} to get a user friendly error message.
     * @throws java.lang.SecurityException In the case of the default provider, and a security manager
     * is installed, the {@link SecurityManager#checkDelete(String)}
     * method is invoked to check delete access to the file
     * @throws java.nio.file.DirectoryNotEmptyException if the file is a directory and could not otherwise be deleted
     * because the directory is not empty <i>(optional specific
     * exception)</i>
     * @throws java.nio.file.NoSuchFileException if the file does not exist <i>(optional specific
     * exception)</i>
     */
    @objid ("00974b68-bdb5-1ffa-8e11-001ec947cd2a")
    public static void delete(final Path path) throws NoSuchFileException, DirectoryNotEmptyException, SecurityException, IOException, FileSystemException {
        if (Files.isDirectory(path)) {
            Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        
                    Files.delete(file);
        
                    return FileVisitResult.CONTINUE;
                }
        
                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    if (exc != null)
                        throw exc;
        
                    Files.delete(dir);
        
                    return FileVisitResult.CONTINUE;
                }
            });
        } else {
            Files.deleteIfExists(path);
        }
    }

    /**
     * Deletes the given file or directory recursively.
     * <p>
     * If the path denotes a directory, tries to delete it with all its content.
     * @param path the path to the file or directory to delete
     * @throws java.io.IOException if an I/O error occurs. call {@linkplain IOException#getMessage()} to get the error cause.
     * @throws java.nio.file.FileSystemException if a file system exception occurs. <b>Note:</b> {@linkplain FileSystemException#getMessage()} usually does not
     * return a user friendly message. Call {@linkplain #getLocalizedMessage(FileSystemException)} to get a user
     * friendly error message.
     * @throws java.lang.SecurityException In the case of the default provider, and a security manager is installed, the
     * {@link SecurityManager#checkDelete(String)} method is invoked to check delete access to the file
     * @throws java.nio.file.DirectoryNotEmptyException if the file is a directory and could not otherwise be deleted because the directory is not empty <i>(optional
     * specific exception)</i>
     * @throws java.nio.file.NoSuchFileException if the file does not exist <i>(optional specific exception)</i>
     */
    @objid ("e9ac6713-8541-11e1-afeb-001ec947ccaf")
    public static void delete(final String path) throws NoSuchFileException, DirectoryNotEmptyException, SecurityException, IOException, FileSystemException {
        delete(Paths.get(path));
    }

    /**
     * Deletes the given file or directory recursively.
     * <p>
     * If the path denotes a directory, tries to delete it with all its content.
     * @param file the file or directory to delete.
     * @throws java.io.IOException if an I/O error occurs. call {@linkplain IOException#getMessage()} to
     * get the error cause.
     * @throws java.nio.file.FileSystemException if a file system exception occurs.
     * <b>Note:</b> {@linkplain FileSystemException#getMessage()} usually does not return a user friendly message.
     * Call {@linkplain #getLocalizedMessage(FileSystemException)} to get a user friendly error message.
     */
    @objid ("e9ac671a-8541-11e1-afeb-001ec947ccaf")
    public static void delete(final File file) throws IOException, FileSystemException {
        delete(file.toPath());
    }

    /**
     * Encode any string to a legal file name.
     * <p>
     * Illegal characters are encoded by '%' followed by the hex value of the character.
     * @param s a string to encode
     * @param sb the string builder to use to build the encoded string. The encoded file name will be appended to the buffer.
     * @return the string builder for convenience.
     * @author http://stackoverflow.com/questions/1184176/how-can-i-safely-encode-a-string-in-java-to-use-as-a-filename
     */
    @objid ("f97fca82-9762-4d2c-a75c-f2bbd52b6764")
    public static StringBuilder encodeFileName(String s, StringBuilder sb) {
        final char escape = '%';
        
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch < ' ' || ch >= 0x7F 
                || ch == '/' || ch=='\\' // add other illegal chars
                || (ch == '.' && i == 0) // we don't want to collide with "." or ".."!
                || ch == escape) {
                sb.append(escape);
                if (ch < 0x10) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(ch));
            } else {
                sb.append(ch);
            }
        }
        return sb;
    }

    /**
     * Decode a string from a file name encoded with {@link #encodeFileName(String, StringBuilder)}.
     * @param fileName a file name with/without extension
     * @param sb the string builder to use to build the decoded string. The decoded file name will be appended to the buffer.
     * @return the string builder for convenience.
     */
    @objid ("36066993-f543-4873-9a07-9c8c382ed607")
    public static StringBuilder decodeFileName(String fileName, StringBuilder sb) {
        final char escape = '%';
        
        int len  = fileName.length();
        sb.ensureCapacity(len);
        
        char[] hex = new char[2];
        
        for (int i=0; i<len; ++i) {
            char ch = fileName.charAt(i);
            if ( ch == escape) {
                hex[1] = fileName.charAt(++i);
                hex[2] = fileName.charAt(++i);
                ch = (char) Integer.parseInt(new String(hex), 16);
            } 
            sb.append(ch);
        }
        return sb;
    }

    /**
     * Compute and return a user friendly message from the given FileSystemException.
     * @param e the exception.
     * @return a message, won't be null.
     */
    @objid ("d454fef0-cc12-11e1-a564-001ec947ccaf")
    public static String getLocalizedMessage(FileSystemException e) {
        String pattern = CoreUtils.I18N.getString(e.getClass().getName());
        return MessageFormat.format(pattern, e.getFile(), e.getOtherFile(), e.getReason());
    }

    /**
     * Compute and return a user friendly message from the given IOException.
     * <p>
     * Delegates to {@link #getLocalizedMessage(FileSystemException)} if the parameter is a {@link FileSystemException}.
     * In the other case calls {@link IOException#getLocalizedMessage()}.
     * @param e the exception.
     * @return a message, won't be null.
     */
    @objid ("edc68ee7-9054-433f-9f60-04d3b68f6911")
    public static String getLocalizedMessage(IOException e) {
        if (e instanceof FileSystemException)
            return getLocalizedMessage((FileSystemException) e) ;
        else
            return e.getLocalizedMessage();
    }

    /**
     * Read the whole content of an input stream and returns it as a string.
     * <p>
     * To be used for small files.
     * @param is an input stream
     * @param charset The encoding type used to convert bytes from the stream into characters.
     * @return the read string
     * @throws java.io.IOException if an I/O error occurs. call {@linkplain IOException#getMessage()} to
     * get the error cause.
     * @throws java.nio.file.FileSystemException if a file system exception occurs.
     * <b>Note:</b> {@linkplain FileSystemException#getMessage()} usually does not return a user friendly message.
     * Call {@linkplain #getLocalizedMessage(FileSystemException)} to get a user friendly error message.
     */
    @objid ("40ad1e4c-87b4-4514-9d05-50754dc3eb15")
    public static String readWhole(InputStream is, String charset) throws IOException, FileSystemException {
        // see http://stackoverflow.com/questions/309424/read-convert-an-inputstream-to-a-string
        try (Scanner s = new java.util.Scanner(is, charset)){
            s.useDelimiter("\\A");
            String ret =  s.hasNext() ? s.next() : "";
            if (s.ioException() != null)
                throw s.ioException();
            return ret;
        }
    }

    /**
     * Read the whole content of a file and returns it as a string.
     * <p>
     * To be used for small files.
     * @param file a file path.
     * @param charset The encoding type used to convert bytes from the stream into characters.
     * @return the read string
     * @throws java.io.IOException if an I/O error occurs. call {@linkplain IOException#getMessage()} to
     * get the error cause.
     * @throws java.nio.file.FileSystemException if a file system exception occurs.
     * <b>Note:</b> {@linkplain FileSystemException#getMessage()} usually does not return a user friendly message.
     * Call {@linkplain #getLocalizedMessage(FileSystemException)} to get a user friendly error message.
     */
    @objid ("f6e65269-ea70-406d-aa88-687082d8f3fd")
    public static String readWhole(Path file, String charset) throws IOException, FileSystemException {
        try (InputStream is = new BufferedInputStream(Files.newInputStream(file))) {
            return readWhole(is, charset);
        }
    }

    /**
     * No instance.
     */
    @objid ("d4576141-cc12-11e1-a564-001ec947ccaf")
    private FileUtils() {
    }

    /**
     * Directory walker visitor that computes the size of a directory.
     * <p>
     * Instantiate one, call {@link #compute(Path)} and then get the value of the
     * counter attributes.
     */
    @objid ("0029072a-b977-1ffa-8e11-001ec947cd2a")
    private static class DirectorySizeVisitor extends SimpleFileVisitor<Path> {
        /**
         * Total size of the directory.
         */
        @objid ("002920b6-b977-1ffa-8e11-001ec947cd2a")
         long totalSize = 0;

        /**
         * Total number of files.
         */
        @objid ("00293ca4-b977-1ffa-8e11-001ec947cd2a")
         long nFiles = 0;

        /**
         * Total number of directories.
         */
        @objid ("00294514-b977-1ffa-8e11-001ec947cd2a")
         long nDirectory = 0;

        @objid ("00294bfe-b977-1ffa-8e11-001ec947cd2a")
        public void compute(Path path) throws IOException {
            this.totalSize = 0;
            this.nFiles = 0;
            this.nDirectory = 0;
            
            Files.walkFileTree(path, this);
        }

        @objid ("00295fae-b977-1ffa-8e11-001ec947cd2a")
        @Override
        public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
            if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS))
                this.nDirectory++;
            if (Files.isRegularFile(path, LinkOption.NOFOLLOW_LINKS)) {
                this.nFiles++;
                this.totalSize += attrs.size();
            }
            return FileVisitResult.CONTINUE;
        }

        @objid ("d37455dc-c9bf-11e1-8052-001ec947ccaf")
        public DirectorySizeVisitor() {
        }

    }

    /**
     * Visitor that copies a directory to another path.
     */
    @objid ("581a2c43-d059-491b-9c34-1237b7066616")
    public static class CopyDirVisitor extends SimpleFileVisitor<Path> {
        @objid ("e99aa572-4449-4fb5-b2b9-045676bd5e69")
        private StandardCopyOption copyOption = StandardCopyOption.REPLACE_EXISTING;

        @objid ("c9f35057-ef4e-4dfb-b894-cdcca248d390")
        private Path fromPath;

        @objid ("acc38e39-15e7-4e4d-b535-31c078282f7e")
        private Path toPath;

        @objid ("aba7abf6-8815-47a5-8da9-f2d8540e5c64")
        public CopyDirVisitor(Path fromPath, Path toPath, StandardCopyOption copyOption) {
            this.fromPath = fromPath;
            this.toPath = toPath;
            this.copyOption = copyOption;
        }

        @objid ("b71dd485-fb86-40ae-bf42-d9af6b659f82")
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            Path targetPath = this.toPath.resolve(this.fromPath.relativize(dir));
            if(!Files.exists(targetPath)){
                Files.createDirectory(targetPath);
            }
            return FileVisitResult.CONTINUE;
        }

        @objid ("10cbaed4-bc0f-46b3-a7fa-6c8d766db269")
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            Files.copy(file, this.toPath.resolve(this.fromPath.relativize(file)), this.copyOption);
            return FileVisitResult.CONTINUE;
        }

    }

}
