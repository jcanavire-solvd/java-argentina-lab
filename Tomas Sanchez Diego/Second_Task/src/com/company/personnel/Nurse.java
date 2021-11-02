package com.company.personnel;

public class Nurse extends Employee {
   private String area;
   private String shifts;



   public Nurse (Integer id, String name, String surName, String area, String shifts) {
       super(id,name,surName);
       this.area = area;
       this.shifts = shifts;
   }
    //Getters
    public String getArea() {
        return area;
    }

    public String getShifts() {
        return shifts;
    }
    //Setters
    public void setArea(String area) {
        this.area = area;
    }

    public void setShifts(String shifts) {
        this.shifts = shifts;
    }
}
