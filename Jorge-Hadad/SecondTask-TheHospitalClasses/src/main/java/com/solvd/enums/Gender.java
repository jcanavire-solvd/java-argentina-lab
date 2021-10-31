package main.java.com.solvd.enums;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    NEUTER("Neuter");


    private String gender;

    Gender(String gender){
        this.gender = gender;
    }
}
