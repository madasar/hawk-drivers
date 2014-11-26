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
                                    

package org.modelio.vbasic.log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class provides a simple logging facility that can be completely disabled
 * at compilation time, leaving absolutely no overhead in the code. Inspired by:
 * "MinLog: A low overhead, lightweight logging system." by Nathan Sweet
 * <misc@n4te.com>
 * 
 * Usage:
 * <pre>
 * if (Log.ENABLED) Log.error("An error message...");
 * </pre>
 * <br><b>
 * IMPORTANT NOTE: <br>To benefit from the absence of overhead when ENABLED is compiled to 'false', any logging statement MUST be guarded by a 'if (Log.ENABLED)' condition.
 * </b><br>
 * 
 * 
 * @author phv
 */
@objid ("00534e22-da4a-1f33-b94f-001ec947cd2a")
public class Log {
    @objid ("0009b1cc-e3a3-1f33-b94f-001ec947cd2a")
    private static final int TRACE = 0;

    @objid ("000ba2b6-e3a3-1f33-b94f-001ec947cd2a")
    private static final int WARNING = 1;

    @objid ("000bb436-e3a3-1f33-b94f-001ec947cd2a")
    private static final int ERROR = 2;

    @objid ("000bddbc-e3a3-1f33-b94f-001ec947cd2a")
    public static final boolean ENABLED = false;

    @objid ("000d4ed6-e3a3-1f33-b94f-001ec947cd2a")
    private static Logger logger = new Logger();

    /**
     * The logging methods
     */
    @objid ("000bfba8-e3a3-1f33-b94f-001ec947cd2a")
    public static void error(final String message) {
        logger.log(ERROR, message);
    }

    @objid ("000c595e-e3a3-1f33-b94f-001ec947cd2a")
    public static void error(final String format, final Object... args) {
        logger.log(ERROR, String.format(format, args));
    }

    @objid ("000c842e-e3a3-1f33-b94f-001ec947cd2a")
    public static void error(final Throwable ex) {
        logger.log(ERROR, ex.getMessage());
        final Writer stackTrace = new StringWriter();
        ex.printStackTrace(new PrintWriter(stackTrace));
        logger.log(ERROR, stackTrace.toString());
    }

    @objid ("000c96e4-e3a3-1f33-b94f-001ec947cd2a")
    public static void warning(final String message) {
        logger.log(WARNING, message);
    }

    @objid ("000cb2fa-e3a3-1f33-b94f-001ec947cd2a")
    public static void warning(final String format, final Object... args) {
        logger.log(WARNING, String.format(format, args));
    }

    @objid ("000cddca-e3a3-1f33-b94f-001ec947cd2a")
    public static void warning(final Throwable ex) {
        logger.log(WARNING, ex.getMessage());
        final Writer stackTrace = new StringWriter();
        ex.printStackTrace(new PrintWriter(stackTrace));
        logger.log(WARNING, stackTrace.toString());
    }

    @objid ("000cf198-e3a3-1f33-b94f-001ec947cd2a")
    public static void trace(final String message) {
        logger.log(TRACE, message);
    }

    @objid ("000d0ebc-e3a3-1f33-b94f-001ec947cd2a")
    public static void trace(final String format, final Object... args) {
        logger.log(TRACE, String.format(format, args));
    }

    @objid ("000d3a9a-e3a3-1f33-b94f-001ec947cd2a")
    public static void trace(final Throwable ex) {
        logger.log(TRACE, ex.getMessage());
    }

    @objid ("000d6cf4-e3a3-1f33-b94f-001ec947cd2a")
    private Log() {
    }

}
