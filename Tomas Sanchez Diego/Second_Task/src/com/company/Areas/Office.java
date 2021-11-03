package com.company.Areas;

public class Office extends Area {
    private Integer officeNumber;
    private String employeeInOffice;


    public Office (String areaName, Integer floor, String supervisor, String[] staff, Integer officeNumber, String employeeInOffice) {
        super(areaName, floor, supervisor, staff);
        this.officeNumber = officeNumber;
        this.employeeInOffice = employeeInOffice;
    }
    //Getters

    public Integer getOfficeNumber() {
        return officeNumber;
    }

    public String getEmployeeInOffice() {
        return employeeInOffice;
    }
    //Setters

    public void setOfficeNumber(Integer officeNumber) {
        this.officeNumber = officeNumber;
    }

    public void setEmployeeInOffice(String employeeInOffice) {
        this.employeeInOffice = employeeInOffice;
    }
}
