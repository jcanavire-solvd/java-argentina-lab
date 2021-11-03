package Course;



public class Classroom {

    private int idClassroom;
    private Course course;
    private final int qChairs = 50;

    public Classroom() {    }

    public Classroom(int idClassroom, Course course) {
        this.idClassroom = idClassroom;
        this.course = course;
    }

    public int getIdClassroom() {
        return idClassroom;
    }

    public void setIdClassroom(int idClassroom) {
        this.idClassroom = idClassroom;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getqChairs() {
        return qChairs;
    }
}
