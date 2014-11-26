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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.xmi.UnresolvedReferenceException;
import org.modelio.xmi.api.FormatExport;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.plugin.Xmi;

/**
 * This class provides all service dedicated to XMI file treatment.
 * @author ebrosse
 */
@objid ("98464006-3da7-4eed-a3d2-1ac6016be1e7")
public class XMIFileUtils {
    /**
     * This service copies a file content into another file.
     * @param source The source file
     * @param target The target file
     */
    @objid ("20c78774-840f-463d-a1aa-47857a0c2271")
    public static void copyFile(File source, File target) {
        if (!source.getAbsolutePath ().contentEquals (target.getAbsolutePath ())) {
        
            try( FileInputStream inStream = new FileInputStream(source);
                    FileOutputStream outStream = new FileOutputStream(target);
                    FileChannel in = inStream.getChannel();
                    FileChannel out = outStream.getChannel();) {
        
                //Copy
                in.transferTo (0, in.size (), out);
        
            } catch (Exception e) {
                Xmi.LOG.error(e);       
            } 
        }
    }

    /**
     * This method converts an EMF UML file into the desired UML OMG format
     * @param filePath The file location
     */
    @objid ("9e98fff9-cece-4466-a272-62b11828b02b")
    public static void changeToUML(final String filePath, final File tempFolder) {
        File file = new File(filePath);
        
        List<String> oldPatterns = new LinkedList<>();
        List<String> newPatterns = new LinkedList<>();
        
        File xslExportFile = null;
        
        FormatExport versionExport = GenerationProperties.getInstance().getExportVersion();
        
        if (versionExport.equals(FormatExport.UML211)){
        
        
            oldPatterns.add("href[\\s]?=[\\s]?\"pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml");
            oldPatterns.add("xmlns:uml[\\s]?=[\\s]?\"http://www.eclipse.org/uml2/3.0.0/UML");
            oldPatterns.add("xsi:schemaLocation[\\s]?=[\\s]?\"");
        
            newPatterns.add("href=\"http://schema.omg.org/spec/UML/2.1.1/uml.xml" );
            newPatterns.add("xmlns:uml=\"http://schema.omg.org/spec/UML/2.1.1" );
            newPatterns.add("xsi:schemaLocation=\"http://www.eclipse.org/uml2/3.0.0/UML http://schema.omg.org/spec/UML/2.1.1 ");
        
        
            xslExportFile = ResourceLoader.getInstance().getResource("xslt"+ java.io.File.separator + "export211.xsl");
        
        }else if (versionExport.equals(FormatExport.UML22)){
        
            oldPatterns.add("href[\\s]?=[\\s]?\"pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml");
            oldPatterns.add("xmlns:uml[\\s]?=[\\s]?\"http://www.eclipse.org/uml2/3.0.0/UML");
            oldPatterns.add("xsi:schemaLocation[\\s]?=[\\s]?\"");
        
            newPatterns.add("href=\"http://schema.omg.org/spec/UML/2.2/uml.xml" );
            newPatterns.add("xmlns:uml=\"http://schema.omg.org/spec/UML/2.2" );
            newPatterns.add("xsi:schemaLocation=\"http://www.eclipse.org/uml2/3.0.0/UML http://schema.omg.org/spec/UML/2.2 ");
        
        
            xslExportFile = ResourceLoader.getInstance().getResource("xslt"+ java.io.File.separator + "export22.xsl");
        
        }else if (versionExport.equals(FormatExport.UML23)){
        
            oldPatterns.add("href[\\s]?=[\\s]?\"pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml");
            oldPatterns.add("xmlns:uml[\\s]?=[\\s]?\"http://www.eclipse.org/uml2/3.0.0/UML");
            oldPatterns.add("xsi:schemaLocation[\\s]?=[\\s]?\"");
        
            newPatterns.add("href=\"http://schema.omg.org/spec/20090901/UML.xmi" );
            newPatterns.add("xmlns:uml=\"http://www.omg.org/spec/UML/20090901" );
            newPatterns.add("xsi:schemaLocation=\"http://www.eclipse.org/uml2/3.0.0/UML http://schema.omg.org/spec/UML/20090901 ");
        
            xslExportFile = ResourceLoader.getInstance().getResource("xslt" + java.io.File.separator + "export23.xsl");
        
        }else if (versionExport.equals(FormatExport.UML241)){
        
            oldPatterns.add("href[\\s]?=[\\s]?\"pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml");
            oldPatterns.add("xmlns:uml[\\s]?=[\\s]?\"http://www.eclipse.org/uml2/3.0.0/UML");
            oldPatterns.add("xsi:schemaLocation[\\s]?=[\\s]?\"");
        
            newPatterns.add("href=\"http://www.omg.org/spec/UML/20110701/PrimitiveTypes.xmi" );
            newPatterns.add("xmlns:uml=\"http://www.omg.org/spec/UML/20110701" );
            newPatterns.add("xsi:schemaLocation=\"http://www.eclipse.org/uml2/3.0.0/UML http://schema.omg.org/spec/UML/20110701 ");
        
            xslExportFile = ResourceLoader.getInstance().getResource("xslt" + java.io.File.separator + "export241.xsl");
        
        }
        
        //        if (GenerationProperties.getInstance().isSysMLApplied()){
        //
        //            oldPatterns.add("xmlns:sysml=\"[^\"]*\"");
        //            newPatterns.add("xmlns:sysml=\"http://www.omg.org/spec/SysML/20100301/SysML-profile\"");
        //
        //            oldPatterns.add("http:///schemas/sysml/[^\\s]*\\s");
        //            newPatterns.add("");
        //
        //            oldPatterns.add("href=\"sysml.profile.[^\\s]*#[^\\s]*\"");
        //            newPatterns.add("href=\"http://www.omg.org/spec/SysML/20100301/SysML-profile.uml#_0\"");
        //
        //            oldPatterns.add("[^\\s]*.sysml.profile.[^\\s]*\\s");
        //            newPatterns.add("");
        //
        //            oldPatterns.add("[^\\s]*.sysml.profile.[^\\s]*\"");
        //            newPatterns.add("\"");
        //
        //        }
        
       
        
        String tempPath = tempFolder.getAbsolutePath() + java.io.File.separator  + file.getName() + ".temp";
        File tempFile = new File(tempPath);
        if (tempFile.exists()){
            tempFile.delete();
        }
        
        applyXSLT(file.getAbsolutePath(), tempPath, xslExportFile); 
        
        if (file.exists()){
            file.delete();
        }
        
        replace(tempPath, file.getAbsolutePath(), oldPatterns, newPatterns);
        
        if (tempFile.exists()){
            tempFile.delete();
        }
        
        System.gc();
    }

    /**
     * remove wrong references listed in the listErrors
     * @param filePath The location of the file
     * @param listErrors The list of unavailable references
     */
    @objid ("9271d51e-63c3-4b77-8fc4-c0dca90fef34")
    public static void removeReferences(final String filePath, EList<Diagnostic> listErrors) {
        String line = "";
        int errorsSize = listErrors.size();
        int currentError = 0;
        Diagnostic current = listErrors.get(currentError);
        
        while((!(current instanceof UnresolvedReferenceException))&& (currentError < errorsSize -1)) {
            currentError++;
            current = listErrors.get(currentError);
        }
        
        if  ((currentError < errorsSize) && (current instanceof UnresolvedReferenceException)){
            String unresolvedRef = ((UnresolvedReferenceException) current).getReference();
            int errorPos = ((UnresolvedReferenceException) current).getLine();
        
            File file = new File(filePath);
        
            try {
                File tempFile = new File(filePath + ".temp");
                tempFile.createNewFile();
                XMIFileUtils.copyFile(file, tempFile);
                file.createNewFile();
        
                try( FileWriter output = new FileWriter(filePath);
                        FileInputStream fis = new FileInputStream(tempFile);
                        BufferedReader reader = new BufferedReader ( new InputStreamReader(fis));
                        ) {
        
                    int currentLine = 0;
                    while((line = reader.readLine()) != null) {
                        currentLine++;
        
                        while(currentLine == errorPos){
                            line = line.replaceAll(unresolvedRef, "");
                            if  (currentError < errorsSize - 1 ){
                                currentError++;
                                current = listErrors.get(currentError);
                                while((!(current instanceof UnresolvedReferenceException))&& (currentError < errorsSize -1 )) {
                                    current = listErrors.get(++currentError);
                                }
        
                                if  ((currentError < errorsSize ) && (current instanceof UnresolvedReferenceException)){
                                    unresolvedRef = ((UnresolvedReferenceException) current).getReference();
                                    errorPos = ((UnresolvedReferenceException) current).getLine();
                                }else{
                                    errorPos = 0;
                                }
                            }else{
                                errorPos = 0;
                            }
                        }
        
                        output.write(line +"\n");
                    }
        
                    output.flush();
                }catch (IOException e) {
                    Xmi.LOG.error(e);       
                }
        
                tempFile.delete();
            }catch (IOException e) {
                Xmi.LOG.error(e);       
            }
        }
    }

    /**
     * Apply the XSL Transformation (located in XSLTFile file) to the file located in oldFilePath.
     * The result is stored in newFilePath location.
     * @param oldFilePath The file location on which the XSL will be applied
     * @param newFilePath The result location
     * @param XSLTFile The file containing the XSL Transformation
     * @return return true is successfully processed
     */
    @objid ("33f51eab-9878-4491-9d06-9e23fa44b375")
    public static boolean applyXSLT(final String oldFilePath, String newFilePath, final File XSLTFile) {
        File oldFile = new File(oldFilePath);
        
        if (oldFile.exists() && oldFile.canRead()){
        
            try(FileOutputStream outputStream = new FileOutputStream(newFilePath)) {
        
                TransformerFactory tFactory = TransformerFactory.newInstance();
        
                Transformer transformer = tFactory.newTransformer
                        (new javax.xml.transform.stream.StreamSource(XSLTFile));
        
                transformer.transform(new javax.xml.transform.stream.StreamSource
                        (oldFilePath), new javax.xml.transform.stream.StreamResult( outputStream));
        
            }catch (Exception e) {
                XMILogs.getInstance().writelnInLog(Xmi.I18N.getString("fileChooser.dialog.wrongEcoreFormat.description"));
                Xmi.LOG.error(e);       
                return false;
            }
        }
        return true;
    }

    /**
     * replace all oldPatterns[i] by newPatterns[i] in the file located in filePath.
     * @param filePath The file location
     * @param oldPatterns The strings to replace
     * @param newPatterns The new strings
     * @return return true is successfully processed
     */
    @objid ("1003f5e0-a59c-47e9-b134-7c86023010f3")
    public static boolean replace(final String filePath, final List<String> oldPatterns, final List<String> newPatterns) {
        File file = new File(filePath);
        
        if (file.exists() && (oldPatterns.size() == newPatterns.size())){
        
            int i = 0;
            String filePathTemp = filePath + "_" + String.valueOf(i);
            while((new File(filePathTemp)).exists()){
                i++;
                filePathTemp = filePath + "_" + String.valueOf(i);
            }
        
            replace(filePath, filePathTemp, oldPatterns, newPatterns);
        
            File fileTemp = new File(filePathTemp);
            file.delete();
        
            fileTemp.renameTo(file);
            return true;
        }
        return false;
    }

    /**
     * This service return the list of applied diagrams
     * @param source
     * @param target
     */
    @objid ("29c38751-85f0-47ca-a430-32bce80ba723")
    private static List<String> getAppliedProfiles(final String filePath) {
        List<String> result = new ArrayList<>();
        String line = "";
        FileInputStream fis = null;
        BufferedReader reader = null;
        
        if (new File(filePath).exists()){
            try {
        
                fis = new FileInputStream(filePath);
                reader = new BufferedReader (new InputStreamReader(fis));
        
                while((line = reader.readLine()) != null) {
        
                    if (line.contains("appliedProfile") && line.contains(" href=\"") 
                            && line.contains("#") && (!line.contains("pathmap:")) ){               
                        result.add(line.split(" href=\"")[1].split("#")[0]);
                    }
        
                }
        
                reader.close();
        
            }catch (IOException e) {
                Xmi.LOG.error(e);       
            }
        }
        return result;
    }

    /**
     * Test if the file contains at least one of the patterns.
     * @param file The file to test
     * @param patterns The list of patterns
     * @return
     * true if the file contains at least one of the patterns.
     */
    @objid ("8e1f2627-23ee-41c0-8bed-df98effdf93a")
    public static boolean containsPatterns(final File file, final List<String> patterns) {
        String line = "";
        int cmpt = 0;
        
        try(FileInputStream fis = new FileInputStream(file.getAbsolutePath());
                BufferedReader reader = new BufferedReader (new InputStreamReader(fis));){
        
            List<Pattern> listPatterns = new ArrayList<>();
        
            for (String oldPattern : patterns){
                listPatterns.add(Pattern.compile(oldPattern));
            }
        
            while(((line = reader.readLine()) != null) &&  (cmpt < 30)){
                for (Pattern pattern : listPatterns){
                    if (pattern.matcher(line).find()){
                        fis.close();
                        reader.close(); 
                        return true;
                    }
                }
                cmpt++;
            }
        
            reader.close(); 
            fis.close();            
        
        } catch (IOException e) {         
            Xmi.LOG.error(e);
        }
        return false;
    }

    /**
     * Replace all the oldPatterns[i] by the newPatterns[i] from the oldFile to the newFile
     * @param oldFilePath The location of the oldFile
     * @param newFilePath The location of the newFile i.e. the result file
     * @param oldPatterns The list of patterns to be replaced
     * @param newPatterns The list of the new patterns
     */
    @objid ("9f2b114d-2f61-4412-9562-4d879b2bcf71")
    public static void replace(final String oldFilePath, final String newFilePath, final List<String> oldPatterns, final List<String> newPatterns) {
        String line = "";        
               
        
        try( FileWriter output = new FileWriter(newFilePath);
                FileInputStream fis = new FileInputStream(oldFilePath);
                BufferedReader reader = new BufferedReader ( new InputStreamReader(fis));
                ) {
        
            List<Pattern> listPatterns = new ArrayList<>();
        
            for (String oldPattern : oldPatterns){
                listPatterns.add(Pattern.compile(oldPattern));
            }
        
            while((line = reader.readLine()) != null) {
        
                for (Pattern pattern : listPatterns){
                    line = pattern.matcher(line).replaceAll(newPatterns.get(listPatterns.indexOf(pattern)));
                }
        
                output.write(line + "\n");
            }
           
            output.flush();
          
        }catch (FileNotFoundException e) {
            XMILogs.getInstance().writelnInLog(e.getLocalizedMessage());
            Xmi.LOG.error(e);       
        }catch (IOException e) {
            Xmi.LOG.error(e);       
        }
    }

    /**
     * This service returns the list of applied profiles present
     * @param filePath The location of the file
     * @return
     * The list of applied profile
     */
    @objid ("4f2257e1-fa6b-4d12-9f4f-eeee010b814e")
    public static List<String> getAllAppliedProfiles(final String filePath) {
        List<String> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        String directory = new File(filePath).getParent();
        
        List<String> appliedProfilescurrent = getAppliedProfiles(filePath);
        
        while (result.size() != appliedProfilescurrent.size()){
            result.clear();
            temp.clear();
            result.addAll(appliedProfilescurrent);
            temp.addAll(appliedProfilescurrent);
            for (String appliedProfile : result){
                temp.addAll(getAppliedProfiles(directory + java.io.File.separator + appliedProfile));
                appliedProfilescurrent = new ArrayList<>(new HashSet<>(temp));
            }
        }
        return result;
    }

    @objid ("fe80c6ba-5e60-4e75-9471-099efcf22fbf")
    public static void createFileFromURL(final File file, final URL urlFile) {
        try {
            URLConnection connection = urlFile.openConnection();
        
            try( InputStream in = connection.getInputStream();
                    FileOutputStream fos = new FileOutputStream(file);) {
        
                byte[] buf = new byte[512];
                while (true) {
                    int len = in.read(buf);
                    if (len == -1) {
                        break;
                    }
                    fos.write(buf, 0, len);
                }
                in.close();
                fos.flush();
                fos.close();
        
            } catch (IOException e) {
                Xmi.LOG.error(e);
            }
        
        } catch (IOException e) {
            Xmi.LOG.error(e);
        }
    }

}
