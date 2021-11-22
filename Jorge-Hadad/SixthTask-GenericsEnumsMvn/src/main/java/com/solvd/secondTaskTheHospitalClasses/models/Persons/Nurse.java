package main.java.com.solvd.secondTaskTheHospitalClasses.models.Persons;

import main.java.com.solvd.secondTaskTheHospitalClasses.enums.Gender;
import main.java.com.solvd.secondTaskTheHospitalClasses.exceptions.InvalidMedicineException;
import main.java.com.solvd.secondTaskTheHospitalClasses.exceptions.NurseOperateException;
import main.java.com.solvd.secondTaskTheHospitalClasses.interfaces.IPreparedForSurgery;

public class Nurse extends Employee implements IPreparedForSurgery {
    private String category;
    private float weeklyHours;


    public Nurse( String name, String lastName, int age, long dni, Gender gender, float weeklyHours, String category ){
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

}
