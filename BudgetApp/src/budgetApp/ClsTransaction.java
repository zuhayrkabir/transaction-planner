/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package budgetApp;

import java.util.Date;

/**
 *
 * @author mohammadzuhayrkabir
 */
public class ClsTransaction {
 
    private int transactionID;
    private Date currentDate;
    private Date transactionDate;
    private double transactionAmount;
    private String expenseCategory;
    private String itemType;
    private ClsStores store;
    private String transactionName;
    private int userID; 
	
	
    public ClsTransaction(int transactionID, String transactionName, Date transactionDate, double transactionAmount, String expenseCategory, String itemType, ClsStores store){
	this.transactionID = transactionID; 
	this.transactionDate = transactionDate;
	this.transactionAmount = transactionAmount; 
	this.expenseCategory = expenseCategory;
	this.itemType = itemType;
	this.store = store;
        this.transactionName = transactionName; 
    }
    
    
    
    public ClsTransaction(String transactionName, double transactionAmount, String expenseCategory, String itemType){
	this.transactionAmount = transactionAmount; 
        this.transactionName = transactionName; 
        this.expenseCategory = expenseCategory;
	this.itemType = itemType;
    }

    public ClsTransaction() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	

    //Getter methods 
    public int getTransactionID() {
        return transactionID;
    }

    public Date getCurrentDate() {
       return currentDate;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }
	
    public double getTransactionAmount() {
        return transactionAmount;
    }
	
    public String getExpenseCategory() {
        return expenseCategory;
    }

    public String getItemType() {
        return itemType;
    }
    
    
    public String getTransactionName(){
        return transactionName;
    }

    
    public int getUserID(){
        return userID;
    }
    
    
    
	
    //Setters
    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }
	
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
	
    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public void setExpenseCategoryID(String expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    
    public void setTransactionName(String transactionName){
        this.transactionName = transactionName;
    }
    
    
    public void setUserID(int userID){
        this.userID = userID;
    }

	
    //Other functions 
    public boolean modifyTransactionDate(int transactionID) {
        // Implement logic to modify the transaction date
        return true; // Return true to indicate success
    }

    public void addTransactionToDB() {
        // Implement logic to add the transaction to the database
    }

    public void modifyTransactionToDB(int transactionID) {
        // Implement logic to modify the transaction in the database
    }

    public void removeTransactionFromDB(int transactionID) {
        // Implement logic to remove the transaction from the database
    }
	    
    
   /*  public String toString() {
        return "Transaction{" +
                "transactionID=" + transactionID +
                ", transactionName='" + transactionName + '\'' +
                ", transactionPrice=" + transactionAmount  +
                '}';
    } */
    
}
