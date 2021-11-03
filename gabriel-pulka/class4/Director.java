public final class Director extends Staff {


    public Director(String nombre, String apellido, Integer cargoId, Integer idNumber, Integer cuilNumber) {
        super(nombre, apellido, cargoId, idNumber, cuilNumber);
    }

    @Override
    public String toString() {
        return "Director " + getNombre() + " " + getCargoId();
    }

    @Override
    public void work(String work) {
        System.out.println(work);
    }
}
