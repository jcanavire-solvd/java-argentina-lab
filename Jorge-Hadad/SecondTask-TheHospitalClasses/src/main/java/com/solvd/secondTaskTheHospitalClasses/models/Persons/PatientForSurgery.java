package main.java.com.solvd.secondTaskTheHospitalClasses.models.Persons;

import main.java.com.solvd.secondTaskTheHospitalClasses.enums.Gender;



public class PatientForSurgery extends Patient {
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
    public void getPreparedForASurgery() {
        System.out.println("Patient for Surgery is been prepared for surgery");
    }
    
}
