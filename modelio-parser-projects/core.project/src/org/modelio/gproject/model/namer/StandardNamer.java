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
                                    

package org.modelio.gproject.model.namer;

import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.model.IElementNamer;
import org.modelio.gproject.model.namer.helpers.GetSiblingsVisitor;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.visitors.DefaultModelVisitor;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Default implementation of IElementNamer.
 * 
 * This implementation build names for new elements using the smarter available strategy (depending on the metaclass).
 * 
 * 
 * @author phv
 */
@objid ("0067c186-030f-1035-9f91-001ec947cd2a")
public class StandardNamer implements IElementNamer {
    @objid ("f877e222-9afb-4d44-81ab-d1c2a784c4b9")
    private static final Dispatcher dispatcher = new Dispatcher();

    @objid ("0067cd20-030f-1035-9f91-001ec947cd2a")
    @Override
    public String getBaseName(final MClass metaclass) {
        assert (metaclass != null);
        return metaclass.getName();
    }

    /**
     * This implementation uses an auxiliary visitor to generate a name for the object that can be smarter than just its metaclass
     * name.
     */
    @objid ("0068039e-030f-1035-9f91-001ec947cd2a")
    @Override
    public String getBaseName(final MObject object) {
        assert (object != null);
        IElementNamer effectiveNamer = (IElementNamer) object.accept(dispatcher);
        return effectiveNamer.getBaseName(object);
    }

    /**
     * This implementation is similar to calling: getUniqueName(getBaseName(object), object)
     */
    @objid ("00682c2a-030f-1035-9f91-001ec947cd2a")
    @Override
    public final String getUniqueName(final MObject object) {
        assert (object != null);
        return getUniqueName(getBaseName(object), object);
    }

    /**
     * This implementation returns basename unless this name is already used in which case it is completed with the smaller possible
     * value for X an integer such as basenameX does not exist.
     */
    @objid ("0068621c-030f-1035-9f91-001ec947cd2a")
    @Override
    public String getUniqueName(final String basename, final MObject object) {
        assert (basename != null);
        assert (object != null);
        IElementNamer effectiveNamer = (IElementNamer) object.accept(dispatcher);
        return effectiveNamer.getUniqueName(basename, object);
    }

    @objid ("0068a6fa-030f-1035-9f91-001ec947cd2a")
    private static Set<String> getSiblingIdentifiers(MObject object) {
        final GetSiblingsVisitor v = new GetSiblingsVisitor();
        final Set<String> results = v.getSiblings((Element) object);
        return results;
    }

    /**
     * This visitor is used to dispatch the initial call to a specific specialized implementation allowing for specialized
     * strategies depending on the object metaclass.
     * 
     * Note that the DefaultModelVisitor delegates 'visit' calls to the superclass by default, ending to visitElement() which
     * returns null (unless redefined).
     * 
     * @author phv
     */
    @objid ("2621b368-bd71-4b89-8ecf-2ddb30285a22")
    private static class Dispatcher extends DefaultModelVisitor {
        /**
         * Basic namer can handle any type of object adding a numerical index to names that are already used.
         */
        @objid ("793b5bbd-b441-41d0-a59f-bb119af266be")
        @Override
        public Object visitElement(Element obj) {
            return new BasicNamer();
        }

        /**
         * The analyst namer tries to identify a pattern to be used when generating names.
         */
        @objid ("51f90780-079b-4bdb-9eac-f2241579dec6")
        @Override
        public Object visitAnalystElement(AnalystElement obj) {
            return new AnalystNamer();
        }

    }

}
