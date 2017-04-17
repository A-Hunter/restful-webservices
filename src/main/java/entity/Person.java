package entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Ghazi Naceur on 17/04/2017.
 */
@XmlRootElement
public class Person {
    public final String lastName;
    public final String firstName;
    public final Integer age;
    public final String occupation;
    public final Address address;

    public Person() {
        this(null,null,null,null,null);
    }

    public Person(String lastName, String firstName, Integer age, String occupation, Address address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.occupation = occupation;
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                ", address=" + address +
                '}';
    }
}
