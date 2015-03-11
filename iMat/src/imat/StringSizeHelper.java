/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

/**
 *
 * @author hilden
 */
public class StringSizeHelper {
    
    public static String getEmptyString(int n) {
        String s = "";
        if (n >= 0 && n < 6) {
            n = n + 5;
        } else if (n >= 6 && n < 12) {
            n = n + 4;
        } else if (n >= 12 && n < 18) {
            n = n + 3;
        }
        for (int i = 0; i < n; i++) {
            s = s + " ";
        }
        return s;
    }    
}