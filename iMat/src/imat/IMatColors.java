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
    
    private final static Color PANELBACKGROUND_DARK = new Color(0,0,0);
    private final static Color PANELBACKGROUND_LIGHT = new Color(0,0,0);
    private final static Color PANELBACKGROUND_NORMAL = new Color(0,0,0);
    private final static Color BUTTONCOLOR_NORMAL = new Color(0,0,0);
    private final static Color BUTTONCOLOR_HOOVER = new Color(0,0,0);
    private final static Color BUTTONCOLOR_PRESSED = new Color(0,0,0);
    private final static Color TEXTCOLOR_LIGHT = new Color(0,0,0);
    private final static Color TEXTCOLOR_DARK = new Color(0,0,0);
    
    private final static Color BUTTONCOLOR_HIGHLIGHT = new Color(255,255,255);
    
    
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
    
    public static Color getButtonColorHighlight() {
        return BUTTONCOLOR_HIGHLIGHT;
    }
    
    public static Color getTextColorLight() {
        return TEXTCOLOR_LIGHT;
    }
    
    public static Color getTextColorDark() {
        return TEXTCOLOR_DARK;
    }
    
}