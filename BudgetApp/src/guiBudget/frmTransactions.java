/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiBudget;

import budgetApp.*;
import databaseBudget.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author mohammadzuhayrkabir
 */

public class frmTransactions extends javax.swing.JFrame {

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
            java.util.logging.Logger.getLogger(frmTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTransactions().setVisible(true);
            }
        });
        
        // Sample ArrayList of Transaction objects
        ArrayList<ClsTransaction> transactions = new ArrayList<ClsTransaction>();
        
        
        /* Here, we call the mergeSort method to sort the transactions ArrayList based on the transactionPrice. 
        The parameters 0 and transactions.size() - 1 represent the range of indices to be sorted, 
        initially the entire list. */
        
        // Perform merge sort based on transaction price
        mergeSortLowToHigh(transactions, 0, transactions.size() - 1);

        
        // Print the transactions sorted in terms of their values
        for (ClsTransaction transaction : transactions) {
            System.out.println(transaction);
        }
        
        
    }
     
     
    /**
     * Creates new form frmTransactions
     */
    public frmTransactions() {
        initComponents();
    }

    
    //THIS WILL LATER BE ADDED UNDER ACTION LISTENER OF A FILTER BY BUTTON 
    
    //Merge sort to sort the array list through transaction amounts to work for filtering from lowest value to highest
    
    private static void mergeSortLowToHigh(ArrayList<ClsTransaction> transactions, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            
            /* Here, we call the mergeSort method to sort the transactions ArrayList based on the transactionPrice. 
            The parameters 0 and transactions.size() - 1 represent the range of indices to be sorted, 
            initially the entire list. */
            
            // Recursive calls for the left and right halves to make the 
            mergeSortLowToHigh(transactions, left, mid);
            mergeSortLowToHigh(transactions, mid + 1, right);

            // Merge the sorted halves
            merge(transactions, left, mid, right);
        }
    }

    private static void merge(ArrayList<ClsTransaction> transactions, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays to store the left and right halves.
        ArrayList<ClsTransaction> leftArray = new ArrayList<>(transactions.subList(left, left + n1));
        ArrayList<ClsTransaction> rightArray = new ArrayList<>(transactions.subList(mid + 1, mid + 1 + n2));

        
        /* It iterates through these temporary arrays, compares the transactionPrice, 
        and merges them back into the original ArrayList (transactions). 
        The process is repeated until the entire list is sorted. */
        
        // Merge the temporary arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray.get(i).getTransactionAmount() <= rightArray.get(j).getTransactionAmount()) {
                transactions.set(k, leftArray.get(i));
                i++;
            } else {
                transactions.set(k, rightArray.get(j));
                j++;
            }
            k++;
        }

        
        // Copy remaining elements of leftArray, if any
        while (i < n1) {
            transactions.set(k, leftArray.get(i));
            i++;
            k++;
        }

        // Copy remaining elements of rightArray, if any
        while (j < n2) {
            transactions.set(k, rightArray.get(j));
            j++;
            k++;
        }
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
        transactionCategoryBox = new javax.swing.JComboBox<>();
        transactionItemBox = new javax.swing.JComboBox<>();
        transactionNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        transactionAmountField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        storeNameField = new javax.swing.JTextField();
        addTransactionBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Transaction Category");

        jLabel2.setText("Transaction Item");

        jLabel3.setText("Transaction Name");

        transactionCategoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Item 2", "Item 3", "Item 4" }));

        transactionItemBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Transaction Amount");

        jLabel5.setText("Transaction Date");

        jLabel6.setText("Store Name");

        addTransactionBtn.setText("Add Transaction");
        addTransactionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTransactionBtnActionPerformed(evt);
            }
        });

        jLabel7.setText("New Transaction");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(storeNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(transactionCategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(transactionItemBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(transactionNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addComponent(transactionAmountField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(addTransactionBtn)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(transactionCategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transactionItemBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(transactionNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transactionAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTransactionBtn))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    dbBudget budgetDatabase = new dbBudget(); 

    private void addTransactionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTransactionBtnActionPerformed
        // TODO add your handling code here:
        //new frmLogin().setVisible(true);
        
        String transactionName = transactionNameField.getText().trim();
        double transactionAmount = Double.valueOf(transactionAmountField.getText());
        
        //change category and item later
        String transactionCategory = transactionCategoryBox.getSelectedItem().toString();
        String transactionItem = transactionItemBox.getSelectedItem().toString();

        
        ClsTransaction newTransaction = new ClsTransaction(transactionName,transactionAmount,transactionCategory, transactionItem);  
        budgetDatabase.addTransaction(newTransaction);
        JOptionPane.showMessageDialog(this, "Successful Transaction Added");

        this.dispose();
    }//GEN-LAST:event_addTransactionBtnActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTransactionBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField storeNameField;
    private javax.swing.JTextField transactionAmountField;
    private javax.swing.JComboBox<String> transactionCategoryBox;
    private javax.swing.JComboBox<String> transactionItemBox;
    private javax.swing.JTextField transactionNameField;
    // End of variables declaration//GEN-END:variables
}
