/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import se.chalmers.ait.dat215.project.*;
import se.chalmers.ait.dat215.project.util.*;

/**
 *
 * @author jonathan
 */
public class GUIView extends javax.swing.JFrame {

    /**
     * Creates new form GUIView
     */
    public GUIView() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    //test
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenu = new BackgroundPanel("test.jpg");
        homeLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        productLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        recipieLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        shoppingListLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        purchaseHistoryLabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        searchField = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        helpImage = new imat.ImageLabel("helpLogo.png");
        profileImage = new imat.ImageLabel("profilLogo.png");
        contentPanel = new javax.swing.JPanel();
        wholePanel = new javax.swing.JPanel();
        firstRegPanel = new javax.swing.JPanel();
        jTextFieldAdress = new javax.swing.JTextField();
        jTextFieldOrt = new javax.swing.JTextField();
        imageLabelRegPil1 = new imat.ImageLabel("RegPil1.png");
        jTextFieldMobilnr = new javax.swing.JTextField();
        jTextFieldFornamn = new javax.swing.JTextField();
        jTextFieldEfternamn = new javax.swing.JTextField();
        jLabelFornamn = new javax.swing.JLabel();
        jTextFieldPostnr = new javax.swing.JTextField();
        jLabelAdress = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelMobilnr = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelEfternamn = new javax.swing.JLabel();
        jLabelPostnr = new javax.swing.JLabel();
        jLabelOrt = new javax.swing.JLabel();
        imageLabel2 = new imat.ImageLabel("nextStep.png");
        secondRegPanel = new javax.swing.JPanel();
        thirdRegPanel = new javax.swing.JPanel();
        firstPanel = new javax.swing.JPanel();
        checkoutPanel = new javax.swing.JPanel();
        checkoutConfirmPanel = new javax.swing.JPanel();
        regConfirmPanel = new javax.swing.JPanel();
        profilePanel = new javax.swing.JPanel();
        splitPanel = new javax.swing.JPanel();
        imageLabel1 = new imat.ImageLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1174, 553));
        setMinimumSize(new java.awt.Dimension(1174, 553));

        mainMenu.setPreferredSize(new java.awt.Dimension(532, 50));

        homeLabel.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setText("Hem");
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        productLabel.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        productLabel.setForeground(new java.awt.Color(255, 255, 255));
        productLabel.setText("Produkter");
        productLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productLabelMouseClicked(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        recipieLabel.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        recipieLabel.setForeground(new java.awt.Color(255, 255, 255));
        recipieLabel.setText("Recept");
        recipieLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recipieLabelMouseClicked(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        shoppingListLabel.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        shoppingListLabel.setForeground(new java.awt.Color(255, 255, 255));
        shoppingListLabel.setText("Inköpslistor");
        shoppingListLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shoppingListLabelMouseClicked(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        purchaseHistoryLabel.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        purchaseHistoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        purchaseHistoryLabel.setText("Köphistorik");
        purchaseHistoryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseHistoryLabelMouseClicked(evt);
            }
        });

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        searchField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        searchField.setText("Sök");
        searchField.setToolTipText("Sök bland produkter, recept och inköpslistor. Tryck på Enter för att söka.");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchFieldKeyTyped(evt);
            }
        });

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("Förnamn");

        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Efternamn");

        helpImage.setText("imageLabel2");
        helpImage.setMaximumSize(new java.awt.Dimension(57, 57));
        helpImage.setMinimumSize(new java.awt.Dimension(57, 57));
        helpImage.setName(""); // NOI18N
        helpImage.setPreferredSize(new java.awt.Dimension(57, 57));

        profileImage.setText("imageLabel2");
        profileImage.setMaximumSize(new java.awt.Dimension(57, 57));
        profileImage.setMinimumSize(new java.awt.Dimension(57, 57));
        profileImage.setName(""); // NOI18N
        profileImage.setPreferredSize(new java.awt.Dimension(57, 57));

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeLabel)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productLabel)
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recipieLabel)
                .addGap(24, 24, 24)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(shoppingListLabel)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseHistoryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameLabel)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(firstNameLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(helpImage, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profileImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainMenuLayout.createSequentialGroup()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastNameLabel))
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(homeLabel)
                                    .addComponent(productLabel)
                                    .addComponent(recipieLabel)
                                    .addComponent(shoppingListLabel)
                                    .addComponent(purchaseHistoryLabel))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        contentPanel.setLayout(new java.awt.CardLayout());

        wholePanel.setLayout(new java.awt.CardLayout());

        firstRegPanel.setName(""); // NOI18N

        imageLabelRegPil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/RegPil1.png"))); // NOI18N
        imageLabelRegPil1.setText("imageLabel1");

        jLabelFornamn.setText("Förnamn:");

        jLabelAdress.setText("Adress:");

        jLabelMobilnr.setText("Mobilnr:");

        jLabelEmail.setText("E-mail:");

        jLabelEfternamn.setText("Efternamn:");

        jLabelPostnr.setText("Postnr:");

        jLabelOrt.setText("Ort:");

        imageLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/nextStep.png"))); // NOI18N
        imageLabel2.setText("imageLabel2");

        javax.swing.GroupLayout firstRegPanelLayout = new javax.swing.GroupLayout(firstRegPanel);
        firstRegPanel.setLayout(firstRegPanelLayout);
        firstRegPanelLayout.setHorizontalGroup(
            firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstRegPanelLayout.createSequentialGroup()
                .addGroup(firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstRegPanelLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(imageLabelRegPil1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(firstRegPanelLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(firstRegPanelLayout.createSequentialGroup()
                                .addComponent(jLabelMobilnr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMobilnr, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(firstRegPanelLayout.createSequentialGroup()
                                .addGroup(firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelAdress)
                                    .addComponent(jLabelFornamn)
                                    .addComponent(jLabelOrt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldOrt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(firstRegPanelLayout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addGroup(firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEfternamn)
                                    .addComponent(jLabelPostnr, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPostnr, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firstRegPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imageLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        firstRegPanelLayout.setVerticalGroup(
            firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstRegPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(imageLabelRegPil1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstRegPanelLayout.createSequentialGroup()
                        .addGroup(firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFornamn))
                        .addGap(42, 42, 42)
                        .addGroup(firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAdress)
                            .addComponent(jTextFieldAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelOrt)
                            .addComponent(jTextFieldOrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(firstRegPanelLayout.createSequentialGroup()
                        .addGroup(firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEfternamn)
                            .addComponent(jTextFieldEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPostnr)
                            .addComponent(jTextFieldPostnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(firstRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMobilnr)
                    .addComponent(jTextFieldMobilnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        wholePanel.add(firstRegPanel, "card2");

        javax.swing.GroupLayout secondRegPanelLayout = new javax.swing.GroupLayout(secondRegPanel);
        secondRegPanel.setLayout(secondRegPanelLayout);
        secondRegPanelLayout.setHorizontalGroup(
            secondRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1174, Short.MAX_VALUE)
        );
        secondRegPanelLayout.setVerticalGroup(
            secondRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        wholePanel.add(secondRegPanel, "card3");

        javax.swing.GroupLayout thirdRegPanelLayout = new javax.swing.GroupLayout(thirdRegPanel);
        thirdRegPanel.setLayout(thirdRegPanelLayout);
        thirdRegPanelLayout.setHorizontalGroup(
            thirdRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1174, Short.MAX_VALUE)
        );
        thirdRegPanelLayout.setVerticalGroup(
            thirdRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        wholePanel.add(thirdRegPanel, "card4");

        javax.swing.GroupLayout firstPanelLayout = new javax.swing.GroupLayout(firstPanel);
        firstPanel.setLayout(firstPanelLayout);
        firstPanelLayout.setHorizontalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        firstPanelLayout.setVerticalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        wholePanel.add(firstPanel, "card5");

        javax.swing.GroupLayout checkoutPanelLayout = new javax.swing.GroupLayout(checkoutPanel);
        checkoutPanel.setLayout(checkoutPanelLayout);
        checkoutPanelLayout.setHorizontalGroup(
            checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        checkoutPanelLayout.setVerticalGroup(
            checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        wholePanel.add(checkoutPanel, "card6");

        javax.swing.GroupLayout checkoutConfirmPanelLayout = new javax.swing.GroupLayout(checkoutConfirmPanel);
        checkoutConfirmPanel.setLayout(checkoutConfirmPanelLayout);
        checkoutConfirmPanelLayout.setHorizontalGroup(
            checkoutConfirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        checkoutConfirmPanelLayout.setVerticalGroup(
            checkoutConfirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        wholePanel.add(checkoutConfirmPanel, "card7");

        javax.swing.GroupLayout regConfirmPanelLayout = new javax.swing.GroupLayout(regConfirmPanel);
        regConfirmPanel.setLayout(regConfirmPanelLayout);
        regConfirmPanelLayout.setHorizontalGroup(
            regConfirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        regConfirmPanelLayout.setVerticalGroup(
            regConfirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        wholePanel.add(regConfirmPanel, "card8");

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1174, Short.MAX_VALUE)
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        wholePanel.add(profilePanel, "card9");

        contentPanel.add(wholePanel, "wholeCard");

        splitPanel.setLayout(new java.awt.CardLayout());

        imageLabel1.setText("imageLabel1");
        splitPanel.add(imageLabel1, "card2");

        contentPanel.add(splitPanel, "splitCard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        // changes the content panel to contain the shopping cart and the homepage
        CardLayout card = (CardLayout)contentPanel.getLayout();
        card.show(contentPanel, "splitCard");
    }//GEN-LAST:event_homeLabelMouseClicked

    private void productLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productLabelMouseClicked
        // changes the content panel to contain the shopping cart and the product page
        CardLayout contentCard = (CardLayout)contentPanel.getLayout();
        contentCard.show(contentPanel, "splitCard");
        CardLayout splitCard = (CardLayout)splitPanel.getLayout();
        splitCard.show(splitPanel, "productPage");
    }//GEN-LAST:event_productLabelMouseClicked

    private void recipieLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recipieLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_recipieLabelMouseClicked

    private void shoppingListLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shoppingListLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_shoppingListLabelMouseClicked

    private void purchaseHistoryLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseHistoryLabelMouseClicked
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseHistoryLabelMouseClicked

    private void searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyTyped
        // TODO lägg in sökfunktionen
    }//GEN-LAST:event_searchFieldKeyTyped

    private void setFullScreen(JFrame jFrame) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        jFrame.setSize(xSize,ySize);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel checkoutConfirmPanel;
    private javax.swing.JPanel checkoutPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JPanel firstRegPanel;
    private imat.ImageLabel helpImage;
    private javax.swing.JLabel homeLabel;
    private imat.ImageLabel imageLabel1;
    private imat.ImageLabel imageLabel2;
    private imat.ImageLabel imageLabelRegPil1;
    private javax.swing.JLabel jLabelAdress;
    private javax.swing.JLabel jLabelEfternamn;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFornamn;
    private javax.swing.JLabel jLabelMobilnr;
    private javax.swing.JLabel jLabelOrt;
    private javax.swing.JLabel jLabelPostnr;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextFieldAdress;
    private javax.swing.JTextField jTextFieldEfternamn;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFornamn;
    private javax.swing.JTextField jTextFieldMobilnr;
    private javax.swing.JTextField jTextFieldOrt;
    private javax.swing.JTextField jTextFieldPostnr;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JLabel productLabel;
    private imat.ImageLabel profileImage;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JLabel purchaseHistoryLabel;
    private javax.swing.JLabel recipieLabel;
    private javax.swing.JPanel regConfirmPanel;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel secondRegPanel;
    private javax.swing.JLabel shoppingListLabel;
    private javax.swing.JPanel splitPanel;
    private javax.swing.JPanel thirdRegPanel;
    private javax.swing.JPanel wholePanel;
    // End of variables declaration//GEN-END:variables
}
