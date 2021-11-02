public class Mobiliario extends Aula{

    private String descripcionMobiliario;

    public Mobiliario(String nombreEscuela, Integer numeroAula, String descripcionMobiliario) {
        super(nombreEscuela, numeroAula);
        setDescripcionMobiliario(descripcionMobiliario);
    }

    public String getDescripcionMobiliario() {
        return descripcionMobiliario;
    }

    public void setDescripcionMobiliario(String descripcionMobiliario) {
        this.descripcionMobiliario = descripcionMobiliario;
    }
}
