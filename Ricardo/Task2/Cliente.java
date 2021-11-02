import java.util.Objects;

public class Cliente extends Persona{

    private String codigoAsiento;

    public Cliente(String nombre, String apellido){
        setNombre(nombre);
        setApellido(apellido);
        setNumeroIdentificacion(numeroIdentificacion);
    }


    @Override
    public void identificarse() {
        System.out.println(numeroIdentificacion);
    }

    public String getCodigoAsiento() {
        return codigoAsiento;
    }

    public void setCodigoAsiento(String codigoAsiento) {
        this.codigoAsiento = codigoAsiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigoAsiento='" + codigoAsiento + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(codigoAsiento, cliente.codigoAsiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoAsiento);
    }
}
