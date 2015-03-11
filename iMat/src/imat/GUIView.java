/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.CardLayout;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import javax.swing.JFrame;
import se.chalmers.ait.dat215.project.*;
import java.beans.PropertyChangeListener;
import java.util.List;

/**
 *
 * @author jonathan
 */
public class GUIView extends javax.swing.JFrame implements PropertyChangeListener {
    
    private IMatDataHandler userData;
    private int[] cardNumber;
    private int ccv, expireYear, expireMonth;
    private String cardholderName;
    
    //PropertyChangeListener pcl;
    /**
     * Creates new form GUIView
     */
    public GUIView() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setFullScreen(this);
        initContentPanel();
        homeLabel.requestFocus();
        shoppingCartPanel.addObserver(this);
        firstRegPanel.addObserver(this);
        secondRegPanel.addObserver(this);
        thirdRegPanel.addObserver(this);
        confirmRegPanel.addObserver(this);
        profilePanel.addObserver(this);
        checkoutPanel.addObserver(this);
        detailedRecipe.addObserver(this);
        recipePanel.addObserver(this);
        this.setBackground(IMatColors.getpanelBackgroundNormal());
        splitPanel.setBackground(IMatColors.getpanelBackgroundNormal());
        wholePanel.setBackground(IMatColors.getpanelBackgroundNormal());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenu = new BackgroundPanel("menuBar.png");
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
        thirdRegPanel = new imat.thirdRegPanel();
        profilePanel = new imat.profilePanel();
        firstPanel = new firstPanel();
        helpPanel = new imat.helpPanel();
        checkoutPanel = new imat.checkoutPanel();
        confirmRegPanel = new imat.confirmRegPanel();
        firstRegPanel = new imat.firstRegPanel();
        secondRegPanel = new imat.secondRegPanel();
        historyPanel = new imat.HistoryPanel();
        confirmCheckoutPanel = new imat.confirmCheckoutPanel();
        splitPanel = new javax.swing.JPanel();
        splitPanelContent = new javax.swing.JPanel();
        productSplitPanel = new javax.swing.JSplitPane();
        categoryPanel = new imat.CategoryPanel();
        productPanel = new imat.productPanel();
        homePanel = new imat.homePanel();
        searchSplitPanel = new javax.swing.JSplitPane();
        categorySearchPanel = new imat.CategoryPanel();
        searchResultPanel = SearchResultPanel.getInstance();
        recipePanel = new imat.recipePanel();
        detailedRecipe = new imat.DetailedRecipe();
        shoppingCartPanel = new imat.shoppingCartPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1174, 553));

        mainMenu.setPreferredSize(new java.awt.Dimension(532, 50));

        homeLabel.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setText("  Hem");
        homeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                homeLabelMouseMoved(evt);
            }
        });
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelMouseExited(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        productLabel.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        productLabel.setForeground(new java.awt.Color(255, 255, 255));
        productLabel.setText("Produkter");
        productLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        productLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                productLabelMouseMoved(evt);
            }
        });
        productLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productLabelMouseExited(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        recipieLabel.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        recipieLabel.setForeground(new java.awt.Color(255, 255, 255));
        recipieLabel.setText(" Recept");
        recipieLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        recipieLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                recipieLabelMouseMoved(evt);
            }
        });
        recipieLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recipieLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recipieLabelMouseExited(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        shoppingListLabel.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        shoppingListLabel.setForeground(new java.awt.Color(255, 255, 255));
        shoppingListLabel.setText(" Inköpslistor");
        shoppingListLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        shoppingListLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                shoppingListLabelMouseMoved(evt);
            }
        });
        shoppingListLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shoppingListLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shoppingListLabelMouseExited(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        purchaseHistoryLabel.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        purchaseHistoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        purchaseHistoryLabel.setText("Köphistorik");
        purchaseHistoryLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        purchaseHistoryLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                purchaseHistoryLabelMouseMoved(evt);
            }
        });
        purchaseHistoryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseHistoryLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                purchaseHistoryLabelMouseExited(evt);
            }
        });

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        searchField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        searchField.setText("Sök...");
        searchField.setToolTipText("Sök bland produkter, recept och inköpslistor. Tryck på Enter för att söka.");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
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
        helpImage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                helpImageMouseMoved(evt);
            }
        });
        helpImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpImageMouseClicked(evt);
            }
        });

        profileImage.setText("imageLabel2");
        profileImage.setMaximumSize(new java.awt.Dimension(57, 57));
        profileImage.setMinimumSize(new java.awt.Dimension(57, 57));
        profileImage.setName(""); // NOI18N
        profileImage.setPreferredSize(new java.awt.Dimension(57, 57));
        profileImage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                profileImageMouseMoved(evt);
            }
        });
        profileImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recipieLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(shoppingListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseHistoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameLabel)
                    .addComponent(firstNameLabel))
                .addGap(14, 14, 14)
                .addComponent(profileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpImage, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(profileImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(helpImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchField)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastNameLabel))
                            .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recipieLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shoppingListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purchaseHistoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        contentPanel.setLayout(new java.awt.CardLayout());

        wholePanel.setLayout(new java.awt.CardLayout());
        wholePanel.add(thirdRegPanel, "thirdRegPanel");
        wholePanel.add(profilePanel, "profilePanel");

        javax.swing.GroupLayout firstPanelLayout = new javax.swing.GroupLayout(firstPanel);
        firstPanel.setLayout(firstPanelLayout);
        firstPanelLayout.setHorizontalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1319, Short.MAX_VALUE)
        );
        firstPanelLayout.setVerticalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );

        wholePanel.add(firstPanel, "firstPanel");
        wholePanel.add(helpPanel, "helpPanel");
        wholePanel.add(checkoutPanel, "checkoutPanel");
        wholePanel.add(confirmRegPanel, "confirmRegPanel");
        wholePanel.add(firstRegPanel, "firstRegPanel");
        wholePanel.add(secondRegPanel, "secondRegPanel");
        wholePanel.add(historyPanel, "historyPanel");
        wholePanel.add(confirmCheckoutPanel, "confirmCheckoutPanel");

        contentPanel.add(wholePanel, "wholePanel");

        splitPanelContent.setLayout(new java.awt.CardLayout());

        productSplitPanel.setLeftComponent(categoryPanel);
        productSplitPanel.setRightComponent(productPanel);

        splitPanelContent.add(productSplitPanel, "productPanel");
        splitPanelContent.add(homePanel, "homePanel");

        searchSplitPanel.setLeftComponent(categorySearchPanel);
        searchSplitPanel.setRightComponent(searchResultPanel);

        splitPanelContent.add(searchSplitPanel, "searchPanel");
        splitPanelContent.add(recipePanel, "recipePanel");
        splitPanelContent.add(detailedRecipe, "detailedRecipe");

        javax.swing.GroupLayout splitPanelLayout = new javax.swing.GroupLayout(splitPanel);
        splitPanel.setLayout(splitPanelLayout);
        splitPanelLayout.setHorizontalGroup(
            splitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shoppingCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        splitPanelLayout.setVerticalGroup(
            splitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(shoppingCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(splitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap())
        );

        contentPanel.add(splitPanel, "splitPanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1319, Short.MAX_VALUE)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1319, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 656, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        // changes the content panel to contain the shopping cart and the homepage
        CardLayout card = (CardLayout)contentPanel.getLayout();
        card.show(contentPanel, "splitPanel");
        card = (CardLayout)splitPanelContent.getLayout();
        card.show(splitPanelContent, "homePanel");
    }//GEN-LAST:event_homeLabelMouseClicked

    private void productLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productLabelMouseClicked
        // changes the content panel to contain the shopping cart and the product page
        CardLayout card = (CardLayout)contentPanel.getLayout();
        card.show(contentPanel, "splitPanel");
        card = (CardLayout)splitPanelContent.getLayout();
        card.show(splitPanelContent, "searchPanel");
    }//GEN-LAST:event_productLabelMouseClicked

    private void recipieLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recipieLabelMouseClicked
        CardLayout card = (CardLayout)contentPanel.getLayout();
        card.show(contentPanel, "splitPanel");
        card = (CardLayout)splitPanelContent.getLayout();
        card.show(splitPanelContent, "recipePanel");
    }//GEN-LAST:event_recipieLabelMouseClicked

    private void shoppingListLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shoppingListLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_shoppingListLabelMouseClicked

    private void purchaseHistoryLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseHistoryLabelMouseClicked
         // changes the content panel to contain the history page
        CardLayout card = (CardLayout)contentPanel.getLayout();
        card.show(contentPanel, "wholePanel");
        card = (CardLayout)wholePanel.getLayout();
        card.show(wholePanel, "historyPanel");
    }//GEN-LAST:event_purchaseHistoryLabelMouseClicked

    private void searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyTyped
        // TODO lägg in sökfunktionen
        
        String s = searchField.getText();
        searchField.setText(s);
        if(s != null) {
            searchResultPanel.displayResults(userData.findProducts(s));
            CardLayout card = (CardLayout)contentPanel.getLayout();
            card.show(contentPanel, "splitPanel");
            card = (CardLayout)splitPanelContent.getLayout();
            card.show(splitPanelContent, "searchPanel");
        }
        
        
       
        // Fixa visningen utav search result
        /*card = (CardLayout)splitPanel.getLayout();
        card.show(splitPanel, "searchPanel"); */
        
        
        
    }//GEN-LAST:event_searchFieldKeyTyped

    private void profileImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileImageMouseClicked
        
        CardLayout card = (CardLayout)contentPanel.getLayout();
        card.show(contentPanel, "wholePanel");
        card = (CardLayout)wholePanel.getLayout();
        if (userData.isCustomerComplete()){ 
            card.show(wholePanel, "profilePanel");
        } else {
            card.show(wholePanel, "firstRegPanel");
        }
    }//GEN-LAST:event_profileImageMouseClicked

    private void helpImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpImageMouseClicked
        CardLayout card = (CardLayout)contentPanel.getLayout();
        card.show(contentPanel, "wholePanel");
        card = (CardLayout)wholePanel.getLayout();
        card.show(wholePanel, "helpPanel");
    }//GEN-LAST:event_helpImageMouseClicked

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        if (searchField.getText().equals("Sök...")){
            searchField.setText("");
        } else {
            searchField.selectAll();
        }
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        if (searchField.getText().equals("")){
            searchField.setText("Sök...");
        }
    }//GEN-LAST:event_searchFieldFocusLost

    private void profileImageMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileImageMouseMoved
        profileImage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_profileImageMouseMoved

    private void helpImageMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpImageMouseMoved
        helpImage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_helpImageMouseMoved

    private void homeLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseMoved
        homeLabel.setForeground(java.awt.Color.black);
    }//GEN-LAST:event_homeLabelMouseMoved

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseExited
        homeLabel.setForeground(java.awt.Color.white);
    }//GEN-LAST:event_homeLabelMouseExited

    private void productLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productLabelMouseMoved
        productLabel.setForeground(java.awt.Color.black);
    }//GEN-LAST:event_productLabelMouseMoved

    private void productLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productLabelMouseExited
        productLabel.setForeground(java.awt.Color.white);
    }//GEN-LAST:event_productLabelMouseExited

    private void recipieLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recipieLabelMouseMoved
        recipieLabel.setForeground(java.awt.Color.black);
    }//GEN-LAST:event_recipieLabelMouseMoved

    private void recipieLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recipieLabelMouseExited
        recipieLabel.setForeground(java.awt.Color.white);
    }//GEN-LAST:event_recipieLabelMouseExited

    private void shoppingListLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shoppingListLabelMouseMoved
        shoppingListLabel.setForeground(java.awt.Color.black);
    }//GEN-LAST:event_shoppingListLabelMouseMoved

    private void shoppingListLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shoppingListLabelMouseExited
        shoppingListLabel.setForeground(java.awt.Color.white);
    }//GEN-LAST:event_shoppingListLabelMouseExited

    private void purchaseHistoryLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseHistoryLabelMouseMoved
        purchaseHistoryLabel.setForeground(java.awt.Color.black);
    }//GEN-LAST:event_purchaseHistoryLabelMouseMoved

    private void purchaseHistoryLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseHistoryLabelMouseExited
        purchaseHistoryLabel.setForeground(java.awt.Color.white);
    }//GEN-LAST:event_purchaseHistoryLabelMouseExited

    
    
    
    private void setFullScreen(JFrame jFrame) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        jFrame.setSize(1280,720);
    }
    
    /**
     * Makes sure the right first view is displayed when it comes to choosing
     * between firstPanel and homePanel. First panel is displayed on first
     * start-up when no user exists. When a user exists it will display the
     * homePanel instead.
     */
    private void initContentPanel() {
        userData = IMatDataHandler.getInstance();
        userData.resetFirstRun();
        if(userData.isFirstRun()) {
            //Show the firstPanel
            CardLayout card = (CardLayout)contentPanel.getLayout();   
            card.show(contentPanel, "wholePanel");
            card = (CardLayout)wholePanel.getLayout();
            card.show(wholePanel,"firstPanel");
        } else {
            CardLayout card = (CardLayout)contentPanel.getLayout();
            card.show(contentPanel, "splitPanel");
            card = (CardLayout)splitPanelContent.getLayout();
            card.show(splitPanelContent, "homePanel");
        }
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) { 
            if (evt.getPropertyName().equals("ToCheckout")){
                CardLayout card = (CardLayout)contentPanel.getLayout();
                card.show(contentPanel, "wholePanel");
                card = (CardLayout)wholePanel.getLayout();
                card.show(wholePanel,"checkoutPanel");  
                updateCheckout();
            } else if(evt.getPropertyName().equals("ToFirstRegPanel")){
                if (shoppingCartPanel.getGoStraightToPayment()) {
                    confirmRegPanel.enableSTPLabel(true);
                }
                CardLayout card = (CardLayout)contentPanel.getLayout();
                card.show(contentPanel, "wholePanel");
                card = (CardLayout)wholePanel.getLayout();
                card.show(wholePanel, "firstRegPanel");
            } else if(evt.getPropertyName().equals("ToSecondRegPanel")){
                CardLayout card = (CardLayout)contentPanel.getLayout();
                card.show(contentPanel, "wholePanel");
                card = (CardLayout)wholePanel.getLayout();
                card.show(wholePanel, "secondRegPanel");
            }  else if(evt.getPropertyName().equals("ToThirdRegPanel")){
                CardLayout card = (CardLayout)contentPanel.getLayout();
                card.show(contentPanel, "wholePanel");
                card = (CardLayout)wholePanel.getLayout();
                card.show(wholePanel, "thirdRegPanel");
            } else if(evt.getPropertyName().equals("ToConfirmRegPanel")){
                CardLayout card = (CardLayout)contentPanel.getLayout();
                card.show(contentPanel, "wholePanel");
                card = (CardLayout)wholePanel.getLayout();
                card.show(wholePanel, "confirmRegPanel");
            } else if(evt.getPropertyName().equals("ToProducts")){
                CardLayout card = (CardLayout)contentPanel.getLayout();
                card.show(contentPanel, "splitPanel");
                card = (CardLayout)splitPanelContent.getLayout();
                card.show(splitPanelContent, "productPanel");
            } else if (evt.getPropertyName().equals("setInfo")) {
                profilePanel.setProfileInfo();
                checkoutPanel.setCheckoutInfo();
                firstNameLabel.setText(userData.getCustomer().getFirstName());
                lastNameLabel.setText(userData.getCustomer().getLastName());
            } else if (evt.getPropertyName().equals("buyCompleted")) {
                historyPanel.addToHistory();
                confirmCheckoutPanel.setReceiptInfo(checkoutPanel.getDeliveryDay(),
                        checkoutPanel.getDeliveryTime(), checkoutPanel.getDeliveryAddress(),
                        checkoutPanel.getDeliveryPost(), checkoutPanel.getDeliveryCity());
                confirmCheckoutPanel.updateReceipt();
                CardLayout card = (CardLayout)contentPanel.getLayout();
                card.show(contentPanel, "wholePanel");
                card = (CardLayout)wholePanel.getLayout();
                card.show(wholePanel, "confirmCheckoutPanel");
            } else if (evt.getPropertyName().equals("checkoutBack")) {
                CardLayout card = (CardLayout)contentPanel.getLayout();
                card.show(contentPanel, "splitPanel");
            } else if (evt.getPropertyName().equals("toRecipe")) {
                CardLayout card = (CardLayout)contentPanel.getLayout();
                card.show(contentPanel, "splitPanel");
                card = (CardLayout)splitPanelContent.getLayout();
                card.show(splitPanelContent, "recipePanel");
            } else if (evt.getPropertyName().equals("ToDetailedRecipe")){
                CardLayout card = (CardLayout)splitPanelContent.getLayout();
                card.show(splitPanelContent, "detailedRecipe");
            }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void updateCheckout(){
        checkoutPanel.updatePanels();
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
    
    public void sendToSearchResultPanel(List<Product> searchFor) {
        searchResultPanel.displayResults(searchFor);
        revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private imat.CategoryPanel categoryPanel;
    private imat.CategoryPanel categorySearchPanel;
    private imat.checkoutPanel checkoutPanel;
    private imat.confirmCheckoutPanel confirmCheckoutPanel;
    private imat.confirmRegPanel confirmRegPanel;
    private javax.swing.JPanel contentPanel;
    private imat.DetailedRecipe detailedRecipe;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JPanel firstPanel;
    private imat.firstRegPanel firstRegPanel;
    private imat.ImageLabel helpImage;
    private imat.helpPanel helpPanel;
    private imat.HistoryPanel historyPanel;
    private javax.swing.JLabel homeLabel;
    private imat.homePanel homePanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JLabel productLabel;
    private imat.productPanel productPanel;
    private javax.swing.JSplitPane productSplitPanel;
    private imat.ImageLabel profileImage;
    private imat.profilePanel profilePanel;
    private javax.swing.JLabel purchaseHistoryLabel;
    private imat.recipePanel recipePanel;
    private javax.swing.JLabel recipieLabel;
    private javax.swing.JTextField searchField;
    private imat.SearchResultPanel searchResultPanel;
    private javax.swing.JSplitPane searchSplitPanel;
    private imat.secondRegPanel secondRegPanel;
    private imat.shoppingCartPanel shoppingCartPanel;
    private javax.swing.JLabel shoppingListLabel;
    private javax.swing.JPanel splitPanel;
    private javax.swing.JPanel splitPanelContent;
    private imat.thirdRegPanel thirdRegPanel;
    private javax.swing.JPanel wholePanel;
    // End of variables declaration//GEN-END:variables

    


}
