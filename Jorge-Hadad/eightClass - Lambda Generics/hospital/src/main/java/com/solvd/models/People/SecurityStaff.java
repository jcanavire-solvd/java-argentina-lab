package com.solvd.models.People;

public final class SecurityStaff extends Employee {


    public SecurityStaff(String name, String lastName, String dni, String address, String phone, String email, String position,
    Double salary, String date, String password) {
        super (name, lastName, dni, address);
    }

    public void checkIn(){
        System.out.println("Checking in");
    }

    public void checkOut(){
        System.out.println("Checking out");
    }

    public void checkCredentials(){
        System.out.println("Checking credentials");
    }

    @Override
    public Long get_dni() {
        return null;
    }
}
