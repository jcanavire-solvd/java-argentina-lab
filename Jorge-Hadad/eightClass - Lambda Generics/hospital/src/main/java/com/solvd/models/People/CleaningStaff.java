package com.solvd.models.People;

public class CleaningStaff extends Employee {

    private String cleaningType;

    public CleaningStaff(String name, String surname, String phoneNumber, String email, String cleaningType) {
        super(name, surname, phoneNumber, email);
        this.cleaningType = cleaningType;
    }

    public String getCleaningType() {
        return cleaningType;
    }

    public void setCleaningType(String cleaningType) {
        this.cleaningType = cleaningType;
    }

    @Override
    public String toString() {
        return "CleaningStaff{" + "cleaningType=" + cleaningType + '}';
    }


    @Override
    public Long get_dni() {
        return null;
    }
}
