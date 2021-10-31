package main.java.com.solvd.secondTaskTheHospitalClasses.models.Personas;

public class Doctors extends Employees {
    private String specialty;
    private int numberOfPatients;

    public Doctors(String name, String lastName, String dni, String address, String phone, String email, String position, 
        Double salary, String date, String password, String specialty, int numberOfPatients) {
        super(name, lastName, dni, address, phone, email, position, salary, date, password);
        this.specialty = specialty;
        this.numberOfPatients = numberOfPatients;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "specialty='" + specialty + '\'' +
                ", numberOfPatients=" + numberOfPatients +
                '}';
    }

    @Override
    public Double getSalary() {
        return super.getSalary() + (numberOfPatients * 100);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + specialty + " " + numberOfPatients;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }
    
}
