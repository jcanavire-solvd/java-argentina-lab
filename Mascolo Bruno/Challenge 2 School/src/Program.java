import Area.School;
import Personal.Accountant;
import Personal.Person;
import Personal.Student;

public class Program {

    static {
        School school = new School("La Salle School", "www.lasalle.com",351764600);
        System.out.println("Welcome to "+ school.getName());
    }

    public static void main (String[] args){

        Person accountant = new Accountant();
        Person student = new Student();

        accountant.Info();
        student.Info();
    }
}
