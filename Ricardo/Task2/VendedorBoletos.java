public class VendedorBoletos extends Empleado {

    double salary = super.baseSalary * 1.3;

    public VendedorBoletos(String nombre, String apellido, int legajo, float salary) {
        super(nombre, apellido, legajo);
    }
}
