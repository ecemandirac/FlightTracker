
package localStorage.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import generated.CityListType;

@XmlRootElement(name = "getCitiesResponse", namespace = "http://localStorage/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCitiesResponse", namespace = "http://localStorage/")
public class GetCitiesResponse {

    @XmlElement(name = "return", namespace = "")
    private CityListType _return;

    /**
     * 
     * @return
     *     returns CityListType
     */
    public CityListType getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(CityListType _return) {
        this._return = _return;
    }

}
