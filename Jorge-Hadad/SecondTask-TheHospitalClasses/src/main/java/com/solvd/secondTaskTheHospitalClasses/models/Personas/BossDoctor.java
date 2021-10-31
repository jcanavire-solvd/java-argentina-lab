package main.java.com.solvd.secondTaskTheHospitalClasses.models.Personas;

public class BossDoctor extends Doctors {

    public BossDoctor(String name, String lastName, String dni, String address, String phone, String email, String position, 
    Double salary, String date, String password, String specialty, int numberOfPatients) {
        super(name, lastName, dni, address, phone, email, position, salary, date, password, specialty, numberOfPatients);

    }

    @Override
//tostring
    public String toString() {
        return "BossDoctor{" + "name=" + this.getName() + ", lastName=" + this.getLastName() + ", dni=" + this.getDni() + ", address=" + 
            this.getAddress() + ", phone=" + this.getPhone() + '}';
    }


    
}
