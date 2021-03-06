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
    private Color c;
    
    /**
     * Creates new form CheckoutProductPanel
     */
    public CheckoutProductPanel() {
        initComponents();
    }
    
    public CheckoutProductPanel(int antal, Product p, Color c) {
        initComponents();
        this.setBackground(IMatColors.getpanelBackgroundNormal());
        this.c = c;
        this.antal = antal;
        this.p = p;
        jLabelAntal.setText(antal + " " + p.getUnitSuffix());
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

        jLabelAntal = new javax.swing.JLabel();
        jLabelProduktNamn = new javax.swing.JLabel();
        jLabelPrisPerSuffix = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        jLabelAntal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAntal.setText("0 st");

        jLabelProduktNamn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelProduktNamn.setText("<Kycklingbröstfile>");

        jLabelPrisPerSuffix.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPrisPerSuffix.setText("X kr/st");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAntal)
                .addGap(26, 26, 26)
                .addComponent(jLabelProduktNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(jLabelPrisPerSuffix)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAntal)
                    .addComponent(jLabelProduktNamn)
                    .addComponent(jLabelPrisPerSuffix))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        this.setBackground(IMatColors.getpanelBackgroundLight());
    }//GEN-LAST:event_formMouseMoved

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(IMatColors.getpanelBackgroundNormal());
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAntal;
    private javax.swing.JLabel jLabelPrisPerSuffix;
    private javax.swing.JLabel jLabelProduktNamn;
    // End of variables declaration//GEN-END:variables
}
