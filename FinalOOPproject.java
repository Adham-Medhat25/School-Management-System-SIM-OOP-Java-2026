package finaloopproject;
import java.util.ArrayList;
import java.util.Scanner;


public class FinalOOPproject {
    
    


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin AdminObj = new Admin();
        Student Std = new Student();

        System.out.println("Hello To our OOP Project\n *[School Managment System]*");
        
        System.out.println("Enter UserName Please");
        String UserAdmin = input.next();
        
        System.out.println("Enter Password Please");
        String PassAdmin = input.next();
        
        if(UserAdmin.equals(AdminObj.UserAdmin) && PassAdmin.equals(AdminObj.PassAdmin)){
            System.out.println("Welcome Admin :)");
        }
        else{
            System.out.println("This is Invalid Username or Password");
            System.exit(0);
        }
        
        
        /*
        Now we are going to make a while loop for the program 
        to allow the user to return back the the admin page again
        if he wanted
        */
        
        boolean isValid = false;

        while(!isValid){ // it will be true so the while loop will be activated
        
        System.out.println("Choose Which Page to Manage");
            System.out.println("1.Students\n2.Teachers\n3.Managers\n4.Staff");
        
            int Select = input.nextInt();
        
        switch(Select){
            case 1:
                StudentsData(); // We Created Thr data in methods to make it simple on us
                break;
                
            case 2:
                TeachersData();
                break;
                
            case 3:
                ManagersData();
                break;
                
            case 4:
                StaffData();
                break;
                
            default:
                System.out.println("Invalid Choice!");
                continue; // to return back to choose right choice
        }
        
        
            System.out.println("Press 7 to Return to Admin Page again\nPress 8 to Exit");
        int ReturnVar = input.nextInt();
        
        if (ReturnVar == 8){
                System.out.println("Thank you for using our School Managment System Program");
            System.exit(0); //--->> this method make the program exit at the moment
        }
            else if(ReturnVar ==7) {
            DrawLine(20);
            System.out.println("Returning to Admin Menu......");
            DrawLine(20);
        }

        }
        
        
  
    }
    
    // The DrawLine Method to make a long line that separates the pages
   public static void DrawLine(int x){
       for(int i=0;i<x;i++){
            System.out.print("-");
       }
       System.out.println("");
   }
           
    //-->Students Page Method<--//
   
   public static void StudentsData(){
   Student Std = new Student();
         //Intialization of Students ArrayList :)
         ArrayList<Student> StudentsInfo = new ArrayList<>();
   
   
   // Syntax for Students Constructor Name ,Age,Phone,Address,GPA,Level,Warnings
       StudentsInfo.add(new Student("Ahmed Elshaer","20","01100799540","Shatby",3.4,1,12));
       StudentsInfo.add(new Student("Omar Sherbini","32","01100799540","Maady",10.5,4,17));
       StudentsInfo.add(new Student("Ahmed Salah","31","01100799540","Smouha",4.0,4,1));
       StudentsInfo.add(new Student("Said Sadd","61","01100799540","Kafr Abdo",3.8,1,4));
       StudentsInfo.add(new Student("Mohamed Salah","33","01100799540","El-Mohandseen",4.0,4,0));
       StudentsInfo.add(new Student("Ibrahim Farouk","56","01100799540","Camp Chezar",3.6,4,3));
       
       DrawLine(138);
       // Here we used the Abstract method ShowRole();
        System.out.println("-------------["+Std.ShowRole()+"]-------------"); 
        for(int i=0;i<StudentsInfo.size();i++){
        StudentsInfo.get(i).display(i+1);
        }
        DrawLine(138);
       
       
   }
   
   
    public static void TeachersData(){
        Teacher TeachObj = new Teacher();
               
        //Intialization of Teachers ArrayList :)
         ArrayList<Teacher> TeachersInfo = new ArrayList<>();
       
       // Syntax for Constructor Name ,Age,Phone,Address,Subject,Salary,WorkHours
       TeachersInfo.add(new Teacher("Ahmed Elshaer","20","01100799540","Shatby","Math",200.5,12));
       TeachersInfo.add(new Teacher("Omar Sherbini","32","01100799540","Maady","Math",45000,100));
       TeachersInfo.add(new Teacher("Ahmed Salah","31","01100799540","Smouha","Physics",23000,150));
       TeachersInfo.add(new Teacher("Said Sadd","61","01100799540","Kafr Abdo","Chemistry",500000,478));
       TeachersInfo.add(new Teacher("Mohamed Salah","33","01100799540","El-Mohandseen","Arabic",7400000,2748));
       TeachersInfo.add(new Teacher("Ibrahim Farouk","56","01100799540","Camp Chezar","English",12000,178));
        
       
        DrawLine(138);
        System.out.println("-------------["+TeachObj.ShowRole()+"]-------------");
        for(int i=0;i<TeachersInfo.size();i++){
        TeachersInfo.get(i).display(i+1);
        }
        DrawLine(138);
           
           }
    
    
    public static void ManagersData(){
        Managers ManObj = new Managers();
    
        //Intialization of Managers ArrayList :)
         ArrayList<Managers> ManagersInfo = new ArrayList<>();
         
         // Syntax for Students Constructor Name ,Age,Phone,Address,Position,Department
       ManagersInfo.add(new Managers("Raed Fouad","58","01100799540","Ganaklis","Head","Senior"));
       ManagersInfo.add(new Managers("Adham Mohsen","42","01100799540","Seyof","Vice Head","Senior"));
       ManagersInfo.add(new Managers("Ashraf Rashidy","53","01100799540","Shatby","Head","Middle"));
       ManagersInfo.add(new Managers("Gihane Gaber","47","01100799540","Louran","Head","Upper Junior"));
       ManagersInfo.add(new Managers("Walaa Ali","20","01100799540","Champilion","Head","Lower Senior"));
       
       
       DrawLine(138);
        System.out.println("-------------["+ManObj.ShowRole()+"]-------------");
        for(int i=0;i<ManagersInfo.size();i++){
        ManagersInfo.get(i).display(i+1);
        }
        DrawLine(138);
    }
           
    
    public static void StaffData(){
        Staff StfObj = new Staff();
    
        //Intialization of Staff ArrayList :)
         ArrayList<Staff> StaffInfo = new ArrayList<>();
         
         StaffInfo.add(new Staff("Ramzy Shaaban","57","012456464353","Agami","Door Keeper","Morning","Illnes Vacancy"));
         StaffInfo.add(new Staff("Fatma Hassan","32", "01212458765", "Louran", "Nurse","Morning", "On Leave"));
         StaffInfo.add(new Staff("Ahmed Nasser","45", "015477856214", "Seyof", "Cleaner","Evening", "Active"));
         StaffInfo.add(new Staff("Mona Samir","30", "010245674561", "Ganaklis", "HR Staff", "Morning", "Active"));
         StaffInfo.add(new Staff("Omar Fathy","50", "01580659970", "Camp Chezar","Bus Driver",  "Morning", "Active"));

         
         
         DrawLine(138);
        System.out.println("-------------["+StfObj.ShowRole()+"]-------------");
        for(int i=0;i<StaffInfo.size();i++){
        StaffInfo.get(i).display(i+1);
        }
        DrawLine(138);
    }
}
