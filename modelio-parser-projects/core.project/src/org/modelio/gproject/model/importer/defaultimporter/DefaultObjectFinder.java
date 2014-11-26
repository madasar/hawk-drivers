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
                                    

package org.modelio.gproject.model.importer.defaultimporter;

import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.model.importer.core.IObjectFinder;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.session.api.model.IModel;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;

@objid ("00689656-d3aa-108f-8d81-001ec947cd2a")
public class DefaultObjectFinder implements IObjectFinder {
    @objid ("0068a948-d3aa-108f-8d81-001ec947cd2a")
    @Override
    public SmObjectImpl getSameObject(final IModel searchedSession, final SmObjectImpl searchedObject) {
        MClass classof = searchedObject.getMClass();
        
        // Find by identifier
        SmObjectImpl ret = (SmObjectImpl) searchedSession.findById(classof, searchedObject.getUuid());
        
        // Find by other methods if failed
        if (ret == null) {
            if (searchedObject instanceof Project) {
                ret = (SmObjectImpl) getSameProject(searchedSession, (Project) searchedObject);
            } else if (searchedObject instanceof AnalystProject) {
                ret = (SmObjectImpl) getSameAnalystProject(searchedSession, (AnalystProject) searchedObject);
            } else if (searchedObject instanceof PropertyContainer) {
                ret = (SmObjectImpl) getSamePropertyContainer(searchedSession, (PropertyContainer) searchedObject);
            }
        }
        
        // Verify classof are the same
        if (ret != null && ret.getMClass() != classof) {
            // ClassOf des objets differents, y a probleme
            if (!ret.getUuid().equals(searchedObject.getUuid())) {
                // Les identifiants sont diff?rents,
                // ca ne doit jamais arriver.
                // FIXME error message
                // String msg;
                // msg.pformat (RC2::getRC("import.properties").getString("ErrorReplacingDifferentClassObject").cstr(),
                // anObject.ClassOf.Name.cstr(),
                // anObject.name().cstr(),
                // ret.ClassOf.Name.cstr(),
                // ret.name().cstr(),
                // ret.getStrSiteIdentifier().cstr(),
                // anObject.getStrSiteIdentifier().cstr());
                //
                // KLog::error(msg.cstr());
                // throw SmError(msg, SmError::Error, anObject);
                throw new RuntimeException("ErrorReplacingDifferentClassObject");
            } else {
                // On a 2 objets de classe differente avec le m?me identifiant.
                // La base a quelques probl?mes ...
                //String msg;
                // FIXME error message
                // msg.pformat
                // (RC2::getRC("import.properties").getString("ErrorDifferentClassObjectWithSameIdentifierFound").cstr(),
                // anObject.ClassOf.Name.cstr(),
                // anObject.name().cstr(),
                // ret.ClassOf.Name.cstr(),
                // ret.name().cstr(),
                // anObject.getStrSiteIdentifier().cstr());
                //
                // KLog::error(msg.cstr());
                // throw SmError(msg, SmError::Error, anObject);
                throw new RuntimeException("ErrorDifferentClassObjectWithSameIdentifierFound");
            }
        }
        return ret;
    }

    @objid ("00693052-d3aa-108f-8d81-001ec947cd2a")
    protected AnalystProject getSameAnalystProject(IModel searchedSession, AnalystProject anObject) {
        Collection<AnalystProject> projects = searchedSession.findByClass(AnalystProject.class);
        for (AnalystProject aProject : projects) {
            if (anObject.getName().equals(aProject.getName())) {
                return aProject;
            }
        }
        return projects.iterator().next();
    }

    @objid ("00697cc4-d3aa-108f-8d81-001ec947cd2a")
    protected Package getSamePackage(IModel searchedSession, Package anObject) {
        Project srcProject = anObject.getRepresented();
        if (srcProject != null) {
            Project destProject = getSameProject(searchedSession, srcProject);
            if (destProject != null) {
                return destProject.getModel();
            }
        }
        return null;
    }

    @objid ("0069a2a8-d3aa-108f-8d81-001ec947cd2a")
    protected Project getSameProject(IModel searchedSession, Project anObject) {
        Collection<Project> projects = searchedSession.findByClass(Project.class);
        for (Project aProject : projects) {
            if (anObject.getName().equals(aProject.getName())) {
                return aProject;
            }
        }
        return projects.iterator().next();
    }

    @objid ("0069c986-d3aa-108f-8d81-001ec947cd2a")
    protected PropertyContainer getSamePropertyContainer(IModel searchedSession, PropertyContainer anObject) {
        AnalystProject srcReqProject = anObject.getOwnerProject();
        if (srcReqProject != null) {
            AnalystProject destReqProject = getSameAnalystProject(searchedSession, srcReqProject);
            if (destReqProject != null) {
                return destReqProject.getPropertyRoot();
            }
        }
        return null;
    }

    @objid ("006a1774-d3aa-108f-8d81-001ec947cd2a")
    protected boolean isRootRequirementContainer(SmObjectImpl anObject) {
        SmObjectImpl parent = anObject.getCompositionOwner();
        return parent instanceof AnalystProject;
    }

}
