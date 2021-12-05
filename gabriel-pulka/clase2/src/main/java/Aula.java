import java.util.Objects;

public class Aula extends Escuela {

    private Integer numeroAula;

    public Aula(String nombreEscuela, Integer numeroAula) {
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
        Aula aula = (Aula) o;
        return numeroAula.equals(aula.numeroAula) && getNombreEscuela().equals(aula.getNombreEscuela());
    }

    @Override
    public int hashCode() {
        return numeroAula;
    }
}
