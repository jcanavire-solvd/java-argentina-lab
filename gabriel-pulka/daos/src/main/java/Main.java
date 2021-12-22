import java.sql.SQLException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        StudentDao studentDao = new StudentDao();

        Student student = studentDao.get(1);
        System.out.println(student.toString());

        List<Student> students = new ArrayList<>();
        students = studentDao.getall();
        students.stream().forEach(System.out::println);


        Random random = new Random();
        int id = random.nextInt(1000);
        Date date = Date.from(Instant.now());
        Student student1 = new Student("Mark", "Chuker", id, date);
        studentDao.save(student1);
        System.out.println(studentDao.get(id));

        studentDao.delete(student1);
        System.out.println(studentDao.get(id));



    }
}
