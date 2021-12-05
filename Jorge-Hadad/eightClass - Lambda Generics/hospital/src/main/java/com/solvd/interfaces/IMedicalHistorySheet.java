package com.solvd.interfaces;

import com.solvd.exceptions.NullMedicalHistorySheetException;

public interface IMedicalHistorySheet {

    void showMedicalHistory() throws NullMedicalHistorySheetException;
    void updateMedicalHistory() throws NullMedicalHistorySheetException;

}
