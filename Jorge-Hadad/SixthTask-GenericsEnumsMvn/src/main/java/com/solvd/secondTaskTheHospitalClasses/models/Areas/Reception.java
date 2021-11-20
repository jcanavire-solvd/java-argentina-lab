package main.java.com.solvd.secondTaskTheHospitalClasses.models.Areas;

import java.util.ArrayList;

import main.java.com.solvd.secondTaskTheHospitalClasses.models.Persons.Patient;

public class Reception
        extends Room {

    private ArrayList<Patient> patients;


    public Reception(ArrayList<Patient> patients){
        this.patients = patients;
    }
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
}
