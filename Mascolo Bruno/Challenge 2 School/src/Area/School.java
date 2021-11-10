package Area;

import Course.Course;
import Personal.Student;
import Personal.Teacher;
import Course.Classroom;
import Course.Subject;


import java.util.List;

public class School {
    private String name;
    private String web;
    private int phone;
    private List <Student> students;
    private List <Teacher> teachers;
    private List<Classroom> classrooms;
    private List<Course> courses;
    private List<Subject> subjects;

    public static List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }




    public School(){}

    public School(String name, String web, int phone) {
        this.name = name;
        this.web = web;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
