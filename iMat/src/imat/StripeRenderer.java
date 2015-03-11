package imat;

import javax.swing.*;
import java.awt.*;
/**
 * A class to implement a striped background for jLists.
 * @author hilden
 */
public class StripeRenderer extends DefaultListCellRenderer {
 public Component getListCellRendererComponent(JList list,
     Object value, int index, boolean isSelected, boolean cellHasFocus) {
     JLabel label = (JLabel) super.getListCellRendererComponent(
         list,
         value,
         index,
         isSelected,
         cellHasFocus
         );
 
     if(index%2 == 0) {
         if(! list.isSelectedIndex(index)) {
             label.setBackground(IMatColors.getpanelBackgroundLight());
         } else {
             label.setBackground(new Color(255,255,200));            
         }
     }
 
     return label;
 }
}