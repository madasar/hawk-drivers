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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

@objid ("000fb1bc-c4bf-1fd8-97fe-001ec947cd2a")
public interface LinkEnd extends ModelElement {
    /**
     * Get the 'graphical owner' related to this end.
     * The owner is the current source or the opposite end's target according to the navigability.
     */
    @objid ("8b942215-f0a1-454e-9f8a-596315ee40d5")
    Instance getOwner();

    @objid ("006058b0-2963-1080-943a-001ec947cd2a")
    void setTarget(final Instance value, final boolean fixModel);

    @objid ("006059f0-2963-1080-943a-001ec947cd2a")
    void setSource(final Instance value, final boolean fixModel);

    /**
     * Sets both ends sources and targets according to the given navigability.
     * <ul>
     * <li>THISSIDE: only current source and target must be filled.</li>
     * <li>OHERSIDE: only opposite source and target must be filled.</li>
     * <li>BOTHSIDES: current source must be equals to opposite target as well as current target and opposite source.</li>
     * <li>NONE: both sources must be filled, but no target</li>
     * </ul>
     * @param value whether or not to synchronize the other end and both source/target values. This end will be made navigable whatever the current navigability is.
     */
    @objid ("50d3075c-1fcb-4a03-a648-16729171986f")
    void setNavigable(boolean value);

    @objid ("6d12e031-ad22-449a-9171-6a88d4158b48")
    boolean isNavigable();

    @objid ("280030fc-d216-4c1e-a9ac-8bd4e58e4b3a")
    boolean isIsOrdered();

    @objid ("8633b055-d7be-4397-b880-3ccb4555eb60")
    void setIsOrdered(boolean value);

    @objid ("13b4b0ee-0eb4-489f-b462-696d0a3c7a52")
    boolean isIsUnique();

    @objid ("34ee0a30-f9ec-437e-89a3-66cc2bfa6756")
    void setIsUnique(boolean value);

    @objid ("59314741-24e6-4d99-a219-d6872dae530f")
    String getMultiplicityMax();

    @objid ("820c83ab-18cb-4542-9f3a-7e4536c7c680")
    void setMultiplicityMax(String value);

    @objid ("36080606-2d64-44c0-90e7-a526d9d7db92")
    String getMultiplicityMin();

    @objid ("595a8853-778f-4d3c-8959-a4b575d53a55")
    void setMultiplicityMin(String value);

    @objid ("45c09e8a-dc59-4e27-b9c7-6a20a1d4e671")
    Link getLink();

    @objid ("be3be83c-cf9e-467a-a0b9-68628b19bb2e")
    void setLink(Link value);

    @objid ("3be8ef0b-ae64-418c-91db-8e2b026e9f61")
    Instance getTarget();

    @objid ("d53d8b85-e301-47c8-8fa4-4dafad9e0d38")
    void setTarget(Instance value);

    @objid ("bfaf49b8-a745-4344-a719-35feece9f231")
    LinkEnd getOppositeOwner();

    @objid ("c6739a85-faa0-4ced-b91a-031b8fe7790c")
    void setOppositeOwner(LinkEnd value);

    @objid ("4c7d6f88-13da-4000-ae70-9fe33fd3ab0c")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("a20d715c-1120-47bf-ac37-2ed0303ff940")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("598d7ee5-e93e-4bc6-adf4-1d25fe170a23")
    AssociationEnd getModel();

    @objid ("c744d53d-b1dc-4ffb-b615-abffba916228")
    void setModel(AssociationEnd value);

    @objid ("79e6dd3a-7c44-4fb6-a952-45310e0f3a06")
    RequiredInterface getConsumer();

    @objid ("5cc748d8-5abd-4c88-8e78-fcd6d76cca6b")
    void setConsumer(RequiredInterface value);

    @objid ("c4fac2fd-7233-4dab-a17e-16b9b21da22b")
    LinkEnd getOpposite();

    @objid ("7197bed9-47bd-42d0-96d3-d112e42e5dbb")
    void setOpposite(LinkEnd value);

    @objid ("99ad7e41-e9b1-420c-8c5c-72ab310ef9c2")
    Instance getSource();

    @objid ("a90faa60-9f57-4bfb-ac73-fea155def3e7")
    void setSource(Instance value);

    @objid ("4c5c745f-c2e8-4f47-a8b5-2cafd1de0547")
    ProvidedInterface getProvider();

    @objid ("482bbc3d-1e7b-4daf-a59c-ed9b1a74ccbd")
    void setProvider(ProvidedInterface value);

}
