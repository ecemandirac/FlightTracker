
package localStorage.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "newBooking", namespace = "http://localStorage/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newBooking", namespace = "http://localStorage/", propOrder = {
    "customerID",
    "flightNo",
    "carrierCode",
    "seatNo"
})
public class NewBooking {

    @XmlElement(name = "customerID", namespace = "")
    private String customerID;
    @XmlElement(name = "flightNo", namespace = "")
    private String flightNo;
    @XmlElement(name = "carrierCode", namespace = "")
    private String carrierCode;
    @XmlElement(name = "seatNo", namespace = "")
    private String seatNo;

    /**
     * 
     * @return
     *     returns String
     */
    public String getCustomerID() {
        return this.customerID;
    }

    /**
     * 
     * @param customerID
     *     the value for the customerID property
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getFlightNo() {
        return this.flightNo;
    }

    /**
     * 
     * @param flightNo
     *     the value for the flightNo property
     */
    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * 
     * @param carrierCode
     *     the value for the carrierCode property
     */
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getSeatNo() {
        return this.seatNo;
    }

    /**
     * 
     * @param seatNo
     *     the value for the seatNo property
     */
    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

}
