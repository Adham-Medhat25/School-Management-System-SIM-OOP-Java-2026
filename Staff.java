package finaloopproject;
import java.util.ArrayList;


public class Staff extends Person{

    private String Role;
    private String Shift;
    private String Activity;

    // Non-parameterized Constructor
    public Staff() {
    }
    
    
// Parameterized Constructor
    public Staff(String Name, String Age, String Phone, String Address,String Role, String Shift, String Activity) {
        super(Name, Age, Phone, Address);
        this.Role = Role;
        this.Shift = Shift;
        this.Activity = Activity;
    }
    
    public void setRole(String Role){
    this.Role=Role;
    }
    
    public String getRole(){
        return Role;
    }

    public String getShift() {
        return Shift;
    }

    public void setShift(String Shift) {
        this.Shift = Shift;
    }

    public String getActivity() {
        return Activity;
    }

    public void setActivity(String Activity) {
        this.Activity = Activity;
    }
    
    
    public void display(int index){
    System.out.printf("Staff No. %-3d | Name: %-15s | Age: %-4s | Phone: %-13s | Address: %-12s | Role: %-15s | Shift: %-10s | Status: %-10s%n",
    index, getName(), getAge(), getPhone(), getAddress(), getRole(), getShift(), getActivity());
}
    
    
    @Override
    public String ShowRole(){
        return "Staff";
    }
    
}
