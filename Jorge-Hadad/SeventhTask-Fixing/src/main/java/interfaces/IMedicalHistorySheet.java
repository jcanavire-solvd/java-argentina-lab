package interfaces;

import exceptions.NullMedicalHistorySheetException;

public interface IMedicalHistorySheet {

    void showMedicalHistory() throws NullMedicalHistorySheetException;
    void updateMedicalHistory() throws NullMedicalHistorySheetException;

}
