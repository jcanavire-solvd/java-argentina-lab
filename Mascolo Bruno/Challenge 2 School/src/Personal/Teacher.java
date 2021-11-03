package Personal;

import Course.Subject;
import Interface.Teach;

public class Teacher extends Person implements Teach {
    private int idEmployee;
    private Subject subject;

    @Override
    public void talk() {

    }

    public Teacher (){}

    public Teacher(int dni, String name, int age, int idEmployee, Subject subject) {
        super(dni, name, age);
        this.idEmployee = idEmployee;
        this.subject = subject;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }


    @Override
    public void writeBoard() {

    }

    @Override
    public void lecture() {

    }

    @Override
    public void answerQuestion() {

    }
}
