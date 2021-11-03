package Personal;

import Course.Course;
import Interface.Study;

import java.util.Objects;

public class Student extends Person implements Study {
    private int idStudent;
    private Course course;

    @Override
    public void talk() {

    }

    public Student() {    }

    public Student(int dni, String name, int age, int idStudent, Course course) {
        super(dni, name, age);
        this.idStudent = idStudent;
        this.course = course;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return getIdStudent() == student.getIdStudent() && getCourse().equals(student.getCourse());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getIdStudent(), getCourse());
    }

    @Override
    public void read() {

    }

    @Override
    public void highlight() {

    }

    @Override
    public void Info() {
        System.out.println("This is a Student");
    }
}
