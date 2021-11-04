package main.java.com.solvd.secondTaskTheHospitalClasses.interfaces;

import main.java.com.solvd.secondTaskTheHospitalClasses.exceptions.NullMedicalHistorySheetException;

public interface IMedicalHistorySheet {

    void showMedicalHistory() throws NullMedicalHistorySheetException;
    void updateMedicalHistory() throws NullMedicalHistorySheetException;

}
