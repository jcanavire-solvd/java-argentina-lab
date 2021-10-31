package main.java.com.solvd.secondTaskTheHospitalClasses.models.Persons;

import main.java.com.solvd.enums.Gender;

public class PatientForConsulting extends Patient {
    private String diagnosis;

    public PatientForConsulting(int patientId, String symptom,String name, 
    String lastName, int age, long ssn, Gender gender, String diagnosis ) {
        super(patientId, symptom,name, lastName,age, ssn, gender);
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
}
