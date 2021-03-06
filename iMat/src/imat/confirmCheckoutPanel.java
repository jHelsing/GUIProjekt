/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Johan
 */
public class confirmCheckoutPanel extends javax.swing.JPanel {

    private IMatDataHandler userData = IMatDataHandler.getInstance();
    private DefaultListModel receiptListModel;
    private int lastIndex;
    private String deliveryDay;
    private String deliveryTime;
    private String deliveryAddress;
    private String deliveryPost;
    private String deliveryCity;
    
    
    /**
     * Creates new form confirmCheckoutPanel
     */
    public confirmCheckoutPanel() {
        initComponents();
        receiptListModel = new DefaultListModel();
        receiptList.setCellRenderer(new StripeRenderer());
        receiptList.setModel(receiptListModel);
        confirmationLabel.setVisible(false);
        this.setBackground(IMatColors.getpanelBackgroundNormal());
    }
    
    public void updateReceipt() {
        lastIndex = userData.getOrders().size()-1;
        updateReceiptList();
        updateReceiptLabels();
        updateDeliveryLabels();
    }
    
    private void updateReceiptList() {
        confirmationLabel.setVisible(false);
        receiptListModel.clear();
        /*String name;
        String amount;
        String price;
        String total;
        for (int i = 0; i < userData.getOrders().get(lastIndex).getItems().size(); i++) {
            name = userData.getOrders().get(lastIndex).getItems().get(i).getProduct().getName();
            amount = Integer.toString((int)userData.getOrders().get(lastIndex).getItems().get(i).getAmount());
            price = Double.toString(userData.getOrders().get(lastIndex).getItems().get(i).getProduct().getPrice());
            String space1 = StringSizeHelper.getEmptyString(name, 19);
            String space2 = StringSizeHelper.getEmptyString(userData.getOrders().get(lastIndex).getItems().get(i).getProduct().getUnitSuffix(), 7);
            total = name + space1 + amount + " " +
                    userData.getOrders().get(lastIndex).getItems().get(i).getProduct().getUnitSuffix()
                    + space2 +  price + " kr";
            receiptListModel.add(i, total);
        }*/
        
        List<String> avp = new ArrayList<>();
        for (int i = 0; i < userData.getOrders().get(lastIndex).getItems().size(); i++) {
            ShoppingItem si = userData.getOrders().get(lastIndex).getItems().get(i);
            
            if (!avp.contains(si.getProduct().getName())){
                int totAntal = (int)si.getAmount();
                for (int k = i+1; k < userData.getOrders().get(lastIndex).getItems().size(); k++){
                    ShoppingItem siTemp = userData.getOrders().get(lastIndex).getItems().get(k);
                    if (siTemp.getProduct().getName().equals(si.getProduct().getName())){
                        totAntal += (int)siTemp.getAmount();
                    }
                }
                String totalString = si.getProduct().getName() + StringSizeHelper.getEmptyString(si.getProduct().getName(), 20) + totAntal + " " + si.getProduct().getUnitSuffix() + 
                                                "      " + si.getProduct().getPrice() + "/" + si.getProduct().getUnitSuffix();
                
                receiptListModel.add(avp.size(), totalString);
                avp.add(si.getProduct().getName());
            }
        }
    }
    
    private void updateReceiptLabels() {
        double totPrice = 0;
        double nbrOfItems = 0;
        for (int i = 0; i < userData.getOrders().get(lastIndex).getItems().size(); i++) {
            totPrice = totPrice + userData.getOrders().get(lastIndex).getItems().get(i).getTotal();
            nbrOfItems = nbrOfItems + userData.getOrders().get(lastIndex).getItems().get(i).getAmount();  
        }
        totalProdLabel.setText(Integer.toString((int)nbrOfItems) + " produkter");
        totalPriceLabel.setText(Double.toString(totPrice) + " kr");
    }
    
    private void updateDeliveryLabels() {
        streetLabel.setText(deliveryAddress);
        postLabel.setText(deliveryPost);
        cityLabel.setText(deliveryCity);
        deliveryDayLabel.setText(deliveryDay);
        deliveryTimeLabel.setText(deliveryTime);
        emailTF.setText(userData.getCustomer().getEmail());
    }
    
    public void setReceiptInfo(String deliveryDay, String deliveryTime,
            String deliveryAddress, String deliveryPost, String deliveryCity) {
        this.deliveryDay = deliveryDay;
        this.deliveryTime = deliveryTime;
        this.deliveryAddress = deliveryAddress;
        this.deliveryPost = deliveryPost;
        this.deliveryCity = deliveryCity;
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiptList = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalProdLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        streetLabel = new javax.swing.JLabel();
        deliveryDayLabel = new javax.swing.JLabel();
        deliveryTimeLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        emailTF = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        deliveryDateLabel1 = new javax.swing.JLabel();
        confirmationLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        postLabel = new javax.swing.JLabel();
        confirmationLabel1 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Här är din beställning");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Tack för att du handlar hos iMat!");

        receiptList.setBackground(IMatColors.getpanelBackgroundLight());
        receiptList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(receiptList);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText(" Dina beställda varor:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Totalt:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Levereras till:");

        totalProdLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        totalProdLabel.setText("5 produkter");

        totalPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        totalPriceLabel.setText("382.12 kr");

        streetLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        streetLabel.setText("Jennylindsgatan 16");

        deliveryDayLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deliveryDayLabel.setText("Torsdag (4/5)");

        deliveryTimeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deliveryTimeLabel.setText("mellan 15-18");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        emailTF.setBackground(IMatColors.getpanelBackgroundLight());
        emailTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailTF.setText("johannes.hilden@gmail.com");

        sendButton.setText("Skicka");
        sendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendButtonMouseClicked(evt);
            }
        });

        deliveryDateLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deliveryDateLabel1.setText("Maila kvitto till:");

        confirmationLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        confirmationLabel.setText("Kvitto skickat!");

        cityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cityLabel.setText("Göteborg");

        postLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        postLabel.setText("416 62");

        confirmationLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        confirmationLabel1.setForeground(new java.awt.Color(0, 200, 0));
        confirmationLabel1.setText("                     ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel3)))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(562, 562, 562)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(280, 280, 280)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(confirmationLabel)
                                    .addComponent(confirmationLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)
                                .addComponent(totalProdLabel)
                                .addGap(53, 53, 53)
                                .addComponent(totalPriceLabel)))
                        .addGap(311, 311, 311))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deliveryTimeLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deliveryDateLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(deliveryDayLabel)
                            .addComponent(cityLabel)
                            .addComponent(postLabel)
                            .addComponent(streetLabel))
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(404, 404, 404))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(streetLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(postLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deliveryDayLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deliveryTimeLabel)
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deliveryDateLabel1)
                            .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmationLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmationLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPriceLabel)
                    .addComponent(totalProdLabel)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendButtonMouseClicked
        if (emailTF.getText() != null) {
            confirmationLabel.setVisible(true);
        }
    }//GEN-LAST:event_sendButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel confirmationLabel;
    private javax.swing.JLabel confirmationLabel1;
    private javax.swing.JLabel deliveryDateLabel1;
    private javax.swing.JLabel deliveryDayLabel;
    private javax.swing.JLabel deliveryTimeLabel;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel postLabel;
    private javax.swing.JList receiptList;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JLabel totalProdLabel;
    // End of variables declaration//GEN-END:variables
}
