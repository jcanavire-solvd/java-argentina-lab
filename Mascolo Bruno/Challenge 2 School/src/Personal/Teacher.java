package Personal;

import Course.Subject;

public class Teacher extends Person{
    private int idEmployee;
    private Subject subject;

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


}
