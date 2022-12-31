
package kata6;

import com.google.gson.annotations.SerializedName;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement
@XmlType(propOrder={"id", "name", "username", "email", "address", "phone",
    "website", "company"})

public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    public User() {
    }
    
    public User(int id, String name, String username, String email,
            Address address, String phone, String website, Company company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }
    
    @XmlElement
    public int getId() {
        return id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public String getUsername() {
        return username;
    }

    @XmlElement
    public String getEmail() {
        return email;
    }

    @XmlElement
    public Address getAddress() {
        return address;
    }

    @XmlElement
    public String getPhone() {
        return phone;
    }

    @XmlElement
    public String getWebsite() {
        return website;
    }

    @XmlElement
    public Company getCompany() {
        return company;
    }

    
    
  
    
    @Override
    public String toString() {
       
        return "Id: " + id + "\n" +
                "Name: " + name + "\n" + 
                "UserName: " + username + "\n"+ 
                "Email: " + email + "\n" + 
                "Address {\n " + address.toString() + "\n}\n" + 
                "Phone: " + phone + "\n" +
                "Website: " + website + "\n" + 
                "Company {\n " + company.toString() + "\n}";
    }

     
  
}
