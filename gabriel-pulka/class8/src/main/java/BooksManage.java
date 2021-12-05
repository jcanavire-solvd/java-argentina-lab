public interface BooksManage {

    public <T> void giveBook(T t) throws IdBookException, BookNameException;

}
