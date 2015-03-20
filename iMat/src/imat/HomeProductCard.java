/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Cursor;
import java.awt.Dimension;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Johan
 */
public class HomeProductCard extends javax.swing.JPanel {
    
    private IMatDataHandler userData = IMatDataHandler.getInstance();
    private Product item;
    private final Dimension size = new Dimension(251, 251);
    /**
     * Creates new form HomeProductCard
     */
    public HomeProductCard(Product p) {
        initComponents();
        item = p;
        jLabelEnhet.setText(p.getUnitSuffix());
        jLabelNamn.setText(p.getName());
        jLabelPrisPerEnhet.setText(p.getPrice() + " kr/" + p.getUnitSuffix());
        produktBild.setIcon(userData.getImageIcon(p, size));
        repaint();
        revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNamn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelPrisPerEnhet = new javax.swing.JLabel();
        jTextFieldAntal = new javax.swing.JTextField();
        jLabelEnhet = new javax.swing.JLabel();
        produktBild = new javax.swing.JLabel();
        minusButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        addToCartButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabelNamn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNamn.setText("<Produktnamn>");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Just nu endast");

        jLabelPrisPerEnhet.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelPrisPerEnhet.setText("X kr/Unit");

        jTextFieldAntal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldAntal.setText("1");
        jTextFieldAntal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAntalKeyTyped(evt);
            }
        });

        jLabelEnhet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEnhet.setText("Unit");

        minusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/checkoutMinusButton.png"))); // NOI18N
        minusButton.setBorderPainted(false);
        minusButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        minusButton.setMaximumSize(new java.awt.Dimension(40, 40));
        minusButton.setMinimumSize(new java.awt.Dimension(40, 40));
        minusButton.setPreferredSize(new java.awt.Dimension(40, 40));
        minusButton.setSize(new java.awt.Dimension(40, 40));
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        plusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/checkoutPlusButton.png"))); // NOI18N
        plusButton.setBorderPainted(false);
        plusButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        plusButton.setMaximumSize(new java.awt.Dimension(40, 40));
        plusButton.setMinimumSize(new java.awt.Dimension(40, 40));
        plusButton.setPreferredSize(new java.awt.Dimension(40, 40));
        plusButton.setSize(new java.awt.Dimension(40, 40));
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        addToCartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/addToCartButton.png"))); // NOI18N
        addToCartButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        addToCartButton.setMaximumSize(new java.awt.Dimension(135, 40));
        addToCartButton.setMinimumSize(new java.awt.Dimension(135, 40));
        addToCartButton.setPreferredSize(new java.awt.Dimension(135, 40));
        addToCartButton.setRolloverEnabled(true);
        addToCartButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/Hoover/addToCartButton_Hoover.png"))); // NOI18N
        addToCartButton.setSize(new java.awt.Dimension(135, 40));
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(produktBild, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabelNamn)
                            .addComponent(jLabelPrisPerEnhet))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldAntal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEnhet))
                                .addGap(197, 197, 197))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(addToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabelNamn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPrisPerEnhet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAntal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEnhet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(addToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(produktBild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAntalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAntalKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9') || jTextFieldAntal.getText().length() > 1)
                && (caracter != '\b')) {
            evt.consume();
        }
        
    }//GEN-LAST:event_jTextFieldAntalKeyTyped

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        if (Integer.parseInt(jTextFieldAntal.getText()) > 1){
            jTextFieldAntal.setText(Integer.parseInt(jTextFieldAntal.getText()) - 1 + "");
        } else {
            jTextFieldAntal.setText(99 + "");
        }

    }//GEN-LAST:event_minusButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        if (Integer.parseInt(jTextFieldAntal.getText()) < 99){
            jTextFieldAntal.setText(Integer.parseInt(jTextFieldAntal.getText()) + 1 + "");
        } else {
            jTextFieldAntal.setText(1 + "");
        }
    }//GEN-LAST:event_plusButtonActionPerformed

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
                userData.getShoppingCart().addProduct(item, Integer.parseInt(jTextFieldAntal.getText()));
    }//GEN-LAST:event_addToCartButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEnhet;
    private javax.swing.JLabel jLabelNamn;
    private javax.swing.JLabel jLabelPrisPerEnhet;
    private javax.swing.JTextField jTextFieldAntal;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JLabel produktBild;
    // End of variables declaration//GEN-END:variables
}
