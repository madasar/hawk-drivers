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
                                    

package org.modelio.xmi.util;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.util.UMLSwitch;

@objid ("acdca369-1411-48fe-81f1-512c7ebb2984")
public class OwnedOutputPinVisitor {
    @objid ("2831d245-37cd-41cb-8b36-231e8dfd1211")
    private OutputPinGetter getter;

    @objid ("e9177ee3-2389-433b-92f8-a3c0cb528e2b")
    private List<OutputPin> outputPinList;

    @objid ("524078a9-ce2c-4a77-a143-f911ea554a99")
    public OwnedOutputPinVisitor() {
        getter = new OutputPinGetter();
        outputPinList = null;
    }

    @objid ("0d4d0f6a-a92a-43fd-8842-c7bf1675ae5e")
    public List<OutputPin> getOutputPinList(org.eclipse.uml2.uml.Element owner) {
        if (outputPinList != null)
            outputPinList = null;
        getter.accept(owner);
        return outputPinList;
    }

    @objid ("f2a188eb-f9fc-4bb8-b4c7-e2600c209b2a")
    private class OutputPinGetter extends UMLSwitch {
        @objid ("843442cb-c129-4b9f-8bfb-a747a3e94e49")
        public void accept(org.eclipse.uml2.uml.Element ecoreElt) {
            doSwitch(ecoreElt);
        }

        @objid ("e11b65cb-7060-4fee-95b9-feddf6d3b714")
        @Override
        public Object caseAcceptCallAction(org.eclipse.uml2.uml.AcceptCallAction owner) {
            return null;
        }

        @objid ("e7da062f-f3e5-42d8-9a42-739d46b610be")
        @Override
        public Object caseAcceptEventAction(org.eclipse.uml2.uml.AcceptEventAction owner) {
            outputPinList = owner.getResults();
            return 42;
        }

        @objid ("69169643-1f21-4ed8-8878-185f4366d985")
        @Override
        public Object caseAction(org.eclipse.uml2.uml.Action owner) {
            outputPinList = owner.getOutputs();
            return 42;
        }

        @objid ("6a18385c-af9a-4e25-a73e-550342e528d1")
        @Override
        public Object caseCallAction(org.eclipse.uml2.uml.CallAction owner) {
            outputPinList = owner.getResults();
            return 42;
        }

        @objid ("b1e6c533-71bc-4932-b146-22fa4161d47f")
        @Override
        public Object caseConditionalNode(org.eclipse.uml2.uml.ConditionalNode owner) {
            outputPinList = owner.getResults();
            return 42;
        }

        @objid ("bb1b894a-497d-4536-a9c1-f937ecd02aab")
        @Override
        public Object caseCreateLinkObjectAction(org.eclipse.uml2.uml.CreateLinkObjectAction owner) {
            return null;
        }

        @objid ("ff48fff1-60b4-4dae-a365-44f0f0d805a1")
        @Override
        public Object caseCreateObjectAction(org.eclipse.uml2.uml.CreateObjectAction owner) {
            return null;
        }

        @objid ("5dc8a239-992a-4547-a3a3-354848037f6c")
        @Override
        public Object caseLoopNode(org.eclipse.uml2.uml.LoopNode owner) {
            outputPinList = owner.getResults();
            return 42;
        }

        @objid ("892807ff-d243-4fdd-ae6f-628c256dda91")
        @Override
        public Object caseOpaqueAction(org.eclipse.uml2.uml.OpaqueAction owner) {
            outputPinList = owner.getOutputValues();
            return 42;
        }

        @objid ("0ba5339e-b0b2-47d7-a791-71d4711e2c4c")
        @Override
        public Object caseReadExtentAction(org.eclipse.uml2.uml.ReadExtentAction owner) {
            return null;
        }

        @objid ("61103af9-fe01-42de-abd0-c635f40140d5")
        @Override
        public Object caseReadIsClassifiedObjectAction(org.eclipse.uml2.uml.ReadIsClassifiedObjectAction owner) {
            return null;
        }

        @objid ("6db52e09-d716-4c85-8af4-39556fe61ea0")
        @Override
        public Object caseReadLinkAction(org.eclipse.uml2.uml.ReadLinkAction owner) {
            return null;
        }

        @objid ("7568c4b5-7100-4086-818c-ef4532363972")
        @Override
        public Object caseReadLinkObjectEndAction(org.eclipse.uml2.uml.ReadLinkObjectEndAction owner) {
            return null;
        }

        @objid ("c7a692c2-e472-4fc9-812a-e8de96a8c5ea")
        @Override
        public Object caseReadLinkObjectEndQualifierAction(org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction owner) {
            return null;
        }

        @objid ("974c6bdb-543a-4e3f-8f3d-0a56d6e9bd3f")
        @Override
        public Object caseReadSelfAction(org.eclipse.uml2.uml.ReadSelfAction owner) {
            return null;
        }

        @objid ("35d20125-f435-4249-80be-ee178c960e2a")
        @Override
        public Object caseReadStructuralFeatureAction(org.eclipse.uml2.uml.ReadStructuralFeatureAction owner) {
            return null;
        }

        @objid ("d4064095-0790-4154-a8c3-2b3bfabe3c6d")
        @Override
        public Object caseReadVariableAction(org.eclipse.uml2.uml.ReadVariableAction owner) {
            return null;
        }

        @objid ("64659a9c-a2d0-4040-bb88-8863bebc68d6")
        @Override
        public Object caseReduceAction(org.eclipse.uml2.uml.ReduceAction owner) {
            return null;
        }

        @objid ("903500f2-f08d-430c-a35b-7a37c18e55b4")
        @Override
        public Object caseStructuredActivityNode(org.eclipse.uml2.uml.StructuredActivityNode owner) {
            outputPinList = owner.getOutputs();
            return 42;
        }

        @objid ("8160ba12-0832-4084-baca-aa9e2328dc7c")
        @Override
        public Object caseTestIdentityAction(org.eclipse.uml2.uml.TestIdentityAction owner) {
            return null;
        }

        @objid ("6bada75f-bf2f-4458-88de-d295b401d179")
        @Override
        public Object caseUnmarshallAction(org.eclipse.uml2.uml.UnmarshallAction owner) {
            outputPinList = owner.getResults();
            return 42;
        }

        @objid ("e060dbb3-3150-4657-babe-69e5435fd1e9")
        @Override
        public Object caseValueSpecificationAction(org.eclipse.uml2.uml.ValueSpecificationAction owner) {
            return null;
        }

    }

}
