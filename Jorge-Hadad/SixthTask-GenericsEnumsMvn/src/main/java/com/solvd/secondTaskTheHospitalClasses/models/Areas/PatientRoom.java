package main.java.com.solvd.secondTaskTheHospitalClasses.models.Areas;

import main.java.com.solvd.secondTaskTheHospitalClasses.models.UtilityTools.Bed;

public class PatientRoom extends Room {

    private Bed bed;

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }
}
