
package kata6;

import com.google.gson.annotations.SerializedName;
import javax.xml.bind.annotation.XmlAttribute;


public class Geo {
    
    @SerializedName("geo")
    
    @XmlAttribute
    private String lat;
    
    private String lng;

    
    public Geo() {}

    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    
    @Override
    public String toString() {
        return "        lat: " + lat + "\n" +
                "         lng" + lng;
    }

        
    
}
