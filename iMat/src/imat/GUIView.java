/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import javax.swing.JFrame;
import se.chalmers.ait.dat215.project.*;
import se.chalmers.ait.dat215.project.util.*;
import java.beans.PropertyChangeListener;

/**
 *
 * @author jonathan
 */
public class GUIView extends javax.swing.JFrame implements PropertyChangeListener {
    
    private IMatDataHandler userData;
    PropertyChangeListener pcl;
    /**
     * Creates new form GUIView
     */
    public GUIView() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initContentPanel();
        homeLabel.requestFocus();
        shoppingCartPanel.addObserver(this);
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
        firstRegPanel = new imat.firstRegPanel();
        secondRegPanel = new imat.secondRegPanel();
        profilePanel = new imat.profilePanel();
        firstPanel = new firstPanel();
        helpPanel = new imat.helpPanel();
        checkoutPanel = new imat.checkoutPanel();
        splitPanel = new javax.swing.JPanel();
        splitPanelContent = new javax.swing.JPanel();
        productSplitPanel = new javax.swing.JSplitPane();
        categoryPanel = new imat.CategoryPanel();
        productPanel = new imat.productPanel();
        homePanel = new imat.homePanel();
        searchSplitPanel = new javax.swing.JSplitPane();
        categorySearchPanel = new imat.CategoryPanel();
        searchResultPanel = new imat.SearchResultPanel();
        recipePanel = new imat.recipePanel();
        shoppingCartPanel = new imat.shoppingCartPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        searchField.setText("Sök...");
        searchField.setToolTipText("Sök bland produkter, recept och inköpslistor. Tryck på Enter för att söka.");
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameLabel)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(firstNameLabel)))
                .addGap(14, 14, 14)
                .addComponent(profileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpImage, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(profileImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(helpImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        wholePanel.add(thirdRegPanel, "card7");
        wholePanel.add(firstRegPanel, "card3");
        wholePanel.add(secondRegPanel, "card4");
        wholePanel.add(profilePanel, "profilePanel");

        javax.swing.GroupLayout firstPanelLayout = new javax.swing.GroupLayout(firstPanel);
        firstPanel.setLayout(firstPanelLayout);
        firstPanelLayout.setHorizontalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1369, Short.MAX_VALUE)
        );
        firstPanelLayout.setVerticalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );

        wholePanel.add(firstPanel, "firstPanel");
        wholePanel.add(helpPanel, "helpPanel");
        wholePanel.add(checkoutPanel, "checkoutPanel");

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

        javax.swing.GroupLayout splitPanelLayout = new javax.swing.GroupLayout(splitPanel);
        splitPanel.setLayout(splitPanelLayout);
        splitPanelLayout.setHorizontalGroup(
            splitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shoppingCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(splitPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        contentPanel.add(splitPanel, "splitPanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1369, Short.MAX_VALUE)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1369, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
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
        card.show(splitPanelContent, "productPanel");
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
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseHistoryLabelMouseClicked

    private void searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyTyped
        // TODO lägg in sökfunktionen
        CardLayout card = (CardLayout)contentPanel.getLayout();
        card.show(contentPanel, "splitPanel");
        card = (CardLayout)splitPanelContent.getLayout();
        card.show(splitPanelContent, "searchPanel");
       
        // Fixa visningen utav search result
        /*card = (CardLayout)splitPanel.getLayout();
        card.show(splitPanel, "searchPanel"); */
        
        
        
    }//GEN-LAST:event_searchFieldKeyTyped

    private void profileImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileImageMouseClicked
        CardLayout card = (CardLayout)contentPanel.getLayout();
        card.show(contentPanel, "wholePanel");
        card = (CardLayout)wholePanel.getLayout();
        card.show(wholePanel, "profilePanel");
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

    private void setFullScreen(JFrame jFrame) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        jFrame.setSize(1240,765);
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
                
            }
        System.out.println("Händelse mottagen!");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    private imat.CategoryPanel categoryPanel;
    private imat.CategoryPanel categorySearchPanel;
    private imat.checkoutPanel checkoutPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JPanel firstPanel;
    private imat.firstRegPanel firstRegPanel;
    private imat.ImageLabel helpImage;
    private imat.helpPanel helpPanel;
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
