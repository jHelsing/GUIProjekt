/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import se.chalmers.ait.dat215.project.IMatDataHandler;

/**
 *
 * @author hilden
 */
public class HistoryPanel extends javax.swing.JPanel {

    private IMatDataHandler data = IMatDataHandler.getInstance();
    private DefaultListModel historyListModel;
    private SimpleDateFormat sdf;
    private int historyIndex;
    private DefaultListModel itemListModel;
    private StripeRenderer zebra;
    
    /**
     * Creates new form historyPanel
     */
    public HistoryPanel() {
        initComponents();
        zebra = new StripeRenderer();
        sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        historyListModel = new DefaultListModel();
        historyList.setModel(historyListModel);
        historyIndex = 0;
        itemListModel = new DefaultListModel();
        historyList.setCellRenderer(zebra);
        itemList.setModel(itemListModel);
        itemList.setCellRenderer(zebra);
    }
    
    private void incHistoryIndex() {
        historyIndex++;
    }
    
    public void addToHistory() {
        if (historyListModel.getSize() == 13) {
            historyListModel.remove(13);
        }
        double price = 0;
        double nbrOfItems = 0;
        for (int i = 0; i < data.getOrders().get(historyIndex).getItems().size(); i++) {
            price = price + data.getOrders().get(historyIndex).getItems().get(i).getTotal();
            nbrOfItems = nbrOfItems + data.getOrders().get(historyIndex).getItems().get(i).getAmount();  
        }
        String priceS = Double.toString(price);
        String nbrOfItemsS = Integer.toString((int)nbrOfItems);
        String dateNicelyDisplayed = sdf.format(data.getOrders().get(historyIndex).getDate());
        String total = dateNicelyDisplayed + "           " + nbrOfItemsS + "                     " + priceS + " kr";
        historyListModel.addElement(total);
        this.incHistoryIndex();
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemList = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historyList = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Köphistorik");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nedan visas de senaste beställningarna du gjort hos iMat. Klicka på en av dem för att få mer");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("detaljerad information om köpet.");

        itemList.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        itemList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(itemList);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText(" Datum                               Antal produkter               Totalbelopp");

        historyList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        historyList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        historyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historyListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(historyList);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("     Produkt                         Antal                      Pris / enhet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void historyListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyListMouseClicked
        if (!historyListModel.isEmpty()) {
            itemListModel.clear();
            int selectedValue = historyList.getSelectedIndex();
            
            //vill invertera listan..
            
            for (int j = 0; j < data.getOrders().get(selectedValue).getItems().size(); j++) {
                String item = data.getOrders().get(selectedValue).getItems().get(j).getProduct().getName();
                String itemNbr = Double.toString(data.getOrders().get(selectedValue).getItems().get(j).getAmount());
                String itemCost = Double.toString(data.getOrders().get(selectedValue).getItems().get(j).getTotal());
                String productSum = item + "                 " + itemNbr + "                   " + itemCost;
                itemListModel.addElement(productSum);
            }
        }
    }//GEN-LAST:event_historyListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList historyList;
    private javax.swing.JList itemList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
