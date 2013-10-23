
package localStorage.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getFlights", namespace = "http://localStorage/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlights", namespace = "http://localStorage/", propOrder = {
    "origTime",
    "origCode",
    "destCode"
})
public class GetFlights {

    @XmlElement(name = "origTime", namespace = "")
    private String origTime;
    @XmlElement(name = "origCode", namespace = "")
    private String origCode;
    @XmlElement(name = "destCode", namespace = "")
    private String destCode;

    /**
     * 
     * @return
     *     returns String
     */
    public String getOrigTime() {
        return this.origTime;
    }

    /**
     * 
     * @param origTime
     *     the value for the origTime property
     */
    public void setOrigTime(String origTime) {
        this.origTime = origTime;
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

}
