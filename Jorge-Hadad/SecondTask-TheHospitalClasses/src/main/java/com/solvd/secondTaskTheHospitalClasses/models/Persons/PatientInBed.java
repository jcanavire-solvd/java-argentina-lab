package main.java.com.solvd.secondTaskTheHospitalClasses.models.Persons;

import java.sql.Date;

import main.java.com.solvd.secondTaskTheHospitalClasses.enums.Gender;
import main.java.com.solvd.secondTaskTheHospitalClasses.interfaces.ICleaning;

public class PatientInBed extends Patient implements ICleaning {
    private int bedNumber;
    private Date dateOfAdmission;
    private Date dateOfDischarge;
    
    public PatientInBed(int patientId, String symptom,String name, 
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
    
}
