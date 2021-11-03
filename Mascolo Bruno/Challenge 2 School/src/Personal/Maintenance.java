package Personal;

import Interface.Clean;

public class Maintenance extends Person implements Clean {
    private int idEmployee;
    private String specialty;

    public Maintenance() {    }

    public Maintenance(int dni, String name, int age, int idEmployee, String specialty) {
        super(dni, name, age);
        this.idEmployee = idEmployee;
        this.specialty = specialty;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void talk() {

    }

    @Override
    public void swipe() {

    }

    @Override
    public void mop() {

    }
}
