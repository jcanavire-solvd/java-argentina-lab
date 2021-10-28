public class Cocinero extends Empleado{

    double salary = super.baseSalary * 1.6;

    public Cocinero(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }
}
