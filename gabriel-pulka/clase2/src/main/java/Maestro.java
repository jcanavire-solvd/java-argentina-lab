import java.util.Objects;

public class Maestro extends Personal{

    private String materia;

    public Maestro(String nombre, String apellido, Integer cargoId, String materia) {
        super(nombre, apellido, cargoId);
        setMateria(materia);
    }

    @Override
    public String toString() {
        return "Maestro {" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", codigo de cargo='" + getCargoId() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Maestro maestro = (Maestro) o;
        return getNombre().equals(maestro.getNombre()) && getApellido().equals(maestro.getApellido()) &&
                materia.equals(maestro.materia) && hashCode() == maestro.hashCode();
    }

    @Override
    public int hashCode() {
        return getCargoId();
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
