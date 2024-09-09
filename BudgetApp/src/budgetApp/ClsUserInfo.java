/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package budgetApp;

/**
 *
 * @author mohammadzuhayrkabir
 */
public class ClsUserInfo {
    
    
    public ClsUserInfo(String userName, String password, String userEmailID, int userPhoneNo) {
	this.userName = userName;
	this.password = password;
	this.userEmailID = userEmailID;
        this.userPhoneNo = userPhoneNo; 
    }
    
//   private int userID;
    private String password;
    private String userName;
    private String userEmailID;
    private int userPhoneNo;
	
	
    //Getters
    public String getUserName() {
    	return this.userName; 
    }
	
    public String getPassword() {
	return this.password;
    }
	
    public String getEmailID() {
	return this.userEmailID;
    }
	
    public int getPhoneNo() {
	return this.userPhoneNo; 
    }
	
	
    //Setters
    public void setUserName(String userName) {
    	this.userName = userName;
    }
	
    public void setPassword(String password) {
	this.password = password;
    }
	
   /*  public void setUserInfoID(int userInfoID) {
	this.userInfoID = userInfoID;
    } */
	
    public void setUserEmailID(String userEmailID) {
    	this.userEmailID = userEmailID;
    }
	
    public void setUserPhoneNo(int userPhoneNo) {
    	this.userPhoneNo = userPhoneNo;
    }
   
}
