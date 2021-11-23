package com.solvd.models.People;

public final class Secretary extends Employee {

    public Secretary(String name, String surname, String position, String department, String specialization, int salary) {
        super(name, surname, position, department);
    }


    @Override
    public Long get_dni() {
        return null;
    }
}
