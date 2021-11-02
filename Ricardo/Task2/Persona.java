public abstract class Persona {
     protected String nombre;
     protected String apellido;
     protected int numeroIdentificacion;

     public void setNombre(String nombre){
          this.nombre = nombre;
     }

     public String getNombre(){
          return this.nombre;
     }

     public void setApellido(String apellido){
          this.apellido = apellido;
     }

     public String getApellido(){
          return this.apellido;
     }

     public void setNumeroIdentificacion(int numeroIdentificacion){
          this.numeroIdentificacion = numeroIdentificacion;
     }

     public int getNumeroIdentificacion(){
          return this.numeroIdentificacion;
     }

     public abstract void identificarse();
}
