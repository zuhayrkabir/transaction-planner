/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package budgetApp;

/**
 *
 * @author mohammadzuhayrkabir
 */
public class ExpenseCategory {
  
    //Category = Fixed or Variable payments 	
    private int expenseCategoryID;
    private String expenseCategoryType;
    private double budgetAmount;
    private double availableBudget;
	    
    public ExpenseCategory(int expenseCategoryID, String expenseCategoryType, double budgetAmount) {
        this.expenseCategoryID = expenseCategoryID;
        this.expenseCategoryType = expenseCategoryType;
        this.budgetAmount = budgetAmount;
        this.availableBudget = budgetAmount;
    }

    // Getters and Setters
    public int getExpenseCategoryID() {
        return expenseCategoryID;
    }

    public void setExpenseCategoryID(int expenseCategoryID) {
        this.expenseCategoryID = expenseCategoryID;
    }

    public String getExpenseCategoryType() {
        return expenseCategoryType;
    }

    public void setExpenseCategoryType(String expenseCategoryType) {
        this.expenseCategoryType = expenseCategoryType;
    }

    public double getCategoryBudgetAmount() {
        return budgetAmount;
    }

    public void setCategoryBudgetAmount(double budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public double getCategoryRemainingAmount() {
        return availableBudget;
    }
    
    public void setCategoryRemainingAmount(double availableBudget) {
        this.availableBudget = availableBudget;
    }
	

    // Methods
    public boolean addNewCategoryToDB(ExpenseCategory category) {
        //this will add/edit new categories to the database 
        return true; // Return true to indicate success
    }


    public boolean modifyExpenseCategoryTypeInDB(ExpenseCategory category) {
        //code
        return true; // Return true to indicate success
    }

    //To remove a category
    public boolean removeExistingCategory(int itemCategoryID) {
        //remove category based on categoryID 
        return true;
    }


    
}
