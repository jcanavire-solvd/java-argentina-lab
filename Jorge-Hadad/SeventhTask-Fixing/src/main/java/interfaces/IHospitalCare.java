package interfaces;

import exceptions.InvalidDoctorSpecialty;


public interface IHospitalCare {
    void operatePatient() throws InvalidDoctorSpecialty;
    void assignMedicine();
}
