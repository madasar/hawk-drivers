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
                                    

package org.modelio.api.log;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;

/**
 * The class implementing this interface provides a basic log service for modules.
 */
@objid ("7c1f19c2-6bf5-11e0-a371-001ec947cd2a")
public interface ILogService {
    /**
     * Output an information message in the Modelio console.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * @param module the module providing the error.
     * @param msg a message to be displayed as a log.
     */
    @objid ("37df3836-64d9-11e0-b650-001ec947cd2a")
    void info(final IModule module, final String msg);

    /**
     * Output a warning message in the Modelio console.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * @param module the module providing the error.
     * @param msg a message to be displayed as a log.
     */
    @objid ("3a433391-6bfd-11e0-a371-001ec947cd2a")
    void warning(final IModule module, final String msg);

    /**
     * Output an error message in the Modelio console.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * @param module the module providing the error.
     * @param msg a message to be displayed as a log.
     */
    @objid ("3adbc9d1-6bfd-11e0-a371-001ec947cd2a")
    void error(final IModule module, final String msg);

    /**
     * Log the given exception with its stack trace as an information.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * @param module the module providing the exception.
     * @param t an exception to be displayed as a log.
     */
    @objid ("509889e7-a65c-11e1-833c-001ec947ccaf")
    void info(final IModule module, final Throwable t);

    /**
     * Log the given exception with its stack trace as a warning.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * @param module the module providing the exception.
     * @param t an exception to be displayed as a log.
     */
    @objid ("509889ed-a65c-11e1-833c-001ec947ccaf")
    void warning(final IModule module, final Throwable t);

    /**
     * Log the given exception with its stack trace as an error.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * @param module the module providing the exception.
     * @param t an exception to be displayed as a log.
     */
    @objid ("509889f3-a65c-11e1-833c-001ec947ccaf")
    void error(final IModule module, final Throwable t);

}
