public class Furniture extends Classroom implements Desk{

    private String descripcionMobiliario;
    private Boolean Chair;
    private Boolean Table;

    public Furniture(String nombreEscuela, Integer numeroAula, String descripcionMobiliario) {
        super(nombreEscuela, numeroAula);
        setDescripcionMobiliario(descripcionMobiliario);

    }

    public String getDescripcionMobiliario() {
        return descripcionMobiliario;
    }

    public void setDescripcionMobiliario(String descripcionMobiliario) {
        this.descripcionMobiliario = descripcionMobiliario;
    }


    @Override
    public void isChair(Boolean value) {
        Chair = value;
    }

    @Override
    public void isTable(Boolean value) {
        Table = value;

    }

    @Override
    public String toString() {
        return "Furniture{" +
                "description='" + descripcionMobiliario + '\'' +
                ", Is a Chair?=" + Chair +
                ", is a Table?=" + Table +
                '}';
    }
}
