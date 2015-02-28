/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import javax.swing.JOptionPane;

/**
 *
 * @author jonathan
 */
public class CustomSpinner extends javax.swing.JPanel {

    /**
     * Creates new form CustomSpinner
     */
    public CustomSpinner() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nbrTextField = new javax.swing.JTextField();
        decrement = new imat.ImageLabel();
        increment = new imat.ImageLabel();

        nbrTextField.setText("1");
        nbrTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nbrTextFieldKeyTyped(evt);
            }
        });

        decrement.setText("imageLabel1");
        decrement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decrementMouseClicked(evt);
            }
        });

        increment.setText("imageLabel1");
        increment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                incrementMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(decrement, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(increment, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(nbrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(increment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decrement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nbrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nbrTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nbrTextFieldKeyTyped
        // TODO make sure that the typed character is a number!
        char latestKey = evt.getKeyChar();
        int i;
        try {
            i = Integer.parseInt(latestKey + "");
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Du måste ange ett tal!");
        }

    }//GEN-LAST:event_nbrTextFieldKeyTyped

    private void decrementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decrementMouseClicked
        // TODO add your handling code here:
        decrement();
    }//GEN-LAST:event_decrementMouseClicked

    private void incrementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incrementMouseClicked
        // TODO should increase the nbr of products with 1
        increment();
    }//GEN-LAST:event_incrementMouseClicked
    
    private void increment() {
        int value = Integer.parseInt(nbrTextField.getText());
        if(value!=99) {
            value++;
        }
        nbrTextField.setText(value + "");
    }
    
    private void decrement() {
        int value = Integer.parseInt(nbrTextField.getText());
        if(!(value <= -99)) {
            value--;
        }
        nbrTextField.setText(value + "");
    }
    
    /**
     * Getter for the value of the Spinner
     * @return the value of the spinner
     */
    public int getValue() {
        return Integer.parseInt(nbrTextField.getText());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private imat.ImageLabel decrement;
    private imat.ImageLabel increment;
    private javax.swing.JTextField nbrTextField;
    // End of variables declaration//GEN-END:variables
}
