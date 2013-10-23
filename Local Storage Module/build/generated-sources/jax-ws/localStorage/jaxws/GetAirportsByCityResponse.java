
package localStorage.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import generated.AirportListType;

@XmlRootElement(name = "getAirportsByCityResponse", namespace = "http://localStorage/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAirportsByCityResponse", namespace = "http://localStorage/")
public class GetAirportsByCityResponse {

    @XmlElement(name = "return", namespace = "")
    private AirportListType _return;

    /**
     * 
     * @return
     *     returns AirportListType
     */
    public AirportListType getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(AirportListType _return) {
        this._return = _return;
    }

}
