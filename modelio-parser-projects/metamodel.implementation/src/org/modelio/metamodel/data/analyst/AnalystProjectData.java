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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.data.analyst.BusinessRuleContainerData;
import org.modelio.metamodel.data.analyst.DictionaryData;
import org.modelio.metamodel.data.analyst.GenericAnalystContainerData;
import org.modelio.metamodel.data.analyst.GoalContainerData;
import org.modelio.metamodel.data.analyst.PropertyContainerData;
import org.modelio.metamodel.data.analyst.RequirementContainerData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.analyst.AnalystProjectImpl;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("00621268-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AnalystProject.class, factory=AnalystProjectData.Metadata.ObjectFactory.class, cmsnode=true)
public class AnalystProjectData extends ModelElementData {
    @objid ("4725dc79-dd1d-46e5-87bd-ee922955b819")
    @SmaMetaAssociation(metaName="PropertyRoot", typeDataClass=PropertyContainerData.class, min=1, max=1, smAssociationClass=Metadata.PropertyRootSmDependency.class, component = true)
     SmObjectImpl mPropertyRoot;

    @objid ("da4116ed-1155-4b55-b6a7-d3f04b21aad0")
    @SmaMetaAssociation(metaName="GoalRoot", typeDataClass=GoalContainerData.class, min=0, max=-1, smAssociationClass=Metadata.GoalRootSmDependency.class, component = true)
     List<SmObjectImpl> mGoalRoot = null;

    @objid ("db4bad03-804e-4188-a99e-3c46579900cc")
    @SmaMetaAssociation(metaName="BusinessRuleRoot", typeDataClass=BusinessRuleContainerData.class, min=0, max=-1, smAssociationClass=Metadata.BusinessRuleRootSmDependency.class, component = true)
     List<SmObjectImpl> mBusinessRuleRoot = null;

    @objid ("8fd470d2-200c-4f03-a55a-93b123b37f78")
    @SmaMetaAssociation(metaName="DictionaryRoot", typeDataClass=DictionaryData.class, min=0, max=-1, smAssociationClass=Metadata.DictionaryRootSmDependency.class, component = true)
     List<SmObjectImpl> mDictionaryRoot = null;

    @objid ("9ab27a27-7535-41c4-9e30-1936be22bb07")
    @SmaMetaAssociation(metaName="RequirementRoot", typeDataClass=RequirementContainerData.class, min=0, max=-1, smAssociationClass=Metadata.RequirementRootSmDependency.class, component = true)
     List<SmObjectImpl> mRequirementRoot = null;

    @objid ("da50cb69-84a6-492c-8cf6-69f34a05e2ef")
    @SmaMetaAssociation(metaName="GenericRoot", typeDataClass=GenericAnalystContainerData.class, min=0, max=-1, smAssociationClass=Metadata.GenericRootSmDependency.class, component = true)
     List<SmObjectImpl> mGenericRoot = null;

    @objid ("cbbb9854-21f0-49bc-9b24-70f7e80df056")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0038fd06-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2fe0ebb7-e1c4-4e32-8420-b7f7d2c2626c")
        private static SmClass smClass = null;

        @objid ("42d36656-3dee-48be-9a85-cf3df9a43390")
        private static SmDependency PropertyRootDep = null;

        @objid ("34a592d9-5712-479c-81be-de7e44eff4c8")
        private static SmDependency GoalRootDep = null;

        @objid ("8aaa7853-1dd9-4bde-9e5c-820dec69272b")
        private static SmDependency BusinessRuleRootDep = null;

        @objid ("bc856b0e-2d48-4206-939f-868533bfa30a")
        private static SmDependency DictionaryRootDep = null;

        @objid ("62d8525b-9ee3-4d73-8dfd-65d8528da562")
        private static SmDependency RequirementRootDep = null;

        @objid ("9ccc7944-32f8-44b6-a3c4-619479057c6d")
        private static SmDependency GenericRootDep = null;

        @objid ("eb1c1ccd-2a35-46d7-a9c5-37902675fe9c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystProjectData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b17765a9-6159-46f8-90e7-788aad52bb42")
        public static SmDependency PropertyRootDep() {
            if (PropertyRootDep == null) {
            	PropertyRootDep = classof().getDependencyDef("PropertyRoot");
            }
            return PropertyRootDep;
        }

        @objid ("e40a38a2-d008-4e99-ad73-4a067a3f614f")
        public static SmDependency GoalRootDep() {
            if (GoalRootDep == null) {
            	GoalRootDep = classof().getDependencyDef("GoalRoot");
            }
            return GoalRootDep;
        }

        @objid ("ce64f5f0-316f-4894-aabc-c49e918c5658")
        public static SmDependency BusinessRuleRootDep() {
            if (BusinessRuleRootDep == null) {
            	BusinessRuleRootDep = classof().getDependencyDef("BusinessRuleRoot");
            }
            return BusinessRuleRootDep;
        }

        @objid ("d425b5b5-ca63-45f6-8919-1371937d1b55")
        public static SmDependency DictionaryRootDep() {
            if (DictionaryRootDep == null) {
            	DictionaryRootDep = classof().getDependencyDef("DictionaryRoot");
            }
            return DictionaryRootDep;
        }

        @objid ("7b0ffe11-2496-42f4-a087-f22bc20b7431")
        public static SmDependency RequirementRootDep() {
            if (RequirementRootDep == null) {
            	RequirementRootDep = classof().getDependencyDef("RequirementRoot");
            }
            return RequirementRootDep;
        }

        @objid ("67d609d9-2083-458b-b4ba-1e5d11c91f0c")
        public static SmDependency GenericRootDep() {
            if (GenericRootDep == null) {
            	GenericRootDep = classof().getDependencyDef("GenericRoot");
            }
            return GenericRootDep;
        }

        @objid ("ef195688-7b24-4c85-93d4-7eb9fe61b27e")
        public static SmDependency getDictionaryRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DictionaryRootDep;
        }

        @objid ("c4f2a3d9-4581-4a6c-b84c-fbf351c8b66d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("9f214986-8ab0-4176-ba1f-d59488702913")
        public static SmDependency getGenericRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GenericRootDep;
        }

        @objid ("ce099781-4abc-4c99-8703-57040aa833af")
        public static SmDependency getGoalRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GoalRootDep;
        }

        @objid ("9643ec7e-2bbe-4243-9dec-4b45dccb6f7f")
        public static SmDependency getRequirementRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequirementRootDep;
        }

        @objid ("9306f160-14c0-46f1-8684-95c51c679641")
        public static SmDependency getPropertyRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PropertyRootDep;
        }

        @objid ("f146c10c-5c4f-4c0e-93c8-3bf4e2b3b558")
        public static SmDependency getBusinessRuleRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BusinessRuleRootDep;
        }

        @objid ("00394cac-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("90dd0b4e-17d1-46c8-87eb-567beb84b9e4")
            public ISmObjectData createData() {
                return new AnalystProjectData();
            }

            @objid ("a5ec1229-0078-475b-bd1b-996a42073ac1")
            public SmObjectImpl createImpl() {
                return new AnalystProjectImpl();
            }

        }

        @objid ("003a3d56-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DictionaryRootSmDependency extends SmMultipleDependency {
            @objid ("8e05df59-be80-4b46-bcf6-6c2a6aadd6d7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mDictionaryRoot != null)? ((AnalystProjectData)data).mDictionaryRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("dbb20332-983c-47ce-807b-0dbaa47d06ab")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mDictionaryRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mDictionaryRoot;
            }

            @objid ("315abb5c-d9b6-4863-9433-739488118f96")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("003abdbc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RequirementRootSmDependency extends SmMultipleDependency {
            @objid ("46c8e435-fcb3-4b09-aaea-e105e02f5062")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mRequirementRoot != null)? ((AnalystProjectData)data).mRequirementRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("a6259074-2912-45e4-bf59-13fe5adc72d1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mRequirementRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mRequirementRoot;
            }

            @objid ("cf007096-deb9-4242-8fda-ca4d6debd1ae")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("003b3ef4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class GoalRootSmDependency extends SmMultipleDependency {
            @objid ("d522995d-486e-4641-96ba-465a9d7b50cb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mGoalRoot != null)? ((AnalystProjectData)data).mGoalRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("85032515-4037-47f0-bd3d-0828963461a9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mGoalRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mGoalRoot;
            }

            @objid ("9e0cdada-d4a9-4a23-bb7f-84cdfe7c6d0a")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("003be39a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class BusinessRuleRootSmDependency extends SmMultipleDependency {
            @objid ("fab303c0-09d4-44ba-964a-076a79f60eba")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mBusinessRuleRoot != null)? ((AnalystProjectData)data).mBusinessRuleRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("9b8fdc0b-61b1-4ef5-9867-b41f4899411f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mBusinessRuleRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mBusinessRuleRoot;
            }

            @objid ("b3d31917-d215-493f-b767-c0d7188c3e99")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("af575df3-2811-11e2-b500-001ec947ccaf")
        public static class PropertyRootSmDependency extends SmSingleDependency {
            @objid ("a57d0915-0956-46c9-9b1a-cd64534705cb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AnalystProjectData) data).mPropertyRoot;
            }

            @objid ("a2864b7a-c181-4c73-bc4a-18bc0e90a612")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AnalystProjectData) data).mPropertyRoot = value;
            }

            @objid ("b3b5aa62-0e70-467c-b056-6358df7792a5")
            @Override
            public SmDependency getSymetric() {
                return PropertyContainerData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("78378f24-7471-44c1-8df2-112e58790f75")
        public static class GenericRootSmDependency extends SmMultipleDependency {
            @objid ("1b163eb9-8063-409e-b4a6-6e8d2a299912")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mGenericRoot != null)? ((AnalystProjectData)data).mGenericRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("79c1349f-0ccb-4e71-ba3d-376c2fddb095")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mGenericRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mGenericRoot;
            }

            @objid ("ef802145-9516-4efd-969a-c2d9436302f5")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystContainerData.Metadata.OwnerProjectDep();
            }

        }

    }

}
