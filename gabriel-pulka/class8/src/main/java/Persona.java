public abstract class Persona {
    private String name;
    private String lastName;
    private Integer idNumber;
    private Integer cuilNumber;

    //polymorphism
    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public void setIdNumber(Integer idNumber, Integer cuilNumber) {
        this.idNumber = idNumber;
        this.cuilNumber = cuilNumber;
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

    public Integer getIdNumber() {
        return idNumber;
    }



    public Integer getCuilNumber() {
        return cuilNumber;
    }

    public void setCuilNumber(Integer cuilNumber) {
        this.cuilNumber = cuilNumber;
    }
}
