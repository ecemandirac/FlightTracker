
package localStorage.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getFlightInstances", namespace = "http://localStorage/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlightInstances", namespace = "http://localStorage/", propOrder = {
    "origTime",
    "startDate",
    "endDate",
    "origCode",
    "destCode"
})
public class GetFlightInstances {

    @XmlElement(name = "origTime", namespace = "")
    private String origTime;
    @XmlElement(name = "startDate", namespace = "")
    private String startDate;
    @XmlElement(name = "endDate", namespace = "")
    private String endDate;
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
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * 
     * @param startDate
     *     the value for the startDate property
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * 
     * @param endDate
     *     the value for the endDate property
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
