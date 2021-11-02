import java.util.Objects;

public abstract class Persona {
    private String nombre;
    private String apellido;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
