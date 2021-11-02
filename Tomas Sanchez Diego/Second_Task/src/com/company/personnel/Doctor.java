package com.company.personnel;

import com.company.Interfaces.IAssignPatient;

public class Doctor  extends  Employee implements IAssignPatient {
    private final String specialization;
    private String shifts;


    public Doctor (Integer id, String name, String surName,String specialization, String shift) {
        super(id,name,surName);
        this.specialization = specialization;
        this.shifts = shift;
    }

    @Override
    public void assignPatient() {

    }

    //Getters
    public final String getSpecialization() {
        return specialization;
    }

    public final String getShift() {
        return shifts;
    }
//Setters

    public final void setShift(String shift) {
        this.shifts = shift;
    }
}
