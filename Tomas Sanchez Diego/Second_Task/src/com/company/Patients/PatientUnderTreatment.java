package com.company.Patients;

import java.util.Date;

public class PatientUnderTreatment extends Patient {
    private Date nextAppintment;
    private Date previousAppointment;
    private String treatment;

    public PatientUnderTreatment(Integer id, String name, String surName, String diagnosis, Date nextAppintment, Date previousAppointment, String treatment) {
        super(id, name, surName, diagnosis);
        this.nextAppintment = nextAppintment;
        this.previousAppointment = previousAppointment;
        this.treatment = treatment;
    }
    //Getters
    public Date getNextAppintment() {
        return nextAppintment;
    }

    public Date getPreviousAppointment() {
        return previousAppointment;
    }

    public String getTreatment() {
        return treatment;
    }
    //Setters

    public void setNextAppintment(Date nextAppintment) {
        this.nextAppintment = nextAppintment;
    }

    public void setPreviousAppointment(Date previousAppointment) {
        this.previousAppointment = previousAppointment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
