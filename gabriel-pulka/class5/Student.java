public final class Student extends Persona implements Learn, GymClass{


    public Student(String nombre, String apellido, Integer idNumber){
        setApellido(apellido);
        setNombre(nombre);
        setIdNumber(idNumber);
    }



    @Override
    public String toString() {
        return "Student{" +
                "Name ='" + getNombre() + '\'' +
                ", Last Name='" + getApellido() + '\'' +
                ", id Number='" + getIdNumber() + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return getNombre().equals(student.getNombre()) && getApellido().equals(student.getApellido()) && hashCode() == student.hashCode();
    }

    @Override
    public int hashCode() {
        return getNombre().length() + getApellido().length();
    }

    @Override
    public void attendClass() {
        System.out.println("Going to Math class....");
    }

    @Override
    public void study() {
        System.out.println("Studying for exams...");

    }

    @Override
    public void run() {
        System.out.println("Running in Gym Class...");
    }
}
