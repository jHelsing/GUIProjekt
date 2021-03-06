/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import se.chalmers.ait.dat215.project.IMatDataHandler;

/**
 *
 * @author Johan
 */
public class confirmRegPanel extends javax.swing.JPanel {

    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private IMatDataHandler userData = IMatDataHandler.getInstance();

    /**
     * Creates new form confirmRegPanel
     */
    public confirmRegPanel() {
        initComponents();
        jButtonToCheckout.setVisible(false);
        this.setBackground(IMatColors.getpanelBackgroundNormal());
    }
    
    public void enableSTPLabel(boolean b) {
        jButtonToCheckout.setVisible(b);
        jButtonToCheckout.setEnabled(b);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        namnLabel = new javax.swing.JLabel();
        adressLabel = new javax.swing.JLabel();
        emailblabla = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        jButtonToCheckout = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Välkommen till iMat!");

        jLabel2.setText("Du kan nu börja handla!");

        jLabel3.setText("Om du vill ändra dina uppgifter kan du göra detta via din profilsida.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Namn:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Adress:");

        namnLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        namnLabel.setText("Namn:");

        adressLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        adressLabel.setText("Adress:");

        emailblabla.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        emailblabla.setText("Email:");

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        emailLabel.setText("Adress:");

        jButtonToCheckout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/toCheckoutButton.png"))); // NOI18N
        jButtonToCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonToCheckoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(517, 517, 517)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(451, 451, 451)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(emailblabla)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(namnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(495, 495, 495))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButtonToCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namnLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(adressLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailblabla)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButtonToCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonToCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonToCheckoutActionPerformed
        pcs.firePropertyChange("ToCheckout", 0, 1);
    }//GEN-LAST:event_jButtonToCheckoutActionPerformed

    public void setRegInfo() {
        String fornamn = userData.getCustomer().getFirstName();
        String efternamn = userData.getCustomer().getLastName();
        String adress = userData.getCustomer().getAddress();
        String postNr = userData.getCustomer().getPostCode();
        String stad = userData.getCustomer().getPostAddress();
        String mail = userData.getCustomer().getEmail();
        namnLabel.setText(fornamn + " " + efternamn);
        adressLabel.setText(adress + " - " + postNr + " " + stad);
        emailLabel.setText(mail);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adressLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailblabla;
    private javax.swing.JButton jButtonToCheckout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel namnLabel;
    // End of variables declaration//GEN-END:variables
}
