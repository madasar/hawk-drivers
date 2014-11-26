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

import java.text.SimpleDateFormat;
import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.xmi.plugin.Xmi;

@objid ("2ded034d-e1a0-4195-90cc-4cf94375685d")
public class TimeDisplayer {
    @objid ("84fdb8eb-ed77-4aba-b6ac-26f082003ba6")
    private String defaultFormat = Xmi.I18N
	.getString("mdacProperties.timeDisplayer.defaultFormat");

    @objid ("746514fb-6e11-4531-af37-6809bdde14ae")
    private Date beginning = null;

    @objid ("787e9239-9142-4b77-8e7f-9349ad821dce")
    private static TimeDisplayer INSTANCE;

    @objid ("45a5324a-ea58-4a0a-8e45-333186b2603f")
    private SimpleDateFormat dateFormat;

    @objid ("476202f6-cb3e-48f3-b959-246ce5cdd9d7")
    private TimeDisplayer() {
        boolean error = false;
        try {
            this.dateFormat = new SimpleDateFormat(this.defaultFormat);
        } catch (NullPointerException nullE) {
            error = true;
            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N
                    .getString("warning.exception.timeDisplayer.NullPointerException"));
        } catch (IllegalArgumentException illegalE) {
            error = true;
            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getMessage(
                    "warning.exception.timeDisplayer.IllegalArgumentException",
                    this.defaultFormat));
        }
        
        if (error)
            this.dateFormat.applyPattern("HH:mm:ss");
    }

    @objid ("1d3a67b8-7191-4cd9-8e7d-0ed72f5a9db2")
    public static TimeDisplayer getInstance() {
        if (INSTANCE == null)
            INSTANCE = new TimeDisplayer();
        return INSTANCE;
    }

    @objid ("69a0b9da-11f8-4999-bd3f-b64c81f9ceb7")
    public void initialize() {
        this.beginning = null;
    }

    @objid ("393ce2ee-dc06-4129-8ffa-5f2fce5808c5")
    public String getCurrentTime() {
        Date currentDate = new Date();
        
        if (this.beginning == null)
            this.beginning = currentDate;
        return this.dateFormat.format(currentDate);
    }

}
