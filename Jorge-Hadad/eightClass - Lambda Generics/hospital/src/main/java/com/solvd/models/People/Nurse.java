package com.solvd.models.People;


import com.solvd.enums.Gender;
import com.solvd.exceptions.InvalidMedicineException;
import com.solvd.exceptions.NurseOperateException;
import com.solvd.interfaces.IPreparedForSurgery;

public class Nurse extends Employee implements IPreparedForSurgery {
    private String category;
    private float weeklyHours;


    public Nurse(String name, String lastName, int age, long dni, Gender gender, float weeklyHours, String category ){
        super(name, lastName, age, dni, gender);
        this.weeklyHours = weeklyHours;
        this.category = category;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory( String category ) {
        this.category = category;
    }

    public float getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours( float weeklyHours ) {
        this.weeklyHours = weeklyHours;
    }


    @Override
    public void prepareForSurgery() {
        // TODO Auto-generated method stub

    }

    public void operatePatient() throws NurseOperateException {
        throw new NurseOperateException("Nurse only CAN'T support operation");
    }

    public void assignMedicine() throws InvalidMedicineException {
        throw new InvalidMedicineException("Nurses can't assign Medicine");
    }

    @Override
    public Long get_dni() {
        return null;
    }
}
