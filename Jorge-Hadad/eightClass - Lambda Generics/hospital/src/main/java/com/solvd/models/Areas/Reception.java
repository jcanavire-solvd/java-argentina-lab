package com.solvd.models.Areas;

import java.util.ArrayList;

import com.solvd.models.People.Patient;

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
