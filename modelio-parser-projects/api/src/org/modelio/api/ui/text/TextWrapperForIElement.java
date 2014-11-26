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
                                    

package org.modelio.api.ui.text;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.modelio.api.Messages;
import org.modelio.api.app.picking.IPickingClient;
import org.modelio.api.app.picking.IPickingSession;
import org.modelio.api.model.IModelingSession;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.ui.dnd.IEditorDropClient;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Reusable component wrapping an SWT Text widget (because inheriting from Text is not possible) to add the Ctrl+Space
 * auto-completion, the picking mode and the droppable features associated with the edition of a model element.
 */
@objid ("5bf2126a-911c-11e0-9de7-002564c97630")
public class TextWrapperForIElement implements IPickingClient, IEditorDropClient {
    @objid ("5bf26088-911c-11e0-9de7-002564c97630")
    private boolean acceptNullValue;

    /**
     * filter == null means everything is accepted.
     */
    @objid ("5bf2397a-911c-11e0-9de7-002564c97630")
    private IElementFilter elementFilter = null;

    @objid ("5bf2879a-911c-11e0-9de7-002564c97630")
    private Set<IElementChangeListener> listeners;

    @objid ("5bf2879d-911c-11e0-9de7-002564c97630")
    private List<Class<? extends MObject>> allowedMetaclasses;

    @objid ("d9558738-5b07-11e2-9c97-002564c97630")
    private MObject selectedElement;

    @objid ("d95c6508-5b07-11e2-9c97-002564c97630")
    protected Text textField;

    @objid ("d95dc498-5b07-11e2-9c97-002564c97630")
    private KeyAdapter keyListener = new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e)
        {
            try {
                onKeyPressed(e);
            } catch (Exception ex) {
                Modelio.getInstance().getLogService().error(null, ex);
            }
        }
    };

    @objid ("d95deba8-5b07-11e2-9c97-002564c97630")
    private FocusListener selectionListener = new FocusListener() {
        @Override
        public void focusGained(FocusEvent evt)
        {
            startPickingSession();
        }
        @Override
        public void focusLost(FocusEvent evt)
        {
            // Nothing to do
        }
    };

    @objid ("d95f4b38-5b07-11e2-9c97-002564c97630")
    protected static final Image indicatorImage;

    @objid ("bc766b13-7ff7-412a-a68e-0c767dbd3e08")
    private IPickingSession pickinSession;

    @objid ("5bf26089-911c-11e0-9de7-002564c97630")
    public boolean isAcceptNullValue() {
        return this.acceptNullValue;
    }

    @objid ("5bf2608d-911c-11e0-9de7-002564c97630")
    public void setAcceptNullValue(final boolean acceptNullValue) {
        this.acceptNullValue = acceptNullValue;
    }

    @objid ("5bf2aead-911c-11e0-9de7-002564c97630")
    public void addAllowedMetaclass(final Class<? extends MObject> allowedMetaclass) {
        this.allowedMetaclasses.add(allowedMetaclass);
        updateTooltip();
    }

    @objid ("5bf2d5bb-911c-11e0-9de7-002564c97630")
    public boolean removeAllowedMetaclass(final Class<? extends MObject> allowedMetaclass) {
        boolean remove = this.allowedMetaclasses.remove(allowedMetaclass);
        updateTooltip();
        return remove;
    }

    @objid ("5bf2fcce-911c-11e0-9de7-002564c97630")
    public void addAllowedMetaclasses(final List<Class<? extends MObject>> metaclasses) {
        this.allowedMetaclasses.addAll(metaclasses);
        updateTooltip();
    }

    @objid ("5bf323e0-911c-11e0-9de7-002564c97630")
    public boolean removeAllowedMetaclasses(final List<Class<? extends MObject>> metaclasses) {
        boolean removeAll = this.allowedMetaclasses.removeAll(metaclasses);
        updateTooltip();
        return removeAll;
    }

    @objid ("5bf34af3-911c-11e0-9de7-002564c97630")
    public List<Class<? extends MObject>> getAllowedMetaclasses() {
        return this.allowedMetaclasses;
    }

    /**
     * C'tor.
     * @param parent parent control.
     * @param initialElement initial value.
     * @param acceptNullValue whether the null value should be accepted or not.
     */
    @objid ("5bf39914-911c-11e0-9de7-002564c97630")
    public TextWrapperForIElement(final Composite parent, final MObject initialElement, final boolean acceptNullValue, final List<Class<? extends MObject>> allowedMetaclasses) {
        this.selectedElement = initialElement;
        this.acceptNullValue = acceptNullValue;
        this.allowedMetaclasses = new ArrayList<>();
        if (allowedMetaclasses != null) {
            this.allowedMetaclasses.addAll(allowedMetaclasses);
        }
        
        createContent(parent);
    }

    /**
     * Search model elements by their name.
     * @param metaclasses metaclasses of the searched elements
     * @param nameValue name of the searched elements
     * @param filter a filter that allow to restrict the result scope. can be null.
     * @return the found elements.
     */
    @objid ("5bf3e737-911c-11e0-9de7-002564c97630")
    public List<MObject> findByName(final List<Class<? extends MObject>> metaclasses, final String nameValue, final IElementFilter filter) {
        IModelingSession session = Modelio.getInstance().getModelingSession();
        List<MObject> ret = new ArrayList<>();
        
        for (Class<? extends MObject> c : metaclasses) {
            ret.addAll(session.findByAtt(c, "Name", nameValue));
        }
        
        if (filter != null) {
            List<MObject> filteredResults = new ArrayList<>();
        
            for (MObject e : ret) {
                if (filter.accept(e)) {
                    filteredResults.add(e);
                }
            }
        
            ret = filteredResults;
        }
        return ret;
    }

    @objid ("5bf43559-911c-11e0-9de7-002564c97630")
    protected void onKeyPressed(final KeyEvent e) {
        // On 'ENTER' perform the following:
        // - search for an element which name is the currently entered text
        // value
        // - if a unique element is found, validate the entry with it
        // - if several elements are found, open the FinderDialog initialized by
        // the search results
        // - if no element is found, open the FinderDialog initialized by a
        // regexp (current text + .*) and start the search immediately
        // - Validate the entry when the FinderDialog returns
        
        if (e.character == '\r') {
            ElementFinder finder = new ElementFinder(Modelio.getInstance().getModelingSession());
            List<MObject> elements = finder.findByName(this.allowedMetaclasses, this.textField.getText(), this.elementFilter);
        
            if (elements.isEmpty()) {
                String filter = this.textField.getText() + ".*";
                elements = finder.search(this.allowedMetaclasses, filter, this.elementFilter);
        
                if (elements.isEmpty()) {
        
                    //                    MessageDialog.openInformation(Display.getDefault().getActiveShell(),
                    //                                                  Messages.getString("HybridNotFoundTitle"),
                    //                                                  Messages.getString("HybridNotFoundMessage"));
        
                    setContent(null);
                    //validate(false);
        
                } else if (elements.size() == 1) {
                    setContent(elements.get(0));
        
                } else {
                    // We have several found elements
                    ResultsProposalPopup rp = new ResultsProposalPopup(this.textField, elements, this.acceptNullValue);
                    ModelElement selected = (ModelElement) rp.getChoice();
        
                    setContent(selected);
        
                }
            } else if (elements.size() == 1) {
                setContent(elements.get(0));
        
            } else {
                // We have several found elements
                ResultsProposalPopup rp = new ResultsProposalPopup(this.textField, elements, this.acceptNullValue);
                ModelElement selected = (ModelElement) rp.getChoice();
        
                setContent(selected);
        
            }
        
            return;
        } else if ((e.character == ' ') && ((e.stateMask & SWT.CTRL) != 0)) {
            String filter = this.textField.getText() + ".*";
            ElementFinder finder = new ElementFinder(Modelio.getInstance().getModelingSession());
            List<MObject> elements = finder.search(this.allowedMetaclasses, filter, this.elementFilter);
        
            if (elements.isEmpty()) {
                MessageDialog.openInformation(Display.getDefault().getActiveShell(),
                                              Messages.getMessage("HybridNotFoundTitle"),
                                              Messages.getMessage("HybridNotFoundMessage"));
                validate(false);
            } else if (elements.size() == 1 && !this.acceptNullValue) {
                setContent(elements.get(0));
        
            } else {
                // We have several found elements
                ResultsProposalPopup rp = new ResultsProposalPopup(this.textField, elements, this.acceptNullValue);
                ModelElement selected = (ModelElement) rp.getChoice();
        
                setContent(selected);
        
            }
        } else if (e.character == SWT.ESC) {
            validate(false);
        }
    }

    @objid ("5bf45c67-911c-11e0-9de7-002564c97630")
    protected void startPickingSession() {
        if (this.selectedElement != null) {
            String initialValue = this.selectedElement.getName();
            this.textField.setText(initialValue);
        }
        
        this.textField.selectAll();
        
        this.pickinSession = Modelio.getInstance().getPickingService().startPickingSession(this);
    }

    @objid ("5bf45c69-911c-11e0-9de7-002564c97630")
    public void createContent(final Composite parent) {
        this.textField = new Text(parent, SWT.BORDER);
        
        updateTooltip();
        this.textField.addPaintListener(new PaintListener() {
        
            @Override
            public void paintControl(PaintEvent e)
            {
                GC gc = e.gc;
                Rectangle oldClip = gc.getClipping();
                Rectangle clip = new Rectangle(e.x, e.y, e.width, e.height);
                Rectangle textBounds = TextWrapperForIElement.this.textField.getBounds();
                textBounds.x = 0;
                textBounds.y = 0;
                textBounds.height = textBounds.height-5;
                textBounds.width = textBounds.width-5;
        
                Display display = Display.getCurrent();
                if (TextWrapperForIElement.this.textField.isFocusControl()) {
                    Color color = display.getSystemColor(SWT.COLOR_BLUE);
                    gc.setForeground(color);
                    gc.setClipping(clip);
                    gc.drawRectangle(textBounds);
                    gc.setClipping(oldClip);
                }
        
                if (indicatorImage != null) {
                    Rectangle imageRect = indicatorImage.getBounds();
                    gc.drawImage(indicatorImage, textBounds.x + textBounds.width - imageRect.width, textBounds.y);
                }
            }
        
        });
        if (this.selectedElement != null) {
            String text = this.selectedElement.getName();
            if (this.selectedElement.getCompositionOwner() != null)
                text = text + "  (from " + ((ModelElement) this.selectedElement.getCompositionOwner()).getName() + ")";
            this.textField.setData(this.selectedElement);
            this.textField.setText(text);
        }
        
        this.textField.addKeyListener(this.keyListener);
        this.textField.addFocusListener(this.selectionListener);
        
        initDropTarget();
    }

    @objid ("5bf48377-911c-11e0-9de7-002564c97630")
    private void setContent(final MObject content) {
        if (content != null) {
            ModelElement me = (ModelElement) content;
            String text = me.getName();
            if (me.getCompositionOwner() != null)
                text = text + "  (from " + ((ModelElement) me.getCompositionOwner()).getName() + ")";
            // update text and data
            this.textField.setData(content);
            this.textField.setText(text);
            validate(true);
        } else {
            // only update data
            this.textField.setData(null);
            validate(true);
        }
    }

    @objid ("5bf4837a-911c-11e0-9de7-002564c97630")
    @Override
    public boolean acceptElement(final MObject target) {
        for (Class<?> c : this.allowedMetaclasses) {
            if (target != null && c.isAssignableFrom(target.getClass())) {
                return true;
            }
        }
        return target == null && this.acceptNullValue;
    }

    @objid ("5bf4d198-911c-11e0-9de7-002564c97630")
    @Override
    public boolean setElement(final MObject target) {
        if (acceptElement(target)) {
            setContent(target);
        
            return true;
        }
        // else
        return false;
    }

    @objid ("5bf4f8a9-911c-11e0-9de7-002564c97630")
    private void validate(final boolean save) {
        // Clean up
        endPickingSession();
        
        if (save) {
            // Update the data model from the content of the text field.
            MObject oldElement = this.selectedElement;
            this.selectedElement = (ModelElement) this.textField.getData();
            fireSelectedElementChanged(oldElement, this.selectedElement);
        
        }
    }

    @objid ("5bf4f8ac-911c-11e0-9de7-002564c97630")
    private void initDropTarget() {
        /* TODO 
        EditorDropListener dropListener = new EditorDropListener(this);
        
        int operations = DND.DROP_MOVE | DND.DROP_COPY;
        Transfer[] types = new Transfer[] { ModelElementTransfer.getInstance(), PluginTransfer.getInstance() };
        DropTarget target = new DropTarget(this.textField, operations);
        target.setTransfer(types);
        
        target.addDropListener(dropListener);
        */
    }

    @objid ("5bf51fba-911c-11e0-9de7-002564c97630")
    @Override
    public boolean acceptDroppedElements(final MObject[] target) {
        if (target.length != 1) {
            return false;
        }
        
        for (Class<?> c : this.allowedMetaclasses) {
            if (c.isAssignableFrom(target[0].getClass())) {
                return true;
            }
        }
        return false;
    }

    @objid ("5bf546cd-911c-11e0-9de7-002564c97630")
    @Override
    public void setDroppedElements(final MObject[] dropedElement) {
        if (acceptElement(dropedElement[0])) {
            setContent(dropedElement[0]);
        }
    }

    @objid ("5bf56de0-911c-11e0-9de7-002564c97630")
    @Override
    public void pickingAborted() {
        // end our picking session;
        endPickingSession();
    }

    /**
     * @param elementFilter
     */
    @objid ("5bf594ee-911c-11e0-9de7-002564c97630")
    public void setElementFilter(final IElementFilter elementFilter) {
        this.elementFilter = elementFilter;
    }

    @objid ("5bf5bbfe-911c-11e0-9de7-002564c97630")
    public void addListener(final IElementChangeListener listener) {
        if (this.listeners == null) {
            this.listeners = new HashSet<>();
        }
        this.listeners.add(listener);
    }

    @objid ("5bf5bc01-911c-11e0-9de7-002564c97630")
    public void removeListener(final IElementChangeListener listener) {
        if (this.listeners != null) {
            this.listeners.remove(listener);
        }
    }

    @objid ("5bf5e311-911c-11e0-9de7-002564c97630")
    private void fireSelectedElementChanged(final MObject oldElement, final MObject newElement) {
        if (this.listeners != null) {
            for (IElementChangeListener listener : this.listeners) {
                listener.selectedElementChanged(oldElement, newElement);
            }
        }
    }

    @objid ("5bf60a20-911c-11e0-9de7-002564c97630")
    public Text getTextField() {
        return this.textField;
    }

    @objid ("5bf63131-911c-11e0-9de7-002564c97630")
    protected void endPickingSession() {
        try {
            Modelio.getInstance().getPickingService().endPickingSession(this.pickinSession);
        } catch (IllegalStateException e) {
            // Picking session already closed
        }
    }

    @objid ("6b3f5259-9746-11e0-bb39-002564c97630")
    private void updateTooltip() {
        StringBuffer helpTooltip = new StringBuffer();
        if (this.allowedMetaclasses.size() > 1) {
            helpTooltip.append(Messages.getMessage("AcceptedTypes"));
        } else if (this.allowedMetaclasses.size() == 1) {
            helpTooltip.append(Messages.getMessage("AcceptedType"));
        }
        helpTooltip.append("\n");
        for (Class<? extends MObject> clazz : this.allowedMetaclasses) {
            helpTooltip.append("    ");
            helpTooltip.append(Metamodel.getMClass(clazz).getName());
            helpTooltip.append("\n");
        }
        helpTooltip.append("\n");
        helpTooltip.append(Messages.getMessage("HybridCellEditorTootip"));
        
        this.textField.setToolTipText(helpTooltip.toString());
    }


static {
        ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin("org.modelio.ui", "icons/indicator.png");
        if (imageDescriptor != null) {
            indicatorImage = imageDescriptor.createImage();
        } else {
            // Image not found
            indicatorImage = null;
        }
    }
    /**
     * This class allow to find elements by their name.
     * 
     * The search  can be done with an exact name or with a regular expression.
     * In the two cases a filter can be specified. If null is specified for the filter
     * the full list of found elements is returned.
     */
    @objid ("5bf63134-911c-11e0-9de7-002564c97630")
    static class ElementFinder {
        @objid ("5bf63136-911c-11e0-9de7-002564c97630")
        private IModelingSession session;

        /**
         * Constructor.
         * @param session the session in which to search the elements.
         */
        @objid ("5bf65842-911c-11e0-9de7-002564c97630")
        public ElementFinder(final IModelingSession session) {
            this.session = session;
        }

        /**
         * Search model elements by their name.
         * @param metaclasses metaclasses of the searched elements
         * @param nameValue name of the searched elements
         * @param filter a filter that allow to restrict the result scope. can be null.
         * @return the found elements.
         */
        @objid ("5bf65846-911c-11e0-9de7-002564c97630")
        public List<MObject> findByName(final List<Class<? extends MObject>> metaclasses, final String nameValue, final IElementFilter filter) {
            List<MObject> ret = new ArrayList<>();
            
            for (Class<? extends MObject> c : metaclasses) {
                ret.addAll(this.session.findByAtt(c, "Name", nameValue));
            }
            
            if (filter != null) {
                List<MObject> filteredResults = new ArrayList<>();
            
                for (MObject e : ret) {
                    if (filter.accept(e)) {
                        filteredResults.add(e);
                    }
                }
            
                ret = filteredResults;
            }
            return ret;
        }

        /**
         * Search model elements by their name accordingly to a regular exception..
         * @param metaclasses metaclasses of the searched elements
         * @param regexp a regular expression that will be matched with name of the searched elements
         * @param filter a filter that allow to restrict the result scope. Can be null.
         * @return the found elements.
         */
        @objid ("5bf6a66a-911c-11e0-9de7-002564c97630")
        public List<MObject> search(final List<Class<? extends MObject>> metaclasses, final String regexp, final IElementFilter filter) {
            Set<MObject> rawResults = new HashSet<>();
            for (Class<? extends MObject> c : metaclasses) {
                rawResults.addAll (this.session.findByClass(c));
            }
            
            ModelTree predefTypes= this.session.getModel().getUmlTypes().getBOOLEAN().getOwner();
            rawResults.remove(predefTypes);
            rawResults.remove(predefTypes.getOwner());
            
            List<MObject> filteredResults = new ArrayList<>();
            
            Pattern p = Pattern.compile(regexp);
            
            for (MObject e : rawResults) {
                if (e instanceof ModelElement) {
                    ModelElement me = (ModelElement) e;
                    if (p.matcher(me.getName()).matches() && filter == null) {
                        filteredResults.add(e);
                    } else if (p.matcher(me.getName()).matches() && filter.accept(e)) {
                        filteredResults.add(e);
                    }
                }
            }
            return filteredResults;
        }

    }

}
