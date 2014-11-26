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
                                    

package org.modelio.gproject.fragment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.NullProgress;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.session.impl.GenericFactory;
import org.modelio.vcore.session.impl.permission.BasicAccessManager;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Initialize new EXML fragments content.
 * <p>
 * Creates the Project, Analyst roots, diagram roots and the root package.
 */
@objid ("65e21068-ab36-11e1-8392-001ec947ccaf")
public class UmlFragmentContentInitializer {
    /**
     * No instance
     */
    @objid ("49bc2adb-ab3f-11e1-8392-001ec947ccaf")
    private UmlFragmentContentInitializer() {
    }

    /**
     * Initialize the given fragment.
     * <p>
     * Creates the repository and initialize its content.
     * The fragment must NOT be mount.
     * @param fragment the fragment to initialize.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("30f2de3a-9607-11e1-ac83-001ec947ccaf")
    public static void initialize(IProjectFragment fragment) throws IOException {
        IRepository repository = fragment.getRepository();
        String fragmentName = fragment.getId();
        
        initializeRepository(fragmentName, repository, new NullProgress());
    }

    @objid ("83d958e7-cf56-11e1-a8eb-001ec947ccaf")
    private static void initializeRepository(String fragmentName, IRepository repository, IModelioProgress progress) throws IOException {
        CoreSession s = new CoreSession();
        s.connectRepository(repository, new BasicAccessManager(), progress);
        try {
            try (ITransaction t = s.getTransactionSupport().createTransaction("Initialize '" + fragmentName + "' fragment content.")) {
                populate(fragmentName, s, repository);
                t.commit();
        
            }
            s.save(progress);
        } finally {
            s.close();
        }
    }

    /**
     * Populate the given repository using the given session.
     * @param fragmentName the fragment name
     * @param s the session to use
     * @param repository the repository to populate.
     * @return the created objects.
     */
    @objid ("2c59465a-32f2-11e2-9905-001ec947ccaf")
    public static Collection<MObject> populate(String fragmentName, ICoreSession s, IRepository repository) {
        Collection<MObject> ret = new ArrayList<>();
        GenericFactory gf = s.getModel().getGenericFactory();
        
        // Create project and root package
        Project proj = gf.create(Project.class, repository);
        Package root = gf.create(Package.class, proj);
        proj.setModel(root);
        
        proj.setName(fragmentName);
        root.setName(fragmentName.toLowerCase());
        
        ret.add(proj);
        ret.add(root);
        
        // Create analyst project
        AnalystProject anaProj = gf.create(AnalystProject.class, proj);
        DiagramSet dgRootSet = gf.create(DiagramSet.class, proj);
        proj.setDiagramRoot(dgRootSet);
        
        ret.add(dgRootSet);
        ret.add(anaProj);
        
        dgRootSet.setName(fragmentName);
        anaProj.setName(fragmentName);
        
        anaProj.setPropertyRoot(gf.create(PropertyContainer.class, proj));
        
        for (MObject c : anaProj.getCompositionChildren()) {
            c.setName(fragmentName);
            ret.add(c);
        }
        
        // Create LocalModule
        ModuleComponent localModule = gf.create(ModuleComponent.class, proj);
        localModule.setName("LocalModule");
        
        Profile localProfile = gf.create(Profile.class, proj);
        localProfile.setName("LocalProfile");
        localModule.getOwnedProfile().add(localProfile);
        return ret;
    }

}
