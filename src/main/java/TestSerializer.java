import entity.Address;
import entity.Person;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

/**
 * Created by Ghazi Naceur on 17/04/2017.
 */
public class TestSerializer {
    public static void main(String[] args) {
        Address address = new Address("Ushiha clan road",2,"Konoha",00215);
        Person person = new Person("Ushiha","Itachi",25 , "Shinobi",address);
        Serializer serializer = new Serializer();
        try {
            serializer.marshall(person);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
