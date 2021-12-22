import java.sql.SQLException;
import java.util.List;

public interface Dao <T>{

    T get(Integer id) throws SQLException, ClassNotFoundException;
    List<T> getall() throws ClassNotFoundException, SQLException;
    void save(T t) throws ClassNotFoundException, SQLException;
    void delete(T t) throws ClassNotFoundException, SQLException;
}
