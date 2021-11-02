package Course;

import Personal.Teacher;

public class Subject {
    private int idSubject;
    private String name;
    private int version; //referenced to the number of the subject. For example, Biology 2, Biology 3
    private Teacher teacher;

    public Subject() {    }

    public Subject(int idSubject, String name, int version, Teacher teacher) {
        this.idSubject = idSubject;
        this.name = name;
        this.version = version;
        this.teacher = teacher;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
