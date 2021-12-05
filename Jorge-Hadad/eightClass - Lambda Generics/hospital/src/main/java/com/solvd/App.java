package com.solvd;

import java.util.*;
import java.util.function.*;

import com.solvd.enums.Gender;
import com.solvd.exceptions.InvalidDoctorSpecialty;
import com.solvd.exceptions.NullMedicalHistorySheetException;
import com.solvd.exceptions.NurseOperateException;
import com.solvd.models.Payment.Salary;
import com.solvd.models.People.Doctor;
import com.solvd.models.People.Employee;
import com.solvd.models.People.Nurse;



public class App {
    private static final Gender gender1 = Gender.MALE;
    private static final Gender gender2 = Gender.FEMALE;

    @FunctionalInterface
    interface Rand <T extends Number>{
        public T getNumber(T t);
    }
    interface DoctorCreator<A extends String, B extends String, C extends Integer, D extends Long, E extends Gender
        >{
        public Doctor create(A a, B b, C c, D d, E e);
    }
    interface addSecondLastName<T extends String, U extends String>{
        public String addLastName(T t, U u);
    }


    public static void main(String[] args) throws Exception {
//Clase 8
        Rand random = x -> new Random().nextInt((int) x);
        //String name, String lastName, int age, long dni, Gender gender, String specialty, float weeklyHours
        DoctorCreator creator2 = (name, lastName, age, dni, gender) -> new Doctor(name, lastName, age, dni, gender);
        addSecondLastName change = (a, b) -> a + " " + b;

        System.out.println("creator = " + creator2);
        //no se q es lo que crea pero no es de la clase doctor.

        List <Doctor> doctorList = new LinkedList<>();
        doctorList.add(new Doctor("John","Peterson",24,14343L ,Gender.MALE));
        doctorList.add(new Doctor("Tom","Cruise",24,9876L ,Gender.MALE));
        doctorList.add(new Doctor("Peter","Johnson",34,5436L,Gender.MALE));
        doctorList.add(new Doctor("Walter","White",42,87654L ,Gender.MALE));
        doctorList.add(creator2.create("Brand New", "Doctor",88, 8765L ,Gender.MALE));
        doctorList.get(2).setLastName(change.addLastName(doctorList.get(2).getLastName(),"Jr."));

        doctorList.stream().forEach(Doctor::toString);

        /////////////////////////
        //predicate
        System.out.println("Count of doctors with dni >=3: " + doctorList.stream().filter(j -> j.getAge() >= 10).count());

        //function
        Function<Doctor, String> doctorData = Doctor::toString;
        System.out.println(doctorData.apply(doctorList.get(1)));

        //consumer
        Consumer<Doctor> work = w -> { w.getAge();
        };
        work.accept(doctorList.get(2));

        //supplier
        Supplier<Doctor> l = () -> new Doctor("The","Supplier",35,34534,Gender.MALE);
        doctorList.add(l.get());
        System.out.println(doctorList.get(doctorList.size() -1));


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
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(empleado1);
        employeeList.add(empleado2);
        employeeList.add(doctor1);
        employeeList.add(doctor2);
        employeeList.add(doctor3);
        System.out.println("Empleados" + employeeList);

        //create ArrayList of doctors
        ArrayList<Doctor> doctorList2 = new ArrayList<>();
        doctorList2.add(doctor1);
        doctorList2.add(doctor2);
        doctorList2.add(doctor3);
        doctorList2.add(doctor1);
        doctorList2.add(doctor2);
        System.out.println(doctorList2);

        //create LinkedHashSet of Employees
        LinkedHashSet<Employee> employeeLinkedHashSet = new LinkedHashSet<>();
        employeeLinkedHashSet.add(empleado1);
        employeeLinkedHashSet.add(empleado2);
        employeeLinkedHashSet.add(doctor1);
        employeeLinkedHashSet.add(doctor2);
        employeeLinkedHashSet.add(doctor3);
        System.out.println(employeeLinkedHashSet);


    }
}
