import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static java.lang.Boolean.TRUE;

public class Main {

    public static void main(String[] args) throws JAXBException, FileNotFoundException, ParseException {

        List<Student> students= new ArrayList<>();

        Student student = new Student();
        student.setIdStudent(1);
        student.setBirthDate(new SimpleDateFormat("yyyyMMdd").parse("19921102"));
        student.setLastName("Johnson");
        student.setName("Charles");

        Student student2 = new Student();
        student2.setIdStudent(2);
        student2.setBirthDate(new SimpleDateFormat("yyyyMMdd").parse("19810510"));
        student2.setLastName("Simpson");
        student2.setName("Homero");

        students.add(student);
        students.add(student2);

        ClassRoom classRoom = new ClassRoom();
        classRoom.setIdClassRoom(1);
        classRoom.setDescription("Music Classroom");
        classRoom.setStudents(students);

        JAXBContext context = JAXBContext.newInstance(ClassRoom.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, TRUE);
        mar.marshal(classRoom, new FileOutputStream("./classroom.xml"));

    }
}
