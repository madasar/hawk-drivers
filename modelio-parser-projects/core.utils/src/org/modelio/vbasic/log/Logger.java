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

import java.text.SimpleDateFormat;
import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * A simple Logger utility, logging into System.out.
 */
@objid ("000dece2-e3a3-1f33-b94f-001ec947cd2a")
class Logger {
    @objid ("000bc43a-e3a3-1f33-b94f-001ec947cd2a")
    private static String[] PREFIXS = { "INFO: ", "WARN: ", " ERR: " };

    @objid ("77b26ef8-9b64-11e1-94a3-001ec947ccaf")
    private static final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS ");

    @objid ("00259388-e3a3-1f33-b94f-001ec947cd2a")
    public void log(final int level, final String message) {
        StringBuilder builder = new StringBuilder(256);
        
        builder.append(dateFormatter.format(new Date()));
        builder.append(PREFIXS[level]);
        builder.append(message);
        //builder.append(EOL);
        
        print(builder.toString());
    }

    /**
     * Prints the message to System.out. Called by the default
     * implementation of {@link #log(int, String, String, Throwable)}.
     */
    @objid ("0025ace2-e3a3-1f33-b94f-001ec947cd2a")
    @SuppressWarnings("static-method")
    protected void print(final String message) {
        System.out.println(message);
    }

}
