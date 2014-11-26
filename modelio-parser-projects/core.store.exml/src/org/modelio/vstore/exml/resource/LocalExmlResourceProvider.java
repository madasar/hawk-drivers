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
                                    

package org.modelio.vstore.exml.resource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.files.CloseOnFail;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;
import org.modelio.vcore.session.api.blob.IBlobInfo;
import org.modelio.vcore.session.api.repository.BlobServices;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vstore.exml.common.model.ObjId;

/**
 * Resource provider for repositories on the local file system.
 */
@objid ("92cf54a7-0326-11e2-b5bf-001ec947ccaf")
public class LocalExmlResourceProvider implements IExmlResourceProvider {
    @objid ("7294666b-cc33-4f49-b9cd-ce4fc0771fc4")
    private String name;

    @objid ("cf50780d-03e4-11e2-b5bf-001ec947ccaf")
    protected Path repositoryPath;

    @objid ("cf50780e-03e4-11e2-b5bf-001ec947ccaf")
    private Path modelPath;

    @objid ("56431bde-0482-4788-a969-e8537a140013")
    private Path stampPath;

    @objid ("cd668a26-2eec-4c30-918c-878a84635f6e")
    private Path indexPath;

    @objid ("4070fd54-8e58-4e10-a53a-bb99f8bdd6ca")
    private Path blobsDir;

    @objid ("1b898bae-c8f8-4a31-bed0-666f507ebd51")
    private Path versionPath;

    /**
     * Initialize the resource provider.
     * @param repositoryPath a path on the local file system.
     * @param runtimePath a path on the local file system containing repository data
     * that may be discarded. This directory will usually contain the EXML indexes.
     */
    @objid ("4a42dd38-085f-49f2-85c6-5b9eb651c672")
    public LocalExmlResourceProvider(Path repositoryPath, Path runtimePath) {
        this.repositoryPath = repositoryPath;
        this.name = repositoryPath.getFileName().toString();
        this.modelPath = repositoryPath.resolve(IExmlRepositoryGeometry.MODEL_DIRNAME);
        this.stampPath = repositoryPath.resolve(IStampGeometry.STAMP_DIR_NAME).resolve(IStampGeometry.STAMP_FILE_NAME);
        this.indexPath = runtimePath.resolve(IExmlRepositoryGeometry.INDEX_DIRNAME);
        this.blobsDir = repositoryPath.resolve(IExmlRepositoryGeometry.BLOBS_DIRNAME);
        this.versionPath = repositoryPath.resolve(IExmlRepositoryGeometry.VERSION_PATH);
    }

    @objid ("cf50781d-03e4-11e2-b5bf-001ec947ccaf")
    @Override
    public void buildIndexes(IModelioProgress monitor) throws IOException {
        Files.createDirectories(this.indexPath);
    }

    @objid ("cf50782b-03e4-11e2-b5bf-001ec947ccaf")
    @Override
    public void close() {
        // Nothing to do.
    }

    @objid ("cf52da6e-03e4-11e2-b5bf-001ec947ccaf")
    @Override
    public void commit() throws IOException {
        // TODO Implement a local ACID transaction to ensure consistency when
        // write failure.
        
        // Write the stamp
        if (isWriteable()) {
            writeStamp();
        }
    }

    @objid ("cf52da71-03e4-11e2-b5bf-001ec947ccaf")
    @Override
    public void createRepository() throws IOException {
        ExmlRepositoryCreator c = new ExmlRepositoryCreator(this.repositoryPath);
        c.createRepositoryStructure();
    }

    @objid ("cf50782e-03e4-11e2-b5bf-001ec947ccaf")
    @Override
    public Collection<ExmlResource> getAllResources(IModelioProgress aMonitor) throws IOException {
        List<SmClass> mClasses = SmClass.getRegisteredClasses();
        List<ExmlResource> toBuild = new ArrayList<>();
        SubProgress monitor = SubProgress.convert(aMonitor, "Getting all repository content...", 100+mClasses.size());
        
        for (SmClass cls : mClasses) {
            if (cls.isCmsNode()) {
                Path dir  = this.modelPath.resolve(cls.getName());
                if (Files.isDirectory(dir)) {
                    try(DirectoryStream<Path> dirStream = Files.newDirectoryStream(dir, "*.exml");) {
                        for (Path  f: dirStream) {
                            toBuild.add(new LocalResource(f));
                        }
                    }
                }
            }
            monitor.worked(1);
        }
        return Collections.unmodifiableCollection(toBuild);
    }

    @objid ("8dc9f0b0-135d-4f44-9ce7-365988d3d50c")
    @Override
    public File getIndexAccessPath() {
        return this.indexPath.toFile();
    }

    @objid ("978dc0e5-12de-11e2-816a-001ec947ccaf")
    @Override
    public ExmlResource getLocalResource(ObjId cmsNodeId) {
        return new LocalResource(getLocalCmsNodePath(cmsNodeId));
    }

    @objid ("cf52da74-03e4-11e2-b5bf-001ec947ccaf")
    @Override
    public URI getURI() {
        return this.repositoryPath.toUri();
    }

    @objid ("ab62866f-ec6c-415f-b3dd-d8e662af28c9")
    @Override
    public String getName() {
        return this.name;
    }

    @objid ("cf507812-03e4-11e2-b5bf-001ec947ccaf")
    @Override
    public ExmlResource getResource(ObjId cmsNodeId) throws IOException {
        return new LocalResource(getCmsNodePath(cmsNodeId));
    }

    @objid ("7acb5016-121e-4da7-839c-f01355078455")
    @Override
    public String getStamp() {
        try {
            try {
                return FileUtils.readWhole(this.stampPath, "UTF-8");
            } catch (NoSuchFileException e) {
                //TODO 23/02/2013: Compat with old stamp file name, to remove later
                Path old = this.stampPath.getParent().resolve("stamp.conf");
                return FileUtils.readWhole(old, "UTF-8");
            }
        } catch (IOException e) {
            return "";
        }
    }

    @objid ("5a5f0ba1-0724-11e2-9eb7-001ec947ccaf")
    @Override
    public boolean isWriteable() {
        return true;
    }

    /**
     * Set the repository name.
     * @param name the repository name.
     */
    @objid ("7a4eab85-01fe-4946-96f6-c458bb62e242")
    public void setName(String name) {
        this.name = name;
    }

    @objid ("e82a245c-9825-4914-82f2-b32bec3091fc")
    @Override
    public String toString() {
        return "'"+this.name+"' local repository @"+this.repositoryPath;
    }

    @objid ("5c8a68d4-53b4-4224-bf82-ca99692d14e9")
    @Override
    public void writeStamp() throws IOException {
        Path stampDir = this.stampPath.getParent();
        
        if (!stampDir.getFileSystem().isReadOnly()) {
            byte[] bytes = UUID.randomUUID().toString().getBytes(StandardCharsets.UTF_8);
            
            Files.createDirectories(stampDir);
            Files.write(this.stampPath, bytes);
        }
    }

    @objid ("f2563538-b840-4440-8388-b7cdba6ed411")
    @Override
    public InputStream readBlob(String key) throws IOException {
        Path blobPath = getBlobPath(key);
        if (Files.isRegularFile(blobPath)) {
            InputStream is = Files.newInputStream(blobPath);
            try (CloseOnFail c = new CloseOnFail(is)) {
                @SuppressWarnings("unused")
                IBlobInfo unused = BlobServices.readBlobInfo(is);
                
                c.success();
            }
            
            return is;
        } else
            return null;
    }

    @objid ("813597e2-3ee0-4bab-906e-f1e77abb901e")
    @Override
    public OutputStream writeBlob(IBlobInfo info) throws IOException {
        Path blobPath = getBlobPath(info.getKey());
        Files.createDirectories(blobPath.getParent());
        
        OutputStream os = Files.newOutputStream(blobPath);
        
        try (CloseOnFail c = new CloseOnFail(os)) {
            BlobServices.write(info, os);
            c.success();
        }
        return os;
    }

    @objid ("cf507818-03e4-11e2-b5bf-001ec947ccaf")
    private Path getCmsNodePath(ObjId id) {
        return this.modelPath.resolve(id.classof.getName())
                .resolve(id.id.toString()+IExmlRepositoryGeometry.EXT_EXML);
    }

    @objid ("978dc0ec-12de-11e2-816a-001ec947ccaf")
    private Path getLocalCmsNodePath(ObjId id) {
        return this.modelPath.resolve(id.classof.getName())
                .resolve(id.id.toString()+IExmlRepositoryGeometry.EXT_LOCAL_EXML);
    }

    @objid ("74941219-10a3-4c05-8a40-a9b36b7542d6")
    private Path getBlobPath(String key) {
        return this.repositoryPath.resolve(BlobGeometry.getBlobPath(key));
    }

    @objid ("6b5b4d3c-b54d-41d0-9e48-692819572d84")
    @Override
    public void deleteBlob(String blob) throws IOException {
        Path blobPath = getBlobPath(blob);
        Files.deleteIfExists(blobPath);
    }

    @objid ("231035bc-875e-470e-881f-47cd59c026b0")
    @Override
    public IBlobInfo readBlobInfo(String key) throws IOException {
        Path blobPath = getBlobPath(key);
        if (Files.isRegularFile(blobPath)) {
            try (InputStream is = Files.newInputStream(blobPath)) {
                return BlobServices.readBlobInfo(is);
            }
        } else
            return null;
    }

    @objid ("786673ff-0dab-4036-86a6-c2128d89e7a5")
    @Override
    public ExmlResource getRepositoryVersionResource() {
        return new LocalResource(this.versionPath);
    }

    /**
     * Local EXML resource.
     */
    @objid ("cf52da5d-03e4-11e2-b5bf-001ec947ccaf")
    protected static final class LocalResource implements ExmlResource {
        @objid ("cf52da60-03e4-11e2-b5bf-001ec947ccaf")
        private Path p;

        @objid ("cf52da61-03e4-11e2-b5bf-001ec947ccaf")
        public LocalResource(Path p) {
            this.p = p;
        }

        @objid ("cf52da64-03e4-11e2-b5bf-001ec947ccaf")
        @Override
        public InputStream read() throws IOException {
            if (! Files.isRegularFile(this.p))
                return null;
            else
                return Files.newInputStream(this.p);
        }

        @objid ("cf52da69-03e4-11e2-b5bf-001ec947ccaf")
        @Override
        public OutputStream write() throws IOException {
            Files.createDirectories(this.p.getParent());
            return Files.newOutputStream(this.p);
        }

        @objid ("97902336-12de-11e2-816a-001ec947ccaf")
        @Override
        public void delete() throws IOException {
            Files.deleteIfExists(this.p);
        }

        @objid ("92e120c5-2cd2-11e2-81f1-001ec947ccaf")
        @Override
        public String getPublicLocation() {
            return this.p.toString();
        }

    }

}
