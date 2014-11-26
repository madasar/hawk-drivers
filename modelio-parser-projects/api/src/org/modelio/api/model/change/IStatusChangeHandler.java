/*
 * Copyright 2013 Modeliosoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */  
                                    

package org.modelio.api.model.change;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.model.IModelingSession;

/**
 * Handler of status changes.<p><p>
 * 
 * Use this interface when model modification are required.
 * 
 * Each time the a model transaction is commited, a {@link IStatusChangeEvent}
 * class is computed and given to each {@link IStatusChangeListener} that is
 * connected to the modeling session.<p><p>
 * 
 * Example of adding a new listener in Modelio.<p>
 * <code>
 * MyStatusChangeHandler handler = new MyModelChangeHandler(...);<p>
 * Modelio.getInstance().getModelingSession().addStatusHandler (handler);<p><p>
 * </code>
 * 
 * Example of removing an existing listener from Modelio.<p>
 * <code>
 * MyStatusChangeHandler handler = ...;<p>
 * Modelio.getInstance().getModelingSession().removeStatusHandler (handler);<p><p>
 * </code>
 * 
 * The given {@link IStatusChangeEvent} is used to get the elements that have a status
 * change.
 * @see IStatusChangeEvent
 */
@objid ("9bc7112e-f790-11dd-83f5-0014222a9f79")
public interface IStatusChangeHandler {
    /**
     * Invoked when the model has changed.
     * 
     * <P>The <code>session</code> parameter is the modeling session where the event has occured.
     * modifications. The event parameter provide the changes made in the model.</p>
     * @param session The modeling session.
     * @param event Delta between the beginning and the end of the transaction.
     */
    @objid ("9bc71130-f790-11dd-83f5-0014222a9f79")
    void handleStatusChange(IModelingSession session, IStatusChangeEvent event);

}
