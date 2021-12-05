public class Teacher extends Staff implements Teach{

    private String materia;

    public Teacher(String nombre, String apellido, Integer cargoId, String materia, Integer idNumber, Integer cuilNumber) {
        super(nombre, apellido, cargoId, idNumber, cuilNumber);
        setMateria(materia);
    }

    @Override
    public void work(String work) {
        System.out.println(work);
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "name='" + getNombre() + '\'' +
                ", surname='" + getApellido() + '\'' +
                ", id code='" + getCargoId() + '\'' +
                ", subject='" + getMateria() + '\'' +
                ", id number='" + getIdNumber() + '\'' +
                ", cuil number='" + getCuilNumber() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Teacher teacher = (Teacher) o;
        return getNombre().equals(teacher.getNombre()) && getApellido().equals(teacher.getApellido()) &&
                materia.equals(teacher.materia) && hashCode() == teacher.hashCode();
    }

    @Override
    public int hashCode() {
        return getCargoId();
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void attendanceList() {
        System.out.println("Taking class list...");
    }

    @Override
    public void takeTest(){
        System.out.println("taking test...");
    }
}
