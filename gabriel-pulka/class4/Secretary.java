public class Secretary extends Staff {


    public Secretary(String nombre, String apellido, Integer cargoId, Integer idNumber, Integer cuilNumber) {
        super(nombre, apellido, cargoId, idNumber, cuilNumber);
    }

    @Override
    public void work(String work) {
        System.out.println(work);
    }
}
