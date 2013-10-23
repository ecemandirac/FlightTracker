
package localStorage.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import generated.FlightInstanceListType;

@XmlRootElement(name = "getFlightInstancesResponse", namespace = "http://localStorage/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlightInstancesResponse", namespace = "http://localStorage/")
public class GetFlightInstancesResponse {

    @XmlElement(name = "return", namespace = "")
    private FlightInstanceListType _return;

    /**
     * 
     * @return
     *     returns FlightInstanceListType
     */
    public FlightInstanceListType getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(FlightInstanceListType _return) {
        this._return = _return;
    }

}
