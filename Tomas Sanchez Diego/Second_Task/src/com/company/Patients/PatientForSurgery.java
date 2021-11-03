package com.company.Patients;

import com.company.Interfaces.IClean;
import com.company.Interfaces.IPrepareForSurgery;

import java.util.Date;

public class PatientForSurgery extends Patient implements IPrepareForSurgery, IClean {
    private String surgery;
    private String[] employeesInvolved;
    private Date dateOfSurgery;

    public PatientForSurgery(Integer id, String name, String surName, String diagnosis, String surgery, String[] employeesInvolved, Date dateOfSurgery) {
        super(id,name,surName,diagnosis);
        this.surgery = surgery;
        this.employeesInvolved = employeesInvolved;
        this.dateOfSurgery = dateOfSurgery;

    }

    @Override
    public void PrepareForSurgery() {
        System.out.println("The patient has been prepared for the surgery");
    }

    @Override
    public void clean() {
        System.out.println("The patient has been cleaned");
    }
    //Getters

    public String getSurgery() {
        return surgery;
    }

    public String[] getEmployeesInvolved() {
        return employeesInvolved;
    }

    public Date getDateOfSurgery() {
        return dateOfSurgery;
    }

    //Setters

    public void setSurgery(String surgery) {
        this.surgery = surgery;
    }

    public void setEmployeesInvolved(String[] employeesInvolved) {
        this.employeesInvolved = employeesInvolved;
    }

    public void setDateOfSurgery(Date dateOfSurgery) {
        this.dateOfSurgery = dateOfSurgery;
    }
}
