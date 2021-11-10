public class Librarian extends Staff implements BooksManage{


    public Librarian(String nombre, String apellido, Integer cargoId, Integer idNumber, Integer cuilNumber) {
        super(nombre, apellido, cargoId, idNumber, cuilNumber);
    }

    @Override
    public void work(String work) {
        System.out.println(work);
    }

    @Override
    public void giveBook(String bookName) throws BookNameException{

        if (bookName.length() <= 1){
            throw new BookNameException("The name of the book should have more than 1 character");
        }else{
            System.out.println("Giving Book: " + bookName);
        }
    }

    @Override
    public void giveBook(Integer idBook) throws IdBookException {
        if(idBook > 100){
            throw new IdBookException("The id book " + idBook.toString() + " is not valid");
        }else{
            System.out.println("Giving Book code #: " + idBook);
        }


    }

    @Override
    public String toString() {
        return "Librarian " + getNombre() + " " + getApellido() + " id number " + getIdNumber() + " CUIL number " + getCuilNumber();
    }




}
