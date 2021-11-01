package main.java.com.solvd.secondTaskTheHospitalClasses.models.Persons;

import main.java.com.solvd.secondTaskTheHospitalClasses.enums.Gender;
import main.java.com.solvd.secondTaskTheHospitalClasses.interfaces.IPreparedForSurgery;



public class PatientForSurgery extends Patient implements IPreparedForSurgery {
    private String surgery;

    public PatientForSurgery(int patientId, String symptom,String name, 
    String lastName, int age, long ssn, Gender gender, String surgery ) {
        super(patientId, symptom,name, lastName,age, ssn, gender);
        this.surgery = surgery;
    }

    public String getSurgery() {
        return surgery;
    }

    @Override
    public void prepareForSurgery() {
        System.out.println("Patient in bed is been prepared for surgery");
        // TODO Auto-generated method stub
        
    }
    
}
