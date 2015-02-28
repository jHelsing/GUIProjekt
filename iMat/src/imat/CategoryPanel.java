/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.util.List;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * Kategoripanelen som visar de kategorier som finns när man kommit in bland
 * produkter.
 * 
 * @author jonathan
 */
public class CategoryPanel extends javax.swing.JPanel {
    
    private IMatDataHandler data = IMatDataHandler.getInstance();

    /**
     * Creates new form CategoryPanel
     */
    public CategoryPanel() {
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

        category1 = new javax.swing.JLabel();
        category2 = new javax.swing.JLabel();
        category3 = new javax.swing.JLabel();
        category4 = new javax.swing.JLabel();
        category5 = new javax.swing.JLabel();
        category6 = new javax.swing.JLabel();
        category7 = new javax.swing.JLabel();
        category8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        category1.setText("Frukt & Grönt");
        category1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                category1MouseClicked(evt);
            }
        });

        category2.setText("Bröd");
        category2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                category2MouseClicked(evt);
            }
        });

        category3.setText("Fisk & Skaldjur");
        category3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                category3MouseClicked(evt);
            }
        });

        category4.setText("Kött");
        category4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                category4MouseClicked(evt);
            }
        });

        category5.setText("Mejeriprodukter");
        category5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                category5MouseClicked(evt);
            }
        });

        category6.setText("Kalla drycker");
        category6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                category6MouseClicked(evt);
            }
        });

        category7.setText("Sötsaker");
        category7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                category7MouseClicked(evt);
            }
        });

        category8.setText("Skafferi");
        category8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                category8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator8)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(category6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(category5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(category1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(category2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(category3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(category4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(category7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(category8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(category1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(category2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(category3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(category4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(category5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(category6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(category7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(category8)
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void category1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_category1MouseClicked
        // Visar upp sökresultat på de kategorier som tillhör Frukt och grönt
        List<Product> categoryProducts = data.getProducts(ProductCategory.CITRUS_FRUIT);
        categoryProducts.addAll(data.getProducts(ProductCategory.EXOTIC_FRUIT));
        categoryProducts.addAll(data.getProducts(ProductCategory.MELONS));
        categoryProducts.addAll(data.getProducts(ProductCategory.FRUIT));
        categoryProducts.addAll(data.getProducts(ProductCategory.VEGETABLE_FRUIT));
        categoryProducts.addAll(data.getProducts(ProductCategory.CABBAGE));
        categoryProducts.addAll(data.getProducts(ProductCategory.ROOT_VEGETABLE));
        categoryProducts.addAll(data.getProducts(ProductCategory.BERRY));
        categoryProducts.addAll(data.getProducts(ProductCategory.HERB));
        categoryProducts.addAll(data.getProducts(ProductCategory.POD));
        categoryProducts.add(data.getProduct(116)); // Lägger till potatis
        categoryProducts.add(data.getProduct(117)); // Lägger till röd potatis
        categoryProducts.add(data.getProduct(118)); // lägger till ngn typ av potatis
        // Skicka dessa produkter till sökvyn
    }//GEN-LAST:event_category1MouseClicked

    private void category2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_category2MouseClicked
        // Visar upp sökresultat på de kategorier som tillhör Bröd
        List<Product> categoryProducts = data.getProducts(ProductCategory.BREAD);
        // Skicka dessa produkter till sökvyn
    }//GEN-LAST:event_category2MouseClicked

    private void category3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_category3MouseClicked
        // Visar upp de sökresultat på de kategorier som tillhör Fisk & Skaldjur
        List<Product> categoryProducts = data.getProducts(ProductCategory.FISH);
        // Skicka dessa produkter till sökvyn
    }//GEN-LAST:event_category3MouseClicked

    private void category4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_category4MouseClicked
        // Visar upp de sökresultat på de kategorier som tillhör Kött
        List<Product> categoryProducts = data.getProducts(ProductCategory.MEAT);
        // Skicka dessa produkter till sökvyn
    }//GEN-LAST:event_category4MouseClicked

    private void category5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_category5MouseClicked
        // Visar upp de sökresultat på de kategorier som tillhör Mejeriprodukter
        List<Product> categoryProducts = data.getProducts(ProductCategory.DAIRIES);
        // Skicka dessa produkter till sökvyn
    }//GEN-LAST:event_category5MouseClicked

    private void category6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_category6MouseClicked
        // Visar upp de sökresultat på de kategorier som tillhör Kalla drycker
        List<Product> categoryProducts = data.getProducts(ProductCategory.COLD_DRINKS);
        // Skicka dessa produkter till sökvyn
    }//GEN-LAST:event_category6MouseClicked

    private void category7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_category7MouseClicked
        // Visar de sökresultat på de kategorier som tillhör Sötsaker
        List<Product> categoryProducts = data.getProducts(ProductCategory.SWEET);
        // Skicka dessa produkter till sökvyn
    }//GEN-LAST:event_category7MouseClicked

    private void category8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_category8MouseClicked
        // Visar de sökresultat på de kategorier som tillhör Skafferi
        List<Product> categoryProducts = data.getProducts(ProductCategory.FLOUR_SUGAR_SALT);
        categoryProducts = data.getProducts(ProductCategory.PASTA);
        categoryProducts.addAll(data.getProducts(ProductCategory.POTATO_RICE));
        
        //Tar bort de olika typerna av potatis
        categoryProducts.remove(data.getProduct(116)); //Finns bland Frukt & Grönt
        categoryProducts.remove(data.getProduct(117)); //Finns bland Frukt & Grönt
        categoryProducts.remove(data.getProduct(118)); //Finns bland Frukt & Grönt
        
        // Skicka dessa produkter till sökvyn
    }//GEN-LAST:event_category8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel category1;
    private javax.swing.JLabel category2;
    private javax.swing.JLabel category3;
    private javax.swing.JLabel category4;
    private javax.swing.JLabel category5;
    private javax.swing.JLabel category6;
    private javax.swing.JLabel category7;
    private javax.swing.JLabel category8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
