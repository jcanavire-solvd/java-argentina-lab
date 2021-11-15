public class Main {

    public static void main(String args[]){


        Student pepeSanchez = new Student("Pepe", "Sanchez", 123456);

        System.out.println(pepeSanchez.toString());
        pepeSanchez.attendClass();
        pepeSanchez.study();
        pepeSanchez.run();

        Teacher mrJohnson = new Teacher("John",
                "Johnson",
                1,
                "Biology",
                30303030,
                203030307
                );

        System.out.println(mrJohnson.toString());
        mrJohnson.attendanceList();
        mrJohnson.takeTest();

        Furniture chair = new Furniture("School number 123",1,"Chair #1");

        chair.isChair(Boolean.TRUE);
        chair.isTable(Boolean.FALSE);

        System.out.println(chair.toString());

        Librarian librarian = new Librarian("George", "Harris", 2, 12611, 20126117);
        System.out.println(librarian.toString());
        librarian.giveBook("Math, first level");
        librarian.giveBook(1002);

        Supervisor supervisor = new Supervisor("Michael","Scott",33,33113223,273132237);
        System.out.println(supervisor.getCargoId());

        Supervisor supervisor2 = new Supervisor("Mr","Bean",33,33113223,273132237);


        DoorKeeper keeper1 = DoorKeeper.getDoorKeeper("the", "doorkeeper #1", 3322,3231,45454);
        DoorKeeper keeper2 = DoorKeeper.getDoorKeeper("the", "doorkeeper #2", 76,213,987);

        keeper1.work("doing doorkeepers stuff");

        try {
            keeper2.work("doing something");
        }catch (NullPointerException e){
            System.out.println("doorkeeper 2 does not exists");
        }



    }
}
