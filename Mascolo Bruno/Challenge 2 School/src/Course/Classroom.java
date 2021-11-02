package Course;



public class Classroom {

    private int idClassroom;
    private Course course;
    private int qChairs;

    public Classroom() {    }

    public Classroom(int idClassroom, Course course, int qChairs) {
        this.idClassroom = idClassroom;
        this.course = course;
        this.qChairs = qChairs;
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

    public void setqChairs(int qChairs) {
        this.qChairs = qChairs;
    }


}
