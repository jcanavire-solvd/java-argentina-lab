public class EncargadoDeSala extends Empleado{

    double salary = super.baseSalary * 1.7;

    public EncargadoDeSala(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }
}
