import java.util.*;

public class Main {

    public static void main(String args[]) throws BookNameException, IdBookException {


        Random random = new Random();
        List<Librarian> librarians = new LinkedList<>();
        librarians.add(new Librarian("John","Peterson",1,14343,1322));
        librarians.add(new Librarian("Tom","Cruise",2,9876,6543));

        Iterator<Librarian> librarianIterator = librarians.listIterator();
        while (librarianIterator.hasNext()) {
            Librarian librarian = librarianIterator.next();

            librarian.giveBook(random.nextInt(100));
            librarian.giveBook(random.nextInt(50));
            librarian.giveBook("Mathematics 1");
            librarian.giveBook("Biology 4");
        }

    }
}
