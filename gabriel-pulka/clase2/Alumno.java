import java.util.Objects;

public final class Alumno extends Persona{


    public Alumno(String nombre, String apellido){
        setApellido(apellido);
        setNombre(nombre);
    }



    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        Alumno alumno = (Alumno) o;
        return getNombre().equals(alumno.getNombre()) && getApellido().equals(alumno.getApellido()) && hashCode() == alumno.hashCode();
    }

    @Override
    public int hashCode() {
        return getNombre().length() + getApellido().length();
    }
}
