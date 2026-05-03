package finaloopproject;

import java.util.ArrayList;


public class Teacher extends Person{

    
    private String Subject;
    private double Salary;
    private int WorkHours;
    
    // Non-parameterized Constructor
    public Teacher() {
    }

    // Parameterized Constructor
    public Teacher(String Name, String Age, String Phone, String Address,
        String Subject,double Salary,int WorkHours){
        
        super(Name,Age,Phone,Address); // The SuperCLass' Constructor
        
        this.Subject=Subject;
        this.Salary=Salary;
        this.WorkHours=WorkHours;
    }
    
   
   public void display(int index){
    System.out.printf("Teacher No. %-3d | Name: %-20s | Age: %-4s | Subject: %-12s | Salary: %-10.1f | Phone: %-13s | Address: %s%n",
    index, getName(), getAge(), Subject, Salary, getPhone(), getAddress());
}
   
   
   @Override
    public String ShowRole(){
        return "Teachers";
    }
   

    
}
