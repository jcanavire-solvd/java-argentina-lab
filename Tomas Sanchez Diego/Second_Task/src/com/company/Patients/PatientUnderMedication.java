package com.company.Patients;

import java.util.Date;

public class PatientUnderMedication extends Patient {
    private Date nextAppintment;
    private Date previousAppointment;
    private String[] medications;

    public PatientUnderMedication(Integer id, String name, String surName, String diagnosis, Date nextAppintment, Date previousAppointment, String[] medications) {
        super(id,name,surName,diagnosis);
        this.nextAppintment = nextAppintment;
        this.previousAppointment = previousAppointment;
        this.medications = medications;
    }
    //Getters

    public Date getNextAppintment() {
        return nextAppintment;
    }

    public Date getPreviousAppointment() {
        return previousAppointment;
    }
    public String[] getMedications() {
        return medications;
    }
    //Setters

    public void setNextAppintment(Date nextAppintment) {
        this.nextAppintment = nextAppintment;
    }

    public void setPreviousAppointment(Date previousAppointment) {
        this.previousAppointment = previousAppointment;
    }

    public void setMedications(String[] medications) {
        this.medications = medications;
    }
}
