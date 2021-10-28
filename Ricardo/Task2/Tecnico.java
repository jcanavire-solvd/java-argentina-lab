public class Tecnico extends Empleado{

    double salary = super.baseSalary * 1.9;

    public Tecnico(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }
}
