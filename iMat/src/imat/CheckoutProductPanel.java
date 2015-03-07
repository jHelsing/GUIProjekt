/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Johan
 */
public class CheckoutProductPanel extends javax.swing.JPanel {

    private IMatDataHandler userData = IMatDataHandler.getInstance();
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private Product p;
    private int antal;
    
    /**
     * Creates new form CheckoutProductPanel
     */
    public CheckoutProductPanel() {
        initComponents();
    }
    
    public CheckoutProductPanel(int antal, Product p) {
        initComponents();
        
        this.antal = antal;
        this.p = p;
        jTextFieldAntal.setText(antal + "");
        jLabelSuffix.setText(p.getUnitSuffix());
        jLabelProduktNamn.setText(p.getName());
        jLabelPrisPerSuffix.setText(p.getPrice() + " kr/" + p.getUnitSuffix());
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

        imageLabelTaBort = new imat.ImageLabel("deleteItemCheckoutButton.png");
        imageLabelMinska = new imat.ImageLabel("checkoutMinusButton.png");
        imageLabelÖka = new imat.ImageLabel("checkoutPlusButton.png");
        jLabelSuffix = new javax.swing.JLabel();
        jTextFieldAntal = new javax.swing.JTextField();
        jLabelProduktNamn = new javax.swing.JLabel();
        jLabelPrisPerSuffix = new javax.swing.JLabel();

        imageLabelTaBort.setText("imageLabel2");
        imageLabelTaBort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLabelTaBortMouseClicked(evt);
            }
        });

        imageLabelMinska.setText("imageLabel2");
        imageLabelMinska.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLabelMinskaMouseClicked(evt);
            }
        });

        imageLabelÖka.setText("imageLabel2");
        imageLabelÖka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLabelÖkaMouseClicked(evt);
            }
        });

        jLabelSuffix.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSuffix.setText("st");

        jTextFieldAntal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldAntal.setText("1");

        jLabelProduktNamn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelProduktNamn.setText("<Kycklingbröstfile>");

        jLabelPrisPerSuffix.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPrisPerSuffix.setText("X kr/st");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jTextFieldAntal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSuffix)
                .addGap(26, 26, 26)
                .addComponent(jLabelProduktNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(jLabelPrisPerSuffix)
                .addGap(10, 10, 10)
                .addComponent(imageLabelTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(imageLabelMinska, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(650, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(imageLabelÖka, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(589, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldAntal, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(jLabelSuffix)
                        .addComponent(jLabelProduktNamn)
                        .addComponent(jLabelPrisPerSuffix))
                    .addComponent(imageLabelTaBort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(imageLabelMinska, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(imageLabelÖka, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void imageLabelMinskaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelMinskaMouseClicked
        antal--;
        List<ShoppingItem> items = userData.getShoppingCart().getItems();
        
        for (int i = items.size() - 1; i >= 0; i--){
            if (items.get(i).getProduct().getName().equals(this.jLabelProduktNamn.getText())){
                userData.getShoppingCart().removeItem(i);
            }
        }
        if (antal > 0){
            userData.getShoppingCart().addProduct(p, antal);
        }
    }//GEN-LAST:event_imageLabelMinskaMouseClicked

    private void imageLabelÖkaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelÖkaMouseClicked
        userData.getShoppingCart().addProduct(p);
    }//GEN-LAST:event_imageLabelÖkaMouseClicked

    private void imageLabelTaBortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelTaBortMouseClicked
        List<ShoppingItem> items = userData.getShoppingCart().getItems();
        
        for (int i = items.size() - 1; i >= 0; i--){
            if (items.get(i).getProduct().getName().equals(this.jLabelProduktNamn.getText())){
                userData.getShoppingCart().removeItem(i);
            }
        }
        
    }//GEN-LAST:event_imageLabelTaBortMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private imat.ImageLabel imageLabelMinska;
    private imat.ImageLabel imageLabelTaBort;
    private imat.ImageLabel imageLabelÖka;
    private javax.swing.JLabel jLabelPrisPerSuffix;
    private javax.swing.JLabel jLabelProduktNamn;
    private javax.swing.JLabel jLabelSuffix;
    private javax.swing.JTextField jTextFieldAntal;
    // End of variables declaration//GEN-END:variables
}