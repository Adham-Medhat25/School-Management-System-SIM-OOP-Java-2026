package finaloopproject;
import java.util.ArrayList;


public class Student extends Person{

    double GPA;
    int Level;
    int Warnings;

    // Non-parameterized Constructor
    public Student(){
    }
    
    // Parameterized Constructor
    public Student( String Name, String Age, String Phone, String Address,double GPA, int Level, int Warnings) {
        
        super(Name, Age, Phone, Address); // The SuperCLass' Constructor
        
        this.GPA = GPA;
        this.Level = Level;
        this.Warnings = Warnings;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public int getWarnings() {
        return Warnings;
    }

    public void setWarnings(int Warnings) {
        this.Warnings = Warnings;
    }
    
    
    
    public void display(int index){
    System.out.printf("Student No. %-1d | Name: %-15s | Age: %-4s | Phone: %-13s | Address: %-15s | GPA: %-8.2f | Level: %-3d | Warnings: %d%n",
    index, getName(), getAge(),getPhone(), getAddress(),getGPA(), getLevel(),getWarnings());
}
    
    
    @Override
    public String ShowRole(){
        return "Students";
    }
    

    
}
