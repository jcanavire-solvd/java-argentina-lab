package Evaluation;

import Course.Course;
import Course.Subject;
import Personal.Student;
import Personal.Teacher;

import java.util.Objects;

public abstract class Evaluation {
    private Subject subject;
    private Course course;
    private Student student;
    private Teacher teacher;
    private String date;

    public Evaluation() {
    }

    public Evaluation(Subject subject, Course course, Student student, Teacher teacher, String date) {
        this.subject = subject;
        this.course = course;
        this.student = student;
        this.teacher = teacher;
        this.date = date;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evaluation)) return false;
        Evaluation that = (Evaluation) o;
        return getSubject().equals(that.getSubject()) && getCourse().equals(that.getCourse()) && getStudent().equals(that.getStudent()) && getTeacher().equals(that.getTeacher()) && getDate().equals(that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSubject(), getCourse(), getStudent(), getTeacher(), getDate());
    }
}


