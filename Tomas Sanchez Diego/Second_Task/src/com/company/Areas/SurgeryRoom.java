package com.company.Areas;

import com.company.Interfaces.IClean;
import com.company.Interfaces.IPrepareForSurgery;

public class SurgeryRoom extends Area implements IPrepareForSurgery, IClean {
    private Integer roomNumber;
    private String[] equipment;
    private Boolean conductingSurgery;


    public SurgeryRoom (String areaName, Integer floor, String supervisor, String[] staff, Integer roomNumber, String[] equipment,Boolean conductingSurgery ) {
        super(areaName, floor, supervisor, staff);
        this.roomNumber = roomNumber;
        this.equipment = equipment;
        this.conductingSurgery = conductingSurgery;
    }

    @Override
    public void PrepareForSurgery() {
        System.out.println("The room has been prepared for surgery");
    }

    @Override
    public void clean() {
        System.out.println("The room has been cleaned");
    }
    //Getters

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public String[] getEquipment() {
        return equipment;
    }

    public Boolean getConductingSurgery() {
        return conductingSurgery;
    }
    //Setters

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setEquipment(String[] equipment) {
        this.equipment = equipment;
    }

    public void setConductingSurgery(Boolean conductingSurgery) {
        this.conductingSurgery = conductingSurgery;
    }
}
