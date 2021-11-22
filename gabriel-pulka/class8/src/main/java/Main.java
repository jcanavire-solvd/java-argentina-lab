import java.util.*;
import java.util.function.*;

public class Main {

    @FunctionalInterface
    interface Rand <T extends Number>{
        public T getNumber(T t);
    }
    interface librarianCreator<A extends String, B extends String, C extends Integer, D extends Integer, E extends Integer>{
        public Librarian create(A a, B b, C c, D d, E e);
    }
    interface addSecondLastName<T extends String, U extends String>{
        public String addLastName(T t, U u);
    }

    public static void main(String args[]) throws IdBookException, BookNameException {

        Rand random = x -> new Random().nextInt((int) x);
        librarianCreator creator = (name, lastName, jobId, idNumber, cuilNumber) -> new Librarian( name, lastName, jobId, idNumber, cuilNumber);
        addSecondLastName change = (a, b) -> a + " " + b;


        List<Librarian> librarians = new LinkedList<>();
        librarians.add(new Librarian("John","Peterson",1,14343,1322));
        librarians.add(new Librarian("Tom","Cruise",2,9876,6543));
        librarians.add(new Librarian("Peter","Johnson",3,5436,7654));
        librarians.add(new Librarian("Walter","White",4,87654,34565));
        librarians.add(creator.create("Brand New", "Librarian",8,8765,345));
        librarians.get(4).setLastName(change.addLastName(librarians.get(4).getLastName(),"Jr."));

        librarians.stream().forEach(librarian -> {
            try {
                librarian.giveBook(random.getNumber(100));
            } catch (IdBookException e) {
                System.out.println(e.getMessage());
            } catch (BookNameException e) {
                System.out.println(e.getMessage());
            }
        });


        /////////////////////////
        //predicate
        System.out.println("Count of librarians with job id >=3: " + librarians.stream().filter(j -> j.getJobId() >=3).count());

        //function
        Function<Librarian, String> librarianData = Librarian::toString;
        System.out.println(librarianData.apply(librarians.get(0)));

        //consumer
        Consumer<Librarian> work = w -> w.work("Working all day long...");
        work.accept(librarians.get(2));

        //supplier
        Supplier<Librarian> l = () -> new Librarian("The","Supplier",5,34534,345346);
        librarians.add(l.get());
        System.out.println(librarians.get(librarians.size() -1));

        //bifunction
        BiFunction<Integer,Integer,Boolean> compareIdJobs = (id1, id2) -> id1 == id2;
        System.out.println("Same idJobs? "  + compareIdJobs.apply(librarians.get(0).getJobId(), librarians.get(1).getJobId()));

        //////////////////////////////
        //1º Enum
        List<Teacher> teachers = new LinkedList<>();
        teachers.add(new Teacher("Peter", "Peterson", 1, Subjects.MATHEMATICS, 12321, 123123));
        teachers.add(new Teacher("Mark", "Zucks", 2, Subjects.HISTORY, 8765, 654345));
        teachers.stream().forEach(System.out::println);

        //2º Enum
        List<Student> students = new LinkedList<>();
        students.add(new Student("Xavier", "The First", 1));
        students.add(new Student("Neo", "The One", 2));
        students.get(0).attendClass(DaysOfWeek.MONDAY);
        students.get(1).attendClass(DaysOfWeek.SUNDAY);

        //3º Enum
        List<Cook> cooks = new LinkedList<>();
        cooks.add(new Cook("Mr", "Cooker", 13, 1343, 545454));
        cooks.add(new Cook("Mr", "Cooker Nº 2", 654, 687, 565456));
        System.out.println(cooks.get(0).toString());
        cooks.get(0).prepareFood(KitchenMenu.FISH);
        System.out.println(cooks.get(1).toString());
        cooks.get(1).prepareFood(KitchenMenu.PASTA);

        //4º Enum
        List<Furniture> furnitures = new LinkedList<>();
        furnitures.add(new Furniture("School 123", 1, TypeOfFurnitures.DESK));
        furnitures.add(new Furniture("School 123", 1, TypeOfFurnitures.CHAIR));
        furnitures.stream().forEach(furniture -> System.out.println(furniture.getFurnitureDescription() + ". Price: " + furniture.getPrice().toString()));

        //5º Enum
        students.add(new Student("Mr", "Ecko", 3, LevelsSchool.PRESCHOOL));
        students.add(new Student("Neo", "The One", 4, LevelsSchool.HIGH));
        students.stream().filter(j -> j.getIdNumber() > 2).forEach(student -> System.out.println(student.toString() + ". Level: " + student.getLevelsSchool()));

    }
}
