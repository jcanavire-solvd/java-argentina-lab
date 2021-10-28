import java.util.Objects;

public class Proyeccion extends Sala{

    private int cantidadDeAsientos;
    private int cantidadDeFilas;
    private int cantidadDePasillos;

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public int getCantidadDeFilas() {
        return cantidadDeFilas;
    }

    public void setCantidadDeFilas(int cantidadDeFilas) {
        this.cantidadDeFilas = cantidadDeFilas;
    }

    public int getCantidadDePasillos() {
        return cantidadDePasillos;
    }

    public void setCantidadDePasillos(int cantidadDePasillos) {
        this.cantidadDePasillos = cantidadDePasillos;
    }

    @Override
    public String toString() {
        return "Proyeccion{" +
                "cantidadDeAsientos=" + cantidadDeAsientos +
                ", cantidadDeFilas=" + cantidadDeFilas +
                ", cantidadDePasillos=" + cantidadDePasillos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proyeccion that = (Proyeccion) o;
        return cantidadDeAsientos == that.cantidadDeAsientos && cantidadDeFilas == that.cantidadDeFilas && cantidadDePasillos == that.cantidadDePasillos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cantidadDeAsientos, cantidadDeFilas, cantidadDePasillos);
    }
}
