package com.company.Patients;

import com.company.Interfaces.IMedicalRecord;

public abstract class Patient implements IMedicalRecord {
    private Integer id;
    private String name;
    private String surName;
    private String diagnosis;

    public Patient (Integer id, String name, String surName, String diagnosis) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.diagnosis = diagnosis;
    }

    {
        System.out.print("The patient " + name + " " + surName + " Has been added to the system");
    }

    @Override
    public void showMedicalRecord() {

    }

    @Override
    public void updateMedicalRecord() {

    }
    //Getters

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
    //Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
