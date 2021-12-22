import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

@XmlRootElement(name = "student")
@XmlType(propOrder = { "idStudent", "name", "lastName", "birthDate" })
public class Student {

    private Integer idStudent;
    private String name;
    private String lastName;
    private Date birthDate;

    public Integer getIdStudent() {
        return idStudent;
    }

    @XmlAttribute
    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    @XmlAttribute
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @XmlJavaTypeAdapter(DateAdapter.class)
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
