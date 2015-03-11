/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.GridLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;
/**
 *
 * @author Johan
 */
public class checkoutPanel extends javax.swing.JPanel {

    private IMatDataHandler userData = IMatDataHandler.getInstance();
    List<Product> avp = new ArrayList<>();
    List<Product> avp2 = new ArrayList<>();
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    
    /**
     * Creates new form checkoutPanel
     */
    public checkoutPanel() {
        initComponents();
        cartEmptyError.setVisible(false);
        this.setBackground(IMatColors.getpanelBackgroundLight());
        jCheckBox1.setBackground(IMatColors.getpanelBackgroundLight());
    }
   
    public void addObserver(PropertyChangeListener observer){
        pcs.addPropertyChangeListener(observer);
    }
    
    public void updatePanels(){
        int items;
        jPanelAllProducts.removeAll();
        avp2.clear();
        Color c;
        
        //Lägger till alla olika produkter i en lista avp2
        for (int i = userData.getShoppingCart().getItems().size() -1; i >= 0 ; i--) {

            ShoppingItem si2 = userData.getShoppingCart().getItems().get(i);

            if (si2 != null && !avp2.contains(si2.getProduct())) {
                avp2.add(si2.getProduct());
            }
        }
        
        //Bestämmer storleken på GridLayouten
        if (avp2.size() < 8){
            items = 8;
        } else {
            items = avp2.size();
        }
        
        int totalItems = 0;
        //Sätter GridLayouten
        jPanelAllProducts.setLayout(new GridLayout(items, 1));
        avp.clear();
        //Kör igenom alla produkter i kundvagnen
        for (int i = 0; i < userData.getShoppingCart().getItems().size(); i++){
            
            //Kollar så att produkten inte redan finns i kundvagnen
            if (!avp.contains(userData.getShoppingCart().getItems().get(i).getProduct())){
                
                int antalP = (int)userData.getShoppingCart().getItems().get(i).getAmount();
                
                //Kör igenom alla produkter efter i
                for (int k = i+1; k < userData.getShoppingCart().getItems().size(); k++){
                    
                    if (userData.getShoppingCart().getItems().get(i).getProduct().getName().equals(
                                    userData.getShoppingCart().getItems().get(k).getProduct().getName())){
                        
                        antalP += (int)userData.getShoppingCart().getItems().get(k).getAmount();
                        
                    }
                }
                /*if (nbrOfProductPanels()%2 == 0){
                    c = Color.WHITE;
                } else {
                    c = IMatColors.getpanelBackgroundNormal();
                }*/
                Random rnd = new Random();
                int x1 = rnd.nextInt(255);
                int x2 = rnd.nextInt(255);
                int x3 = rnd.nextInt(255);
                
                c = new Color(x1, x2, x3);
                
                jPanelAllProducts.add(new CheckoutProductPanel(antalP, userData.getShoppingCart().getItems().get(i).getProduct(), c));
                avp.add(userData.getShoppingCart().getItems().get(i).getProduct());
                totalItems += antalP;
            }
            
        }
        
        jLabelTotalAmount.setText(totalItems + " produkter");
        jLabelTotalPrice.setText(userData.getShoppingCart().getTotal() + " kr");
        revalidate();
        repaint();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelAllProducts = new javax.swing.JPanel();
        checkoutPostalCodeTF = new javax.swing.JTextField();
        checkoutCityTF = new javax.swing.JTextField();
        checkoutAddressTF = new javax.swing.JTextField();
        deliveryDayCombo = new javax.swing.JComboBox();
        deliveryTimeCombo = new javax.swing.JComboBox();
        checkoutPhoneNbrTF = new javax.swing.JTextField();
        jTextFieldCardnumber1 = new javax.swing.JTextField();
        jTextFieldCCV = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButtonPay = new javax.swing.JButton();
        cartEmptyError = new javax.swing.JLabel();
        jTextFieldCardnumber2 = new javax.swing.JTextField();
        jTextFieldCardnumber4 = new javax.swing.JTextField();
        jTextFieldCardnumber3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelBack = new javax.swing.JLabel();
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
        jLabel14 = new javax.swing.JLabel();
        jLabelTotalAmount = new javax.swing.JLabel();
        jLabelTotalPrice = new javax.swing.JLabel();

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanelAllProducts.setBackground(IMatColors.getpanelBackgroundNormal());

        javax.swing.GroupLayout jPanelAllProductsLayout = new javax.swing.GroupLayout(jPanelAllProducts);
        jPanelAllProducts.setLayout(jPanelAllProductsLayout);
        jPanelAllProductsLayout.setHorizontalGroup(
            jPanelAllProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );
        jPanelAllProductsLayout.setVerticalGroup(
            jPanelAllProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanelAllProducts);

        checkoutPostalCodeTF.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        checkoutPostalCodeTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        checkoutCityTF.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        checkoutCityTF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        checkoutAddressTF.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        deliveryDayCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Idag", "Imorgon", "Fredag(6/3)", "Lördag(7/3)" }));

        deliveryTimeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mellan 15-18", "mellan 18-21" }));

        checkoutPhoneNbrTF.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        checkoutPhoneNbrTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextFieldCardnumber1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jTextFieldCardnumber1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldCardnumber1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCardnumber1KeyPressed(evt);
            }
        });

        jTextFieldCCV.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jTextFieldCCV.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldCCV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCCVKeyPressed(evt);
            }
        });

        jCheckBox1.setText("Spara inköpslista");

        jButtonPay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonPay.setText("Betala");
        jButtonPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButtonPayFocusLost(evt);
            }
        });
        jButtonPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPayMouseClicked(evt);
            }
        });

        cartEmptyError.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cartEmptyError.setForeground(java.awt.Color.red);
        cartEmptyError.setText("Du måste fylla i alla fält!");

        jTextFieldCardnumber2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jTextFieldCardnumber2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldCardnumber2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCardnumber2KeyPressed(evt);
            }
        });

        jTextFieldCardnumber4.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jTextFieldCardnumber4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldCardnumber4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCardnumber4KeyPressed(evt);
            }
        });

        jTextFieldCardnumber3.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jTextFieldCardnumber3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldCardnumber3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCardnumber3KeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("-");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("-");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("-");

        jLabelBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelBack.setText("<< Tillbaka");
        jLabelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Kassa");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Leverans:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel6.setText("Levereras");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel7.setText("till address");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel8.setText("post nr");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel9.setText("ort");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel10.setText("telefon nr");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel11.setText("Betalas med:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel12.setText("Kortnummer:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel13.setText("CCV:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Totalt:");

        jLabelTotalAmount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTotalAmount.setText("0 produkter");

        jLabelTotalPrice.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTotalPrice.setText("0 kr");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTotalAmount)
                                .addGap(241, 241, 241)
                                .addComponent(jLabelTotalPrice)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(jLabel7))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel12)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(deliveryDayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deliveryTimeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(checkoutAddressTF, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(checkoutPostalCodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(10, 10, 10)
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(checkoutCityTF))
                                                .addComponent(checkoutPhoneNbrTF, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jTextFieldCCV, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextFieldCardnumber1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextFieldCardnumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextFieldCardnumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextFieldCardnumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 27, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jCheckBox1)
                                                .addGap(29, 29, 29))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(cartEmptyError)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addComponent(jButtonPay, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelBack)
                        .addGap(385, 385, 385)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabelBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabelTotalAmount)
                            .addComponent(jLabelTotalPrice))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deliveryTimeCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(deliveryDayCombo)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkoutAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkoutPostalCodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkoutCityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkoutPhoneNbrTF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCardnumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCardnumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldCardnumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCardnumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldCCV, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cartEmptyError)
                                .addGap(0, 65, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonPay, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPayMouseClicked
        if (isReadyToPay()) {
            userData.placeOrder();
            userData.getShoppingCart().clear();
            checkoutAddressTF.getText();
            pcs.firePropertyChange("buyCompleted", 0, 1);
        } else {
            cartEmptyError.setVisible(true);
        }
    }//GEN-LAST:event_jButtonPayMouseClicked

    public int nbrOfProductPanels(){
        return jPanelAllProducts.getComponents().length;
    }
    
    private boolean isReadyToPay(){
        String cardNumber = jTextFieldCardnumber1.getText() + "-" 
                            + jTextFieldCardnumber2.getText() + "-" 
                             + jTextFieldCardnumber3.getText() + "-"
                              + jTextFieldCardnumber4.getText();
        
        
        return !checkoutAddressTF.getText().equals("") && 
                !checkoutCityTF.getText().equals("") &&
                 !checkoutPostalCodeTF.getText().equals("") &&
                  !checkoutPhoneNbrTF.getText().equals("") &&
                    cardNumber.length() == 19 &&
                     jTextFieldCCV.getText().length() == 3;
    }
    
    private void jButtonPayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonPayFocusLost
        cartEmptyError.setVisible(false);
    }//GEN-LAST:event_jButtonPayFocusLost

    private void jTextFieldCardnumber1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCardnumber1KeyPressed
        if (jTextFieldCardnumber1.getDocument().getLength() >= 4 && !(evt.getKeyCode() == KeyEvent.VK_BACKSPACE)){
            jTextFieldCardnumber1.setText(jTextFieldCardnumber1.getText().substring(0, 3));
        }
    }//GEN-LAST:event_jTextFieldCardnumber1KeyPressed

    private void jTextFieldCardnumber2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCardnumber2KeyPressed
        if (jTextFieldCardnumber2.getDocument().getLength() >= 4 && !(evt.getKeyCode() == KeyEvent.VK_BACKSPACE)){
            jTextFieldCardnumber2.setText(jTextFieldCardnumber2.getText().substring(0, 3));
        }
    }//GEN-LAST:event_jTextFieldCardnumber2KeyPressed

    private void jTextFieldCardnumber3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCardnumber3KeyPressed
        if (jTextFieldCardnumber3.getDocument().getLength() >= 4 && !(evt.getKeyCode() == KeyEvent.VK_BACKSPACE)){
            jTextFieldCardnumber3.setText(jTextFieldCardnumber3.getText().substring(0, 3));
        }
    }//GEN-LAST:event_jTextFieldCardnumber3KeyPressed

    private void jTextFieldCardnumber4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCardnumber4KeyPressed
        if (jTextFieldCardnumber4.getDocument().getLength() >= 4 && !(evt.getKeyCode() == KeyEvent.VK_BACKSPACE)){
            jTextFieldCardnumber4.setText(jTextFieldCardnumber4.getText().substring(0, 3));
        }
    }//GEN-LAST:event_jTextFieldCardnumber4KeyPressed

    private void jTextFieldCCVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCCVKeyPressed
        if (jTextFieldCCV.getDocument().getLength() >= 3 && !(evt.getKeyCode() == KeyEvent.VK_BACKSPACE)){
            jTextFieldCCV.setText(jTextFieldCCV.getText().substring(0, 2));
        }
    }//GEN-LAST:event_jTextFieldCCVKeyPressed

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        pcs.firePropertyChange("checkoutBack", 0, 1);
    }//GEN-LAST:event_jLabelBackMouseClicked
 
    /**
     * Autofills the info from user profile.
     */
    public void setCheckoutInfo() {
        checkoutAddressTF.setText(userData.getCustomer().getAddress());
        checkoutPostalCodeTF.setText(userData.getCustomer().getPostCode());
        checkoutCityTF.setText(userData.getCustomer().getPostAddress());
        checkoutPhoneNbrTF.setText(userData.getCustomer().getPhoneNumber());
        if (!userData.getCreditCard().getCardNumber().equals("")){
            jTextFieldCardnumber1.setText(userData.getCreditCard().getCardNumber().substring(0, 4));
            jTextFieldCardnumber2.setText(userData.getCreditCard().getCardNumber().substring(5, 9));
            jTextFieldCardnumber3.setText(userData.getCreditCard().getCardNumber().substring(10, 14));
            jTextFieldCardnumber4.setText(userData.getCreditCard().getCardNumber().substring(15));
        }
    }
    
    public String getDeliveryDay() {
        return deliveryDayCombo.getSelectedItem().toString();
    }
    
    public String getDeliveryTime() {
        return deliveryTimeCombo.getSelectedItem().toString();
    }
    
    public String getDeliveryAddress() {
        return checkoutAddressTF.getText();
    }
    
    public String getDeliveryPost() {
        return checkoutPostalCodeTF.getText();
    }
    
    public String getDeliveryCity() {
        return checkoutCityTF.getText();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cartEmptyError;
    private javax.swing.JTextField checkoutAddressTF;
    private javax.swing.JTextField checkoutCityTF;
    private javax.swing.JTextField checkoutPhoneNbrTF;
    private javax.swing.JTextField checkoutPostalCodeTF;
    private javax.swing.JComboBox deliveryDayCombo;
    private javax.swing.JComboBox deliveryTimeCombo;
    private javax.swing.JButton jButtonPay;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelTotalAmount;
    private javax.swing.JLabel jLabelTotalPrice;
    private javax.swing.JPanel jPanelAllProducts;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCCV;
    private javax.swing.JTextField jTextFieldCardnumber1;
    private javax.swing.JTextField jTextFieldCardnumber2;
    private javax.swing.JTextField jTextFieldCardnumber3;
    private javax.swing.JTextField jTextFieldCardnumber4;
    // End of variables declaration//GEN-END:variables

    
}
