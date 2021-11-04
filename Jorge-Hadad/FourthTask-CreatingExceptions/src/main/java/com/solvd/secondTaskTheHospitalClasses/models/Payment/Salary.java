package main.java.com.solvd.secondTaskTheHospitalClasses.models.Payment;

public class Salary {
    private int id;
    private String name;
    private double salary;
    private int age;
    private String address;
    private String phone;
    private String email;
    private String department;
    private String position;
    private String hireDate;
    
    public Salary(int id, String name, double salary, int age, String address, String phone, String email, String department, String position, String hireDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.department = department;
        this.position = position;
        this.hireDate = hireDate;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }


    
}
