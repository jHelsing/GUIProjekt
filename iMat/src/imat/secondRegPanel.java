/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javafx.scene.input.KeyCode;
import se.chalmers.ait.dat215.project.IMatDataHandler;

/**
 *
 * @author Johan
 */
public class secondRegPanel extends javax.swing.JPanel {

    private IMatDataHandler userData= IMatDataHandler.getInstance();
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    
    /**
     * Creates new form secondRegPanel
     */
    public secondRegPanel() {
        initComponents();
        this.setBackground(IMatColors.getpanelBackgroundNormal());
        this.setTFColors(IMatColors.getpanelBackgroundLight());
    }
    
    public void addObserver(PropertyChangeListener observer){
        pcs.addPropertyChangeListener(observer);
    }
    
    private void setTFColors(Color c) {
        jTextFieldKortNamn.setBackground(c);
        jTextFieldKortnummer1.setBackground(c);
        jTextFieldKortnummer2.setBackground(c);
        jTextFieldKortnummer3.setBackground(c);
        jTextFieldKortnummer4.setBackground(c);
        jTextFieldCCV.setBackground(c);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxGiltAr = new javax.swing.JComboBox();
        imageLabelRegPil2 = new imat.ImageLabel("RegPil2Text.png");
        jLabelKortnummer = new javax.swing.JLabel();
        imageLabelForegaendeSteg = new imat.ImageLabel("prevStepButton.png");
        jLabelGiltighetstid = new javax.swing.JLabel();
        imageLabelNastaSteg = new imat.ImageLabel("nextStepButton.png");
        jLabelCCV = new javax.swing.JLabel();
        jLabelKortNamn = new javax.swing.JLabel();
        jTextFieldKortnummer1 = new javax.swing.JTextField();
        jTextFieldCCV = new javax.swing.JTextField();
        jTextFieldKortNamn = new javax.swing.JTextField();
        jComboBoxGiltMånad = new javax.swing.JComboBox();
        jTextFieldKortnummer2 = new javax.swing.JTextField();
        jTextFieldKortnummer3 = new javax.swing.JTextField();
        jTextFieldKortnummer4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();

        jComboBoxGiltAr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019" }));

        imageLabelRegPil2.setIcon(null);
        imageLabelRegPil2.setText("imageLabel1");

        jLabelKortnummer.setText("Kortnummer:");

        imageLabelForegaendeSteg.setText("imageLabel1");
        imageLabelForegaendeSteg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageLabelForegaendeStegMouseMoved(evt);
            }
        });
        imageLabelForegaendeSteg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLabelForegaendeStegMouseClicked(evt);
            }
        });

        jLabelGiltighetstid.setText("Giltighetstid:");

        imageLabelNastaSteg.setText("imageLabel3");
        imageLabelNastaSteg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageLabelNastaStegMouseMoved(evt);
            }
        });
        imageLabelNastaSteg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLabelNastaStegMouseClicked(evt);
            }
        });

        jLabelCCV.setText("CCV:");

        jLabelKortNamn.setText("Kortinnehavarens namn:");

        jTextFieldKortnummer1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextFieldKortnummer1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldKortnummer1KeyPressed(evt);
            }
        });

        jTextFieldCCV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextFieldCCV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCCVKeyPressed(evt);
            }
        });

        jTextFieldKortNamn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jComboBoxGiltMånad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jTextFieldKortnummer2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextFieldKortnummer2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldKortnummer2KeyPressed(evt);
            }
        });

        jTextFieldKortnummer3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextFieldKortnummer3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldKortnummer3KeyPressed(evt);
            }
        });

        jTextFieldKortnummer4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextFieldKortnummer4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldKortnummer4KeyPressed(evt);
            }
        });

        jLabel1.setText("-");

        jLabel2.setText("-");

        jLabel3.setText("-");

        jLabelError.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(imageLabelRegPil2, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imageLabelForegaendeSteg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imageLabelNastaSteg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelKortNamn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldKortNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabelKortnummer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldKortnummer1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabelGiltighetstid)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxGiltMånad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxGiltAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldKortnummer2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldKortnummer3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldKortnummer4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelCCV)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCCV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(525, 525, 525)
                        .addComponent(jLabelError)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(imageLabelRegPil2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabelError)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKortnummer)
                    .addComponent(jLabelCCV)
                    .addComponent(jTextFieldKortnummer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldKortnummer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldKortnummer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldKortnummer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGiltighetstid)
                    .addComponent(jComboBoxGiltMånad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGiltAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKortNamn)
                    .addComponent(jTextFieldKortNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imageLabelNastaSteg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imageLabelForegaendeSteg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void imageLabelForegaendeStegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelForegaendeStegMouseClicked
        pcs.firePropertyChange("ToFirstRegPanel", 0, 1);
    }//GEN-LAST:event_imageLabelForegaendeStegMouseClicked

    private void imageLabelNastaStegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelNastaStegMouseClicked

        
        if (jTextFieldKortnummer1.getDocument().getLength() == 4 && 
                jTextFieldKortnummer2.getDocument().getLength() == 4 &&
                    jTextFieldKortnummer3.getDocument().getLength() == 4 &&
                        jTextFieldKortnummer4.getDocument().getLength() == 4){
            
            userData.getCreditCard().setCardNumber(jTextFieldKortnummer1.getText() + "-" + 
                                                    jTextFieldKortnummer2.getText() + "-" +
                                                    jTextFieldKortnummer3.getText() + "-" + 
                                                    jTextFieldKortnummer4.getText());
            userData.getCreditCard().setHoldersName(jLabelKortNamn.getText());
        }
        
        if ((String)jComboBoxGiltMånad.getSelectedItem() != "mm"){
            userData.getCreditCard().setValidMonth(Integer.parseInt((String)jComboBoxGiltMånad.getSelectedItem()));
        }
        
        if ((String)jComboBoxGiltAr.getSelectedItem() != "åååå"){
            userData.getCreditCard().setValidYear(Integer.parseInt((String)jComboBoxGiltAr.getSelectedItem()));
        }
        
            pcs.firePropertyChange("ToThirdRegPanel", 0, 1);
    }//GEN-LAST:event_imageLabelNastaStegMouseClicked

    private void jTextFieldKortnummer1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldKortnummer1KeyPressed
        if (jTextFieldKortnummer1.getDocument().getLength() >= 4 && !(evt.getKeyCode() == KeyEvent.VK_BACKSPACE)){
            jTextFieldKortnummer1.setText(jTextFieldKortnummer1.getText().substring(0, 3));
        } 
    }//GEN-LAST:event_jTextFieldKortnummer1KeyPressed

    private void jTextFieldKortnummer2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldKortnummer2KeyPressed
        if (jTextFieldKortnummer2.getDocument().getLength() >= 4 && !(evt.getKeyCode() == KeyEvent.VK_BACKSPACE)){
            jTextFieldKortnummer2.setText(jTextFieldKortnummer2.getText().substring(0, 3));
        }
    }//GEN-LAST:event_jTextFieldKortnummer2KeyPressed

    private void jTextFieldKortnummer3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldKortnummer3KeyPressed
        if (jTextFieldKortnummer3.getDocument().getLength() >= 4 && !(evt.getKeyCode() == KeyEvent.VK_BACKSPACE)){
            jTextFieldKortnummer3.setText(jTextFieldKortnummer3.getText().substring(0, 3));
        }
    }//GEN-LAST:event_jTextFieldKortnummer3KeyPressed

    private void jTextFieldKortnummer4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldKortnummer4KeyPressed
        if (jTextFieldKortnummer4.getDocument().getLength() >= 4 && !(evt.getKeyCode() == KeyEvent.VK_BACKSPACE)){
            jTextFieldKortnummer4.setText(jTextFieldKortnummer4.getText().substring(0, 3));
        }
    }//GEN-LAST:event_jTextFieldKortnummer4KeyPressed

    private void jTextFieldCCVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCCVKeyPressed
        if (jTextFieldCCV.getDocument().getLength() >= 3 && !(evt.getKeyCode() == KeyEvent.VK_BACKSPACE)){
            jTextFieldCCV.setText(jTextFieldCCV.getText().substring(0, 2));
        }
    }//GEN-LAST:event_jTextFieldCCVKeyPressed

    private void imageLabelForegaendeStegMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelForegaendeStegMouseMoved
        imageLabelForegaendeSteg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imageLabelForegaendeStegMouseMoved

    private void imageLabelNastaStegMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelNastaStegMouseMoved
        imageLabelNastaSteg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imageLabelNastaStegMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private imat.ImageLabel imageLabelForegaendeSteg;
    private imat.ImageLabel imageLabelNastaSteg;
    private imat.ImageLabel imageLabelRegPil2;
    private javax.swing.JComboBox jComboBoxGiltAr;
    private javax.swing.JComboBox jComboBoxGiltMånad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCCV;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelGiltighetstid;
    private javax.swing.JLabel jLabelKortNamn;
    private javax.swing.JLabel jLabelKortnummer;
    private javax.swing.JTextField jTextFieldCCV;
    private javax.swing.JTextField jTextFieldKortNamn;
    private javax.swing.JTextField jTextFieldKortnummer1;
    private javax.swing.JTextField jTextFieldKortnummer2;
    private javax.swing.JTextField jTextFieldKortnummer3;
    private javax.swing.JTextField jTextFieldKortnummer4;
    // End of variables declaration//GEN-END:variables
}
