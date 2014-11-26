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
                                    

package org.modelio.gproject.fragment.url;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.data.project.DefinitionScope;
import org.modelio.gproject.data.project.FragmentType;
import org.modelio.gproject.data.project.GAuthConf;
import org.modelio.gproject.data.project.GProperties;
import org.modelio.gproject.data.project.VersionDescriptors;
import org.modelio.gproject.fragment.AbstractFragment;
import org.modelio.gproject.gproject.GProjectEvent;
import org.modelio.gproject.plugin.CoreProject;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.Project;
import org.modelio.vbasic.log.Log;
import org.modelio.vbasic.net.UriConnections;
import org.modelio.vbasic.net.UriUtils;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vcore.session.api.IAccessManager;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.impl.permission.BasicAccessManager;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vstore.exml.local.ExmlBase;
import org.modelio.vstore.exml.resource.UriExmlResourceProvider;

/**
 * Remote EXML repository fragment.
 * 
 * Its location is specified as an URL.
 */
@objid ("e77decda-03f8-11e2-9ef9-001ec947ccaf")
public class UrlFragment extends AbstractFragment {
    /**
     * Fragment type identifier.
     */
    @objid ("e77decdf-03f8-11e2-9ef9-001ec947ccaf")
    public static final FragmentType TYPE = FragmentType.EXML_URL;

    @objid ("e77deceb-03f8-11e2-9ef9-001ec947ccaf")
    private URI repoUrl;

    @objid ("e77ded08-03f8-11e2-9ef9-001ec947ccaf")
    private ExmlBase repository;

    /**
     * Instantiate an URL based EXML fragment.
     * @param id the fragment name
     * @param url the repository location as a URL
     * @param definitionScope definition scope
     * @param properties the fragment properties.
     * @param authConf authentication configuration
     */
    @objid ("e77dec8d-03f8-11e2-9ef9-001ec947ccaf")
    public UrlFragment(final String id, final URI url, DefinitionScope definitionScope, final GProperties properties, GAuthConf authConf) {
        super(id, definitionScope, properties, authConf);
        
        this.repoUrl = url;
    }

    @objid ("e77ded0e-03f8-11e2-9ef9-001ec947ccaf")
    @Override
    protected IRepository doMountInitRepository(IModelioProgress aMonitor) {
        // Compute a local path to copy the index to.
        Path localPath = getRuntimeDirectory();
        
        GAuthConf auth = getAuthConfiguration();
                
        // Use the project user & password if none defined
        if (auth == null)
            auth = getProject().getAuthConfiguration();
        
        // instantiate the repository from the URL
        UriExmlResourceProvider resProvider = new UriExmlResourceProvider(this.repoUrl, localPath, auth.getAuthData());
        resProvider.setName(getId());
        
        this.repository = new ExmlBase(resProvider);
        return this.repository;
    }

    @objid ("e77dece1-03f8-11e2-9ef9-001ec947ccaf")
    @Override
    protected void doUnmountPostProcess() {
        this.repository = null;
    }

    @objid ("e77ded04-03f8-11e2-9ef9-001ec947ccaf")
    @Override
    public IRepository getRepository() {
        return this.repository;
    }

    @objid ("e77dece0-03f8-11e2-9ef9-001ec947ccaf")
    @Override
    public FragmentType getType() {
        return TYPE;
    }

    @objid ("e77decfa-03f8-11e2-9ef9-001ec947ccaf")
    @Override
    public URI getUri() {
        return this.repoUrl==null ? null : URI.create(this.repoUrl.toString());
    }

    @objid ("e77ded00-03f8-11e2-9ef9-001ec947ccaf")
    @Override
    public Collection<MObject> doGetRoots() {
        Collection<MObject> roots = this.repository.findByClass(SmClass.getClass(Project.class));
        roots.addAll(this.repository.findByClass(SmClass.getClass(AnalystProject.class)));
        roots.addAll(this.repository.findByClass(SmClass.getClass(ModuleComponent.class)));
        return roots;
    }

    @objid ("e77decf4-03f8-11e2-9ef9-001ec947ccaf")
    protected final void assertOpen() throws IllegalStateException {
        if (this.repository == null) {
            throw new IllegalStateException("The '" + getId() + "' fragment is not mount.");
        }
    }

    @objid ("dd53a49c-395a-11e2-a6db-001ec947ccaf")
    @Override
    protected IAccessManager doInitAccessManager() {
        final BasicAccessManager ret = new BasicAccessManager();
        ret.setWriteable(false);
        return ret;
    }

    @objid ("9e5e011e-35c0-47c4-ba4f-9b3f87bdb652")
    @Override
    public VersionDescriptors getMetamodelVersion() throws IOException {
        URI mmuri = UriUtils.asDirectoryUri(this.repoUrl).resolve("admin/").resolve(MMVERSION_FILE_NAME);
        
        try (InputStream is = UriConnections.openInputStream(mmuri, getAuthData());
                InputStreamReader in = new InputStreamReader(is, StandardCharsets.UTF_8)) {
            return new VersionDescriptors(in);
        } catch (FileNotFoundException | NoSuchFileException e) {
            Log.warning("No '"+mmuri+"' metamodel version file. Assume Modelio 3.1 (9020) metamodel version.");
            return VersionDescriptors.current(9020);
        }
    }

    @objid ("aa4fba17-786f-454b-afa1-abaf26f4ae6c")
    @Override
    protected void checkMmVersion() throws IOException {
        VersionDescriptors fragmentVersion = getMetamodelVersion();
        if (! fragmentVersion.isSame(getLastMmVersion())) {
            // last compatible version 9017
            // first incompatible version 9016
            final int mmVersion = fragmentVersion.getMmVersion();
            if (mmVersion < 9017 || mmVersion > Integer.parseInt(Metamodel.VERSION)) {
                // too old or more recent than Modelio
                String msg = CoreProject.getMessage("AbstractFragment.MmVersionNotSupported", getId(), fragmentVersion, getLastMmVersion().toString());
                throw new IOException(msg);
            } else {
                String msg = CoreProject.getMessage("AbstractFragment.DifferentMmVersion", getId(), fragmentVersion, getLastMmVersion().toString());
                getProject().getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(this, msg));
            }
        }
    }

}
