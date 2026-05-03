package finaloopproject;
import java.util.ArrayList;

public class Managers extends Person{
    
    private String Position;
    private String Department;

    // Non-parameterized Constructor
    public Managers() {
    }

    // Parameterized Constructor
    public Managers(String Name, String Age, String Phone, String Address,String Position, String Department) {
        super(Name, Age, Phone, Address);
        this.Position = Position;
        this.Department = Department;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
    

   public void display(int index){
    System.out.printf("Manager No. %-3d | Name: %-15s | Age: %-4s | Phone: %-13s | Address: %-14s | Position: %-12s | Department: %-15s%n",
    index, getName(), getAge(), getPhone(), getAddress(), getPosition(), getDepartment());
}
    
   
   @Override
    public String ShowRole(){
        return "Managers";
    }
}
