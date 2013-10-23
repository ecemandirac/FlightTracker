
package localStorage.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import generated.FaresType;

@XmlRootElement(name = "getFareResponse", namespace = "http://localStorage/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFareResponse", namespace = "http://localStorage/")
public class GetFareResponse {

    @XmlElement(name = "return", namespace = "")
    private FaresType _return;

    /**
     * 
     * @return
     *     returns FaresType
     */
    public FaresType getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(FaresType _return) {
        this._return = _return;
    }

}
