import enums.Gender;
import exceptions.InvalidDoctorSpecialty;
import exceptions.NullMedicalHistorySheetException;
import exceptions.NurseOperateException;
import models.Payment.Salary;
import models.Persons.Doctor;
import models.Persons.Employee;
import models.Persons.Nurse;

import java.util.Arrays;

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

        //create 5 collections of employees
        Employee[] employees = new Employee[5];
        employees[0] = empleado1;
        employees[1] = empleado2;
        employees[2] = doctor1;
        employees[3] = doctor2;
        employees[4] = doctor3;
        System.out.println(Arrays.toString(employees));
        
        //create 5 collections of doctors
        Doctor[] doctors = new Doctor[5];
        doctors[0] = doctor1;
        doctors[1] = doctor2;
        doctors[2] = doctor3;
        doctors[3] = doctor1;
        doctors[4] = doctor2;
        System.out.println("Doctors" + Arrays.toString(doctors));

        //create 5 collections of nurses
        Nurse[] nurses = new Nurse[5];
        nurses[0] = nurse1;
        nurses[1] = nurse1;
        nurses[2] = nurse1;
        nurses[3] = nurse1;
        nurses[4] = nurse1;
        System.out.println("Nurses" + Arrays.toString(nurses));

        //create ArrayList of employees
        java.util.ArrayList<Employee> employeeList = new java.util.ArrayList<>();
        employeeList.add(empleado1);
        employeeList.add(empleado2);
        employeeList.add(doctor1);
        employeeList.add(doctor2);
        employeeList.add(doctor3);
        System.out.println("Empleados" + employeeList);

        //create ArrayList of doctors
        java.util.ArrayList<Doctor> doctorList = new java.util.ArrayList<>();
        doctorList.add(doctor1);
        doctorList.add(doctor2);
        doctorList.add(doctor3);
        doctorList.add(doctor1);
        doctorList.add(doctor2);
        System.out.println(doctorList);

        //create LinkedHashSet of Employees
        java.util.LinkedHashSet<Employee> employeeLinkedHashSet = new java.util.LinkedHashSet<>();
        employeeLinkedHashSet.add(empleado1);
        employeeLinkedHashSet.add(empleado2);
        employeeLinkedHashSet.add(doctor1);
        employeeLinkedHashSet.add(doctor2);
        employeeLinkedHashSet.add(doctor3);
        System.out.println(employeeLinkedHashSet);


    }
}
