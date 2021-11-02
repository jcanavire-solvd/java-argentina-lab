package com.company.Areas;

public class WaitingRoom extends Area{
    private Integer patiensWaiting;



    public  WaitingRoom (String areaName, Integer floor, String supervisor, String[] staff, Integer patiensWaiting) {
        super(areaName, floor, supervisor, staff);
        this.patiensWaiting = patiensWaiting;
    }
    //Getter

    public Integer getPatiensWaiting() {
        return patiensWaiting;
    }
    //Setter


    public void setPatiensWaiting(Integer patiensWaiting) {
        this.patiensWaiting = patiensWaiting;
    }
}
