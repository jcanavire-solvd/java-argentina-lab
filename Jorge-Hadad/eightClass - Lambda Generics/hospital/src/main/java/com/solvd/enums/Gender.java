package com.solvd.enums;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    NEUTER("Neuter");


    private String gender;

    Gender(String gender){
        this.setGender(gender);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
