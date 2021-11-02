package Evaluation;

import Course.Course;
import Course.Subject;
import Personal.Student;
import Personal.Teacher;

public class TP extends Evaluation{
    private boolean passed;

    public TP(){}

    public TP(Subject subject, Course course, Student student, Teacher teacher, String date, boolean passed) {
        super(subject, course, student, teacher, date);
        this.passed = passed;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

}
