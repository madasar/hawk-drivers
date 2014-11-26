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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.xmi.plugin.Xmi;

/**
 * @author ebrosse
 */
@objid ("5fdd93bd-5744-4c2b-b9d4-ccf3fa2bb517")
public class XMILogs {
    @objid ("dc8a7ae7-d858-48e8-949e-0396f2ad2144")
    private final String LINE_SEPARATOR = System.getProperty("line.separator");

    @objid ("ef6ade19-79be-4649-a82e-1c72ceedd917")
    private boolean empty = true;

    @objid ("8306969c-feba-4b65-ac7b-8e6d6cec6211")
    private String logFile = "";

    @objid ("0be73e8b-179e-4706-b83c-849912e04a40")
    private List<String> elements = new ArrayList<>();

    @objid ("c7ba313a-070d-4bfd-b6c0-1642fbff6c03")
    private File fileToSave = null;

    @objid ("5e6a2db0-9660-48df-9d1a-aa76d2215ff8")
    private DateFormat dateFormat = DateFormat.getDateTimeInstance(
            DateFormat.SHORT, DateFormat.MEDIUM, Locale.getDefault());

    @objid ("ee5e3e91-1876-464c-9a7d-34c1a8aa08b0")
    private StringBuffer log = null;

    @objid ("8b1ec648-c61c-4c6f-a167-65b905931757")
    private static XMILogs INSTANCE = null;

    @objid ("2165a36d-3940-41df-b7fc-f5e07f001190")
    private XMILogs() {
    }

    /**
     * @return the instance
     */
    @objid ("23fa903c-3328-4dbb-894b-e028fe726c41")
    public static XMILogs getInstance() {
        if (INSTANCE == null)
            INSTANCE = new XMILogs();
        return INSTANCE;
    }

    /**
     * This method saves the log file
     */
    @objid ("31e9f2f7-97c1-4a31-8227-5b6f71952030")
    public void saveLog() {
        if (this.log != null) {
            this.empty = false;
            String logFilepath = this.fileToSave.getAbsolutePath();
            Xmi.LOG.error(Xmi.I18N.getMessage("warning.log.check",
                    logFilepath));
            this.log = null;
        }
    }

    /**
     * @param inputMsg : the message wrote in the log file
     */
    @objid ("7854742c-5762-4277-a693-f9763bcaa386")
    public void writelnInLog(final String inputMsg) {
        if (inputMsg != null){
            this.empty = false;
            if ( this.log == null)
                this.log = new StringBuffer();
        
            if (! this.elements.contains(inputMsg)) {
                this.elements.add(inputMsg);
                this.log.append(inputMsg).append( this.LINE_SEPARATOR);
                
                try {
                    if (! this.fileToSave.exists()) {
                        if (( this.fileToSave.getParentFile() == null) 
                                ||(! this.fileToSave.getParentFile().exists())) {
                            this.fileToSave.mkdirs();
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                Xmi.LOG.error(e);    
                            }
                        }
                        this.fileToSave.createNewFile();
                    }
        
                    try (  FileWriter f = new FileWriter( this.fileToSave, true);
                            BufferedWriter bf = new BufferedWriter(f);){
        
                        bf.write("[" +  this.dateFormat.format(Calendar.getInstance().getTime()) + "]: " + inputMsg);
                        bf.newLine();
                    } catch (IOException e) {
                        Xmi.LOG.error(e);       
                    }
        
                } catch (IOException e) {
                    Xmi.LOG.error(e);       
                }
            }
        }
    }

    /**
     * @return the path of the log file
     */
    @objid ("99d14a5d-917f-4887-aa08-b2006fda04a2")
    public String getLogFile() {
        return  this.logFile;
    }

    /**
     * @param logFile : path of the log file
     */
    @objid ("2493e2db-111f-48dc-b8f0-0d47a6479ae0")
    public void setLogFile(final String logFile) {
        this.elements = new ArrayList<>();
        this.logFile = logFile.substring(0, logFile.length() - 4);
        this.fileToSave = new File(this.logFile + ".log");
    }

    /**
     * @return the elements
     */
    @objid ("ac14563c-40a9-48e5-a7ce-d2a2487588ea")
    public List<String> elements() {
        return this.elements;
    }

    /**
     * @return true if a log exist
     */
    @objid ("2ef95210-fa8f-4f67-b16f-3056b492147e")
    public boolean haveLog() {
        return ( this.log != null);
    }

    /**
     * @return true if the log is empty
     */
    @objid ("de6d3118-0063-47a9-8fb9-5feef591440a")
    public boolean isEmpty() {
        return  this.empty;
    }

    /**
     * @param empty : set if log is empty or not
     */
    @objid ("c78c4d8e-40f2-42e9-9523-02c2f5dce097")
    public void setEmpty(final boolean empty) {
        this.empty = empty;
    }

}
