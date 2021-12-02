package com.solvd.interfaces;

import com.solvd.exceptions.InvalidDoctorSpecialty;


public interface IHospitalCare {
    void operatePatient() throws InvalidDoctorSpecialty;
    void assignMedicine();
}
