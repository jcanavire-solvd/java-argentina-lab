package main.java.com.solvd.secondTaskTheHospitalClasses.models.Persons;

import main.java.com.solvd.enums.Gender;
import main.java.com.solvd.secondTaskTheHospitalClasses.interfaces.IHospitalCare;
import main.java.com.solvd.secondTaskTheHospitalClasses.interfaces.IMedicalHistorySheet;

public class Doctor extends Employee 
                    implements IHospitalCare,
                        IMedicalHistorySheet {
    private String specialty;
    private float weeklyHours;
    private Gender gender;

    public Doctor( String name, String lastName, int age, long dni, Gender gender, String specialty, float weeklyHours ){
        super(name, lastName, age, dni, gender);
        this.specialty = specialty;
        this.weeklyHours = weeklyHours;
    }


    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty( String specialty ) {
        this.specialty = specialty;
    }

    public float getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours( float weeklyHours ) {
        this.weeklyHours = weeklyHours;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    @Override
    public void operatePatient() {
        this.getSpecialty().equals("Surgeon");
        System.out.println("Patient has been operated");

    }


    @Override
    public void showMedicalHistory()  {
    }

    @Override
    public void updateMedicalHistory() {
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialty='" + specialty + '\'' +
                ", weeklyHours=" + weeklyHours +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dni=" + ssn +
                ", gender='" + gender + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + ((specialty == null) ? 0 : specialty.hashCode());
        result = prime * result + Float.floatToIntBits(weeklyHours);
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Doctor other = (Doctor) obj;
        if (gender != other.gender)
            return false;
        if (specialty == null) {
            if (other.specialty != null)
                return false;
        } else if (!specialty.equals(other.specialty))
            return false;
        if (Float.floatToIntBits(weeklyHours) != Float.floatToIntBits(other.weeklyHours))
            return false;
        return true;
    }


    @Override
    public void assignMedicine() {
        // TODO Auto-generated method stub
        
    }
}