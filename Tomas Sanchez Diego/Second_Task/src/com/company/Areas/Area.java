package com.company.Areas;

public abstract class Area {
    private String areaName;
    private Integer floor;
    private String supervisor;
    private String[] staff;

    public  Area (String areaName, Integer floor, String supervisor, String[] staff) {
        this.areaName = areaName;
        this.floor = floor;
        this.supervisor = supervisor;
        this.staff = staff;
    }
    //Getters

    public String getAreaName() {
        return areaName;
    }

    public Integer getFloor() {
        return floor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public String[] getStaff() {
        return staff;
    }
    //Setters

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public void setStaff(String[] staff) {
        this.staff = staff;
    }
}
