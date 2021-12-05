public class Personal extends Persona{

    private Integer cargoId;

    public Personal(String nombre, String apellido, Integer cargoId) {
        setCargoId(cargoId);
        setNombre(nombre);
        setApellido(apellido);
    }


    public Integer getCargoId() {
        return cargoId;
    }

    public void setCargoId(Integer cargoId) {
        this.cargoId = cargoId;
    }

    @Override
    public boolean equals(Object o) {
        Personal personal = (Personal) o;
        return getNombre().equals(personal.getNombre()) && getApellido().equals(personal.getApellido()) && getCargoId().equals(personal.getCargoId()) ;
    }
}
