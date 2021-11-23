package com.solvd.models.People;



import java.sql.Date;

import com.solvd.enums.Gender;
import com.solvd.interfaces.ICleaning;

public class PatientInBed extends Patient implements ICleaning {
    private int bedNumber;
    private Date dateOfAdmission;
    private Date dateOfDischarge;
    
    public PatientInBed(int patientId, String symptom, String name,
                        String lastName, int age, long ssn, Gender gender, String surgery,
                        Date dateOfAdmission, Date dateOfDischarge  ) {
        super(patientId, symptom,name, lastName,age, ssn, gender);
        this.dateOfAdmission = dateOfAdmission;
        this.dateOfDischarge = dateOfDischarge;
    }


    public int getBedNumber() {
        return bedNumber;
    }

    public Date getDateOfDischarge() {
        return dateOfDischarge;
    }

    public void setDateOfDischarge(Date dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    @Override
    public void clean() {
        System.out.println("Patient in bed is cleaning");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void wash() {
        System.out.println("Patient in bed is washing");
        // TODO Auto-generated method stub

        
    }

    @Override
    public void dry() {
        System.out.println("Patient in bed is drying");
        // TODO Auto-generated method stub
        
    }


    @Override
    public void getPreparedForASurgery() {
        System.out.println("Patient in bed is getting prepared for a NEW surgery");
        // TODO Auto-generated method stub
        
    }
    
}
