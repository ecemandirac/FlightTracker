
package localstorage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFlights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFlights">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlights", propOrder = {
    "origTime",
    "origCode",
    "destCode"
})
public class GetFlights {

    protected String origTime;
    protected String origCode;
    protected String destCode;

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

}
