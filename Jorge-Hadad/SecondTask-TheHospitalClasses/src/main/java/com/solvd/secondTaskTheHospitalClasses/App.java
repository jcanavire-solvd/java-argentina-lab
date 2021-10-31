package main.java.com.solvd.secondTaskTheHospitalClasses;

import main.java.com.solvd.secondTaskTheHospitalClasses.models.Payment.Salary;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Salary empleado = new Salary(1, "Jorge", 5000, 18, "", "", "", "", "", "");

        System.out.println(empleado.getName());
        System.out.println(empleado.getAge());
        
    }
}
