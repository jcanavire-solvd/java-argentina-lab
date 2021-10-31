public class Librarian extends Staff implements BooksManage{


    public Librarian(String nombre, String apellido, Integer cargoId, Integer idNumber, Integer cuilNumber) {
        super(nombre, apellido, cargoId, idNumber, cuilNumber);
    }

    @Override
    public void work(String work) {
        System.out.println(work);
    }

    @Override
    public void giveBook(String bookName) {
        System.out.println("Giving Book: " + bookName);
    }

    @Override
    public void giveBook(Integer idBook) {
        System.out.println("Giving Book code #: " + idBook);

    }

    @Override
    public String toString() {
        return "Librarian " + getNombre() + " " + getApellido() + " id number " + getIdNumber() + " CUIL number " + getCuilNumber();
    }
}
