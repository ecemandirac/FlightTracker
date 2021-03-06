
package localstorage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for faresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="faresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityCodeOrig" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityCodeDest" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fareClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faresType", propOrder = {
    "id",
    "carrierCode",
    "cost",
    "currency",
    "cityCodeOrig",
    "cityCodeDest",
    "fareClass"
})
public class FaresType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String carrierCode;
    @XmlElement(required = true)
    protected String cost;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true)
    protected String cityCodeOrig;
    @XmlElement(required = true)
    protected String cityCodeDest;
    @XmlElement(required = true)
    protected String fareClass;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCost(String value) {
        this.cost = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the cityCodeOrig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCodeOrig() {
        return cityCodeOrig;
    }

    /**
     * Sets the value of the cityCodeOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCodeOrig(String value) {
        this.cityCodeOrig = value;
    }

    /**
     * Gets the value of the cityCodeDest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCodeDest() {
        return cityCodeDest;
    }

    /**
     * Sets the value of the cityCodeDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCodeDest(String value) {
        this.cityCodeDest = value;
    }

    /**
     * Gets the value of the fareClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClass() {
        return fareClass;
    }

    /**
     * Sets the value of the fareClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClass(String value) {
        this.fareClass = value;
    }

}
