package Evaluation;

import Course.Course;
import Course.Subject;
import Personal.Student;
import Personal.Teacher;

public class Exam extends Evaluation{
    private int grade;

    public Exam (){}

    public Exam(Subject subject, Course course, Student student, Teacher teacher, String date, int grade) {
        super(subject, course, student, teacher, date);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
