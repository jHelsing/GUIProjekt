/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

/**
 *
 * @author Johan
 */
public class firstRegPanel extends javax.swing.JPanel {

    /**
     * Creates new form firstRegPanel
     */
    public firstRegPanel() {
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

        jLabelFornamn.setText("Förnamn:");

        jLabelAdress.setText("Adress:");

        jLabelMobilnr.setText("Mobilnr:");

        jLabelEmail.setText("E-mail:");

        jLabelEfternamn.setText("Efternamn:");

        imageLabelRegPil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/RegPil1.png"))); // NOI18N
        imageLabelRegPil1.setText("imageLabel1");

        jLabelPostnr.setText("Postnr:");

        jLabelOrt.setText("Ort:");

        nextStepButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/nextStep.png"))); // NOI18N
        nextStepButton.setText("imageLabel2");
        nextStepButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextStepButtonMouseClicked(evt);
            }
        });

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
                        .addGap(218, 218, 218)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEfternamn)
                                    .addComponent(jLabelPostnr, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPostnr, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextStepButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(imageLabelRegPil1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
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
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMobilnr)
                    .addComponent(jTextFieldMobilnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextStepButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextStepButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextStepButtonMouseClicked
        //CardLayout wholePanelCard = (CardLayout)wholePanel.getLayout();
        //wholePanelCard.show(wholePanel, "secondRegPanel");
    }//GEN-LAST:event_nextStepButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private imat.ImageLabel imageLabelRegPil1;
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
