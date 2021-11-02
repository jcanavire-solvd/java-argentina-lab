package com.company.personnel;

public class SecurityStaff extends Employee {
    private Integer floorOfShift;
    private String equipment;
    private String shifts;

    public SecurityStaff (Integer id, String name, String surName,String specialization,Integer floorOfShift, String equipment, String shift) {
        super(id,name,surName);
        this.shifts = shift;
        this.equipment = equipment;
        this.floorOfShift = floorOfShift;
    }
    //Getters

    public Integer getFloorOfShift() {
        return floorOfShift;
    }

    public String getEquipment() {
        return equipment;
    }

    public String getShifts() {
        return shifts;
    }
    //Setters

    public void setFloorOfShift(Integer floorOfShift) {
        this.floorOfShift = floorOfShift;
    }

    public void setShifts(String shifts) {
        this.shifts = shifts;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
}
