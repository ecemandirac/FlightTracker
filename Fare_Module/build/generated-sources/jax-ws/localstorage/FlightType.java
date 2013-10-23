
package localstorage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="days" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightType", propOrder = {
    "flightNo",
    "carrierCode",
    "origCode",
    "origTime",
    "destCode",
    "destTime",
    "days"
})
@XmlSeeAlso({
    FlightInstanceType.class
})
public class FlightType {

    @XmlElement(required = true)
    protected String flightNo;
    @XmlElement(required = true)
    protected String carrierCode;
    @XmlElement(required = true)
    protected String origCode;
    @XmlElement(required = true)
    protected String origTime;
    @XmlElement(required = true)
    protected String destCode;
    @XmlElement(required = true)
    protected String destTime;
    @XmlElement(required = true)
    protected String days;

    /**
     * Gets the value of the flightNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNo() {
        return flightNo;
    }

    /**
     * Sets the value of the flightNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNo(String value) {
        this.flightNo = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the origCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Sets the value of the origCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigCode(String value) {
        this.origCode = value;
    }

    /**
     * Gets the value of the origTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigTime() {
        return origTime;
    }

    /**
     * Sets the value of the origTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigTime(String value) {
        this.origTime = value;
    }

    /**
     * Gets the value of the destCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCode() {
        return destCode;
    }

    /**
     * Sets the value of the destCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCode(String value) {
        this.destCode = value;
    }

    /**
     * Gets the value of the destTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestTime() {
        return destTime;
    }

    /**
     * Sets the value of the destTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestTime(String value) {
        this.destTime = value;
    }

    /**
     * Gets the value of the days property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDays(String value) {
        this.days = value;
    }

}
