package kata6;
        
import javax.xml.bind.annotation.XmlElement;

public class Address {
    
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;


    public Address() {}
    
    public Address(String street, String suite, String city, String zipcode, Geo geo) {
        this.street = street;
        this.suite = suite;
        this.zipcode = zipcode;
        this.geo = geo;
        this.city = city;
    }
    
 
    @XmlElement
    public String getStreet() {
        return street;
    }
    
    @XmlElement
    public String getSuite() {
        return suite;
    }

    @XmlElement
    public String getCity() {
        return city;
    }

    @XmlElement
    public String getZipcode() {
        return zipcode;
    }

    @XmlElement
    public Geo getGeo() {
        return geo;
    }

    @Override
    public String toString() {
        return  "  street: " + street + "\n" +
                "   suite: " + suite + "\n"+
                "   zipcode: " + zipcode + "\n"+
                "   Geo {\n " + geo + "\n   }\n"+
                "   city: " + city;
    }
}