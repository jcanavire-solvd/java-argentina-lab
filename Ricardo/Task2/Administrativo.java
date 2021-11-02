public class Administrativo extends Empleado{

    double salary = super.baseSalary * 2;

    public Administrativo(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }
}
