import javax.xml.bind.JAXBException;

/**
 * Created by Ghazi Naceur on 17/04/2017.
 */
public class TestDeserializer {
    public static void main(String[] args) {
        Deserializer deserializer = new Deserializer();
        try {
            deserializer.unmarshall();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
