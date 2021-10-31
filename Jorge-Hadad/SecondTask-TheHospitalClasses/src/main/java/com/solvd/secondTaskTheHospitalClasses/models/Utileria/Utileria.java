package main.java.com.solvd.secondTaskTheHospitalClasses.models.Utileria;

public class Utileria {
    private int numero;
    private String nombre;
    private String descripcion;
    private String fecha;


    public Utileria(int numero, String nombre, String descripcion, String fecha) {
        this.numero = numero;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }       
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Utileria{" + "numero=" + numero + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha + '}';
    }

    //hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numero;
        return hash;
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utileria other = (Utileria) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
    
}
