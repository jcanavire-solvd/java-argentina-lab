public abstract class Staff extends Persona{

    private Integer cargoId;

    public Staff(String nombre, String apellido, Integer cargoId, Integer idNumber, Integer cuilNumber) {
        setCargoId(cargoId);
        setNombre(nombre);
        setApellido(apellido);
        setIdNumber(idNumber, cuilNumber);
    }

    public abstract void work(String work);

    public final Integer getCargoId() {
        return cargoId;
    }

    public void setCargoId(Integer cargoId) {
        this.cargoId = cargoId;
    }

    @Override
    public boolean equals(Object o) {
        Staff staff = (Staff) o;
        return getNombre().equals(staff.getNombre()) && getApellido().equals(staff.getApellido()) && getCargoId().equals(staff.getCargoId()) ;
    }
}
