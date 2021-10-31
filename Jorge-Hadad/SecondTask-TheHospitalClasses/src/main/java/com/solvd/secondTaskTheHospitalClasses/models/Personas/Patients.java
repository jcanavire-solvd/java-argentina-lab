package main.java.com.solvd.secondTaskTheHospitalClasses.models.Personas;

public class Patients {
    
    private String name;
    private String lastName;
    private String id;
    private String address;
    private String phone;
    private String email;
    private String bloodType;
    private String allergies;
    private String diseases;
    private String medication;
    private String doctor;
    private String nurse;
    private String date;


    public Patients(String name, String lastName, String id, String address, String phone, String email, String bloodType, String allergies, String diseases, String medication, String doctor, String nurse, String date) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.bloodType = bloodType;
        this.allergies = allergies;
        this.diseases = diseases;
        this.medication = medication;
        this.doctor = doctor;
        this.nurse = nurse;
        this.date = date;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBloodType() {
        return this.bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getAllergies() {
        return this.allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getDiseases() {
        return this.diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public String getMedication() {
        return this.medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getDoctor() {
        return this.doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getNurse() {
        return this.nurse;
    }

    public void setNurse(String nurse) {
        this.nurse = nurse;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patients other = (Patients) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    //toString
    @Override
    public String toString() {
        return "Patients{" + "name=" + name + ", lastName=" + lastName + ", id=" + id + ", address=" + address + ", phone=" + phone + ", email=" + email + ", bloodType=" + bloodType + ", allergies=" + allergies + ", diseases=" + diseases + ", medication=" + medication + ", doctor=" + doctor + ", nurse=" + nurse + ", date=" + date + '}';
    }
    
}
