public final class Director extends Personal{

    public Director(String nombre, String apellido, Integer cargoId){
        super(nombre, apellido, cargoId);
    }

    @Override
    public String toString() {
        return "Director " + getNombre() + " " + getCargoId();
    }
}
