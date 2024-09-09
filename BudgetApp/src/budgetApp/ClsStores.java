/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package budgetApp;

/**
 *
 * @author mohammadzuhayrkabir
 */
public class ClsStores {

    private int storeID;
    private String storeName;

    public int getStoreID() {
        return this.storeID;
    }

    public String getStoreName() {
        return this.storeName;
    }
	    
	    
    public void setStoreID(int storeID) {
	this.storeID = storeID;
    }

    public void setStoreName(String storeName) {
	this.storeName = storeName;
    }
	    
    public boolean modifyStoreName(String newStoreName) {
	this.storeName = newStoreName;
	return true; // Return true to indicate success
    }
	    
	     
/* 
    public boolean modifyStoreNameInDB(int storeID) {
        ///add code
	return true;
    }
	    
    public boolean addStoreInDB() {
	//add code
	return true; 
    }
	    
	    
    public boolean removeStoreInDB(int storeID) {
	//add code
	return true;
    }
	    
	 */    

}
