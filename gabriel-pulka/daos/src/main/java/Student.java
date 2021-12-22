import java.util.Date;

public final class Student extends Persona implements Learn, GymClass{

    private LevelsSchool levelsSchool;
    private Date birthDate;


    public Student(String name, String lastName, Integer idNumber, Date birthDate){
        setLastName(lastName);
        setName(name);
        setIdNumber(idNumber);
        setBirthDate(birthDate);



    }

    public Student(String name, String lastName, Integer idNumber, LevelsSchool levelsSchool){
        setLastName(lastName);
        setName(name);
        setIdNumber(idNumber);
        setLevelsSchool(levelsSchool);

    }



    @Override
    public String toString() {
        return "Student{" +
                "Name ='" + getName() + '\'' +
                ", Last Name='" + getLastName() + '\'' +
                ", id Number='" + getIdNumber() + '\'' +
                ", birth date='" + getBirthDate() + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return getName().equals(student.getName()) && getLastName().equals(student.getLastName()) && hashCode() == student.hashCode();
    }

    @Override
    public int hashCode() {
        return getName().length() + getLastName().length();
    }

    @Override
    public void attendClass(DaysOfWeek daysOfWeek) {
        switch (daysOfWeek){
            case SUNDAY, SATURDAY:
                System.out.println("It's day off");
                break;
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("Taking class on " + daysOfWeek.name());
                break;
        }

    }

    @Override
    public void study() {
        System.out.println("Studying for exams...");

    }

    @Override
    public void run() {
        System.out.println("Running in Gym Class...");
    }

    public LevelsSchool getLevelsSchool() {
        return levelsSchool;
    }

    public void setLevelsSchool(LevelsSchool levelsSchool) {
        this.levelsSchool = levelsSchool;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
