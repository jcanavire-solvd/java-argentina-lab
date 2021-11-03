package com.company.Areas;

public final class Hospital {

static String hospitalName;
static String address;

    public  Hospital (String hospitalName, String address) {

        this.hospitalName = hospitalName;
        this.address = address;

    }
    public static void ShowName () {
        System.out.print("The hospital " + hospitalName + " is located in " + address );
    }
    //Getters
    public String getHospitalName() {
        return hospitalName;
    }

    public String getAddress() {
        return address;
    }
    //Setters
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
