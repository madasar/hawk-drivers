package org.modelio.xmi.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import org.modelio.app.core.navigate.IModelioNavigationService;
import org.modelio.gproject.fragment.IProjectFragment;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;
//import org.modelio.xmi.gui.report.ReportModel;



public abstract class XMIProperties {

    public static final String modelerModuleName = "ModelerModule";

    protected boolean roundtripEnabled = false;

    private String filePath = "";

    //private ReportModel report = null;

    protected Map<String, ArrayList<String>> classTabConvertion = null;

    protected IMModelServices mmServices = null;

   // private IModelioNavigationService navigationServices = null;

    private ModelioTypes modelioTypes = null;

    private EcoreUMLTypes ecoreUMLTypes = null;

    private ModelElement rootElement = null;

    private File tempFolder = null;


    /**
     * This method allows to know if the Modelio annotation are available
     * @return true if the imported XMI files contains Modelio annotations
     */
    public boolean isRoundtripEnabled() {
        return this.roundtripEnabled;
    }


    public void setRoundtripEnabled(boolean enableRoundtrip) {
        this.roundtripEnabled = enableRoundtrip;
    }

/*
    public ReportModel getReportModel() {
        return this.report;
    }

    public void setReportModel(final ReportModel newReport) {
        this.report = newReport;
    }*/

    /**
     * This methods specify the path of the imported file
     * @param file : the imported file
     */
    public void setFilePath(final File file) {
        this.filePath = file.getAbsolutePath();
    }

    /**
     * This method allows to specify the path of the imported file
     * @param filePath : the imported file path
     */
    public void setFilePath(final String path) {
        this.filePath = path;
    }

    /**
     * This methods returns the path of the imported file
     * @return the imported file path
     */
    public String getFilePath() {
        return this.filePath;
    }

    public String getFileDirectory() {
        File temp = new File(this.filePath);
        return temp.getParentFile().getAbsolutePath();
    }

    /**
     * This method returns the model services
     * @return the model services
     */
    public IMModelServices getMModelServices() {
        return this.mmServices;
    }

    public EcoreUMLTypes getEcoreUMLTypes() {
        return this.ecoreUMLTypes;
    }


    public ModelioTypes getModelioTypes() {
        return this.modelioTypes;
    }



   /* public void setNavigationServices(final IModelioNavigationService navigationServices) {
        this.navigationServices = navigationServices;
    }
*/

    protected void initialize(final IMModelServices mmoServices) {
        this.mmServices = mmoServices;
        this.modelioTypes = new ModelioTypes(mmoServices);
        this.ecoreUMLTypes = new EcoreUMLTypes();
    }


    /**
     * This methods returns the path of the imported file
     * @return the imported file path
     
    public IModelioNavigationService getNavigationServices() {
        return this.navigationServices;
    }
*/
    public List<MObject> getModelRoots() {
        List<MObject> ret = new ArrayList<>();
        for (IProjectFragment fragment : GProject.getProject(this.rootElement).getFragments()) {
            switch (fragment.getType()) {
            case EXML:
            case EXML_SVN:
                ret.addAll(fragment.getRoots());
                break;
            default:
                // do nothing
                break;
            }
        }
        return ret;
    }

    public List<MObject> getLibraryRoots() {
        List<MObject> ret = new ArrayList<>();
        for (IProjectFragment fragment : GProject.getProject(this.rootElement).getFragments()) {
            switch (fragment.getType()) {
            case RAMC:
            case EXML_URL:
                ret.addAll(fragment.getRoots());
                break;
            default:
                // do nothing
                break;
            }
        }
        return ret;
    }

    public ModelElement getRootElement(){
        return this.rootElement;
    }

    public File getTempFolder(){

        if (this.tempFolder != null){
            return this.tempFolder;
        }else{
            
            this.tempFolder = new File(GProject.getProject(this.rootElement).getProjectPath().toString() 
                    + java.io.File.separator + "XMI" + java.io.File.separator + "temp");

            if (! this.tempFolder.exists()){
                this.tempFolder.mkdirs();
                this.tempFolder.mkdir();
            }
            
            return this.tempFolder;
        }
    }
    
 }
