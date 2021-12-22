import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StudentDao implements Dao<Student>{


    @Override
    public Student get(Integer id) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionDB.GetConnectionDB();
        String sql = "Select * from student where id_number = ?";
        PreparedStatement prep = conn.prepareStatement(sql);
        prep.setInt(1, id);
        ResultSet resultSet = prep.executeQuery();
        if (resultSet.next() != true){
            return null;
        };
        String name = resultSet.getString("name");
        String lastName = resultSet.getString("last_name");
        Date birth_date = resultSet.getDate("birth_date");
        Student student = new Student(name, lastName, id, birth_date);

        return  student;

    }

    @Override
    public List<Student> getall() throws ClassNotFoundException, SQLException {
        List<Student> students= new ArrayList<Student>();
        Connection conn = ConnectionDB.GetConnectionDB();
        String sql = "Select * from student";
        ResultSet resultSet = conn.createStatement().executeQuery(sql);
        while (resultSet.next() != false){
            String name = resultSet.getString("name");
            String lastName = resultSet.getString("last_name");
            Date birth_date = resultSet.getDate("birth_date");
            Integer id = resultSet.getInt("id_number");

            students.add(new Student(name, lastName, id, birth_date));
        }

        return  students;
    }

    @Override
    public void save(Student student) throws ClassNotFoundException, SQLException {
        Connection conn = ConnectionDB.GetConnectionDB();
        String sql = "INSERT INTO `test`.`student`\n" +
                "(id_number,\n" +
                "name,\n" +
                "last_name,\n" +
                "birth_date)\n" +
                "VALUES\n" +
                "(?,?,?,?)";
        PreparedStatement prep = conn.prepareStatement(sql);
        prep.setInt(1, student.getIdNumber());
        prep.setString(2, student.getName());
        prep.setString(3, student.getLastName());
        java.sql.Date sDate = new java.sql.Date(student.getBirthDate().getTime());
        prep.setDate(4, sDate);

        prep.executeUpdate();

    }

    @Override
    public void delete(Student student) throws ClassNotFoundException, SQLException {

        Connection conn = ConnectionDB.GetConnectionDB();
        String sql = "DELETE from student where id_number = ?";
        PreparedStatement prep = conn.prepareStatement(sql);
        prep.setInt(1, student.getIdNumber());
        prep.executeUpdate();

    }
}
