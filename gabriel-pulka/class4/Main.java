import java.nio.file.Path;

public class Main {

    public static void main(String args[]) throws IdBookException, CountDoorKeepersException, BookNameException {

        Librarian librarian = new Librarian("George", "Harris", 2, 12611, 20126117);

        try {
            librarian.giveBook("M");
        }catch (BookNameException e){
            System.out.println(e.getMessage());
        }

        try {
            librarian.giveBook(1002);
        } catch (IdBookException e){
            System.out.println(e.getMessage());
        }


        DoorKeeper doorKeeper1 = DoorKeeper.getDoorKeeper("the","doorkeeper 1",1,123,1234);

        try {
            DoorKeeper doorKeeper2=  DoorKeeper.getDoorKeeper("the","doorkeeper 2",2,456,4567);
        }catch (CountDoorKeepersException e){
            System.out.println(e.getMessage());
        }


        Furniture chair = new Furniture("School #1",1,"A chair");
        chair.isChair(true);
        chair.isTable(true);
        System.out.println(chair.toString());


        Teacher teacher1 = new Teacher("Mr", "Teacher", 1, "Math", 11, 1223);
        teacher1.attendanceList();
        teacher1.attendanceList();

        teacher1.readStudentList("src\\students.txt");

    }
}
