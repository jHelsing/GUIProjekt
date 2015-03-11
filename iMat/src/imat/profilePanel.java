/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import se.chalmers.ait.dat215.project.IMatDataHandler;

/**
 *
 * @author Johan
 */
public class profilePanel extends javax.swing.JPanel {
  
    private IMatDataHandler userData = IMatDataHandler.getInstance();
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    
    /**
     * Creates new form profilePanel
     */
    public profilePanel() {
        initComponents();
        profileNotEditable = true;
        expDateMonth.setEnabled(false);
        expDateYear.setEnabled(false);
        this.setBackground(IMatColors.getpanelBackgroundLight());
    }
    
    public void addObserver(PropertyChangeListener observer){
        pcs.addPropertyChangeListener(observer);
    }
    
    /**
     * Prefills the profile-info with the info given at registration.
     */
    public void setProfileInfo() {
        firstNameTF.setText(userData.getCustomer().getFirstName());
        surNameTF.setText(userData.getCustomer().getLastName());
        addressTF.setText(userData.getCustomer().getAddress());
        postalCodeTF.setText(userData.getCustomer().getPostCode());
        cityTF.setText(userData.getCustomer().getPostAddress());
        emailTF.setText(userData.getCustomer().getEmail());
        phoneNbrTF.setText(userData.getCustomer().getPhoneNumber());
        
        if (!userData.getCreditCard().getCardNumber().equals("")){
            cardNumberTF1.setText(userData.getCreditCard().getCardNumber().substring(0, 4));
            cardNumberTF2.setText(userData.getCreditCard().getCardNumber().substring(5, 9));
            cardNumberTF3.setText(userData.getCreditCard().getCardNumber().substring(10, 14));
            cardNumberTF4.setText(userData.getCreditCard().getCardNumber().substring(15));
        }
        
        cardHolderTF.setText(userData.getCreditCard().getHoldersName());
        if (userData.getCreditCard().getValidMonth() < 13 && userData.getCreditCard().getValidMonth() > 0){
            expDateMonth.setSelectedIndex(userData.getCreditCard().getValidMonth() - 1);
        }
        if (userData.getCreditCard().getValidYear() < 2100 && userData.getCreditCard().getValidYear() > 2000){
            expDateYear.setSelectedIndex(userData.getCreditCard().getValidYear() - 2015);
        }
        System.out.println(userData.getCreditCard().getValidYear());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        surNameTF = new javax.swing.JTextField();
        editProfileInfo = new javax.swing.JButton();
        cardNumberTF1 = new javax.swing.JTextField();
        expDateMonth = new javax.swing.JComboBox();
        expDateYear = new javax.swing.JComboBox();
        cityTF = new javax.swing.JTextField();
        firstNameTF = new javax.swing.JTextField();
        postalCodeTF = new javax.swing.JTextField();
        cardHolderTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        phoneNbrTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cardNumberTF2 = new javax.swing.JTextField();
        cardNumberTF3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cardNumberTF4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        surNameTF.setEditable(false);
        surNameTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        surNameTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        surNameTF.setNextFocusableComponent(addressTF);
        surNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surNameTFActionPerformed(evt);
            }
        });

        editProfileInfo.setText("Ändra");
        editProfileInfo.setNextFocusableComponent(firstNameTF);
        editProfileInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileInfoActionPerformed(evt);
            }
        });
        editProfileInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editProfileInfoKeyPressed(evt);
            }
        });

        cardNumberTF1.setEditable(false);
        cardNumberTF1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cardNumberTF1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cardNumberTF1.setNextFocusableComponent(cardNumberTF2);
        cardNumberTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumberTF1ActionPerformed(evt);
            }
        });

        expDateMonth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        expDateMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Januari", "Februari", "Mars", "April", "Maj", "Juni", "Juli", "Augusti", "September", "Oktober", "November", "December" }));
        expDateMonth.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        expDateMonth.setNextFocusableComponent(expDateYear);
        expDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expDateMonthActionPerformed(evt);
            }
        });

        expDateYear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        expDateYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));
        expDateYear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        expDateYear.setNextFocusableComponent(editProfileInfo);

        cityTF.setEditable(false);
        cityTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cityTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cityTF.setNextFocusableComponent(phoneNbrTF);

        firstNameTF.setEditable(false);
        firstNameTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        firstNameTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        firstNameTF.setNextFocusableComponent(surNameTF);
        firstNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTFActionPerformed(evt);
            }
        });

        postalCodeTF.setEditable(false);
        postalCodeTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        postalCodeTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        postalCodeTF.setNextFocusableComponent(cityTF);
        postalCodeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postalCodeTFActionPerformed(evt);
            }
        });

        cardHolderTF.setEditable(false);
        cardHolderTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cardHolderTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cardHolderTF.setNextFocusableComponent(cardNumberTF1);
        cardHolderTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardHolderTFActionPerformed(evt);
            }
        });

        addressTF.setEditable(false);
        addressTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addressTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addressTF.setNextFocusableComponent(postalCodeTF);
        addressTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTFActionPerformed(evt);
            }
        });

        phoneNbrTF.setEditable(false);
        phoneNbrTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phoneNbrTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        phoneNbrTF.setNextFocusableComponent(emailTF);

        emailTF.setEditable(false);
        emailTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        emailTF.setNextFocusableComponent(cardHolderTF);
        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Din profil");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Kontaktuppgifter");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Kontouppgifter");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Förnamn:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("   Adress:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("       Ort:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("    Email:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Efternamn:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("   Post nr:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Telefon nr:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Kortinnehavarens namn:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Kort nr:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Expireringsdatum:");

        cardNumberTF2.setEditable(false);
        cardNumberTF2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cardNumberTF2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cardNumberTF2.setNextFocusableComponent(cardNumberTF3);
        cardNumberTF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumberTF2ActionPerformed(evt);
            }
        });

        cardNumberTF3.setEditable(false);
        cardNumberTF3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cardNumberTF3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cardNumberTF3.setNextFocusableComponent(cardNumberTF4);
        cardNumberTF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumberTF3ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("  -");

        cardNumberTF4.setEditable(false);
        cardNumberTF4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cardNumberTF4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cardNumberTF4.setNextFocusableComponent(expDateMonth);
        cardNumberTF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumberTF4ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("  -");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("  -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailTF)
                            .addComponent(addressTF)
                            .addComponent(cityTF, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(firstNameTF))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(postalCodeTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(surNameTF)
                            .addComponent(phoneNbrTF)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 361, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(expDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(expDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cardHolderTF)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cardNumberTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNumberTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNumberTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNumberTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editProfileInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(surNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardHolderTF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postalCodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNumberTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardNumberTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNumberTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(cardNumberTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(phoneNbrTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(expDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(editProfileInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void surNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surNameTFActionPerformed

    /**
     * Changes if the text fields and comboboxes in the profilePanel are editable or not.
     * @param evt 
     */
    private void editProfileInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileInfoActionPerformed
        if (profileNotEditable) {
            makeProfileEditable(true);
            editProfileInfo.setText("Okej");
        } else {
            makeProfileEditable(false);
            this.updateProfileInfo();
            editProfileInfo.setText("Ändra");
        }
    }//GEN-LAST:event_editProfileInfoActionPerformed

    
    /**
     * Sets profile info to whats written in the textfields in profilePanel.
     */
    private void updateProfileInfo() {
        userData.getCustomer().setFirstName(firstNameTF.getText());
        userData.getCustomer().setLastName(surNameTF.getText());
        userData.getCustomer().setAddress(addressTF.getText());
        userData.getCustomer().setPostAddress(cityTF.getText());
        userData.getCustomer().setPostCode(postalCodeTF.getText());
        userData.getCustomer().setEmail(emailTF.getText());
        userData.getCustomer().setPhoneNumber(phoneNbrTF.getText());
        if (cardNumberTF1.getText().length() == 4 && 
                cardNumberTF2.getText().length() == 4 &&
                    cardNumberTF3.getText().length() == 4 &&
                        cardNumberTF4.getText().length() == 4){
            userData.getCreditCard().setCardNumber(cardNumberTF1.getText() + "-" +
                                                    cardNumberTF2.getText() + "-" +
                                                      cardNumberTF3.getText() + "-" +
                                                       cardNumberTF4.getText());
        }
        userData.getCreditCard().setHoldersName(cardHolderTF.getText());
        userData.getCreditCard().setValidMonth(expDateMonth.getSelectedIndex() + 1);
        userData.getCreditCard().setValidYear(Integer.parseInt((String)expDateYear.getSelectedItem()));
        pcs.firePropertyChange("setInfo", 0, 1);
    }
    
    private void makeProfileEditable(boolean b) {
        profileNotEditable = !b;
        firstNameTF.setEditable(b);
        surNameTF.setEditable(b);
        addressTF.setEditable(b);
        postalCodeTF.setEditable(b);
        cityTF.setEditable(b);
        phoneNbrTF.setEditable(b);
        emailTF.setEditable(b);
        cardHolderTF.setEditable(b);
        cardNumberTF1.setEditable(b);
        cardNumberTF2.setEditable(b);
        cardNumberTF3.setEditable(b);
        cardNumberTF4.setEditable(b);
        expDateMonth.setEnabled(b);
        expDateYear.setEnabled(b);
    }
    
    private void cardNumberTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumberTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumberTF1ActionPerformed

    private void expDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expDateMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expDateMonthActionPerformed

    private void firstNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTFActionPerformed

    private void postalCodeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postalCodeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postalCodeTFActionPerformed

    private void cardHolderTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardHolderTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardHolderTFActionPerformed

    private void addressTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTFActionPerformed

    private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTFActionPerformed

    private void cardNumberTF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumberTF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumberTF2ActionPerformed

    private void cardNumberTF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumberTF3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumberTF3ActionPerformed

    private void cardNumberTF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumberTF4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumberTF4ActionPerformed

    private void editProfileInfoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editProfileInfoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            editProfileInfoActionPerformed(null);
        }
    }//GEN-LAST:event_editProfileInfoKeyPressed

    //Variable that tells whether or not the text fields in the profilePanel are editable.
    private boolean profileNotEditable;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField cardHolderTF;
    private javax.swing.JTextField cardNumberTF1;
    private javax.swing.JTextField cardNumberTF2;
    private javax.swing.JTextField cardNumberTF3;
    private javax.swing.JTextField cardNumberTF4;
    private javax.swing.JTextField cityTF;
    private javax.swing.JButton editProfileInfo;
    private javax.swing.JTextField emailTF;
    private javax.swing.JComboBox expDateMonth;
    private javax.swing.JComboBox expDateYear;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField phoneNbrTF;
    private javax.swing.JTextField postalCodeTF;
    private javax.swing.JTextField surNameTF;
    // End of variables declaration//GEN-END:variables
}
