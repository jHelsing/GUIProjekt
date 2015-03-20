/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.awt.Cursor;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.JLabel;
import javax.swing.JTextField;
import se.chalmers.ait.dat215.project.IMatDataHandler;

/**
 *
 * @author Johan
 */
public class firstRegPanel extends javax.swing.JPanel {
    private IMatDataHandler userData;
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    /**
     * Creates new form firstRegPanel
     */
    public firstRegPanel() {
        initComponents();
        userData = IMatDataHandler.getInstance();
        errorLabel.setVisible(false);
        this.setBackground(IMatColors.getpanelBackgroundNormal());
        hemligRuta.setBackground(IMatColors.getpanelBackgroundNormal());
        setTextFieldColors(Color.WHITE);
    }
    
    private void setTextFieldColors(Color c) {
        jTextFieldFornamn.setBackground(c);
        jTextFieldAdress.setBackground(c);
        jTextFieldEfternamn.setBackground(c);
        jTextFieldEmail.setBackground(c);
        jTextFieldMobilnr.setBackground(c);
        jTextFieldPostnr.setBackground(c);
        jTextFieldOrt.setBackground(c);        
    }
    
    public void addObserver(PropertyChangeListener observer){
        pcs.addPropertyChangeListener(observer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldFornamn = new javax.swing.JTextField();
        jTextFieldEfternamn = new javax.swing.JTextField();
        jLabelFornamn = new javax.swing.JLabel();
        jTextFieldPostnr = new javax.swing.JTextField();
        jLabelAdress = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelMobilnr = new javax.swing.JLabel();
        jTextFieldAdress = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldOrt = new javax.swing.JTextField();
        jLabelEfternamn = new javax.swing.JLabel();
        imageLabelRegPil1 = new imat.ImageLabel("RegPil1Text.png");
        jLabelPostnr = new javax.swing.JLabel();
        jTextFieldMobilnr = new javax.swing.JTextField();
        jLabelOrt = new javax.swing.JLabel();
        nextStepButton = new imat.ImageLabel("nextStepButton.png");
        errorLabel = new javax.swing.JLabel();
        hemligRuta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jTextFieldFornamn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldEfternamn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelFornamn.setText("Förnamn:");

        jTextFieldPostnr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelAdress.setText("Adress:");

        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelMobilnr.setText("Telefonnr:");

        jTextFieldAdress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelEmail.setText("E-mail:");

        jTextFieldOrt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelEfternamn.setText("Efternamn:");

        imageLabelRegPil1.setIcon(null);
        imageLabelRegPil1.setText("imageLabel1");

        jLabelPostnr.setText("Postnr:");

        jTextFieldMobilnr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelOrt.setText("Ort:");

        nextStepButton.setIcon(null);
        nextStepButton.setText("imageLabel2");
        nextStepButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                nextStepButtonMouseMoved(evt);
            }
        });
        nextStepButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nextStepButtonFocusLost(evt);
            }
        });
        nextStepButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextStepButtonMouseClicked(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        errorLabel.setForeground(java.awt.Color.red);
        errorLabel.setText("Var god fyll i alla fält");

        hemligRuta.setEditable(false);
        hemligRuta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setText("För att kunna handla med iMat så måste du regristrera dig!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(imageLabelRegPil1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelMobilnr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMobilnr, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelAdress)
                                    .addComponent(jLabelFornamn)
                                    .addComponent(jLabelOrt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldOrt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEfternamn)
                                    .addComponent(jLabelPostnr, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPostnr, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(nextStepButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(495, 495, 495)
                        .addComponent(errorLabel)
                        .addGap(60, 60, 60)
                        .addComponent(hemligRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(457, 457, 457)
                        .addComponent(jLabel1)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(imageLabelRegPil1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorLabel)
                    .addComponent(hemligRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFornamn))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAdress)
                            .addComponent(jTextFieldAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelOrt)
                            .addComponent(jTextFieldOrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEfternamn)
                            .addComponent(jTextFieldEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPostnr)
                            .addComponent(jTextFieldPostnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMobilnr)
                            .addComponent(jTextFieldMobilnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(nextStepButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextStepButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextStepButtonMouseClicked
        userData.getCustomer().setFirstName(jTextFieldFornamn.getText());
        userData.getCustomer().setLastName(jTextFieldEfternamn.getText());
        userData.getCustomer().setAddress(jTextFieldAdress.getText());
        userData.getCustomer().setEmail(jTextFieldEmail.getText());
        userData.getCustomer().setMobilePhoneNumber(jTextFieldMobilnr.getText());
        userData.getCustomer().setPhoneNumber(jTextFieldMobilnr.getText());
        userData.getCustomer().setPostAddress(jTextFieldOrt.getText());
        userData.getCustomer().setPostCode(jTextFieldPostnr.getText());
        if (userData.isCustomerComplete() && !jTextFieldEmail.getText().equals("")){
            pcs.firePropertyChange("ToSecondRegPanel", 0, 1);
        } else {
            errorLabel.setVisible(true);
            nextStepButton.grabFocus();            
        }
        
        checkForError(jTextFieldFornamn, jLabelFornamn);
        checkForError(jTextFieldEfternamn, jLabelEfternamn);
        checkForError(jTextFieldAdress, jLabelAdress);
        checkForError(jTextFieldEmail, jLabelEmail);
        checkForError(jTextFieldMobilnr, jLabelMobilnr);
        checkForError(jTextFieldOrt, jLabelOrt);
        checkForError(jTextFieldPostnr, jLabelPostnr);
    }//GEN-LAST:event_nextStepButtonMouseClicked

    private void checkForError(JTextField tf, JLabel l){
        if (tf.getText().equals("")){
            l.setForeground(Color.red);
        } else {
            l.setForeground(Color.black);
        }
    }
    
    private void nextStepButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nextStepButtonFocusLost
        errorLabel.setVisible(false);
    }//GEN-LAST:event_nextStepButtonFocusLost

    private void nextStepButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextStepButtonMouseMoved
        nextStepButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_nextStepButtonMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField hemligRuta;
    private imat.ImageLabel imageLabelRegPil1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAdress;
    private javax.swing.JLabel jLabelEfternamn;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFornamn;
    private javax.swing.JLabel jLabelMobilnr;
    private javax.swing.JLabel jLabelOrt;
    private javax.swing.JLabel jLabelPostnr;
    private javax.swing.JTextField jTextFieldAdress;
    private javax.swing.JTextField jTextFieldEfternamn;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFornamn;
    private javax.swing.JTextField jTextFieldMobilnr;
    private javax.swing.JTextField jTextFieldOrt;
    private javax.swing.JTextField jTextFieldPostnr;
    private imat.ImageLabel nextStepButton;
    // End of variables declaration//GEN-END:variables
}
