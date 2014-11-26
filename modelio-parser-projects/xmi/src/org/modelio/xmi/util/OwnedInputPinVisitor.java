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
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.util.UMLSwitch;

@objid ("3f60ce1b-9c18-42c5-bd52-ee7daa222eba")
public class OwnedInputPinVisitor {
    @objid ("5e114196-a65d-4e0e-84bc-c61f71b27ad7")
    private InputPinGetter getter;

    @objid ("a2d1a18c-0e78-408c-82e8-d2096c05a38d")
     List<InputPin> inputPinList;

    @objid ("194fb678-ac70-4b52-b5af-8d279638dc4b")
    public OwnedInputPinVisitor() {
        getter = new InputPinGetter();
        inputPinList = null;
    }

    @objid ("4f076c13-ef3c-44ff-810a-ff53b1970c80")
    public List<InputPin> getInputPinList(org.eclipse.uml2.uml.Element owner) {
        if (inputPinList != null)
            inputPinList = null;
        getter.accept(owner);
        return inputPinList;
    }

    @objid ("c3fdcfa6-f778-468d-93c2-eddeb232eee8")
    class InputPinGetter extends UMLSwitch {
        @objid ("5059fda7-5335-4023-a8ad-86666a218ffa")
        public void accept(org.eclipse.uml2.uml.Element ecoreElt) {
            doSwitch(ecoreElt);
        }

        @objid ("fc19dc1b-e39c-45e1-90e1-fff32e3c6f80")
        @Override
        public Object caseAction(org.eclipse.uml2.uml.Action owner) {
            inputPinList = owner.getInputs();
            return 42;
        }

        @objid ("91c7349b-a48b-436e-82ba-965bbcd33791")
        @Override
        public Object caseAddStructuralFeatureValueAction(org.eclipse.uml2.uml.AddStructuralFeatureValueAction owner) {
            return null;
        }

        @objid ("c30e7d8b-a1e5-4017-ab38-9292fab09627")
        @Override
        public Object caseAddVariableValueAction(org.eclipse.uml2.uml.AddVariableValueAction owner) {
            return null;
        }

        @objid ("712f53a2-680e-4c2d-82eb-e4d500d11421")
        @Override
        public Object caseCallOperationAction(org.eclipse.uml2.uml.CallOperationAction owner) {
            return null;
        }

        @objid ("2647284f-bdae-4bed-860d-95864f4b96b2")
        @Override
        public Object caseClearAssociationAction(org.eclipse.uml2.uml.ClearAssociationAction owner) {
            return null;
        }

        @objid ("e83a563f-ab26-4042-ace9-828b9f434921")
        @Override
        public Object caseDestroyObjectAction(org.eclipse.uml2.uml.DestroyObjectAction owner) {
            return null;
        }

        @objid ("9432413b-0223-4474-ac65-32992132a4f7")
        @Override
        public Object caseInvocationAction(org.eclipse.uml2.uml.InvocationAction owner) {
            inputPinList = owner.getArguments();
            return 42;
        }

        @objid ("3ae91cce-2bd9-40d2-b578-b6834bdff20e")
        @Override
        public Object caseLinkAction(org.eclipse.uml2.uml.LinkAction owner) {
            inputPinList = owner.getInputValues();
            return 42;
        }

        @objid ("fd472e1f-b2fc-4164-9029-12160f5815b8")
        @Override
        public Object caseLoopNode(org.eclipse.uml2.uml.LoopNode owner) {
            inputPinList = owner.getLoopVariableInputs();
            return 42;
        }

        @objid ("80a656a3-2a26-42da-9173-b15579affad9")
        @Override
        public Object caseOpaqueAction(org.eclipse.uml2.uml.OpaqueAction owner) {
            inputPinList = owner.getInputValues();
            return 42;
        }

        @objid ("69a1e5b9-19b7-4ccf-b6e8-4148b7290720")
        @Override
        public Object caseRaiseExceptionAction(org.eclipse.uml2.uml.RaiseExceptionAction owner) {
            return null;
        }

        @objid ("2bc6adff-c89b-4b0b-8ee2-a8da87a7002c")
        @Override
        public Object caseReadIsClassifiedObjectAction(org.eclipse.uml2.uml.ReadIsClassifiedObjectAction owner) {
            return null;
        }

        @objid ("f38f1678-c764-4dd6-8735-f16389ac3328")
        @Override
        public Object caseReadLinkObjectEndAction(org.eclipse.uml2.uml.ReadLinkObjectEndAction owner) {
            return null;
        }

        @objid ("0c107138-4931-4ee2-87e2-ad77fdd05eba")
        @Override
        public Object caseReadLinkObjectEndQualifierAction(org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction owner) {
            return null;
        }

        @objid ("a22f1b3c-4014-428e-8446-882a05e015e4")
        @Override
        public Object caseReclassifyObjectAction(org.eclipse.uml2.uml.ReclassifyObjectAction owner) {
            return null;
        }

        @objid ("788f33f9-b465-4368-9283-7826394423dc")
        @Override
        public Object caseReduceAction(org.eclipse.uml2.uml.ReduceAction owner) {
            return null;
        }

        @objid ("787feee6-6e1d-4898-bf3c-21b5f2186a75")
        @Override
        public Object caseRemoveStructuralFeatureValueAction(org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction owner) {
            return null;
        }

        @objid ("5d94cf0e-0d9f-4701-870c-244daed56a9b")
        @Override
        public Object caseRemoveVariableValueAction(org.eclipse.uml2.uml.RemoveVariableValueAction owner) {
            return null;
        }

        @objid ("4d06c078-b211-497d-a781-4a0a085bf66d")
        @Override
        public Object caseReplyAction(org.eclipse.uml2.uml.ReplyAction owner) {
            inputPinList = owner.getReplyValues();
            return 42;
        }

        @objid ("9f237212-1aa8-4496-b30f-c6199046ef73")
        @Override
        public Object caseSendObjectAction(org.eclipse.uml2.uml.SendObjectAction owner) {
            return null;
        }

        @objid ("24dc1f70-a5ce-4c79-8a36-8e2d0188738e")
        @Override
        public Object caseSendSignalAction(org.eclipse.uml2.uml.SendSignalAction owner) {
            return null;
        }

        @objid ("4887e785-0f81-4783-abdd-0c6a0d10dbf6")
        @Override
        public Object caseStartClassifierBehaviorAction(org.eclipse.uml2.uml.StartClassifierBehaviorAction owner) {
            return null;
        }

        @objid ("3a8e45ef-2056-4b1c-a91b-e521edc9c195")
        @Override
        public Object caseStructuralFeatureAction(org.eclipse.uml2.uml.StructuralFeatureAction owner) {
            return null;
        }

        @objid ("d00174c2-2275-47cc-b347-48baee59f3b2")
        @Override
        public Object caseStructuredActivityNode(org.eclipse.uml2.uml.StructuredActivityNode owner) {
            inputPinList = owner.getInputs();
            return 42;
        }

        @objid ("389b16c5-5208-441b-8c5b-a05afd772e2f")
        @Override
        public Object caseTestIdentityAction(org.eclipse.uml2.uml.TestIdentityAction owner) {
            return null;
        }

        @objid ("e8f7bfb0-9b9f-41f7-8c9a-e4ef5587f9c8")
        @Override
        public Object caseUnmarshallAction(org.eclipse.uml2.uml.UnmarshallAction owner) {
            return null;
        }

        @objid ("f681729c-f3b1-4d39-9c01-e45888d7275f")
        @Override
        public Object caseWriteStructuralFeatureAction(org.eclipse.uml2.uml.WriteStructuralFeatureAction owner) {
            return null;
        }

        @objid ("727e3fe7-689b-48a6-9350-a904019d253f")
        @Override
        public Object caseWriteVariableAction(org.eclipse.uml2.uml.WriteVariableAction owner) {
            return null;
        }

    }

}
