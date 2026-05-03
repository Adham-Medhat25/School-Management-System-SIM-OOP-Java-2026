package finaloopproject;
import java.util.ArrayList;


// The Abstract Class "Person" --The Bonus Please :)--

public abstract class Person {
    
    protected String Name;
    protected String Age;
    protected String Phone;
    protected String Address;
    protected String Subject; 
    
    
    
// Non-parameterized Constructor
    public Person() {
    }

    // Parameterized Constructor
    public Person(String Name, String Age, String Phone, String Address) {
        this.Name = Name;
        this.Age = Age;
        this.Phone = Phone;
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    
    // The Abstract Method 
    public abstract String ShowRole();
    


    
}
