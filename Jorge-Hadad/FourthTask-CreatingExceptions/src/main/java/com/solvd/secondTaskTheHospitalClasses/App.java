package main.java.com.solvd.secondTaskTheHospitalClasses;

import main.java.com.solvd.secondTaskTheHospitalClasses.enums.Gender;
import main.java.com.solvd.secondTaskTheHospitalClasses.exceptions.InvalidDoctorSpecialty;
import main.java.com.solvd.secondTaskTheHospitalClasses.exceptions.NullMedicalHistorySheetException;
import main.java.com.solvd.secondTaskTheHospitalClasses.exceptions.NurseOperateException;
import main.java.com.solvd.secondTaskTheHospitalClasses.models.Payment.Salary;
import main.java.com.solvd.secondTaskTheHospitalClasses.models.Persons.Doctor;
import main.java.com.solvd.secondTaskTheHospitalClasses.models.Persons.Employee;
import main.java.com.solvd.secondTaskTheHospitalClasses.models.Persons.Nurse;

//import org.apache.log4j.PropertyConfigurator;
//import org.apache.log4j.*;

public class App {
    private static final Gender gender1 = Gender.MALE;
    private static final Gender gender2 = Gender.FEMALE;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Salary empleado = new Salary(1, "Jorge", 5000, 18, "", "", "", "", "", "");

        System.out.println(empleado.getName());
        System.out.println(empleado.getAge());

        Doctor doctor1 = new Doctor("Yorch", "Hadad", 21, 12456123, gender1, "Surgeon", 40);
        
        System.out.println(doctor1.getName());
        
        Employee empleado1 = new Nurse("juanita", "Perez", 18, 19874561, gender2, 18, "Full");
        Employee empleado2 = new Doctor("Yorch", "Hadad", 21, 12456123, gender1, "Surgeon", 40);

        System.out.println(empleado1.getName());
        System.out.println(empleado2.getName());

        Doctor doctor2 = new Doctor("Robert", "Deniro", 21, 12456123, gender1, "Surgeon", 40);
        try {
            doctor2.operatePatient();
        }catch(InvalidDoctorSpecialty exception){
            exception.getMessage();
        }
        Doctor doctor3 = new Doctor("Bob", "Stuart", 21, 12456123, gender1, "Surgeon", 40);
        try{
            doctor3.showMedicalHistory();
        }catch (NullMedicalHistorySheetException exception){
            exception.getMessage();
        }

        Nurse nurse1 = new Nurse("Enfermerita", "Rolanda", 18, 19874561, gender2, 18, "Full");
        try {
            nurse1.operatePatient();
            System.out.println("Operate patient NURSE");
        } catch (NurseOperateException exception) {
            exception.getMessage();
            System.out.println(exception.getMessage());
        }

    }
}
