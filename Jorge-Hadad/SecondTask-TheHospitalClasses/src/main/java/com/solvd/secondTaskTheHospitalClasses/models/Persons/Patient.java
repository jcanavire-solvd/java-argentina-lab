package main.java.com.solvd.secondTaskTheHospitalClasses.models.Persons;

import main.java.com.solvd.secondTaskTheHospitalClasses.enums.Gender;
import main.java.com.solvd.secondTaskTheHospitalClasses.interfaces.IGetPreparedForASurgery;

public abstract class Patient implements IGetPreparedForASurgery {
    protected String name;
    protected String lastName;
    protected int age;
    protected long ssn;
    protected Gender gender;
    private int patientId;
    private String symptom;


    public Patient(int patientId, String symptom,String name, String lastName,
     int age, long ssn, Gender gender){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.gender = gender;
        this.patientId = patientId;
        this.symptom = symptom;
    }

    public int getPatientId() { return patientId; }

    public void setPatientId( int patientId ) { this.patientId = patientId; }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom( String symptom ) {
        this.symptom = symptom;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", symptom='" + symptom + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                ", gender=" + gender +
                '}';
    }
}
