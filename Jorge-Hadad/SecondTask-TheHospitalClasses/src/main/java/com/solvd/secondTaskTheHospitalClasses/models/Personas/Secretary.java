package main.java.com.solvd.secondTaskTheHospitalClasses.models.Personas;

public class Secretary extends Employees {

    public Secretary(String name, String lastName, String dni, String address, 
    String phone, String email, String position, Double salary, String date, String password) {
        //aca tengo la duda si tiene que hacer la llamada al super o directamente
        //al this.setName(name) por ejemplo
        super(name, lastName, dni, address, phone, email, position, salary, date, password);
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "name='" + this.getName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", dni='" + this.getDni() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", phone='" + this.getPhone() + '\'' +
                ", email='" + this.getEmail()+ '\'' +
                ", position='" + this.getPosition() + '\'' +
                ", salary=" + this.getSalary() +
                ", date='" + this.getDate() + '\'' +
                ", password='" + this.getPassword() + '\'' +
                '}';
    }

    
    
}
