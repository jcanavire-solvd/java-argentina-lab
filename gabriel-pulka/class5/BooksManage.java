public interface BooksManage {

    //polymorphism
    public void giveBook(String bookName) throws BookNameException;

    public void giveBook(Integer idBook) throws IdBookException;

}
