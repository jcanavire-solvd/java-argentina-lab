package Course;

import java.util.Objects;

public class Course {
    private int idCourse;
    private int year;
    private String division;
    private Classroom classroom;
    private int qStudents;

    public Course() {
    }

    public Course(int idCourse, int year, String division, Classroom classroom, int qStudents) {
        this.idCourse = idCourse;
        this.year = year;
        this.division = division;
        this.classroom = classroom;
        this.qStudents = qStudents;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public int getqStudents() {
        return qStudents;
    }

    public void setqStudents(int qStudents) {
        this.qStudents = qStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return getIdCourse() == course.getIdCourse() && getYear() == course.getYear() && getqStudents() == course.getqStudents() && getDivision().equals(course.getDivision()) && getClassroom().equals(course.getClassroom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdCourse(), getYear(), getDivision(), getClassroom(), getqStudents());
    }
}
