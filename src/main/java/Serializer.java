import entity.Address;
import entity.Person;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Ghazi Naceur on 17/04/2017.
 */
public class Serializer {

    public Serializer() {
    }

    public void marshall(final Person person) throws JAXBException, FileNotFoundException {

        JAXBContext context = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        FileOutputStream fileOutputStream = new FileOutputStream(new File("person.xml"));

        marshaller.marshal(person, fileOutputStream);
    }
}
