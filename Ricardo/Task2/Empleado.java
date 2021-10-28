import java.util.Objects;

public class Empleado extends Persona {

    float baseSalary = 40000;
    int legajo = getNumeroIdentificacion();

    public Empleado(String nombre, String apellido, int legajo) {
        super();
    }


    @Override
    public void identificarse() {
        System.out.println(legajo);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "baseSalary=" + baseSalary +
                ", legajo=" + legajo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Float.compare(empleado.baseSalary, baseSalary) == 0 && legajo == empleado.legajo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseSalary, legajo);
    }
}
