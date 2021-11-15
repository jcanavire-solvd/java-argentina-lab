import java.util.*;

public class Main {

    public static void main(String args[]) {

        String[] nameStudent = {"Peter","John","Richard","George","Jerry"};
        String[] lastNameStudent = {"Johnson","Doe","Simpson","Williams","Smith"};
        Integer[] idNumberStudent = {123, 423, 35, 123, 34};
        Iterator<String> nameIterator = Arrays.stream(nameStudent).iterator();
        Iterator<String> lastNameIterator = Arrays.stream(lastNameStudent).iterator();
        Iterator<Integer> idNumberIterator = Arrays.stream(idNumberStudent).iterator();
        ArrayList<Student> students = new ArrayList<Student>();
        while (nameIterator.hasNext()){
            students.add(new Student(nameIterator.next(), lastNameIterator.next(), idNumberIterator.next()));
        }
        Iterator<Student> studentsIterator = students.iterator();
        while (studentsIterator.hasNext()){
            Student student =  studentsIterator.next();
            System.out.println(student.toString());
            student.attendClass();
        }



        Random random = new Random();
        ArrayList<Librarian> librarians = new ArrayList<Librarian>();
        for (Integer i = 1; i<= 10; i++){
            librarians.add(new Librarian("Mr", "Librarian #" + i.toString(),random.nextInt(),random.nextInt(),random.nextInt()));
        }
        Iterator<Librarian> librarianIterator = librarians.iterator();

        while (librarianIterator.hasNext()){
            Librarian librarian = librarianIterator.next();
            System.out.println(librarian.toString());
            try {
                librarian.giveBook(random.nextInt(200));
            } catch (IdBookException e) {
                System.out.println(e.getMessage());
            }
        }


        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("Mr","Johnson", random.nextInt(), "Math", random.nextInt(), random.nextInt()));
        teachers.add(new Teacher("Mr","Williams", random.nextInt(), "Biology", random.nextInt(), random.nextInt()));

        Iterator<Teacher> teacherIterator = teachers.iterator();

        String [] subjects = {"Language", "Science", "Art", "Music", "Geometry"};
        List<String> subjectsList = Arrays.asList(subjects);

        while (teacherIterator.hasNext()) {
            Teacher teacher = teacherIterator.next();
            Iterator<String> subjectsIterator = subjectsList.iterator();
            while (subjectsIterator.hasNext()){
                teacher.setMateria(subjectsIterator.next());
                teacher.takeTest();

            }
        }

        Integer[] cargosId = new  Integer[5];

        for (Integer i = 0; i<= 4; i++){
            cargosId[i] = random.nextInt();
        }

        teacherIterator = teachers.iterator();
        while (teacherIterator.hasNext()){
            Teacher teacher = teacherIterator.next();
            Iterator<Integer> cargosIdIterator = Arrays.stream(cargosId).iterator();
            while (cargosIdIterator.hasNext()){
                Integer cargos = cargosIdIterator.next();
                teacher.setCargoId(cargos);
                System.out.println(teacher.getNombre() + " " + teacher.getApellido() + " " + "- Id Code: " + teacher.getCargoId());
            }

        }


        ArrayList<DoorKeeper> doorKeepers = new ArrayList<DoorKeeper>();

        for (Integer i=0; i<=4; i ++){
            try{
                doorKeepers.add(DoorKeeper.getDoorKeeper("Doorkeeper", "#" + i.toString(), 1, 1, 1));
            }catch (CountDoorKeepersException e) {
                System.out.println(e.getMessage());
            }
        }

        Iterator<DoorKeeper> doorKeeperIterator = doorKeepers.iterator();
        while (doorKeeperIterator.hasNext()){
            System.out.println(doorKeeperIterator.next());
        }



    }
}
