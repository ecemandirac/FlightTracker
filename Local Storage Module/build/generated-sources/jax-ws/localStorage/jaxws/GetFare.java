
package localStorage.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getFare", namespace = "http://localStorage/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFare", namespace = "http://localStorage/", propOrder = {
    "carrier",
    "origCode",
    "destCode",
    "fareClass"
})
public class GetFare {

    @XmlElement(name = "carrier", namespace = "")
    private String carrier;
    @XmlElement(name = "origCode", namespace = "")
    private String origCode;
    @XmlElement(name = "destCode", namespace = "")
    private String destCode;
    @XmlElement(name = "fareClass", namespace = "")
    private String fareClass;

    /**
     * 
     * @return
     *     returns String
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * 
     * @param carrier
     *     the value for the carrier property
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getOrigCode() {
        return this.origCode;
    }

    /**
     * 
     * @param origCode
     *     the value for the origCode property
     */
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getDestCode() {
        return this.destCode;
    }

    /**
     * 
     * @param destCode
     *     the value for the destCode property
     */
    public void setDestCode(String destCode) {
        this.destCode = destCode;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getFareClass() {
        return this.fareClass;
    }

    /**
     * 
     * @param fareClass
     *     the value for the fareClass property
     */
    public void setFareClass(String fareClass) {
        this.fareClass = fareClass;
    }

}
