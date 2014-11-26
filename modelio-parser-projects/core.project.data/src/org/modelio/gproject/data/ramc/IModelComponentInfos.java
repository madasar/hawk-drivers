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

import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.version.Version;

/**
 * Model component information interface.
 */
@objid ("0ff8a947-3918-4cab-85ee-9f968e71d6e2")
public interface IModelComponentInfos {
    @objid ("90859aa0-b1c7-4ee7-97c0-0d0e229bd90e")
    String getName();

    @objid ("550b4736-d101-40b4-8468-c75e0dbf1202")
    Version getVersion();

    @objid ("ce6e13f7-cf57-4725-a842-026328f892a9")
    String getDescription();

    @objid ("5ed23cdf-3cf9-4bcd-9f69-c78137076cee")
    List<VersionedItem> getRequiredModelComponents();

    @objid ("c5d6beaa-0300-48ac-9471-0278292097a7")
    List<VersionedItem> getContributingModules();

    @objid ("cd373789-5c4f-4a9b-bcb7-ce32681a0e28")
    List<ExportedFile> getExportedFiles();

    @objid ("89cfa488-8e74-45f0-9e46-45af21b590ee")
    List<ModelRef> getRoots();

    @objid ("f9f7bd83-37d3-40d6-a4c0-c6dfe096f0f6")
    public static class VersionedItem {
        @objid ("4c04ab71-cb83-4a26-bf8f-5207668e2d59")
         String id;

        @objid ("9c29241a-6ce4-4c75-82c7-c08c82017d7c")
         String name;

        @objid ("0b3fa91c-dabf-4ad0-a8ce-05e8a354d125")
         Version version;

        @objid ("59a142b9-f13a-4666-a6a5-e5ffec709943")
        VersionedItem(String name, String id, Version version) {
            this.name    = name;
            this.id      = id;
            this.version = version;
        }

        @objid ("7ed86c6b-600b-47c8-837c-24adc502306d")
        VersionedItem(String name, Version version) {
            this.name    = name;
            this.id      = "";
            this.version = version;
        }

        @objid ("195178ac-796a-437a-b946-b5df604501ec")
        public String getId() {
            return this.id;
        }

        @objid ("f382e125-8453-400a-aecb-dc8a32876d10")
        public String getName() {
            return this.name;
        }

        @objid ("cd7c0d6b-211e-4c34-8a0c-0bfd607dedba")
        public Version getVersion() {
            return this.version;
        }

    }

    @objid ("4fbf6c11-c9b2-42b7-a1d2-3d04a0617b6b")
    public static class ExportedFile {
        @objid ("5c4a8b1e-b11b-47b7-97a8-07593f7c72dd")
         Path path;

        @objid ("76513372-5060-4333-b0a7-0774baf6c9d2")
         FileTime date;

        @objid ("1eb8fd9b-c40b-4494-997d-550c4e8687ce")
        ExportedFile(Path path, FileTime date) {
            this.path = path;
            this.date = date;
        }

        @objid ("f298608a-5f1d-4692-aea2-934bdcb40caf")
        public Path getPath() {
            return this.path;
        }

        @objid ("d9b8ea0b-586f-4e34-b078-cd7d081d0ffb")
        public FileTime getDate() {
            return this.date;
        }

    }

}
