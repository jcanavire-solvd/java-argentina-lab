package Personas;

public class Employees {
    private String name;
    private String lastName;
    private String dni;
    private String address;
    private String phone;
    private String email;
    private String position;
    private Double salary;
    private String date;
    private String password;
    
    public Employees(String name, String lastName, String dni, String address, 
    String phone, String email, String position, Double salary, String date, String password){
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.position = position;
        this.salary = salary;
        this.date = date;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Empleados{" + "name=" + name + ", lastName=" + lastName + ", dni=" + dni + ", address=" + address + ", phone=" + phone + ", email=" + email + ", position=" + position + ", salary=" + salary + ", date=" + date + ", password=" + password + '}';
    }

    //getFullName
    public String getFullName(){
        return this.name + " " + this.lastName;
    }

    //getInfo
    public String getInfo(){
        return "Nombre: " + this.name + "\nApellido: " + this.lastName + "\nDNI: " + this.dni + "\nDirección: " + this.address + "\nTeléfono: " + this.phone + "\nEmail: " + this.email + "\nCargo: " + this.position + "\nSalario: " + this.salary + "\nFecha de contratación: " + this.date;
    }

}
