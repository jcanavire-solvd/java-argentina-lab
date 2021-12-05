import java.util.*;

public class Main {

    public static void main(String args[]) {

        String[] nameStudent = {"Peter","John","Richard","George","Jerry"};
        String[] lastNameStudent = {"Johnson","Doe","Simpson","Williams","Smith"};
        Integer[] idNumberStudent = {123, 423, 35, 123, 34};
        Iterator<String> nameIterator = Arrays.stream(nameStudent).iterator();
        Iterator<String> lastNameIterator = Arrays.stream(lastNameStudent).iterator();
        Iterator<Integer> idNumberIterator = Arrays.stream(idNumberStudent).iterator();
        List<Student> students = new ArrayList<>();


        while (nameIterator.hasNext()){
            students.add(new Student(nameIterator.next(), lastNameIterator.next(), idNumberIterator.next()));
        }

        Iterator<Student> studentsIterator = students.iterator();
        while (studentsIterator.hasNext()){
            Student student =  studentsIterator.next();
            System.out.println(student.toString());
            student.attendClass();
        }




    }
}