/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package budgetApp;

import guiBudget.*;
import databaseBudget.*;
/**
 *
 * @author mohammadzuhayrkabir
 */
public class ClsItems {
    //items deals with healthcare, grocery, etc.
    private int itemID; 
    private String itemName;
    private int expenseCategoryID;

    //Constructor with all parameters
    public ClsItems(int itemID, String itemName, int expenseCategoryID) {
	this.itemID = itemID;
	this.itemName = itemName;
	this.expenseCategoryID = expenseCategoryID;
    }
	
    public ClsItems()
    {}
	
    //Getter methods
    public int getItemID() {
        return this.itemID;
    }
	
    public String getItemName() {
	return this.itemName;
    }
	
    public int getExpenseCategoryID() {
        return this.expenseCategoryID;
    }
	
	
    //Setter methods 
    public void setItemID(int itemID) {
	this.itemID = itemID;
    }
	
    //The below method can also be used to edit the ItemName if the user intends to
    public void setItemName(String itemName) {
	this.itemName = itemName; 
    }
	
    //The below method can also be used to edit the ExpenseCategoryID if the user intends to
    public void setExpenseCategoryID(int expenseCategoryID) {
        this.expenseCategoryID = expenseCategoryID;
    }
	

    // Function
    public boolean removeItem(int itemID) {
//    boolean removed = clsItems.remove(item);
//    if (removed) {
//        return true; // Return true to indicate successful removal
//    } else {
//        return false; // Return false if item was not found in the list
//   }
    return true;
    }
	
 
	
    // method to get data from database
    public boolean getAllItemsFromDB() {
    //ClsItems needs to be populated from the database values 
        return true;
    }
	
    public boolean saveItemDataToDB(ClsItems item) {
    // save values to the database
    // inside function, ensure: adding new item and removing an existing item
        return true; 
    }
	
	
    public boolean editItemInDB(ClsItems item) {
    // save values to the database
        return true; 
    }
	
	
}
