package Personas;

public class Nurses extends Employees {
        
    public Nurses(String name, String lastName, String dni, String address, String phone, String email, String position, 
    Double salary, String date, String password) {
        super(name, lastName, dni, address, phone, email, position, salary, date, password);
    }
    
    public void givePatientMedicine(Patients patient) {
        System.out.println("The nurse " + this.getName() + " " + this.getLastName() + " gave the medicine to the patient " + patient.getName() + " " + patient.getLastName());
    }
    
}
