/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.GridLayout;
import java.beans.PropertyChangeEvent;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import se.chalmers.ait.dat215.project.Product;
import javax.swing.JPanel;

/**
 *
 * @author jonathan
 */
public class SearchResultPanel extends JPanel {

    /**
     * Creates new form SearchResultPanel
     */
    
    private static SearchResultPanel test = new SearchResultPanel("hej");
    
    public SearchResultPanel() {
        initComponents();
    }
    
    private SearchResultPanel(String s) {
        initComponents();
        this.test = this;
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaOfSearchResult = new javax.swing.JScrollPane();
        searchResultCardContainer = new javax.swing.JPanel();

        areaOfSearchResult.setMaximumSize(new java.awt.Dimension(734, 281));
        areaOfSearchResult.setMinimumSize(new java.awt.Dimension(734, 281));
        areaOfSearchResult.setPreferredSize(new java.awt.Dimension(734, 281));

        searchResultCardContainer.setMaximumSize(new java.awt.Dimension(734, 281));
        searchResultCardContainer.setMinimumSize(new java.awt.Dimension(734, 281));
        searchResultCardContainer.setPreferredSize(new java.awt.Dimension(734, 281));

        javax.swing.GroupLayout searchResultCardContainerLayout = new javax.swing.GroupLayout(searchResultCardContainer);
        searchResultCardContainer.setLayout(searchResultCardContainerLayout);
        searchResultCardContainerLayout.setHorizontalGroup(
            searchResultCardContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );
        searchResultCardContainerLayout.setVerticalGroup(
            searchResultCardContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        areaOfSearchResult.setViewportView(searchResultCardContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(areaOfSearchResult, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(areaOfSearchResult, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void displayResults(List<Product> results) {
        revalidate();
        int nbrOfResults = results.size();
        
        // Räkna ut antalet rader för layouten av areaOfSearchResult
        int nbrOfRows = nbrOfResults/2;
        searchResultCardContainer.setLayout(new GridLayout(nbrOfRows,2));
        
        // Lägger till alla sökresultat
        for(int i=0; i<nbrOfResults; i++) {
            ProductCard pc = new ProductCard(results.get(i));
            pc.setVisible(true);
            areaOfSearchResult.add(pc);
        }
        searchResultCardContainer.setVisible(true);
        revalidate();
    }
    
    public static SearchResultPanel getInstance() {
        return test;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane areaOfSearchResult;
    private javax.swing.JPanel searchResultCardContainer;
    // End of variables declaration//GEN-END:variables
    
}
