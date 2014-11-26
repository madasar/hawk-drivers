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
                                    

package org.modelio.api.diagram;

import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.jface.resource.DataFormatException;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This class represents a DiagramGraphic of the 'link' kind.
 */
@objid ("b8df8e16-644a-11e0-b650-001ec947cd2a")
public interface IDiagramLink extends IDiagramGraphic {
    /**
     * Get the current font, represented by font data.
     * <p>
     * A valid font data representation is a string of the form
     * <code><it>fontname</it>-<it>style</it>-<it>height</it></code> where
     * <code><it>fontname</it></code> is the name of a font,
     * <code><it>style</it></code> is a font style (one of
     * <code>"regular"</code>, <code>"bold"</code>,
     * <code>"italic"</code>, or <code>"bold italic"</code>)
     * and <code><it>height</it></code> is an integer representing the
     * font height. Example: <code>Times New Roman-bold-36</code>.
     * </p>
     * <br>
     * Might return <code>null</code> if the corresponding style key isn't defined.
     * @return The font.
     */
    @objid ("c7f02e1f-77e3-11e0-bfdb-002564c97630")
    String getFont();

    /**
     * @return the source DiagramGraphic of the current Link.
     */
    @objid ("6d0e56cd-69b5-11e0-adf3-002564c97630")
    IDiagramGraphic getFrom();

    /**
     * Get the current line color.
     * <br>
     * Might return <code>null</code> if the corresponding style key isn't defined.
     * @return The line color.
     */
    @objid ("c7f02e21-77e3-11e0-bfdb-002564c97630")
    String getLineColor();

    /**
     * Get the current line pattern.<br>
     * - 0 : Line drawing style for solid lines<br>
     * - 1 : Line drawing style for dashed lines<br>
     * - 2 : Line drawing style for dotted lines<br>
     * - 3 : Line drawing style for alternating dash-dot lines<br>
     * - 4 : Line drawing style for dash-dot-dot lines
     * @return The line pattern.
     */
    @objid ("c7f02e23-77e3-11e0-bfdb-002564c97630")
    int getLinePattern();

    /**
     * Get the current line radius.
     * @return The line radius.
     */
    @objid ("c7f02e25-77e3-11e0-bfdb-002564c97630")
    int getLineRadius();

    /**
     * Get the current line width.
     * @return The line width.
     */
    @objid ("c7f02e27-77e3-11e0-bfdb-002564c97630")
    int getLineWidth();

    /**
     * Return the path of the current link.
     * <p>
     * The returned path is a snapshot of the current path and may freely be modified.
     * <p>
     * To apply changes, call {@link #setPath(ILinkPath)} with the modified path as parameter.
     * @return The LinkPath that represent the path of the current link.
     */
    @objid ("6d0ca911-69b5-11e0-adf3-002564c97630")
    ILinkPath getPath();

    /**
     * Get the router referenced by the link.
     * @return the router value.
     */
    @objid ("2b152870-6a8e-11e0-92b8-002564c97630")
    LinkRouterKind getRouterKind();

    /**
     * Get the current text color.
     * <br>
     * Might return <code>null</code> if the corresponding style key isn't defined.
     * @return The text color.
     */
    @objid ("c7f02e29-77e3-11e0-bfdb-002564c97630")
    String getTextColor();

    /**
     * @return the destination DiagramGraphic of the current Link.
     */
    @objid ("6d0e7ddd-69b5-11e0-adf3-002564c97630")
    IDiagramGraphic getTo();

    /**
     * Check whereas bridge are drawn on vertical line segments that cross an horizontal one.
     * @return The value of the draw line bridge property.
     */
    @objid ("bfd9c8fd-77e1-11e0-bfdb-002564c97630")
    boolean isDrawLineBridges();

    @objid ("6d0f4132-69b5-11e0-adf3-002564c97630")
    @Override
    boolean isPrimarySelected();

    @objid ("6d0f6844-69b5-11e0-adf3-002564c97630")
    @Override
    boolean isSelected();

    @objid ("6d0f1a22-69b5-11e0-adf3-002564c97630")
    @Override
    void mask();

    /**
     * Indicates whereas bridge are drawn on vertical line segments that cross an horizontal one.
     * @param value The new value of the draw line bridge property.
     */
    @objid ("bfd9f00d-77e1-11e0-bfdb-002564c97630")
    void setDrawLineBridges(final boolean value);

    /**
     * Modify the current font.
     * <p>
     * This method fails if the value does not represent font data.
     * <p>
     * A valid font data representation is a string of the form
     * <code><it>fontname</it>-<it>style</it>-<it>height</it></code> where
     * <code><it>fontname</it></code> is the name of a font,
     * <code><it>style</it></code> is a font style (one of
     * <code>"regular"</code>, <code>"bold"</code>,
     * <code>"italic"</code>, or <code>"bold italic"</code>)
     * and <code><it>height</it></code> is an integer representing the
     * font height. Example: <code>Times New Roman-bold-36</code>.
     * </p>
     * @param value The new font.
     * @exception DataFormatException if the given value does not represent font data
     */
    @objid ("c7f02e20-77e3-11e0-bfdb-002564c97630")
    void setFont(final String value) throws DataFormatException;

    /**
     * Modify the current line color.
     * @param value The new line color.
     */
    @objid ("c7f02e22-77e3-11e0-bfdb-002564c97630")
    void setLineColor(final String value);

    /**
     * Modify the current line pattern.<br>
     * - 0 : Line drawing style for solid lines<br>
     * - 1 : Line drawing style for dashed lines<br>
     * - 2 : Line drawing style for dotted lines<br>
     * - 3 : Line drawing style for alternating dash-dot lines<br>
     * - 4 : Line drawing style for dash-dot-dot lines
     * @param value The new line pattern.
     */
    @objid ("c7f02e24-77e3-11e0-bfdb-002564c97630")
    void setLinePattern(final int value);

    /**
     * Modify the current line radius.
     * @param value The new line radius.
     */
    @objid ("c7f02e26-77e3-11e0-bfdb-002564c97630")
    void setLineRadius(final int value);

    /**
     * Modify the current line width.
     * @param value The new line width.
     */
    @objid ("c7f02e28-77e3-11e0-bfdb-002564c97630")
    void setLineWidth(final int value);

    /**
     * Route the path of a link.
     * <p>
     * This method computes a path so that the link goes through the whole list of points.
     * If the router referenced by the current Link is an orthogonal router the path will have orthogonal angles.
     * If the router referenced by the
     * current Link is a direct router this method is equivalent to the setPath method.
     * @param points A collection of points that must be on the link path.
     */
    @objid ("6d0d1e44-69b5-11e0-adf3-002564c97630")
    void setPath(final Collection<Point> points);

    /**
     * This method tries to set the current link path.
     * @param linkPath The new path to use for this link.
     * @throws org.modelio.api.diagram.InvalidSourcePointException If the source point is invalid.
     * @throws org.modelio.api.diagram.InvalidPointsPathException If the given path is invalid with the router type associated with the current link.
     * @throws org.modelio.api.diagram.InvalidDestinationPointException If the destination point is invalid.
     */
    @objid ("6d0d9379-69b5-11e0-adf3-002564c97630")
    void setPath(final ILinkPath linkPath) throws InvalidSourcePointException, InvalidPointsPathException, InvalidDestinationPointException;

    /**
     * Modify the router referenced by the link.
     * @param routerKind The new router kind for this link.
     */
    @objid ("6d0e08aa-69b5-11e0-adf3-002564c97630")
    void setRouterKind(final LinkRouterKind routerKind);

    /**
     * Modify the current text color.
     * @param value The new text color.
     */
    @objid ("c7f02e2a-77e3-11e0-bfdb-002564c97630")
    void setTextColor(final String value);

    @objid ("a3d74e78-0ecc-11e2-96c4-002564c97630")
    @Override
    MObject getElement();

    /**
     * Available connection routers.
     */
    @objid ("00d00e5c-0000-1bfa-0000-000000000000")
    public enum LinkRouterKind {
        /**
         * Direct from source to destination.
         */
        DIRECT,
        /**
         * Link with bend points.
         */
        BENDPOINT,
        /**
         * Orthogonal link.
         */
        ORTHOGONAL;
    }

}
