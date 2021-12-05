import org.apache.log4j.Logger;

public final class Student extends Persona implements Learn, GymClass{

    Logger logger = Logger.getLogger(Main.class);
    private LevelsSchool levelsSchool;


    public Student(String name, String lastName, Integer idNumber){
        setLastName(lastName);
        setName(name);
        setIdNumber(idNumber);

        logger.info("A student is created! " + this.toString());

    }

    public Student(String name, String lastName, Integer idNumber, LevelsSchool levelsSchool){
        setLastName(lastName);
        setName(name);
        setIdNumber(idNumber);
        setLevelsSchool(levelsSchool);

        logger.info("A student is created! " + this.toString());

    }



    @Override
    public String toString() {
        return "Student{" +
                "Name ='" + getName() + '\'' +
                ", Last Name='" + getLastName() + '\'' +
                ", id Number='" + getIdNumber() + '\'' +
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
        logger.info("attendClass method. " +this.toString());
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
}
