/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Cursor;
import java.awt.GridLayout;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;
import java.awt.Dimension;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import se.chalmers.ait.dat215.project.CartEvent;
import se.chalmers.ait.dat215.project.ShoppingCartListener;

/**
 *
 * @author Johan
 */
public class shoppingCartPanel extends javax.swing.JPanel implements ShoppingCartListener {

    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private IMatDataHandler userData = IMatDataHandler.getInstance();
    private boolean goStraightToPayment;
    
    /**
     * Creates new form shoppingCartPanel
     */
    public shoppingCartPanel() {
        initComponents();
        jLabelError.setVisible(false);
        goStraightToPayment = false;
        userData.getShoppingCart().addShoppingCartListener(this);
        jPanel1.setMaximumSize(new Dimension(305, 406));
        jPanel1.setLayout(new GridLayout(10, 1));        
    }
    
    public void addObserver(PropertyChangeListener observer){
        pcs.addPropertyChangeListener(observer);
    }
    
    public boolean getGoStraightToPayment() {
        return goStraightToPayment;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        imageLabel1 = new imat.ImageLabel("kundvagn.png");
        imageLabelEmptyCart = new imat.ImageLabel("emptyShoppingCartButton.png");
        imageLabelToCheckout = new imat.ImageLabel("toCheckoutButton.png");
        jLabel2 = new javax.swing.JLabel();
        jLabelAntalProdukter = new javax.swing.JLabel();
        jLabelTotalKostnad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelError = new javax.swing.JLabel();

        setBackground(IMatColors.getpanelBackgroundNormal());
        setMaximumSize(new java.awt.Dimension(337, 604));
        setMinimumSize(new java.awt.Dimension(337, 604));
        setPreferredSize(new java.awt.Dimension(337, 604));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Kundvagn");

        imageLabel1.setText("imageLabel1");

        imageLabelEmptyCart.setText("imageLabel2");
        imageLabelEmptyCart.setToolTipText("Ta bort alla varor från kundvagnen");
        imageLabelEmptyCart.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageLabelEmptyCartMouseMoved(evt);
            }
        });
        imageLabelEmptyCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLabelEmptyCartMouseClicked(evt);
            }
        });

        imageLabelToCheckout.setBackground(new java.awt.Color(255, 255, 255));
        imageLabelToCheckout.setText("imageLabel3");
        imageLabelToCheckout.setToolTipText("Gå vidare till kassan");
        imageLabelToCheckout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageLabelToCheckoutMouseMoved(evt);
            }
        });
        imageLabelToCheckout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLabelToCheckoutMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Totalt:");

        jLabelAntalProdukter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAntalProdukter.setText("0 produkter");

        jLabelTotalKostnad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTotalKostnad.setText("0 kr");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(IMatColors.getpanelBackgroundNormal());
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane1.setViewportView(jPanel1);

        jLabelError.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(255, 0, 0));
        jLabelError.setText("Kundvagnen är tom!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imageLabelToCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabelError)
                            .addComponent(imageLabelEmptyCart, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTotalKostnad)
                            .addComponent(jLabelAntalProdukter))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelAntalProdukter)
                        .addGap(7, 7, 7)
                        .addComponent(jLabelTotalKostnad))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelError)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imageLabelToCheckout, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(imageLabelEmptyCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
    }// </editor-fold>//GEN-END:initComponents

    private void imageLabelToCheckoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelToCheckoutMouseClicked
        if (userData.getShoppingCart().getTotal() != 0.0){
            if (userData.isCustomerComplete()) {
            
                pcs.firePropertyChange("ToCheckout", 0 , 1);
            } else {
                goStraightToPayment = true;
                pcs.firePropertyChange("ToFirstRegPanel", 0, 1);
            }
            jLabelError.setVisible(false);
        } else {
                jLabelError.setVisible(true);
        }
    }//GEN-LAST:event_imageLabelToCheckoutMouseClicked

    private void imageLabelEmptyCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelEmptyCartMouseClicked
        userData.getShoppingCart().clear();
        jPanel1.removeAll();
        avp.clear();
    }//GEN-LAST:event_imageLabelEmptyCartMouseClicked

    private void imageLabelToCheckoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelToCheckoutMouseMoved
        imageLabelToCheckout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imageLabelToCheckoutMouseMoved

    private void imageLabelEmptyCartMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelEmptyCartMouseMoved
        imageLabelEmptyCart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imageLabelEmptyCartMouseMoved

    
    
    List<Product> avp = new ArrayList<>();
    List<Product> avp2 = new ArrayList<>();
    List<ShoppingItem> lastCart = new ArrayList<>();
    int items;
    
    @Override
    public void shoppingCartChanged(CartEvent evt){
        jPanel1.removeAll();
        
        avp2.clear();
        //Lägger till alla olika produkter i en lista avp2
        for (int i = userData.getShoppingCart().getItems().size() -1; i >= 0 ; i--) {

            ShoppingItem si2 = userData.getShoppingCart().getItems().get(i);

            if (si2 != null && !avp2.contains(si2.getProduct())) {
                avp2.add(si2.getProduct());
            }

        }
        
        
        //Bestämmer storleken på GridLayouten
        if (avp2.size() < 11){
            items = 11;
        } else {
            items = avp2.size();
        }
        
        //Sätter GridLayouten
        jPanel1.setLayout(new GridLayout(items ,0, 0, 0));
        
        //Kollar om händelsens produkt redan innan fanns i varukorgen
        if(evt.getShoppingItem() != null && !avp.contains(evt.getShoppingItem().getProduct())){
          
            if (userData.getShoppingCart().getItems().size() > 0){    
                avp.clear();

                //Kollar om det finns flera produkter av samma sort och 
                //gör en gemensam shoppingCartProductPanel för dem
                for (int i = userData.getShoppingCart().getItems().size() -1; i >= 0 ; i--) {

                    ShoppingItem si = userData.getShoppingCart().getItems().get(i);

                    //Kollar så att produkten inte redan är utskriven
                    if ( si != null && !avp.contains(si.getProduct())) {
                        int antal = (int)si.getAmount();

                        //Kollar efter fler produkter av samma sort
                        for (int k = i-1; k >= 0; k--){
                            if (userData.getShoppingCart().getItems().get(k).getProduct().getName().equals(
                                                                                    si.getProduct().getName())){
                                
                                antal += (int)userData.getShoppingCart().getItems().get(k).getAmount();
                            }
                        }
                        jPanel1.add(new shoppingCartProductPanel(antal, si.getProduct()));
                        
                        avp.add(si.getProduct());
                    }

                }
            }
        } else {
            
            for (Product pr: avp){
                int antalPr = 0;
                for (int i = 0; i < userData.getShoppingCart().getItems().size(); i++){
                    if (userData.getShoppingCart().getItems().get(i).getProduct().equals(pr)){
                        antalPr += (int)userData.getShoppingCart().getItems().get(i).getAmount();
                    }  
                }
                if (antalPr > 0){
                    jPanel1.add(new shoppingCartProductPanel(antalPr, pr));
                }
            }
            
        }
        int totAntalProdukter = 0;
            
            for (int i = 0; i < userData.getShoppingCart().getItems().size();i++){
                totAntalProdukter += (int)userData.getShoppingCart().getItems().get(i).getAmount();
            }
            
            jLabelAntalProdukter.setText(totAntalProdukter + " produkter");
            jLabelTotalKostnad.setText(Math.round(userData.getShoppingCart().getTotal()*100)/100.0 + " kr");
            
        
        lastCart = userData.getShoppingCart().getItems();
        revalidate();
        repaint();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private imat.ImageLabel imageLabel1;
    private imat.ImageLabel imageLabelEmptyCart;
    private imat.ImageLabel imageLabelToCheckout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAntalProdukter;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelTotalKostnad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}
