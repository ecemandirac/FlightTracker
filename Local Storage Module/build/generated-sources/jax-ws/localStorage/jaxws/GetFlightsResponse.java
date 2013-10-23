
package localStorage.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import generated.FlightListType;

@XmlRootElement(name = "getFlightsResponse", namespace = "http://localStorage/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlightsResponse", namespace = "http://localStorage/")
public class GetFlightsResponse {

    @XmlElement(name = "return", namespace = "")
    private FlightListType _return;

    /**
     * 
     * @return
     *     returns FlightListType
     */
    public FlightListType getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(FlightListType _return) {
        this._return = _return;
    }

}
