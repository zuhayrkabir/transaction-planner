/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package budgetApp;

/**
 *
 * @author mohammadzuhayrkabir
 */

//Transactions made for healthcare services
public class ClsHealthcare extends ClsItems {

    //Instance variables
    private String doctorType; 
    private String doctorName; 
    private String hospitalName;
    private String consultancyType;
    
    //Constructor of Healthcare class
    public ClsHealthcare(int itemID, String itemName, int expenseCategoryID, String doctorType, String hospitalName, String consultancyType){
        //Constructor of parents ClsItems class
        super(itemID, itemName, expenseCategoryID);
                
        //Distinct field values 
        this.doctorName = doctorName;
        this.doctorType = doctorType;
        this.hospitalName = hospitalName;
        this.consultancyType = consultancyType;
    }
    
     
    
    //Getter methods
    public String getDoctorType() {
        return this.doctorType;
    }
    
    public String getDoctorName(){
        return this.doctorName;
    }
    
    public String getHospitalName(){
        return this.hospitalName;
    }
    
    public String getConsultancyType(){
        return this.getConsultancyType();
    }
    
    
    //Setter Methods
    public void setDoctorType(String doctorType){
        this.doctorType = doctorType;
    }
    
    public void setDoctorName(String doctorName){
        this.doctorName = doctorName;
    }
    
    public void setHospitalName(String hospitalName){
        this.hospitalName = hospitalName;
    }
    
    public void setConsultancyType(String consultancyType){
        this.consultancyType = consultancyType;
    }
                        
    
    //other functions 
    public double HealthDicsount(String consultancyType, String approved){
        /* function code
        ...
        */
        String insuranceApproval = approved;
        if(insuranceApproval.toLowerCase().equals("true")){
            return  0.00; //modify to have it be discounted fee
        }  
        return 0.00; //modify to have it be typical consultation fee
    }
     
    
}
