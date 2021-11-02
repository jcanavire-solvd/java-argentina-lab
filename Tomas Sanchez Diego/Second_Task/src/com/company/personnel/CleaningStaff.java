package com.company.personnel;

import com.company.Interfaces.IAssignRoomToClean;

public class CleaningStaff extends Employee implements IAssignRoomToClean {
    private String shifts;
    private String cleaningDuty;


    public CleaningStaff(Integer id, String name, String surName,String cleaningDuty, String shift) {
        super(id,name,surName);
        this.shifts = shift;
        this.cleaningDuty = cleaningDuty;
    }

    @Override
    public void assignKindOfCleaning() {

    }

    @Override
    public void assignRoom() {

    }

    //Getters
    public String getCleaningDuty() {
        return cleaningDuty;
    }

    public String getShifts() {
        return shifts;
    }
    //Setters
    public void setShifts(String shifts) {
        this.shifts = shifts;
    }

    public void setCleaningDuty(String cleaningDuty) {
        this.cleaningDuty = cleaningDuty;
    }
}
