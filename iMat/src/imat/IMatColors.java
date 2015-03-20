/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;

/**
 * Holds all the colors of components of the iMat project. This class can not be
 * instantiated but provides the different colors to any class.
 *
 * @author Jonathan
 */
public class IMatColors {
    
    private final static Color PANELBACKGROUND_DARK = new Color(178, 224, 112);
    //private final static Color PANELBACKGROUND_LIGHT = new Color(210, 246, 157);
    private final static Color PANELBACKGROUND_LIGHT = new Color(248, 248, 248);
    private final static Color PANELBACKGROUND_NORMAL = Color.WHITE;
    private final static Color BUTTONCOLOR_NORMAL = new Color(0,0,0);
    private final static Color BUTTONCOLOR_HOOVER = new Color(0,0,0);
    private final static Color BUTTONCOLOR_PRESSED = new Color(0,0,0);
    private final static Color BUTTONCOLOR_HIGHLIGHT = new Color(30, 105, 18);
    private final static Color TEXTCOLOR_LIGHT = new Color(210, 246, 157);
    private final static Color TEXTCOLOR_DARK = new Color(1,47,17);
    private final static Color TRANSPARENT = new Color(0,0,0,1);
    
    private IMatColors() {}
    
    public static Color getpanelBackgroundDark() {
        return PANELBACKGROUND_DARK;
    }
    
    public static Color getpanelBackgroundLight() {
        return PANELBACKGROUND_LIGHT;
    }
    
    public static Color getpanelBackgroundNormal() {
        return PANELBACKGROUND_NORMAL;
    }
    
    public static Color getButtonColorNormal() {
        return BUTTONCOLOR_NORMAL;
    }
    
    public static Color getButtonColorHoover() {
        return BUTTONCOLOR_HOOVER;
    }
    
    public static Color getButtonColorPressed() {
        return BUTTONCOLOR_PRESSED;
    }
    
    /**
     * Getter for the color of a "notice" me button. Like the to checkout
     * button.
     * @return the color of a highlight button
     */
    public static Color getButtonColorHighlight() {
        return BUTTONCOLOR_HIGHLIGHT;
    }
    
    /**
     * Getter for the light color of the text in iMat.
     * @return the light color.
     */
    public static Color getTextColorLight() {
        return TEXTCOLOR_LIGHT;
    }
    
    /**
     * Getter for the dark color of the text in iMat.
     * @return the dark color.
     */
    public static Color getTextColorDark() {
        return TEXTCOLOR_DARK;
    }
    
    public static Color getTransparent() {
        return TRANSPARENT;
    }
    
}