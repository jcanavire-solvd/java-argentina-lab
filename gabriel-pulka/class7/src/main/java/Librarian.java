public class Librarian extends Staff implements BooksManage{

    @Override
    public <T> void giveBook(T t) throws IdBookException, BookNameException  {

        if (t instanceof Integer) {
            Integer idBook = (Integer) t;
            if(idBook > 100){
                throw new IdBookException("The id book " + idBook.toString() + " is not valid");
            }else{
                System.out.println(toString() + "\nGiving Book code #: " + idBook);
            }
        }
        if (t instanceof String) {
            String bookName = (String) t;
            if (bookName.length() <= 1){
                throw new BookNameException("The name of the book should have more than 1 character");
            }else{
                System.out.println(toString() +"\nGiving Book: " + bookName);
            }
        }
    }

    public Librarian(String nombre, String apellido, Integer cargoId, Integer idNumber, Integer cuilNumber) {
        super(nombre, apellido, cargoId, idNumber, cuilNumber);
    }

    @Override
    public void work(String work) {
        System.out.println(work);
    }

    @Override
    public String toString() {
        return "Librarian " + getNombre() + " " + getApellido() + " id number " + getIdNumber() + " CUIL number " + getCuilNumber();
    }



}
