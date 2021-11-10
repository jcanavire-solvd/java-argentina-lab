public class Classroom extends School {

    private Integer numeroAula;

    public Classroom(String nombreEscuela, Integer numeroAula) {
        super(nombreEscuela);
        this.setNumeroAula(numeroAula);
    }


    public Integer getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(Integer numeroAula) {
        this.numeroAula = numeroAula;
    }

    @Override
    public String toString() {
        return "Aula {" +
                "Nombre Escuela=" + getNombreEscuela() +
                ", Numero Aula=" + getNumeroAula() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Classroom classroom = (Classroom) o;
        return numeroAula.equals(classroom.numeroAula) && getNombreEscuela().equals(classroom.getNombreEscuela());
    }

    @Override
    public int hashCode() {
        return numeroAula;
    }
}
