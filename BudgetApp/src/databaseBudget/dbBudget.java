/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseBudget;


import java.sql.*;
import budgetApp.*;
import guiBudget.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mohammadzuhayrkabir
 */
public class dbBudget {
    
    public static void main(String args[]) throws SQLException{
        dbBudget d1 = new dbBudget();
        d1.display();
    }
    
    
    
    private Connection conn(){
        
        Connection conn = null;
        
         try { 
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:/Users/mohammadzuhayrkabir/Desktop/pc_ComputerScienceProject/BudgetApp/db/Budget_Database.db");
            System.out.println("Connection made");

        } catch (Exception e) {
            
            //Debug message to help intepret a failed connection
            System.out.println("Failed to make connection");
            
            //e.printStackTrace();
            
        }
       //Returns connection object to the calling object 
       return conn;
        
    }
    
     
    
    //Database query methods 
    
    //Prints out items to the console
    public void display() throws SQLException  {
        //public void display() throws SQLException, ClassNotFoundException {
        
        
    //Connection method is private
    Connection conn = this.conn();
        
    //Reads from database and stores the value into a results set. It's like a local table
    ResultSet rs = conn.createStatement().executeQuery("SELECT * from Login_Info");
        
    //Loops through results set
    while(rs.next()){
            
    //Prints all entries in a specific field
    System.out.println(rs.getString("Username"));
    }

    }
    
    
    
    public void signUpDatabase(ClsUserInfo user){
        
        String sqlSignIn = "INSERT INTO User_Info (UserID, Username, Password, Email, Phone_Number) VALUES(?,?,?,?,?)";

        try(Connection conn = this.conn()){
           
            System.out.println("Connection Made");

            //Prepare a SQL query to insert values into the database
            PreparedStatement statement = conn.prepareStatement(sqlSignIn);
            
            //Replacing each of the 2nd to 5th question marks with the respective field values collected
            statement.setString(2, user.getUserName());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getEmailID());
            statement.setInt(5, user.getPhoneNo());
            
            //CRUD value statament
            statement.executeUpdate();
                        
        } catch (SQLException e){
            System.out.println("Database items not added");
            System.out.println(e.getMessage());
        }       
    }
    
    
    
    //Connection to ensure that the username and pass word values match as from the User_Info database
    public boolean logInDatabase(ClsUserInfo user){   
        Boolean ret = false;

        //Makes the connection to the database calling the method from above 
        try(Connection conn = this.conn()){
            //Query statement to select the record containing the username and password inputted by the user 
            String sql = "SELECT * FROM User_Info where Username ='" + user.getUserName() + "' AND Password ='" + user.getPassword() + "'";         
                       
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
                       
            while(rs.next())
            {
                //Compares the username and the password value with all records using the "sql" query above
                String loginid = rs.getString("Username");
                String pwd = rs.getString("Password");                                               
                //Returns true if there is a match
                ret = true;
            }
            
            if(ret == false)
            {
                System.out.println("Incorrent login details");                
            }
            
        }      
        //If try block does not work as intended
        catch (Exception e)
        {
             String str = e.getMessage().toString();
             System.out.println(e.getMessage());
        }
        return ret;

    }
       
    
    
    
    
    
    public boolean deleteDBRecord(String username) throws SQLException{
      
        Boolean ret = false; 
            
        //Makes the connection
        try(Connection conn = this.conn()){ 
            //SQL query for deletion 
            String deleteQuery =  "DELETE FROM User_Info WHERE Username = ?";           
            
            //Using pre-estbalished JDBC statement for the above delete query
            PreparedStatement preparedStatement = conn.prepareStatement(deleteQuery); 
           
            //Sets the question mark above with the value of the username obtained from the initial log in of the user
            preparedStatement.setString(1, username);    
           
            //Statement for CRUD to the database
            preparedStatement.executeUpdate();
                                                    
            return true;                                
        
        //If try block does not work as intended
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }               
    }   
            
    
    public List<ClsTransaction> loadAllTransactions(){   
        Boolean ret = false;
        ResultSet rs = null;
        List<ClsTransaction> trList = new ArrayList<>();

        //Makes the connection to the database calling the method from above 
        try(
            Connection conn = this.conn()){
            //Connection conn = DatabaseConnection.getConnection();
            //Query statement to select the record containing the username and password inputted by the user 
            String sql = "SELECT * FROM Transaction_List";                                
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) 
            {
                ClsTransaction data = new ClsTransaction();
                data.setTransactionID(rs.getInt("Transaction_ID")); // Replace with the actual column name
                data.setTransactionName(rs.getString("Transaction_Name")); // Replace with the actual column name
                data.setTransactionAmount(rs.getDouble("Transaction_Amount")); // Replace with the actual column name
                data.setUserID(rs.getInt("UserID")); // Replace with the actual column name
                trList.add(data);
            }
        }      
        //If try block does not work as intended
        catch (Exception e)
        {
             String str = e.getMessage().toString();
             System.out.println(e.getMessage());
        }        
        return trList;
    }
    
    
    
    
    public void addTransaction(ClsTransaction newTransaction){
        
        String sqlTransaction = "INSERT INTO Transaction_List (Transaction_Name, Transaction_Amount, Transaction_Category, Transaction_Item) VALUES(?,?,?,?)";

        try(Connection conn = this.conn()){
           
            System.out.println("Connection Made");

            //Prepare a SQL query to insert values into the database
            PreparedStatement statement = conn.prepareStatement(sqlTransaction);
            
            //Replacing each of the 2nd to 5th question marks with the respective field values collected
            statement.setString(2, newTransaction.getTransactionName());
            statement.setDouble(3, newTransaction.getTransactionAmount());
            statement.setString(5, newTransaction.getExpenseCategory());
            statement.setString(6, newTransaction.getItemType());

            //CRUD value statament
            statement.executeUpdate(); 
                        
        } catch (SQLException e){
            System.out.println("Database items not added");
            System.out.println(e.getMessage());
        }       
    }

        
 }
   
