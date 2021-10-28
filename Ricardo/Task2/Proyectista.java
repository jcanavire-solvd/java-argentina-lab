public class Proyectista extends Empleado{

    double salary = super.baseSalary *1.8;

    public Proyectista(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }
}
