/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Johan
 */
public class firstPanel extends BackgroundPanel {

    /**
     * Creates new form firstPanel
     */
    public firstPanel() {
        super("firstPage.png");
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

        imageLabel1 = new imat.ImageLabel("startUsingButton.png");
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1240, 765));
        setOpaque(false);
        setRequestFocusEnabled(false);

        imageLabel1.setText("Hej");
        imageLabel1.setMaximumSize(new java.awt.Dimension(85, 40));
        imageLabel1.setMinimumSize(new java.awt.Dimension(85, 40));
        imageLabel1.setPreferredSize(new java.awt.Dimension(85, 40));
        imageLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLabel1MouseClicked(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 427, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(0, 248, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void imageLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabel1MouseClicked
        JPanel parentParentPanel = (JPanel)super.getParent().getParent();
        CardLayout card = (CardLayout)parentParentPanel.getLayout();
        card.show(parentParentPanel, "wholePanel");
        parentParentPanel = (JPanel)super.getParent();
        card = (CardLayout)parentParentPanel.getLayout();
        card.show(parentParentPanel,"homePanel");
    }//GEN-LAST:event_imageLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private imat.ImageLabel imageLabel1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
