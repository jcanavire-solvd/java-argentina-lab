import java.io.*;

public class Teacher extends Staff implements Teach {

    private Subjects subject;
    static final Integer MaxTimesAttendanceList = 1;
    static Integer CounterAttendanceList = 0;



    public Teacher(String name, String lastName, Integer jobId, Subjects subject, Integer idNumber, Integer cuilNumber) {
        super(name, lastName, jobId, idNumber, cuilNumber);
        setSubject(subject);
    }

    @Override
    public void work(String work) {
        System.out.println(work);
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "name='" + getName() + '\'' +
                ", surname='" + getLastName() + '\'' +
                ", id code='" + getJobId() + '\'' +
                ", subject='" + getSubject() + '\'' +
                ", hours='" + subject.getHours() + '\'' +
                ", id number='" + getIdNumber() + '\'' +
                ", cuil number='" + getCuilNumber() +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        Teacher teacher = (Teacher) o;
        return getName().equals(teacher.getName()) && getLastName().equals(teacher.getLastName()) &&
                subject.equals(teacher.subject) && hashCode() == teacher.hashCode();
    }

    @Override
    public int hashCode() {
        return getJobId();
    }

    public String getSubject() {
        return subject.name();
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    static Integer callAttendanceList() {
        CounterAttendanceList++;

        if (CounterAttendanceList > MaxTimesAttendanceList) {
            try {
                throw new AttendanceListException("You should take list once a day");
            } catch (AttendanceListException e) {
                System.out.println(e.getMessage());
                return -1;
            }

        }
        return 1;
    }

    @Override
    public void attendanceList() {

        if (callAttendanceList() == 1) {
            System.out.println("Taking class list...");
        }

    }

    @Override
    public void takeTest() {
        System.out.println("Teacher " + getName() + " " + getLastName() + " Taking " + getSubject() + " Test");
    }

    @Override
    public void readStudentList(String Studentsfilename) {
        String filePath = System.getProperty("user.dir") + File.separator + Studentsfilename;

        try(FileInputStream fileInputStream = new FileInputStream(filePath)){
            int i = fileInputStream.read();

            while(i != -1) {
                System.out.print((char)i);
                i = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}