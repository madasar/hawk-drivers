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
                                    

package org.modelio.api.modelio;

import java.io.IOException;
import java.io.OutputStream;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.app.IModelioContext;
import org.modelio.api.app.navigation.INavigationService;
import org.modelio.api.app.picking.IPickingService;
import org.modelio.api.audit.IAuditService;
import org.modelio.api.diagram.IDiagramService;
import org.modelio.api.editor.IEditionService;
import org.modelio.api.exchange.IExchangeService;
import org.modelio.api.log.ILogService;
import org.modelio.api.mc.IModelComponentService;
import org.modelio.api.meta.IMetamodelService;
import org.modelio.api.model.IImageService;
import org.modelio.api.model.IModelManipulationService;
import org.modelio.api.model.IModelingSession;
import org.modelio.api.module.IModuleService;
import org.modelio.api.module.script.IScriptService;

/**
 * This class a the class that represents the modelio application.
 * <p>
 * It is a singleton. It can be accessed by <code>Modelio.getInstance()</code> method.
 */
@objid ("a1f0c48c-ed20-11dd-a469-0014222a9f79")
public abstract class Modelio {
    @objid ("c714458f-6bf4-11e0-a371-001ec947cd2a")
    protected static Modelio instance;

    /**
     * Get the modelio application instance.
     * @return the singleton instance of Modelio
     */
    @objid ("af34c0d6-6bf7-11e0-a371-001ec947cd2a")
    public static Modelio getInstance() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return instance;
    }

    /**
     * Get the audit service.
     * @return the audit service.
     */
    @objid ("44bc2a8e-6bf5-11e0-a371-001ec947cd2a")
    public abstract IAuditService getAuditService();

    /**
     * Get the context of the Modelio application.
     * @return the Modelio context.
     */
    @objid ("37df3828-64d9-11e0-b650-001ec947cd2a")
    public abstract IModelioContext getContext();

    /**
     * Get the diagram manipulation service.
     * @return the diagram service.
     */
    @objid ("d99a86aa-6bf4-11e0-a371-001ec947cd2a")
    public abstract IDiagramService getDiagramService();

    /**
     * Get the text editor management service.
     * @return the edition service.
     */
    @objid ("218fdb67-6c25-11e0-b589-002564c97630")
    public abstract IEditionService getEditionService();

    /**
     * Get the service to get the image of an element.
     * @return the image service.
     */
    @objid ("76263473-e3dd-11dd-a49b-0014222a9f79")
    public abstract IImageService getImageService();

    /**
     * Get the log service for modules.
     * @return the log service.
     */
    @objid ("76ea52de-6bf5-11e0-a371-001ec947cd2a")
    public abstract ILogService getLogService();

    /**
     * Get the metamodel management service.
     * @return the metamodel service.
     */
    @objid ("f41fc31e-723e-11e0-89ea-002564c97630")
    public abstract IMetamodelService getMetamodelService();

    /**
     * Get the model component management service.
     * @return the model component service.
     */
    @objid ("ee8ca0e6-6bf4-11e0-a371-001ec947cd2a")
    public abstract IModelComponentService getModelComponentService();

    /**
     * Get the project session.
     * @return the current project session.
     */
    @objid ("00c8ec8e-6bf5-11e0-a371-001ec947cd2a")
    public abstract IModelingSession getModelingSession();

    /**
     * Get the model manipulation service.
     * @return the model manipulation service.
     */
    @objid ("8e654e80-820c-11e0-ae7b-002564c97630")
    public abstract IModelManipulationService getModelManipulationService();

    /**
     * Get the module management service.
     * @return the module management service.
     */
    @objid ("184f7457-6bf5-11e0-a371-001ec947cd2a")
    public abstract IModuleService getModuleService();

    /**
     * Get the navigation service.
     * <p>
     * The navigation service allow to force selection in all the view/dialog that are registered as
     * NavigationListener.
     * @return the navigation service.
     */
    @objid ("37df382c-64d9-11e0-b650-001ec947cd2a")
    public abstract INavigationService getNavigationService();

    /**
     * Get the element picking service.
     * @return the element picking service.
     */
    @objid ("3dd313e6-6bf5-11e0-a371-001ec947cd2a")
    public abstract IPickingService getPickingService();

    /**
     * Get the service to get the image of an element in the explorer.
     * @return the image service.
     */
    @objid ("86358e14-6bf6-11e0-a371-001ec947cd2a")
    public abstract IScriptService getScriptService();

    /**
     * Get the service to import/export model elements.
     * @return the exchange service.
     * @since 2.2
     */
    @objid ("1483333b-9516-11e1-a83f-002564c97630")
    public abstract IExchangeService getExchangeService();

    /**
     * Get the service implementing the given interface.
     * <p>
     * Returns <code>null</code> if no such service is registered.
     * @param serviceInterface the service interface.
     * @return the registered service.
     */
    @objid ("b34e1f8c-370d-45f1-a231-e24be780bf4a")
    public abstract <I> I getService(Class<I> serviceInterface);

    /**
     * Register a Modelio service.
     * <p>
     * A same service may be registered for many interfaces but only one
     * service may be registered for an interface.
     * <p>
     * Once a service has been registered, it cannot be removed.
     * @param serviceInterface the implemented service interface.
     * @param service the service implementation.
     */
    @objid ("39f5ab6e-027a-4e69-be7b-ece0a6f8b723")
    public abstract <I> void registerService(Class<I> serviceInterface, I service);

    /**
     * Redirects all written data to the Modelio log service.
     */
    @objid ("a3bbfbde-9e9f-11e1-914f-002564c97630")
    static class LogWriterOutputStream extends OutputStream {
        @objid ("a3bc22f0-9e9f-11e1-914f-002564c97630")
        private boolean isErrorStream;

        /**
         * Default constructor.
         * @param isErrorStream indicates if all data must be written as errors or infos.
         */
        @objid ("a3bc22f1-9e9f-11e1-914f-002564c97630")
        public LogWriterOutputStream(final boolean isErrorStream) {
            this.isErrorStream = isErrorStream;
        }

        @objid ("a3bc4a03-9e9f-11e1-914f-002564c97630")
        @Override
        public void write(final int b) throws IOException {
            write(new byte[] {(byte) b}, 0, 1);
        }

        @objid ("a3bc7114-9e9f-11e1-914f-002564c97630")
        @Override
        public void write(final byte[] b, final int off, final int len) throws IOException {
            if (this.isErrorStream) {
                Modelio.getInstance().getLogService().error(null, new String(b, off, len));
            } else {
                Modelio.getInstance().getLogService().info(null, new String(b, off, len));
            }
        }

        @objid ("a3bcbf37-9e9f-11e1-914f-002564c97630")
        @Override
        public void flush() throws IOException {
            // Nothing to do
        }

        @objid ("a3bce645-9e9f-11e1-914f-002564c97630")
        @Override
        public void close() throws IOException {
            // Nothing to do
        }

        @objid ("a3bce648-9e9f-11e1-914f-002564c97630")
        @Override
        public void write(final byte[] b) throws IOException {
            if (this.isErrorStream) {
                Modelio.getInstance().getLogService().error(null, new String(b));
            } else {
                Modelio.getInstance().getLogService().info(null, new String(b));
            }
        }

    }

}
