
package localStorage.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAirportsByCity", namespace = "http://localStorage/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAirportsByCity", namespace = "http://localStorage/")
public class GetAirportsByCity {

    @XmlElement(name = "cityName", namespace = "")
    private String cityName;

    /**
     * 
     * @return
     *     returns String
     */
    public String getCityName() {
        return this.cityName;
    }

    /**
     * 
     * @param cityName
     *     the value for the cityName property
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

}
