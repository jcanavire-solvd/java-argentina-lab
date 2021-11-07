package main.java.com.solvd.secondTaskTheHospitalClasses.interfaces;

import main.java.com.solvd.secondTaskTheHospitalClasses.exceptions.InvalidDoctorSpecialty;

public interface IHospitalCare {
    void operatePatient() throws InvalidDoctorSpecialty;
    void assignMedicine();
}
