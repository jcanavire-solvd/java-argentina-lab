public class Main {

    public static void main(String args[]){

        Aula primeroA = new Aula("Escuela Profesor Girafales",1);
        Aula primeroB = new Aula("Escuela Profesor Girafales",2);

        System.out.println(primeroA.toString());
        System.out.println("Primero A equals Primero B? " + primeroA.equals(primeroB));

        Maestro maestroPrimerGrado = new Maestro("John","Doe",1, "Matematica");
        Maestro maestroSegundoGrado = new Maestro("John","Doe",1, "Matematica");

        System.out.println(maestroPrimerGrado.toString() + " equals " + maestroSegundoGrado.toString() + "? " + maestroPrimerGrado.equals(maestroSegundoGrado));

        Alumno pepeSanchez = new Alumno("Pepe", "Sanchez");
        Alumno jorgePerez = new Alumno("Jorge", "Perez");

        System.out.println(pepeSanchez.toString() + " equals " + jorgePerez.toString() + "? " + pepeSanchez.equals(jorgePerez));
        System.out.println(pepeSanchez.toString() + " hashcode: " + pepeSanchez.hashCode());
        System.out.println(jorgePerez.toString() + " hashcode: " + jorgePerez.hashCode());

    }
}
