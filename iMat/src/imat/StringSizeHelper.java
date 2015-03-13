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
    
    public static String getEmptyString(String string, int baseSpace) {
        int n = string.length();
        int nbrOfSpaces = baseSpace - string.length();
        String space = "";
        
        if (n >= 0 && n < 3) {
            nbrOfSpaces = nbrOfSpaces + 6;
        } else if (n >= 3 && n < 6) {
            nbrOfSpaces = nbrOfSpaces + 5;
        } else if (n >= 6 && n < 9) {
            nbrOfSpaces = nbrOfSpaces + 4;
        } else if (n >= 9 && n < 12) {
            nbrOfSpaces = nbrOfSpaces + 3;
        } else if (n >= 12 && n < 15) {
            nbrOfSpaces = nbrOfSpaces + 2;
        } else if (n >= 15 && n < 18) {
            nbrOfSpaces = nbrOfSpaces + 1;
        }
        
        
        
        for (int j = 0; j < string.length(); j++) {
            char c = string.charAt(j);
            if (c == 'i') {
                nbrOfSpaces++;
            } else if (c == 'm') {
                nbrOfSpaces--;
            }
        }
        
        for (int i = 0; i < nbrOfSpaces; i++) {
            space = space + " ";
        }
        return space;
    }    
}