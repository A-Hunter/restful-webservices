import entity.Person;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by Ghazi Naceur on 17/04/2017.
 */
public class Deserializer {

    public void unmarshall() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        Person person = (Person) unmarshaller.unmarshal(new File("person.xml"));
        System.out.println(person);

    }
}
