package main.java.com.solvd.secondTaskTheHospitalClasses.models.Persons;

public class SecurityStaff extends Employee {
    

    public SecurityStaff(String name, String lastName, String dni, String address, String phone, String email, String position, 
    Double salary, String date, String password) {
        super(name, lastName, dni, address, phone, email, position, salary, date, password);
    }
    
    public void checkIn(){
        System.out.println("Checking in");
    }
    
    public void checkOut(){
        System.out.println("Checking out");
    }
    
    public void checkCredentials(){
        System.out.println("Checking credentials");
    }
    
}
