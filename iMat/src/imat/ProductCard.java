/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.awt.Dimension;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author jonathan
 */
public class ProductCard extends javax.swing.JPanel {
    
    private IMatDataHandler data = IMatDataHandler.getInstance();
    
    private final Dimension IMGDIMENSION = new Dimension(50,50);
    
    private final Product p;

    /**
     * Creates new form ProductCard
     */
    public ProductCard() {
        initComponents();
        this.p = null;
    }
    
    public ProductCard(Product p) {
        initComponents();
        this.p=p;
        productImage.setIcon(data.getImageIcon(p,IMGDIMENSION));
        productUnitsLabel.setText(p.getUnitSuffix());
        productNameLabel.setText(p.getName());
        productPriceLabel.setText(p.getPrice() + " " + p.getUnit());
        this.setBackground(new Color(130,130,130));
        this.setVisible(true);
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

        productImage = new javax.swing.JLabel();
        addToCartButton = new imat.ImageLabel("addToCartButton.png");
        nbrOfProductsSpinner = new imat.CustomSpinner();
        productUnitsLabel = new javax.swing.JLabel();
        productNameLabel = new javax.swing.JLabel();
        productPriceLabel = new javax.swing.JLabel();
        addToShoppingListButton = new imat.ImageLabel("addToShoppingListButton.png");
        favoriteButton = new imat.ImageLabel("unmarkedFavButton.png", "markedFavButton.png");

        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(176, 169));
        setMinimumSize(new java.awt.Dimension(176, 169));
        setPreferredSize(new java.awt.Dimension(176, 169));
        setSize(new java.awt.Dimension(176, 169));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        productImage.setMaximumSize(new java.awt.Dimension(60, 60));
        productImage.setMinimumSize(new java.awt.Dimension(60, 60));
        productImage.setPreferredSize(new java.awt.Dimension(60, 60));
        productImage.setRequestFocusEnabled(false);

        addToCartButton.setText("imageLabel1");
        addToCartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addToCartButtonMouseClicked(evt);
            }
        });
        addToCartButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addToCartButtonMouseMoved(evt);
            }
        });

        productUnitsLabel.setText("kg");

        productNameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        productNameLabel.setText("ProductName");

        productPriceLabel.setText("Price");

        addToShoppingListButton.setText("imageLabel1");
        addToShoppingListButton.setToolTipText("");
        addToShoppingListButton.setMaximumSize(new java.awt.Dimension(40, 40));
        addToShoppingListButton.setMinimumSize(new java.awt.Dimension(40, 40));
        addToShoppingListButton.setPreferredSize(new java.awt.Dimension(40, 40));
        addToShoppingListButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addToShoppingListButtonMouseClicked(evt);
            }
        });
        addToShoppingListButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addToShoppingListButtonMouseMoved(evt);
            }
        });

        favoriteButton.setText("imageLabel1");
        favoriteButton.setMaximumSize(new java.awt.Dimension(30, 30));
        favoriteButton.setMinimumSize(new java.awt.Dimension(30, 30));
        favoriteButton.setPreferredSize(new java.awt.Dimension(30, 30));
        favoriteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favoriteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(productImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productPriceLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nbrOfProductsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productUnitsLabel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addToShoppingListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(productNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(favoriteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(favoriteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(productNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(productPriceLabel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nbrOfProductsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(productUnitsLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addToShoppingListButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(productImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO go to the specific product panel for THIS product
    }//GEN-LAST:event_formMouseClicked

    private void addToShoppingListButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addToShoppingListButtonMouseClicked
        // TODO Add the product to the shopping lists.
    }//GEN-LAST:event_addToShoppingListButtonMouseClicked

    private void addToCartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addToCartButtonMouseClicked
        // Add the product to the shoppingCart with the amount of products
        // that's specified by the nbrOfProductsSpinner.
        data.getShoppingCart().addProduct(p, nbrOfProductsSpinner.getValue());
    }//GEN-LAST:event_addToCartButtonMouseClicked

    private void favoriteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoriteButtonMouseClicked
        
        if(data.isFavorite(p)) {
             // Om produkten redan är favoritmarkerad -> ta bort favorit markeringen
            data.removeFavorite(p);
            favoriteButton.imageNormal();
        } else {
            //Om produkten inte är favoritmarkerad -> markera den som favorit
            data.addFavorite(p);
            favoriteButton.imageHover();
        }
    }//GEN-LAST:event_favoriteButtonMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        this.setBackground(Color.lightGray);
    }//GEN-LAST:event_formMouseMoved

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(Color.GRAY);
    }//GEN-LAST:event_formMouseExited

    private void addToShoppingListButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addToShoppingListButtonMouseMoved
        this.setBackground(Color.lightGray);
    }//GEN-LAST:event_addToShoppingListButtonMouseMoved

    private void addToCartButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addToCartButtonMouseMoved
        this.setBackground(Color.lightGray);
    }//GEN-LAST:event_addToCartButtonMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private imat.ImageLabel addToCartButton;
    private imat.ImageLabel addToShoppingListButton;
    private imat.ImageLabel favoriteButton;
    private imat.CustomSpinner nbrOfProductsSpinner;
    private javax.swing.JLabel productImage;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JLabel productPriceLabel;
    private javax.swing.JLabel productUnitsLabel;
    // End of variables declaration//GEN-END:variables
}
