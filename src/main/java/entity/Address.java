package entity;

import javax.xml.bind.annotation.XmlType;

/**
 * Created by Ghazi Naceur on 17/04/2017.
 */
@XmlType
public class Address {
    public final String roadName;
    public final Integer roadNumber;
    public final String country;
    public final Integer zip;

    public Address() {
        this(null,null,null,null);
    }

    public Address(String roadName, Integer roadNumber, String country, Integer zip) {
        this.roadName = roadName;
        this.roadNumber = roadNumber;
        this.country = country;
        this.zip = zip;
    }

    public String getRoadName() {
        return roadName;
    }

    public Integer getRoadNumber() {
        return roadNumber;
    }

    public String getCountry() {
        return country;
    }

    public Integer getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "roadName='" + roadName + '\'' +
                ", roadNumber=" + roadNumber +
                ", country=" + country +
                ", zip=" + zip +
                '}';
    }
}
