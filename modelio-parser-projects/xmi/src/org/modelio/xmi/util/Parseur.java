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

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.xmi.plugin.Xmi;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

@objid ("7540d31a-1318-4be5-ac6b-75ed19ec522a")
public class Parseur {
    @objid ("f0b55b91-2d50-4719-b48d-12c0ccf89e36")
    private DocumentBuilderFactory factory;

    @objid ("4b886aa4-c2bc-463e-b048-d464c16950ed")
    private DocumentBuilder builder;

    @objid ("538ac6ca-7904-45f0-939a-7cd9b8dbe3e2")
    private Document doc;

    @objid ("aac5decd-5a42-4571-b486-09ec02fab3ec")
    private Element nroot;

    @objid ("a0e03dc0-ae4a-455f-9165-dab3c5f37fdb")
    private File file;

    /**
     * @param path path of XML file
     * @throws Exception
     */
    @objid ("abb9092e-d584-4bd0-89c6-bf58d212354a")
    public Parseur(File file) {
        //Chargement du document
        try{
            this.factory = DocumentBuilderFactory.newInstance();
            this. builder = this.factory.newDocumentBuilder();
            this.doc = this.builder.parse(file);
            this.nroot = this.doc.getDocumentElement();
            this.file = file;
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Traite les diff?rentes erreurs EA
     */
    @objid ("2ae76955-668c-4ed5-9155-996577a615f9")
    public void clean() {
        if (isEAModel()){
            deleteDefaultValues();
            deleteEAnone();
            deleteNoAnnotatedElement();
            deleteWriteVariableAction();
            ecrireDocument();
        }
    }

    @objid ("d9ca097b-0926-4f03-8b02-d257986a1c35")
    private boolean isEAModel() {
        boolean isEAModel = false;
        NodeList listeparcours = this.nroot.getElementsByTagName("xmi:Documentation");
        
        
        int nbparcours = listeparcours.getLength();
        for(int i = 0; i < nbparcours; i++){
            Element e = (Element) listeparcours.item(i);
            if ( (e != null ) && e.hasAttribute("exporter") 
                    && e.getAttribute("exporter").equals("Enterprise Architect")){
        
                isEAModel = true;
            }
        }
        return isEAModel;
    }

    /**
     * supprimer les elements defaultValue n'ayant pas de type
     */
    @objid ("4635c255-8515-4bbf-88d5-e900266aaed2")
    private void deleteDefaultValues() {
        // Parcour du document
        
        NodeList listeparcours = this.nroot.getElementsByTagName("defaultValue");
        
        int nbparcours=listeparcours.getLength();
        for(int i = 0; i < nbparcours; i++){
            Element e = (Element)listeparcours.item(i);
            if ( (e != null) && (!e.hasAttribute("xmi:type"))){
                ((Element)e.getParentNode()).removeAttribute("type");
                e.getParentNode().removeChild(e);
        
            }
        }
    }

    /**
     * supprimer les elements WriteVariableAction
     */
    @objid ("7061c2ff-1e2b-4788-8bc7-e2c79f36b4bd")
    private void deleteWriteVariableAction() {
        // Parcours du document et supression des elements de type WriteVariableAction 
        
        NodeList listeparcours = this.nroot.getElementsByTagName("node");
        
        List<String> listId = new ArrayList<>();
        List<Element> toDelete = new ArrayList <>();
        
        int nbparcours=listeparcours.getLength();
        for(int i = 0; i < nbparcours; i++){
            Element e = (Element) listeparcours.item(i);
            if (e.hasAttribute("xmi:type") && (e.getAttribute("xmi:type").equals("uml:WriteVariableAction"))){
                NodeList childList = e.getChildNodes();
                int nbChild = childList.getLength();
                for(int j = 0; j < nbChild; j++){
                    Element child = (Element )listeparcours.item(j);
                    // case incoming
                    if (child.getNodeName().equals("incoming") && (child.hasAttribute("xmi:idref")))
                        listId.add(child.getAttribute("xmi:idref"));
                    //case output
                    else if (child.getNodeName().equals("output")){
                        NodeList outputChildList = child.getChildNodes();
                        int nbOutputChild = outputChildList.getLength();
                        for(int z = 0; z < nbOutputChild; z++){
                            if (child.getNodeName().equals("outgoing") && (child.hasAttribute("xmi:idref")))
                                listId.add(child.getAttribute("xmi:idref"));
                        }
                    }
        
                }
                toDelete.add(e);
            }
        }
        
        
        
        
        // Parcours du document et supression des elements de type WriteVariableAction 
        
        listeparcours = this.nroot.getElementsByTagName("edge");
        
        nbparcours = listeparcours.getLength();
        for(int i = 0; i < nbparcours; i++){
            Element e = (Element)listeparcours.item(i);
            if ((e != null) && e.hasAttribute("xmi:id") && (listId.contains(e.getAttribute("xmi:id"))))
                toDelete.add(e);
        }
        
        for(Element e : toDelete){
            e.getParentNode().removeChild(e);
        }
    }

    /**
     * supprimer les elements ayant pour type EAnone_void
     */
    @objid ("61d19973-0fc2-47bb-aaf2-3cd23f2df5cc")
    private void deleteEAnone() {
        // Parcour du document
        
        NodeList listeparcours = this.nroot.getElementsByTagName("ownedParameter");
        
        List <Element> toDelete = new ArrayList<>();
        
        int nbparcours=listeparcours.getLength();
        for(int i = 0; i < nbparcours; i++){
            Element e = (Element)listeparcours.item(i);
            if ((e != null) 
                    && e.hasAttribute("type") && (e.getAttribute("type").equals("EAnone_void")))
                toDelete.add(e);
        }
        
        for (Element e : toDelete){
            e.getParentNode().removeChild(e);
        }
    }

    /**
     * supprimer les elements de
     */
    @objid ("207a4b1b-4095-4efe-94fc-c7514da7233a")
    private void deleteNoAnnotatedElement() {
        // Parcour du document
        
        NodeList listeparcours = this.nroot.getElementsByTagName("annotatedElement");
        
        List<String> listId = new ArrayList<>();
        
        int nbparcours = listeparcours.getLength();
        for(int i = 0; i < nbparcours; i++){
            Element e = (Element)listeparcours.item(i);
            if (e.hasAttribute("xmi:idref")) 
                listId.add(e.getAttribute("xmi:idref"));
        }
        
        List <Element> all = getAllElement();
        
        for (Element e : all){
            if (e.hasAttribute("xmi:id") && (listId.contains(e.getAttribute("xmi:id"))))
                listId.remove(e.getAttribute("xmi:id"));
        }
        
        List <Element> toDelete = new ArrayList<>();
        for(int i = 0; i < nbparcours; i++){
            Element e = (Element)listeparcours.item(i);
            if (e.hasAttribute("xmi:idref") && (listId.contains(e.getAttribute("xmi:idref"))))
                toDelete.add(e);
        }
        
        for (Element e : toDelete){
            e.getParentNode().removeChild(e);
        }
    }

    @objid ("272ca625-28ab-4936-a0b0-04f331d97d60")
    private List<Element> getAllElement() {
        List <Element> result = new ArrayList<>();
        NodeList nodeList = this.nroot.getChildNodes();
        
        int nbChild = nodeList.getLength();
        
        List <Element> current = new ArrayList<>();
        for(int i = 0; i < nbChild; i++){
            if (nodeList.item(i) instanceof Element)
                current.add((Element)nodeList.item(i));
        }
        
        List <Element> temp = new ArrayList<>();
        boolean haveChild = true;
        
        while(haveChild){
            temp = getAllChild(current);
            haveChild = (temp.size() != 0);
            result.addAll(current);
            current.clear();
            current.addAll(temp);
            temp.clear();
        
        }
        return result;
    }

    /**
     * ?crit dans un fichier un document DOM, ?tant donn? un nom de fichier.
     * @param nomFichier le nom du fichier de sortie
     */
    @objid ("92e85a72-a8d0-429c-a364-be434100e099")
    private void ecrireDocument() {
        // on consid?re le document "doc" comme ?tant la source d'une 
        // transformation XML
        Source source = new DOMSource(this.doc);
        
        // le r?sultat de cette transformation sera un flux d'?criture dans
        // un fichier
        Result resultat = new StreamResult(new File(this.file.getAbsolutePath() + "test"));
        
        // cr?ation du transformateur XML
        Transformer transfo = null;
        try {
            transfo = TransformerFactory.newInstance().newTransformer();
        } catch(TransformerConfigurationException e) {
            Xmi.LOG.error(e);       
        }
        
        // configuration du transformateur
        
        
        if (transfo != null){
            // sortie en XML
        
            transfo.setOutputProperty(OutputKeys.METHOD, "xml");
        
            // inclut une d?claration XML (recommand?)
            transfo.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        
            // codage des caract?res : UTF-8. Ce pourrait ?tre ?galement ISO-8859-1
            transfo.setOutputProperty(OutputKeys.ENCODING, "utf-8");
        
            // idente le fichier XML
            transfo.setOutputProperty(OutputKeys.INDENT, "yes");
        
            try {
                transfo.transform(source, resultat);
            } catch(TransformerException e) {
                Xmi.LOG.error(e);       
            }
        }
    }

    @objid ("5be2deb7-1205-44af-a6bc-81e3e8424712")
    private List<Element> getAllChild(List<Element> old) {
        List <Element> result = new ArrayList<>();
        
        for (Element current : old){
            NodeList currentChild = current.getChildNodes();
            int nbChild = currentChild.getLength();
            for(int i = 0; i < nbChild; i++){
                if (currentChild.item(i) instanceof Element)
                    result.add( (Element)currentChild.item(i));
        
            }
        }
        return result;
    }

}
