package Personas;

public class CleaningStaff extends Employees {

    private String cleaningType;

    public CleaningStaff(String name, String lastName, String dni, String address, String phone, String email, String position, 
    Double salary, String date, String password, String cleaningType) {
        super(name, lastName, dni, address, phone, email, position, salary, date, password);
        this.cleaningType = cleaningType;
    }

    public String getCleaningType() {
        return cleaningType;
    }

    public void setCleaningType(String cleaningType) {
        this.cleaningType = cleaningType;
    }

    @Override
    public String toString() {
        return "CleaningStaff{" + "cleaningType=" + cleaningType + '}';
    }

    
}
