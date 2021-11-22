public class Classroom extends School {

    private Integer classNumber;

    public Classroom(String nameSchool, Integer classNumber) {
        super(nameSchool);
        this.setClassNumber(classNumber);
    }


    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Class {" +
                "School Name=" + getNameSchool() +
                ", Class Number=" + getClassNumber() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Classroom classroom = (Classroom) o;
        return classNumber.equals(classroom.classNumber) && getNameSchool().equals(classroom.getNameSchool());
    }

    @Override
    public int hashCode() {
        return classNumber;
    }
}
