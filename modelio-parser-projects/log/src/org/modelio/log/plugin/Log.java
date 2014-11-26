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
                                    

package org.modelio.log.plugin;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.log.readers.LogBackListener;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogReaderService;

@objid ("0049aab6-4382-1fe3-9845-001ec947cd2a")
public class Log implements BundleActivator {
    @objid ("0055b0ea-4447-1fe3-9845-001ec947cd2a")
    public static final String PLUGIN_ID = "org.modelio.log";

    @objid ("003cb1f8-0db0-1feb-93a7-001ec947cd2a")
    public static final String MODELIO_LOGFILENAME = "modelio.log";

    @objid ("00390a26-0db0-1feb-93a7-001ec947cd2a")
    private LogBackListener logbackListener;

    @objid ("004ffcae-4447-1fe3-9845-001ec947cd2a")
    @Override
    public void start(BundleContext bundleContext) {
        ServiceReference<LogReaderService> ref = bundleContext
                .getServiceReference(LogReaderService.class);
        LogReaderService service = bundleContext.getService(ref);
        
        // consoleLogListener = new ConsoleLogListener();
        // service.addLogListener(consoleLogListener);
        
        this.logbackListener = new LogBackListener();
        service.addLogListener(this.logbackListener);
    }

    @objid ("005028aa-4447-1fe3-9845-001ec947cd2a")
    @Override
    public void stop(BundleContext bundleContext) {
        ServiceReference<LogReaderService> ref = bundleContext
                .getServiceReference(LogReaderService.class);
        LogReaderService service = bundleContext.getService(ref);
        
        if (this.logbackListener != null) {
            service.removeLogListener(this.logbackListener);
        }
    }

}
