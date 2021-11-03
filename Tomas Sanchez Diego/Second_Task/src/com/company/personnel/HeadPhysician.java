package com.company.personnel;

public final class HeadPhysician extends Doctor{
    private String area;


    public HeadPhysician(Integer id, String name, String surName,String specialization, String shifts, String area) {
        super(id,name,surName,specialization,shifts);
        this.area = area;
    }
    //Getter
    public String getArea() {
        return area;
    }
    //Setter
    public void setArea(String area) {
        this.area = area;
    }
}
