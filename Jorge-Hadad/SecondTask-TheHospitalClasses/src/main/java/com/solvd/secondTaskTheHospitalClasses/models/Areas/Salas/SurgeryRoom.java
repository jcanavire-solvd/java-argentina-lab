package main.java.com.solvd.secondTaskTheHospitalClasses.models.Areas.Salas;

public class SurgeryRoom extends Room {
    
    public SurgeryRoom(String name, String description, String[] exits, String[] items) {
        super(name, description, exits, items);
    }
    
    public void enterRoom() {
        System.out.println("You are in the surgery room.");
    }  
}
