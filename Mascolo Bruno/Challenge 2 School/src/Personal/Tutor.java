package Personal;

import Course.Course;

public class Tutor extends Person{
    private int idEmployee;
    private Course course;

    public Tutor (){}
    public Tutor(int dni, String name, int age, int idEmployee, Course course) {
        super(dni, name, age);
        this.idEmployee = idEmployee;
        this.course = course;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
