import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Teacher extends Staff implements Teach {

    private String materia;
    static final Integer MaxTimesAttendanceList = 1;
    static Integer CounterAttendanceList = 0;



    public Teacher(String nombre, String apellido, Integer cargoId, String materia, Integer idNumber, Integer cuilNumber) {
        super(nombre, apellido, cargoId, idNumber, cuilNumber);
        setMateria(materia);
    }

    @Override
    public void work(String work) {
        System.out.println(work);
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "name='" + getNombre() + '\'' +
                ", surname='" + getApellido() + '\'' +
                ", id code='" + getCargoId() + '\'' +
                ", subject='" + getMateria() + '\'' +
                ", id number='" + getIdNumber() + '\'' +
                ", cuil number='" + getCuilNumber() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Teacher teacher = (Teacher) o;
        return getNombre().equals(teacher.getNombre()) && getApellido().equals(teacher.getApellido()) &&
                materia.equals(teacher.materia) && hashCode() == teacher.hashCode();
    }

    @Override
    public int hashCode() {
        return getCargoId();
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    static Integer callAttendanceList() {
        CounterAttendanceList++;

        if (CounterAttendanceList > MaxTimesAttendanceList) {
            try {
                throw new AttendanceListException("You should take list once a day");
            } catch (AttendanceListException e) {
                System.out.println(e.getMessage());
                return -1;
            }

        }
        return 1;
    }

    @Override
    public void attendanceList() {

        if (callAttendanceList() == 1) {
            System.out.println("Taking class list...");
        }

    }

    @Override
    public void takeTest() {
        System.out.println("Teacher " + getNombre() + " " + getApellido() + " Taking " + getMateria() + " Test");
    }

    @Override
    public void readStudentList(String Studentsfilename) {
        String filePath = System.getProperty("user.dir") + File.separator + Studentsfilename;

        try(FileInputStream fileInputStream = new FileInputStream(filePath)){
            int i = fileInputStream.read();

            while(i != -1) {
                System.out.print((char)i);
                i = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}