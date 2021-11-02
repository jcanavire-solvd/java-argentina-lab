public class Limpieza extends Empleado{

    double salary = super.baseSalary * 1.2;

    public Limpieza(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }
}
