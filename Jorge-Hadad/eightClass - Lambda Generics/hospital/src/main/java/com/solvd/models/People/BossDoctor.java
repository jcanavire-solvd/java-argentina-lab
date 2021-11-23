package com.solvd.models.People;


import com.solvd.enums.Gender;

public final class BossDoctor extends Doctor {
    private String areaOfResponsibility;

    public BossDoctor(String name, String lastName, int age,
                      long dni, Gender gender, String specialty, float weeklyHours, String area) {
        super(name, lastName, age, dni, gender, specialty, weeklyHours);
        this.setAreaOfResponsibility(area);
    }

    public String getAreaOfResponsibility() {
        return areaOfResponsibility;
    }

    public void setAreaOfResponsibility(String areaOfResponsibility) {
        this.areaOfResponsibility = areaOfResponsibility;
    }

    
    
}
