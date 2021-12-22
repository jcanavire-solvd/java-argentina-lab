import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "classroom")
@XmlType(propOrder = { "idClassRoom", "description", "students" })
public class ClassRoom {

    private Integer idClassRoom;
    private String description;
    private List<Student> students;

    public Integer getIdClassRoom() {
        return idClassRoom;
    }


    @XmlAttribute
    public void setIdClassRoom(Integer idClassRoom) {
        this.idClassRoom = idClassRoom;
    }

    public String getDescription() {
        return description;
    }

    @XmlAttribute
    public void setDescription(String description) {
        this.description = description;
    }


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
