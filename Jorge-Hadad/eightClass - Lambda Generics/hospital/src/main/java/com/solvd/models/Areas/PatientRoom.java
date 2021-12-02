package com.solvd.models.Areas;

import com.solvd.models.UtilityTools.Bed;

public class PatientRoom extends Room {

    private Bed bed;

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }
}
